package za.ac.cput.sayed.Map;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class AnimalTestMap {

    @Test
    public void testAdd() {

        Map<Integer,Animal> map = new HashMap<>();
        AnimalFormMap form = new AnimalFormMap(map);
        Animal animal = new Animal();

        animal.setName("Lucy");
        animal.setWeight(12);
        form.add(1,animal);

        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(animal));
    }

    @Test
    public void testFind() {
        Map<Integer,Animal> map = new HashMap<>();
        AnimalFormMap form = new AnimalFormMap(map);

        Animal animal = new Animal();
        animal.setName("Lucy");
        animal.setWeight(12);
        form.add(1,animal);

        Animal foundAnimal = form.find(1);
        assertEquals(foundAnimal,animal);
        System.out.println(animal.getName());
    }

    @Test
    public void testRemove() {

        Map<Integer,Animal> map = new HashMap<>();
        AnimalFormMap form = new AnimalFormMap(map);
        Animal animal = new Animal();

        animal.setName("Lucy");
        animal.setWeight(12);
        form.add(1,animal);

        form.remove(1);
        assertFalse(map.containsKey(1));
    }
}

