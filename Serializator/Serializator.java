package Serializator;

import java.io.*;


public class Serializator {

    public static <T> boolean serialize(T obj, String filename) {
        boolean result = false;
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename)
        )) {
            oos.writeObject(obj);
            result = true;
        } catch (IOException e) {
            System.out.println("error");
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
            System.out.println("error");
        }
        return result;
    }

    public static void serializeObject(Object obj, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(obj);
            System.out.println("Objeto serializado y guardado en " + fileName);
        } catch (IOException e) {
            System.out.println("Error al serializar el objeto: " + e.getMessage());
        }
    }

    // Función para deserializar un objeto desde un archivo
    public static Object deserializeObject(String fileName) {
        Object obj = null;
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            obj = objectIn.readObject();
            System.out.println("Objeto deserializado desde " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar el objeto: " + e.getMessage());
        }
        return obj;
    }
}


