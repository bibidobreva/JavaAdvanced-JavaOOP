package RawData;

public class Engine {
    private int engineSpeed;
    private int enginePower;
    public Engine(int engineSpeed,int enginePower){
        this.enginePower= enginePower;
        this.engineSpeed = engineSpeed;
    }
    public boolean isEnginePowerOver250(){
        if(this.enginePower>250) return true;
        else return false;
    }
}
