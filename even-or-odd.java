
import java.util.Scanner;



class Main { 
  public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input an integer: ");

    int num = input.nextInt();
    
    
    if (num%2 == 0 )
    {
        
        System.out.println("Even");
    }
    
    else 
    {
       System.out.println("Odd");
    }


    input.close();
}

}
