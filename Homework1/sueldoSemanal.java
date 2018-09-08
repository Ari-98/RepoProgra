import java.util.Scanner;
public class sueldoSemanal{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("¿Cual es la cantidad de Horas Trabajadas?");
    double HT = input.nextDouble();
    System.out.println("¿Cual es su pago por Hora?");
    double PH = input.nextDouble();
    //Cant. de galones que produce
    double SS = HT * PH;
      System.out.println("Su sueldo semanal es:" + SS);
  }
}
