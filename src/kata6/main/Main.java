package kata6.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toys.Car;
import kata6.toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        while(!line.equals("exit")){
            Car car = new Car(generator.next());
            car.pack();
            car.label();
            cars.add(car);
            System.out.println("Built cars: " + cars.stream()
                    .map(c -> c.getSerialNumber().toString())
                    .collect(Collectors.joining(", ")));
            
            line = sc.nextLine();
        } 
    }
}
