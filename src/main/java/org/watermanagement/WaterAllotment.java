package org.watermanagement;

public class WaterAllotment {
  public double calculateStandardCost(int apartmentType, int corporationRatio, int borewellRatio) {
    if (apartmentType == 2) {
      return getStandardAmount(corporationRatio, borewellRatio, TwoBedRoom.WATER_ALLOTTED);
    } else if (apartmentType == 3) {
      return getStandardAmount(corporationRatio, borewellRatio, ThreeBedRoom.WATER_ALLOTTED);
    } else {
      throw new IllegalArgumentException("There is something strange in the input");
    }
  }

  private static double getStandardAmount(int corporationRatio, int borewellRatio,
      int waterAlloted) {
    int denominator = corporationRatio + borewellRatio;
    double corpFraction = (double) corporationRatio / denominator;
    double borewellFraction = (double) borewellRatio / denominator;

    double amountForCorp = corpFraction * waterAlloted * 1.0;
    double amountForBore = borewellFraction * waterAlloted * 1.5;

    return amountForCorp + amountForBore;
  }

  public double calculateTotalCost(int apartmentType, int corporationRatio, int borewellRatio,
      int numberOfGuests) {

    if (numberOfGuests == 0) {
      return calculateStandardCost(apartmentType, corporationRatio, borewellRatio);
    }
    double standardCost = calculateStandardCost(apartmentType, corporationRatio, borewellRatio);
    double guestLitres = numberOfGuests * BedRoom.LITRES_ALLOTED_PER_GUEST * BedRoom.NUMBER_OF_DAYS_IN_MONTH;
    double costForGuests = tankerWaterCost(guestLitres);
    return standardCost + costForGuests;
  }

  public double tankerWaterCost(double guestLitres) {
    if (guestLitres > 0 && guestLitres <= 500) {
      return guestLitres * 2;
    } else if (guestLitres > 500 && guestLitres <= 1500) {
      double secondSlab = guestLitres - 500;
      return (500 * 2) + (secondSlab * 3);
    } else if (guestLitres > 1500 && guestLitres <= 3000) {
      double thirdSlab = guestLitres - 1500;
      return (500 * 2) + (1000 * 3) + (thirdSlab * 5);
    } else {
      double fourthSlab = guestLitres - 3000;
      return (500 * 2) + (1000 * 3) + (1500 * 5) + (fourthSlab * 8);
    }
  }

  public double getTotalWaterConsumed(int apartmentType, int numberOfGuests) {
    if (apartmentType == 2) {
      return new TwoBedRoom().getWaterConsumed(numberOfGuests);
    } else if (apartmentType == 3) {
      return new ThreeBedRoom().getWaterConsumed(numberOfGuests);
    } else {
      throw new IllegalArgumentException("There is something strange in the input");
    }
  }
}
