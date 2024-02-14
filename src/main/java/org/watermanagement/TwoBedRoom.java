package org.watermanagement;

public class TwoBedRoom {
  private static final int WATER_ALLOTTED = 900;
  private static final int LITRES_ALLOTED_PER_GUEST = 10;
  private static final int NUMBER_OF_DAYS_IN_MONTH = 30;

  public int getWaterConsumed(int numberOfGuests) {
    return WATER_ALLOTTED + (numberOfGuests * LITRES_ALLOTED_PER_GUEST * NUMBER_OF_DAYS_IN_MONTH);
  }
}