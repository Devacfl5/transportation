package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
private void transportForm() {
	System.out.println("TransportForm:Road/Air/Water");
}
public static void main(String[] args) {
	Transport transp = new Transport();
	Road ro = new Road();
	Air ai = new Air();
	Water wa = new Water();
	transp.transportForm();
	ro.bike();
	ro.cycle();
	ro.bus();
	ro.car();
	ai.aeroPlane();
	ai.heliCopter();
	wa.boat();
	wa.ship();
}
}
