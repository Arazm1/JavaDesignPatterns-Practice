package P5_Singleton_p3.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("P5_Singleton_p3/src/filename.txt"))) {
      bw.write("First line");
      bw.newLine();  // add line break
      bw.write("Second line");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}
