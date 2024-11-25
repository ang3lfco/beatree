package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import interfaces.IArtistaDAO;
import models.Artista;
import org.bson.Document;
/**
 *
 * @author Kevin
 */
public class ArtistaDAO implements IArtistaDAO{
    private final MongoCollection<Document> collection;

    public ArtistaDAO(MongoDatabase database) {
        this.collection = database.getCollection("artistas");
    }
    
    
    public void insertat(Artista artista) {
            Document artistaDoc = new Document("_id", artista.getId())
                .append("nombre", artista.getNombre())
                .append("tipo", artista.getTipo())
                .append("imagenPath", artista.getImagenPath())
                .append("genero", artista.getGenero())
                .append("integrantes", artista.getIntegrantes());
        collection.insertOne(artistaDoc);
    }
}
