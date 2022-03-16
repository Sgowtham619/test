//import java.util.HashMap;
//import java.util.LinkedHashMap;
//public class Test {
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {4,5,6,7,8};
//        int[] arr3 = new int[];
//        int[] arr4 = new int[100];
//        int k = 0;
//        for( int i = 0 ; i < arr2.length ; i++){
//            for( int j = 0 ; j < arr1.length ; j++){
//                if(arr2[i] == arr1[j]){
//                    arr3[k++] = arr2[i];
//                }
//            }
//        }
//        for( int i = 0 ; i < arr3.length ; i++){
//            System.out.println(arr3[i]);
//        }
//        int m = 0;
//        for( int i = 0 ; i < arr1.length ; i++){
//            for( int j = 0 ; j < arr2.length ; j++){
////                if(arr3[i] != arr1[j]){
////                    arr4[m++] = arr1[j];
////                }
////                if(arr3[i] != arr2[j]){
////                    arr4[m++] = arr2[j];
////                }
//                if(arr1[i] != arr2[j]){
//                }
//            }
//        }
//        for( int i = 0 ; i < arr4.length ; i++){
//            System.out.println(arr4[i]);
//        }
//    }
//}

//Peak Element
// public  class Test {
//    public static void main(String[] args) {
//        int[] A = {4,1,8,5};
//        int n = A.length;
//        if(n == 1) System.out.println(A[0]);
//        else if(A[0] > A[1]) System.out.println(A[0]);
//        else if(A[n - 1] >= A[n - 2]) System.out.println(A[n - 1]);
//        else {
//            for (int i = 1; i < n - 1; i++) {
//                if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
//                    System.out.println(A[i]);
//                }
//            }
//        }
//    }
//}

//Find minimum and maximum element in an array

//public class Test {
//    public static void main(String[] args) {
//        int[] A = {3, 2, 1, 56, 10000, 167};
//        int n = A.length;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0 ; i < n ; i++){
//            if(A[i] > max) max = A[i];
//            if(A[i] < min) min = A[i];
//        }
//        System.out.println(max);
//        System.out.println(min);
//    }
//}

//Write a program to reverse the array

//public class Test {
//    public static void main(String[] args) {
//        int [] a = {1,2,3,4,5};
//        int n = a.length;
//        int [] temp = new int[5];
//        int k = 0;
//        for( int i = 0 ; i < n ; i++){
//            temp[k] = a[n - i - 1];
//            k++;
//        }
//        for(int i = 0 ; i < temp.length ; i++)
//            System.out.println(temp[i]);
//        int temp = 0;
//        for( int i = 0 ; i < n / 2 ; i++){
//            temp = a[i];
//            a[i] = a[n - 1 - i];
//            a[n - i - 1] = temp;
//        }
//        for(int i :a)
//        System.out.println(i);
//    }
//}

//Sort an array

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {5,4,3,8,2,1,7};
//        int n = a.length;int temp = 0;
//        for( int i = 0 ; i < n ; i++){
//            for( int j = 0 ; j < n - 1 ; j++){
//                if(a[j] > a[j + 1]){
//                    temp = a[j];
//                    a[j] = a[j + 1] ;
//                    a[j + 1] = temp;
//                }
//            }
//        }
//        for( int i : a) System.out.println(i);
//    }
//}

//Find the Kth largest and Kth smallest number in an array

//import java.util.Arrays;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {6,5,4,3,2,1};
//        int n = arr.length;
//        int k = 2;
//        Arrays.sort(arr);
//        System.out.println(arr[k - 1]);
//        System.out.println(arr[n - k]);
//        Set<Integer> set = new TreeSet<>();
//        for(int i : arr) set.add(i);
//        System.out.println(set);
//    }
//}

//Frequency of numbers in array

import java.util.*;

//public class Test {
//    public static void main(String[] args) {
//        int[] a = { 1,1,1,1};
//        int n = a.length;
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < n ; i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }
//            else
//                map.put(a[i],1);
//        }
//        for(Map.Entry<Integer,Integer> values : map.entrySet()){
//            System.out.println(values.getKey() + " " + values.getValue());
//        }
//    }
//}

