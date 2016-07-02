package ua.artemenko.student.goit.company.module_11.module_10;


public class MainIO {
    public static void main(String[] args) {
        EncryptedTextFiles encrypText = new EncryptedTextFiles("encoded.txt");
        try{
            encrypText.addText(true);
            encrypText.showInConsole();
            encrypText.addText(false);
            encrypText.showInConsole();
        }finally {
            encrypText.closeStream();
        }

    }
}