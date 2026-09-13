class Solution {
    public String[] findWords(String[] words) {
        int[] rowMap=new int[26];

        for(char r1 :"qwertyuiop".toCharArray()){
            rowMap[r1-'a']=1;
        }
        for(char r2:"asdfghjkl".toCharArray()){
            rowMap[r2-'a']=2;
        }
          for(char r2:"zxcvbnm".toCharArray()){
            rowMap[r2-'a']=3;
        }
        List<String> result=new ArrayList<>();
        for(String word :words){
            String lower=word.toLowerCase();
               int targetRow=rowMap[lower.charAt(0)-'a'];
                   boolean isValid=true;
            for(int i=1;i<lower.length();i++){
               if(rowMap[lower.charAt(i)-'a']!=targetRow){
                isValid=false;
                break;
               }
            }

            if(isValid){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}