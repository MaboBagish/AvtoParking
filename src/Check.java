import java.util.AbstractList;
import java.util.List;

public class Check {
    private int chekAvto;
    private List<Integer> vseAvtoNaParkovke = new AbstractList<Integer> ( ) {
        @Override
        public Integer get(int index) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    };

    public Check() {
        this.chekAvto = chekAvto;
        this.vseAvtoNaParkovke = vseAvtoNaParkovke;
    }


    public int getChekAvto() {
        return chekAvto;
    }

    public void setChekAvto(int chekAvto) {
        this.chekAvto = chekAvto;
    }

    public List<Integer> getVseAvtoNaParkovke() {
        return vseAvtoNaParkovke;
    }

    public void setVseAvtoNaParkovke(List<Integer> vseAvtoNaParkovke) {
        this.vseAvtoNaParkovke = vseAvtoNaParkovke;
    }
}