import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //final indica que es una variable constante Y LAS DECLARAMOS CON MAYUSCULAS
    final double KILOGRAMS_PER_POUND = 0.4535923;
    //INCH ES PULGADAS
    final double METERS_PER_INCH = 0.0254;

    System.out.println("Enter weight in pounds: "); //en libras
    double weight = input.nextDouble();
    System.out.println("Enter height in inches: "); //en PULGADAS
    double height = input.nextDouble();
    double weightIntKilograms = weight * KILOGRAMS_PER_POUND;
    double heightIntMeters = height * METERS_PER_INCH;
    double ibm = weightIntKilograms / (heightIntMeters * heightIntMeters);
    System.out.println("\nYour BMI is: "+ ibm);
  }
}
