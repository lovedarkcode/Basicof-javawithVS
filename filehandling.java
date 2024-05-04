import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {

    public static void main(String[] args) {
        // File path
        String filePath = "example.txt";

        // Create file
        createFile(filePath);

        // Write to file
        writeToFile(filePath, "Hello, World!");

        // Read from file
        String content = readFromFile(filePath);
        System.out.println("Content of file: " + content);

        // Delete file
        deleteFile(filePath);
    }

    // Method to create a file
    public static void createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to write data to a file
    public static void writeToFile(String filePath, String data) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(data);
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to read data from a file
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(filePath);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return content.toString();
    }

    // Method to delete a file
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
