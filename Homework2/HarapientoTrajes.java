import java.util.Scanner;
public class HarapientoTrajes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.println("Costo del traje:");
    double de;
    double pf;
    double ct = input.nextInt();

    if (ct > 2500) {
      de = ct * .15;
      pf = ct - de;
    }else{
      de = ct * .08;
      pf = ct - de;
    }
    System.out.println("El descuentos es de: "+ de);
    System.out.println("El pago a realizar es de: "+ pf);
  }
}
