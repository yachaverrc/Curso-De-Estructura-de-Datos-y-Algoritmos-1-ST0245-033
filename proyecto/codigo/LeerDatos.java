import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeerDatos{
  private int columnas = 0;
  private int filas = 0;

  public void leer(){

    ArrayList<String> datos = new ArrayList<String>();
    Path filePath = Paths.get("5_train_balanced_57765.csv");
    try {
      BufferedReader br = Files.newBufferedReader(filePath);
      String linea;
      while((linea = br.readLine()) !=null){
          filas++;
          String[] datosDeLinea = linea.split(";");
          ArrayList<String> datosTemporal = new ArrayList<String>();
          for(int i = 0; i < datosDeLinea.length; i++){
              datosTemporal.add(datosDeLinea[i]);
          }
          for(int i = 0; i < datosTemporal.size(); i++){
              datos.add(datosDeLinea[i]);
          }

      }
    }catch (IOException e){
        e.printStackTrace();
    }
      //System.out.println(datos.get(0));

      for(int i = 0; i <= datos.size();i++){

        if ((datos.get(i)).equals("exito")) {
            columnas++;
            break;
          } else {
            columnas++;
            //System.out.println(datos.get(i));
          }
      }
       System.out.println(columnas);
       System.out.println(filas);

      String matrizDatos[][] = new String[filas][columnas];
      int contador = 0;
      for(int i = 0; i < filas; i++){
        for(int j = 0; j < columnas; j++){
          matrizDatos[i][j] = datos.get(contador);
          contador++;
        }
      }

     /* for(int i = 0; i < filas; i++){
        for(int j = 0; j < columnas; j++){
          System.out.print(matrizDatos[i][j]+" ");

        }
        System.out.println();
      }*/

  }
}
