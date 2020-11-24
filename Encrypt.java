package CeasarsCoding;

public class Encrypt {
    private String message;
    private int shift;
    public static String encrypt(String message, int shift){
    if (shift>26){
        shift = shift%26;
    }
    else if (shift<0){
        shift = (shift%26) + 26;
    }

        String trialMessage = "";

    for (int i = 0; i < message.length(); i++){
        char alphabetLetter = message.charAt(i);
        if (Character.isLetter(alphabetLetter)){
            if (Character.isLowerCase(alphabetLetter)){
                char indexedLetter = (char)(alphabetLetter+shift);
                if (indexedLetter>'z'){
                    trialMessage += (char)(alphabetLetter - (26-shift));
                }
                else {
                    trialMessage += indexedLetter;
                }
            }
            else if (Character.isUpperCase(alphabetLetter)){
                char indexedLetter = (char)(alphabetLetter+shift);
                if (indexedLetter>'Z'){
                    trialMessage += (char)(alphabetLetter - (26-shift));
                }
                else {
                    trialMessage += indexedLetter;
                }
            }
        }
        else {
            trialMessage += alphabetLetter;
        }
    }
    return trialMessage;
    }

    public String getMessage() {
        return message;
    }

    public int getShift() {
        return shift;
    }
}
