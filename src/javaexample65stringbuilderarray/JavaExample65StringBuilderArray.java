
package javaexample65stringbuilderarray;


public class JavaExample65StringBuilderArray {

    
    public static void main(String[] args) {
        
        StringBuilder[] words = new StringBuilder[] {new StringBuilder("one"),
        new StringBuilder("two"),new StringBuilder("three")};
        
        PrintArray(words);
        System.out.println();
        
        StringBuilder e = new StringBuilder("XXX");
        
        ChangeArrayElement(words, e, "two");
        
        PrintArray(words);
        
        System.out.println();
        System.out.println("===================================");
        // for more info about equals and == operations
        ImportantINFO.INFO();
        
    }
    
    private static void ChangeArrayElement(StringBuilder[] array, StringBuilder element, String str)
    {
        // (1) I can not change one cell using for-each loop,
        // but I can do it using for loop.
        
        /*
        for (StringBuilder a : array) {
            if (SameString(a, str)) {
                a=element;
            }
        }
        */
        
        for (int i = 0; i < array.length; i++) {
            if (SameString(array[i], str)) {
                array[i]=element;
            }
        } 
    }
    
    private static void PrintArray(StringBuilder[] a)
    {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].toString()+" ");
        }
        System.out.println("]");
    }
    // -------------------------------------------------------------------------
    private static boolean SameString(StringBuilder sb, String str)
    {
        if(sb.length()!=str.length())
            return false;
        
        
        // (2) equals-operation means primitive value in the string object context,
        // but it means reference value in the another object context
        String s=sb.toString();
        if(str.equals(s))
            return true;
        else return false;
    }
}
