package ua.artemenko.student.goit.company.module_11.module_10;


public class MainIO {
    public static void main(String[] args) {
        EncryptedTextFiles encrypText = new EncryptedTextFiles("encoded.txt");
        try{
//            encrypText.addText(null,true);
//            encrypText.showInConsole();
//            encrypText.addText(null,false);
//            encrypText.showInConsole();
            encrypText.addText("test text",false);
            encrypText.showInConsole();
        }finally {
            encrypText.closeStream();
        }

    }
}