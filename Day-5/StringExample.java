public class StringExample {
    public static void main(String arg[]){
        String a = "Ismail";
        String d = "This is ScaleUp Technologies";
        String e = "  This is ScaleUp Technologies       ";
        String f = "Hello";
        String g = "ishaq";

        String s = """
                ab
                cd
                ef
                gh
                """; //multi text line (java 14 feature)


        a = a.replace("a","n");             // replace "a" with "n"
        d = d.replaceAll("\\s", "-");       // based on regex (i.e) \\d for decimal. \\s for space
        e = e.trim();                       // empty spaces are trimmed (i.e) deleting leading and trailing space


//        System.out.println(a);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f.charAt(3));
//        System.out.println(f.concat("user"));
//        System.out.println(a.compareTo(g)); //
        System.out.println(s); //



    }

}