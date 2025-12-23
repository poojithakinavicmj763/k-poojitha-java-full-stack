import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testRegularUser() {
        String input = "20\n300\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        FoodBillDiscount.main(new String[]{});

        String expectedOutput =
                "Enter age: Enter Bill amount: Normal User\nFinal Bill amount:\n300.00";

        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testSeniorCitizenWithCappedDiscount() {
        String input = "65\n5678\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        FoodBillDiscount.main(new String[]{});

        String expectedOutput =
                "Enter age: Enter Bill amount: Senior Citizen\nFinal Bill amount:\n5378.00";

        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
