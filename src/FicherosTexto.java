package PruebasFicheros;

import java.io.*;
import java.time.LocalDate;

public class FicherosTexto {
    public static void testFW(String path, String nombreFichero) throws IOException {
        FileWriter fw = new FileWriter(path + nombreFichero + ".txt");
        fw.write("Examen de Programación - 1DAM.\n");
        fw.write("9 de marzo de 2026");
        fw.close();
    }

    public static void testFW(String path, String nombreFichero, String contenido) throws IOException {
        FileWriter fw = new FileWriter(path + nombreFichero + ".txt");
        fw.write(contenido);
        fw.close();
    }

    public static void testFR(String path, String nombreFichero) throws IOException{
        FileReader fr = new FileReader(path + nombreFichero + ".txt");
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();
    }

    public static void testBW(String path, String nombreFichero) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(path + nombreFichero + ".txt"));
        bw.write("Instrumental necesario: \n" +
                "\t-Equipo portátil.\n" +
                "\t-Cable de red RJ-45.\n" +
                "\t-Unidad de almacenamiento externa USB.");
        bw.close();
    }

    public static void testBR(String path, String nombreFichero) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path + nombreFichero + ".txt"));
        String linea;
        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();
    }

    public static String[] testBR(String fichero) throws IOException{
        String [] resultado = new String[3];
        BufferedReader br = new BufferedReader(new FileReader(fichero + ".txt"));
        String linea;
        int i = 0;
        while((linea = br.readLine()) != null){
            if(linea.startsWith("-")) {
                resultado[i] = linea;
                i++;
            }
        }
        br.close();
        return resultado;
    }

    public static void testCAW(String path, String nombreFichero) throws IOException{
        CharArrayWriter caw = new CharArrayWriter();
        caw.write(LocalDate.now().toString());
        FileWriter fw = new FileWriter(path + nombreFichero + ".txt");
        caw.writeTo(fw);
        fw.close();
        caw.close();
    }

    public static void testCAR() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("./ficheros/texto/testCAW.txt"));
        char [] buffer = new char[10];
        br.read(buffer);
        CharArrayReader car = new CharArrayReader(buffer);
        int i;
        while((i = car.read()) != -1){
            System.out.print((char)i);
        }
        car.close();
        br.close();
    }

    public static void testPrint(String opcion) throws IOException{
        PrintWriter pw;
        if(opcion.toLowerCase().equals("pantalla")){
            pw = new PrintWriter(System.out);
            pw.println("Estoy harto de ficheros.");
            pw.close();
        }else{
            pw = new PrintWriter(new FileWriter(opcion + ".txt"));
            pw.println("Estoy harto de ficheros.");
            pw.close();
        }
    }

    //@deprecated
    public static void testLNR() throws IOException{
        FileReader fr = new FileReader("./ficheros/texto/enemy.txt");
        LineNumberReader lnr = new LineNumberReader(fr);
        System.out.println(lnr.getLineNumber() + "-" + lnr.readLine());
        lnr.setLineNumber(9);
        System.out.println(lnr.getLineNumber() + "-" + lnr.readLine());
        lnr.close();
        fr.close();
    }

    public static void lnrCorregido() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("./ficheros/texto/enemy.txt"));
        for(int i = 0; i < 9; i++){
            br.readLine();
        }
        String linea;
        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();
    }

}
