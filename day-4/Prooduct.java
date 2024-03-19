import java.util.*;

public  class Prooduct
{
    public static int calculateProduct(int a,int b){
        return a*b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.print("The product of "+a+" and "+b+ " is :  ");
        System.out.println(calculateProduct(a,b));
    }
}
