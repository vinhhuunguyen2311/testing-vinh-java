import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // In danh sách
        System.out.println("Danh sach phan tu:");
        for (int number : numbers) {
            System.out.println(number);
        }

        /*Đếm số lần xuất hiện
        System.out.print("Moi ban nhap phan tu can dem: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Gia tri khong co trong mang");
        } else {
            System.out.println("So lan xuat hien la: " + count);
        }
        */
        // max, min
        int maximum = Collections.max(numbers);
        int minimum = Collections.min(numbers);
        System.out.print(maximum + ", " + minimum);



        scanner.close();
    }
}