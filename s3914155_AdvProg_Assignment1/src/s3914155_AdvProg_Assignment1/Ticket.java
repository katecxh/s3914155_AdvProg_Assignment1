package s3914155_AdvProg_Assignment1;

abstract class Ticket {
    public String time, zone;
	public double cost;
 // The Ticket class is a parent class which the child classes inherit constructors, methods, and attributes.

    public Ticket(String time, String zone, double cost) {
    	this.time = time;
    	this.zone = zone;
    	this.cost = cost;
    }
	public void settime(String time) {
		this.time = time;
 // This setter method appends the value of a user's purchase to the Ticket abstract class 
	}
	public String gettime() { 
		return time;
 // This getter method returns the value of a user's purchase to the Ticket abstract class 
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
