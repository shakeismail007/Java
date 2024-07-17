public  class SwitchEx2 {
    public static void main(String args[]){
        int a = 5;

        switch (a){
            case 0 -> System.out.println("case 0");
            case 1,5 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
        }
    }
}