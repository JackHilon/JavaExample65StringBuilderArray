
package javaexample65stringbuilderarray;


public class ImportantINFO {
    public static void INFO() {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        String s4=new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println("------------");
        Person p=new Person("one", 1);
        Person q=new Person("one", 1);
        System.out.println(p.equals(q));
        System.out.println(p==q);
    }
    
}
