public class string2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        if (s1.equals(s2)) // equals() method compares the content (value) of String objects
            System.out.println("True");
        else
            System.out.println("Flase");
    }
}

/*
output is True.
This is because the equals() method in Java 
compares the content (value) of the String objects, 
not their memory locations.
Although s1 is stored in the String Constant Pool and 
s2 is created as a new object in heap memory, both strings contain the same value "hello".
*/
