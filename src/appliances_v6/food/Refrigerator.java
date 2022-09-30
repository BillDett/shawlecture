package appliances_v6.food;

public class Refrigerator extends TempController {

    public Refrigerator( String l, int p ) {
        super(l, p);
        temperature = 33.0;
    }

    public String toString() {
        return "Refrigerator - " + super.toString() +  " - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
