# Unit Converter Project Report

## Project Overview

**Unit Converter** is a web application designed to help users convert between different measurement units. Users can input values to be converted, select source and target units, and view the converted results. Supported measurement units include length, weight, and temperature, specifically:

- **Length**: millimeters, centimeters, meters, kilometers, inches, feet, yards, miles
- **Weight**: milligrams, grams, kilograms, ounces, pounds
- **Temperature**: Celsius, Fahrenheit, Kelvin

This project provides an easy-to-use interface, allowing users to quickly perform unit conversions to meet various needs in daily life.

## Environment Requirements

- Java 1.8 or higher
- Spring Framework

## Compilation and Running

Ensure that the Java Development Kit (JDK) is installed on your system.

1. Clone the project repository:

   ```bash
   git clone https://github.com/yourusername/UnitConverter.git
   cd UnitConverter
   ```

2. Compile the project using Maven:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access the application in your browser:

   ```
   http://localhost:8080/home
   ```

## Specific Features

- **Input Values to Convert**: Users can enter the values to be converted in an input field.
- **Select Source and Target Units**: Users can choose the units to convert from and to from dropdown menus.
- **View Converted Values**: Users can see the calculated conversion results and take further actions.
- **Support for Converting Various Measurement Units**: Users can convert between different measurement units, including length, weight, and temperature.

## Notes

- All conversion results will be displayed in real time on the page, allowing users to change input values or selected units at any time to obtain new results.
- This project helps users understand the relationships between different units through a simple user interface, making it suitable for everyday use.

