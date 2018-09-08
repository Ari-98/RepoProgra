import java.util.Scanner;
public class metrosPulgadas{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("¿Cual es la cantidad de mts. que requiere?");
    //cantidad de  mts. que requiere
    double CM = input.nextDouble();
    double  PG = CM / 2.54;
      System.out.println("Las pulgadas a pedir son: " + PG);
  }
}
