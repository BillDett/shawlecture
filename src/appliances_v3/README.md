# Appliances V3

One approach to solving the duplicate code between Refrigerator and Oven is to create a new base class that has the setTemp() and getTemp() methods. Now the duplicate code is removed and the behavior (e.g. turn on the applicance before setting the temperature) is consistent across any applicance that controls a temperature. We can now easliy add a Toaster appliance as well.

There is one problem, however. The Toaster uses setTemp() internally to turn on the toaster and set the temperature. But with a Toaster you usually set the temperature (or color of your toast) and then turn it on. So the behavior in our base class needs to be adjusted. We have to override the base method to do what we want.