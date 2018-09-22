
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class WetterWerte
{
    private int temperatur;
    private int luftfeuchtigkeit;
    private LocalDateTime zeitpunkt;
    
    public WetterWerte(int temperatur, int luftfeuchtigkeit) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        zeitpunkt = LocalDateTime.now();
    }

    public WetterWerte(String line) {
        String[] parts = line.split(";");
        String[] Dateparts = parts[0].split("898");

        //Date

        int day;
        
        if(Dateparts[0].length() < 4)
            day = Integer.parseInt(""+Dateparts[0].charAt(0));
        else
        {
            day = Integer.parseInt(Dateparts[0].substring(0,2));
            System.out.println(Dateparts[0].substring(0,2));
        }
        
        
        zeitpunkt = LocalDateTime.of(0 ,Integer.parseInt(Dateparts[0].substring(2)),day
                , Integer.parseInt(Dateparts[1].substring(0,2))
                , Integer.parseInt(Dateparts[1].substring(2,4)), Integer.parseInt(Dateparts[1].substring(4,6)));
        
        //Temp
        temperatur = Integer.parseInt(parts[1]);
        
        //LF
        luftfeuchtigkeit = Integer.parseInt(parts[2]);
        
        
    }
    
    

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(int luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public LocalDateTime getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(LocalDateTime zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }
    
    @Override
    public String toString()
    {
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("d.MM - h:m:k");
        return String.format("%s - %d° - %d%s",zeitpunkt.format(dtf),temperatur,luftfeuchtigkeit,"%"); 
    }
}
