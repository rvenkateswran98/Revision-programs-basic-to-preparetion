package revision3;

import java.util.Hashtable;

public class HashTable {
public static void main(String[] args) {
	
	Hashtable<String, Integer> hashtable = new Hashtable<>();

    hashtable.put("Hari", 25);
    hashtable.put("Arun", 30);
    hashtable.put("Mani", 22);
	
    for(String k: hashtable.keySet()) {
    	System.out.println(hashtable.get(k));
    	System.out.println(k );
    }
	
}
}
