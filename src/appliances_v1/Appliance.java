package appliances_v1;

public class Appliance {
    private String name;
    private String location;
    private int powerProngs;
    private boolean isOn;

    public Appliance( String n, String l, int p ) {
        name = n; location = l; powerProngs = p;
        isOn = false;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getPowerProngs() { return powerProngs; }

    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public boolean isOn() { return isOn; }

    public String toString() {
        return name + " - " + location + ", is " + (isOn? "on" : "off") + ", needs " + powerProngs + " hole plug.";
    }

    public static void main(String[] args) {
        Appliance[] stuff = {
            new Appliance("Oven", "Kitchen", 3),
            new Appliance("Refrigerator", "Kitchen", 3),
            new Appliance("Can Opener", "Kitchen", 2)
        };

        stuff[1].turnOn();

        for (Appliance a : stuff) {
            System.out.println(a);
            System.out.println("\tThe " + a.getName() + " is " + (a.isOn()? "on" : "off"));
        }
    }

}