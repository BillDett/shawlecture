package appliances_v7.entertainment;

public class SoundBar extends Speaker {
    
    private double volume;

    public SoundBar() {
        super(2);
        volume = 45;
    }

    public void setVolume(double v) { volume = v; }
    public double getVolume() { return volume; }

    public String toString() {
        return "Sound Bar - volume " + volume + " " + super.toString();
    }
}
