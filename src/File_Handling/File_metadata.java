package File_Handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

public class File_metadata {
    public static void main(String[] args) {
        File f=new File("Diary.txt");
        try {
            BasicFileAttributes attr= Files.readAttributes(f.toPath(),BasicFileAttributes.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
