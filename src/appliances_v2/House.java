
package appliances_v2;

public class House {

    public static void main(String[] args) {

        CanOpener opener = new CanOpener("Kitchen");
        
        Refrigerator fridge = new Refrigerator("Kitchen", 3);
        fridge.turnOn();

        Oven oven = new Oven("Kitchen", 3);
        oven.setTemp(350.0);

        System.out.println(opener);
        System.out.println(fridge);
        System.out.println(oven);
    }

}