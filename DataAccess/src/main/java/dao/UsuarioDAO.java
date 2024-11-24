package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import interfaces.IUsuarioDAO;
import models.Usuario;
import org.bson.Document;

/**
 *
 * @author Kevin
 */
public class UsuarioDAO implements IUsuarioDAO{
    
    private final MongoCollection<Document> collection;

    public UsuarioDAO(MongoDatabase database) {
        this.collection = database.getCollection("usuarios");
    }

    @Override
    public void insertar(Usuario usuario) {
        Document usuarioDoc = new Document("_id", usuario.getId())
                .append("nombre", usuario.getNombre())
                .append("apellido", usuario.getApellido())
                .append("correo", usuario.getCorreo())
                .append("contraseña", usuario.getContraseña())
                .append("imagenPath", usuario.getImagenPath());
        collection.insertOne(usuarioDoc);
    }
}
