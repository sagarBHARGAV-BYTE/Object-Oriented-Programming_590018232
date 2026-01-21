import java.util.Scanner;

class Arraysum {
    public static void main(String [] args){
        int sum,sum_array=0;
        Scanner s = new Scanner(System.in);
        sum = s.nextInt();
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=s.nextInt();
            sum_array += arr[i];
        }
        if (sum==sum_array){
            System.out.println("yes,sum of array is equal to sum");
        }
        else{
            System.out.println("No,sum of array is equal to sum");
        }
    }
}
