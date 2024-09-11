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

    /**
     * remplace de debut jusqu'à fin par remplacement
     * @param debut
     * @param fin
     * @param remplacement
     */

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * met en majuscule le contenu de debut jusqu'à fin
     * @param debut
     * @param fin
     */

    public void majuscules(int debut, int fin) {
        //TO-DO!
        String partieGauche = texte.substring(0, debut);
        String partieMillieu = texte.substring(debut, fin);
        String partieDroite = texte.substring(fin + 1);

        texte = partieGauche + partieMillieu.toUpperCase() + partieDroite;
    }

    /**
     * efface le contenu de la pharse hde debut jusqu'à fin
     * @param debut
     * @param fin
     */

    public void effacer(int debut, int fin) {
        //TO-DO!
        String partieGauche = texte.substring(0, debut);
//        String partieMillieu = texte.substring(debut, fin);
        String partieDroite = texte.substring(fin + 1);

        texte = partieGauche + partieDroite;
    }

    public void clear() {
        //TO-DO!

        texte = "AAAAHHHH UN BUG !!!!!!!!!!!!!!";
    }

}
