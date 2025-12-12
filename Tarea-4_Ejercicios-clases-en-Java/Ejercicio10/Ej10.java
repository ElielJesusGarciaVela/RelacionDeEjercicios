class Motor {
    int caballos;
}

class Coche {
    Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }
}
public class Ej10 {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.caballos = 120;
        Coche coche1 = new Coche(motor1);
        System.out.println("Motor del coche: "+coche1.motor);
        System.out.println("Caballos del motor: "+coche1.motor.caballos);
    }
}