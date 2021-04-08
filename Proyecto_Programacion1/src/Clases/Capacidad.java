
package Clases;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;


public class Capacidad {
//    Atributos
    private Object nombre;
    private String pais;
    private long poblacion;
    private int contador;

    public Capacidad() {
        this.nombre = "";
        this.pais = "";
        this.poblacion = 0;
        this.nombre = 0;
        this.contador = 0;
        
    }

    public String getNombre() {
        return (String) nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }
    
    public long Contador_personas(String pais) throws IOException{
        
        Countries count = new Countries();
        
        JSONArray array = count.Get_Countries();
        
        JSONObject object =null;
        
        if (array!=null){
            
            for (int i = 0; i < array.length(); i++) {
                
                
                object = array.getJSONObject(i);
                long poblacion_maxima = 0;
                
                nombre= object.getString("name");
                
                if(nombre == pais){
                    poblacion = object.getLong("population");
                    poblacion = (long) ((long)poblacion * 0.000001);
                }    
            }

        }
        return poblacion;
    }
    
    
    
}