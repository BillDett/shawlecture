
package appliances_v5;

public class House {

    public static void main(String[] args) {

        CanOpener opener = new CanOpener("Kitchen");
        
        TempControls[] tempAppliances = new TempControls[3];

        // This works because all of these sub-types implement TempControls interface
        tempAppliances[0] = new Refrigerator("Kitchen", 3);
        tempAppliances[1] = new Oven("Kitchen", 3);
        tempAppliances[2] = new Toaster("Kitchen", 4, 3);

        System.out.println(opener);

        // Set all temperature controlled appliances to 350 degrees
        for (TempControls a : tempAppliances) {
            a.setTemp(350);
            System.out.println(a);
        }

        // Just change the temperature on the toaster. To make this clearer, let's create a specific
        // Toaster reference that is "cast" from the reference to a TempControls interface.
        // Be careful with this though, "widening" a reference won't work unless the instance actually can be cast to the sub-type properly
        Toaster toaster = (Toaster) tempAppliances[2];
        toaster.setTemp(450);
        toaster.pushDown();
        System.out.println(toaster);

    }

}