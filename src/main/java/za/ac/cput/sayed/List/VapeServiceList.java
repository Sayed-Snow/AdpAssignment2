package za.ac.cput.sayed.List;

import java.util.ArrayList;
import java.util.List;

public class VapeServiceList {

    private List<Vape> list;

    public VapeServiceList(){
        list = new ArrayList<Vape>(){};
    }

    public VapeServiceList(List<Vape>list){
        this.list = list;
    }

    public void add(Vape vape){
        list.add(vape);
    }

    public Vape find(String vapeType){
        for(Vape vape: list){
            if (vape.getType().equals(vapeType)){
                return vape;
            }
        }
        return null;
    }

    public void remove(Vape vape){
        list.remove(vape);
    }
}
