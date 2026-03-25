interface boy {
    void ageboy();
}

interface girl {
    void agegirl();
}

public class pra9_1 implements boy, girl {

    public void ageboy() {
        System.out.println("boy's age 21");
    }

    public void agegirl() {
        System.out.println("girl's age 18");
    }

    public static void main(String[] args) {
        pra9_1 c = new pra9_1();
        c.ageboy();
        c.agegirl();
    }
}
// Aditya Meshram