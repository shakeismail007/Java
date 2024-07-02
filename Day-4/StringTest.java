import java.util.*;
class StringTest{
    public static void main(String arg[]){
        String a = "Test";
        String b = new String("test");
        String c = new String("Test");
        String d = "Test";
        String e = "vignesh";
        String f = "sabrudeen";

        String t = "cake";
        String tt = "pancake";



//        System.out.println(b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());
//        System.out.println(d.hashCode());
//        System.out.println(a==d);
//        System.out.println(b==c);
//        System.out.println(a.equals(d));
//        System.out.println(b.equals(c));
//        System.out.println(b.equalsIgnoreCase(c));

        System.out.println(e.length());
        System.out.println(e.substring(2));
        System.out.println(e.substring(3,5));
//        System.out.println(e.substring(3,10));

        System.out.println(e.indexOf("i"));
        System.out.println(e.indexOf("t"));
        System.out.println(e.indexOf("i",3)); //search "i" after 3rd index i.e after n in vignesh
        System.out.println(f.lastIndexOf("e")); // search from last index

            System.out.println(tt.contains(t)); //t is a substring of tt --> true
            System.out.println(t.contains(tt)); //tt is not a substring of t---> false
    }

}