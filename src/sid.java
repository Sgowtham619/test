import groovy.console.ui.SystemOutputInterceptor;

import javax.sound.midi.Soundbank;
import java.lang.invoke.SwitchPoint;
import java.util.*;

//public class sid {
//    public static void main(String[] args) {
//    }
//}
//        prime number sum:

//        int n = 0;
//        int flag = 1;
//        if (n == 0 || n == 1) {
//            System.out.println("is not prime");
//        } else {
//            for (int i = 2; i < n / 2; i++) {
//                if (n % 2 == 0) {
//                    System.out.println("is not prime");
//                    flag = 0;
//                    break;
//                }
//            }
//            if (flag == 1) System.out.println("is prime");
//        }

// factorial using recurcive :

//public class sid {
//    static int factorial(int n) {
//        if (n == 1)
//            return 1;
//        else return n * factorial(n - 1);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(factorial(n));
//    }
//}
//swap without 3rd varible
//public class sid {
//    public static void main(String[] args) {
//        int a = 3, b = 4;
//        b = b + a ;
//        a = b - a ;
//        b = b - a;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}
//palidrom num:

//public class sid {
//    public static void main(String[] args) {
//        int num = 1234;
//        int n = num;
//        int reverse = 0;
//        int remainder;
//        while (n != 0) {
//            remainder = n % 10;
//            reverse = reverse * 10 + remainder;
//            n = n / 10;
//        }
//        System.out.println(reverse);
//        System.out.println(num);
//        if (reverse == num) System.out.println("is palindrome");
//        else System.out.println("not palindrome");
//    }
//}

//palindrome string:
//public class sid {
//    public static void main(String[] args) {
//        String s1 = "siis";
//        int n = s1.length();
//        int flag = 1;
//        for (int i = 0; i < n / 2; i++) {
//            if (s1.charAt(i) != s1.charAt(n - i - 1)) {
//                flag = 0;
//                System.out.println("not a palindrome");
//                break;
//            }
//        }
//        if (flag == 1) System.out.println("is palindrome");
//    }
//}

//anagram
// public class sid{
//    public static void main(String[] args) {
//        String s1 = "abbba";
//        String s2 = "bbbaa";
//        boolean flag = true;
//        if(s1.length() != s2.length())
//            flag = false;
//        else {
//            char[] arr1 = s1.toCharArray();
//            char[] arr2 = s2.toCharArray();
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//            flag = Arrays.equals(arr1,arr2);
//        }
//          if(flag == true) System.out.println("is anagram");
//          else System.out.println("not anagram");
//    }
//}

//How do you find the duplicate number on a given integer array?
// public class sid {
//    public static void main(String[] args) {
//        int arr[] = {3, 3, 3, 2, 2, 1};
//        int count;
//        for (int i = 0; i < arr.length; i++) {
//            count = 0;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) System.out.println(arr[i]);
//        }
//
//    }
//}

//How do you find the largest and smallest number in an unsorted integer array?
//public class sid {
//    public static void main(String[] args) {
//        int arr[] = {3, 7, 5, 1, 20, -1 ,-10,1000,0};
//        int max_num = Integer.MIN_VALUE;
//        int min_num = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (max_num < arr[i])
//                max_num = arr[i];
//            if (min_num > arr[i]) {
//                min_num = arr[i];
//            }
//        }
//        System.out.println(max_num);
//        System.out.println(min_num);
//    }
//}

//How do you find all pairs of an integer array whose sum is equal to a given number?

//public class sid {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        int target = 4;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1 ; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(arr[i]);
//                    System.out.println(arr[j]);
//                }
//            }
//        }
//    }
//}

