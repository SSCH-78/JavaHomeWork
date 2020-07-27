import java.util.*;

class DoubleToInt {
  public static void main(String[] args) {

    double a = 99.99D;
    double b = 52.11D;

    int c = (int)Math.round(a);
    int d = (int)Math.round(b);

    System.out.println(c);   
    System.out.println(d);    
  }
}