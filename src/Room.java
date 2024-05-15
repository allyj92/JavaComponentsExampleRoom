public class Room {
    private String type;
    private double area;

    public Room(String type, double area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", area=" + area +
                '}';
    }
}
