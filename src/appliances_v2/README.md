# Appliances V2

We have now made Appliance an abstract base class so that we need to sub-class it anytime we want to use it. Note Appliance is abstract meaning that we must sub-class it to use it. Also, note that we've had to change the attribute isOn to 'protected' so that sub-classes can use it directly.

This gets rid of the need for a "name" field since the sub-class is our "name". It also lets us add specific attributes and behaviors for each kind of appliance.

Our House code is a bit more complex now too since we need a separate variable for each appliance (we could use a base reference to Appliance however the setTemp() method does not exist on all sub-classes).

But- wait...we still see some oddness in that Refrigerator and Oven both need to have same set/get temperature methods.

How can we do better?