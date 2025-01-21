class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String head = "";
        if(s!=0)
            head = my_string.substring(0,s);
        
        String tail = "";
        if(e+1 <= my_string.length() -1) 
            tail = my_string.substring(e+1);
        
        String temp = my_string.substring(s,e+1);
        
        String reverse = "";
        for(int i=temp.length() -1; i>=0; i--)
        {
            reverse = reverse + temp.charAt(i);
        }
        
        answer = head+reverse+tail;
        
        return answer;
    }
}