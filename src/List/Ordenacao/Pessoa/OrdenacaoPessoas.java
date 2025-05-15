package List.Ordenacao.Pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

    public class OrdenacaoPessoas {
        //atributo
        List<Pessoa> pessoaList;

        public OrdenacaoPessoas() {
            this.pessoaList = new ArrayList<>();
        }

    public void adicionarPessoa (String nome, int idade, double altura){
            pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
            List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
            return pessoaPorAltura;
    }

        public static void main(String[] args) {
            OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

            ordenacaoPessoas.adicionarPessoa("Lucas", 20, 1.80);
            ordenacaoPessoas.adicionarPessoa("Pedro", 16, 1.60);
            ordenacaoPessoas.adicionarPessoa("Mateus", 26, 1.89);
            ordenacaoPessoas.adicionarPessoa("Paulo", 35, 1.75);

            System.out.println(ordenacaoPessoas.pessoaList);

            System.out.println(ordenacaoPessoas.ordenarPorIdade());
            System.out.println(ordenacaoPessoas.ordernarPorAltura());
        }

}
