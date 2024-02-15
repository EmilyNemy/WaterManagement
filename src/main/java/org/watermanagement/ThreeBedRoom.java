package org.watermanagement;

public class ThreeBedRoom implements BedRoom {
  public static final int WATER_ALLOTTED = 1500;

  public int getWaterConsumed(int numberOfGuests) {
    return WATER_ALLOTTED + (numberOfGuests * LITRES_ALLOTED_PER_GUEST * NUMBER_OF_DAYS_IN_MONTH);
  }
}
