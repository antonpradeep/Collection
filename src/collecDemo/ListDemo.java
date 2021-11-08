package collecDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> obj1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

		System.out.println(obj1);

		obj1.add(60);

		obj1.add(3, 35);

		System.out.println(obj1);

		List<Integer> obj2 = new ArrayList<>();

		obj2.addAll(obj1);

		System.out.println(obj2);

		// obj1.clear();

		System.out.println(obj1);

		boolean contain = obj2.containsAll(obj1);

		System.out.println(contain);

		Integer index = obj1.indexOf(30);

		System.out.println(index);

		obj1.set(0, 20);

		System.out.println(obj1);

		Integer Lastindex = obj1.lastIndexOf(20);

		System.out.println(Lastindex);

		for (int i = 0; i < obj1.size(); i++)

		{
			System.out.println(obj1.get(i));
		}
		
		obj1.remove(0);
		
		System.out.println(obj1);
				
		obj1.clear();
		
		boolean empty= obj1.isEmpty();
		
		System.out.println(empty);
		
		boolean c_all=obj2.containsAll(obj1);
		
		System.out.println(c_all);
		
		Integer size=obj2.size();
		
		System.out.println(size);
		
	}

}
