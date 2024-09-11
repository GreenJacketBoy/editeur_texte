package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DocumentTest {

    @Test
    public void testMethode() {

        Document doc = new Document();

        assertEquals("", doc.getTexte());

        doc.setTexte("ab");
        assertEquals("ab", doc.getTexte());

        doc.ajouter("c");
        assertEquals("abc", doc.getTexte());

    }
}
