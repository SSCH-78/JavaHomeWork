import java.util.*;
class CharArrayToStr
{
   public static void main(String args[])
   {
      char[] ch = {'h', 'e', 'l', 'l', 'o ', ' ', 'w', 'o', 'r', 'l', 'd'};
     
      String str = new String(ch);
      System.out.println(str);
 
      String str2 = String.valueOf(ch);
      System.out.println(str2);
   }
}