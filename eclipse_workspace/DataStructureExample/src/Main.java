import com.jeikei.data.CircularQueue;

public class Main {
	public static void main(String[] args)
	{
		CircularQueue circularQueue = new CircularQueue(5);
		
		for(int i=0; i<10; i++)
			circularQueue.putData(i);
		
		for(int i=0; i<10; i++)
		{
			System.out.println(circularQueue.getData());
		}
	}
}
