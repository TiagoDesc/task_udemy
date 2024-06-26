package Working_Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) {

        String path = "C:\\Users\\n" + //
                "obre\\OneDrive\\Área de Trabalho\\ws-udemy\\Working_Files\\in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
