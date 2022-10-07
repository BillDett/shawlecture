
package appliances_v5;

public class House {

    public static void main(String[] args) {

        CanOpener opener = new CanOpener("Kitchen");
        
        Registered[] rAppliances = new Registered[2];

        // Create our appliances and keep track of Registered ones
        Refrigerator fridge = new Refrigerator("Kitchen", 3);
        fridge.setSerialNo("20302200293092");
        rAppliances[0] = (Registered) fridge;
        
        Oven oven = new Oven("Kitchen", 3);
        
        Toaster toaster = new Toaster("Kitchen", 4, 3);
        toaster.setSerialNo("555928392234");
        toaster.setTemp(450);
        toaster.pushDown();
        rAppliances[1] = (Registered) toaster;

        System.out.println(opener);
        System.out.println(fridge);
        System.out.println(oven);
        System.out.println(toaster);

        // Print serial numbers for all Registered appliances
        System.out.println("Serial numbers:");
        for (Registered r : rAppliances) {
            System.out.println("\t" + r.getSerialNo());
        }

    }

}