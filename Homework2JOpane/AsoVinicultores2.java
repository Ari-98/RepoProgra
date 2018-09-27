import javax.swing.JOptionPane;
public class AsoVinicultores2{
  public static void main(String[] args) {
    String tipo = (JOptionPane.showInputDialog(null, "Tipo de uva:", "A o B", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Selecciona", "A", "B"}, "Selecciona")).toString();


    double p = Integer.parseInt(JOptionPane.showInputDialog(null, "Presio inicial del kg. de uva: "));
    int k = Integer.parseInt(JOptionPane.showInputDialog(null, "Kg. de produccion de uva: "));

    double ga;

    if (tipo.equalsIgnoreCase("A")) {
      int ta = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño de uva, 1 o 2:"));
      if (ta == 1) {
        p=p + 0.20;
          ga = p * k;
      JOptionPane.showMessageDialog(null,"La ganancia es: $"+ga);
      }else if (ta == 2) {
        p = p + 0.30;
        ga = p * k;
      JOptionPane.showMessageDialog(null,"La ganancia es: $"+ga);
      }
    }else if (tipo.equalsIgnoreCase ("B")) {
      int ta = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño de uva, 1 o 2:"));
      if (ta == 1) {
        p = p - 0.30;
        ga = p * k;
        JOptionPane.showMessageDialog(null,"La ganancia es: $"+ga);
      }else if (ta == 2) {
        p = p - 0.50;
        ga = p * k;
        JOptionPane.showMessageDialog(null,"La ganancia es: $"+ga);
      }
    }
  }
}
