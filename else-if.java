class Main { 
  public static void main(String[] args) {
    int s = 50;
    
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
    } else {
      System.out.println("F");
    }
  }
}
