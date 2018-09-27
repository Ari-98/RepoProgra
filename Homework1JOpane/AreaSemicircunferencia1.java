import javax.swing.JOptionPane;
public class AreaSemicircunferencia1{
  public static void main(String[] args) {
    double r = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la medida de la base del triangulo rectangulo y radio"));
    double h = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la medida de la Hipotenusa"));
    //CALCULO DEL CATETO FALTANTE
    double c = Math.sqrt(h * h - r * r);
    //AREA tRIANGULAR
    double at = 2 *(r * c) / 2;
    //area CIRCULAR
    final double PI = 3.1416;
    double ac = (PI * r * r) /2;
    double area = at + ac;
      JOptionPane.showMessageDialog(null,"El area del terreno es: " + area);
  }
}
