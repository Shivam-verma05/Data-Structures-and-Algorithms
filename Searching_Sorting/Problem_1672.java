package Searching_Sorting;
import java.util.Arrays;
// 1672. Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
// Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation:
// 1st customer has wealth = 6
// 2nd customer has wealth = 10
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.

public class Problem_1672 {
    public static void main(String[] args) {
        System.out.println("Input  : Accounts = [[1,2,3],[3,2,1]]");
        System.out.println("Output : "+maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
        System.out.println("Input  : Accounts = [[1,5],[7,3],[3,5]]");
        System.out.println("Output : "+maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
        System.out.println("Input  : Accounts = [[2,8,7],[7,1,3],[1,9,5]]");
        System.out.println("Output : "+maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
    }
    static int maximumWealth(int[][] accounts) {
        //customer = row
        //account = col
        int maximum=Integer.MIN_VALUE;
        for(int customer=0;customer<accounts.length;customer++){
            int sum=0;
            for(int account=0;account<accounts[customer].length;account++){
                sum+=accounts[customer][account];
            }
            if (sum>maximum) maximum=sum;
        }
        return maximum;
    }
}
