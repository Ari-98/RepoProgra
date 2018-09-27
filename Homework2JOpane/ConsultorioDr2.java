import javax.swing.JOptionPane;
  public class ConsultorioDr2{
    public static void main(String[] args) {

      int nc = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de cita:"));
      double cc, tot;
      if (nc <= 3) {
        cc =200;
        tot=nc*cc;
      }else if (nc <= 5) {
        cc=150;
        tot=(nc-3)*150+600;
      }else if (nc <= 8) {
        cc=100;
        tot=(nc-5)*100+600;
      }else {
        cc=50;
        tot=(nc-8)*50+1200;
      }
      JOptionPane.showMessageDialog(null,"Costo de la cita: "
            +cc +" Total por tratamiento: "+ tot);
    }
  }
