//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House house = new House("123 Main st");

        Room livingRoom = new Room("Living Room",25.0);
        Room kitchenRoom = new Room("Kitchen Room", 15.0);
        Room bedroom = new Room("Bed Room",20.0);

        house.addRoom(livingRoom);
        house.addRoom(kitchenRoom);
        house.addRoom(bedroom);

        System.out.println("House address : " + house.getAddress());
        System.out.println("Room in the house");
        for (Room room : house.getRooms()){
            System.out.println(room);
        }

    }

}