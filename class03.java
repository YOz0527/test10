class Caaa {
    public int num1;
    public int num2;

    // 無參數建構元，設定初值為1
    public Caaa() {
        num1 = 1;
        num2 = 1;
    }

    // 有引數建構元，設定 num1 和 num2 的值
    public Caaa(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

class Cbbb extends Caaa {
    // 建構元，呼叫父類別的有引數建構元 Caaa(int a, int b)
    public Cbbb(int a, int b) {
        super(a, b);
    }
}

public class class03 {
    public static void main(String args[]) {
        // 測試 (a) 無參數建構元
        Caaa objA = new Caaa();
        System.out.println("objA.num1: " + objA.num1);
        System.out.println("objA.num2: " + objA.num2);

        // 測試 (b) 有引數建構元
        Caaa objB = new Caaa(3, 5);
        System.out.println("objB.num1: " + objB.num1);
        System.out.println("objB.num2: " + objB.num2);

        // 測試 (c) Cbbb 建構元呼叫 Caaa 有引數建構元
        Cbbb objC = new Cbbb(7, 9);
        System.out.println("objC.num1: " + objC.num1);
        System.out.println("objC.num2: " + objC.num2);
    }
}
