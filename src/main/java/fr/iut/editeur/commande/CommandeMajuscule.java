package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    /**
     *
     * @param document
     * @param parameters
     * Simple constructeur appellant la classe mere CommandeDocument
     */
    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * implementation d'une methode permettant d'executer les commandes
     */
    @Override
    public void commandeExecuter()
    {
        if (parameters.length < 3){
            System.err.println("Format attendu : majuscules;debut;fin");
        }

        try {
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);

            if (debut < 0 || fin < 0 || debut > fin){
                System.err.println("Indices invalides.");
                return;
            }

            this.document.majuscule(debut, fin);
        } catch (NumberFormatException e) {
            System.err.println("Les indices doivent être des entiers");
        }
    }
}
