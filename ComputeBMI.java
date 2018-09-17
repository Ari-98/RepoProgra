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
    //double bmi = weightIntKilograms / (heightIntMeters * heightIntMeters);
    double bmi = weightIntKilograms / Math.pow(heightIntMeters, 2);
    System.out.println("Your BMI is: " + bmi);
    if (bmi < 16)
      System.out.println("\nYour are seriously underweight");
    else if (bmi < 18 )
      System.out.println("\nYour are underweight");
      else if (bmi < 24 )
        System.out.println("\nYour are normal weight");
        else if (bmi < 29 )
          System.out.println("\nYour are overweight");
          else if (bmi < 35)
            System.out.println("\nYour are seriously overweight");
            else
              System.out.println("\nYour are gravely overweight");
  }
}
