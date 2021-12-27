package kata6.factories.regionalfactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AsianCarToy;

public class AsianCarToyFactory extends ToyFactory{
    
    @Override
    public Toy createToy(Integer serialNumber){
  
       return new AsianCarToy(serialNumber);
     
    }
}
    
    
