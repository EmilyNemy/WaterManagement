import org.watermanagement.WaterAllotment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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

  //@Test
  //public void testThrowExceptionWhenApartmentTypeIsInvalid(){
  //  WaterAllotment testInstance = new WaterAllotment();
  //  double actual = testInstance.calculateStandardCost(4, 2, 3);
  //  Assertions.assertEquals(1950, actual, 0.001);
  //}
}
