package Working_Files;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderMain {

    public static void main(String[] args) {

        String path = "C:\\Users\\n" + //
                "obre\\OneDrive\\Área de Trabalho\\ws-udemy\\Working_Files\\in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
