public class NaiveStringMatch extends StringMatch {
    public int match(String text, String pattern) {
      int m = pattern.length();
       for(int i=0; i<= text.length()-m; i++){
         boolean found = true;
         for(int k = 0; k<m; k++){
           this.counter.add(2);
           if(text.charAt(i+k)!= pattern.charAt(k)){
             found = false;
             break;
           }
         }
         if (found){
           return i;
         }
       }

        return -1;
    }
}
