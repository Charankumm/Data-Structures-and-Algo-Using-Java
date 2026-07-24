class Solution(object):
    def firstUniqChar(self, s):
        freq = {}
        for Character in s:
            if Character in freq:
                freq[Character]+=1
            else:
                freq[Character]=1
        for ch in s:
            if freq[ch]==1:
                return s.index(ch)  
        return -1                  
        """
        :type s: str
        :rtype: int
        """
        