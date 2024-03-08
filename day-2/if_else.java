import java.util.*;

public  class if_else
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("choose 1 for english");
        System.out.println("choose 2 for hindi");
        System.out.println("choose 3 for french");
        int x = sc.nextInt();
        switch(x){
            case 1:{
                System.out.println("Hello "+name);
                break;
            }
            case 2:{
                System.out.println("Namaste "+name);
                break;
            }
            case 3:{
                System.out.println("Bonjour "+name);
                break;
            }
            default:{
                System.out.println(name+" please enter valid number ");

            }
            
        }









        // System.out.println("enter your name");
        // String name = sc.nextLine();
        // System.out.println("choose 1 for english");
        // System.out.println("choose 2 for hindi");
        // System.out.println("choose 3 for french");
        // int x = sc.nextInt();
        // if (x == 1) {
        //     System.out.println("Hello "+name);
            
        // }else if(x == 2){
        //     System.out.println("Namaste "+name);
            
        // }else if(x == 3){
        //     System.out.println("Bonjour "+name);

        // }else{
        //     System.out.println(name+" please enter valid number ");
        // }











        // System.out.println("enter first number");
        // int a = sc.nextInt();
        // System.out.println("enter second number");
        // int b = sc.nextInt();
        // if (a>b) {
        //     System.out.println("first number is greater than second");
            
        // }
        // else if (a<b){
        //     System.out.println("second number is greater");
        // }
        // else{
        //     System.out.println("both the numbers are equal");
        // }








        // System.out.println("enter a number:");
        // int x = sc.nextInt();
        // if (x%2==0) {
        //     System.out.println("even");
            
        // }
        // else{
        //     System.out.println("odd");
        // }












        // System.out.println("enter your age:");
        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("not adult");
        // }
    }
}
