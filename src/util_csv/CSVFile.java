package util_csv;

import model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFile {

    private String filePath;
    private List<Person> data;
    public CSVFile(String filePath) {
        this.filePath = filePath;
        this.data = readCSVFile();
    }
    private List<Person> readCSVFile() {
        List<Person> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 4) {
                    data.add(new Person(Integer.parseInt(values[0]), values[1], values[2], values[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    public void printCSV() {
        for (Person person : data) {
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
            if (person.getId() == id) {
                System.out.println("Person found:");
                System.out.println(person);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Person with ID " + id + " not found.");
        }
    }
}