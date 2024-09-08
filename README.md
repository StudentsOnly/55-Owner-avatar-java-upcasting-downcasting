## Exercise: Upcasting and Downcasting - Vehicle Hierarchy

#### Objective:

- Practice upcasting and downcasting in Java by creating a program that models a vehicle hierarchy.

#### Description:

- Create a set of classes representing different types of vehicles and their characteristics, and then use upcasting and downcasting to access specific features of these vehicles.

#### Instructions:

#### Vehicle Hierarchy:

- Create a base class called Vehicle with common attributes shared by all vehicles (e.g., brand, model, year).
- Create two subclasses, Car and Motorcycle, representing specific types of vehicles.
- Add unique attributes to each subclass.
- Implement a method in the Vehicle class called startEngine() that prints a message indicating the vehicle is starting.

#### Upcasting:

- In the main method, create instances of both Car and Motorcycle objects.
- Use upcasting to assign these objects to references of the Vehicle class.
- Call the startEngine() method for each vehicle to simulate starting the engine.

#### Downcasting:

- Use downcasting to access the specific attributes and behaviors of Car and Motorcycle objects.
- For example, if you upcast a Car object to a Vehicle reference, downcast it back to a Car reference and access the numberOfDoors attribute.
