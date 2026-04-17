# 📌 Features Documentation

## 1. Add Student
- Allows user to enter student details:
  - Name
  - Age
  - Grade
  - Student ID
  - Contact
- Validates:
  - Age must be a positive number
  - Grade must be between 0 and 100
- Stores data in ArrayList

---

## 2. View All Students
- Displays all student records in a tabular format
- Uses formatted output for better readability
- Shows:
  - Name | Age | Grade | Student ID | Contact

---

## 3. Update Student
- Updates student details using Student ID
- Allows modification of:
  - Name
  - Age
  - Grade
  - Contact
- Includes validation and error handling

---

## 4. Delete Student
- Deletes a student record using Student ID
- Uses Iterator for safe removal
- Displays confirmation message after deletion

---

## 5. Search Student

### 🔍 Search by ID
- Finds exact match using Student ID

### 🔍 Search by Name
- Case-insensitive search using student name

- Displays matching student details in formatted form

---

## 6. Input Validation
- Ensures:
  - Age > 0
  - Grade between 0 and 100
- Throws appropriate error messages for invalid data

---

## 7. Error Handling
- Handles invalid inputs using try-catch
- Prevents program crash due to:
  - Wrong data types
  - Invalid values

---

## 8. Data Storage
- Uses ArrayList for dynamic data storage
- Allows flexible addition and deletion of records

---

## 9. User-Friendly Interface
- Menu-driven console interface
- Clear instructions and feedback messages
- Easy navigation between options