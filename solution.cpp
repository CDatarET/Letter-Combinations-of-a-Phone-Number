class Solution {
public:
    vector<string> letterCombinations(string digits) {
        unordered_map<char, string> map = {
            {'2', "abc"},
            {'3', "def"},
            {'4', "ghi"},
            {'5', "jkl"},
            {'6', "mno"},
            {'7', "pqrs"},
            {'8', "tuv"},
            {'9', "wxyz"}
        };

        vector<string> v;
        if(digits.length() == 1){
            for(int i = 0; i < map[digits[0]].length(); i++){
                v.push_back(string(1, map[digits[0]][i]));
            }
        }
        else if(digits.length() == 2){
            for(int i = 0; i < map[digits[0]].length(); i++){
                for(int j = 0; j < map[digits[1]].length(); j++){
                    v.push_back(string(1, map[digits[0]][i]) + string(1, map[digits[1]][j]));
                }
            }
        }
        else if(digits.length() == 3){
            for(int i = 0; i < map[digits[0]].length(); i++){
                for(int j = 0; j < map[digits[1]].length(); j++){
                    for(int k = 0; k < map[digits[2]].length(); k++){
                        v.push_back(string(1, map[digits[0]][i]) + string(1, map[digits[1]][j]) + string(1, map[digits[2]][k]));
                    }
                }
            }
        }
        else{
            for(int i = 0; i < map[digits[0]].length(); i++){
                for(int j = 0; j < map[digits[1]].length(); j++){
                    for(int k = 0; k < map[digits[2]].length(); k++){
                        for(int l = 0; l < map[digits[3]].length(); l++){
                            v.push_back(string(1, map[digits[0]][i]) + string(1, map[digits[1]][j]) + string(1, map[digits[2]][k]) + string(1, map[digits[3]][l]));
                        }
                    }
                }
            }
        }

        return v;
    }
};
