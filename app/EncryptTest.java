package CeasarsCoding;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void testEncryptWithShift1() {
        App classUnderTest = new App();

        //int shift = 1;
        String message = "Hello World";
        String expectedEncryptMessage = "Ifmmp Xpsme";
        String actualEncryptMessage = Encrypt.encrypt(message, 1);

        assertEquals(expectedEncryptMessage, actualEncryptMessage);

    }

    //tests encryption of a message with shift of 6

    @Test public void testEncryptWithShift6() {
        App classUnderTest = new App();

        //int shift = 6;
        String message = "Hello World";
        String expectedEncryptMessage = "Nkrru Cuxrj";
        String actualEncryptMessage = Encrypt.encrypt(message, 6);

        assertEquals(expectedEncryptMessage, actualEncryptMessage);

    }

    //tests encryption of a message with a shift of 10

    @Test public void testEncryptWithShift10() {
        App classUnderTest = new App();

        //int shift = 10;
        String message = "Hello World";
        String expectedEncryptMessage = "Rovvy Gybvn";
        String actualEncryptMessage = Encrypt.encrypt(message, 10);

        assertEquals(expectedEncryptMessage, actualEncryptMessage);

    }
}