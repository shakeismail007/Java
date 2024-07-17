public class StringBuilderEx{
    public static void main(String arg[]){
        int a = 88888888;
        long t = System.currentTimeMillis();

        StringBuffer br = new StringBuffer();

        for(int k=a; k>0; k--){
            br.append("Test Data");
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(br.capacity());

        /////// Time taken for String Builder/////

        t = System.currentTimeMillis();

        StringBuilder bdr = new StringBuilder();


        for(int k=a; k>0; k--){
            bdr.append("Test Data");
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(br.capacity());
    }
}