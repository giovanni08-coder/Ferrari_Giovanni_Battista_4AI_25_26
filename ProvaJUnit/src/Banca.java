import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banca implements Serializable {

    public static void Scrivi_binario(List<ContoCorrente> contoCorrentes) throws Exception {
        // Writing to binary file
        //Stream.write(new byte[]{0b00001011, 0x65, 0x07, 0x6C, 0x6F,0x65,0x75});
        OutputStream Stream = new FileOutputStream("data.bin");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
            oos.writeObject(contoCorrentes); // serializza TUTTA la lista
        }

        // ASCII values for "Hello"
        Stream.close();

    }


    public static void Leggi_binario() throws Exception {
        // Reading from a binary file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            List<ContoCorrente> stringhe = (List<ContoCorrente>) ois.readObject(); //oopure puoi mettere: inStream.readObject() ---> down-casting object

            // Stampa per verifica
            for (ContoCorrente s : stringhe) {
                System.out.println(s);
            }

        }

    }

}
