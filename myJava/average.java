import java.util.*;

public class average{

    public static void main (String[] args){

        int num1, num2, num3;
        float avg;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter first num: ");
        num1= sc.nextInt();

        System.out.println("enter second num: ");
        num2= sc.nextInt();

        System.out.println("enter third num: ");
        num3=sc.nextInt();

        avg=(num1+num2+num3)/3;

        System.out.println("average of 3 numbers is: "+avg);


    }
}