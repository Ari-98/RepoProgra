import java.util.Scanner;
public class HigherValue{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first value:");
    int m; //mayor
    int a = input.nextInt();
    System.out.println("Enter the second value:");
    int b = input.nextInt();
    if (a > b) {
      m = a;
    }else{
      m = b;
    }
    System.out.println("The higher value is: "+ m);
  }
}
