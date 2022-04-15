public class Main {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] autoPark = {truck, bulldozer, excavator};
        for (Machine workStart : autoPark) {
            workStart.doWork();
        }
        for (Machine workEnd : autoPark) {
            workEnd.stopWork();
        }
    }
}
