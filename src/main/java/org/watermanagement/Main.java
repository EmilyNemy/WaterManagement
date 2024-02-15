package org.watermanagement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String filePath = "sample_input/input4.txt";

    try {
      processWaterManagement(filePath);
    } catch (FileNotFoundException e) {
      System.out.println("Error: File not found - " + e.getMessage());
      e.printStackTrace();
    }
  }

  private static void processWaterManagement(String filePath) throws FileNotFoundException {
    int apartmentType = 0;
    String ratio = "";
    int corporationRatio = 0;
    int borewellRatio = 0;
    int guests = 0;

    File file = new File(filePath);
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String command = scanner.nextLine();

      if (command.startsWith("ALLOT_WATER")) {
        // Parse allotment command
        String[] parts = command.split(" ");
        apartmentType = Integer.parseInt(parts[1]);
        ratio = parts[2];
        String[] ratioParts = ratio.split(":");
        corporationRatio = Integer.parseInt(ratioParts[0]);
        borewellRatio = Integer.parseInt(ratioParts[1]);
      } else if (command.startsWith("ADD_GUESTS")) {
        // Parse add guests command
        String[] parts = command.split(" ");
        guests += Integer.parseInt(parts[1]);
      } else if (command.startsWith("BILL")) {
        // Calculate total cost and water consumed
        WaterAllotment waterManagement = new WaterAllotment();
        double totalCost = waterManagement.calculateTotalCost(apartmentType, corporationRatio, borewellRatio, guests);
        double totalWaterConsumed = waterManagement.getTotalWaterConsumed(apartmentType, guests);
        System.out.println((int) totalWaterConsumed + " " + (int) totalCost);
      } else {
        // Invalid command
        System.out.println("Invalid command: " + command);
      }
    }
    scanner.close();
  }

}
