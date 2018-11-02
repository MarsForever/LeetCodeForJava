package Solutions;

import java.util.TreeSet;

public class Solution929 {
	public int numUniqueEmails(String[] emails) {
		int j = 0;
		String[] emailsCopy = new String[emails.length];
		TreeSet<String> set = new TreeSet<String>();
        for(int i = 0 ; i < emails.length ; i++){
	    		String[] s =	emails[i].split("@");	
	        	if(s[1].contains("+")){
		        	continue;
	        	}
			s[0] = s[0].replace(".","");
			s[0] = s[0].substring(0,s[0].indexOf("+"));
		   	emailsCopy[j] = s[0] + "@" + s[1];
		   	set.add(emailsCopy[j] );
		   	j++;
	    }
			return set.size();
    }
}
