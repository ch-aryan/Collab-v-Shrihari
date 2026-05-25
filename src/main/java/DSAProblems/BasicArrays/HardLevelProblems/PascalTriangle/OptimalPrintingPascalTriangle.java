package DSAProblems.BasicArrays.HardLevelProblems.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class OptimalPrintingPascalTriangle {
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row = 0; row < n; row++){

            List<Integer> currentRow = new ArrayList<>();

            int element = 1;

            for(int col = 0; col <= row;col++){

                currentRow.add(element);

                element = element * (row - col)/ (col+1);

            }
            triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> ans = generate(n);

        for (List<Integer> row : ans) {
            System.out.println(row);
        }

    }

}
// ==========================================
// DRY RUN
// ==========================================

/*

n = 5


------------------------------------------
OUTER LOOP : row = 0
------------------------------------------

currentRow = []
element = 1


INNER LOOP:

col = 0

currentRow.add(1)

currentRow = [1]

element =
1 * (0-0)/(0+1)
= 0


col becomes 1

condition:
1 <= 0 -> false

INNER LOOP STOPS

triangle = [[1]]



------------------------------------------
OUTER LOOP : row = 1
------------------------------------------

currentRow = []
element = 1


INNER LOOP:

col = 0

currentRow.add(1)

currentRow = [1]

element =
1 * (1-0)/(0+1)
= 1



NEXT ITERATION:

col = 1

currentRow.add(1)

currentRow = [1,1]

element =
1 * (1-1)/(1+1)
= 0


col becomes 2

condition:
2 <= 1 -> false

INNER LOOP STOPS

triangle = [[1],[1,1]]



------------------------------------------
OUTER LOOP : row = 2
------------------------------------------

currentRow = []
element = 1


INNER LOOP:

col = 0

currentRow.add(1)

currentRow = [1]

element =
1 * (2-0)/(0+1)
= 2



NEXT ITERATION:

col = 1

currentRow.add(2)

currentRow = [1,2]

element =
2 * (2-1)/(1+1)
= 1



NEXT ITERATION:

col = 2

currentRow.add(1)

currentRow = [1,2,1]

element =
1 * (2-2)/(2+1)
= 0


col becomes 3

condition:
3 <= 2 -> false

INNER LOOP STOPS

triangle = [
 [1],
 [1,1],
 [1,2,1]
]



------------------------------------------
OUTER LOOP : row = 3
------------------------------------------

currentRow = []
element = 1


col = 0
currentRow = [1]
element = 3


col = 1
currentRow = [1,3]
element = 3


col = 2
currentRow = [1,3,3]
element = 1


col = 3
currentRow = [1,3,3,1]


triangle = [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1]
]



------------------------------------------
OUTER LOOP : row = 4
------------------------------------------

currentRow = []
element = 1


col = 0
currentRow = [1]
element = 4


col = 1
currentRow = [1,4]
element = 6


col = 2
currentRow = [1,4,6]
element = 4


col = 3
currentRow = [1,4,6,4]
element = 1


col = 4
currentRow = [1,4,6,4,1]


FINAL TRIANGLE:

[
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
]

*/
