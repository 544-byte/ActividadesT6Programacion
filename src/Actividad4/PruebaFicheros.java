package Actividad4;

import java.io.File;
import java.io.FileInputStream;
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
    public static void pruebaFOS(String name) throws IOException{
        new File("./" + name);
        FileOutputStream fos = new FileOutputStream("./" + name);
        String text = "Hola \nque pasa bala";
        for (int i = 0 ; i < text.length(); i++ ){
            fos.write((byte)text.charAt(i));
        }
    }
    public static void pruebaFOS(String dir, String name) throws IOException{
        new File(dir + "/" + dir);
        FileOutputStream fos = new FileOutputStream(dir + "/" + name);
        String text = "Hola \nque pasa bala";
        for (int i = 0 ; i < text.length(); i++ ){
            fos.write((byte)text.charAt(i));
        }
    }
    public static void pruebaFIS(String dir) throws IOException{
        FileInputStream fis;
        if (dir.startsWith("./")) {
            fis = new FileInputStream(dir);
        } else {
            fis = new FileInputStream("./" + dir);
        }
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
