import java.util.Scanner;

public class DecisionMakingEx {
    public static void main(String args[]) {

    try {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a value");
            int b = sc.nextInt();

             if (b < 100) {
                System.out.println("The entered value is less than 100");
              }
             else if (b > 100) {
                System.out.println("The entered value is greater than 100");
             }
             else if (b == 100) {
                System.out.println("The entered value is equal to 100");
            }
        }
    catch (Exception e){
                System.out.println("! value should be in numeric only");
            }
        }
    }