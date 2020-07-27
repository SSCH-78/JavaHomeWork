import java.util.*;

public class bigArray {
  public static void main(String[] args) 
    {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 2;
              		
        System.out.print(arr[k-1] + " ");
		System.out.println("\nK'th largest element of the said array:");          
        Arrays.sort(arr, Collections.reverseOrder());  		
        System.out.print(arr[k-1] + " ");
	}
}