package com.example;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class KeyGenerator {
    private static final String PATH = "encoder/src/main/java/com/example/KeyFile";
    private String[] ruLetters = {"й", "ц", "у", "к", "е", "н", "г",
                                 "ш", "щ", "з", "х", "ф", "ы", "в",
                                 "а", "п", "р", "о", "л", "д", "ж",
                                 "э", "я", "ч", "с", "м", "и", "т",
                                 "ь", "б", "ю", "ъ", "ё", ",", ".", 
                                 "'",  " "};
    
    private ArrayList<String> enLeterArray = new ArrayList<>(53);
    private String[] symbols = {"Q", "q", "W", "w", "e", "E", "R",
                                "r", "T", "t", "Y", "y", "U", "u",
                                "a", "p", "P", "o", "O", "i", "I",
                                "s", "d", "f", "g", "h", "j", "k", 
                                "v", "b", "n", "m", ";", "l",
                                "c", "z", "Z", "X", "C", "V", "B", 
                                "x", "H", "J", "K", "L", "M", "N",
                                "A", "S", "D", "F", "G"};

    private String leter;
    private Random rand = new Random();

    private File keyFileDir = new File(PATH);
    private File keyFile = new File(PATH +"/Key.txt");

    private String content;

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
            try {
                Path path = Paths.get(PATH + "/Key.txt");
                content = Files.readString(path);
            } catch (IOException e) {
                System.out.println("ошибка чтения файла");
            }
            System.out.println(content);
            if (content == "") {
                System.out.println("генерация ключа");
                for (int i = 0; i < symbols.length; i++){ //если это кто-то читает, просьба не задовать вопросов по определёным решениям
                enLeterArray.add(symbols[i]);
                }
                try(FileWriter writer = new FileWriter(PATH + "/Key.txt", false)) {   
                    for (int i = 0; i < ruLetters.length; i++){
                    int randNumber = rand.nextInt(enLeterArray.size());

                    leter = ruLetters[i] + " " + enLeterArray.get(randNumber);
                    enLeterArray.remove(randNumber);

                    writer.write(leter);
                    writer.append('\n');
                    }
                }catch(IOException ex){
             
                System.out.println("ошибка при создании ключа");
                } 
            }
        }
                
            
            
}
    

