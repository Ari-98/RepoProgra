import java.util.Scanner;
public class Lapiz{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Cantidad de lapices:");
    double pag;
    int x = input.nextInt();

    if (x >= 1000) {
        pag = x * 0.85;
    }else{
        pag = x * 0.90;
    }
    System.out.println("El pago a realizar es de: "+ pag);
  }
}
