
import java.util.Iterator;

public class ArbreBinaireIterator implements Iterator<ArbreBinaire> {

    private ArbreBinaire arbreBinaire;

    public ArbreBinaireIterator(ArbreBinaire arbreBinaire) {
        this.arbreBinaire = arbreBinaire;
    }

    @Override
    public boolean hasNext() {
        if(arbreBinaire.getFilsGauche() != null) {
            return true;
        }
        if(arbreBinaire.getFilsDroit() != null) {
            return true;
        }
        return false;
    }

    @Override
    public ArbreBinaire next() {
        if(arbreBinaire.getFilsGauche() != null) {
            return arbreBinaire.getFilsGauche();
        }
        if(arbreBinaire.getFilsDroit() != null) {
            return arbreBinaire.getFilsDroit();
        }
        return null;

    }

}

