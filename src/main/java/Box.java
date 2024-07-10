public class Box<T> {
    private T number;
    private boolean isEven;

    public Box(T number, boolean isEven) {
        this.number = number;
        this.isEven = isEven;
    }

    @Override
    public String toString() {
        return "Box{" +
                "number=" + number +
                ", isEven=" + isEven +
                '}';
    }
}


