// Task 5

import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //String oper = sc.next();
    int n1 = sc.nextInt();
    if (n1%4==0){
      System.out.println(n1 + " is a Leap year");    
    }
    else if(n1%100==0 && n1%400==0){
      System.out.println(n1 + " is a Leap year");
    }
    else{
      System.out.println(n1 + " is not a Leap year");
    }
  }
}