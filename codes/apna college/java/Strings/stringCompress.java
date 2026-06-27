public class stringCompress {
    public static void main(String[] args) {
        String str="aaabbbrrrrrccccfffffff";
        System.out.println(compressString(str));
    }

    public static StringBuilder compressString(String str)  //Or String datatype
    {
        StringBuilder sb=new StringBuilder(""); // Or String newStr="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i)); //Or  newStr += str.charAt(i)
            if(count > 1)
            {
                sb.append(count.toString());  // Or newStr += count.toString()
            }
        }
        return sb;
    }
}
//StringBuilder uses less time than String as this uses newStr+=
//Time Complexity : O(n) Linear Time Complexity