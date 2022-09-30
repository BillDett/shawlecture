package appliances_v2;

public class Refrigerator extends Appliance {
    private double temperature;

    public Refrigerator( String l, int p ) {
        super(l, p);
        temperature = 33.0;
    }

    public double getTemp() { return temperature; }
    public void setTemp(double t) {
        temperature = t;
        if ( temperature > 0.0 )
            isOn = true;
        else
            isOn = false;
    }

    public String toString() {
        return "Refrigerator - " + super.toString() +  " - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
