import java.util.Scanner;
//import java.lang.String;
public class task3{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String newString = "";
    for(int i = 0; i < s1.length(); i++){
      if(s1.charAt(i) == (char) 44 || s1.charAt(i) == (char) 45 ){
        System.out.println(newString);
        System.out.println(" ");
        newString = "";
      }
      else{
        newString = newString+s1.charAt(i);
      }
    }         // as else part has the last part after spliting and not printing that part so the last string always remains there. we need to print that manually
    //System.out.println(newString);  
    if(!newString.equals("")){
      System.out.println(newString);
    }
  }
}