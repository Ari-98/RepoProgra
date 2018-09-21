import java.util.Scanner;
//es una clase, es publico y nombre de la clase
public class LeapYear{
  public static void main(String[] args) {
    //es STATIC porque no necesita declarar un objeto de tipo main sino que solo lo ejecuta e implemento
    //VOID porque no retorna nada
    //PARENTESIS porque desde consola puedo mandarle atributos
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER A Year");
    int year = input.nextInt();

    if ((year % 4 == 0  && year %100 !=0) || (year % 400 == 0)) {
      System.out.println( year + "is a Leap Year");
    } else{
      System.out.println( year + "is  NOT a Leap Year");
  }
}
}
