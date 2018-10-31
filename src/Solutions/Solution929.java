package Solutions;

public class Solution929 {
	public int numUniqueEmails(String[] emails) {
		int j = 0;
		String[] emailsCopy = new String[emails.length];
        for(int i = 0 ; i < emails.length ; i++){
	    		String[] s =	emails[i].split("@");	
	        	if(s[1].contains("+")){
		        	continue;
		    }
			s[0].replace(".","");
		   	s[0].replace("+","");
		   	emails[j] = s[0] + "@" + s[1];
		   	j++;
	    }
			return emailsCopy;
    }
}
