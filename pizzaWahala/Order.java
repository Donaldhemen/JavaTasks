public class Order {
    public int howManyBoxes(int numberOfPeople, int numberOfSlicesInPizza) {
        
        int numberOfBoxes;
        if (numberOfPeople % numberOfSlicesInPizza  == 0) {
            numberOfBoxes = numberOfPeople / numberOfSlicesInPizza;
        }
        else {
            numberOfBoxes = numberOfPeople / numberOfSlicesInPizza + 1;
        }
        return numberOfBoxes;
    }

    public int howManySlicesLeft(int numberOfPeople, int numberOfSlicesInPizza) {

        int remainingSlices;
        if (numberOfPeople % numberOfSlicesInPizza == 0) {
            remainingSlices = 0;
        }
        else {
            remainingSlices = numberOfSlicesInPizza - (numberOfPeople % numberOfSlicesInPizza);
        }
        return remainingSlices;
    }
    
    public int howMuchPayment(int numberOfPeople, int numberOfSlicesInPizza) {
        int numberOfBoxes = howManyBoxes(numberOfPeople, numberOfSlicesInPizza);
        int payment = 1;
        if (numberOfSlicesInPizza == 4){
            payment = numberOfBoxes * 2500;
        }
        else if (numberOfSlicesInPizza == 6) {
            payment = numberOfBoxes * 2900;
        }
        else if (numberOfSlicesInPizza == 8) {
            payment = numberOfBoxes * 4000;
        }
        else if (numberOfSlicesInPizza == 12) {
            payment = numberOfBoxes * 5200;
        }
        return payment;
    }
}
