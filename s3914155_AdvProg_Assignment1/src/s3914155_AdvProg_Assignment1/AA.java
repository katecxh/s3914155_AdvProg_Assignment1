package s3914155_AdvProg_Assignment1;

class AA extends Ticket {
	AA(String zone, String time, double cost){
		super(zone, time, cost);
	}
	public void getHistory(){
		System.out.println("You purchased " + this.time + "for " + this.zone + ", costing $" +  this.cost);
	}
}
