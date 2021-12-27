package kata6.branches;

import kata6.business.ToyBusiness;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanCarToy;
import kata6.toyproduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{
    
    @Override
    public Toy createToy(String type){
       
        switch(type) {
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
                
            case "helicopter":
                AmericanHelicopterToy hc = new AmericanHelicopterToy(this.generator.next());
                hc.pack();
                hc.label();
                return hc;
            
            default:
                return null;
        }
    }
}
    
    
