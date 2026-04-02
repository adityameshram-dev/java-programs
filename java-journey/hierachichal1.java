class parent {
    public void age(int age) {
        System.out.println("AGE is " + age);
    }
}
class girl extends parent {
    public void age(int age) {
        System.out.println("AGE is " + age);
    }
}
class boy extends parent {
    public void age(int age) {
        System.out.println("AGE is " + age);
    }
}

public class hierachichal1 {
    public static void main(String[] args) {
        parent p;
        p = new parent(); 
        p.age(52);

        p = new boy();
        p.age(21);

        p = new girl();
        p.age(17);
    }
}
