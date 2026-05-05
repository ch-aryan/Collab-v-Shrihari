package DSAProblems.BasicArrays;

import java.util.*;

public class IntersectionSortedArrays {
    public static List<Integer> findIntersection(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4,5};
        int[] b = {2, 3, 4,5, 6};

        System.out.println(findIntersection(a, b));
    }
}