import java.util.Scanner;

public class BinarySearch_Recursive {

    public int search(int[] arr,int l,int r,int num){
        if(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==num)
                return mid;
            if(num<arr[mid]){
                return search(arr,l,mid-1,num);
            }
            return search(arr,mid+1,r,num);
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch_Recursive bs=new BinarySearch_Recursive();
        int[] arr ={3,5,11,23,32,56,122};
        int len=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int result= bs.search(arr,0,len-1,num);
       if(result==-1){
           System.out.println("Element not present in the array");
       }
       else{
           System.out.println("Element present at"+result);
       }
    }
}
