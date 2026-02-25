import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Gfg implements Serializable {

    // Drver Class
    // Main Function
    public static void Scrivi_binario() throws Exception {
        List<Persona> stringhe = Arrays.asList(new Persona("franco", "nano", 55), new Persona("franco", "nano", 75), new Persona("franco", "nano", 33), new Persona("franco", "nano", 43));
        // Writing to binary file
        //Stream.write(new byte[]{0b00001011, 0x65, 0x07, 0x6C, 0x6F,0x65,0x75});
        OutputStream Stream = new FileOutputStream("data.bin");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
            oos.writeObject(stringhe); // serializza TUTTA la lista
        }

        // ASCII values for "Hello"
        Stream.close();

    }


    public static void Leggi_binario() throws Exception {
        // Reading from a binary file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            List<Persona> stringhe = (List<Persona>) ois.readObject();

            // Stampa per verifica
            for (Persona s : stringhe) {
                System.out.println(s);
            }

        }

    }
}
