import java.util.Scanner;

public class Arraydublicate {
    public static boolean hasDuplicates(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        if (hasDuplicates(arr)) {
            System.out.println("Array contains duplicates");
        } else {
            System.out.println("Array does not contain duplicates");
        }

        sc.close();
    }
}