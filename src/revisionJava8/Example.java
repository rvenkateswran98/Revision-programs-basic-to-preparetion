package revisionJava8;


	import java.util.ArrayList;
	import java.util.List;

	public class Example {
	    public static void main(String[] args) {
	        int n = 3;
	        List<String> result = generateParenthesis(n);
	        
	        for (String s : result) {
	            System.out.println(s);
	        }
	    }
	    
	    public static List<String> generateParenthesis(int n) {
	        List<String> combinations = new ArrayList<>();
	        generate(n, n, "", combinations);
	        return combinations;
	    }
	    
	    public static void generate(int left, int right, String current, List<String> result) {
	        if (left == 0 && right == 0) {
	            result.add(current);
	            return;
	        }
	        
	        if (left > 0) {
	            generate(left - 1, right, current + "(", result);
	        }
	        
	        if (right > left) {
	            generate(left, right - 1, current + ")", result);
	        }
	    }
	}


