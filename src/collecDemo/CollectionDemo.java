package collecDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<Object> obj = new ArrayList<>();

		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println(obj);

		Collection<Object> obj1 = new ArrayList<>();

		System.out.println(obj1);

		obj1.addAll(obj);

		obj1.add(40);

		System.out.println(obj1);

		// obj.clear();

		System.out.println(obj);

		boolean contain = obj1.contains(30);

		System.out.println(contain);

		boolean equal = obj.equals(obj1);

		System.out.println(equal);

		Integer hash = obj.hashCode();

		System.out.println(hash);

		Integer hash1 = obj1.hashCode();

		System.out.println(hash1);

		boolean equal1 = hash1.equals(hash);

		System.out.println(equal1);

		Integer size = obj.size();

		System.out.println(size);

		Iterator<Object> it = obj1.iterator();
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
