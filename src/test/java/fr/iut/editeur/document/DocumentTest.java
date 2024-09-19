package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import fr.iut.editeur.document.Document;
import fr.iut.editeur.commande.CommandeAjouter;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testMethode() {

    }

    private Document document;
    private CommandeAjouter commandeAjouter;

    @BeforeEach
    public void setUp() {
        document = new Document();
        String[] arguments = {"ajouter;", "Test"};
        commandeAjouter = new CommandeAjouter(document, arguments);
    }

    @Test
    public void testAjoutTexte() {
        commandeAjouter.executer();
        assertEquals("Test", document.getTexte(), "Le texte doit être correctement ajouté.");
    }


}