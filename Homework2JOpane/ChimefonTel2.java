import javax.swing.JOptionPane;
public class ChimefonTel2{
 public static void main(String[] args) {
   Double pag;
   Double imp;
   Double tot;
   pag = 0.0;
   imp = 0.0;

   int ti = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minutes of the call"));

   if (ti <= 5) {
     pag = ti * 1.0;
   } else if (ti > 5 && ti <= 8)  {
     pag = ((ti - 5) * .80) + 5;
   } else if (ti > 8 && ti <= 10) {
     pag = ((ti - 8) * .70) + 7.4;
   } else if (ti > 10) {
     pag = ((ti - 8) * .70) + 7.4;
   }
String di = (JOptionPane.showInputDialog(null, "Enter the day of the call. Example:", " domingo or dom", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Selecciona", "domingo", "dom"}, "Selecciona")).toString();

  if (di.equalsIgnoreCase ("domingo") || di.equalsIgnoreCase ("dom")) {
    imp = (pag * .03) ;
  } else {
    String tu = (JOptionPane.showInputDialog(null, "Enter the day shift: ", "matutino or vespertino", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Selecciona", "matutino", "vespertino"}, "Selecciona")).toString();

    if (tu.equalsIgnoreCase ("matutino")) {
      imp = (pag * .15) ;
    } else if (tu.equalsIgnoreCase ("vespertino")) {
      imp = (pag * .10);
    }
  }
  tot = imp + pag;
  JOptionPane.showMessageDialog(null,"The payment is: $" + pag+" The tax is: $" + imp+" The total payment is: $" + tot);
}
}
