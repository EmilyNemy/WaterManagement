import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.watermanagement.ThreeBedRoom;

public class ThreeBedroomTest {
  @Test
  public void testGetWaterConsumedForThreeBedRoom(){
    int actual = new ThreeBedRoom().getWaterConsumed(2);
    Assertions.assertEquals(2100, actual );
  }
}