//Sort an array of 0s, 1s and 2s
//
//public class Test {
//    public static void main(String[] args) {
//        int [] a = {0,2,1,2,0};
//        int n = a.length;
//        Map<Integer,Integer> map = new HashMap<>();
//        for( int i = 0 ; i < n ; i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i]) + 1);
//            }
//            else map.put(a[i],1);
//        }
////        for(Map.Entry<Integer,Integer> values : map.entrySet()){
////            System.out.println(values.getKey() + " " + values.getValue());
////        }
//        for( int i = 0 ; i < n ;i++){
//          int count = map.get(a[i]);
//          while(count > 0){
//              System.out.println();
//          }
//        }
//
//        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
//        for (i = 0; i < n; i++) {
//            switch (a[i]) {
//                case 0:
//                    cnt0++;
//                    break;
//                case 1:
//                    cnt1++;
//                    break;
//                case 2:
//                    cnt2++;
//                    break;
//            }
//        }
//        int j = 0;
//        while (cnt0 > 0){
//            a[j++] = 0;
//            cnt0--;
//        }
//        while (cnt1 > 0){
//            a[j++] = 1;
//            cnt1--;
//        }
//        while (cnt2 > 0){
//            a[j++] = 2;
//            cnt2--;
//        }
//        for(int k :a)
//        System.out.println(k);
//    }
//}

//Subarray with given sum

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {7,1,2,3,4,5,6,7,8,9,10};
//        int n = a.length;
//        int sum = 15;
//        for (int i = 0; i < n; i++) {
//            int target = a[i];
//            for (int j = i + 1; j < n; j++) {
//                target = target + a[j];
//                if (target == sum) {
//                    System.out.println(i + 1);
//                    System.out.println(j + 1);
//                    break;
//                }
//            }
//        }
//        int i = 0;int target = 0;
//        while( i < n)
//            if(a[i] + a[i + 1] > sum) i = i + 1;
//            else if(a[i] + a[i + 1] < sum) {
//                target = a[i] + a[i + 1];
//                i++;
//            }
//            else if(target == sum) {
//                System.out.println();
//            }
//        }
//    }

//Move all negative elements to end

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1, -1, 3, 2, -7, -5, 11, 6};
//        int n = a.length;
//        int[] temp = new int[n];
//        int j = 0;
//        for( int i = 0 ; i < n ; i++){
//            if(a[i] > 0){
//                temp[j++] = a[i];
//            }
//        }
//        for(int i = 0 ; i < n ; i++){
//            if(a[i] < 0) temp[j++] = a[i];
//        }
//        for(int i : temp) System.out.println(i);
//    }
//}

//Union of two arrays
//
//public  class Test {
//    public static void main(String[] args) {
//        int[] a1 = {1,2 ,3 ,4 ,5};
//        int n = a1.length;
//        int[] a2 = {4,5,6,7,8};
//        int m = a2.length;
//        Set<Integer> set = new HashSet<>();
//        for( int i = 0 ; i< n ; i++){
//            set.add(a1[i]);
//        }
//        for(int i = 0 ; i < m ; i++){
//            if(set.contains(a2[i])){
//                System.out.println(a2[i]);
//            }
//            else
//                set.add(a2[i]);
//        }
//        Object [] ar3 = set.toArray();
//        for(Object i : ar3) System.out.println(i);
//    }
//}

//Write a program to cyclically rotate an array by one

//public class Test {
//    public static void main(String[] args) {
//    int[] a = {1,2,3,4,5};
//    int n = a.length;
//    int x = a[n - 1];
//    for( int i = n-1 ; i > 0 ; i--){
//        a[i] = a[i - 1];
//    }
//    a[0] = x;
//    for(int i : a) System.out.println(i);
//    }
//}

//Missing number in array

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1,2,3,5};
//        int n = a.length;
//        int x = n + 1 ;
//        int sum = 0;
//        int add = 0;
//        for( int i = 0 ; i < n ; i++){
//            add = add + a[i];
//        }
//        sum = (x * (x + 1)) / 2 ;
//        int y = sum - add;
//        System.out.println(y);
//    }
//}

