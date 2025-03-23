package aproach_3_programs;

public class MainClass1 {
	public static void main(String[] args) {
		Marker marker1 = new Marker();
		Marker marker2 = new Marker();
		Marker marker3 = new Marker();
		marker1.color="Black";
		marker2.color="Red";
		marker3.color="Blue";
		marker1.brand="Reyonalds";
		marker2.brand="Cello";
		marker3.brand="Parker";
		System.out.println(Marker.height+"cms");
		System.out.println("Marker1 Details");
		System.out.println(marker1.color);
		System.out.println(marker1.brand);
		System.out.println("Marker2 Details");
		System.out.println(marker2.color);
		System.out.println(marker2.brand);
		System.out.println("Marker3 Details");
		System.out.println(marker3.color);
		System.out.println(marker3.brand);
	}
}
