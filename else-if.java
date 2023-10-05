class Main { 
  public static void main(String[] args) {
    // initializing variable 's'
    int s = 50;
    
    // if-else block 
    if (s > 90) {
      System.out.println("A");
    } else if (s > 85) {
      System.out.println("B+");
    } else if (s > 80) {
      System.out.println("B");
    } else if (s > 75) {
      System.out.println("B-");
    } else if (s > 65) {
      System.out.println("C");
    } else if (s > 50) { // Added missing parentheses and braces here
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
