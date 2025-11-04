import java.util.Scanner;

// Lớp Điểm
class Diem {
    protected int x, y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap x: ");
        x = sc.nextInt();
        System.out.print("Nhap y: ");
        y = sc.nextInt();
    }

    public void xuat() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

// Lớp Điểm Màu kế thừa Điểm
class DiemMau extends Diem {
    private int mau;

    public DiemMau() {
        super();
        this.mau = 0;
    }

    public DiemMau(int x, int y, int mau) {
        super(x, y);
        this.mau = mau;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap mau (int): ");
        mau = sc.nextInt();
    }

    @Override
    public void xuat() {
        System.out.println("(" + x + ", " + y + "), Mau = " + mau);
    }

    public int getMau() {
        return mau;
    }
}

// Lớp Đoạn Thẳng
class DoanThang {
    private final DiemMau d1;
    private final DiemMau d2;

    public DoanThang() {
        d1 = new DiemMau();
        d2 = new DiemMau();
    }

    public void nhap(Scanner sc) {
        System.out.println("Nhap diem thu nhat:");
        d1.nhap(sc);
        System.out.println("Nhap diem thu hai:");
        d2.nhap(sc);
    }

    public void xuat() {
        System.out.println("Diem thu nhat:");
        d1.xuat();
        System.out.println("Diem thu hai:");
        d2.xuat();
    }

    public double tinhKhoangCach() {
        return Math.sqrt(Math.pow(d1.x - d2.x, 2) + Math.pow(d1.y - d2.y, 2));
    }

    public boolean cungMau() {
        return d1.getMau() == d2.getMau();
    }
}

// Hàm main để test
public class kethua{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DoanThang dt = new DoanThang();

            dt.nhap(sc);
            dt.xuat();

            System.out.println("Khoang cach giua 2 diem = " + dt.tinhKhoangCach());

            if (dt.cungMau())
                System.out.println("Hai diem cung mau");
            else
                System.out.println("Hai diem khac mau");
        }
    }
}

