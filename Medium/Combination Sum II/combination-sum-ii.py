#User function Template for python3

class Solution:
    
    def CombinationSum2(self, arr, n, k):
        # code here
        result = []
        arr.sort()
        self.find_combinations(arr, n, k, [], result, 0)
        return result

    def find_combinations(self, arr, n, k, current, result, start):
        if k == 0:
            result.append(current[:])
            return
        
        for i in range(start, n):
            if i > start and arr[i] == arr[i - 1]:
                continue
            if k - arr[i] < 0:
                break
            
            current.append(arr[i])
            self.find_combinations(arr, n, k - arr[i], current, result, i + 1)
            current.pop()


#{ 
 # Driver Code Starts
#Initial Template for Python 3

for _ in range(int(input())):
    n, k = map(int, input().split())
    arr = list(map(int, input().split()))

    ob = Solution()
    result = ob.CombinationSum2(arr, n, k)
    for row in result:
        print(*row)
    if not result:
        print()

# } Driver Code Ends