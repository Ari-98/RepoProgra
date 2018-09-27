import javax.swing.JOptionPane;
public class MetrosPulgadas1{
  public static void main(String[] args) {
  double cm = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es la cantidad de mts. que requiere?"));

    //cantidad de  mts. que requiere

    double  pg = cm / 2.54;
      JOptionPane.showMessageDialog(null,"Las pulgadas a pedir son: " + pg);
  }
}
