# Java Mediator Project

This project implements the Mediator design pattern to facilitate communication between different product instances. It includes a main application that initializes the mediator and creates instances of various products.

## Project Structure

```
java-mediator-project
├── src
│   ├── Main.java
│   ├── mediator
│   │   ├── Mediator.java
│   │   └── ProductMediator.java
│   ├── product
│   │   ├── Product.java
│   │   ├── MayTinh.java
│   │   └── LapTop.java
```

## Description of Files

- **src/Main.java**: Contains the main method to run the application. It initializes the mediator and creates instances of products.
- **src/mediator/Mediator.java**: Defines the Mediator interface for communication between products.
- **src/mediator/ProductMediator.java**: Implements the Mediator interface to manage interactions between different product instances.
- **src/product/Product.java**: An abstract class that defines common properties and methods for all products.
- **src/product/MayTinh.java**: Represents a specific type of product, a computer, with its own properties and methods.
- **src/product/LapTop.java**: Represents another specific type of product, a laptop, with its own properties and methods.

## How to Run

1. Ensure you have Java installed on your machine.
2. Navigate to the project directory.
3. Compile the Java files using the command:
   ```
   javac src/*.java src/mediator/*.java src/product/*.java
   ```
4. Run the application using the command:
   ```
   java src/Main
   ```

## License

This project is licensed under the MIT License.