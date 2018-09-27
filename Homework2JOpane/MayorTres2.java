import javax.swing.JOptionPane;
public class MayorTres2{
  public static void main(String[] args) {

    int m;

    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el primer numero: "));
  int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el segundo numero: "));
int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tercer numero: "));

    if (a > b) {
      if (a>c) {
        m=a;
        JOptionPane.showMessageDialog(null, "El mayor es: "+ m);
      }else{
        m=c;
        JOptionPane.showMessageDialog(null, "El mayor es: "+ m);
     }
   }else if (b > c) {
      m= b;
    JOptionPane.showMessageDialog(null, "El mayor es: "+ m);
    }else {
        m=c;
        JOptionPane.showMessageDialog(null, "El mayor es: "+ m);
      }
    }
  }
