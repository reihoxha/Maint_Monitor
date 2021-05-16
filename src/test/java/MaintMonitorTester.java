import maintmonitor.controllers.MaintMonitorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaintMonitorTester {
    @Test
    public void test_ResetTest() {
        //arrange
        MaintMonitorController mc= new MaintMonitorController();
        //act
        String testString = mc.getSourcestring();
        //assert
        Assertions.assertEquals("-", testString);
        // testing if the String is there at all

        //arrange
        //act
        String testOverwrite = mc.setStatusGet("test");
        //assert
        Assertions.assertEquals("test", testOverwrite);
        // testing if we can overwrite the String

        //arrange
        //act
        String testReset = mc.resetStatus();
        //assert
        Assertions.assertEquals("-", testReset);
        // testing if we can reset the String




    }
}
