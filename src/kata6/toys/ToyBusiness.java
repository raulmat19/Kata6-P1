package kata6.toys;

import kata6.toyproduct.Toy;
import kata6.toyproduct.models.CarToy;
import kata6.toyproduct.models.HelicopterToy;

public class ToyBusiness {
    
    public SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy createToy(String type){
       
        switch(type) {
            case "car":
                CarToy car = new CarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
                
            case "helicopter":
                HelicopterToy hc = new HelicopterToy(this.generator.next());
                hc.pack();
                hc.label();
                return hc;
            
            default:
                return null;
        }
    }
}
    
    
