
package java_assignment2;


public class program7 {
     public static void main(String[] args) {
 
        String str = "java programming";

        int length = str.length();
        System.out.println("Length of the string: " + length);
        String subStr = str.substring(length - 5);
        System.out.println("Substring (last 5 characters): " + subStr);
    }
}
