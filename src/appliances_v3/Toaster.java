package appliances_v3;

public class Toaster extends TempController {

    private int slices;

    public Toaster( String l, int s, int p ) {
        super(l, p);
        slices = s;
    }

    public void pushDown() {
        setTemp(250);
    }

    public void popUp() {
        setTemp(0.0);
    }

    public int getSlices() { return slices; }

    public String toString() {
        return "Toaster - " + super.toString() + " - " + slices +  " slices - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
