public class TemperatureException extends Exception {
    //props
    int t;

    public TemperatureException(int t, String msg){
        super(msg);
        this.t = t;
    }
    public int getT(){
        return t;
    }
}
