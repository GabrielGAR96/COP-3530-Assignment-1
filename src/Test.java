public class Test {

	public static void main(String[] args) {

		
		CAQueue caq = new CAQueue(0);
		
		SSQueue ssq = new SSQueue();

		ssq.enqueue(1);
		ssq.enqueue(2);
		ssq.enqueue(3);
		ssq.enqueue(4);
		
//		ssq.dequeue();
		
		ssq.display();
		
//		System.out.println("Alternating time for CAQ:");
//		altTimeCAQ(20, caq);
//		altTimeCAQ(50, caq);
//		altTimeCAQ(100, caq);
//		altTimeCAQ(1000, caq);
//		altTimeCAQ(10000, caq);
//		altTimeCAQ(100000, caq);
//		altTimeCAQ(1000000, caq);
//		System.out.println();
//		
//		System.out.println("Alternative time for SSQ:");
//		altTimeSSQ(20, ssq);
//		altTimeSSQ(50, ssq);
//		altTimeSSQ(100, ssq);
//		altTimeSSQ(1000, ssq);
//		altTimeSSQ(10000, ssq);
//		altTimeSSQ(100000, ssq);
//		altTimeSSQ(1000000, ssq);	
//		System.out.println();
//		
//		System.out.println("Random time for CAQ:");
//		randTimeCAQ(20, caq);
//		randTimeCAQ(50, caq);
//		randTimeCAQ(100, caq);
//		randTimeCAQ(1000, caq);
//		randTimeCAQ(10000, caq);
//		randTimeCAQ(100000, caq);
//		randTimeCAQ(1000000, caq);
//		System.out.println();
//		
//		System.out.println("Random time for SSQ:");
//		randTimeSSQ(20, ssq);
//		randTimeSSQ(50, ssq);
//		randTimeSSQ(100, ssq);
//		randTimeSSQ(1000, ssq);
//		randTimeSSQ(10000, ssq);
//		randTimeSSQ(100000, ssq);
//		randTimeSSQ(1000000, ssq);		
		
		
	}
	
	static void altTimeCAQ(int n, CAQueue caq)
	{
		
		caq = new CAQueue(n);
		
		for(int i = 0; i < n; i++)
		{
			caq.enqueue(i);
		}
		
		long startTime = System.nanoTime();

		for (int i = 0; i < n; i++) {
			caq.enqueue(i+n);
			caq.dequeue();
		}
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println(n + ", " + totalTime);
	}
	
	static void altTimeSSQ(int n, SSQueue ssq)
	{
		for (int i = 0; i < n; i++) {
			ssq.enqueue(i);
		}
		
		long startTime = System.nanoTime();

		for (int i = 0; i < n; i++) {
			ssq.enqueue(i+n);
			ssq.dequeue();
		}
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println(n + ", " + totalTime);
	}
	
	static void randTimeCAQ(int n, CAQueue caq)
	{
		caq = new CAQueue(n);
		
		for(int i = 0; i < n; i++)
		{
			caq.enqueue(i);
		}
		
		long startTime = System.nanoTime();

		for (int i = 0; i < n; i++) {
			if(Math.random() < 0.5)
				caq.enqueue(i+n);
			else caq.dequeue();
		}
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println(n + ", " + totalTime);
	}
	
	static void randTimeSSQ(int n, SSQueue ssq)
	{
		for (int i = 0; i < n; i++) {
			ssq.enqueue(i);
		}
		
		long startTime = System.nanoTime();

		for (int i = 0; i < n; i++) {
			if(Math.random() < 0.5)
				ssq.enqueue(i+n); 
			else ssq.dequeue();
		}
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println(n + ", " + totalTime);
	}

}
