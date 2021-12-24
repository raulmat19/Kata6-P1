package kata6.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toys.Car;
import kata6.toys.Helicopter;
import kata6.toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = sc.nextLine();
            
            switch (line) {
                case "car":
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built cars: " + cars.stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
                 break;
                 
                case "helicopter":
                    Helicopter hc = new Helicopter(generator.next());
                    hc.pack();
                    hc.label();
                    helicopters.add(hc);
                    System.out.println("Built helicopters: " + helicopters.stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
                break;
                
                case "exit":
                    System.out.println("Exiting...");
                    break;
                
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        } 
    }
}
