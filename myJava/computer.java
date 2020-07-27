public class computer {
   computer() {
      System.out.println("Constructor of Computer class.");
   }
   void computer_method() {
      System.out.println("Power gone! Shut down your PC soon...");
   }
   public static void main(String[] args) {
      computer c = new computer();
      Laptop l = new Laptop();
      c.computer_method();
      l.laptop_method();
   }
}
class Laptop {
   Laptop() {
      System.out.println("Constructor of Laptop class.");
   }
   void laptop_method() {
      System.out.println("99% Battery available.");
   }
}