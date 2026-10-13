package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
private void transportForm() {
	// TODO Auto-generated method stub
System.out.println("MODE OF TRANSPORT roadways, airways, waterways");
}
public static void main(String[] args) {
	Transport t= new Transport();
	t.transportForm();
	
	
	Road r= new Road();
	r.bike();r.car();r.cycle();r.bus();
	
	
	Air a = new Air();
	a.aeroPlane();
	a.heloCopter();
	
	
	Water w= new Water();
	w.boat();
	w.ship();
	
	}
}
