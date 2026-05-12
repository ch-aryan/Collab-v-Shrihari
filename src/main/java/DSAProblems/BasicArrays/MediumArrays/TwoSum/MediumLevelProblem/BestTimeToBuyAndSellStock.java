package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;
    public class BestTimeToBuyAndSellStock {

        public static int maxProfit(int[] prices) {

            // Assume first element is minimum price initially
            int mini = prices[0];

            // Initially profit is 0
            int maxProfit = 0;

            // Traverse complete array
            for (int i = 0; i < prices.length; i++) {

                // Current profit if we sell today
                int cost = prices[i] - mini;

            /*
             DRY RUN

             prices = {7,1,5,3,6,4}

             ---------------------------------
             i = 0
             prices[i] = 7

             cost = 7 - 7 = 0
             maxProfit = max(0,0) = 0
             mini = min(7,7) = 7
             ---------------------------------

             i = 1
             prices[i] = 1

             cost = 1 - 7 = -6
             maxProfit = max(0,-6) = 0
             mini = min(7,1) = 1
             ---------------------------------

             i = 2
             prices[i] = 5

             cost = 5 - 1 = 4
             maxProfit = max(0,4) = 4
             mini = min(1,5) = 1
             ---------------------------------

             i = 3
             prices[i] = 3

             cost = 3 - 1 = 2
             maxProfit = max(4,2) = 4
             mini = min(1,3) = 1
             ---------------------------------

             i = 4
             prices[i] = 6

             cost = 6 - 1 = 5
             maxProfit = max(4,5) = 5
             mini = min(1,6) = 1
             ---------------------------------

             i = 5
             prices[i] = 4

             cost = 4 - 1 = 3
             maxProfit = max(5,3) = 5
             mini = min(1,4) = 1
             ---------------------------------
            */

                // Update maximum profit
                maxProfit = Math.max(maxProfit, cost);

                // Update minimum price
                mini = Math.min(mini, prices[i]);
            }

            return maxProfit;
        }

        public static void main(String[] args) {

            int[] prices = {7, 1, 5, 3, 6, 4};

            int result = maxProfit(prices);

            System.out.println("Maximum Profit = " + result);
        }
    }

