package DSAProblems.BasicArrays.HardLevelProblems.PascalTriangle;

public class BetterPascalTriangleElement {
    public static int findElement(int row, int col) {

        int result = 1;

        for (int i = 0; i < col; i++) {

            result = result * (row - i) / (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int row = 4;
        int col = 2;

        System.out.println(findElement(row, col));
    }
}
/*
========================================
DRY RUN
========================================

row = 4
col = 2

We need:
4C2

Expected Answer:
6


----------------------------------------
STEP 1
----------------------------------------

result = 1


Visual:

result
  ↓
 [1]



----------------------------------------
STEP 2 -> LOOP STARTS
----------------------------------------

for(int i = 0; i < col; i++)

Substitute value:

for(int i = 0; i < 2; i++)


Loop iterations:

i = 0
i = 1

Loop stops before i = 2



========================================
FIRST ITERATION
========================================

i = 0

Condition:

0 < 2 -> true


Current values:

result = 1
row = 4
i = 0


Formula:

result =
result * (row-i)/(i+1)


Substitute:

result =
1 * (4-0)/(0+1)


Solve numerator:

4-0 = 4


Solve denominator:

0+1 = 1


Now:

result =
1 * 4/1


result = 4


Visual Flow:

1 ---> 4


Memory:

result
  ↓
 [4]



========================================
SECOND ITERATION
========================================

Loop increases automatically:

i++


Now:

i = 1


Condition:

1 < 2 -> true


Current values:

result = 4
row = 4
i = 1


Formula:

result =
4 * (4-1)/(1+1)


Solve numerator:

4-1 = 3


Solve denominator:

1+1 = 2


Now:

result =
4 * 3/2


Multiply first:

4 * 3 = 12


Divide:

12/2 = 6


Final:

result = 6


Visual Flow:

4 ---> 6


Memory:

result
  ↓
 [6]



========================================
LOOP AGAIN
========================================

Loop increases:

i++


Now:

i = 2


Condition:

2 < 2 -> false


LOOP STOPS



========================================
RETURN
========================================

return result;


Returned value:

6



========================================
FINAL VISUAL FLOW
========================================

START

result = 1

        ↓

1 * 4/1 = 4

        ↓

4 * 3/2 = 6

        ↓

RETURN 6

*/
