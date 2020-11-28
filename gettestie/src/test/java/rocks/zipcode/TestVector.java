package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {
    @Test
    public void testVector1(){
        Vector<String> vector = new Vector<>();
        vector.add("Delaware");
        vector.add("Georgia");
        vector.add("Florida");
        vector.remove("Georgia");


        Assert.assertEquals(2, vector.size());
    }
}
