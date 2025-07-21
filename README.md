# Interplanetary Travel
This repository is a development of a challenge in [DevSenior](https://devseniorcode.com/) where a simulation of a journey to space is made, choosing the planet and a spacecraft, showing the collection until reaching the planet, implemented OOP and MVC to practice this design in its different layers.

## Description
This project simulates a space travel system where users can select destination planets, choose ships, assign passengers and visualize the progress of their paths through a console simulation. It is developed following the MVC pattern (model-view-controller) to maintain a clear and scalable structure.

### Controller
Responsible for managing the flow of the application and coordinating the interaction between the models and the view.
- **[PlanetController](https://github.com/DJAngel973/Interplanetary-Travel/blob/main/src/main/java/co/edu/devsenior/controller/PlanetController.java)** Organize the selection of planets, ships and the simulation of the trip. Valida tickets and communicates results through the ConsoleUI interface
- Manage the main menu and redirect user actions according to the chosen option.

### Model
It contains the business logic, data structures and central functionalities of the system.
- **[Planet](https://github.com/DJAngel973/Interplanetary-Travel/blob/main/src/main/java/co/edu/devsenior/model/Planet.java)** Represents the available planets, including its name and distance in millions of kilometer
- **[Spacecraft](https://github.com/DJAngel973/Interplanetary-Travel/blob/main/src/main/java/co/edu/devsenior/model/Spacecraft.java)** Base class for different ships, with attributes such as speed and passenger capacity.
- **[SpacecraftService](https://github.com/DJAngel973/Interplanetary-Travel/blob/main/src/main/java/co/edu/devsenior/model/SpacecraftService.java)** Administers passenger validations and travel time calculation based on the speed of the ship and distance of the planet
- **[SimulationTripService](https://github.com/DJAngel973/Interplanetary-Travel/blob/main/src/main/java/co/edu/devsenior/model/SimulationTripService.java)** Execute a visual simulation of the path of the path using key loops and messages.

### View
It is responsible for interacting with the user through the console.
- **[ConsoleUi](https://github.com/DJAngel973/Interplanetary-Travel/blob/main/src/main/java/co/edu/devsenior/view/ConsoleUI.java)** Sample menus, request information, and present dynamic messages related to the trip.
- It presents data in friendly format and guide to the user throughout the flow of the program.

## Objective

Practice OOP and MVC for future projects, ti be able to understand what classes correspond to each MVC layer, understand how to apply OOP in each step of the project.


![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Linux](https://img.shields.io/badge/OS-Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)
![VS Code](https://img.shields.io/badge/Editor-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)