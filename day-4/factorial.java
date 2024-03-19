import java.util.*;

public  class factorial 
{
    public static void factorial(int a){
        if(a<0){
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for(int i =a ;i>=1;i--){
            factorial = factorial*i;

        }
        System.out.println(factorial);
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        factorial(n);
        
       
    }
}
