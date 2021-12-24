package kata6.toys;

public class ToyBusiness {
    
    public SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(this.generator.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter hc = new Helicopter(generator.next());
        hc.pack();
        hc.label();
        return hc;
    }
}
