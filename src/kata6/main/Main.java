package kata6.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toyproduct.Toy;
import kata6.branches.AmericanToyBusiness;
import kata6.branches.AsianToyBusiness;
import kata6.business.SerialNumberGenerator;
import kata6.business.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        ToyBusiness business = null;
        
        Scanner sc = new Scanner(System.in);
        String line = "";
        
        while(business == null){
            System.out.print("Introduzca región: ");
            line = sc.nextLine();
            
            switch (line) {
                case "asia":
                case "Asia":
                    business = new AsianToyBusiness();
                    break;
                
                case "America":
                case "América":
                case "america":
                case "américa":
                    business = new AmericanToyBusiness();
                    break;
                
                default:
                    System.out.println("Región no reconocida");
                    break;
            }
        }
        
        while(!line.equals("exit")){
            System.out.print("\nIntroduzca juguete (o exit): ");
            line = sc.nextLine();
            
            switch (line) {
                case "car":
                case "helicopter":
                    toys.add(business.createToy(line));
                    System.out.println("Built toys: " + toys.stream()
                            .map(c -> c.toString())
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
