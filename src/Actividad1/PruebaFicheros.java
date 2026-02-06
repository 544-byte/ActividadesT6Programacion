package Actividad1;

import java.io.FileOutputStream;
import java.io.IOException;

public class PruebaFicheros {
    public static void pruebaFOS() throws IOException{
        FileOutputStream fos = new FileOutputStream("./FileTest.bin");
        String text = "Hola \nque pasa bala";
        for (int i = 0 ; i < text.length(); i++ ){
            fos.write((byte)text.charAt(i));
        }
    }

}
