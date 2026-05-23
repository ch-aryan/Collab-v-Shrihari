package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;
import java.util.ArrayList;

public class SpiralMatrix {

    public static ArrayList<Integer> spiral(int mat[][]) {

        ArrayList<Integer> ans =
                new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = m - 1;

        while(top <= bottom &&
                left <= right) {

            // LEFT → RIGHT
            for(int i = left;
                i <= right; i++) {

                ans.add(mat[top][i]);
            }

            top++;

            // TOP → BOTTOM
            for(int i = top;
                i <= bottom; i++) {

                ans.add(mat[i][right]);
            }

            right--;

            // RIGHT → LEFT
            if(top <= bottom) {

                for(int i = right;
                    i >= left; i--) {

                    ans.add(mat[bottom][i]);
                }

                bottom--;
            }

            // BOTTOM → TOP
            if(left <= right) {

                for(int i = bottom;
                    i >= top; i--) {

                    ans.add(mat[i][left]);
                }

                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int mat[][] = {

                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(
                spiral(mat));
    }
}
/*
=================================================
MATRIX
=================================================

1    2    3    4
5    6    7    8
9   10   11   12
13  14   15   16
*/

/*
=================================================
INITIAL VALUES
=================================================

top = 0
bottom = 3

left = 0
right = 3

ans = []
*/

/*
=================================================
WHILE LOOP ITERATION 1
=================================================

CONDITION CHECK

top <= bottom
0 <= 3 ✅

left <= right
0 <= 3 ✅

loop runs
*/

/*
=================================================
STEP 1 → LEFT TO RIGHT
=================================================

horizontal traversal

row fixed
column changes

formula:

mat[top][i]
*/

/*
CURRENT MATRIX

→ 1    2    3    4
  5    6    7    8
  9   10   11   12
 13   14   15   16
*/

/*
FOR LOOP

for(int i = left;
    i <= right; i++)
*/

/*
LOOP ITERATION 1

i = 0

CONDITION

0 <= 3 ✅

ACCESSING

mat[top][i]
=
mat[0][0]
=
1

ans = [1]
*/

/*
LOOP ITERATION 2

i = 1

CONDITION

1 <= 3 ✅

ACCESSING

mat[0][1]
=
2

ans = [1,2]
*/

/*
LOOP ITERATION 3

i = 2

CONDITION

2 <= 3 ✅

ACCESSING

mat[0][2]
=
3

ans = [1,2,3]
*/

/*
LOOP ITERATION 4

i = 3

CONDITION

3 <= 3 ✅

ACCESSING

mat[0][3]
=
4

ans = [1,2,3,4]
*/

/*
LOOP AGAIN

i = 4

CONDITION

4 <= 3 ❌

loop stops
*/

/*
top++

top = 1
*/

/*
=================================================
STEP 2 → TOP TO BOTTOM
=================================================

vertical traversal

row changes
column fixed

formula:

mat[i][right]
*/

/*
CURRENT MATRIX

5    6    7   ↓8
9   10   11   ↓12
13  14   15   ↓16
*/

/*
FOR LOOP

for(int i = top;
    i <= bottom; i++)
*/

/*
LOOP ITERATION 1

i = 1

CONDITION

1 <= 3 ✅

ACCESSING

mat[1][3]
=
8

ans = [1,2,3,4,8]
*/

/*
LOOP ITERATION 2

i = 2

CONDITION

2 <= 3 ✅

ACCESSING

mat[2][3]
=
12

ans = [1,2,3,4,8,12]
*/

/*
LOOP ITERATION 3

i = 3

CONDITION

3 <= 3 ✅

ACCESSING

mat[3][3]
=
16

ans = [1,2,3,4,8,12,16]
*/

/*
LOOP AGAIN

i = 4

CONDITION

4 <= 3 ❌

loop stops
*/

/*
right--

right = 2
*/

/*
=================================================
STEP 3 → RIGHT TO LEFT
=================================================

horizontal traversal

row fixed
column changes

formula:

mat[bottom][i]
*/

/*
CONDITION CHECK

top <= bottom

1 <= 3 ✅
*/

/*
CURRENT MATRIX

5    6    7
9   10   11
13 ←14 ←15
*/

/*
FOR LOOP

for(int i = right;
    i >= left; i--)
*/

/*
LOOP ITERATION 1

i = 2

CONDITION

2 >= 0 ✅

ACCESSING

mat[3][2]
=
15

ans =
[1,2,3,4,8,12,16,15]
*/

/*
LOOP ITERATION 2

i = 1

CONDITION

1 >= 0 ✅

ACCESSING

mat[3][1]
=
14

ans =
[1,2,3,4,8,12,16,15,14]
*/

/*
LOOP ITERATION 3

i = 0

CONDITION

0 >= 0 ✅

ACCESSING

mat[3][0]
=
13

ans =
[1,2,3,4,8,12,16,15,14,13]
*/

/*
LOOP AGAIN

i = -1

CONDITION

-1 >= 0 ❌

loop stops
*/

/*
bottom--

bottom = 2
*/

/*
=================================================
STEP 4 → BOTTOM TO TOP
=================================================

vertical traversal

row changes
column fixed

formula:

mat[i][left]
*/

/*
CONDITION CHECK

left <= right

0 <= 2 ✅
*/

/*
CURRENT MATRIX

↑5    6    7
↑9   10   11
*/

/*
FOR LOOP

for(int i = bottom;
    i >= top; i--)
*/

/*
LOOP ITERATION 1

i = 2

CONDITION

2 >= 1 ✅

ACCESSING

mat[2][0]
=
9

ans =
[1,2,3,4,8,12,16,15,14,13,9]
*/

/*
LOOP ITERATION 2

i = 1

CONDITION

1 >= 1 ✅

ACCESSING

mat[1][0]
=
5

ans =
[1,2,3,4,8,12,16,15,14,13,9,5]
*/

/*
LOOP AGAIN

i = 0

CONDITION

0 >= 1 ❌

loop stops
*/

/*
left++

left = 1
*/

/*
=================================================
FIRST OUTER LAYER FINISHED
=================================================

REMAINING INNER MATRIX

6    7
10  11
*/
