import java.util.Scanner;

public class Pendu
{
    public static void main(String []args)
    {

        Scanner clavier = new Scanner(System.in);

        String[] mots_possibles = {"bouteille", "maillot", "anticonstitutionnellement"};
        
        int mot_random =(int) Math.random(mots_possibles.length) * 10;
        String mot_choisi = mots_possibles[mot_random];  
        String bonnes_lettres;
        int nombre_erreurs = 0;

        System.out.println(mot_choisi);  // bug: montre toujours le 1er mot de la liste

        clavier.close();
    }
}