package za.ac.cput.sayed.Map;

import java.util.HashMap;
import java.util.Map;

public class AnimalFormMap {private Map<Integer,Animal> map;

    public AnimalFormMap(){

        map= new HashMap<>();
    }

    public AnimalFormMap(Map<Integer,Animal> map){

        this.map = map;

    }

    public void add(int size, Animal animal){


        map.put(size,animal);
    }

    public Animal find(int size){

        return map.get(size);
    }

    public void remove(int size){

        map.remove(size);
    }
}