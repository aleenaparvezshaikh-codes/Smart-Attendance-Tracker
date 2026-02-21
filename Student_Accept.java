package Data;

import java.io.*;
import java.util.Scanner;

/**
 * Smart Attendance Tracker with Alerts
 * This class accepts student data, calculates attendance,
 * classifies performance and stores record in CSV file.
 */

class Wrong_data extends Exception {
    Wrong_data(String msg) {
        super(msg);
    }
}

public class Student_Accept {

    Scanner sc = new Scanner(System.in);

    int roll;
    double attended, total_classes;
    double percentage;

    // Accept student details
    public void accept() {
        try {
            System.out.println("Enter the Roll No:");
            roll = sc.nextInt();

            System.out.println("Enter the Total number of classes:");
            total_classes = sc.nextDouble();

            System.out.println("Enter the number of classes attended:");
            attended = sc.nextDouble();

            if (attended > total_classes) {
                throw new Wrong_data("Classes attended cannot be greater than total classes");
            }

        } catch (Wrong_data e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Calculate attendance percentage
    public void calculate() {
        if (total_classes != 0) {
            percentage = (attended / total_classes) * 100;
        } else {
            System.out.println("Total classes cannot be zero.");
        }
    }

    // Display attendance details
    public void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Total Classes: " + total_classes);
        System.out.println("Classes Attended: " + attended);
        System.out.println("Attendance Percentage: " + percentage + "%");
    }

    // Check attendance classification
    public void checking() {
        if (percentage >= 90)
            System.out.println("Attendance Class: Excellent");
        else if (percentage >= 75)
            System.out.println("Attendance Class: Good");
        else if (percentage >= 50)
            System.out.println("Attendance Class: Average");
        else
            System.out.println("Attendance Class: Poor / Not Eligible");
    }

    // Save data to Excel (CSV)
    public void saveToExcel() throws IOException {
        FileWriter fw = new FileWriter("attendance.csv", true);

        fw.write(roll + "," + total_classes + "," + attended + "," + percentage + "\n");

        fw.close();

        System.out.println("Data saved to Excel successfully!");
    }
}
