package test.java.de.hfu;

import org.junit.Test;

public class QueueTest {
	Queue testQueue = new Queue(3);

	@Test(expected = IllegalArgumentException.class)
	public void ConstructorTestError() {
		Queue q = new Queue(0);
	}

	@Test
	public void ConstructorTestNoError() {
		Queue q1 = new Queue(1);
		Queue q2 = new Queue(5);
		Queue q3 = new Queue(1000);
	}

	@Test(expected = IllegalStateException.class)
	public void testDequeueEmptyQueue() {
		testQueue.dequeue();
	}

	@Test
	public void testDequeueFullQueue() {
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);

		testQueue.dequeue();
		testQueue.dequeue();
		testQueue.dequeue();
	}

	@Test
	public void testNormalUse() {
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);
		testQueue.enqueue(4);
		testQueue.enqueue(5);

		testQueue.dequeue();
		testQueue.dequeue();
		testQueue.dequeue();

		testQueue.enqueue(6);
		testQueue.enqueue(7);
	}
}
