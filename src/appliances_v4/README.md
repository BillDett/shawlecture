# Appliances V4

Overriding the default base class method is the right approach when the implementation for our sub-class needs to differ from the base class.

Your automation is working well now but you have a new requirement. Some of your appliances can be registered with the manufacturer, and this requires that you track the serial number. So we could add this to the base class...but not all Appliances have a serial number. The serial numbers are also very different across manufacturers so internally we might need to represent them differently. How can we add the ability to support a serial number to only some of the sub-classes?

We need to create a 'contract' for appliances that can be registered- these are called Interfaces in Java.