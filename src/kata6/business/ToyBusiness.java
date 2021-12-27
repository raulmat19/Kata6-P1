package kata6.business;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;

public class ToyBusiness {
    
    private final ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    }
}
