package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AsianCarToy;
import kata6.toyproduct.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(String type){
       
        switch(type) {
            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                return car;
                
            case "helicopter":
                AsianHelicopterToy hc = new AsianHelicopterToy(this.generator.next());
                return hc;
            
            default:
                return null;
        }
    }
}
    
    
