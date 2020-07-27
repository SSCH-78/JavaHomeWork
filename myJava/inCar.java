class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class inCar extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    inCar myFastCar = new inCar();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}



