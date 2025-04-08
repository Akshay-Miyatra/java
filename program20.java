package java_assignment2;
public class program20 {
    public static void main(String[] args) {
        
        Integer intObj = 10; // int automatically boxed into Integer
        Double doubleObj = 5.5; // double automatically boxed into Double
        Boolean boolObj = true; // boolean automatically boxed into Boolean

        System.out.println("Auto-boxed values:");
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);

        int primitiveInt = intObj; // Integer automatically unboxed to int
        double primitiveDouble = doubleObj; // Double automatically unboxed to double
        boolean primitiveBool = boolObj; // Boolean automatically unboxed to boolean

        System.out.println("\nAuto-unboxed values and operations:");
        System.out.println("Primitive int: " + primitiveInt + " (Squared: " + (primitiveInt * primitiveInt) + ")");
        System.out.println("Primitive double: " + primitiveDouble + " (Halved: " + (primitiveDouble / 2) + ")");
        System.out.println("Primitive boolean: " + primitiveBool + " (Negation: " + !primitiveBool + ")");
        
        Integer explicitIntObj = Integer.valueOf(20); // Explicit boxing
        int explicitPrimitiveInt = explicitIntObj.intValue(); // Explicit unboxing
        System.out.println("\nExplicit boxing and unboxing:");
        System.out.println("Explicitly boxed Integer: " + explicitIntObj);
        System.out.println("Explicitly unboxed int: " + explicitPrimitiveInt);
    }
}
