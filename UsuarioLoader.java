import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioLoader {

    public static List<Usuario> carregarUsuarios(String caminhoArquivo) {
        List<Usuario> usuarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int idUsuario = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String email = dados[2];
                String senha = dados[3];
                boolean isAdmin = Boolean.parseBoolean(dados[4]);

                Usuario usuario = new Usuario(idUsuario, nome, email, senha);
                usuario.setAdmin(isAdmin);
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}
