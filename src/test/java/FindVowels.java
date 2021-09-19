import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {

        char c,d;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a character");

        c=input.next().charAt(0);
        d=Character.toLowerCase(c);


        if(d=='a' ||d=='i' ||d=='o' || d=='u'|| d=='e'){

            System.out.println("This is a vowel");
        }else
        {
            System.out.println("Constant");
        }







    }//end of main method
}//end of class
