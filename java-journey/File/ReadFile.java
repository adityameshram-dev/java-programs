import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("1st.txt"));
            String line;
            while((line = bf.readLine())!=null) {
                System.out.println(line);
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
