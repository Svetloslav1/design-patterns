package commandHW;

public class PositionInsideCommand implements Command {

private Position position;
	
	public PositionInsideCommand(Position position) {
		this.position = position;
	}
	
	@Override
	public void execute() {
		this.position.locationOut();

	}
}
