import javax.swing.JOptionPane;
public class AreaTerreno1{
  public static void main(String[] args) {
    double b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la medida de la base del terreno"));
    double a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la altura del triangulo y rectangulo unidos"));
    double c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la altura del rectangulo"));

    //AREA DEL TRIANGULO
    double at = (b * (a - c) / 2);
    //area del rectangulo
    double ar = b * c;
    double area = at + ar;
      JOptionPane.showMessageDialog(null,"El area del terreno es :" + area);
  }
}