//Count pairs with given sum

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1, 1, 1, 1};
//        int n = a.length;
//        int k = 2;
//        int count = 0;
//        for( int i = 0 ; i < n ; i++){
//            for(int j = i + 1 ; j < n ; j++){
//                if(a[i] + a[j] == k){
//                    count++;
//                    System.out.println(a[i]);
//                    System.out.println(a[j]);
//                }
//            }
//        }
//        System.out.println("pairs" + count);
//    }
//}

//Find duplicates in an array

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1,1,2};
//        int n = a.length;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for( int i = 0 ; i < n ; i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i]) + 1);
//            }
//            else
//                map.put(a[i],1);
//        }
////        for(int i = 0 ; i < n ; i++){
////            if(map.get(a[i]) > 1){
////                System.out.println(a[i] + " " + map.get(a[i]));
////            }
////        }
//        for(Map.Entry<Integer,Integer> values : map.entrySet()){
//            if(values.getValue() > 1)
//            System.out.println(values.getKey() + " " + values.getValue());
//        }
//    }
//}

//Find duplicates in an array

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1,1,1,1,2,2,2};
//        int n = a.length;
//        for( int i = 0 ; i < n ; i++){
//            int count = 0;
//            for( int j = 0 ; j < i ; j++){
//                if(a[i] == a[j]){
//                    count++;
//                }
//            }
//            if(count >=1) System.out.println(a[i]);
//        }
//    }
//}

//Find common elements in three sorted arrays

//public class Test {
//    public static void main(String[] args) {
//        int n1 = 6; int [] A = {1, 5, 10, 20, 40, 80};
//        int n2 = 5; int[] B = {6, 7, 20, 80, 100};
//        int n3 = 8; int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
//
//        Set<Integer> set = new HashSet<>();
//        for( int i = 0 ; i < n2 ; i++){
//            set.add(B[i]);
//        }
//        for( int i = 0 ; i < n3 ; i++){
//            set.add(C[i]);
//        }
//        for( int i = 0 ; i < n1 ; i++){
//            if(set.contains(A[i])){
//                System.out.println(A[i]);
//            }
//        }
//    }
//}

//Find common elements in three sorted arrays

//public class Test {
//    public static void main(String[] args) {
//        int n1 = 6;
//        int[] A = {1, 5, 10, 20, 40, 80};
//        int n2 = 5;
//        int[] B = {6, 7, 20, 80, 100};
//        int n3 = 8;
//        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
//        int i = 0 ; int j = 0 ; int k = 0;
//        while(i < n1 && j < n2 && k < n3){
//            if(A[i] == B[j] && B[j] == C[k]){
//                System.out.println(A[i]);
//                i++;j++;k++;
//            }
//            else if(A[i] < B[j]) i++;
//            else if (B[j] < C[k]) j++;
//            else k++;
//        }
//    }
//}

//Find common elements in two sorted arrays

//public class Test {
//    public static void main(String[] args) {
//        int n1 = 6;
//        int[] A = {1, 5, 10, 20, 40, 80};
//        int n2 = 5;
//        int[] B = {6, 7, 20, 80, 100};
//        int i = 0 ; int j = 0;
//        while( i < n1 && j < n2){
//            if(A[i] == B[j]) {
//                System.out.println(A[i]);
//                i++;
//                j++;
//            }
//            else if(A[i] < B[j]) i++;
//            else j++;
//        }
//    }
//}

//factorial sum

//public  class Test {
//    static int factorial(int n){
//        if( n == 1) return  1;
//        else return n * factorial(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 4;
//        int pro = 1;
//        System.out.println(factorial(4));
//        for( int i = 1 ; i <= n ; i++){
//            pro = pro * i ;
//        }
//        System.out.println(pro);
//        }
//    }

