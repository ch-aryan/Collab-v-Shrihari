package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

import java.util.HashMap;

public class CountSubArraySumK {
    public static int countSubarray(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum =0;
        int cnt = 0;
        for(int i =0 ;i < arr.length;i++){
            preSum += arr[i];

            int remove = preSum - k;
            if(map.containsKey(remove)){
                cnt+= map.get(remove);
            }else{
                map.put(preSum, map.getOrDefault(preSum,0)+1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};

        int k = 6;

        int result = countSubarray(arr,k);
        System.out.println(result);
    }

}
/*

-----------------------------------------
DRY RUN
-----------------------------------------

arr = [3,1,2,4]
k = 6

INITIAL:

prefixSum = 0
count = 0

HashMap:
{
 0=1
}

-----------------------------------------
ITERATION 1
-----------------------------------------

ARRAY:

[3,1,2,4]
 ↑
 i=0

Current element = 3

STEP 1:
prefixSum += arr[i]

0 + 3 = 3

prefixSum = 3

STEP 2:
remove = prefixSum - k

3 - 6 = -3

STEP 3:
Check hashmap

map.containsKey(-3)

NO

So count will NOT increase

count = 0

STEP 4:
Store current prefixSum

map.put(3,1)

HashMap:

{
 0=1,
 3=1
}

-----------------------------------------
ITERATION 2
-----------------------------------------

ARRAY:

[3,1,2,4]
   ↑
   i=1

Current element = 1

STEP 1:
prefixSum += arr[i]

3 + 1 = 4

prefixSum = 4

STEP 2:
remove = prefixSum - k

4 - 6 = -2

STEP 3:
Check hashmap

map.containsKey(-2)

NO

So count will NOT increase

count = 0

STEP 4:
Store current prefixSum

map.put(4,1)

HashMap:

{
 0=1,
 3=1,
 4=1
}

-----------------------------------------
ITERATION 3
-----------------------------------------

ARRAY:

[3,1,2,4]
     ↑
     i=2

Current element = 2

STEP 1:
prefixSum += arr[i]

4 + 2 = 6

prefixSum = 6

STEP 2:
remove = prefixSum - k

6 - 6 = 0

STEP 3:
Check hashmap

map.containsKey(0)

YES

map.get(0) = 1

IMPORTANT:

Current Prefix = 6

Previous Prefix = 0

6 - 0 = 6

So subarray found:

[3,1,2]

STEP 4:
Increase count

count += 1

count = 1

STEP 5:
Store current prefixSum

map.put(6,1)

HashMap:

{
 0=1,
 3=1,
 4=1,
 6=1
}

-----------------------------------------
ITERATION 4
-----------------------------------------

ARRAY:

[3,1,2,4]
       ↑
       i=3

Current element = 4

STEP 1:
prefixSum += arr[i]

6 + 4 = 10

prefixSum = 10

STEP 2:
remove = prefixSum - k

10 - 6 = 4

STEP 3:
Check hashmap

map.containsKey(4)

YES

map.get(4) = 1

IMPORTANT:

Current Prefix = 10

Previous Prefix = 4

10 - 4 = 6

So subarray found:

[2,4]

STEP 4:
Increase count

count += 1

count = 2

STEP 5:
Store current prefixSum

map.put(10,1)

HashMap:

{
 0=1,
 3=1,
 4=1,
 6=1,
 10=1
}

-----------------------------------------
FINAL ANSWER
-----------------------------------------

count = 2

Subarrays:

[3,1,2]
[2,4]

OUTPUT = 2

*/