
public class ArbreBinaire implements Iterable<ArbreBinaire> {

    private String etiquette;
    public ArbreBinaire filsGauche;
    public ArbreBinaire filsDroit;

    public ArbreBinaire(String etiquette) {
        this.setEtiquette(etiquette);
    }

    public ArbreBinaire(String etiquette, ArbreBinaire filsGauche){
        this.etiquette = etiquette;
        this.filsGauche = filsGauche;
    }

    public ArbreBinaire(String etiquette, ArbreBinaire filsGauche, ArbreBinaire filsDroit){
        this.etiquette = etiquette;
        this.filsGauche = filsGauche;
        this.filsDroit = filsDroit;
    }


    @Override
    public ArbreBinaireIterator iterator() {
        return new ArbreBinaireIterator(this);
    }

    public String getEtiquette() {
        return etiquette;
    }
    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    public void setFilsGauche(ArbreBinaire filsGauche) {
        this.filsGauche = filsGauche;
    }

    public ArbreBinaire getFilsDroit() {
        return filsDroit;
    }

    public void setFilsDroit(ArbreBinaire filsDroit) {
        this.filsDroit = filsDroit;
    }

    public ArbreBinaire getFilsGauche() {
        return filsGauche;
    }

}
