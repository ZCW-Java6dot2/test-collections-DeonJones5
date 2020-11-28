package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    @Test

    public void testHashSet1(){
        HashSet<String> hashing = new HashSet<>();
        hashing.add("Yes");
        hashing.add("No");
        hashing.add("Maybe");

        Assert.assertTrue("No", hashing.contains("No"));

    }

    @Test
    public void testHashSet2() {
        HashSet<String> hashing = new HashSet<>();
        hashing.add("Yes");
        hashing.add("No");
        hashing.add("Maybe");
        hashing.clear();

        Assert.assertTrue("Maybe", hashing.isEmpty());

    }
}
