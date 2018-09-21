import java.util.Scanner;
public class MayorTres{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int m;

    System.out.println("Introduce el primer numero: ");
    int a = input.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int b = input.nextInt();
    System.out.println("Introduce el tercer numero: ");
    int c = input.nextInt();
    if (a > b) {
      if (a>c) {
        m=a;
        System.out.println("El mayor es: "+ m);
      }else{
        m=c;
        System.out.println("El mayor es: "+ m);
     }
   }else if (b > c) {
      m= b;
      System.out.println("El mayor es: "+ m);
    }else {
        m=c;
        System.out.println("El mayor es: "+ m);
      }
    }
  }
