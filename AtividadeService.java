import service.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Classe de serviço para Atividade
@Service
public class AtividadeService {
    private final Map<Integer, Atividade> atividades = new HashMap<>();
    private int proximoId = 1;

    public void incluir(Atividade atividade) {
        atividade.setIdAtividade(proximoId++);
        atividades.put(atividade.getIdAtividade(), atividade);
    }

}
