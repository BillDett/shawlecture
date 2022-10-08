package appliances_v7.entertainment;

public class Television extends Component {

    private int size;
    private double volume;
    private double contrast;
    private double brightness;
    private boolean truMotion;

    public Television(int s) {
        super(3);
        size = s;
        contrast = brightness = 63.2;
        volume = 50;
    }

    public void setVolume(double amount) {
            volume = amount;
    }
    public double getVolume() {
            return volume;
    }

    public void setTruMotion(boolean t) { truMotion = t; }
    public boolean getTruMotion() { return truMotion; }

    public void setContrast(double c) { contrast = c; }
    public void setBrightness(double b) { brightness = b; }

    public String toString() {
        return "Television" 
            + " - " + size + " inches"    
            + " - volume " + volume
            + " - brightness/contrast " + brightness + "/" + contrast 
            + " - truMotion is " + (truMotion? "on" : "off") + super.toString(); 
    }

}
