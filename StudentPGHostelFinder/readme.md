# Student PG Finder

**Student PG Finder** is a JavaFX-based desktop application to help students search for hostels and PG (paying guest) accommodations near their location. The app provides features like logging in, searching hostels based on budget, location, and facilities, and viewing hostel details.

---

## Features

- **Login**: Secure login system for users.  
- **Search Hostels**: Search hostels by location, budget, and facilities.  
- **Hostel Details**: View detailed information about hostels including amenities and pricing.  
- **Responsive UI**: Built with JavaFX, ensuring a smooth user experience.

---

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java 17+** (Recommended)  
- **Maven** (For build management)  
- **JavaFX SDK** (Version 18.0.2 or compatible)  

Ensure that the `JAVA_HOME` and `MAVEN_HOME` environment variables are set correctly.

---

## Installation Instructions

- **Windows**  
  1. Install Java JDK 17+ and set `JAVA_HOME`.  
  2. Download JavaFX SDK and extract.  
  3. In IntelliJ/Eclipse, add the JavaFX SDK `lib` folder as a library.

- **macOS/Linux**  
  1. Install OpenJDK 17+ (`brew install openjdk@17` or package manager).  
  2. Download JavaFX SDK and set `PATH_TO_FX` environment variable to its `lib` folder.  
  3. Add VM options when running:  
     ```
     --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml
     ```

---

## Getting Started

1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/devagrawal-24/student-pg-finder.git
   cd student-pg-finder
