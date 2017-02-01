
public class InterfaceExampleClass {
	InterfaceExample listener = null;
	
	public InterfaceExampleClass() {
	}
	
	public void setOnListener(InterfaceExample listener)
	{
		this.listener = listener;
	}
	
	public void click()
	{
		broadcast();
	}
	
	public void broadcast()
	{
		if(this.listener != null)
			this.listener.test();
	}
	

}
