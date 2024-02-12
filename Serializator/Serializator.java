package Serializator;

import java.io.*;


public class Serializator {
    /**
     * Método que serializa en disco cualquier tipo de archivo serializado
     *
     * @param obj      Debe ser un objeto que implemente la interfaz Serializable
     * @param filename Donde serializar el objeto
     * @param <T>      Tipo de Objeto a serializar
     * @return true si todo ha ido correctamente
     */
    public static <T> boolean serialize(T obj, String filename) {
        boolean result = false;
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename)
        )) {
            oos.writeObject(obj);
            result = true;
        } catch (IOException e) {
        }
        return result;
    }

    public static <T> T desearize(String filename) {
        T result = null;
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename)
        )) {
            result = (T) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return result;
    }
}


