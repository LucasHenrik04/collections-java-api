package List.Ordenacao.Numero;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Numero> numeroList;

    public OrdenacaoNumero() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> ordemAscendente = new ArrayList<>(numeroList);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> ordemDescendente = new ArrayList<>(numeroList);
        ordemDescendente.sort(Collections.reverseOrder());
        return ordemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(10);
        ordenacaoNumero.adicionarNumero(5);
        ordenacaoNumero.adicionarNumero(11);
        ordenacaoNumero.adicionarNumero(25);

        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println(ordenacaoNumero.ordenarDescendente());
    }
}
