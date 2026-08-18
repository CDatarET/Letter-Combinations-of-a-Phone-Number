class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );

        ArrayList<String> list = new ArrayList<>();
        if(digits.length() == 1){
            for(int i = 0; i < map.get(digits.charAt(0)).length(); i++){
                list.add("" + map.get(digits.charAt(0)).charAt(i));
            }

            return list;
        }
        else if(digits.length() == 2){
            for(int i = 0; i < map.get(digits.charAt(0)).length(); i++){
                for(int j = 0; j < map.get(digits.charAt(1)).length(); j++){
                    list.add("" + map.get(digits.charAt(0)).charAt(i) + map.get(digits.charAt(1)).charAt(j));
                }
            }

            return list;
        }
        else if(digits.length() == 3){
            for(int i = 0; i < map.get(digits.charAt(0)).length(); i++){
                for(int j = 0; j < map.get(digits.charAt(1)).length(); j++){
                    for(int k = 0; k < map.get(digits.charAt(2)).length(); k++){
                        list.add("" + map.get(digits.charAt(0)).charAt(i) + map.get(digits.charAt(1)).charAt(j) + map.get(digits.charAt(2)).charAt(k));
                    }
                }
            }

            return list;
        }

        for(int i = 0; i < map.get(digits.charAt(0)).length(); i++){
            for(int j = 0; j < map.get(digits.charAt(1)).length(); j++){
                for(int k = 0; k < map.get(digits.charAt(2)).length(); k++){
                    for(int l = 0; l < map.get(digits.charAt(3)).length(); l++){
                        list.add("" + map.get(digits.charAt(0)).charAt(i) + map.get(digits.charAt(1)).charAt(j) + map.get(digits.charAt(2)).charAt(k) + map.get(digits.charAt(3)).charAt(l));
                    }
                }
            }
        }

        return list;
    }
}
