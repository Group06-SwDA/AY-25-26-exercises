package solid.srp.violation; 


public class Vehicle {

    private int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public void reFuel(int newFuel){
        if(remainingFuel + newFuel > this.maxFuel)
             remainingFuel = maxFuel;
        else remainingFuel = remainingFuel + newFuel;      
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }

}
