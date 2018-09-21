import java.util.Scanner;
public class NumMayor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int mayor;
    int medio;
    int menor;

    System.out.println("Introduce el primer numero: ");
    int num1 = input.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int num2 = input.nextInt();
    System.out.println("Introduce el tercer numero: ");
    int num3 = input.nextInt();
    if (num1 > num2 && num1 > num3) {
      mayor= num1;
      if (num2 >num3) {
        medio=num2;
        menor=num3;
      }else{
        medio=num2;
        menor=num3;
      }
      System.out.println("El numero mayor es: "+ mayor+ " El numero medio es: "+ medio+ " El numero menor es: "+ menor);
    }
    if (num2>num1 && num2 > num3) {
      mayor=num2;
      if (num1>3) {
        medio=num1;
        menor=num3;
      }else{
        medio=num3;
        menor=num1;
      }
      System.out.println("El numero mayor es: "+ mayor+ " El numero medio es: "+ medio+ " El numero menor es: "+ menor);
    }
    if (num3>num1&&num3 >num2) {
      mayor=num3;
      if (num2>num1) {
        medio=num2;
        menor=num1;
      }else{
        medio=num1;
        menor=num2;
      }
      System.out.println("El numero mayor es: "+ mayor+" El numero medio es: "+ medio+ " /tEl numero menor es: "+ menor);
    }
  }
}
