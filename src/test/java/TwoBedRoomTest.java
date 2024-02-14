import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.watermanagement.ThreeBedRoom;
import org.watermanagement.TwoBedRoom;

public class TwoBedRoomTest {
  @Test
  public void testGetWaterConsumedForTwoBedRoom(){
    int actual = new TwoBedRoom().getWaterConsumed(2);
    Assertions.assertEquals(1500, actual );
  }

  @Test
  public void testGetWaterConsumedForTwoBedRoomWithNoGuests(){
    int actual = new TwoBedRoom().getWaterConsumed(0);
    Assertions.assertEquals(900, actual );
  }
}
