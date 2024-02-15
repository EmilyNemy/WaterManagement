import org.watermanagement.WaterAllotment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WaterAllotmentTest {
  @Test
  public void testGetAmountForTwoBedRoom(){
    WaterAllotment testInstance = new WaterAllotment();
    double actual = testInstance.calculateStandardCost(2,1, 2);
    Assertions.assertEquals(1200, actual, 0.001);
  }

  @Test
  public void testGetAmountForThreeBedRoom(){
    WaterAllotment testInstance = new WaterAllotment();
    double actual = testInstance.calculateStandardCost(3, 2, 3);
    Assertions.assertEquals(1950, actual, 0.001);
  }

  @Test
  public void testThrowExceptionWhenApartmentTypeIsInvalid(){
    WaterAllotment testInstance = new WaterAllotment();
    Throwable exception = assertThrows(IllegalArgumentException.class,
        () -> testInstance.calculateStandardCost(4, 2, 3));
    Assertions.assertEquals("There is something strange in the input", exception.getMessage());
  }

  @Test
  public void testCalculateTotalCost(){
    double actual = new WaterAllotment().calculateTotalCost(3, 1, 5, 10);
    Assertions.assertEquals(13625, actual, 0.001 );
  }

  @Test
  public void testCalculateTotalCostWithNoGuests(){
    double actual = new WaterAllotment().calculateTotalCost(2, 1, 2, 0);
    Assertions.assertEquals(1200, actual, 0.001 );
  }


  @Test
  public void testTotalWaterConsumedFor2BedRoom(){
    double actual = new WaterAllotment().getTotalWaterConsumed(2, 10);
    Assertions.assertEquals(3900, actual, 0.001 );
  }

  @Test
  public void testTotalWaterConsumedFor3BedRoom(){
    double actual = new WaterAllotment().getTotalWaterConsumed(3, 10);
    Assertions.assertEquals(4500, actual, 0.001 );
  }

  @Test
  public void testTotalWaterConsumedForNoBedRoom(){
    WaterAllotment testInstance = new WaterAllotment();
    Throwable exception = assertThrows(IllegalArgumentException.class,
        () -> testInstance.getTotalWaterConsumed(4, 10));
    Assertions.assertEquals("There is something strange in the input", exception.getMessage());

  }

}
