
package Clases;

import Vista.Principal;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;


public class Capacidad {
//    Atributos
    public Object nombre;
    private long poblacion;
    private int contador;
    private String condicion;

    public Capacidad() {
        this.nombre = "";
        this.contador = 0;
        this.poblacion = 0;
        this.condicion = "";
    }
    
    
    public String getNombre() {
        return (String) nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }
    
    public long Capacidad_personas(String pais) throws IOException{
        
        Countries paises = new Countries();
        
        JSONArray array = paises.Get_Countries();
        
        JSONObject object =null;
        
        
        Object rowData[] = new Object[2];
        
        if (array!=null){
            
            for (int i = 0; i < array.length(); i++) {
                
                
                object = array.getJSONObject(i);
                
                
                rowData[0]= object.getString("name");
                
                if(rowData[0].equals(pais)){
                    
                    rowData[1]= object.getLong("population");
                
//                Calculo del cupo permitido por pais
                
                poblacion = (long) ((long)rowData[1] * 0.000001);
                }
            }
        }
        return poblacion;
    }
    
    public int Cantidad_listadas(String pais){
        int fila = 0;
        Principal prin = new Principal();
        DefaultTableModel model = (DefaultTableModel) prin.TablaDatos.getModel();
//        model!=null
        for (int i = 0; i < model.getRowCount(); i++) {
            
            nombre = (String)prin.TablaDatos.getValueAt(fila,7);
            condicion = (String) prin.TablaDatos.getValueAt(fila,13);
            
            if(nombre.equals(pais)&&condicion.equals("Activo")){
                contador++;
            }
            fila++;
            
        }
    return contador;
    }
}