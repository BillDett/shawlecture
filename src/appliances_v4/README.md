# Appliances V4

Overriding the default base class method is the right approach when the implementation for our sub-class needs to differ from the base class.

Your automation is working well now but you have a new requirement. You'd like to be able to easily set the temperature of all of your appliances at the same time. Since they all have a setTemp() method, one approach is to just call that method individually on each object instance. But what if we had dozens or even hundreds of appliances that needed their temperature set at the same time? How could we write the least amount of code to do this and still guarantee that any applicance with the setTemp() method could be called?

We need to create a 'contract' for appliances that set temperature- these are called Interfaces in Java.