
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class WetterModell extends AbstractListModel
{
    private ArrayList<WetterWerte> data = new ArrayList();
    
    public void add(WetterWerte ww)
    {
        data.add(ww);
        fireIntervalAdded(data, data.size()-1, data.size()-1);
    }
    
    public void save()
    {
        JFileChooser chooser = new JFileChooser();
        int proof = chooser.showSaveDialog(null);
        
        if(proof == JFileChooser.APPROVE_OPTION)
        {
            File f = chooser.getSelectedFile();
            
            if(!f.getPath().substring(f.getPath().length()-4).equals(".csv"))
            {
                File help = f;
                f = new File(help.getPath()+".csv");
            }
            
            System.out.println(f);
            
            try {
                BufferedWriter br = new BufferedWriter(new FileWriter(f));
                
                for(WetterWerte w: data)
                {
                    long date = 0l;
                    
                    //Day
                    date += w.getZeitpunkt().getDayOfMonth()*Math.pow(10, 11);
                    
                    //Month
                    date += w.getZeitpunkt().getMonthValue()*Math.pow(10, 9);
                    
                    //Delimiter
                    date += 898*Math.pow(10, 6);
                    
                    //Hour
                    date += w.getZeitpunkt().getHour()*Math.pow(10, 4);
                    
                    //Min
                    date += w.getZeitpunkt().getMinute()*Math.pow(10, 2);
                    
                    //Sec
                    date += w.getZeitpunkt().getSecond();
                    
                    System.out.println(date);
                    
                    br.write(date+";"+w.getTemperatur()+";"+w.getLuftfeuchtigkeit());
                    br.newLine();
                }
                br.close();
            } 
            catch (Exception e) {
            }
        }
    }
    
    @Override
    public int getSize()
    {
        return data.size();
    }

    @Override
    public Object getElementAt(int index)
    {
        return data.get(index);
    }
    
}
