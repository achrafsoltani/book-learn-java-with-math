import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

class ProjectD {
    public static void main(String [] args){
        System.out.println("Hello Project D");
        Scanner sc = new Scanner(System.in);
        String source = new String();
        System.out.print("Please enter a string : ");
        source = sc.nextLine();
        System.out.println("Thsi string has a vowel ? : "+ProjectD.hasVowel(source));
    }

    public static boolean hasVowel(String str){
        char[] arr = str.toCharArray();
        String[] vowels = new String [] {"a", "e", "i", "o", "u"};
        List<String> v = Arrays.asList(vowels);
        for (char c : arr){
            if(v.contains(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }
}