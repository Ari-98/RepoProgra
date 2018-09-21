import java.util.Scanner;
public class ViajeEstudios{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Cuantos alumnos iran al viaje:");
    int na = input.nextInt();
    double pa;

    if (na >= 100) {
        pa  = 65;
        double tot=na*pa;
        System.out.println("El pago a realizar por cada alumno: "+ pa);
        System.out.println("El pago a realizar es de: "+ tot);
    }else if (na > 50) {
      pa=70;
      double tot=na*pa;
      System.out.println("El pago a realizar por cada alumno: "+ pa);
      System.out.println("El pago a realizar es de: "+ tot);
    }else if (na >30) {
      pa=95;
      double tot=na*pa;
      System.out.println("El pago a realizar por cada alumno: "+ pa);
      System.out.println("El pago a realizar es de: "+ tot);
    }else{
        double tot=4000;
        pa=4000/na;
        System.out.println("El pago a realizar por cada alumno: "+ pa);
        System.out.println("El pago a realizar es de: "+ tot);
    }
  }
}
