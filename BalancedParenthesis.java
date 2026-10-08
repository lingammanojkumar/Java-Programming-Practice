package datastructures;
import java.util.Stack;
public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="{[()]}";
    System.out.println(valid(str));
	}
static boolean valid(String str)
{
	Stack<Character> st=new Stack<>();
	for(char ch:str.toCharArray())
	{
		if(ch=='{'||ch=='['||ch=='(')
		{
			st.push(ch);
		}else {
			if(st.isEmpty())
			{
				return false;
			}else {
				char top=st.pop();
				if((top=='(' && ch!=')')||(top=='{' && ch!='}')||(top=='[' && ch!=']')) {
					return false;
				}
						
			}
		}
	}
	return st.isEmpty();
}
}
//true