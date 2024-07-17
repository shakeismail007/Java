public class DeciMaking {
    public static void main(String args[]) {
        int age = 20;
        String gender = "Female";
        String status = "UnMarried";

        if (age > 18) {
            if(gender.equals("Male")){
                if(status.equals("UnMarried")){
                    System.out.println("Registered Successfully");
                }
            }
            else{
                System.out.println("Openings are available only for male");
            }
        }
      else{
            System.out.println("Not Qualified for marriage");
        }
    }
}