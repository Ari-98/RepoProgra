import java.util.Scanner;
public class areaTerreno{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce la medida de la base del terreno en double");
    double B = input.nextDouble();
    System.out.println("Introduce la altura del triangulo y rectangulo unidos");
    double A = input.nextDouble();
    System.out.println("Introduce la altura del rectangulo");
    double C = input.nextDouble();
    //AREA DEL TRIANGULO
    double AT = (B * (A - C) / 2);
    //area del rectangulo
    double AR = B * C;
    double area = AT + AR;
      System.out.println("El area del terreno es:" + area);
  }
}
