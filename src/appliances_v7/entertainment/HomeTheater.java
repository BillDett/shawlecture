package appliances_v7.entertainment;

import appliances_v6.Appliance;

import java.util.List;
import java.util.ArrayList;

public class HomeTheater extends Appliance {

    private List<Component> components;

    public HomeTheater(String l) {
        super(l, 3);
        components = new ArrayList<Component>();
    }
    
    public void turnOn() {
        for (Component c : components) {
            c.turnOn();
        }
    }
    public void turnOff() {
        for (Component c : components) {
            c.turnOff();
        }
    }

    public List<Component> getComponents() { return components; }
    
    public String toString() {
        String response =  "Home Theater - " + super.toString();
        for (Component c : components) {
            response += "\n\t" + c.toString();
        }
        return response;
    }

}
