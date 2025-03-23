package approach_1_programs;

public class MainClass3 {
	public static void main(String[] args) {
		Train train1 = new Train();
		Train train2 = new Train();
		Train train3 = new Train();
		train1.avgSpeed=100;
		train2.avgSpeed=120;
		train3.avgSpeed=150;
		train1.numberOfKMS=800;
		train2.numberOfKMS=1100;
		train3.numberOfKMS=1400;
		train1.arraivlPoint="Banglore";
		train2.arraivlPoint="Mumbai";
		train3.arraivlPoint="Chennai";
		train1.trainNumber="Ban112";
		train2.trainNumber="Mun109";
		train3.trainNumber="Che102";
		train1.trainName="Banglore Express";
		train2.trainName="Mumbai Express";
		train3.trainName="Chennai Express";
		
		System.out.println(Train.departurePoint);

		System.out.println();
		System.out.println("TRain 1 Details");
		System.out.println("Train Name : "+train1.trainName);
		System.out.println("Train Number : "+train1.trainNumber);
		System.out.println("Train Ave Speed : "+train1.avgSpeed);
		System.out.println("Train Arraival Point : "+train1.arraivlPoint);
		System.out.println("Train Number Of KMS : "+train1.numberOfKMS+"KMS");

		
		System.out.println();
		System.out.println("TRain 2 Details");
		System.out.println("Train Name : "+train2.trainName);
		System.out.println("Train Number : "+train2.trainNumber);
		System.out.println("Train Ave Speed : "+train2.avgSpeed);
		System.out.println("Train Arraival Point : "+train2.arraivlPoint);
		System.out.println("Train Number Of KMS : "+train2.numberOfKMS+"KMS");

		
		System.out.println();
		System.out.println("TRain 3 Details");
		System.out.println("Train Name : "+train3.trainName);
		System.out.println("Train Number : "+train3.trainNumber);
		System.out.println("Train Ave Speed : "+train3.avgSpeed);
		System.out.println("Train Arraival Point : "+train3.arraivlPoint);
		System.out.println("Train Number Of KMS : "+train3.numberOfKMS+"KMS");


		System.out.println();
		System.out.println("Time Taken By Train 1 = "+train1.numberOfKMS/train1.avgSpeed);
		System.out.println("Time Taken By Train 2 = "+train2.numberOfKMS/train2.avgSpeed);
		System.out.println("Time Taken By Train 3 = "+train3.numberOfKMS/train3.avgSpeed);
	}
}
