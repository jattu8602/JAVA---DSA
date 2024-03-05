

public class main {
    public static void main(String[] args){
        //output
        System.out.println("Hello world with Java");
        System.out.print("Hello world with Java\n");
        System.out.print("Hello world with Java");
        //next line 
        System.out.println();
        int num1 = 5;
        int num2 = 8;
        if (num1 > num2) {
            System.out.println("Number one is greater than number two.");
        } else if (num1 < num2) {
            System.out.println("Number one is less than number two.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        
        for (int i=0;i<5;i++) {
            System.out.println("Value of I: " + i);
        }

        while (num1 <= 9) {
            System.out.println("The value of num1 is: " + num1);
            num1++;
        }
    




    }
    
    
}
