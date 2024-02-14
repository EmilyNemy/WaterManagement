import org.watermanagement.WaterAllotment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WaterAllotmentTest {
  @Test
  public void testGetAmountForTwoBedRoom(){
    WaterAllotment testInstance = new WaterAllotment();
    double actual = testInstance.calculateStandardCost(1, 2);
    Assertions.assertEquals(1200, actual, 0.001);
  }
}
