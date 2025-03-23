package over_raiding_programs;

public class MainClass2 {

	public static void main(String[] args) {
		Speed s = new Speed();
		KiloMeter k = new KiloMeter();
		Wind w = new Wind();
		s.travel();
		k.travel();
		w.travel();
	}

}
abstract class Distance{
	public void travel()
	{
		System.out.println("I'm travelling to US");
	}
}
class Speed extends Distance{
	public void travel()
	{
		System.out.println("Im running 20Kmph");
	}
}
class KiloMeter extends Distance{
	
}
class Wind extends Distance{
	public void travel()
	{
		System.out.println("I'm walking opposite of wind");
	}
}