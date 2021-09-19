import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        /*
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number");
        num1 = input.nextInt();
        System.out.println("Please enter second number");
        num2 = input.nextInt();

        System.out.print("First number is " + num1);
        System.out.println("\nsecond  number is " + num2);

        int c = num1 + num2;
        int d = num1 - num2;
        int e = num1 * num2;
        double f = num1 / num2;
        int g = num1 % num2;

        System.out.println("Sum of the two number is " + c);
        System.out.println("Difference of the two number is " + d);
        System.out.println("Multiplication of the two number is " + e);
        System.out.println("The division of two number is " + f);
        System.out.println("The module of the two number is " + g);

         */
        temp();
    }


    public static void temp() {
        double f,c;
        System.out.println("please enter temperature in Fahrenheit");
        Scanner input= new Scanner(System.in);
        f=input.nextDouble();

        c=(f-32)/1.8;
        System.out.println("The temperature is "+ c +"degree Celsius");


    }

}