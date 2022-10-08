package appliances_v5;

public class Toaster extends TempController implements Registered {

    private int slices;
    private String serial;

    public Toaster( String l, int s, int p ) {
        super(l, p);
        slices = s;
        temperature = 350;  // default for medium toast
    }


    public String getSerialNo() { return serial.toUpperCase(); }
    public void setSerialNo(String s) { serial = "toast-" + s; }
    public int register(String url) {
        // call a web service passing along the serial number
        return 200;
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
