package com.yjs3509.inmethods.domain;

public class Cargo {
	
	
	private String trackingNumber;
	

	public Destination getDestination() {

		class MethodDestination implements Destination {

			private String to;

			public MethodDestination(String to) {
				this.to = to;
				System.out.println("MethodDestination");
			}

			@Override
			public String to() {
				return to;
			}
		}

		return new MethodDestination("Ankara");
	}
	
	

	public void shipStatus(boolean wasDelivered) {

		if (wasDelivered) {

			class DeliveredCargoStatus {
							
				@Override
				public String toString() {
					return "The cargo which has tracking number : " + trackingNumber + " was delivered" ;
				}
			}
			

		} // end of if scope

//		DeliveredCargoStatus deliveredCargoStatus = new DeliveredCargoStatus();    // CAN NOT BE REACHED !!!

	}// end of method

}
