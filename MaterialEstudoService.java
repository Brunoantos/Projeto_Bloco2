// Classe de serviço para MaterialEstudo
@Service
public class MaterialEstudoService {
    private Map<Integer, MaterialEstudo> materiaisEstudo = new HashMap<>();
    private int proximoId = 1;

    public void incluir(MaterialEstudo materialEstudo) {
        materialEstudo.setIdMaterial(proximoId++);
        materiaisEstudo.put(materialEstudo.getIdMaterial(), materialEstudo);
    }

    public List<MaterialEstudo> obterLista() {
        return new ArrayList<>(materiaisEstudo.values());
    }
}
