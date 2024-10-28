package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

public class CollectionOpr {

	public Collection<Object> setColl() {
		Collection<Object> coll = new ArrayList<>(); 
		
		coll.add(new Integer(100));
		coll.add(new Double(3.14));
		coll.add(new Long(21L));
		coll.add(new Short("100"));
		coll.add(new Double(5.1));
		coll.add("Kitty");
		coll.add(new Integer(100));
		coll.add(new Object());
		coll.add("Snoopy");
		coll.add(new BigInteger("1000"));
		
		return coll;
	}
	
	public void printColl(List<Object> coll) {
		// print by Iterator
		System.out.println("============print by Iterator=============");
		
		Iterator<Object> collIt = coll.iterator();
		while (collIt.hasNext()) {
			System.out.println(collIt.next());
		}
		System.out.println();
		
		// print by for loop
		System.out.println("============print by for loop=============");
		
		for (int i = 0; i < coll.size(); i++) {
//			Object obj = coll.get(i);
			System.out.println(coll.get(i));
		}
		System.out.println();
		
		// print by for-each
		System.out.println("============print by for-each=============");
		
		for (Object obj : coll) {
			System.out.println(obj);
		}
	}
	
	public List<Object> removeNum(List<Object> coll) {
		Iterator it = coll.iterator();
		while (it.hasNext()) {
			Object ele = it.next();
			if (! (ele instanceof Number)) {
				it.remove();
			}
		}
		
		
//		for (Object obj : coll) {
//			if (!(obj instanceof Number)) {
//				coll.remove(obj);
//			}
//		}
//		ConcurrentModificationException
		
		return coll;
		
	}
	
	
	public static void main(String[] args) {
		CollectionOpr co = new CollectionOpr();
		List<Object> coll = (ArrayList<Object>)co.setColl();
		co.printColl(coll);
		System.out.println("-----------after remove----------");
		co.removeNum(coll);
		co.printColl(coll);
	}
	
}
