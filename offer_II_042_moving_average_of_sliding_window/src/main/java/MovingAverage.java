/**
 * 求滑动窗口的平均值，使用栈的思想来实现
 */
public class MovingAverage {

    /** Initialize your data structure here. */
    private int sum;
    private int elementSize;
    private int[] window;



    public MovingAverage(int size) {
        window = new int[size];
    }

    public double next(int val) {

        elementSize++;
        sum += val;
        if (elementSize <= window.length) { //栈不满时直接求和并按照实际元素个数求均值
            window[elementSize - 1] = val;
            return (double) sum/elementSize;
        } else {      //栈满时需要将第一个数出栈，再将新值插入到最后
            int head = window[0];
            for (int i = 0; i < window.length-1; i++) {
                window[i] = window[i+1];
            }
            window[window.length - 1] = val;
            sum -= head;
            return (double) sum/ window.length;
        }
    }


    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        double a = movingAverage.next(1);
        System.out.println(a);
        double b = movingAverage.next(10);
        System.out.println(b);
        double c = movingAverage.next(3);
        System.out.println(c);
        double d = movingAverage.next(5);
        System.out.println(d);

    }

}
