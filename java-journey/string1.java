public class string1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        
        if(s1==s2) // == checks the memory location (reference) of an object in case of String.
            System.out.println("true");
        else
            System.out.println("false");
    }
}

/*
output is true
This is because both s1 and s2 are created using string literals.
In Java, string literals are stored in the String Constant Pool.
When the same string literal ("hello") is used again, Java does not create a new object.
Instead, it reuses the exi+`sting object from the String Pool.
Therefore, s1 and s2 refer to the same memory location, and the == operator returns true.
*/