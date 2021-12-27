package kata6.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import kata6.toyproduct.Toy;
import kata6.business.ToyBusiness;
import kata6.factories.regionalfactories.AmericanCarToyFactory;
import kata6.factories.regionalfactories.AmericanSubmarineToyFactory;
import kata6.factories.regionalfactories.AsianHelicopterToyFactory;

public class Main {

    public static void main(String[] args) {
        
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        business.add("submarine", new AmericanSubmarineToyFactory());
        
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = "";
        
        /* while(business == null){
            System.out.print("Introduzca región: ");
            line = sc.nextLine();
            
            switch (line) {
                case "asia":
                case "Asia":
                    business = new ToyBusiness(new AsianCarToyFactory());
                    break;
                
                case "America":
                case "América":
                case "america":
                case "américa":
                    business = new ToyBusiness(new AmericanCarToyFactory());
                    break;
                
                default:
                    System.out.println("Región no reconocida");
                    break;
            }
        } */
        
        while(!line.equals("exit")){
            System.out.print("\nIntroduzca juguete (o exit): ");
            line = sc.nextLine();
            
            switch (line) {
                case "car":
                case "helicopter":
                case "submarine":
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
