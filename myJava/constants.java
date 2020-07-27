public class constants {

    public static void main(String[] args) {

        String str = "Hello Dear Sweet World";
        int vcount = 0, ccount = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) 
        { char ch = str.charAt(i); 
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
         {
             vowel++; 
         } 
             else if((ch >= 'a'&& ch <= 'z'))
            {
                constant++;
            }
        }
        
        System.out.println("Number of Vowels: " + vowel);
        System.out.println("Number of Consonants: " + constant);
    }
}