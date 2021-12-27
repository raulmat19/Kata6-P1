package kata6.branches;

import kata6.business.ToyBusiness;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AsianCarToy;
import kata6.toyproduct.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{
    
    @Override
    public Toy createToy(String type){
       
        switch(type) {
            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
                
            case "helicopter":
                AsianHelicopterToy hc = new AsianHelicopterToy(this.generator.next());
                hc.pack();
                hc.label();
                return hc;
            
            default:
                return null;
        }
    }
}
    
    
