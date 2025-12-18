class Solution:
    def sortIt(self, arr):
        # code here
        evens = []
        odds = []
        while len(arr) >0:
            if arr[-1]%2 ==0:
                evens.append(arr[-1])
            else:
                odds.append(arr[-1])
            arr.pop() # clear array as we go
            
        odds.sort(reverse=True)
        evens.sort()
        for i in odds+evens:
            arr.append(i)
        return arr
        
    
