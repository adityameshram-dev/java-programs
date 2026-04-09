import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {

            BufferedWriter bf = new BufferedWriter(new FileWriter("1st.txt"));
            bf.write("Hi my name is Bittu");
            System.out.println(" Successfully written in file..");
            bf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