//How are duplicates removed from a given array in Java?
//
//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1, 1, 1, 2, 2, 2, 3, 4, 4};
//        int n = a.length;
//        int[] temp = new int[n];
//        int j = 0;
//
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] != a[i + 1]) {
//                temp[j++] = a[i];
//            }
//        }
//        temp[j++] = a[n - 1];
//        n = j;
//        for (int i = 0; i < j; i++) {
//            a[i] = temp[i];
//        }
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//    }
//}
//}

// Java Program to Remove Duplicate Elements
// From the Array using extra space

//public class Test {
//
//    public static int removeduplicates(int a[], int n)
//    {
//        int[] temp = new int[n];
//        int j = 0;
//
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] != a[i + 1]) {
//                temp[j++] = a[i];
//            }
//        }
//        temp[j++] = a[n - 1];
//        for (int i = 0; i < j; i++) {
//            a[i] = temp[i];
//        }
//        return j;
//    }
//    public static void main(String[] args)
//    {
//        int a[] = { 1,1,1,2,2,3,3,4 };
//        int n = a.length;
//        n = removeduplicates(a, n);
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//    }
//}

//First Repeating Element

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1, 5, 3, 4, 3, 5, 6};
//        int n = a.length;
//        int flag = 0;
//        for( int i = 0 ; i < n ; i++){
//            int count = 0;
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] == a[j])
//                {
//                    System.out.println(a[i]);
//                    flag = 1;
//                }
//            }
//            if(flag == 1) break;
//        }
//    }
//}

//First Repeating Element(Hashing)

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1,1,1, 5,5, 3,3, 4, 3, 5, 6};
//        int n = a.length;
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < n ; i++){
//            if(!map.containsKey(a[i])){
//                map.put(a[i],1);
//            }
//            else
//                map.put(a[i],map.get(a[i]) + 1);
//        }
//       for(int i = 0 ; i < n ; i++){
//           if(map.get(a[i]) > 1){
//               System.out.println(a[i]);
//               break;
//           }
//       }
//    }
//}

//Non-Repeating Element

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {-1, 2, -1,8,3, 2};
//        int n = a.length;
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < n ; i++){
//            if(!map.containsKey(a[i])){
//                map.put(a[i],1);
//            }
//            else
//                map.put(a[i],map.get(a[i]) + 1);
//        }
//        for(Map.Entry<Integer,Integer> values : map.entrySet()){ we shouldnot use map to iterate
//            if(values.getValue() == 1){
//                System.out.println(values.getKey());
//                break;
//            }
//        }
//        for( int i = 0 ; i < n ; i++){
//            if(map.get(a[i]) == 1){
//                System.out.println(a[i]);
//                break;
//            }
//        }
//    }
//}

//Non-Repeating Element(Error)
//public class Test {
//    public static void main(String[] args) {
//        int[] a = {-1,-1, 2, -1, 8, 3, 2};
//        int n = a.length;
//        for( int i = 0 ; i < n ; i++){
//            int count = 0;
//            for( int j = i + 1 ; j < n ; j++){
//                if(a[i] == a[j]){
//                    count++;
//                }
//            }
//            if(count == 0){
//                System.out.println(a[i]);
//                break;
//            }
//        }
//    }
//}

//Subarrays with equal 1s and 0s

//public class Test {
//    public static void main(String[] args) {
//        int[] a = {1,0,0,1};
//        int n = a.length;
//        int max = 0;
//        for( int i = 0 ; i < n ; i++){
//            int c_0 = 0 ; int c_1 = 0;
//            for( int j = i ; j < n ; j++){
//                if(a[j] == 0) c_0++;
//                if(a[j] == 1) c_1++;
//                if(c_0 == c_1){
//                    max = Math.max(max,j - i + 1);
//                }
//            }
//        }
//        System.out.println(max);
//    }
//}

public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 15;
        int n = a.length;
        int flag = 0;
        for( int  i = 0 ; i < n ; i++){
            int tar = a[i];
            for( int j = i + 1 ; j < n ; j++){
                tar = tar + a[j];
                if(sum == tar){
                    System.out.println(i + 1);
                    System.out.println(j + 1);
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) break;
        }
    }
}
