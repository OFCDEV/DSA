package Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6,7};
        findAllIndex(arr, 5, 0);
        System.out.println(list);
        System.out.println(find(arr, 5, 0));
        System.out.println(findIndex(arr, 5, 0));
        System.out.println(findAllIndexList(arr, 5, 0,new ArrayList<>()));

    }
    static boolean find(int arr[],int target,int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int arr[],int target,int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
    }
    static int findFromLast(int arr[],int target,int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else{
            return findFromLast(arr, target, index-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[],int target,int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    //ArrayList as a return type
    static ArrayList<Integer> findAllIndexList(int arr[],int target,int index,ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexList(arr, target, index+1, list);
    }
}
