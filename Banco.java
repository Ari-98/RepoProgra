import java.util.Scanner;

public class Banco{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Indique la tarjeta de tipo mayor o la que guste:");
  int TT = input.nextInt();
  System.out.println("Cual es el limite actual de credito con el que cuenta?");
  double LA = input.nextDouble();
  double AC=0;
  if (TT == 1){
    //AC= AUMENTO DE CREDITO
   AC = LA * 0.25;
    double NC = LA + AC;
    System.out.println("El aumento es de: "+ AC);
    System.out.println("Su nuevo limite de credito es: "+ NC);
  }

    if (TT == 2 ){
    AC = LA * 0.35;
    double NC = LA + AC;
    System.out.println("El aumento es de: "+ AC);
    System.out.println("Su nuevo limite de credito es: "+ NC);
  }
    if ( TT == 3){
    AC = LA * 0.40;
    double NC = LA + AC;
    System.out.println("El aumento es de: "+ AC);
    System.out.println("Su nuevo limite de credito es: "+ NC);
  }
  if (TT > 3) {
    AC = LA * 0.50;
    double NC = LA + AC;
    System.out.println("El aumento es de: "+ AC);
    System.out.println("Su nuevo limite de credito es: "+ NC);
  }
 }
}
