package za.ac.cput.sayed.Collection;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class VapeCollectionTest {

    @Test
    public void testAdd() {
        ArrayList<Vape> collection = new ArrayList<>();
        VapeServiceCollection service = new VapeServiceCollection(collection);
        Vape vape = new Vape();

        vape.setType("RTA");
        vape.setColor("Blue");
        service.add(vape);
        Assert.assertTrue(collection.contains(vape));
    }

    @Test
    public void testFind() {
        ArrayList<Vape> collection = new ArrayList<>();
        VapeServiceCollection service = new VapeServiceCollection(collection);
        Vape vape = new Vape();

        vape.setType("RTA");
        vape.setColor("Blue");
        service.add(vape);

        Vape foundProduct = service.find("RTA");
        Assert.assertEquals(foundProduct, vape);
        System.out.println(vape.getType());
    }

    @Test
    public void testRemove() {
        ArrayList<Vape> collection = new ArrayList<>();
        VapeServiceCollection service = new VapeServiceCollection(collection);
        Vape vape = new Vape();

        vape.setType("RTA");
        vape.setColor("Blue");
        service.add(vape);

        service.remove(vape);
        Assert.assertFalse(collection.contains(vape));
    }
}
