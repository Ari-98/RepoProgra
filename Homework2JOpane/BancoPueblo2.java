import javax.swing.JOptionPane;

public class BancoPueblo2{
  public static void main(String[] args) {

  int tt = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la tarjeta de tipo mayor o la que guste:"));
  double la = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es el limite actual de credito con el que cuenta?"));

  double ac=0;
  if (tt == 1){
    //AC= AUMENTO DE CREDITO
   ac = la * 0.25;
    double nc = la + ac;
    JOptionPane.showMessageDialog(null,"El aumento es de: "+ ac+ " Su nuevo limite de credito es: "+ nc);
  }

    if (tt == 2 ){
    ac = la * 0.35;
    double nc = la + ac;
    JOptionPane.showMessageDialog(null,"El aumento es de: "+ ac+ " Su nuevo limite de credito es: "+ nc);

  }
    if ( tt == 3){
    ac = la * 0.40;
    double nc = la + ac;
    JOptionPane.showMessageDialog(null,"El aumento es de: "+ ac+ " Su nuevo limite de credito es: "+ nc);
  }
  if (tt > 3) {
    ac = la * 0.50;
    double nc = la + ac;
    JOptionPane.showMessageDialog(null,"El aumento es de: "+ ac+ " Su nuevo limite de credito es: "+ nc);
  }
 }
}
