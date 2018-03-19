public class Vehicle {

    public String name;
    public String size;
    public int currentVelocity = 0;
    public int currentDirection = 0;
    public int distanceCovered;
    public int timeTaken;


    public int getDistanceCovered() {
        return this.distanceCovered;
    }

    public void setDistanceCovered(int distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public int getTimeTaken() {
        return this.timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Vehicle(){

    }

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
    }

    //Method to add direction to the current direction
    public void steer(int direction){
        setCurrentDirection(direction);
    }

    //Method to set velocity to currentVelocity and direction to currentDirection.
    void move(int velocity, int direction){
        setCurrentDirection(direction);
        setCurrentVelocity(velocity);
    }

    //Method to change the currentVelocity to zero
    void stop() {
        setCurrentVelocity(0);
    }


    public int getCurrentDirection() {
        return this.currentDirection;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int calculateSpeed(){
        int speed;
        speed = getDistanceCovered()/getTimeTaken();
        return speed;
    }
}
