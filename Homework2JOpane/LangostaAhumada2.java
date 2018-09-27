import javax.swing.JOptionPane;
public class LangostaAhumada2{
  public static void main(String[] args) {

    int np = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de personas:"));
    double tot;
    if (np > 300){
      tot = np * 75;
      JOptionPane.showMessageDialog(null, "El total a pagar por el banquete es de: " +tot);
    }
    else if (np > 200 && np <=300) {
      tot = np * 85;
      JOptionPane.showMessageDialog(null, "El total a pagar por el banquete es de: "+ tot);
    }else{
      tot = np * 95;
      JOptionPane.showMessageDialog(null, "El total a pagar por el banquete es de: "+ tot);
    }
  }
}
