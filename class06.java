class CTriangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

// CData 類別繼承自 CTriangle 類別
class CData extends CTriangle {
    // CData 類別中的建構元，用來設定 base 和 height 的值
    public CData(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // 新增 area() 函數，計算並印出三角形的面積
    public void area() {
        double area = 0.5 * base * height;
        show(); // 印出 base 和 height 的值
        System.out.println("area=" + area);
    }
}

public class class06 {
    public static void main(String[] args) {
        // 建立 CData 的物件並計算面積
        CData obj = new CData(3, 8);
        obj.area();
    }
}
