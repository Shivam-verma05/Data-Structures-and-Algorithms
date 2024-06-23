package String;
import java.util.ArrayList;
import java.util.Arrays;
public class Strings {
    public static void main(String[] args){
        // String name1 = "Shivam"; object is created in String pool where if two objects have same content their reference variable points to same objects
        // String name4 = new String("Shivam"); object is created in heap so even if contents of objects are same the new objects are created and reference variable points to different objects
        // == is used to compare objects based on content and reference variable both
        // equals method is used to compare objects based on content only
        String name1 = "Shivam";
        String name2 = "Shivam";
        String name5 = name2;
        System.out.println("name1==name2 : "+(name1==name2));
        System.out.println("name5==name2 : "+(name5==name2));
        String name3 = new String("Shivam");
        String name4 = new String("Shivam");
        String name6 = name4;
        System.out.println("name3==name4 : "+(name3==name4));
        System.out.println("name1==name3 : "+(name1==name3));
        System.out.println("name6==name4 : "+(name6==name4));
        System.out.println("name3==name4 using equals method : "+name3.equals(name4));
        System.out.println("name1==name3 using equals method : "+name1.equals(name3));
        System.out.println("name6==name4 using equals method : "+name6.equals(name4));
        String name7=null;
        System.out.println("name7 : "+name7);

        //Placeholders
        float a = 452.4568543f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.printf("Pie : %.3f",Math.PI);
        System.out.printf("Hello %s , how are you? You love %s.","Shivam","Java");

        //Operators
        System.out.println(1+3);
        System.out.println('a'+'a');
        System.out.println("a"+"a");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        // this is same as after few steps : "a" +"4"
        System.out.println("a"+4);
        System.out.println("Shivam" + new ArrayList<>());

        String alpha = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            alpha+=ch;
        }
        System.out.println(alpha);
        //Methods
        String name= "Shivam Verma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println("Index of 'm' : "+name.indexOf('m'));
        System.out.println("      Hello         ".strip());
        String any = "Shivam Loves Java";
        System.out.println(Arrays.toString(any.split(" ")));

        // StringBuilder Class
        // original string is also changed when some operation is performed on that string in string builder class
        StringBuilder s = new StringBuilder("abcdef");
        s.append("ghij");
        s.reverse();
        System.out.println(s);
}
}

