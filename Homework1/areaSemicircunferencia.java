import java.util.Scanner;
public class areaSemicircunferencia{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce la medida de la base del triangulo rectangulo y radio");
    double R = input.nextDouble();
    System.out.println("Introduce la medida de la Hipotenusa");
    double H = input.nextDouble();
    //CALCULO DEL CATETO FALTANTE
    double C = Math.sqrt(H * H - R * R);
    //AREA tRIANGULAR
    double AT = 2 *(R * C) / 2;
    //area CIRCULAR
    double pi = 3.1416;
    double AC = (pi * R * R) /2;
    double area = AT + AC;
      System.out.println("El area del terreno es:" + area);
  }
}
