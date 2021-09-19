import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        String car;

        Scanner input = new Scanner(System.in);
        System.out.println("Type your car brand");
        car = input.nextLine();


        switch (car) {

            case "BMW":
                System.out.println("Your car brand is BMW");
                break;
            case "AUDI":
                System.out.println("Your car brand is AUDI");
                break;
            case "Ferrari":
                System.out.println("Your car brand is Ferrari");
                break;
            default:
                System.out.println("Opps! you don't have a car,it's fine, you have atleast foot to walk");


        }







/*

Switch
case
break
default


 */

    }//end of main
}//end of class
