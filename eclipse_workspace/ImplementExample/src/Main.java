
public class Main{
	
	static InterfaceExample listener = new InterfaceExample() {
		
		@Override
		public void test2() {

		}
		
		@Override
		public void test() {
			System.out.println("Ŭ�� �Ǿ���");
		}
	};
	
	public static void main(String[] args)
	{
		InterfaceExampleClass exam = new InterfaceExampleClass();
		exam.setOnListener(listener);
		exam.click();
	}

}
