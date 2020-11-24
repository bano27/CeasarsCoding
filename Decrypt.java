package CeasarsCoding;

public class Decrypt {
    public static String decrypt(String message, int shift){
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
                    char indexedLetter = (char)(alphabetLetter-shift);
                    if (indexedLetter<'a'){
                        trialMessage += (char)(alphabetLetter + (26-shift));
                    }
                    else {
                        trialMessage += indexedLetter;
                    }
                }
                else if (Character.isUpperCase(alphabetLetter)){
                    char indexedLetter = (char)(alphabetLetter-shift);
                    if (indexedLetter<'A'){
                        trialMessage += (char)(alphabetLetter + (26-shift));
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
}
