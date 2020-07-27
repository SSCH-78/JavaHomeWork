class ParentClass{
   
   ParentClass(){
	System.out.println("Constructor of Parent");
   }
   void disp(){
	System.out.println("Parent Method");
   }
}
class MethodOver extends ParentClass{
   MethodOver(){
	System.out.println("Constructor of Child");
   }
   void disp(){
	System.out.println("Child Method");
        
	super.disp();
   }
   public static void main(String args[]){
	
	MethodOver obj = new MethodOver();
	obj.disp();
   }
}