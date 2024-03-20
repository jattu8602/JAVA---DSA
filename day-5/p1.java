import java.util.*;

public  class p1
{
    public static int  average(int a ,int b, int c){
        return  (a+b+c)/3;
    }
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("average is :");
        System.out.print(average(a,b,c));
    }

}
