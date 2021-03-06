package kata6.toyproduct.models;

import kata6.toyproduct.Toy;

public class AmericanSubmarineToy implements Toy{
    
    final private Integer serialNumber;
    final String type;

    public AmericanSubmarineToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "submarine";
    }
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s' '%d'\n", this.type, this.serialNumber);
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
    }
    
}
