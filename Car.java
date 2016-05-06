package Cars;

/**
 * Created by vdohryk on 06.05.2016.
 */
public class Car {
    String model;
    int year;
    Color color;
    int max_speed;
    double cost;
    boolean inMove;

    public static void main(String args[]){

        Car car = new Car("Toyota",2014, Color.DARK_GREY, 214, 10000.00);
        car.printInfo();
    }

    Car(String model, int year, Color color, int max_speed, double cost){
        this.model = model;
        this.color = color;
        this.year = year;
        this.max_speed = max_speed;
        this.cost = cost;
    }

    public void printInfo(){
        System.out.println("Model: " + this.model + ", year: " + this.year + ", color: " + this.color + ", max speed: " + this.max_speed);
    }

    public void move(){
        this.inMove = true;
        System.out.println("Go-Go-Go");
    }

    public void stop(){
        this.inMove = false;
        System.out.println("Stop machine!");
    }

    public void pedestrianPush(){
        if (this.inMove){
            System.out.println("Pedestrian pushed!");
        } else {
            System.out.println("We must move!");
        }
    }

}
