import java.util.ArrayList;
import java.util.List;

public class ReverseHash {
	
	private static final long desiredHash = 930846109532517l;
	
	static  List<String> resultantStrings = new ArrayList<String>();

    public static void main(String[] args) {
        char[] chars = "acdegilmnoprstuw".toCharArray();
        for(int i=1;i<=chars.length;i++){
        	int len = i;
            iterateEachWord(chars, len, new char[len], 0);
        }
        
        System.out.println(resultantStrings.toString());
        
    }

    public static void iterateEachWord(char[] chars, int len, char[] build, int pos) {
        if (pos == len) {
            String word = new String(build);
            
            if(desiredHash == hash(word)){
            	System.out.println(word);
            	resultantStrings.add(word);
            }
            
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            build[pos] = chars[i];
            iterateEachWord(chars, len, build, pos + 1);
        }
    }
    
    public static long hash (String s) {
    	Long h = 7l;
        String letters = "acdegilmnoprstuw";
        for(int i = 0; i < s.length(); i++) {
            h = (h * 37 + letters.indexOf(s.charAt(i)));
        }
        return h;
    }

}
