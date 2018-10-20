import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CourseImpl {

    public static void main(String[] args) {
        int cont = 0;
        ArrayList<Course> curso = new ArrayList<Course>();
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige la opcion deseada \n1.Crear curso\n2.Agregar Estudiante \n3.Eliminar Estudiante\n4.Mostrar Estudiante\n5.Mostar cantidad de estudiantes\n6.Salir del menu"));
            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, " Crear curso ");
                    //crear curso
                    Course cursos = new Course();
                    String nombre = JOptionPane.showInputDialog(null, "Nombre del curso :");
                    cursos.setCourseName(nombre);
                    curso.add(cursos);
                    cont++;
                    JOptionPane.showMessageDialog(null, nombre );
                    break;
                case 2:
                    boolean case2 = false;
                    String students = " Hola";
                    ArrayList<String> alumnos = new ArrayList<String>();
                    String nombretemp = JOptionPane.showInputDialog(null, " Agregar estudiante. \n Escriba el nombre del curso");
                    //eliminar
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombretemp)) {
                            while (!students.equals("")) {
                                students = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                                if (students.equals("")) {
                                } else {
                                    alumnos.add(students);
                                }
                            }
                            for (int j = 0; j < alumnos.size(); j++) {
                                curso.get(i).addStudent(alumnos.get(j));
                            }
                            case2 = true;
                        }
                    }
                    if (!case2) {
                        JOptionPane.showMessageDialog(null, "El curso no existe: " + nombretemp);
                    }
                    break;
                case 3:
                    boolean case3 = false;
                    String nombrec = JOptionPane.showInputDialog(null, " Eliminar estudiante. \n Escriba el nombre del curso");
                    //eliminar
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombrec)) {
                            curso.get(i).dropStudent(JOptionPane.showInputDialog(null, "nombre del estudiante: "));
                            case3 = true;
                        }
                    }
                    if (!case3) {
                        JOptionPane.showMessageDialog(null, "El curso no existe: " + nombrec);
                    }
                    break;
                case 4:
                    boolean case4 = false;
                    //mostrar estudiantes
                    String nombre2 = JOptionPane.showInputDialog(null, " Mostrar estudiantes. \n  Escriba el nombre del curso ");
                    for (int i = 0; i < curso.size(); i++) {
                        if (curso.get(i).getCourseName().equals(nombre2)) {
                            ArrayList<String> curso4 = curso.get(i).getStudents();

                            for (int j = 0; j < curso4.size(); j++) {
                                System.out.println(curso4.get(j));
                            }
                            case4 = true;
                        }
                    }
                    if (!case4) {
                        JOptionPane.showMessageDialog(null, "El curso no existe: " + nombre2);
                    }
                    break;
                /*case 5:
                    boolean temp5 = false;
                    //mostrar numero de estudiantes
                    String nombre3 = JOptionPane.showInputDialog(null, " Mostrar número de estudiantes. \n Escriba el nombre del curso");
                    for (int i = 0; i < curso.size(); i++) {

                        if (curso.get(i).getCourseName().equals(nombre3)) {
                            System.out.println(curso.get(i).getNumberOfStudents());
                            temp5 = true;
                        }
                    }
                    if (!temp5) {
                        JOptionPane.showMessageDialog(null, "No se encontro el curso: " + nombre3);
                    }
                    break;*/
                default:
                    if(opc != 6){
                        JOptionPane.showMessageDialog(null, " Eliga una opcion correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Adios");
                    }
            }
        } while (opc != 6);

    }
}
/*case 1:
//crear curso
Course course = new Course();
String n=JOptionPane.showInputDialog(null, "Nombre del curso");
course.setCourseName(n);
JOptionPane.showMessageDialog(null, n);
break;
case 2:
//agregar estudiante
Course curso1 = new Course();
curso1.setCourseName("Ingles");


String [] students1 = curso1.getStudents();
String students = "";
for (int i = 0; i < curso1.getNumberOfStudents() ;i ++ ) {
   students += students1[i] + "\n";
}

break;
case 3:
//eliminar estudiante
break;
case 4:
 //mostrar estudiantes
break;

case 5:
//mostrar numero de estudiantes
break;
default:
JOptionPane.showMessageDialog(null, "Seleccione la opcion correcta");
//mensaje de eliga opcion correcta
break;
}
} while (opc != 6);

}*/

/*Course curso1 = new Course();

curso1.setCourseName("Ingles");

curso1.addStudent("Luis");
curso1.addStudent("Maria");
curso1.addStudent("Lucero");
curso1.addStudent("Luna");
curso1.addStudent("Mariela");
curso1.addStudent("Lola");
curso1.addStudent("Lulu");
curso1.addStudent("Mario");
curso1.addStudent("Hannia");


String [] studentsDeIngles = curso1.getStudents();
String students = "";
for (int i = 0; i < curso1.getNumberOfStudents() ;i ++ ) {
 students += studentsDeIngles[i] + "\n";
}
String stude = "";
for (int i = 0; i < curso1.getNumberOfStudents() ;i ++ ) {
 stude += studentsDeIngles[i] + "\n";
 curso1.dropStudent("Hannia");
}


JOptionPane.showMessageDialog(null, students);
JOptionPane.showMessageDialog(null, stude);



Course curso2 = new Course();
curso2.setCourseName("Mate");
curso2.addStudent("Brandom");
curso2.addStudent("Angel");
curso2.addStudent("Steven");
curso2.addStudent("Laura");
curso2.addStudent("Yael");
curso2.addStudent("Monica");
curso2.addStudent("Otoniel");
curso2.addStudent("Omar");
curso2.addStudent("Carlos");
curso2.addStudent("Diego");
curso2.addStudent("Matias");

String [] studentsDeIngles2 = curso2.getStudents();
String students2 = "";
for (int i = 0; i < curso1.getNumberOfStudents() ;i ++ ) {
 students += studentsDeIngles[i] + "\n";
}
JOptionPane.showMessageDialog(null, students2);

JOptionPane.showMessageDialog(null, curso1.getCourseName());
JOptionPane.showMessageDialog(null, curso2.getCourseName());
}*/
