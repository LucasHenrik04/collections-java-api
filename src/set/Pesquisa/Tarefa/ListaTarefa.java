package set.Pesquisa.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendente = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isConcluida()){
                tarefasPendente.add(t);
            }
        }
        return tarefasPendente;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarPendente != null){
            if (tarefaParaMarcarPendente.isConcluida()){
                tarefaParaMarcarPendente.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Fazer exercícios físicos");
        listaTarefa.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefa.adicionarTarefa("Ler livro");
        listaTarefa.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefa.exibirTarefas();

        // Removendo uma tarefa
        listaTarefa.removerTarefa("Fazer exercícios físicos");
        listaTarefa.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefa.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefa.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefa.marcarTarefaConcluida("Ler livro");
        listaTarefa.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefa.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefa.marcarTarefaPendente("Estudar Java");
        listaTarefa.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();
    }


}
