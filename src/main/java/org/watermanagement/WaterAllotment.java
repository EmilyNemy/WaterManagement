package org.watermanagement;

public class WaterAllotment {
  public double calculateStandardCost(int corporationRatio, int borewellRatio) {
    int denominator = corporationRatio + borewellRatio;
    double corpFraction = (double) corporationRatio / denominator;
    double borewellFraction = (double) borewellRatio /denominator;

    double amountForCorp = corpFraction * 900 * 1.0;
    double amountForBore = borewellFraction * 900 * 1.5;

    return amountForCorp + amountForBore;
  }
}
