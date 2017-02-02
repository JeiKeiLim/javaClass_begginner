import java.util.HashMap;

import com.jeikei.data.SubjectKey;

public class MainHashMap {
	public static void main(String[] args)
	{
		HashMap<String, Double> dict = new HashMap<>();
		
		
		dict.put(SubjectKey.JAVA, 60.0);
		dict.put(SubjectKey.DATA_STRUCTURE, 20.0);
		dict.put("a", 30.0);
		dict.put("b", 40.0);
		dict.put("fasdfdas", 30.0);
		
		for(String key : dict.keySet())
		{
			System.out.println(key +" : " + dict.get(key));
		}
	}
}
