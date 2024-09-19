package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {

    /**
     *
     * @param document
     * @param parameters
     * Simple constructeur appellant la classe mere CommandeDocument
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * commande permettant d'effacer tout le texte
     */
    @Override
    public void commandeExecuter() {
        if (parameters.length != 1) {
            System.err.println("Format attendu : clear");
            return;
        }

        this.document.clear();
    }
}
