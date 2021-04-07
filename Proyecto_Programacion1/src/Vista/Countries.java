
package Vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Countries {
    private String url;
    private int count;
    private int sCode;

    public static void main(String[] args) {
       
        PrintCountries();
        
    }
    
    public Countries() {
        this.url = "";
        this.count = 0;
        this.sCode = 0;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }
    
    public static void PrintCountries () /*throws MalformedURLException, IOException*/{
        try{
        URL url = new URL ("https://restcountries.eu/rest/v1/all");
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())); 
        
        String str, responsestring="";
        
        while ((str=in.readLine())!=null){
            
            responsestring+= str +"\n";
            
        }
        System.out.println(responsestring);
        }catch(Exception e){
            
        }
            
    }
    
}
