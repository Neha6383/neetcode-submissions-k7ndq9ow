class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for(char ch : s.toCharArray()) {
            if(ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                isBalanced = false;
                break;
            }
            char top = stack.pop();
            if(ch == ']' && top != '[' || ch == '}' && top != '{' || ch == ')' && top != '(') {
                isBalanced  = false;
                break;
            }
        }
    }
    if(!stack.isEmpty()) {
        isBalanced = false;
    }
    return isBalanced;    
    }
}
