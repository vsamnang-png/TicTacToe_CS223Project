TicTacToe_CS223Project

[Tic-Tac-Toe](https://github.com/your-username/TicTacToe_CS223Project)


Tic-Tac-Toe Game developed on Java with JavaFX package by Kibriyo Shomirzoeva and Vattanak Samnan.
This project is a Tic Tac Toe game developed using JavaFX and structured following the MVC (Model–View–Controller) design pattern.
Tic-tac-toe is played on a three-by-three grid by two players, who alternately place the marks X and O in one of the nine spaces in the grid.
Game is played between two players 'X' and 'O'.


<img width="190" height="265" alt="image" src="https://github.com/user-attachments/assets/23922bc0-cbe3-4d2a-9bb3-687fe08bc614" />


'X' starts the game, whichever side gets three figures in a row wins. Below the main window, output displays the winner side.


<img width="160" height="216" alt="image" src="https://github.com/user-attachments/assets/478bbbd3-b78f-40fd-a1a7-b0f480245ac3" />




**Project Structure**

The project consists of the following main components:
* MainApp.java – Application entry point
* GameModel.java – Game logic and data
* GameView.java – User interface
* GameController.java – Game flow and event handling
* pom.xml – Maven configuration file


**MainApp.java**


<img width="261" height="190" alt="image" src="https://github.com/user-attachments/assets/d099a684-38e3-4e52-bee4-5f6cfd7fb7bf" />



**Purpose:**
This class is the entry point of the JavaFX application.
Responsibilities:
* Extends Application
* Initializes the GameModel, GameView, and GameController
* Creates the JavaFX Scene
* Sets the window title and size
* Launches the application


<img width="159" height="220" alt="image" src="https://github.com/user-attachments/assets/e2807a73-1300-4e96-8f71-27cc192ec14e" />


Key Concept:
This class connects all MVC components and starts the UI.


**GameModel.java**


<img width="256" height="197" alt="image" src="https://github.com/user-attachments/assets/7d05f5e2-2f7e-4770-b9be-e4bf16021820" />


**Purpose:**

Handles all game logic and data management.
**Responsibilities:**

* Stores the Tic Tac Toe board using a 3x3 String array
* Tracks the current player (X or O)
* Places player marks on the board
* Switches turns between players
* Checks win conditions (rows, columns, diagonals)
* Detects draw situations
* Resets the game state


  <img width="171" height="233" alt="image" src="https://github.com/user-attachments/assets/ea577f32-4944-4655-959b-a35ef103b59f" />

  
  Key Concept:
  This class does not interact with the UI. It focuses only on logic, ensuring a clean separation of concerns.

**GameView.java**


<img width="282" height="216" alt="image" src="https://github.com/user-attachments/assets/0bcbf290-2572-4139-8ed8-df35a1f11991" />


**Purpose:**
Manages the graphical user interface (GUI) using JavaFX components.
**Responsibilities:**
* Creates a 3×3 grid of buttons for the game board
* Displays the current game status using a label
* Provides a reset button
* Updates button text when a move is made
* Disables the board after a win
* Resets the board for a new game


  <img width="188" height="251" alt="image" src="https://github.com/user-attachments/assets/276ce6e7-248f-49f4-9670-2df513abd2af" />


**UI Components Used:**
* Button
* Label
8 GridPane
* VBox
**Key Concept:**
The view only displays data and UI elements. It does not contain game logic.

**GameController.java**


<img width="296" height="247" alt="image" src="https://github.com/user-attachments/assets/74ee16b4-cad1-4f99-a6f7-c7bc444f2685" />


**Purpose:**
Acts as the bridge between the Model and the View.
**Responsibilities:**
* Handles user interactions (button clicks)
* Updates the model when a move is made
* Updates the view based on game state
* Checks for win or draw after each move
* Switches turns between players
* Handles game reset functionality


<img width="168" height="232" alt="image" src="https://github.com/user-attachments/assets/46abd7c9-929a-43bc-a68a-570296db9f2d" />


Key Concept:
This class controls the game flow and ensures communication between the UI and logic.

**Pom.xml**


<img width="298" height="208" alt="image" src="https://github.com/user-attachments/assets/7bd86712-f190-4d97-9bdd-6bd9948810e0" />


**Purpose:**
Maven configuration file used for project setup and dependency management.
**Key Features:**
* Defines project metadata (groupId, artifactId, version)
* Sets Java compiler version
* Includes JavaFX dependencies:
     * javafx-controls
     * javafx-graphics
* Configures javafx-maven-plugin to run the application.


  <img width="297" height="194" alt="image" src="https://github.com/user-attachments/assets/44115898-ff8c-4548-9d68-e7322bf5bb13" />


**Benefit:**
Allows the project to be built and run easily using Maven commands.

**Design Pattern Used**
**MVC (Model–View–Controller)**
* Model: GameModel
* View: GameView
* Controller: GameController
This structure improves:
* Code organization
* Maintainability
* Separation of concerns
  
**How to Run the Project**

1. Make sure Java 25 and Maven are installed.
2. Open the project in an IDE (IntelliJ IDEA recommended).
Run the project using:
mvn javafx:run
3. or simply run MainApp.java from the IDE.
   
**Features**

Two-player gameplay (X vs O)
Win detection (rows, columns, diagonals)
Draw detection
Reset game functionality
Clean and simple UI

**Conclusion**
This Tic Tac Toe project demonstrates:
* JavaFX UI development
* MVC architecture
* Event-driven programming
* Clean separation of logic and interface
  
It serves as a solid foundation for learning JavaFX and GUI-based application design.



**AI Disclosure**
This project was developed by the developers. Artificial Intelligence (ChatGPT) was used only as a support tool to help with code explanation and README documentation. All implementation, logic, and final decisions were made by the developers.


















