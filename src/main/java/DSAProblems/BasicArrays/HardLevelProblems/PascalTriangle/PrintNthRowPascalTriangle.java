package DSAProblems.BasicArrays.HardLevelProblems.PascalTriangle;

import java.util.*;

public class PrintNthRowPascalTriangle {

    // Function to generate nth row
    public static List<Integer> generateRow(int row) {

        List<Integer> ansRow = new ArrayList<>();

        int element = 1;

        ansRow.add(element);

        for (int col = 1; col <= row; col++) {

            element = element * (row - col + 1) / col;

            ansRow.add(element);
        }

        return ansRow;
    }

    public static void main(String[] args) {

        int row = 4;

        List<Integer> ans = generateRow(row);

        System.out.println(ans);
    }
}
/*
========================================
DRY RUN
========================================

row = 4

We need to print:

[1, 4, 6, 4, 1]



========================================
STEP 1
========================================

ansRow = []

element = 1


Add first element:

ansRow.add(element)


Now:

ansRow = [1]



Visual:

[1]



========================================
STEP 2 -> LOOP STARTS
========================================

for(int col = 1; col <= row; col++)


Substitute value:

for(int col = 1; col <= 4; col++)


Loop runs:

col = 1
col = 2
col = 3
col = 4



========================================
FIRST ITERATION
========================================

col = 1


Current:

element = 1


Formula:

element =
element * (row-col+1)/col


Substitute:

element =
1 * (4-1+1)/1


Solve:

4-1+1 = 4


Now:

element =
1 * 4/1

=
4


Add into row:

ansRow = [1,4]



Visual Flow:

1 ---> 4



========================================
SECOND ITERATION
========================================

Loop increases automatically:

col = 2


Condition:

2 <= 4 -> true


Current:

element = 4


Formula:

element =
4 * (4-2+1)/2


Solve numerator:

4-2+1 = 3


Now:

element =
4 * 3/2


Multiply:

4 * 3 = 12


Divide:

12/2 = 6


element = 6


Add into row:

ansRow = [1,4,6]



Visual Flow:

4 ---> 6



========================================
THIRD ITERATION
========================================

col = 3


Current:

element = 6


Formula:

element =
6 * (4-3+1)/3


Solve numerator:

4-3+1 = 2


Now:

element =
6 * 2/3


Multiply:

6 * 2 = 12


Divide:

12/3 = 4


element = 4


Add into row:

ansRow = [1,4,6,4]



Visual Flow:

6 ---> 4



========================================
FOURTH ITERATION
========================================

col = 4


Current:

element = 4


Formula:

element =
4 * (4-4+1)/4


Solve numerator:

4-4+1 = 1


Now:

element =
4 * 1/4


=
1


Add into row:

ansRow = [1,4,6,4,1]



Visual Flow:

4 ---> 1



========================================
LOOP AGAIN
========================================

col becomes 5


Condition:

5 <= 4 -> false


LOOP STOPS



========================================
FINAL OUTPUT
========================================

[1,4,6,4,1]



========================================
COMPLETE VISUAL FLOW
========================================

START

[1]

      ↓

1 * 4/1 = 4

[1,4]

      ↓

4 * 3/2 = 6

[1,4,6]

      ↓

6 * 2/3 = 4

[1,4,6,4]

      ↓

4 * 1/4 = 1

[1,4,6,4,1]

*/