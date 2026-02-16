public class Main{
    public static void main(String[] args){
        
        //if-else statement
        int salary = 50000;
        //if(salary > 10000){
            //salary = salary + 2000;
        //}else{
            //salary = salary + 1000;
        //}
        //Multiple if-else statement
        if(salary > 10000){
            salary += 2000;
        }else if (salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}