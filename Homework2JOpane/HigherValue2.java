import javax.swing.JOptionPane;
public class HigherValue2{
  public static void main(String[] args) {

    int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first value:"));
    int m; //mayor
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second value:"));
    if (a > b) {
      m = a;
    }else{
      m = b;
    }
    JOptionPane.showMessageDialog(null,"The higher value is: "+ m);
  }
}
