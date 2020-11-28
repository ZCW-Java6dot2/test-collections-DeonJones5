package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {
    @Test
    public void testTreeMap() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Deon", 27);
        treeMap.put("Bill", 20);
        treeMap.put("Jeff", 31);
        treeMap.put("Tim", 43);


        Assert.assertEquals("Bill", treeMap.firstKey());
    }

    @Test
    public void testTreeMap2() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Deon", 27);
        treeMap.put("Bill", 20);
        treeMap.put("Jeff", 31);
        treeMap.put("Tim", 43);

        Assert.assertTrue("27", treeMap.containsKey("Deon"));
    }
}
