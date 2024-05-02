package Dependency;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public void createFile() {
        String fileName = "newfile.txt";
        File file = new File(fileName);
        
        String content = "text content";
        try {
            Files.write(file.toPath(), content.getBytes());
        } catch (IOException exception) {
            return;
        }
    }

    public static void main(String[] args) {
        new Main().createFile();
    }
}
