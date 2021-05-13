import org.junit.jupiter.api.*;

public class MainTest {
    @Test
    public void test_Given_WeWantMessage_When_WeGetMessage_Then_MessageSouldBeHello(){
        //arrange
        //act
        String actual = Main.GetMessage();

        //assert
        Assertions.assertEquals("Hello", actual);

    }
}
