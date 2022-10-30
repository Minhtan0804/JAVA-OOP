package Object_Array.J05029;

public class Query {
    private int low;
    private int up;

    public Query(int low, int up) {
        this.low = low;
        this.up = up;
    }

    public int getLow() {
        return low;
    }

    public int getUp() {
        return up;
    }

    @Override
    public String toString() {
        return String.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:", this.low, this.up);
    }
}
