
/**
 * Main class of Smart Attendance Tracker.
 * Creates object of Student_Accept class
 * and calls required methods.
 */
import Data.Student_Accept;
import java.io.IOException;

public class JPR_ATTENDANCE {
    public static void main(String[] args) throws IOException {

        Student_Accept obj = new Student_Accept();

        try {
            obj.accept();
            obj.calculate();
            obj.display();
            obj.checking();
            obj.saveToExcel();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
