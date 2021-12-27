package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(Integer serialNumber){

         return new AmericanHelicopterToy(serialNumber);
              
    }
}
    
    
