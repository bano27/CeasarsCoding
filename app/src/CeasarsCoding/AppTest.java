/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CeasarsCoding;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testEncryptWithShift1() {
        App classUnderTest = new App();

        int shift = 1;
        String message = "Hello World";
        String expectedResultMessage = "";
        String actualResultMessage = CeasarCipher.encrypt(shift, message);

        assertEquals(expectedResultMessage, actualResultMessage);
        
    }
}
