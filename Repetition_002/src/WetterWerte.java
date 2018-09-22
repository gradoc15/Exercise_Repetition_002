
import java.time.LocalDateTime;
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
public abstract class WetterWerte
{
    private int temperatur;
    private int luftfeuchtigkeit;
    private LocalDateTime zeitpunkt;
    
    public WetterWerte(int temperatur, int luftfeuchtigkeit) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        zeitpunkt = LocalDateTime.now();
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
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("ee.MM - h:m:s");
        return String.format("%s - %d° - %d%s",zeitpunkt.format(dtf),temperatur,luftfeuchtigkeit,"%"); 
    }
}
