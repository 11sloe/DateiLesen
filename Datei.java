import java.io.*;

public class Datei
{
    public void dateiLesen(String dateiname)
    {
        File datei = new File(dateiname);  
       
        try{
            BufferedReader reader = new BufferedReader(new FileReader(datei));
            
            String zeile = reader.readLine();
            
            while(zeile != null)
            {
                System.out.println(zeile);
                zeile = reader.readLine();
            }
            
            reader.close();
        }catch(Exception ex)
        {
            System.out.println("Konnte die Datei nicht lesen");
            ex.printStackTrace();
        }
   
    }

}