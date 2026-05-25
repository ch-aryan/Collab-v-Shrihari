package DSAProblems.BasicArrays.HardLevelProblems.PascalTriangle;

public class BrutePascalTriangleElement {
    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Function to find element at given row and column
    public static int findElement(int row, int col) {

        int numerator = factorial(row);

        int denominator =
                factorial(col) * factorial(row - col);

        return numerator / denominator;
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

Formula:

nCr =
n! / (r! * (n-r)!)


Substitute values:

4! / (2! * (4-2)!)

=
4! / (2! * 2!)



========================================
STEP 1 -> factorial(4)
========================================

fact = 1


----------------------------------------
i = 1
----------------------------------------

fact = 1 * 1

fact = 1


----------------------------------------
i = 2
----------------------------------------

fact = 1 * 2

fact = 2


----------------------------------------
i = 3
----------------------------------------

fact = 2 * 3

fact = 6


----------------------------------------
i = 4
----------------------------------------

fact = 6 * 4

fact = 24


Returned:

4! = 24



========================================
STEP 2 -> factorial(2)
========================================

fact = 1


----------------------------------------
i = 1
----------------------------------------

fact = 1 * 1

fact = 1


----------------------------------------
i = 2
----------------------------------------

fact = 1 * 2

fact = 2


Returned:

2! = 2



========================================
STEP 3 -> factorial(4-2)
========================================

factorial(2)

Again:

2! = 2



========================================
STEP 4
========================================

numerator = 24


denominator =
2 * 2

= 4



========================================
STEP 5
========================================

answer =
24 / 4

= 6



========================================
FINAL OUTPUT
========================================

6



========================================
VISUAL FLOW
========================================

4!
=
1 × 2 × 3 × 4
=
24


2!
=
1 × 2
=
2


Again:
2!
=
2


Now:

24 / (2 × 2)

=
24 / 4

=
6

*/
