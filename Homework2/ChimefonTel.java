import java.util.Scanner;
public class ChimefonTel{
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   Double pag;
   Double imp;
   Double tot;
   pag = 0.0;
   imp = 0.0;

   System.out.println("Enter the minutes of the call");
   int ti = input.nextInt();
   if (ti <= 5) {
     pag = ti * 1.0;
   } else if (ti > 5 && ti <= 8)  {
     pag = ((ti - 5) * .80) + 5;
   } else if (ti > 8 && ti <= 10) {
     pag = ((ti - 8) * .70) + 7.4;
   } else if (ti > 10) {
     pag = ((ti - 8) * .70) + 7.4;
   }
   System.out.println("Enter the day of the call. Example: domingo or dom");
   String di = input.next();
  if (di.equalsIgnoreCase ("domingo") || di.equalsIgnoreCase ("dom")) {
    imp = (pag * .03) ;
  } else {
    System.out.println("Enter the day shift: matutino or vespertino");
    String tu = input.next();
    if (tu.equalsIgnoreCase ("matutino")) {
      imp = (pag * .15) ;
    } else if (tu.equalsIgnoreCase ("vespertino")) {
      imp = (pag * .10);
    }
  }
  tot = imp + pag;
  System.out.println("The payment is: $" + pag);
  System.out.println("The tax is: $" + imp);
  System.out.println("The total payment is: $" + tot);
}
}
