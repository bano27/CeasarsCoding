package CeasarsCoding;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    //tests decryption of a message with a shit of 1

    @Test
    public void testDecryptWithShift1() {
        App classUnderTest = new App();

        //int shift = 1;
        String message = "Ifmmp Xpsme";
        String expectedDecryptMessage = "Hello World";
        String actualDecryptMessage = Decrypt.decrypt(message, 1);

        assertEquals(expectedDecryptMessage, actualDecryptMessage);

    }

    //tests decryption of a message with a shift of 6

    @Test public void testDecryptWithShift6() {
        App classUnderTest = new App();

        //int shift = 6;
        String message = "Nkrru Cuxrj";
        String expectedDecryptMessage = "Hello World";
        String actualDecryptMessage = Decrypt.decrypt(message, 6);

        assertEquals(expectedDecryptMessage, actualDecryptMessage);

    }

    //tests decryption of a message with a shift of 10

    @Test public void testDecryptWithShift10() {
        App classUnderTest = new App();

        //int shift = 10;
        String message = "Rovvy Gybvn";
        String expectedDecryptMessage = "Hello World";
        String actualDecryptMessage = Decrypt.decrypt(message, 10);

        assertEquals(expectedDecryptMessage, actualDecryptMessage);

    }
}