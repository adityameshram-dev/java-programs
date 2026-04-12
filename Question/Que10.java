// Explain the concept of Dynamic method dispatch with suitable example.

class Animal {
    public void sound() {
        System.out.println("Hello from animal class");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Hello from dog class");
    }
}
public class Que10 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sound();
    }
}
