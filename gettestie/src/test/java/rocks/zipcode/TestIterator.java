package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestIterator { // Not sure about this one
    @Test
    public void testIterator1() {
        ListIterator<String> iterator = new ListIterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public String previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(String s) {

            }

            @Override
            public void add(String s) {

            }
        };


    }
}
