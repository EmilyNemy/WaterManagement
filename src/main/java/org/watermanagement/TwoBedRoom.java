package org.watermanagement;

public class TwoBedRoom implements BedRoom{
  private static final int WATER_ALLOTTED = 900;

  public int getWaterConsumed(int numberOfGuests) {
    return WATER_ALLOTTED + (numberOfGuests * LITRES_ALLOTED_PER_GUEST * NUMBER_OF_DAYS_IN_MONTH);
  }
}
