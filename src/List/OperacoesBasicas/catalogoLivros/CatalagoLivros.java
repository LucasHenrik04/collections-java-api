package List.OperacoesBasicas.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
        for(Livro l : livroList){
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
        }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("livro 1", "autor 1", 2020);
        catalagoLivros.adicionarLivro("livro 1", "autor 2", 2021);
        catalagoLivros.adicionarLivro("livro 2", "autor 2", 2022);
        catalagoLivros.adicionarLivro("livro 3", "autor 3", 2023);
        catalagoLivros.adicionarLivro("livro 4", "autor 4", 1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAnos(2020, 2023));
        System.out.println(catalagoLivros.pesquisarPorTitulo("livro 1"));
    }
    }



