package com.example;

import java.io.File;
import java.io.IOException;

public class KeyGenerator {
    private static final String PATH = "encoder/src/main/java/com/example/KeyFile";
    private String[] ruLetters = {"й", "ц", "у", "к", "е", "н", "г",
                                            "ш", "щ", "з", "х", "ф", "ы", "в",
                                            "а", "п", "р", "о", "л", "д", "ж",
                                            "э", "я", "ч", "с", "м", "и", "т",
                                            "ь", "б", "ю", "ъ", "ё", ",", ".", 
                                            "'", };
    
    private String[] symbols = {"Q", "q", "W", "w", "e", "E", "R",
                                "r", "T", "t", "Y", "y", "U", "u",
                                "a", "p", "P", "o", "O", "i", "I",
                                "s", "d", "f", "g", "h", "j", "k", 
                                "v", "b", "n", "m", "'", ";", "l", 
                                "c", "z", "Z", "X", "C", "V", "B", 
                                "x", "H", "J", "K", "L", "M", "N",
                                "A", "S", "D", "F", "G",  };
                            

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
