import java.util.*;
public  class table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code is for printing the table of given number:");
        System.out.println("enter a number:------------");
       
        int x = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(x+" * "+i +" = "+ x*i);
        }



    }
}
