import java.util.Scanner;
public class pr1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    //int prod = a*b*c;
    int count = 0;
    while(count<5){
      if(a<=b && a<=c){
        a+=1;
        count+=1;
      }
      else if(b<=a && b<=c){
        b+=1;
        count+=1;
      }
      else if(c<=a && c<=b){
        c+=1;
        count+=1;
      }
    }
    System.out.print(a*b*c);
  }
}