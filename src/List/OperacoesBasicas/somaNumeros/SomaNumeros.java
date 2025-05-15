package List.OperacoesBasicas.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
   private List<NumeroSoma> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new NumeroSoma(numero));
    }

    public int calcularSoma(){
        int resultado = 0;
        if (!numeroList.isEmpty()){
            for (NumeroSoma n : numeroList){
                resultado += n.getNum();
            }
        }
        return resultado;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = numeroList.get(0).getNum();

        if (!numeroList.isEmpty()) {
            for (NumeroSoma n : numeroList) {
                if (n.getNum() > numeroMaior) {
                    numeroMaior = n.getNum();
                }
            }
        }
        return numeroMaior;
    }

    public int encontrarMenorNumero(){
        int numeroMenor = numeroList.get(0).getNum();

        if(!numeroList.isEmpty()){
            for (NumeroSoma n : numeroList){
                if (n.getNum() < numeroMenor){
                    numeroMenor = n.getNum();
                }
            }
        }
        return numeroMenor;
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }
    }



    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(11);


        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());
        System.out.println("numero maior: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Numero menor: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
