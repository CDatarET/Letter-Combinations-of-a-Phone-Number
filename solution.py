class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        d = {'2': "abc", '3': "def", '4': "ghi", '5': "jkl", '6': "mno", '7': "pqrs", '8': "tuv", '9': "wxyz"}
        if len(digits) == 1:
            return list(d[digits])
        elif len(digits) == 2:
            ret = []
            for i in range(len(d[digits[0]])):
                for j in range(len(d[digits[1]])):
                    ret.append(d[digits[0]][i] + d[digits[1]][j])
            
            return ret
        elif len(digits) == 3:
            ret = []
            for i in range(len(d[digits[0]])):
                for j in range(len(d[digits[1]])):
                    for k in range(len(d[digits[2]])):
                        ret.append(d[digits[0]][i] + d[digits[1]][j] + d[digits[2]][k])
            
            return ret
        
        ret = []
        for i in range(len(d[digits[0]])):
            for j in range(len(d[digits[1]])):
                for k in range(len(d[digits[2]])):
                    for l in range(len(d[digits[3]])):
                        ret.append(d[digits[0]][i] + d[digits[1]][j] + d[digits[2]][k] + d[digits[3]][l])
            
        return ret
