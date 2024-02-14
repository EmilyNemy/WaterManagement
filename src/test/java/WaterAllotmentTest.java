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


}
