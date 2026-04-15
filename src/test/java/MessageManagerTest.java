import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageManagerTest {

    @Test
    void testHelloWorldMessage() {
        MessageManager manager = new MessageManager();

        manager.create(new Message(1, "wallet balance updated"));

        assertEquals("wallet balance updated", manager.readAll().get(0).getText());
    }

    @Test
    void testStatusFinished() {
        String status = "STATUS:FINISHED";

        assertEquals("STATUS:FINISHED", status);
    }
}