package Car;
public class TaxiCar implements Car {
    public void move() {
        System.out.println("Taxi di bang 4 banh");
    }

    public void stop() {
        System.out.println("Taxi dung lai");
    }

    public void turnLeft() {
        System.out.println("Taxi re trai");
    }

    public void turnRight() {
        System.out.println("Taxi re phai");
    }

    public void Reverse() {
        System.out.println("Taxi quay lai");
    }
}
