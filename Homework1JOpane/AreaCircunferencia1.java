import javax.swing.JOptionPane;
public class AreaCircunferencia1{
  public static void main(String[] args) {
    double r = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la medida del radio de la circunferencia"));
    final double PI = 3.1416;
    double area = PI * r;
      JOptionPane.showMessageDialog(null,"El area de la circunferencia es: " + area);
  }
}
