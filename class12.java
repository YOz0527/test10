class CShape {
    public double area() {
        return 0.0;
    }
}

// 圓形類別 CCircle
class CCircle extends CShape {
    private double radius;

    public CCircle(double radius) {
        this.radius = radius;
    }

    // 改寫父類別的 area() 函數，傳回圓形的面積
    public double area() {
        return Math.PI * radius * radius;
    }
}

// 正方形類別 CSquare
class CSquare extends CShape {
    private double side;

    public CSquare(double side) {
        this.side = side;
    }

    // 改寫父類別的 area() 函數，傳回正方形的面積
    public double area() {
        return side * side;
    }
}

// 三角形類別 CTriangle
class CTriangle extends CShape {
    private double base;
    private double height;

    public CTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 改寫父類別的 area() 函數，傳回三角形的面積
    public double area() {
        return 0.5 * base * height;
    }
}

public class class12 {
    // largest() 函數找出最大面積
    public static double largest(CShape[] shapes) {
        double maxArea = 0.0;

        for (CShape shape : shapes) {
            double area = shape.area();
            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // 建立父類別的陣列變數，並使用子類別的實例
        CShape[] shapes = new CShape[6];
        shapes[0] = new CCircle(5.0);
        shapes[1] = new CCircle(3.0);
        shapes[2] = new CSquare(4.0);
        shapes[3] = new CSquare(6.0);
        shapes[4] = new CTriangle(8.0, 6.0);
        shapes[5] = new CTriangle(5.0, 10.0);

        // 使用 largest() 函數找出最大面積
        double maxArea = largest(shapes);

        System.out.println("最大面積為: " + maxArea);
    }
}
