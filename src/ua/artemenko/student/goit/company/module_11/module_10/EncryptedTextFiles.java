package ua.artemenko.student.goit.company.module_11.module_10;

import ua.artemenko.student.goit.company.module_09.processData.EncryptString;

import java.io.*;
import java.util.ArrayList;

public class EncryptedTextFiles {

    private File file;
    private ArrayList<String> text = new ArrayList<>();
    private BufferedReader textInput = new BufferedReader(new InputStreamReader(System.in));

    public EncryptedTextFiles(String path) {
        try {
            if(path.equals(""))
            {
                throw new IllegalArgumentException();
            }
            file = new File(path);
        } catch (NullPointerException|IllegalArgumentException e) {
            System.out.println("INVALID PATH");
            System.out.println("the file will be used: test.txt");
            file = new File("test.txt");
        }
    }

    public File getFile() {
        return file;
    }

    /*
    // add text in the file
    */
    public void addText(boolean flagRewrite){
        fileEditing(inputText(),flagRewrite);
    }

    /*
    // input text in the console
    */
    private ArrayList<String> inputText(){
        ArrayList<String> result = new ArrayList<>();
        try{
            System.out.println("enter a line of text");
            System.out.println("enter <<exit>> for finish");
            while (true) {
                String s = textInput.readLine();
                result.add(s);
                if (s.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
    public void closeStream(){
        try {
            textInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    // encryption, editing and writing text to the file
    */
    private void fileEditing(ArrayList<String> textEdit, boolean replaceText) {

        textEdit = encryptString(textEdit,true);
        if (replaceText) {
            text = textEdit;
        } else {
            text.addAll(textEdit);
        }
        writeInFile();
    }

    /*
    // encrypting,decrypting
    */
    private ArrayList<String> encryptString(ArrayList<String> textCrypt,boolean flag) {
        for (int i = 0; i < textCrypt.size(); i++) {
            if (textCrypt.get(i).equals("exit")) {
                break;
            }
            if (textCrypt.get(i) != null) {
                textCrypt.set(i, EncryptString.encryptString(textCrypt.get(i), flag) + "\n");
            }
        }
        return textCrypt;
    }

    /*
    // write in the file
    */
    private void writeInFile() {
        try (Writer wr = new BufferedWriter(new FileWriter(file))) {

            for (int i = 0; i < text.size(); i++) {
                if (text.get(i).equals("exit")) {
                    continue;
                }
                wr.write(text.get(i));
                wr.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    // read from the file
    */
    public ArrayList<String> readFromFile() {
        ArrayList<String> textRead = new ArrayList<>();
        try (BufferedReader rd = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = rd.readLine()) != null) {
                textRead.add(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return encryptString(textRead,false);
    }

    /*
    // show the contents of the file
    */
    public void showInConsole(){
        ArrayList<String> text = readFromFile();
        for (String help:text){
            System.out.print(help);
        }
    }
}

