import java.util.Arrays;
import java.util.Scanner;

public class S9 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       int[] num = new int[0];
       while (input.equals("fib") || input.equals("sort") || input.equals("search") || input.equals("getBirthDate")) {
           if ("fib".equals(input)) {
               String str1 = scanner.nextLine();
               fib(Integer.parseInt(str1));
           } else if ("sort".equals(input)) {
               String str1 = scanner.nextLine();
               num = sortNum(str1);
           } else if ("search".equals(input)) {
               String str1 = scanner.nextLine();
               search(num,str1);
           } else {
               String tmp = scanner.nextLine();
               int time = Integer.parseInt(tmp);
               for (int i = 0; i < time; i++) {
                   String str1 = scanner.nextLine();
                   getBirthDate(str1);
               }
           }
           input = scanner.nextLine();
       }
        System.out.println("exit");
        scanner.close();
    }
    private static void fib(int n) {
        int first = 1;
        int second = 1;
        if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        } else {
            for (int i = 2; i < n; i++) {
                int tmp = second;
                second += first;
                first = tmp;
            }
            System.out.println(second);
        }
    }
    private static int[] sortNum(String str) {
        String[] strSplit = str.split(" ");
        int[] num = new int[strSplit.length];
        for (int j = 0; j < strSplit.length; j++) {
            num[j] = Integer.parseInt(strSplit[j]);
        }
        Arrays.sort(num);
        System.out.print("[");
        for (int j = 0;j < num.length - 1; j++) {
            System.out.print(num[j] + ", ");
        }
        System.out.println(num[num.length - 1] + "]");
        String s = "s";
        s.split("2");
        return num;
    }
    private static void search(int[] num,String str) {
        int placeNum = Integer.parseInt(str);
        for (int i = 0; i < num.length; i++) {
            if (num[i] == placeNum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    private static void getBirthDate(String id) {
        System.out.println("" + id.charAt(6) + id.charAt(7) + id.charAt(8) + id.charAt(9) + "-" + id.charAt(10)
                + id.charAt(11) + "-" + id.charAt(12) + id.charAt(13));
    }
}
//import java.util.*;
//public class S9 {
//    static int fn(int n){
//        if ( n==1 )  return 1;
//        else if (n==2) return  1;
//        else if (n>2) return fn(n-1)+fn(n-2);
//        return 0;
//    }
//    static void fib(String bb){
//        int n = Integer.parseInt(bb);
//        for (int i =1;i<=n;i++){
//            System.out.print(fn(i)+" ");
//        }
//        System.out.println();
//    }
//    static int[] sort(String bb){
//        ArrayList a = new ArrayList();
//        String str = bb;
//        StringTokenizer as = new StringTokenizer(str);
//        while ( as.hasMoreTokens() ){
//            a.add(as.nextToken());
//        }
//        int[] qwe = new int [a.size()];
//        for(int k = 0;k<a.size();k++) {
//            qwe[k]=Integer.parseInt(a.get(k).toString());
//        }
//        Arrays.sort(qwe);
//        System.out.println(Arrays.toString(qwe));
//        return qwe;
//    }
//    static void search(String bb,int[] hh){
//        int t = Integer.parseInt(bb);
//        int b =Arrays.binarySearch(hh,t);
//        if(b>=0) System.out.println(b);
//        else System.out.println(-1);
//    }
//    static void getBirthDate(String bb){
//        String ll = bb;
//        System.out.println(ll.substring(6,10)+"-"+ll.substring(10,12)+"-"+ll.substring(12,14));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] nn=new int[100];
//        String ss=sc.nextLine();
//
//        while (ss.equals("")||ss.equals("fib")||ss.equals("sort")||ss.equals("search")||ss.equals("getBirthDate")) {
//
//            if (ss.equals("fib")) fib(sc.nextLine());
//            if (ss.equals("sort")) nn = sort(sc.nextLine());
//            if (ss.equals("search")) search(sc.nextLine(), nn);
//            if (ss.equals("getBirthDate")) {
//                int num = Integer.parseInt(sc.nextLine());
//                for(int i =1;i<=num;i++)
//                    getBirthDate(sc.nextLine());
//            }
//            ss=sc.nextLine();
//        }
//        System.out.println("exit");
//    }
//
//}
