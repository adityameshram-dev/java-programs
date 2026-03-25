public class pra7_5 {
    int ima;
    int real;
    public pra7_5() {
        real = 0;
        ima = 0;
    }
    public pra7_5(int r,int i){
        ima = i;
        real = r;
    }
    public pra7_5 add(pra7_5 c1) {
        pra7_5 temp = new pra7_5();
        temp.real = this.real + c1.real;
        temp.ima = this.ima + c1.ima;
        return temp;
    }
    public void display() {
        System.out.println(real + " + " + ima + "j");
    }
    public static void main(String [] args) {
        pra7_5 c1 = new pra7_5(5, 2);
        pra7_5 c2 = new pra7_5(5, 2);
        pra7_5 c3 = c2.add(c1);
        c3.display();
    }
}
// Aditya Meshram