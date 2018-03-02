package SetMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class setHasSet {
	
	public static void main(String[]args){
		
	
		Set<String>values=new LinkedHashSet<>();
		values.add("karthik");
		
		values.add("123");
		
		values.add("patel");
		
		values.add("12.@3");
		values.add("000.@3");
		
		
		 System.out.println(values);
		 
		 for(int i=0;i<values.size();i++){
			 System.out.println(values);
		 }
		 
		/////////////////////////// ////By Using Enhanced for loop//////////////////////////////////////////
		 
		 for(String list:values){
			 System.out.println("now the list is:"+list);
		 }
		 
		 ////BY using Iterator//////////////////////////////////////////
		 
		            Iterator itr = values.iterator();
		            
		            while(itr.hasNext()){
		            	
		            	
		            	Object get = itr.next();
		            	System.out.println(get);
		            }
	
		            
		            //Now we can covert Set to List//////////////////////
		            
		            ArrayList<String> str=new ArrayList<>(values);
		            
		            
		            System.out.println(str.get(1));
		
		}

}
