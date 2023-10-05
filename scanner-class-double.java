
import java.util.Scanner;



class Main { 
  public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input a number: ");

    double num = input.nextDouble();

    System.out.println("The number you input is " + num);

    input.close();
}

}
