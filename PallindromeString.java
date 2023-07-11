
public class PallindromeString {

	 public static void main(String[] args) {
	        String str = "Rajesh";

	        //String st = "";
	        StringBuilder sb = new StringBuilder("");
	        for(int i=str.length()-1; i>=0; i--){
	            char ch = str.charAt(i);
	            //st = st+ch;
	            sb.append(ch);
	            //System.out.println(ch);
	        }
	        System.out.println(sb);
	        //System.out.println(st);

	       
	    }

	}