# kata-jan18-tdd-vehicle
  * Practice TDD & Pair Programming
  
# This kata focuses on:
  * Test Driven Development (TDD)
  * JAVA concepts: Constructors and Inheritance

# Rules for the kata:
  * Use the “RED – GREEN – REFACTOR” principle.
  
# Problem
    In this Kata we will be looking at the concept of Inheritance with the example of Vehicles on 
    how they can share their behaviours and states. 
    The challenge is to figure out where to place the fields and methods in each of the classes.
    For Eg:
      Vehicle -> Cars         -> Lexus, OutLander
              -> Motorcycle   -> Yahama
              
# STAGE 1:
  1. Create a class Vehicle.
  2. Vehicle contains name, size eg. name => "Outlander",  size => "4WD"
  3. Initialize the currentVelocity and currentDirection to be zero.
  3. Create appropriate test to getName(), getSize(), getCurrentVelocity() and getCurrentDirection(). 
  4. Create three methods in Vehicle steer(int direction), move(int velocity, int direction) and stop()
  
            class Vehicle {                                                                      
            //Method to add direction to the current direction
            void steer(int direction) { }
            
            //Method to set velocity to currentVelocity and direction to currentDirection.
            void move(int velocity, int direction) { }
            
            //Method to change the currentVelocity to zero
            void stop() { }
            }                                                                                                                                     
  
  # STAGE 2:
  1. Create a class Car.
  2. A Car has these list of features name, size, wheels, doors, gears, isManual.
  3. Create a field currentGear and initialize to 0. Write appropriate test to get the initial currentGear.
  4. Create two methods in Vehicle changeGear(int currentGear) and changeVelocity(int speed, int direction)
  
            class Car {                                                                      
            //Method to set or change the currentGear to the value passed
            void changeGear(int currentGear) { }
            
            //This Method is a special one which will to add speed to currentVelocity and direction to currentDirection.
            void changeVelocity(int speed, int direction) { }
            } 
            
# STAGE 3:
  1. Create a class Lexus.
  2. Add all the features appropriately that a Lexus can inherit.
  3. Create 1 methods in Lexus accelerate(int rate)
  4. Try a new functionality "Lombok" if it is new please ask help. See how it can reduce the number of getters / setters and constructors. Make sure all your test cases are not broken.
  
            class Lexus {                                                                      
            // Method used to invoke previous methods in other classes stop(), changeGear() etc
            // Features of accelerate method
            // 1. Every time we call this method with a rate, the rate is added to the Velocity.
            // 2. If the velocity is zero then the vehicle should stop and changeGear to one.
            // 3. If the velocity is below 10 then changeGear to two.
            // 4. If the velocity is below 25 then changeGear to three.
            // 5. If the velocity is greater than 25 then changeGear to four.
            void accelerate(int rate){ }
            }      
            
 # STAGE 4:
  1. Feel free to get more creative in adding more features to your Classes and also have fun moving the methods and fields to different      classes to see how inheritance can play a role in your code.
