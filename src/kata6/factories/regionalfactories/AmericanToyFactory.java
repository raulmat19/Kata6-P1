package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanCarToy;
import kata6.toyproduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(String type){
       
        switch(type) {
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                return car;
                
            case "helicopter":
                AmericanHelicopterToy hc = new AmericanHelicopterToy(this.generator.next());
                return hc;
            
            default:
                return null;
        }
    }
}
    
    
