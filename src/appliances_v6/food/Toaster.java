package appliances_v6.food;

public class Toaster extends TempController {

    private int slices;

    public Toaster( String l, int s, int p ) {
        super(l, p);
        slices = s;
        temperature = 350;  // default for medium toast
    }

    // Overrides the base class setTemp() method
    public void setTemp(double t) {
        temperature = t;
    }

    public void pushDown() {
        isOn = true;
    }

    public void popUp() {
        setTemp(0.0);
        isOn = false;
    }

    public int getSlices() { return slices; }

    public String toString() {
        return "Toaster - " + super.toString() + " - " + slices +  " slices - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
