package appliances_v6;

public abstract class Appliance {
    private String location;
    private int powerProngs;
    protected boolean isOn;

    public Appliance( String l, int p ) {
        location = l; powerProngs = p;
        isOn = false;
    }

    public String getLocation() { return location; }
    public int getPowerProngs() { return powerProngs; }

    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public boolean isOn() { return isOn; }

    public String toString() {
        return location + ", is " + (isOn? "on" : "off") + ", needs " + powerProngs + " hole plug.";
    }
}
