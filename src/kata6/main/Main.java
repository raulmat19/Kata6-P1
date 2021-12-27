package kata6.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toyproduct.Toy;
import kata6.business.ToyBusiness;
import kata6.factories.regionalfactories.AmericanToyFactory;
import kata6.factories.regionalfactories.AsianToyFactory;

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
                    business = new ToyBusiness(new AsianToyFactory());
                    break;
                
                case "America":
                case "América":
                case "america":
                case "américa":
                    business = new ToyBusiness(new AmericanToyFactory());
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
                    toys.add(business.produceToy(line));
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
