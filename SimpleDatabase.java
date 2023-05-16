import java.io.*;
import java.util.*;

public class SimpleDatabase {
    private static final String METADATA_FILE = "metadata.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Database!");
        while (true) {
            System.out.print("Enter a command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            executeCommand(command);
        }

        scanner.close();
    }

    private static void executeCommand(String command) {
        String[] tokens = command.split("\\s+");

        if (tokens[0].equalsIgnoreCase("create")) {
            if (tokens.length < 4) {
                System.out.println("Invalid create table command!");
                return;
            }
            
            createTable(tokens);
        } else if (tokens[0].equalsIgnoreCase("insert")) {
            if (tokens.length < 4) {
                System.out.println("Invalid insert command!");
                return;
            }
            
            insertData(tokens);
        } else {
            System.out.println("Invalid command!");
        }
    }

    private static void createTable(String[] tokens) {
        try {
            String tableName = tokens[2];

            File metadataFile = new File(METADATA_FILE);
            FileWriter metadataWriter = new FileWriter(metadataFile, true);

            metadataWriter.write(tableName + "\n");

            for (int i = 3; i < tokens.length; i++) {
                metadataWriter.write(tokens[i] + "\n");
            }

            metadataWriter.close();

            System.out.println("Table created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the table.");
            e.printStackTrace();
        }
    }

    private static void insertData(String[] tokens) {
        try {
            String tableName = tokens[2];
            String data = "";

            for (int i = 4; i < tokens.length - 1; i++) {
                data += tokens[i] + ",";
            }

            data += tokens[tokens.length - 1] + "\n";

            File tableFile = new File(tableName + ".txt");
            FileWriter tableWriter = new FileWriter(tableFile, true);

            tableWriter.write(data);

            tableWriter.close();

            System.out.println("Data inserted successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while inserting data.");
            e.printStackTrace();
        }
    }
}


