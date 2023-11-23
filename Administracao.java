import java.util.ArrayList;
import java.util.List;

// Classe Administracao
public class Administracao {
    private List<String> registrosAtividades;
    private List<Usuario> usuariosCadastrados;
    private List<Curso> cursosDisponiveis;
    private List<Atividade> atividadesAgendadas;

    // Construtor
    public Administracao() {
        this.registrosAtividades = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
        this.cursosDisponiveis = new ArrayList<>();
        this.atividadesAgendadas = new ArrayList<>();
    }

    // Métodos Getters
    public List<String> getRegistrosAtividades() {
        return registrosAtividades;
    }

    public List<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public List<Curso> getCursosDisponiveis() {
        return cursosDisponiveis;
    }

    public List<Atividade> getAtividadesAgendadas() {
        return atividadesAgendadas;
    }

    // Métodos Setters
    public void setRegistrosAtividades(List<String> registrosAtividades) {
        this.registrosAtividades = registrosAtividades;
    }

    public void setUsuariosCadastrados(List<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public void setCursosDisponiveis(List<Curso> cursosDisponiveis) {
        this.cursosDisponiveis = cursosDisponiveis;
    }

    public void setAtividadesAgendadas(List<Atividade> atividadesAgendadas) {
        this.atividadesAgendadas = atividadesAgendadas;
    }


    // Método para adicionar um curso disponível
    public void adicionarCursoDisponivel(Curso curso) {
        cursosDisponiveis.add(curso);
    }

    // Método para agendar uma atividade
    public void agendarAtividade(Atividade atividade) {
        atividadesAgendadas.add(atividade);
    }
}