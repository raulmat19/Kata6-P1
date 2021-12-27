package kata6.factories;

import kata6.toyproduct.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(Integer serialNumber){
        
        Toy toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
    
}
