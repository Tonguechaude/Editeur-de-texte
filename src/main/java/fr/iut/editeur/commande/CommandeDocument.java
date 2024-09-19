package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    /**
     *
     * @param document
     * @param parameters
     * Simple constructeur appellant la classe mere Commande
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * fonction permettant d'executer une commande
     */
    @Override
    public void executer() {
        this.commandeExecuter();
        System.out.println(this.document);
    }

    /**
     * methode abstraite qui permettra au commande de, s'executer
      */
    public abstract void commandeExecuter ();
}
