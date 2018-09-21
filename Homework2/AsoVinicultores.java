import java.util.Scanner;
public class AsoVinicultores{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Tipo de uva, A o B:");
    String ti = input.next();
    System.out.println("Presio inicial del kg. de uva: ");
    double p = input.nextDouble();
    System.out.println("Kg. de produccion de uva: ");
    double k = input.nextDouble();
    double ga;
    
    if (ti.equalsIgnoreCase("A")) {
      System.out.println("Tamaño de uva, 1 o 2:");
      int ta = input.nextInt();
      if (ta == 1) {
        p=p + 0.20;
          ga = p * k;
        System.out.println("La ganancia es: $"+ga);
      }else if (ta == 2) {
        p = p + 0.30;
        ga = p * k;
        System.out.println("La ganancia es: $"+ga);
      }
    }else if (ti.equalsIgnoreCase ("B")) {
      System.out.println("Tamaño de uva, 1 o 2:");
      int ta = input.nextInt();
      if (ta == 1) {
        p = p - 0.30;
        ga = p * k;
        System.out.println("La ganancia es: $"+ga);
      }else if (ta == 2) {
        p = p - 0.50;
        ga = p * k;
        System.out.println("La ganancia es: $"+ga);
      }
    }
  }
}
