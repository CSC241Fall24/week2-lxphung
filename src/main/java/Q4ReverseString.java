// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("test string"));
    }

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        if (s.length() == 0)
            return s;
        else 
            return reverse(s.substring(1)) + s.charAt(0);
    }

    // reversing the string the other way
    public static String reverse2(String s) {
        if (s.length() == 0)
            return s;
        else 
            return s.charAt(s.length()-1) + reverse2(s.substring(0, s.length()-1));
    }
}