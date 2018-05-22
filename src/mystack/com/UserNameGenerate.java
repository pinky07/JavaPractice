package mystack.com;

import java.util.TreeSet;

public class UserNameGenerate {
	
	public static void main(String args[]){
	String baseName= "PinkyAgrawal";
	TreeSet<String> userNamesReturn =test(baseName);
	System.out.println("HI"+userNamesReturn);
	}

	public	static TreeSet<String> test(String baseName) {
		StringBuffer sb;
        TreeSet<String> userNamesReturn = new TreeSet<String>();
        while (userNamesReturn.size() < 14) {
            sb = new StringBuffer();
            sb.append(baseName);
            boolean added = false;
            while (added == false) {
                sb = new StringBuffer();
                sb.append(baseName);
                while (sb.length() < 6) {
                    sb.append("_").append(baseName);
                }
           
                added = true;
            }
        }
      
        return userNamesReturn;
    } 
}

