
import java.util.Scanner;



class Main { 
  public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input two numbers: ");

    double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    System.out.println("The sum of your input is " + (num1 + num2));

    input.close();
}

}
