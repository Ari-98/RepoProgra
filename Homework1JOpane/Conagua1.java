import javax.swing.JOptionPane;
public class Conagua1{
  public static void main(String[] args) {
    double a = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es la altura de la alberca?"));

    double l = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es el largo de la alberca?"));

    double n = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es el ancho de la alberca?"));

    double cm = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es el costo del metro cubico?"));

    // VOLUMEN DE LA ALBERCA
    double v = l * n *a;
    double pag = v * cm;
      JOptionPane.showMessageDialog(null, "El pago que tiene que realizar es de: " + pag);
  }
}
