import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task7{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    //int size = sc.nextInt();
    int [] arr = {23,100,23,56,100};
    System.out.println("Input array: ");
    System.out.println(Arrays.toString(arr));
    int[] uniqArr = new int[arr.length];
    int uniqIndx = 0;

    for (int i = 0; i < arr.length; i++) {
      boolean Dupli = false;
      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          Dupli = true;
          break;
        }
      }
      if (!Dupli) {
        uniqArr[uniqIndx++] = arr[i];
      }
   }

   int[] finalArr = new int[uniqIndx];
   for (int i = 0; i < uniqIndx; i++) {
     finalArr[i] = uniqArr[i]; 
   }

   System.out.println("New array: ");
   System.out.println(Arrays.toString(finalArr)); 
  }
}