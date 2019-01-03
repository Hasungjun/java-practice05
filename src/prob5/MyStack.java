package prob5;



public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
	}

	public void push(String s) {

		if(top>=buffer.length)
		{
			String[] buffer2 = new String[buffer.length];
			
			for(int i =0;i<buffer.length;i++) {
				buffer2[i] = buffer[i];
			}
			buffer = new String[buffer.length+1];
			top = 0;
			for(int i = 0 ;i < buffer2.length;i++) {
				buffer[i] = buffer2[i];
				top++;
			}
			buffer[top] = s;
		}
		else
			buffer[top] = s;
		
		top++;
		
	}

	public String pop() throws MyStackException {
		
		if(isEmpty())
			throw new MyStackException();
			
		
		top--;
		String a = buffer[top];	
		
		if(top==0)
			top=-1;
		
		return a;	
	}

	public boolean isEmpty() {
		return top == -1;
	}
}