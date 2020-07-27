import java.util.*;

public class comparison{

    public static void main(String [] args)
    {
        int num1, num2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1=sc.nextInt();

        System.out.println("Enter second number: ");
        num2=sc.nextInt();

        if(num1==num2)
        System.out.println(num1 +" = "+num2);

        if(num1<num2)
        System.out.println(num1 +" is less than "+num2);

        if(num1>num2)
        System.out.println(num1 +" is greater than "+num2);

        if(num1!=num2)
        System.out.println(num1 + " is not equal to "+num2);
        
    }
} 