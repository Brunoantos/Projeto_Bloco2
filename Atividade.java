// Classe Atividade
public class Atividade {
    private int idAtividade;
    private String titulo;
    private String descricao;
    private String dataLimite;
    private Curso cursoRelacionado;

    // Construtor
    public Atividade(int idAtividade, String titulo, String descricao, String dataLimite, Curso cursoRelacionado) {
        this.idAtividade = idAtividade;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.cursoRelacionado = cursoRelacionado;
    }

    // Métodos Getters
    public int getIdAtividade() {
        return idAtividade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataLimite() {
        return dataLimite;
    }

    public Curso getCursoRelacionado() {
        return cursoRelacionado;
    }

    // Métodos Setters
    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }

    public void setCursoRelacionado(Curso cursoRelacionado) {
        this.cursoRelacionado = cursoRelacionado;
    }
}

