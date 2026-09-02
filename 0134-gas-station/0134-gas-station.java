class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int start = 0;
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i];
            totalGas += gas[i];
            totalCost += cost[i];

            if (tank < cost[i]) {
                start = i + 1;
                tank = 0;
            } else {
                tank -= cost[i];
            }
        }
        if (totalGas < totalCost) return -1;
        return start;
    }
}