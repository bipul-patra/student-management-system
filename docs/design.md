# 🏗️ System Design - Student Management System

## 📌 Overview
The Student Management System is a console-based Java application designed using Object-Oriented Programming (OOP) principles. It manages student records with operations like add, view, update, delete, and search.

---

## 🧱 Architecture
The system follows a simple layered structure:

- **Presentation Layer**
  - Console-based UI (menu-driven using Scanner)
  
- **Business Logic Layer**
  - Handles operations like add, update, delete, search
  
- **Data Layer**
  - Stores student data using ArrayList

---

## 🧩 Class Design

### 1. Student Class
Represents a student entity.

#### Attributes:
- `name` (String)
- `age` (int)
- `grade` (double)
- `studentId` (String)
- `contact` (String)

#### Methods:
- Getters and Setters
- Validation inside setters:
  - Age must be > 0
  - Grade must be between 0 and 100
- `display()` method for formatted output

---

### 2. StudentManagementSystem Class
Controls application flow and user interaction.

#### Responsibilities:
- Display menu
- Handle user input
- Perform CRUD operations
- Manage student list

#### Data Structure:
- `ArrayList<Student>` used to store student records dynamically

---

## 🔄 Functional Flow

1. User selects an option from menu
2. System processes input
3. Performs operation:
   - Add → Create and store student
   - View → Display all students
   - Update → Modify existing student
   - Delete → Remove student
   - Search → Find student by ID or Name
4. Output displayed in formatted manner

---

## ✅ Validation Rules
- Age must be a positive integer
- Grade must be between 0 and 100
- Input mismatch handled using exception handling

---

## ⚠️ Error Handling
- Uses `try-catch` blocks to handle:
  - Invalid input types (InputMismatchException)
  - Invalid values (IllegalArgumentException)
- Prevents application crash

---

## 📊 Data Handling
- Data stored temporarily using `ArrayList`
- No file/database persistence (runtime only)

---

## 🔮 Future Enhancements
- File handling (save/load data)
- Database integration (MySQL + JDBC)
- GUI implementation (Swing/JavaFX)
- Sorting and filtering options

---

## 📐 (Optional) UML Representation


+----------------------+
| Student |
+----------------------+
| - name |
| - age |
| - grade |
| - studentId |
| - contact |
+----------------------+
| + getters/setters |
| + display() |
+----------------------+

       ↑
+-------------------------------+
| StudentManagementSystem |
+-------------------------------+
| - ArrayList<Student> |
| - Scanner |
+-------------------------------+
| + addStudent() |
| + viewStudents() |
| + updateStudent() |
| + deleteStudent() |
| + searchStudent() |
| + main() |
+-------------------------------+