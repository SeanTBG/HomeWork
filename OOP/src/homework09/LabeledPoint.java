package homework09;

/**
 * @author: Sean
 * @date: 2024/10/20
 * @project: HomeWork
 */
public class LabeledPoint extends Point {
    private String label;
    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void printInfo() {
        System.out.println("坐标为：" + getX() + "," + getY() + "，标签为：" + label);
    }
}
