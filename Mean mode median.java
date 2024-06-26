import java.util.*;



class operations{

    public int mean(int a[]){

        int sum = 0;

        for(int i = 0;i<a.length;i++){

            sum = sum + a[i];

        }

        return sum/a.length;

    }

    public int median(int a[]){

        int temp;

        for(int i = 0;i<a.length;i++){

            for(int j = i+1;j<a.length;j++){

                if(a[i] > a[j]){

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }

        return a[a.length/2];

    }

    public int mode(int a[]){

        int rep_count = 0;

        int m[] = new int[a.length];





        for(int i = 0;i<a.length;i++){

            rep_count = 0;

            for(int j = i+1;j<a.length;j++){

                if(a[i] == a[j] && a[i] != -1){

                    a[j] = -1;

                    rep_count+=1;

                }

            }

            m[i] = rep_count;

        }

        int mode_ind = 0;

        for(int i = 0;i<a.length;i++){

            if(m[i] >= m[mode_ind]){

                mode_ind = i;

            }

        }

        return a[mode_ind];

    }

}



public class DAY3MEANMEDIANMODE{

    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);

        operations op = new operations();



        System.out.println("Enter Array Size : ");

        int n = sc.nextInt();



        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");

        for(int i = 0;i<n;i++){

            arr[i] = sc.nextInt();

        }



        int mean = op.mean(arr);

        int median = op.median(arr);

        int mode = op.mode(arr);



        System.out.println("MEAN : " + mean);

        System.out.println("MEDIAN  : " + median);

        System.out.println("MODE : " + mode);



    }

}

