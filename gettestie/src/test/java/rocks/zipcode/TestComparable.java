package rocks.zipcode;

import org.junit.Test;

public class TestComparable { // Not sure on this one as well
    @Test
    public void testComparable(){
        Comparable<String> comparable = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };
    }
}
