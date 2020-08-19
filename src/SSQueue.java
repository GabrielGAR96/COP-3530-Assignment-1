
public class SSQueue {

	private MyStack stack1;
	private MyStack stack2;
	
	public SSQueue()
	{
		stack1 = new MyStack();
		stack2 = new MyStack();
	}
	
	public void enqueue(int value)
	{
		stack1.push(value);
	}
	
	public int dequeue() 
	{
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.getStack().add(0, stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public void display()
	{
		if(stack2.isEmpty() && stack1.isEmpty()) System.out.println("Stack is empty!");
		else {
			while(!stack2.isEmpty())
			{
				System.out.println("element: " + stack2.pop() );
			}
		}
	}
}
