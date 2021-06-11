package exemploUsoInterface;

import java.util.Comparator;

public class ComparadorIdade implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return pessoa1.getIdade() - pessoa2.getIdade();
    }

}
