package za.ac.cput.sayed.Set;

import java.util.HashSet;
import java.util.Set;

public class AnimalFormSet  {
    private Set<Animal> set;

    public AnimalFormSet(){

        set= new HashSet<Animal>(){};
    }

    public AnimalFormSet(Set<Animal> set){

        this.set = set;

    }

    public void add(Animal animal){

        set.add(animal);

    }

    public Animal find(String name){

        for(Animal animal: set){
            if (animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }

    public void remove(Animal animal){
        set.remove(animal);
    }

}