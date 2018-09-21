import java.util.Scanner;
public class PositiveNegative{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.println("Introduzca el valor:");
    String r; //RESULTADO
    int num = input.nextInt();

    if (num >= 0) {
      r = "POSITIVO";
    }else{
     r="NEGATIVO";
    }
    System.out.println("El numero es: "+ r);
  }
}
