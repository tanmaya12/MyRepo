package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q. Parking Lot questions : you have a parking lot that allows various cab-aggregators like ola,uber, rapido etc to park their vehicles.
 *  When a vehicle for an aggregator enters the lot, "add" method is called which assignes a parking slot within the parking area . 
 * When the "get" (that takes the aggregator name {ola/uber/etc..} as input) method is called, it retrieves the cab for that aggregator from 
 * the parking lot that has been there for the longest period of time. Write add and get methods with appropriate class definitions. 
 **/
public class ParkingLot {
	public static void main(String[] args) {
		Parking pa= new Parking();
				
		pa.add(new Zone(new Cab("r5","rapido"),10,15f));
		
		System.out.println(pa.getMaxHaltCab());
	}
}
class Parking{
	List<Zone> li= new ArrayList<>(Arrays.asList(new Zone(new Cab("a2","ola"),10,13f) , new Zone(new Cab("u7","uber"),10,3f) , new Zone(new Cab("r2","rapido"),10,10f)));
	
	void add(Zone zone) {
		li.add(zone);
	}
	List<Cab> getMaxHaltCab(){
		List<Cab> maxHaltCabs = new ArrayList<Cab>();
		List<Zone> sortedList = li.stream().sorted((a,b)->(int)(b.getHaltTime()- a.getHaltTime())).collect(Collectors.toList());
		System.out.println(sortedList);
		float maxHr= sortedList.get(0).getHaltTime();
		for (Zone zone : sortedList) {
			if (zone.getHaltTime()==maxHr) {
				maxHaltCabs.add(zone.getVehicle());
			}			
		}		
		return maxHaltCabs;
	}
}

class Cab{
	private String id;
	private String type;
	
	public Cab(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Cab [id=" + id + ", type=" + type + "]";
	}
	
	
}
class Zone{
	private Cab vehicle;
	private int zoneId;
	private float haltTime;
	public Zone(Cab vehicle, int zoneId, float haltTime) {
		super();
		this.vehicle = vehicle;
		this.zoneId = zoneId;
		this.haltTime = haltTime;
	}
	public Cab getVehicle() {
		return vehicle;
	}
	public void setVehicle(Cab vehicle) {
		this.vehicle = vehicle;
	}
	public int getZoneId() {
		return zoneId;
	}
	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}
	public float getHaltTime() {
		return haltTime;
	}
	public void setHaltTime(float haltTime) {
		this.haltTime = haltTime;
	}
	@Override
	public String toString() {
		return "Zone [vehicle=" + vehicle + ", zoneId=" + zoneId + ", haltTime=" + haltTime + "]";
	}	
}
