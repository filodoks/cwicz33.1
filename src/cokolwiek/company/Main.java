package cokolwiek.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Wywolanie programu: Main katalog");
            return;
        }

        File file = new File(args[0]);
        File[] dirList = file.listFiles();

        if (dirList == null) {
            System.out.println("Brak dostepu do katalogu " + args[0]);
            return;
        }

        int licznik = 0;
        System.out.println("Pliki:");
        for (int i = 0; i < dirList.length; i++) {
            if (dirList[i].isFile()) {
                licznik++;
                System.out.println("[" + licznik + "]" + dirList[i].getName());
            }
        }

        licznik = 0;
        System.out.println("Katalogi: ");
        for (int i = 0; i < dirList.length; i++) {
            if (dirList[i].isDirectory()) {
                licznik++;
                System.out.println("["+ licznik +"]" + dirList[i].getName());
            }
        }
    }
}
