# ClassManager 🧑‍🏫📚

**ClassManager** is a simple, Java-based object-oriented application designed to simulate a basic classroom management system.  
It allows instructors to manage courses, students to enroll in them, and grades to be assigned and displayed.

## 🚀 Features

- Abstract `Person` class (parent to `Student` and `Instructor`)
- Course creation and instructor assignment
- Student course enrollment
- Instructor grade assignment
- Grade tracking and display for each student

## 🧠 Technologies Used

- Java 17+
- IntelliJ IDEA
- Object-Oriented Programming (OOP)

## 📂 Class Overview

| Class       | Description                                                  |
|-------------|--------------------------------------------------------------|
| `Person`    | Abstract base class with `id`, `name`, and `email`           |
| `Student`   | Inherits `Person`, adds student number, course & grade list  |
| `Instructor`| Inherits `Person`, can assign grades and manage courses      |
| `Course`    | Contains course ID, title, and instructor                    |
| `Main`      | Demonstrates usage of all classes in a sample scenario       |

## 🛠 How to Run

1. Clone the repository  
   ```bash
   git clone https://github.com/hildahelin/ClassManager.git
