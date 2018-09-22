
import java.util.ArrayList;
import javax.swing.AbstractListModel;

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