////How are duplicates removed from a given array in Java?
//public class sid {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 1, 2, 3, 3, 3};
//        int n = arr.length;
//        int[] temp = new int[n];
//        int count = 0;
//        Arrays.sort(arr);
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (arr[i] != temp[j]) {
//                    temp[count] = arr[i];
//                    count++;
//                }
//            }
//        }
//        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i]);
//        }
//        int j = 0;
//        for(int i = 0 ; i < n - 1 ; i++){
//            if(arr[i] != arr[i+1]){
//                arr[j++] = arr[i];
//            }
//        }
//        arr[j++] = arr[n-1];
//
//        for( int i = 0 ; i < j ; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}

//How do you reverse an array in place in Java?

//public class sid {
//    public static void main(String[] args) {
//        int arr[] = {1 , 2 , 3, 4,5};
//        int n = arr.length;
//        int temp;
//        for ( int i = 0 ; i < n / 2 ; i++){
//            temp = arr[i];
//            arr[i] = arr[n - i - 1];
//            arr[n - i - 1] = temp;
//        }
//        for ( int i = 0 ; i < n ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//How do you print duplicate characters from a string?
//public class sid {
//    public static void main(String[] args) {
//        String str = "sidddadraaabbbbcccctha";
//        int n = str.length();
//        int count;
//        for (int i = 0; i < n; i++) {
//            count = 0;
//            for (int j = 0; j < i; j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//            if (count == 1) System.out.println(str.charAt(i));
//        }
//    }
//}

//How do you print the first non-repeated character from a string?
//How are duplicate characters found in a string?
//
//public class sid {
//    public static void main(String[] args) {
//
////        for (int i = 0; i < n; i++) {
////            int count = 0;
////            for (int j = 0; j < i; j++) {
////                if (str.charAt(i) == str.charAt(j)) {
////                    count++;
////                }
////            }
////            if (count == 1) {
////                System.out.println(str.charAt(i));
////            }
////        }
//        String str = "aabb";
//        int n = str.length();
//        HashMap<Character,Integer> freq = new HashMap<>();
//        for( int i = 0 ; i < n ; i++){
//            if(!freq.containsKey(str.charAt(i)))
//            {
//                freq.put(str.charAt(i),1);
//            }
//            else
//            {
//                freq.put(str.charAt(i),freq.get(str.charAt(i))+1);
//            }
//        }
//        int i = 0;
//        for(  i = 0 ; i < n ; i++){
//            if( freq.get(str.charAt(i)) >=2){
//                System.out.println(str.charAt(i));
//
//            }
//        }
//        if(i == n) System.out.println("no repeating character");
//
//    }
//}

//How can a given string be reversed using recursion?
//public class sid {
//    public static void main(String[] args) {
//        String str = "sass";
//        int n = str.length();
//        StringBuffer s2 = new StringBuffer();
//        for(int i = 0 ; i < n ; i++){
//            s2.append(str.charAt(n - i - 1));
//        }
//        System.out.println(s2);
//    }
//}

//How do you check if a string contains only digits?
//public class sid {
//    public static void main(String[] args) {
//        String str = "a1";
//        int n = str.length();
//        int flag = 0;
//        for(int i = 0 ; i < n ; i++){
//            if(!Character.isDigit(str.charAt(i))){
//                flag = 1;
//                break;
//            }
//        }
//        if(flag == 0) System.out.println("only digits");
//        else System.out.println("no");
//    }
//}

//How do you count a number of vowels and consonants in a given string?
//public  class sid {
//    public static void main(String[] args) {
//        String str = "This is a really simple sentence";
//        int n = str.length();
//        int vowel_count = 0;
//        int cons_count = 0;
//
//        for(int i = 0 ; i < n ; i++){
//            str = str.toLowerCase();
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' ||  str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                vowel_count++;
//            }
//            else cons_count++;
//        }
//        System.out.println(vowel_count);
//        System.out.println(cons_count);
//    }
//}

//How do you count the occurrence of a given character in a string?
//public class sid {
//    public static void main(String[] args) {
//        String str = "geeksforgeeks";
//        char ch = 'a';
//        int n = str.length();
//        int count = 0;
//        for( int i = 0 ; i < n ; i++){
//            if(ch == str.charAt(i)) count++;
//        }
//        System.out.println("occurence of " + ch + " is " + count);
//    }
//}


//// 1 2 3 4 5 6
//// 1 2 3 4 6 5
//// 1 2 3 5 4 6
//// 1 2 3 5 6 4
//// 1 2 3 6 4 5
//// 1 2 3 6 5 4
//// 1 2 4 3 5 6
//// 1 2 4 3 6 5
//// 1 2 4 5 6 3
//
//1 2 3 4 3 2
//1 2 4 3
//1 3 2 4
//1 3 4 2
//1 4 2 3                           3
//                                4 5 6
//1 4 3 2
//2 1 3 4
//2 1 4 3
//
//iterate i from n to 1
//if(ar[i] > ar[i -1] )
//    sort(i,n)
//    ar[i-1] =

//interview sum
//public class sid{
//    public static void main(String[] args) {
//        String str = "3bd4ca5d";//
//        char [] arr = str.toCharArray();
//        int n =arr.length;
//        int i=0;
//        while(i<arr.length){
//            int count=0;
//            while(i<n && Character.isDigit(arr[i])){
//                int j = Integer.parseInt(str.substring(i, i+1));
//                count = (count*10) + j;
//                i++;
//            }
//
//            char [] val = new char[5];
//            int j=0;
//            while(i<n && Character.isAlphabetic(arr[i])){
//                val[j++] = arr[i++];
//            }
//            //val[j++] = '\0';
//
//            while(count>0) {
//                System.out.print(new String(val, 0, j));
////                for(int ii=0;ii<j;ii++){
////                    System.out.print(val[ii]);
////                }
//                count--;
//            }
//        }
//
//    }
//}

//Integer to roman
//public  class sid {
//    public static void main(String[] args) {
//        int [] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        int n = 99;
//        StringBuffer next = new StringBuffer();
//        for( int i = 0 ; i < arr.length ; i++){
//            while(n >= arr[i]){
//                n = n - arr[i];
//                next.append(roman[i]);
//            }
//        }
//        System.out.println(next);
//    }
//}

//Roman to integer:
//public  class sid {
//
//    int value(char r)
//    {
//        if (r == 'I')
//            return 1;
//        if (r == 'V')
//            return 5;
//        if (r == 'X')
//            return 10;
//        if (r == 'L')
//            return 50;
//        if (r == 'C')
//            return 100;
//        if (r == 'D')
//            return 500;
//        if (r == 'M')
//            return 1000;
//        return -1;
//    }
//    int function (String str){
//        int sum = 0;
//        int s2 = 0;
//        int s1 = 0;
//        for( int i = 0 ; i < str.length() ; i++){
//             s1 = value(str.charAt(i));
//            if( i + 1 < str.length()){
//                 s2 = value(str.charAt(i+1));
//                if(s1 >= s2){
//                sum = sum + s1;
//                }
//                else
//                {
//                sum = sum - s1;
//                }
//            }
//            else
//                sum = sum + s1;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        sid answer = new sid();
//        String str = "MCMIV";
//        System.out.println(answer.function(str));
//    }
//}

//Top 50 Array Coding Problems for Interviews

//Peak Element
//public class sid {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,8,4,5,6,11,5};
//        for( int i = 1 ; i < arr.length - 1 ; i++){
//            if(arr[i] > arr[i - 1] && arr[i] > arr[ i + 1]){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//    }
//}
//Sort numbers
//public  class sid {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        for( int i = 0 ; i < arr.length - 1 ; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                int temp = 0;
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//        }
//        for( int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}
//Find the Kth largest and Kth smallest number in an array
//    public  class sid {
//    public static void main(String[] args) {
//        int[] arr = {9,5,3,1,2,5,8,6,4,7};
//        int k = 4;
//        int n = arr.length;
//        Arrays.sort(arr);
//        System.out.println("smallest 4 the num is "+arr[k-1]);
//        System.out.println("largest 4th num is "+arr[n - k ]);
//    }
//}
//Find the occurrence of an integer in the array
//public  class sid {
//    public static void main(String[] args) {
//        int[] arr = {2,2,3,3,3,4,4,4,4,5,1, 1, 1, 1, 1,8,8};
//        Map<Integer,Integer> table = new HashMap<>();
//        for( int i = 0 ; i <arr.length ; i++){
//            if(!table.containsKey(arr[i]))
//                 table.put(arr[i],1);
//            else
//            {
//                table.put(arr[i],table.get(arr[i]) + 1 );
//            }
//        }
//      for(Map.Entry<Integer,Integer> values : table.entrySet()){
//          System.out.println(values.getKey() + " " + values.getValue());
//      }
//    }
//}

//Sort an array of 0s, 1s and 2s

//public class sid {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        int c_0 = 0;
//        int c_1 = 0;
//        int c_2 = 0;
//        for( int i = 0 ; i < arr.length ; i++){
//            switch (arr[i]) {
//                case 0:
//                    c_0++;
//                    break;
//                case 1:
//                    c_1++;
//                    break;
//                case 2:
//                    c_2++;
//                    break;
//            }
//        }
//        int j = 0;
//        while(c_0 > 0){
//            arr[j++] = 0;
//            c_0--;
//        }
//        while(c_1 > 0){
//            arr[j++] = 1;
//            c_1--;
//        }
//        while(c_2 > 0){
//            arr[j++] = 2;
//            c_2--;
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//public class sid {
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 0, 0, 3, 10, 5};
//        int answer = 7;
//        int flag = 0;
//        for ( int i = 0 ; i < arr.length ; i++){
//            int sum = 0;
//            for( int j = i ; j < arr.length ; j++){
//                    sum = sum + arr[j];
//                    if(sum == answer) {
//                        System.out.println(i);
//                        System.out.println(j);
//                        flag = 1;
//                    }
//                }
//            }
//        if(flag == 0) System.out.println("no subarray");
//        }
//    }

