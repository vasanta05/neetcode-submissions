class Solution {
public int firstMissingPositive(int[] a) {


    for (int i = 0; i < a.length; i++) {
        while (a[i] > 0 && a[i] <= a.length && a[a[i] - 1] != a[i]) {
            int temp = a[i];
            a[i] = a[temp - 1];
            a[temp - 1] = temp;
        }
    }

    for (int i = 0; i < a.length; i++) {
        if (a[i] != i + 1)
            return i + 1;
    }

    return a.length + 1;
}


}
