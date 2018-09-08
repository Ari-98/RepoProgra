import java.util.Scanner;
public class conagua{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("¿Cual es la altura de la alberca?");
    double A = input.nextDouble();
    System.out.println("¿Cual es el largo de la alberca?");
    double L = input.nextDouble();
    System.out.println("¿Cual es el ancho de la alberca?");
    double N = input.nextDouble();
    System.out.println("¿Cual es el costo del metro cubico?");
    double CM = input.nextDouble();
    // VOLUMEN DE LA ALBERCA
    double V = L * N *A;
    double PAG = V * CM;
      System.out.println("El pago que tiene que realizar es de: " + PAG);
  }
}
