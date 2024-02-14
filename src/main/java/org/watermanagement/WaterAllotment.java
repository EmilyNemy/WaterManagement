package org.watermanagement;

public class WaterAllotment {
  public double calculateStandardCost(int apartmentType,int corporationRatio, int borewellRatio) {
    if(apartmentType == 2){
      return getStandardAmount(corporationRatio, borewellRatio, 900);
    }else if (apartmentType == 3) {
      return getStandardAmount(corporationRatio, borewellRatio, 1500);
    }else{
      throw new IllegalArgumentException("There is something strange in the input");
    }
  }

  private static double getStandardAmount(int corporationRatio, int borewellRatio, int waterAlloted) {
    int denominator = corporationRatio + borewellRatio;
    double corpFraction = (double) corporationRatio / denominator;
    double borewellFraction = (double) borewellRatio /denominator;

    double amountForCorp = corpFraction * waterAlloted * 1.0;
    double amountForBore = borewellFraction * waterAlloted * 1.5;

    return amountForCorp + amountForBore;
  }
}
