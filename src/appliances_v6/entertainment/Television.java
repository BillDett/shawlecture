package appliances_v6.entertainment;

import appliances_v6.Appliance;

public class Television extends Appliance {

    private int size;
    private double volume;
    private double contrast;
    private double brightness;
    private boolean truMotion;
    private SoundBar soundbar;

    public Television(String l, int s) {
        super(l, 3);
        size = s;
        contrast = brightness = 63.2;
        volume = 50;
    }

    public void attachSoundBar(SoundBar s) { soundbar = s; }
    public void detachSoundBar(SoundBar s) { soundbar = null; }

    public void setVolume(double amount) {
        if (soundbar != null) {
                soundbar.setVolume(amount);
        } else {
            volume = amount;
        }
    }
    public double getVolume() {
        if (soundbar != null) {
                return soundbar.getVolume();
        } else {
            return volume;
        }
    }

    public void setTruMotion(boolean t) { truMotion = t; }
    public boolean getTruMotion() { return truMotion; }

    public void setContrast(double c) { contrast = c; }
    public void setBrightness(double b) { brightness = b; }

    public String toString() {
        return "Television" 
            + " - " + size + " inches"    
            + " - volume " + volume
            + " - " + (soundbar == null? "no soundbar" : "soundbar attached")
            + " - brightness/contrast " + brightness + "/" + contrast 
            + " - truMotion is " + (truMotion? "on" : "off"); 
    }

}
