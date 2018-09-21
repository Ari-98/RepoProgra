import java.util.Scanner;
public class LangostaAhumada{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce el numero de personas:");
    int np = input.nextInt();
    double tot;
    if (np > 300){
      tot = np * 75;
      System.out.println("El total a pagar por el banquete es de: " +tot);
    }
    else if (np > 200 && np <=300) {
      tot = np * 85;
      System.out.println("El total a pagar por el banquete es de: "+ tot);
    }else{
      tot = np * 95;
      System.out.println("El total a pagar por el banquete es de: "+ tot);
    }
  }
}
