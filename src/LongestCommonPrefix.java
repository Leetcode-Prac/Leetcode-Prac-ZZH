import java.lang.reflect.Array;
public class LongestCommonPrefix {
        public String longestCommonPrefix(String[] strs) {
            String str = "";
            if (strs == null || strs.length == 0) {
                return "";
            }
            int smallest = Integer.MAX_VALUE;
            for(int i = 0; i < strs.length; i++){
                if(strs[i].length()< smallest ){
                    smallest = strs[i].length();
                }
            }
            for(int j = 0; j < smallest; j++){
                for(int i = 0; i < strs.length; i++){
                    if(strs[0].charAt(j) != (strs[i].charAt(j))){
                        return str;
                    }
                }
                str += strs[0].charAt(j);
            }
            return str;
        }


//    public static void main(String[] args) {
//        LongestCommonPrefix lon = new LongestCommonPrefix();
//        String str =lon.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
//        System.out.println(str);
//        String str1 =lon.longestCommonPrefix(new String[]{"flower","flow","flight"});
//        System.out.println(str1);
//        String str2 =lon.longestCommonPrefix(new String[]{"ab","a"});
//        System.out.println(str2);
//    }

    }

