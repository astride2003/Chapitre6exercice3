import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class compteurDeMots {
    public static void main(String[]args){
        try {


            File monFichier = new File("texte.txt");
             Scanner lecteur = new Scanner(monFichier);
             int totalMots = 0;
             while (lecteur.hasNextLine()){
                 String ligne = lecteur.nextLine();
                 String[] mot = ligne.trim().split("\\s+");
                 totalMots = totalMots + mot.length;
             }
             System.out.println("Le nombre total de mots dans le fichier est: "+ totalMots);
        } catch (FileNotFoundException e) {
            System.out.println("Erreur ! le fichier est introuvable: ");
        }
    }
}
