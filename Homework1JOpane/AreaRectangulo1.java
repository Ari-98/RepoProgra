import javax.swing.JOptionPane;

public class AreaRectangulo1{
  public static void main(String[] args) {
    double a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la medida de la altura:"));
    double b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la medida de la base del rectangulo"));
    double area = a * b;
      JOptionPane.showMessageDialog(null,"El area del rectangulo es:" + area);
  }
}
