package ua.artemenko.student.goit.company.module_10;


public class MainIO {
    public static void main(String[] args) {
        EncryptedTextFiles encrypText = encrypText = new EncryptedTextFiles("encoded.txt");
        encrypText.addText(true);
        encrypText.showInConsole();
        encrypText.addText(false);
        encrypText.showInConsole();
    }
}