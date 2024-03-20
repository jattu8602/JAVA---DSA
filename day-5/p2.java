import java.util.*;

public  class p2
{
    public static int sumOfOddNumbers(int n){
        int sum = 0;
       
            for (int i=1;i<=n;i++){
                if(i % 2 !=  0){
                    sum += i ;
                    

                }
               

                }
                System.out.println("sum of  odd numbers is : " + sum);
            
       
        return 0;
    }

        
    
    public static void main(String[] args)
    {
         Scanner  sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int num = sc.nextInt();
         
         // calling method and passing value to it
         sumOfOddNumbers(num);
    
    }
}
