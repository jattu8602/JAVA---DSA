import java.util.*;
public  class que1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int x = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=x;i++){
            
            sum = i + sum;
        }
        System.out.println("sum form 0 to "+x+" is: "+sum);

    }
}
