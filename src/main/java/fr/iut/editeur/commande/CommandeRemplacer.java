package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    /**
     *
     * @param document
     * @param parameters
     * Simple constructeur appellant la classe mere CommandeDocument
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * implementation d'une methode permettant d'executer les commandes
     */
    @Override
    public void commandeExecuter() {
        if(parameters.length < 3 || parameters.length > 4) {
            System.err.println("Format attendu : remplacer;début;fin[,chaîne]");
            return;
        }
        try {
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);
            String remplacement = parameters.length == 4 ? parameters[3] : "";

            if (debut < 0 || fin < 0) {
                System.err.println("Les indices ne peuvent pas êtres négatifs");
                return;
            }

            this.document.remplacer(debut, fin, remplacement);
        } catch (NumberFormatException e) {
            System.err.println("Les indices doivent être des entiens");
        }
    }

}
