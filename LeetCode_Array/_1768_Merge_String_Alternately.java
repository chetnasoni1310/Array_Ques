public class _1768_Merge_String_Alternately {
public String mergeAlternately(String word1, String word2) {
        
        /* I will use 2 pointer approach 
           1 will work on str1 and other on another string 
           if any of one is empty then return the other 
           if any of the one becomes empty i.e pointer > length then merge the rem
           and append it later
            */
        int l1 = word1.length();
        int l2 = word2.length();

        int p1 =0 , p2 = 0;

        StringBuilder str = new StringBuilder();

        while(p1<l1 && p2<l2)
        {
           str.append(word1.charAt(p1++));
           str.append(word2.charAt(p2++));
        }

        while(p1<l1)
        {
           str.append(word1.charAt(p1++));
        }

        while(p2<l2)
        {
           str.append(word2.charAt(p2++));
        }
      return str.toString();
    }
}
