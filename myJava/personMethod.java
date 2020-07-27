public class personMethod {
  
  String fnam = "sana";
  String lnam = "sher";
  long phone =1234567;

  public void remarks(String remarks) {
    System.out.println("Remarks are: " + remarks);
  }


  public static void main(String[] args) {
   
    personMethod p = new personMethod();
    String str="hello everyone";
    
    System.out.println("First name: " +p.fnam);  
    System.out.println("Last name: " + p.lnam);
    p.remarks(str);

  }
}