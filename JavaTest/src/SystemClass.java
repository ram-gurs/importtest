import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SystemClass {
	
	public static void main(String[] args){
		showMessage();
		SystemClass sysclass= new SystemClass();
		sysclass.myCollgcue();
	}
	
	public static void showMessage(){
		System.out.println("Woonderful New Year 2021 with out deadly corona artifacts");
		
	}
	
	public void myCollgcue() {
		ArrayList<String> myListOfCue=new ArrayList<String>();  
		myListOfCue.add("Minty");  
		myListOfCue.add("Dandy");  
		myListOfCue.add("Yoodle");  
		myListOfCue.add("moodle");  
		  
		Collections.sort(myListOfCue);  
		Iterator itr=myListOfCue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		}  
		
	}



