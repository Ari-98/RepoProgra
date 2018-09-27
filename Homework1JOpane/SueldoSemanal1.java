import javax.swing.JOptionPane;
public class SueldoSemanal1{
  public static void main(String[] args) {
double ht = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es la cantidad de Horas Trabajadas?"));
double ph = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es su pago por Hora?"));
    double ss = ht * ph;
      JOptionPane.showMessageDialog(null,"Su sueldo semanal es: " + ss);
  }
}
