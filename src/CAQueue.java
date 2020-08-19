public class CAQueue {
	
	private int rear, front;
	private int size;
	private int arr[];
	
	public int getRear() {
		return rear;
	}

	public int getFront() {
		return front;
	}

	public int getSize() {
		return size;
	}

	public int[] getArr() {
		return arr;
	}

	public CAQueue(int size)
	{
		front = rear = -1;
		this.size = size;
		arr = new int[size];
	}
	
	public void enqueue(int value)
	{
		 if ((front == 0 && rear == size-1) || 
		            (rear == (front-1)%(size-1))) 
		 {
			 return; //list is full
		 }
		 
		 else if(front == -1)
		 {
			 front = rear = 0; 
		     arr[rear] = value; 
		 }
		 else if (rear == size-1 && front != 0) 
		    { 
		        rear = 0; 
		        arr[rear] = value; 
		    }
		 else
		    { 
		        rear++; 
		        arr[rear] = value; 
		    } 
	}
	
	public int dequeue()
	{
		if(front == -1)
		{
			return Integer.MIN_VALUE; //list is empty
		}
		
		int data = arr[front];
		arr[front] = -1;
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else if(front == size-1)
			front = 0;
		else
			front++;
		
		return data;
	}
	
	public void displayQueue()
	{
		if(front == -1)
		{
			System.out.println("List is empty");
			return;
		}
		
		if(rear >= front)
		{
	        for (int i = front; i <= rear; i++) 
	        	System.out.println("Index " + i + ": " + arr[i]);
		}
		else
	    { 
	        for (int i = front; i < size; i++) 
	        	System.out.println("Index " + i + ": " + arr[i]); 
	  
	        for (int i = 0; i <= rear; i++) 
	        	System.out.println("Index " + i + ": " + arr[i]); 
	    } 
	}
}
