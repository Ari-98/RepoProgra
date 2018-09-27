import javax.swing.JOptionPane;
public class Lapiz2{
  public static void main(String[] args) {

    double x = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de lapices:"));
    double pag;

    if (x >= 1000) {
        pag = x * 0.85;
    }else{
        pag = x * 0.90;
    }
    JOptionPane.showMessageDialog(null, "El pago a realizar es de: "+ pag);
  }
}
