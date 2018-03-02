package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoByMukesh {
	
	
	public static void main(String args[]) {
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(950266424);
		obj1.add("karthik old number");
		obj1.add('G');
		obj1.add(007.143);
		
	
		
		/////////By using enhance For Loop
		
		for(Object val:obj1){
			System.out.println("the list is:"+val);
			
		}
		
		
		
		/////By using For Loop
		
		int list=obj1.size();
		
		for(int i=0;i<list;i++){
			System.out.println("The list contains:"+obj1.get(i));
		}
		
		/////BY using Iterator
		
		 Iterator it = obj1.iterator();
		 
		 while(it.hasNext()){
			 Object value = it.next();
			 System.out.println("the values are:"+value);
			 
		 }
		
		
	}

}
