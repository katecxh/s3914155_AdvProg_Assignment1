package s3914155_AdvProg_Assignment1;

abstract class Ticket {
    public String time, zone;
	public double cost;

    public Ticket(String time, String zone, double cost) {
    	this.time = time;
    	this.zone = zone;
    	this.cost = cost;
    }
    abstract public void getHistory();

	public void settime(String time) {
		this.time = time;
	}
	public String gettime() { 
		return time;
	}
	public void setzone(String zone) {
		this.zone = zone;
	}
	public String getzone() { 
		return zone;
	}
	public void setcost(double cost) {
		this.cost = cost;
	}
	public double getcost() { 
		return cost;
	}}

