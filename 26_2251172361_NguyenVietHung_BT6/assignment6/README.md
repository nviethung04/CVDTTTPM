# Assignment 6

## Overview
This project implements a simple product management system using the Mediator design pattern. It includes different types of products and their respective adapters to facilitate interaction between them.

## Project Structure
```
assignment6
├── src
│   ├── Client.java
│   ├── mediator
│   │   ├── Mediator.java
│   │   └── ProductMediator.java
│   ├── product
│   │   ├── Product.java
│   │   ├── MayTinh.java
│   │   ├── Laptop.java
│   │   ├── MayTinhAdapter.java
│   │   └── LaptopAdapter.java
└── README.md
```

## Files Description
- **Client.java**: Contains the main class that initializes product instances and demonstrates their functionality.
- **Mediator.java**: Defines the interface for the mediator, which facilitates communication between different product types.
- **ProductMediator.java**: Implements the Mediator interface to manage interactions between product objects.
- **Product.java**: An interface that all product types must implement.
- **MayTinh.java**: Represents a specific product type, `MayTinh`.
- **Laptop.java**: Represents another specific product type, `Laptop`.
- **MayTinhAdapter.java**: Adapts the `MayTinh` class to be used as a `Product`.
- **LaptopAdapter.java**: Adapts the `Laptop` class to be used as a `Product`.

## Setup and Usage
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files using a Java compiler.
4. Run the `Client` class to see the product management system in action.

## Requirements
- Java Development Kit (JDK) installed on your machine.
- A suitable IDE or text editor for Java development.

## License
This project is licensed under the MIT License.