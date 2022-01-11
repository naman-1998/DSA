import java.util.Scanner;

public class BinarySearch_Iterative {
    public int search(int arr[],int num){
        int len=arr.length;
        int l=0,r=len-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==num)
                return mid;
            else if(num<arr[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch_Iterative bs=new BinarySearch_Iterative();
        int arr[]={3,5,11,23,32,56,122};
        int len=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int result= bs.search(arr, num);
        if(result==-1){
            System.out.println("Element not present in the array");
        }
        else{
            System.out.println("Element present at"+result);
        }
    }
}
