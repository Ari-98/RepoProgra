public class Dog{
  //properties or attributes
    String color;
    String eyeColor;
    double height;
    double lenght;
    double weight;
    //Methods o behaviors (comportamientos)
    public String sit(){
      return "Estoy sentado";
      //System.out.println("Estoy sentado");
    }
    public void bark(){
      System.out.println("Wauff Wauuf!");
    }
    public void layDown(String name){
      System.out.println(name + "Estoy recostado");
    }
    public void eat(){
      System.out.println("Estoy comiendo");
    }
    public void sleep(){
      System.out.println("zzZZZZzz");
    }
}
