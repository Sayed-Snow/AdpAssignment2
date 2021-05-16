package za.ac.cput.sayed.Set;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class AnimalTestSet {

    @Test
    public void testAddToSet() {


    Set<Animal> set = new HashSet<>();
    AnimalFormSet form = new AnimalFormSet(set);
    Animal animal = new Animal();
    animal.setName("Lucy");
    form.add(animal);

    Assert.assertTrue(set.contains(animal));


}

    @Test
    public void testFindInSet() {


        Set<Animal> set = new HashSet<>();
        AnimalFormSet form = new AnimalFormSet(set);
        Animal animal = new Animal();
        animal.setName("Lucy");
        form.add(animal);



        Animal foundAnimal = form.find("Lucy");
        Assert.assertEquals(foundAnimal, animal);
        System.out.println(animal.getName());

    }

    @Test
    public void testRemoveFromSet() {

        Set<Animal> set = new HashSet<>();
        AnimalFormSet form = new AnimalFormSet(set);
        Animal animal = new Animal();
        animal.setName("Lucy");
        form.add(animal);


        form.remove(animal);
        Assert.assertFalse(set.contains(animal));

    }
}