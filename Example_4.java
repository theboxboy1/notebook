
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        
     int sum = 0;
    int i = 0; 
   

    Scanner input = new Scanner(System.in);




    do{
        sum = sum + i;
        System.out.println("Enter a number: ");
        i = input.nextInt();
    }
    
    
    while(i>=0);

    System.out.println("Sum = " + sum);

    input.close();
    
    


    
   

}






    


}
    





