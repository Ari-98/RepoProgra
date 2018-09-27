import javax.swing.JOptionPane;
public class ViajeEstudios2{
  public static void main(String[] args) {

    int na = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos alumnos iran al viaje:"));
    double pa;

    if (na >= 100) {
        pa  = 65;
        double tot=na*pa;
        JOptionPane.showMessageDialog(null, "El pago a realizar por cada alumno: "+ pa+ " El pago a realizar es de: "+ tot);
    }else if (na > 50) {
      pa=70;
      double tot=na*pa;
      JOptionPane.showMessageDialog(null, "El pago a realizar por cada alumno: "+ pa+ " El pago a realizar es de: "+ tot);
    }else if (na >30) {
      pa=95;
      double tot=na*pa;
    JOptionPane.showMessageDialog(null, "El pago a realizar por cada alumno: "+ pa+ " El pago a realizar es de: "+ tot);
    }else{
        double tot=4000;
        pa=4000/na;
        JOptionPane.showMessageDialog(null, "El pago a realizar por cada alumno: "+ pa+ " El pago a realizar es de: "+ tot);
    }
  }
}
