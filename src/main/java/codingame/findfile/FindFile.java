package codingame.findfile;

import java.io.File;

public class FindFile {

    static String rechercheFichier(File fichier, String fileName) {
        File[] files = fichier.listFiles();
        for (File fi : files) {
            if (fi.isDirectory()) {
                return rechercheFichier(fi, fileName);
            } else if (fileName.equals(fi.getName())) {
                return fi.getAbsolutePath();
            }
        }
        return null;
    }

    static String locateUniverseFormula() {
        File f = new File("C:\\Users\\J18OO00\\Documents\\Dossier studio\\Dossier Hamza Bouabda");
        if (!f.exists())
            return null;
        return rechercheFichier(f, "dzadazda.txt");
    }

    public static void main(String args[]) {
        System.out.println(locateUniverseFormula());
    }
}
