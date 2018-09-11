import java.util.Scanner;
public class gananciaGalon{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("¿Cual es la cantidad entera de lts. que produce?");
    int L = input.nextDouble();
    System.out.println("¿Cual es el presio del galon?");
    double PG = input.nextDouble();
    //Cant. de galones que produce
    double TG = L / 3.785;
    //GANANCIA POR LA ENTREGA DE LA LECHE
    double GA = PG * TG;
      System.out.println("La ganancia es:" + GA);
  }
}
