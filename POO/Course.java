import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Course{

    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();

    public Course() {

    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        boolean temp = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) {
                students.remove(i);
                temp = true;
            }
        }
        if (!temp) {
            JOptionPane.showMessageDialog(null, "No se encontro el estudiante: "+student);
        }
    }

    public ArrayList<String> getStudents() {
        return this.students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

}
/*import javax.swing.JOptionPane;
public class Course{
  private String courseName; //encapsulacion
  private String[] students = new String[100];
  private int numberOfStudents = 0;

  public Course(){

  }
  public Course(String courseName){
    this.courseName = courseName;
  }
/*  public String getCourseName(){                //CONSTRUCTOR  ES UN METODO, INICIALIZA VALORES. MISMO NOMBRE DE LA CLASE
    return this.courseName;
  }*/
  /* public String getCourseName(){                //CONSTRUCTOR  ES UN METODO, INICIALIZA VALORES. MISMO NOMBRE DE LA CLASE
      return courseName;
    }

  public void setCourseName(String courseName){
    this.courseName = courseName;
  }
  public void addStudent(String student){
    /*this.students[numberOfStudents] = student;
    this.numberOfStudents ++ ;*/
  /*  if (numberOfStudents >= students.length) {
       String[] temp = new String[students.length * 2];
       System.arraycopy(students, 0, temp, 0, students.length);
       students = temp;
     }

     students[numberOfStudents++] = student;
   }

 public String[] getStudents() {
     return students;
}
  /*public String[] setStudents(){
    return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudents;

  }*/
  /*public void clear() {
    //students = new String[1];
    numberOfStudents = 0;
  }
  public void dropStudent(String student){
    for (int i = 0; i < numberOfStudents; i++) {
	      if (students[i].equalsIgnoreCase(student)) {
	        // Move students[i + 1] to students[i], etc.
	        for (int k = i + 1; k < numberOfStudents; k++) {
	          students[k - 1] = students[k];
	        }

	        numberOfStudents--;
	        break;
	      }
	    }
	  }

  /*public void dropStudent(String student) {
		int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}

	/** deletes a Student */
	/*public void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}


	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}*/
