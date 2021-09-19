public class FindMaxMinNumber {
    public static void main(String[] args) {


        int num1=100, num2=20000, large;
        int num3=2000000;


        if(num1>num2)
        {
            System.out.println("Num1 is greater than num2");
        }else if(num1<num2)
        {
            System.out.println("Num1 is less than numm2");
        }else
        {
            System.out.println("Num1 and Num2 are equal");
        }

        large= (num1>num2) ?(num1>num3? num1:num3):(num2>num3?num2:num3);
        System.out.println(large);














    }//end of main
}//end of class
