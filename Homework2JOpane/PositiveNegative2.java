import javax.swing.JOptionPane;
public class PositiveNegative2{
  public static void main(String[] args) {

    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el valor:"));
    String r; //RESULTADO

    if (num >= 0) {
      r = "POSITIVO";
    }else{
     r="NEGATIVO";
    }
    JOptionPane.showMessageDialog(null, "El numero es: "+ r);
  }
}
