package Input_Output_File.J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String roomType;
    private String roomName;
    private int dailyPrice;
    private float serviceCharge;

    public LoaiPhong(String roomType) {
        String[] str = roomType.split("\\s+");
        this.roomType = str[0];
        this.roomName = str[1];
        this.dailyPrice = Integer.parseInt(str[2]);
        this.serviceCharge = Float.parseFloat(str[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.roomName.compareTo(o.roomName) > 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f", this.roomType, this.roomName, this.dailyPrice, this.serviceCharge);
    }
}
