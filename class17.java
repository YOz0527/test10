class Car {
    protected String owner;
    protected String id;

    // 有引數的建構元
    public Car(String own, String s) {
        owner = own;
        id = s;
    }

    void show() {
        System.out.println("車主姓名: " + owner);
        System.out.println("車牌號碼: " + id);
    }
}

// CColor 類別繼承自 Car 類別
class CColor extends Car {
    private String color; // 新增 color 資料成員

    // 建構元，呼叫父類別的建構元
    public CColor(String own, String s, String c) {
        super(own, s); // 呼叫父類別的建構元
        color = c;
    }

    // 改寫父類別的 show() 函數
    public void show() {
        super.show(); // 呼叫父類別的 show() 函數
        System.out.println("車身顏色: " + color);
    }
}

public class class17 {
    public static void main(String[] args) {
        // 建立 CColor 的物件 mycar
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");

        // 呼叫 mycar 的 show() 函數
        mycar.show();
    }
}
