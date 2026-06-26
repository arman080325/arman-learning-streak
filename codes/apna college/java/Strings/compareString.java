
public class compareString {
    public static void main(String[] args) {
        
        String str="Arman";
        String str2="Arman";
        String str3=new String("Arman");
        
        if(str==str2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        if(str==str3)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        //Here == in strings checks whether both are same at Object level and not compares the values
        //If we have only to check the values then we can use s1.equals(s3): This checks only the values    
        if(str.equals(str3))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
