package com.example;

import java.io.File;
import java.io.IOException;

public class KeyGenerator {
    private static final String PATH = "encoder/src/main/java/com/example/KeyFile";
    private String[] ruLetters = {"й", "ц", "у", "к", "е", "н", "г",
                                            "ш", "щ", "з", "х", "ф", "ы", "в",
                                            "а", "п", "р", "о", "л", "д", "ж",
                                            "э", "я", "ч", "с", "м", "и", "т",
                                            "ь", "б", "ю", "ъ", "ё"};

    private File keyFileDir = new File(PATH);
    private File keyFile = new File(PATH +"/Key.txt");

    public void GeneratorFile(){

            if (!keyFileDir.exists()){
                System.out.println("отсутствует директория с ключём");
                keyFileDir.mkdir();
                System.out.println("директория для ключа создана");
            }
            if (!keyFile.exists()){
                    System.out.println("генерация ключа");
                    try {
                        keyFile.createNewFile();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }



    }
    
}
