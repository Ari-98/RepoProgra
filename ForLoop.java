/*public class ForLoop{
  public static void main(String[] args) {
    //for(inicializar varibale de control, condicion de termino, incremento){}
for (int i = 0; i <= 9; i++ ) {
  System.out.println("1 x "+(i +1) +" = "+ (i+1)*1);
}
  }
}*/
import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {
    //for(inicializar varibale de control, condicion de termino, incremento){}

    //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que tabla quieres imprimir?"));


    int pregunta=0;
  do{
     int n= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que tabla quieres imprimir?"));
       String salida="";
    for (int i = 0; i <= 9; i++ ){
      salida += n +" x "+(i +1) +" = "+ (i+1)*n+"\n";

    }
    JOptionPane.showMessageDialog(null, salida);
     pregunta = Integer.parseInt(JOptionPane.showInputDialog(null, "Si desea otra tabla pulse el numero si no pon 0"));
   }while(pregunta != 0);

}
}
