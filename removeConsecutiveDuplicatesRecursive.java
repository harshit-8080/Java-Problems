public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length() <=1){
            return s;
        }
        
        if(s.charAt(0) == s.charAt(1)){
            int i = 0;
            while(i<s.length()-1){
                
				if(s.charAt(i) == s.charAt(i+1)){
                    i++;
                }
                else{
                    break;
                }
            }
            if(i<s.length()-1){
                String smallOutput = removeConsecutiveDuplicates(s.substring(i+1));
            	return s.charAt(0) + smallOutput;
            }
            else{
                return s.charAt(0) + "";
            }
            
            
        	
        }
        else{
            String smallOutput = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + smallOutput;
        }

	}
