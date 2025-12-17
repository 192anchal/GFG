class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[] { arr[0][0], arr[0][1] });
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= res.get(res.size() - 1)[1]) {
                int[] last = res.remove(res.size() - 1);
                last[1] = Math.max(last[1], arr[i][1]);
                res.add(last);
            } else {
                res.add(new int[] { arr[i][0], arr[i][1] });
            }
        }
        return res;
    }
}