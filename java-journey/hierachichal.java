// hierachichal inheritance

class animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class dog extends animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class cat extends animal {
    void sound() {
        System.out.println("Cat meow");
    }
}

public class hierachichal {
    public static void main(String[] args) {
        animal a;

        a = new animal();
        a.sound();
        
        a = new dog();
        a.sound();

        a = new cat();
        a.sound();
    }
}
