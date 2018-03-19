public class Car extends Vehicle {

    public String wheel;
    public String door;
    public int gears;
    public boolean isManual;
    public int currentGear = 0;

    public Car(){
        super();
    }

    public Car(String name, String size) {
        super(name, size);
    }

    //Method to set or change the currentGear to the value passed
    void changeGear(int gear) {
        setGears(gear);
    }

    //This Method is a special one which will to add speed to currentVelocity and direction to currentDirection.
    void changeVelocity(int speed, int direction) {
        currentVelocity = getCurrentVelocity()+ speed;
        direction = getCurrentDirection();
    }


    public int getGears() {
        return this.gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getName(){
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

}
