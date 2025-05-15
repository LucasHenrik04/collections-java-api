package List.OperacoesBasicas.somaNumeros;

public class NumeroSoma {

    private int num;

    public NumeroSoma(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "numero{" +
                "num=" + num +
                '}';
    }

}
