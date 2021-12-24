package kata6.toys;

public class Car {
    
    final private Integer serialNumber;
    final String type;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "car";
    }
    
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    public void label(){
        System.out.printf("Labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
}
