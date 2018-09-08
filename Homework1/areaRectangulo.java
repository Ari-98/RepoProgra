import java.util.Scanner;
public class areaRectangulo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce la medida de la altura y la base del rectangulo en double");
    double A = input.nextDouble();
    double B = input.nextDouble();
    double area = A * B;
      System.out.println("El area del rectangulo es:" + area);
  }
}
