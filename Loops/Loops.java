import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /* Syntax of for loops 
        
        for(initialization; condition; increment/decrement){
        //body of the loop}
        use for loop when you know how many times the loops is going to run
        */

        // Q: Print numbers from 1 to 5 

        /* for (int num = 1; num <=5; num += 1){
            System.out.println(num);
        } */
        
        // Q: Print numbers from 1 to n

        /* Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num ++){
            System.out.println(num + " ");
            System.out.println("Hiii");
        } */

        /* Syntax for while loops
         
        while (condition){
        //body}
        use while loop when you dont know how many times the loop is going to run
        */ 
        /* int num = 1;
        while (num <= 5){
            System.out.println(num);
            num += 1;
        } */

        /* syntax of do-while loop 
        
        the loop is going to execute atleast once

        do{
        //body
       }while(condition);

        */

        /* int n = 1;
        do{
            System.out.println("Hello World");
        } while (n != 1); */
    }
}
