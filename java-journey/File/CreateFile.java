import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File f = new File("1st.txt");
            if (f.createNewFile()) {
                System.out.println("File is created..");
            } else {
                System.out.println("File already exists..");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
