package commandHW;

public class PositionOutsideCommand implements Command {

	private Position position;
	
	public PositionOutsideCommand(Position position) {
		this.position = position;
	}
	
	@Override
	public void execute() {
		this.position.locationOut();

	}

}
