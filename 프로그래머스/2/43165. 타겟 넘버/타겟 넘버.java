class Solution {
    
    private int[] numbers;
    private int target;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        return dfs(0, 0, 0);
    }
    
    private int dfs(int index, int sum, int answer) {
        if (index == numbers.length) {
            if (sum != target) return answer;
            return answer + 1;
        }
        
        int plus = dfs(index + 1, sum + numbers[index], answer);
        int minus = dfs(index + 1, sum - numbers[index], answer);
        
        return plus + minus;
    }
}