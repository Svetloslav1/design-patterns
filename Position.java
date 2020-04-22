package commandHW;

public class Position {

	private Boolean positionIn;
	
	public void locationIn() {
		System.out.println("Position In");
		this.positionIn = true;
	}
	
	public void locationOut() {
		System.out.println("Position Out");
		this.positionIn = false ;
	}
}
