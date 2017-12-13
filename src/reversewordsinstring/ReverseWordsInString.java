/*

Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

click to show clarification.

Clarification:
What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.

 */
package reversewordsinstring;

import java.util.Stack;

/**
 *
 * @author ali_hassan_syed
 */
public class ReverseWordsInString 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String result = reverseWords("    The sky is     blue    ");
        System.out.println(result);
        //Expected result
        //"blue is sky The"
    }
    
    public static String reverseWords(String s) 
    {
        Stack<String> stack = new Stack<>();
        String str = "";
        
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) != ' ')
                str += s.charAt(i);
            else if (str.length() > 0)
            {
                stack.push(str);
                str = "";
            }
        }
        if (str.length() > 0)
            stack.push(str);
        
        String result = "";
        while(!stack.isEmpty())
        {
            result += stack.pop();
            if (stack.size() > 0)
                result += " ";
        }
        
        return result;
    }
    
}
