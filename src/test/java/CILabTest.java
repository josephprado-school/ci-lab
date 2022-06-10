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
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    @DisplayName("mixed caps")
    public void detectCapitalUseTest4() {
        myString.setString("sOme oF tHeSe aRe cApS");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    @DisplayName("empty string")
    public void detectCapitalUseTest5() {
        myString.setString("");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    @DisplayName("null string")
    public void detectCapitalUseTest6() {
        assertThrows(NullPointerException.class, () -> myString.detectCapitalUse());
    }

    @Test
    @DisplayName("get string")
    public void getStringTest1() {
        myString.setString("Hello");
        assertEquals("Hello", myString.getString());
    }

    @Test
    @DisplayName("get null string")
    public void getStringTest2() {
        assertNull(myString.getString());
    }
}
