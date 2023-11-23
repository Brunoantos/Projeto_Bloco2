import java.util.ArrayList;
import java.util.List;

// Classe Curso
public class Curso {
    private int idCurso;
    private String nome;
    private String descricao;
    private List<MaterialEstudo> materiaisEstudo;
    private List<Usuario> alunosInscritos;

    // Construtor
    public Curso(int idCurso, String nome, String descricao) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.descricao = descricao;
        this.materiaisEstudo = new ArrayList<>();
        this.alunosInscritos = new ArrayList<>();
    }

    // Métodos Getters
    public int getIdCurso() {
        return idCurso;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<MaterialEstudo> getMateriaisEstudo() {
        return materiaisEstudo;
    }

    public List<Usuario> getAlunosInscritos() {
        return alunosInscritos;
    }

    // Métodos Setters
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMateriaisEstudo(List<MaterialEstudo> materiaisEstudo) {
        this.materiaisEstudo = materiaisEstudo;
    }

    public void setAlunosInscritos(List<Usuario> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    // Método para adicionar um aluno inscrito
    public void adicionarAluno(Usuario aluno) {
        alunosInscritos.add(aluno);
    }
}
