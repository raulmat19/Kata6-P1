package kata6.business;

import java.util.HashMap;
import java.util.Map;
import kata6.factories.SerialNumberGenerator;
import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;

public class ToyBusiness {
    
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    final private SerialNumberGenerator generator = new SerialNumberGenerator();

    
    public void add(String name, ToyFactory toyFactory){
        this.toyFactories.put(name, toyFactory);
    }
    public Toy produceToy(String name){
        return this.toyFactories.get(name).produceToy(this.generator.next());
    }
}
