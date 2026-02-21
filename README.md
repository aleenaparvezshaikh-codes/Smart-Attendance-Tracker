# Smart Attendance Tracker with Alerts

**Developed by:** Aleena Parvez Shaikh
## About
This Java project is designed to efficiently track student attendance. It allows the user to enter student details, calculates attendance percentage, classifies performance, and saves the records in a CSV file. The program also handles invalid input and provides alerts for low or incorrect attendance data.  

## Features
- Accepts student data including roll number, total classes, and attended classes.
- Calculates attendance percentage automatically.
- Classifies attendance into categories: Excellent, Good, Average, Poor/Not Eligible.
- Handles wrong or invalid input using custom exceptions.
- Saves all attendance data into a CSV file for easy storage and access.
- Simple and user-friendly console interface.

## Technologies Used
- Java (Core concepts, OOP)
- Exception Handling (Custom Exceptions)
- File Handling (CSV)
- Scanner for input

---

## 🎯 Goal
To provide a simple yet effective tool for managing student attendance and generating performance reports with alerts for low attendance,
useful for teachers and academic administrators.

## How to Use
1. Clone or download this repository.
2. Open in any Java IDE (e.g., Eclipse, IntelliJ) or compile using terminal.
3. Run `JPR_ATTENDANCE.java`.
4. Enter student details as prompted.
5. View attendance percentage and classification.
6. Data is automatically saved in `attendance.csv` in the project directory.

---

## Example Output
Enter the Roll No:
101
Enter the Total number of classes:
50
Enter the number of classes attended:
45

Roll No: 101
Total Classes: 80
Classes Attended: 80
Attendance Percentage: 100.0%
Attendance Class: Excellent
Data saved to Excel successfully!
