import java.util.Scanner;

public class mang2chieu {
    // Hàm nhập ma trận
    public static int[][] nhapMaTran(int n, int m, Scanner sc) {
        int[][] a = new int[n][m];
        System.out.println("Nhap ma tran " + n + "x" + m + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    // Hàm in ma trận
    public static void inMaTran(int[][] a) {
        System.out.println("Ma tran:");
        for (int[] row : a) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }

    // Tìm phần tử nhỏ nhất
    public static int timMin(int[][] a) {
        int min = a[0][0];
        for (int[] row : a) {
            for (int x : row) {
                if (x < min) min = x;
            }
        }
        return min;
    }

    // Tìm phần tử lẻ lớn nhất
    public static Integer timLeMax(int[][] a) {
        Integer max = null;
        for (int[] row : a) {
            for (int x : row) {
                if (x % 2 != 0) {
                    if (max == null || x > max) {
                        max = x;
                    }
                }
            }
        }
        return max;
    }

    // Tìm dòng có tổng lớn nhất
    public static int dongTongMax(int[][] a) {
        int dongMax = 0;
        int tongMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int tong = 0;
            for (int j = 0; j < a[i].length; j++) {
                tong += a[i][j];
            }
            if (tong > tongMax) {
                tongMax = tong;
                dongMax = i;
            }
        }
        return dongMax;
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Tính tổng các số không phải số nguyên tố
    public static int tongKhongNguyenTo(int[][] a) {
        int tong = 0;
        for (int[] row : a) {
            for (int x : row) {
                if (!laSoNguyenTo(x)) tong += x;
            }
        }
        return tong;
    }

    // Hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so dong n = ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot m = ");
        int m = sc.nextInt();

        int[][] a = nhapMaTran(n, m, sc);

        inMaTran(a);

        System.out.println("Phan tu nho nhat: " + timMin(a));

        Integer leMax = timLeMax(a);
        if (leMax != null) {
            System.out.println("Phan tu le lon nhat: " + leMax);
        } else {
            System.out.println("Khong co phan tu le trong ma tran.");
        }

        int dongMax = dongTongMax(a);
        System.out.println("Dong co tong lon nhat la dong: " + dongMax);

        System.out.println("Tong cac so khong phai nguyen to: " + tongKhongNguyenTo(a));
    }
}
