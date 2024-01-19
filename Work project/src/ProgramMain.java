@@ -1,17 +1,9 @@
import java.util.Scanner;
import util_csv.CSVFile;

public class ProgramMain {
    public static void main(String[] args) {
        CSVFile csvFile = new CSVFile("data.csv");
        CSVFile csvFile = new CSVFile("src/data/data.csv");
        csvFile.printCSV();
        searchCSV(csvFile);
    }
    private static void searchCSV(CSVFile csvFile) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID to search: ");
        int searchId = scanner.nextInt();
        csvFile.searchPerson(searchId);
        scanner.close();
        CSVFile.searchCSV(csvFile);
    }
}
