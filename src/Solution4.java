public class Solution4 {

    public static void main(String[] args) {
        // Java is an object-oriented programming language
        // this means when we write code its inside classes
        // (look at the top of the file, here it is called class Exercise4)
        // classes are like blueprints
        // for example we have a class called car, which is a general blueprint for cars
        // we can use this to create objects, which would resemble an actual car
        // objects can have functions that we can use, for example a function of a car object is "drive"
        // we have to create objects to use those functions
        // just think about our car example again: the blueprint can't drive, but the car that we produced using the
        // blueprint can drive

        // classes are also types for our variables, like int, boolean, etc.
        // to create a new object of a class we use the word "new"
        Car car1 = new Car();

        // we can now call the method drive of our car
        car1.drive();

        // create a new car and call its method honk
        Car car2 = new Car();
        car2.honk();

    }

}
