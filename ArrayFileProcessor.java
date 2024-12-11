import java.io.*;

public class ArrayFileProcessor {
    public static void main(String[] args) {
        String inputFileName = "question.txt";
        String outputFileName = "answer.txt";

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            System.out.println("Starting the program...");

            // Check if the input file exists
            File inputFile = new File(inputFileName);
            if (!inputFile.exists()) {
                System.err.println("Input file does not exist: " + inputFileName);
                return;
            }

            // Read the question from the input file
            System.out.println("Attempting to read the input file: " + inputFileName);
            reader = new BufferedReader(new FileReader(inputFileName));
            String question = reader.readLine();
            System.out.println("Question read from file: " + question);

            // Example: Array problem - Sum of first 10 elements
            System.out.println("Initializing the array...");
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            int sum = 0;
            System.out.println("Starting sum calculation for the first 10 elements...");
            for (int i = 0; i < 10 && i < array.length; i++) {
                System.out.println("Adding array[" + i + "] = " + array[i] + " to sum.");
                sum += array[i];
            }
            System.out.println("Sum calculation complete. Sum = " + sum);

            // Write the answer to the output file
            System.out.println("Attempting to write the answer to the output file: " + outputFileName);
            writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write("Question: " + question + "\n");
            writer.write("Answer: The sum of the first 10 elements is: " + sum);

            System.out.println("Output file closed. Answer written successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Input file closed.");
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }

        System.out.println("Program execution completed.");
    }
}