class intChar {
  public static void main(String[] args) {

    int num1 = 1;
    int num2 = 13;

    char a = Character.forDigit(num1, 10);

    char b = Character.forDigit(num2, 16);
    
    System.out.println(a);    
    System.out.println(b);    
  }
}