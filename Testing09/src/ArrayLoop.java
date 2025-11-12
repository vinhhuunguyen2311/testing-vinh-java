import java.util.Scanner;

public class ArrayLoop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu ");
        int n = scanner.nextInt();



        int[] listInt = new int[n];
        // nhap so nguyen vao trong listInt
        for( int i = 0; i < n; i++){
            listInt[i] = scanner.nextInt();
        }
    /*in mang
    for(int i=0; i< n; i++){
       System.out.print(listInt[i]);

    }

    int sum = 0;
    for( int i=0; i < n; i++){
        sum += listInt[i];
    }
    System.out.print("tong mang la "+ sum);

    int max= listInt[0];
    int min= listInt[0];
    for(int i=1; i<n;i++){
        if(max<listInt[i]) max = listInt[i];
        if(min>listInt[i]) min= listInt[i];
    }
    System.out.println("max "+ max);
    System.out.print("min "+ min);
    */
        int countC=0;
        int countL=0;
        for(int i=0; i<n;i++){
            if(listInt[i]%2==0) {countC ++;}
            else countL ++;
        }
        System.out.println("Chan "+ countC);
        System.out.print("Le "+ countL);
    }


}