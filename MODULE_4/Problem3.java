// Write a program to demonstrate the difference between String, StringBuilder, and StringBuffer.
public class Problem3 {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World"); 
        System.out.println("String: " + s);

        s = s.concat(" World");
        System.out.println("String after concat: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}
