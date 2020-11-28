package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {
    @Test
    public void testHashMap1(){
        HashMap<String, String> hash = new HashMap<>();
        hash.put("Deon", "Wilmington");

        Assert.assertFalse("302", hash.containsKey("302"));
    }

    @Test
    public void testHashMap2() {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("Deon", "Wilmington");
        hash.put("Jeff", "Malvern");
        hash.put("Shenese", "Brooklyn");

        Assert.assertFalse("Deon", hash.containsKey("Wilmington"));
    }

}
