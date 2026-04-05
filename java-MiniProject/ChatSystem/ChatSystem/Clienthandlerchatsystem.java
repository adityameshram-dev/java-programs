import java.net.*;
import java.util.List;
import java.io.*;

public class Clienthandlerchatsystem implements Runnable {
    Socket s;
    List<Socket> a;

    public void run() {
        try {
            DataInputStream dis = new DataInputStream(this.s.getInputStream());

            while (true) {
                String username = dis.readUTF();
                String readmsg = dis.readUTF();
                if (readmsg.equalsIgnoreCase("bye")) {
                    a.remove(this.s);
                    broadcast("SERVER: ", username + " disconnected ");
                    this.s.close();
                    break;
                }
                broadcast(username, readmsg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void broadcast(String user, String msg) {
        for (Socket socket : a) {
            try {
                if (socket != this.s) {
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    dos.writeUTF(user);
                    dos.writeUTF(msg);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    Clienthandlerchatsystem(Socket s, List<Socket> a) {
        this.s = s;
        this.a = a;
    }
}
