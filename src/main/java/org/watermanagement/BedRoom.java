package org.watermanagement;

public interface BedRoom {
  public static final int NUMBER_OF_DAYS_IN_MONTH =30;
  public static final int LITRES_ALLOTED_PER_GUEST = 10;
  int getWaterConsumed(int numberOfGuests);
}
