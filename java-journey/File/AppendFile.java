import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("1st.txt", true));
            bf.append("\njava is best programming language");
            System.out.println(" Successfully written in file..");
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
