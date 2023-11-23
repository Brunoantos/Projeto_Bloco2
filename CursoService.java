// Classe de serviço para Curso
@Service
public class CursoService {
    private Map<Integer, Curso> cursos = new HashMap<>();
    private int proximoId = 1;

    public void incluir(Curso curso) {
        curso.setIdCurso(proximoId++);
        cursos.put(curso.getIdCurso(), curso);
    }

    public List<Curso> obterLista() {
        return new ArrayList<>(cursos.values());
    }
}
