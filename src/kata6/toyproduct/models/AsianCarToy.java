package kata6.toyproduct.models;

import kata6.toyproduct.Toy;

public class AsianCarToy implements Toy{
    
    final private Integer serialNumber;
    final String type;

    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "car";
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
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
}
