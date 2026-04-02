public class string4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello ");

        System.out.println(sb.append("world"));     // Output: hello world
        // append() is used to add a string at the end of the existing string

        System.out.println(sb.insert(6,"bittu"));       // Output: hello bittu
        // insert() is used to insert a string at a specified index position

        System.out.println(sb.delete(0, 2));        // Output: llo 
        // delete() is used to remove characters from the given start index to end index - 1 

        System.out.println(sb.reverse());       // Output:  olleh
        // reverse() is used to reverse the entire string

        System.out.println(sb.replace(0, 01, "y"));     // Output: yello 
        // replace() is used to replace characters from start index to end index with a new string
    }
}
