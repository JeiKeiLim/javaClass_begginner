
public class Main{
	
	static InterfaceExample listener = new InterfaceExample() {
		
		@Override
		public void test2() {

		}
		
		@Override
		public void test() {
			System.out.println("클릭 되었음");
		}
	};
	
	public static void main(String[] args)
	{
		InterfaceExampleClass exam = new InterfaceExampleClass();
		exam.setOnListener(listener);
		exam.click();
	}

}
