package kata6.business;

import kata6.toyproduct.Toy;

public abstract class ToyBusiness {
    
     final protected SerialNumberGenerator generator = new SerialNumberGenerator();
     public abstract Toy createToy(String type);
}
