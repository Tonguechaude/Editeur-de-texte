package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }

        try{
            int debut = Integer.parseInt(parameters[1]);
            int fin = Integer.parseInt(parameters[2]);

            if (debut < 0 || fin < 0 || debut > fin ) {
                System.err.println("Indices invalides");
                return;
            }

            this.document.effacer(debut, fin);
            super.executer();
        } catch (NumberFormatException e) {
            System.err.println("Les indices doivents être des entiers");
        }
    }






}
