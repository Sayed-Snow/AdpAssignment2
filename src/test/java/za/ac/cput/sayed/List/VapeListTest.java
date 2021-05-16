package za.ac.cput.sayed.List;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class VapeListTest {

    @Test
    public void testAdd() {
        ArrayList<Vape> list = new ArrayList<>();
        VapeServiceList service = new VapeServiceList(list);
        Vape vape = new Vape();

        vape.setType("RTA");
        vape.setColor("Blue");
        service.add(vape);

        Assert.assertTrue(list.contains(vape));
    }

    @Test
    public void testFind() {
        ArrayList<Vape> list = new ArrayList<>();
        VapeServiceList service = new VapeServiceList(list);
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
        ArrayList<Vape> list = new ArrayList<>();
        VapeServiceList service = new VapeServiceList(list);
        Vape vape = new Vape();

        vape.setType("RTA");
        vape.setColor("Blue");
        service.add(vape);

        service.remove(vape);
        Assert.assertFalse(list.contains(vape));
    }
}