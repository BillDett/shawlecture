# Appliances V6

With Inheritance and Interfaces, you can model 'is-a' relationships. A Toaster 'is-a' Appliance as well as a 'TempControls' object. 

For more complex relationships, you need to be able to also model the 'has-a' relationship. To some extent we're already doing this with the attributes of an object (for example Appliance 'has-a' location field). What we want is a way to model these relationships across classes directly. For that we use object references.

Let's say your friend wants to use your software to model his home theater. He wants to be able to have different components within the theater set up differently and he also buys lots of new equipment and needs to swap out new items at any time.

We should use packages here to separate out Appliances by use case. Let's make a 'food' and 'entertainment' sub-package.

HomeTheater now 'has-a' Television and 'has-a' SoundBar. By connecting the SoundBar to the Television, we can make it so that the Television controls the SoundBar volume when it is asked to change its volume.

Object composition helps us structure things- how can we do even better?