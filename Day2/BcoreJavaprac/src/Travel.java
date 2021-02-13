public class Travel {

	private String travelType;
	private int noofDays;
	private String vechicleType;
	private int noofTravellers;
	private double amount;
	private int kilometers;

	public void initateTravel(int noOfd, String vechicle, int nooftravel, int kilo) {
		noofDays = noOfd;
		vechicleType = vechicle;
		noofTravellers = nooftravel;
		kilometers = kilo;
	}

	public double calculateBudget() {
		int chargeperday = 200;
		switch (vechicleType) {
		case "car":
			if (kilometers < 100) {
				amount = (noofDays*chargeperday)+noofTravellers * 200;
			} else {
				amount = (noofDays*chargeperday)+noofTravellers * 500;
			}
			break;
		case "bus":
			if (kilometers < 100) {
				amount = (noofDays*chargeperday)+noofTravellers * 500;
			} else {
				amount = (noofDays*chargeperday)+noofTravellers * 1000;
			}
			break;
		case "flight":
			if (kilometers < 1000) {
				amount = (noofDays*chargeperday)+noofTravellers * 3000;
			} else {
				amount = (noofDays*chargeperday)+noofTravellers * 10000;
			}
		}
		return amount;
	}
	
	

}
