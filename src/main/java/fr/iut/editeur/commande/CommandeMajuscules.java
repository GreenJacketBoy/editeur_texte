package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import static java.lang.Integer.parseInt;


public class CommandeMajuscules extends CommandeDocument {

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacermaj;fin;début");
            return;
        }
        this.document.majuscules(parseInt(parameters[1]), parseInt(parameters[2]));
        super.executer();
    }

}
