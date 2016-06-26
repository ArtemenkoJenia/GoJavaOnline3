package ua.artemenko.student.goit.company.module_09.processData;

public class EncryptString {

    static final int START_IN_UNICODE_BIG_LETTERS = 65;
    static final int END_IN_UNICODE_BIG_LETTERS = 90;
    static final int START_IN_UNICODE_SMALL_LETTERS = 97;
    static final int END_IN_UNICODE_SMALL_LETTERS = 122;
    static private final int ENCRYPTION_KEY = 3;
    static private final int DECRYPTION_KEY = 23;
    static final int COUNT_LETTERS = 26;


    public static void encryptString(StringBuffer str,boolean flag) {
        for (int i = 0; i < str.length(); i++) {
            char help = 0;
            if(flag){
                help = encryptLetter(str.charAt(i),ENCRYPTION_KEY);
                str.setCharAt(i,help);
            }else{
                help = encryptLetter(str.charAt(i),DECRYPTION_KEY);
                str.setCharAt(i,help);
            }
        }
    }

    private static char encryptLetter(char letter,int crypt) {
        if ((letter >= START_IN_UNICODE_BIG_LETTERS) && (letter <= END_IN_UNICODE_BIG_LETTERS)) {
            letter = (char) ((((letter - START_IN_UNICODE_BIG_LETTERS) + crypt) % COUNT_LETTERS) + START_IN_UNICODE_BIG_LETTERS);
        }
        if ((letter >= START_IN_UNICODE_SMALL_LETTERS) && (letter <= END_IN_UNICODE_SMALL_LETTERS)) {
            letter = (char) ((((letter - START_IN_UNICODE_SMALL_LETTERS) + crypt) % COUNT_LETTERS) + START_IN_UNICODE_SMALL_LETTERS);
        }
        return letter;
    }

}
