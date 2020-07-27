public class constructorCar {
  int modelYear;
  String modelName;

  public constructorCar(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {

    constructorCar myCar = new constructorCar(2000, "Mustang");

    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}