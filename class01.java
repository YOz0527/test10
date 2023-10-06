class Caaa {
    public int num1;
    public int num2;
}

// 子類別 Cbbb 繼承自 Caaa
class Cbbb extends Caaa {
    // 添加 set_num() 函數，設定 num1 和 num2 的值
    public void set_num(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 添加 show() 函數，顯示 num1 和 num2 的值
    public void show() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

public class class01 {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();
    }
}
