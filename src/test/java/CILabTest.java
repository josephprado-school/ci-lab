import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    @DisplayName("all caps")
    public void detectCapitalUseTest1() {
       myString.setString("THIS IS ALL CAPS");
       assertTrue(myString.detectCapitalUse());
    }
    @Test
    @DisplayName("first letter caps")
    public void detectCapitalUseTest2() {
        myString.setString("First letter is caps");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    @DisplayName("no caps")
    public void detectCapitalUseTest3() {
        myString.setString("no letters are caps");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    @DisplayName("mixed caps")
    public void detectCapitalUseTest4() {
        myString.setString("sOme oF tHeSe aRe cApS");
        assertFalse(myString.detectCapitalUse());
    }


}
