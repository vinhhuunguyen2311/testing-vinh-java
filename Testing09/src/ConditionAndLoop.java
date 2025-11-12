import java.util.Scanner;

public class ConditionAndLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        
        System.out.print("Mời bạn nhập số nguyên: ");
        int number = sc.nextInt();
        // Kiểm tra chẵn lẻ
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn");
        } else {
            System.out.println("Số " + number + " là số lẻ");
        }

        // Kiểm tra dương, âm, hoặc 0
        if (number > 0) {
            System.out.println("Số " + number + " là số dương");
        } else if (number < 0) {
            System.out.println("Số " + number + " là số âm");
        } else {
            System.out.println("Số " + number + " là số 0");
        }
        // Kiểm tra số lớn nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = sc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = sc.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int num3 = sc.nextInt();

        int max = num1; // giả sử num1 là lớn nhất ban đầu

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("Số lớn nhất là: " + max);
        */
        
        /* Tính tiền taxi
        km đầu tiên: 15.000đ/km
        km thứ 2: 12.000/km
        
        System.out.print("Nhập số km: ");
        float numKM = sc.nextFloat();
        int cost;

        if (numKM <= 1) {
            cost = 15000;
        } else {
            cost = 15000 + (int)(numKM - 1) * 12000;
        }
        System.out.println("Giá cước taxi là: " + cost + " đồng");
        */
        /*loop  */
        /* Tính tổng từ 1 - 100
        int sum=0;
        for (int i =1; i<=100;i++){
        sum = sum+i;
        }
        System.out.println("Tong tu 1 den 100: " + sum);
        */
        /* Tính tổng số chẵn từ 1 - 100
        
        int sum=0;
        for (int i =2; i<=100;i= i+2){
        sum = sum+i;
        }
        System.out.println("Tong so chan tu 1 den 100: " + sum);
        
        
        */
        /* in bang cuu chuong*/
        System.out.print("Mời bạn nhập số nguyên cho bảng cửu chương:  ");
        int n = sc.nextInt();
        int multi = 0;
        for (int i =1; i<=10;i= i+1) {
            multi = n * i;
            System.out.println(n + " * " + i + " = " + multi);

        }
        sc.close(); // đóng Scanner để tránh rò rỉ tài nguyên
    }
}