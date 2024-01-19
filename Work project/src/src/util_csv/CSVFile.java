@@ -7,6 +7,7 @@
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFile {

@@ -16,7 +17,6 @@ public CSVFile(String filePath) {
        this.filePath = filePath;
        this.data = readCSVFile();
    }

    private List<Person> readCSVFile() {
        List<Person> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
@@ -37,7 +37,17 @@ public void printCSV() {
            System.out.println(person);
        }
    }

    public static void searchCSV(CSVFile csvFile) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID to search: ");
        while(scanner.hasNextInt() == false) {
            System.out.println("Error - please re-enter a valid integer value: ");
            scanner.nextLine();     // Advances this scanner past the current line and returns the input that was skipped.
        }
        int searchId = scanner.nextInt();
        csvFile.searchPerson(searchId);
        scanner.close();
    }
    public void searchPerson(int id) {
        boolean found = false;
        for (Person person : data) {
