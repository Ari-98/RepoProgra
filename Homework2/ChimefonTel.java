import java.util.Scanner;
  public class ChimefonTel{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Tipo de dia (dia habil o domingo):");
      String di = input.nextLine();
      System.out.println("Turno matutino(M) o vespertino (V):");
      String tu = input.nextLine();
      double imp, tot;


      System.out.println("Tiempo:");
      int ti = input.nextInt();
      if (ti <= 5) {
        double pag = ti *1;
      if (ti <= 8) {
        pag = (ti -5)*.08+5.0;
      if (ti <= 10) {
        pag = (ti -8)*.07+7.4;
      }else{
        pag = (ti -10)*.05+8.8;
      }
}
    System.out.println("El pago es de: $"+pag);
    if (di.equalsIgnoreCase ("domingo")) {
      imp= pag *0.03;
      if (di.equalsIgnoreCase ("habil")){
         if (tu.equalsIgnoreCase ("M")) {
        imp = pag * 0.15;
      }
      if (tu.equalsIgnoreCase ("V")) {
     imp = pag * 0.10;
   }
    }
    System.out.println("El impuesto es de: $"+imp);
    tot= pag+imp;
    System.out.println("El pago total es de: $"+tot);
      }

  }
      }
    }
