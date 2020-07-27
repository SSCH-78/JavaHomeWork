public class TypeCasting {
  public static void main(String[] args) {
    
    int intNum = 33;
    double doubNum = intNum; 

    double myDouble = 4.68;
    int myInt = (int) myDouble;

    System.out.println("Integer num: "+intNum);      
    System.out.println("after converting into double" + doubNum);

    System.out.println("double number: " +myDouble);  
    System.out.println("after converting into integer: " +myInt);      

  }
}


