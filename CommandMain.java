package commandHW;

public class CommandMain {

	public static void main(String[] args) {


		RemoteController remoteController = new RemoteController();
		Position position = new Position();
		
		Command positionInsideCommand = new PositionInsideCommand(position);
		Command positionOutsideCommand = new PositionOutsideCommand(position);
		
		remoteController.setCommand(positionInsideCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(positionOutsideCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(positionInsideCommand);
		remoteController.pressButton();
		
	}

}
