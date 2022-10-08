package appliances_v7.food;

import appliances_v7.Registered;

public class Refrigerator extends TempController implements Registered {

    private String serial;

    public Refrigerator( String l, int p ) {
        super(l, p);
        temperature = 33.0;
    }

    public String getSerialNo() { return serial; }
    public void setSerialNo(String s) { serial = s; }
    public int register(String url) {
        // call a web service passing along the serial number
        return 200;
    }

    public String toString() {
        return "Refrigerator - " + super.toString() +  " - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
