package kata.pkg4.Loaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader implements Loader{
    private final File file;

    public FileLoader(File file) {
        this.file = file;
    }
       
    @Override
    public List<String> load(){
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            
            while (true){
                String line = reader.readLine();
                if (line == null) break;
                list.add(line);
            }
        
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado o no existe el fichero a leer.");
        } catch (IOException ex) {
            System.out.println("Se ha producido un error de lectura en el fichero.");
        }
        return list;
    } 
}
