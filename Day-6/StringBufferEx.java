public class StringBufferEx{
    public static void main(String args[]){
        StringBuffer br = new StringBuffer(20);
        System.out.println(br);
        System.out.println(br.hashCode());
        System.out.println(br.capacity());
        System.out.println(br.append("user hi hello how are you im a goood"));
        System.out.println(br.hashCode());
        System.out.println(br.capacity());
        System.out.println(br.length());
        System.out.println(br.replace(0,4," Ismail"));
        System.out.println(br.insert(0,"Sulthan"));
//        System.out.println(br.reverse());
        System.out.println(br.delete(0,7));
        System.out.println(br.charAt(8));
        br.setLength(0);
        System.out.println(br);




    }
}


// By default string buffer store in heap(as we can't access common pool) as array with default size of 16 and grow as 16 on extending.
// reference in heap is same on all over (i.e) has same hashcode
// like this we can make string mutable and leads to memory management