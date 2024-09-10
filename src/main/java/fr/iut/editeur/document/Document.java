package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscule(int debut, int fin){
        if (debut < 0 || fin > texte.length() || debut > fin) {
            System.err.println("Indices invalides");
            return;
        }
        String partieGauche = texte.substring(0, debut);
        String partieAMettreEnMajuscules = texte.substring(debut, fin + 1);
        String partieDroite = texte.substring(fin + 1);

        String partieEnMajuscules = partieAMettreEnMajuscules.toUpperCase();

        texte = partieGauche + partieEnMajuscules + partieDroite;
    }

    public void effacer (int debut, int fin){
        if (debut < 0 || fin > texte.length() || debut > fin) {
            System.err.println("Indices invalides");
            return;
        }
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + partieDroite;
    }

    public void clear() {
        this.texte = "";
    }

}
