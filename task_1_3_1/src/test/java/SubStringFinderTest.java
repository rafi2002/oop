
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static r.masud.ccfit.nsu.ru.SubStringFinder.findSubString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SubStringFinderTest {


    @Test
    public void firstTest() {
        String input_file_name = "input.txt";
        String substring = "пирог";

        List<Integer> expected_answer = new ArrayList<>();
        expected_answer.add(7);
        expected_answer.add(32);

        List<Integer> received_answer = findSubString(input_file_name, substring);

        if (received_answer.size() == expected_answer.size()) {
            for (int i=0; i<received_answer.size(); ++i) {
                assertEquals(received_answer.get(i), expected_answer.get(i));
            }
        }
        else {
            throw new AssertionError("test not passed!");
        }

    }

}
