package fr.ynov.java.medium;

import java.io.*;

public class WritingFile {
    public static void main(String[] args) {
        String inputFilePath = "src/resources/input.txt";
        String outputFilePath = "src/resources/output.txt";

        transferContent(inputFilePath, outputFilePath);

        System.out.println("File transfer completed successfully!");
    }



    private static void transferContent(String inputPath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Content transferred from " + inputPath + " to " + outputPath);
        } catch (IOException e) {
            System.err.println("Error during file transfer: " + e.getMessage());
            e.printStackTrace();
        }
    }
}