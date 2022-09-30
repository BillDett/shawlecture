package appliances_v1;

public class House {
    public static void main(String[] args) {
       
        Appliance[] stuff = {
            new Appliance("Oven", "Kitchen", 3),
            new Appliance("Refrigerator", "Kitchen", 3),
            new Appliance("Can Opener", "Kitchen", 2)
        };
       
        stuff[1].turnOn();

        for (Appliance a : stuff) {
            System.out.println(a);
        }
    }

}