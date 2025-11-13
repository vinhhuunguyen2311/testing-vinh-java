import java.util.Arrays;

public class Function0911 {

    // tính tổng 2 số nguyên
    public static int sumNumber(int num1, int num2) {
        return num1 + num2;
    }

    // tính tổng các số trong mảng số nguyên
    public static int sumArray(int[] list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    /*
     tìm giá trị lớn thứ 2 trong mảng
     - tham số: mảng số nguyên
     - datatype: int
    */
    public static int find(int[] arr) {

        // kiểm tra mảng có đủ 2 phần tử
        int minVal = Integer.MIN_VALUE; // âm vô cùng
        if (arr == null || arr.length < 2) {
            return minVal;
        }

        Arrays.sort(arr);

        // phần tử lớn nhất
        int largest = arr[arr.length - 1];

        // tìm phần tử khác max
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        return minVal; // trường hợp tất cả phần tử bằng nhau
    }

    /*
     tính tổng các số chẵn từ 1 đến n
     tham số: số nguyên n
     datatype: int
    */
    public static int sumEven(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    /*
     xóa các ký tự lặp lại trong chuỗi
     input: string "progrmming"
     output: string "progamin"
    */
    public static String deleteDuplicates(String input) {

        // kiểm tra null hoặc chuỗi rỗng
        if (input == null || input.isEmpty()) {
            return input;
        }

        String uniqueCharacter = "";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            // nếu uniqueCharacter CHƯA chứa ký tự => thêm vào
            if (!uniqueCharacter.contains(String.valueOf(character))) {
                uniqueCharacter += character;
            }
        }
        return uniqueCharacter;
    }
    /* tim vi tri 2 so trong mang ma tong bang 9
    intput: mang interger
    output: mang interger
    */
    public static int[] findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // nếu không tìm thấy
        return new int[]{-1, -1};
    }
    /*
     đếm số từ trong chuỗi
     tham số: chuỗi string
     datatype: int
    */
    
    /*
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    /*
     in chữ cái đầu mỗi từ
     tham số: string
     datatype: string
    */
    
    /*
    public static String printFirstLetters(String str) {
        if (str == null || str.trim().isEmpty()) return "";

        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.charAt(0)).append(" ");
        }

        return result.toString().trim();
    }

    /*
     tính lương cơ bản:
     lương = ngày công * lương 1 ngày
    */
    /*
    public static int tinhLuong(int ngayCong, int luongNgay) {
        return ngayCong * luongNgay;
    }
    
    */

    public static void main(String args[]) {

        int num1 = 10;
        int num2 = 20;
        int sum = sumNumber(num1, num2);
        System.out.println("Tổng hai số là: " + sum);

        int[] array = {1, 3, 5, 7, 4, 7};
        int sumArray = sumArray(array);
        System.out.println("Tổng mảng là: " + sumArray);

        System.out.println("Bài 2: ");
        int[] arrBai2 = {5, 2, 7, 1};
        int secondLargest = find(arrBai2);
        System.out.println(secondLargest);

        System.out.println("Bài 8: ");
        String input1= "Programming";
        String result1= deleteDuplicates(input1);
        System.out.println(result1);

        System.out.println("Bài 9: ");
        int[] arr = {0, 2, 5, 7, 9};
        int[] result9= findTwoSum(arr, 9);
        System.out.println(Arrays.toString(result9));
        System.out.println(Arrays.toString(result9));
        
/*
        System.out.println("Tổng số chẵn từ 1 đến 10: " + sumEven(10));

        String text = "Hello world from Java";
        System.out.println("Số từ: " + countWords(text));
        System.out.println("Chữ cái đầu: " + printFirstLetters(text));

        System.out.println("Lương: " + tinhLuong(26, 400));
    */
    }
}