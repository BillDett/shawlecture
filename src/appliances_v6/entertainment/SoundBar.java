package appliances_v6.entertainment;

import appliances_v6.Appliance;

public class SoundBar extends Appliance {
    
    private double volume;

    public SoundBar(String l) {
        super(l,3);
        volume = 45;
    }

    public void setVolume(double v) { volume = v; }
    public double getVolume() { return volume; }

    public String toString() {
        return "Sound Bar - volume " + volume;
    }
}
