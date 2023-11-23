// Classe MaterialEstudo
public class MaterialEstudo {
    private int idMaterial;
    private String tipo;
    private String url;

    // Construtor
    public MaterialEstudo(int idMaterial, String tipo, String url) {
        this.idMaterial = idMaterial;
        this.tipo = tipo;
        this.url = url;
    }

    // Métodos Getters
    public int getIdMaterial() {
        return idMaterial;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUrl() {
        return url;
    }

    // Métodos Setters
    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

