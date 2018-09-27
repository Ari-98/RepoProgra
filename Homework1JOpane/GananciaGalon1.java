import javax.swing.JOptionPane;
public class GananciaGalon1{
  public static void main(String[] args) {
    int l = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es la cantidad entera de lts. que produce?"));
    double pg = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es el presio del galon?"));
    //Cant. de galones que produce
    double tg = l / 3.785;
    //GANANCIA POR LA ENTREGA DE LA LECHE
    double ga = pg * tg;
      JOptionPane.showMessageDialog(null, "La ganancia es: " + ga);
  }
}
