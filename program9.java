
package java_assignment2;

public class program9 {
    public static void main(String[] args) {
        
        String str1 = "atmiya university";
        char thirdChar = str1.charAt(2);  
        System.out.println("(a) The 3rd character in 'atmiya university' is: " + thirdChar);

       
        String str2 = "java programming";
        int indexO = str2.indexOf('o');
        System.out.println("(b) The index of 'o' in 'java programming' is: " + indexO);

     
        String str3 = "enjoy holiday";
        String upperStr = str3.toUpperCase();
        System.out.println("(c) 'enjoy holiday' in uppercase: " + upperStr);

       
        String str4 = "Hello...Hi";
        String replacedStr = str4.replace('H', 'n');
        System.out.println("(d) After replacing 'H' with 'n' in 'Hello...Hi': " + replacedStr);
    }
}
