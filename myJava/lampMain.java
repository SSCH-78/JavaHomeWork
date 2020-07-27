class Lamp {
    boolean isOn;

    void turnOn() {
       
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    void turnOff() {
        
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}


class lampMain {
    public static void main(String[] args) {
         
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
  
        l1.turnOn();
        l2.turnOff();
    }
}