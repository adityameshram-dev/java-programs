public class pra3_1 {
    public static void main(String[] args) {
        float per = 90.35f;
        if (per <= 100 && per >= 80) {
            System.out.println(" Distinction");
        } 
        else if (per <= 79 && per >= 60) {
            System.out.println("First class");
        } 
        else if (per <= 69 && per >= 40) {
            System.out.println("Secound class");
        } 
        else {
            System.out.println("Fail");
        }
    }
}
// Aditya Meshram