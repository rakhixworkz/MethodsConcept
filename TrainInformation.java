package Method;

public class TrainInformation {
	public static String trainTiming( int trainNumber,String time){
		String trainInfo="Train number "+trainNumber+" arrives at " +time;  
		return trainInfo;
	}
	public static String cancelBooking(int tNumber,String bookingId) {
		return "your train ticket for train number "+tNumber+" and booking Id "+bookingId+" is cancelled successfully.";
	}
	public static String numberOfSeats(String trainNo,int seats) {
		return "Total number of seats available for trainnumber "+trainNo+" are "+seats;
	}
	public static void main(String[] args) {
		String seatsAvailable=TrainInformation.numberOfSeats("9852WB", 123);
		System.out.println(seatsAvailable);
		String trainInfo=TrainInformation.trainTiming(43567,"8.00PM");
		System.out.println(trainInfo);
		String cancelTrain=TrainInformation.cancelBooking(9852,"1234");
		System.out.println(cancelTrain);
	}

}
