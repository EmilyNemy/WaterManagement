import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.watermanagement.TwoBedRoom;

public class TwoBedRoomTest {
  @Test
  public void testGetWaterConsumedForTwoBedRoom(){
    int actual = new TwoBedRoom().getWaterConsumed(2);
    Assertions.assertEquals(1500, actual );
  }
}
