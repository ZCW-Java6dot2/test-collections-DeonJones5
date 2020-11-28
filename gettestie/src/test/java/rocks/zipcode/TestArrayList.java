package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    @Test
    public void testArrayList(){
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("2404 Twist Lane");
        newArr.add("2000 Pennsylvania Ave");
        newArr.add("2835 West 6th Street");

        Assert.assertTrue("2404 Twist Lane", newArr.contains("2404 Twist Lane"));

    }
    @Test
    public void testArrayList2() {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("2404 Twist Lane");
        newArr.add("2000 Pennsylvania Ave");
        newArr.add("2835 West 6th Street");

        Assert.assertFalse("2000 Pennsylvania Ave", newArr.isEmpty());
    }



}
