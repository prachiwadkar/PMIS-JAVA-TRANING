
package interfaces;

import java.io.*;

public class InputOutput_ThrowsExceptions {

    static void readsFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File opened");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readsFile();
        } catch (IOException e) {
            System.out.println("Could not find the file");
        }
    }
}
