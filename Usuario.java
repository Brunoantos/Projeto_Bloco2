import java.util.ArrayList;
import java.util.List;

// Classe Usuário
public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private List<Curso> cursosInscritos;
    private boolean isAdmin;

    // Construtor
    public Usuario(int idUsuario, String nome, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cursosInscritos = new ArrayList<>();
        this.isAdmin = false;
    }

    // Métodos Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    // Métodos Setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    // Método para inscrever em um curso
    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
        curso.adicionarAluno(this);
    }
}