//public class sid {
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,8,9,4};
//        Set<Integer> nums = new HashSet<>();
//        for(int i = 0 ; i < arr1.length ; i++){
//            nums.add(arr1[i]);
//        }
//        for(int i = 0 ; i < arr2.length ; i++){
//            nums.add(arr2[i]);
//        }
//        System.out.println(nums.size());
//        System.out.println(nums.toString());
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < arr1.length ; i++){
//            map.put(arr1[i],1);
//        }
//        for(int i = 0 ; i < arr2.length ; i++){
//            if(map.containsKey(arr2[i])){
//                System.out.println(arr2[i]);
//            }
//        }
//    }
//}

//public class sid {
//    public static void main(String[] args) {
//        int[] arr = {-1, 7, -3, -4, 9, 10, -1, 11};
//        for( int i = 0 ; i < arr.length ; i++){
//            int temp = 0;
//            for( int j = 0 ; j < arr.length - 1  ; j++){
//                if(arr[j] < 0 && arr[j + 1] > 0){
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        for( int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//        }
//    }

//Common elements

//public  class sid {
//    public static void main(String[] args) {
//        int[] arr1 = {1, 5, 10, 20, 40, 80};
//        int[] arr2 = {100,20,80,11};
//        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
//        HashMap<Integer,Integer> map1 = new HashMap<>();
//        HashMap<Integer,Integer> map2 = new HashMap<>();
//        for(int i = 0 ; i < arr1.length ; i++){
//            map1.put(arr1[i],i);
//        }
//        for(int i = 0 ; i < arr2.length ; i++){
//            map2.put(arr2[i],i);
//        }
//        for(int i = 0 ; i < arr3.length ; i++){
//            if(map2.containsKey(arr3[i])) {
//                if (map1.containsKey(arr3[i])) {
//                    System.out.println(arr3[i]);
//                }
//            }
//        }
//    }
//}

//Subarray with 0 sum

//public  class sid {
//    public static void main(String[] args) {
//        int[] arr = {4,2,-3,1,6};
//        for( int i = 0 ; i < arr.length ; i++){
//            int sum = 0;
//            sum = sum + arr[i];
//            for( int j = i + 1 ; j < arr.length ; j++){
//                sum = sum + arr[j];
//                if(sum == 0){
//                    System.out.println(i);
//                    System.out.println(j);
//                    for( int k = i ; k < j + 1 ; k++){
//                        System.out.println(arr[k]);
//                    }
//                }
//            }
//        }
//    }
//}

//Largest Sum Contiguous Subarray

//public  class sid {
//    public static void main(String[] args) {
//        int[] arr = {-2, -3, 4, 0, -2, 1, 5, 3};
//        int best = 0;int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum =  arr[i];
//            for( int j = i + 1 ; j < arr.length ; j++){
//                sum = sum + arr[j];
//                best = Math.max(sum,best);
//            }
//        }
//        for( int i = 0 ; i < arr.length ; i++){
//            sum = Math.max(arr[i],sum + arr[i]);
//            best = Math.max(best,sum);
//        }
//
//        System.out.println(best);
//    }
//}
//Maximum Product Subarray
public  class sid {
    public static void main(String[] args) {
        int[] arr = {-1, -3, -10, 0, 20};
        int product = 1;
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            product = arr[i];
            best = Math.max(best,arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                product = product * arr[j];
                best = Math.max(product,best);
            }
        }

//        for( int i = 0 ; i < arr.length ; i++){
//           product = Math.max(arr[i],product * arr[i]);
//            best = Math.max(best,product);
//       }
        System.out.println(best);
    }
    }
//    maximum occurring character in a given String

//public class sid {
//    public static void main(String[] args) {
//        String str = "aaabbbcccccc";
//        int n = str.length();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for( int i = 0 ; i < n ; i++){
//            if(!map.containsKey(str.charAt(i))){
//                map.put(str.charAt(i),1);
//            }
//            else
//                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
//            }
//        int k = 0;
//        for(Map.Entry<Character,Integer> values : map.entrySet()){
//            System.out.println(values.getKey() + "  " + values.getValue());
//            k = Math.max(values.getValue(),0);
//        }
//        System.out.println(k);
//
//    }
//    }

//remove duplicates from a given string
// public class sid {
//    public static void main(String[] args) {
//        String str = "aabbcccdde";
//        int n = str.length();
//        Set<Character> set = new HashSet<>();
//        for(int i = 0 ; i < n ; i++){
//            set.add(str.charAt(i));
//        }
//        System.out.println(set.toString());
//        for(int i = 0 ; i < n ; i++){
//            int count = 0 ;
//            for (int j = 0 ; j < i ; j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    count++;
//                }
//            }
//            if(count == 1) System.out.println(str.charAt(i));
//        }
//    }
//}

//public class sid {
//    public static void main(String[] args) {
//        String str1 = "india is great";
//        int n = str1.length();
//        String str2 = "in";
//        int m = str2.length();
//        StringBuilder check = new StringBuilder(str1);
//        int o = check.length();
//        System.out.println(o);
//        for( int i = 0 ; i < m ; i++){
//            for(int j = 0 ; j < o ; j++){
//                if(str2.charAt(i) == check.charAt(j))
//                {
//                    check.deleteCharAt(j);
//                    o--;
//                }
//            }
//        }
//        System.out.println(check);
//    }
//}

//public class sid {
//    public static void main(String[] args) {
//        String str1 = "india";
//        int n = str1.length();
//        StringBuilder check = new StringBuilder();
//        for(int i = 0 ; i < n  ; i++){
//            check.append(str1.charAt(n - i - 1));
//        }
//        System.out.println(check);
//    }
//}

//public class sid {
//    public static void main(String[] args) {
//        String str1 = "india";
//        int m = str1.length();
////        for( int i = 0 ; i < n ; i++){
////            int count = 0 ;
////            for( int j = 0 ; j < i ; j++){
////                if(str1.charAt(i) == str1.charAt(j)){
////                    count++;
////                }
////            }
////
////        }
//                String str = "aafbbc";
//        int n = str.length();
//        HashMap<Character,Integer> freq = new HashMap<>();
//        for( int i = 0 ; i < n ; i++){
//            if(!freq.containsKey(str.charAt(i)))
//            {
//                freq.put(str.charAt(i),1);
//            }
//            else
//            {
//                freq.put(str.charAt(i),freq.get(str.charAt(i))+1);
//            }
//        }
//        int i = 0;
//        for(  i = 0 ; i < n ; i++){
//            if( freq.get(str.charAt(i)) == 1){
//                System.out.println(str.charAt(i));
//                break;
//            }
//        }
//        if(i == n) System.out.println("no repeating character");
//
//    }
//}

//Convert String to integer
//public class sid {
//    public static void main(String[] args) {
//        String str = "1a2bc";
//        int n = str.length();
//        char[] arr = str.toCharArray();
//        StringBuilder check = new StringBuilder();
//        int sum = 0;
//        int k =0;
//        for( int i = 0 ; i < arr.length ; i++) {
//            if(Character.isDigit(arr[i])){
//                 k = Integer.parseInt(str.substring(i,i+1));
//                sum = sum + k;
//            }
//        }
//        System.out.println(sum);
//    }

//        aab - 2:1
//        aabb 2:2
//        aabba  3:2
//                aabbac 3:2:1
//
//        for( i = 0 ; i < str.length(); i++){
//            if(charAt(i) == 'a')
//        }


//  aab - 2:1
//          aabb 2:2
//          aabba  3:2
//          aabbac 3:2:1
//          HashMap<Character,Integer> map = new HashMap<>();
//        int count = 0;
//        for( i = 0 ; i < str.length(); i++)
//
//        if(map.contains(str.charAt(i)))
//        {
//        Map.put(str.charAt(i),1+map.get(str.charAt(i)));
//        }
//        else{
//        Map.put(str.charAt(i),1);
//        }
//        }
//        a - 2
//        b - 1
//        if(map.get(str.charAt(i)).value )
//
//
//
//        Delete table_name where data = 23;

