package bb;

interface OlaUser{

	void BookRide();
	void CancelRide();
	void ScheduleRide();
	void addMoney();
	void rideHistory();
	
}

interface OlaDriver
{
	void AcceptRide();
	void checkCommssion();
	void verifyOTP();
	void turnOffStatus();
}

interface OlaOwner{
	void ActivateNewDriver();
	void GenerateReport();
	void DeactivateDriver();
	void viewReviewsI();
	void CheckReportByCity();
}


public class Program  implements OlaUser,OlaDriver,OlaOwner {

	public static void main(String[] ar)
	{
		Program p = new Program();
	
	}
	
	@Override
	public void ActivateNewDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GenerateReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeactivateDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewReviewsI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckReportByCity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AcceptRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkCommssion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyOTP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOffStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BookRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CancelRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ScheduleRide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rideHistory() {
		// TODO Auto-generated method stub
		
	}

}
