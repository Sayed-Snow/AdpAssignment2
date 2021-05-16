package za.ac.cput.sayed.Collection;


import java.util.ArrayList;
import java.util.Collection;

public class VapeServiceCollection {

    private Collection <Vape> collection;

    public VapeServiceCollection(){

        collection = new ArrayList();
    }

    public VapeServiceCollection(ArrayList <Vape> collection){
        this.collection = collection;

    }

    public void add(Vape product){
        collection.add(product);

    }

    public Vape find(String type){
        for(Vape vape: collection){
            if (vape.getType().equals(type)){
                return vape;
            }
        }
        return null;
    }

    public void remove(Vape cus){
        collection.remove(cus);
    }


}
