package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    @Test
    public void testPriorityQueue1(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(34);
        priorityQueue.poll();

        Assert.assertTrue("12", priorityQueue.offer(12));

    }

    @Test
    public void testPriorityQueue2(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(34);
        priorityQueue.poll();

        Assert.assertEquals(3, priorityQueue.size());

    }
    @Test
    public void testPriorityQueue3(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(34);

        Assert.assertEquals((Integer) 1, priorityQueue.peek());

    }
}
