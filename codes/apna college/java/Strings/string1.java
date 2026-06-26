
import java.util.*;
public class string1 {
    public static void main(String[] args) {
        
        
        char arr[] = {'a', 'b', 'c', 'f'};
        String str = "Arman";
        String str2 = new String("Hi Arman");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Enter string");
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        String fullName="Arman Ahemad Khan";
        printChar(fullName);
        
    }


    public static void printChar(String name){
        for(int i=0;i<name.length();i++)
        {
            System.out.print(name.charAt(i)+" ");
        }
    }
}
//In Arrays, .length is a property but in String it is a function so () is used.