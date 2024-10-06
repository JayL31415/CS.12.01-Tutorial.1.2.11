public class DiverseArray {

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        for (int r = 0; r < arr2D.length; r++) {
            sums[r] = arraySum(arr2D[r]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        boolean[] seen = new boolean[1000];

        for (int sum : sums) {
            if (sum < 0 || sum >= seen.length || seen[sum]) {
                return false;
            }
            seen[sum] = true;
        }
        return true;
    }

}