/ Classe de serviço para Administracao
@Service
public class AdministracaoService {
    private Map<Integer, Administracao> administracoes = new HashMap<>();
    private int proximoId = 1;

    public void incluir(Administracao administracao) {
        administracoes.put(proximoId++, administracao);
    }

    public List<Administracao> obterLista() {
        return new ArrayList<>(administracoes.values());
    }
}

