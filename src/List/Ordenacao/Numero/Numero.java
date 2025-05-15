package List.Ordenacao.Numero;

public class Numero implements Comparable <Numero> {
    private int num;

    public Numero(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(num, n.getNum());
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "num=" + num +
                '}';
    }
}
