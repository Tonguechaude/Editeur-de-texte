package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {

    /**
     *
     * @param document
     * @param parameters
     * Simple constructeur appellant la classe mere CommandeDocument
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * commande permettant ajouter des lignes
     */
    @Override
    public void commandeExecuter() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
    }
}
