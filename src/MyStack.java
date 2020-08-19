import java.util.ArrayList;

public class MyStack {

	private ArrayList<Integer> stack;
	
	public ArrayList<Integer> getStack() {
		return stack;
	}

	public MyStack ()
	{
		stack = new ArrayList<Integer>();
	}
	
	public void push(int value)
	{
		stack.add(value);
	}
	
	public int pop() 
	{
//		if(!stack.isEmpty())
		return stack.remove(stack.size()-1);
//		else return -1;
	}
	
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	
}
