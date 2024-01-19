import util_csv.CSVFile;

public class ProgramMain {
    public static void main(String[] args) {
        CSVFile csvFile = new CSVFile("C:\\Users\\meire\\IdeaProjects\\fit_john_roche_task_5\\src\\data\\data.csv");
        csvFile.printCSV();
        CSVFile.searchCSV(csvFile);
    }
}