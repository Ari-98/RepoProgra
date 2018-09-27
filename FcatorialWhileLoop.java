import javax.swing.JOptionPane;
public class FcatorialWhileLoop{
  public static void main(String[] args) {
//VALOR PARA EL LIMITE DEL FACTORIAL
    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a int value"));
//NUMERO DEL FACTORIAL
    int fact = 1;
    //Sentinela
    int i=1;
    while (i <= value){
      fact = fact *i;
      i++;
    }
    JOptionPane.showMessageDialog(null, "El factorial de "+ value +" es "+fact, "Calcular Factorial ", JOptionPane.WARNING_MESSAGE);
  }
}
