public  class SwitchEx3 {
    public static void main(String args[]) {
        Object a = 5.8F;
        if (a instanceof Integer) {
            System.out.println("I am Integer ");
        } else if (a instanceof Float) {
            System.out.println("I am instance of Float");
        } else {
            System.out.println("I am  ");

        }


        switch (a) {
            case Integer i -> System.out.println("I am Integer ");
            case Float i -> System.out.println("I am float ");
            case String i -> System.out.println("I am String ");
            case CharSequence i -> System.out.println("I am charsequence ");


        }
    }
}