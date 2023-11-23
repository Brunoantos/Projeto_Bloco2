import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CursoLoader {

    public static List<Curso> carregarCursos(String caminhoArquivo) {
        List<Curso> cursos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int idCurso = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String descricao = dados[2];

                Curso curso = new Curso(idCurso, nome, descricao);
                cursos.add(curso);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cursos;
    }
}
