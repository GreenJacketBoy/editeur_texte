package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import static java.lang.Integer.parseInt;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;fin;début;texte");
            return;
        }
        String texte = parameters[1];
        this.document.remplacer(parseInt(parameters[1]), parseInt(parameters[2]), parameters[3]);
        super.executer();
    }
}
