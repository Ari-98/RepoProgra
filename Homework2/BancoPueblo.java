import java.util.Scanner;

public class BancoPueblo{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Indique la tarjeta de tipo mayor o la que guste:");
  int tt = input.nextInt();
  System.out.println("Cual es el limite actual de credito con el que cuenta?");
  double la = input.nextDouble();
  double ac=0;
  if (tt == 1){
    //AC= AUMENTO DE CREDITO
   ac = la * 0.25;
    double nc = la + ac;
    System.out.println("El aumento es de: "+ ac);
    System.out.println("Su nuevo limite de credito es: "+ nc);
  }

    if (tt == 2 ){
    ac = la * 0.35;
    double nc = la + ac;
    System.out.println("El aumento es de: "+ ac);
    System.out.println("Su nuevo limite de credito es: "+ nc);
  }
    if ( tt == 3){
    ac = la * 0.40;
    double nc = la + ac;
    System.out.println("El aumento es de: "+ ac);
    System.out.println("Su nuevo limite de credito es: "+ nc);
  }
  if (tt > 3) {
    ac = la * 0.50;
    double nc = la + ac;
    System.out.println("El aumento es de: "+ ac);
    System.out.println("Su nuevo limite de credito es: "+ nc);
  }
 }
}
