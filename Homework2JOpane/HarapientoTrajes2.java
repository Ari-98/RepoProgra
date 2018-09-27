import javax.swing.JOptionPane;
public class HarapientoTrajes2{
  public static void main(String[] args) {

    int ct = Integer.parseInt(JOptionPane.showInputDialog(null,"Costo del traje:"));
    double de;
    double pf;


    if (ct > 2500) {
      de = ct * .15;
      pf = ct - de;
    }else{
      de = ct * .08;
      pf = ct - de;
    }
    JOptionPane.showMessageDialog(null,"El descuentos es de: "+ de+" El pago a realizar es de: "+ pf);
  }
}
