package fr.ynov.java.medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        createFolder();
        createFiles();
        writeFiles();
        readFiles();
    }

    public static void createFolder() {
        String directoryName = "directory";
        String basePath = "src/resources";
        File directory = new File(basePath, directoryName);
        boolean directoryCreated = directory.mkdir();

        if (directoryCreated) {
            System.out.println("Directory created successfully at: " + directory.getAbsolutePath());
        } else {
            System.out.println("Failed to create directory. It may already exist at: " + directory.getAbsolutePath());
        }
    }

    public static void createFiles() {
        String basePath = "src/resources/directory";
        //Add as many files that you want
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt"};

        for (String fileName : fileNames) {
            try {
                File myObj = new File(basePath + File.separator + fileName);
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getAbsolutePath());
                } else {
                    System.out.println("File already exists: " + myObj.getAbsolutePath());
                }
            } catch (Exception e) {
                System.out.println("An error occurred while creating " + fileName);
                e.printStackTrace();
            }
        }
    }

    public static void writeFiles() {
        String basePath = "src/resources/directory";
        File directory = new File(basePath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist: " + basePath);
            return;
        }

        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("No text files found in the directory.");
            return;
        }

        for (File file : files) {
            try (java.io.FileWriter myWriter = new java.io.FileWriter(file)) {
                myWriter.write("Hello World");
                System.out.println("Successfully wrote to the file: " + file.getAbsolutePath());
            } catch (Exception e) {
                System.out.println("An error occurred while writing to " + file.getName());
                e.printStackTrace();
            }
        }
    }

    public static void readFiles() {
        String basePath = "src/resources/directory";
        File directory = new File(basePath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist: " + basePath);
            return;
        }

        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("No text files found in the directory.");
            return;
        }

        System.out.println("\nReading files from " + basePath + ":\n");

        for (File file : files) {
            System.out.println("Contents of: " + file.getName());
            try (Scanner myReader = new Scanner(file)) {
                while (myReader.hasNextLine()) {
                    System.out.println(myReader.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred while reading " + file.getName());
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
