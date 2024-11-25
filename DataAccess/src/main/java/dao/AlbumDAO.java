/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import interfaces.IAlbumDAO;
import models.Album;
import org.bson.Document;

/**
 *
 * @author martinez
 */
public class AlbumDAO implements IAlbumDAO{
    private final MongoCollection<Document> collection;

    public AlbumDAO(MongoDatabase database) {
        this.collection = database.getCollection("albumes");
    }
    
    @Override
    public void insertar(Album album){
        Document albumDAO = new Document("_id", album.getId())
                .append("nombre", album.getNombre())
                .append("fechaLanzamiento", album.getFechaLanzamiento())
                .append("genero", album.getGenero())
                .append("portadaPath", album.getPortadaPath())
                .append("canciones", album.getCanciones());
        collection.insertOne(albumDAO);
    }
}
