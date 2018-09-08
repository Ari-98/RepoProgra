import java.util.Scanner;
public class areaCircunferencia{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce la medida del radio de la circunferencia");
    double r = input.nextDouble();
    double pi = 3.1416;
    double area = pi * r;
      System.out.println("El area de la circunferencia es:" + area);
  }
}
