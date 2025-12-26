class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
         HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        
        for(int i=1; i<=1000000; i++){ // as given in ques, arr[i]<=10^6
            if(!set.contains(i)){ // check if it was present in arr
                if(k==1) return i; // kth missing => ans
                else k--; // missing but not kth so k=k-1
            }
        }
        return -1; // invalid
    }
}