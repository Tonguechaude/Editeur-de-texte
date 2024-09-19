package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    /**
     *
     * @param document
     * @param parameters
     * Simple constructeur appellant la classe mere CommandeDocument
     */
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * implementation de la methode abstraite permettant d'executer une commande
     */
    @Override
    public void commandeExecuter() {
        if(parameters.length != 3) {
            System.err.println("Format attendu : inserer;début;texte");
            return;
        }
        try {
            int debut = Integer.parseInt(parameters[1]);

            this.document.inserer(debut, parameters[2]);
        } catch (NumberFormatException e) {
            System.err.println("Les indices doivent être des entiens");
        }
    }

}
