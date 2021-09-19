import java.util.Scanner;

public class PrintSumFromUsers {
    public static void main(String[] args) {

  /*
  sum from m to n
   */
        int m,n,sum=0;

        Scanner input = new Scanner(System.in);
        System.out.print ("What's the starrting number?");
        m=input.nextInt();
        System.out.print ("What's the ending number?");


        n=input.nextInt();

        for(; m<=n; m++){

            if(m%2!=0){
                System.out.print(" "+m+" ");
                sum=sum+m;
            }


        }

        System.out.println("sum of the odd betwen first and last is "+sum);


    }//end of main
}//end of class
