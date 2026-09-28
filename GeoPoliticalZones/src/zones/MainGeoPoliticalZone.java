package zones;

import java.util.Scanner;

public class MainGeoPoliticalZone {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Nigerian state: ");
        String state = scanner.next();

        GeoPoliticalZone zone = ZoneFinder.findZone(state);

        if(zone == null){
            System.out.println("State not found");
        }
        else {
            System.out.println(state+" belongs to "+ zone);
        }
    }
}
