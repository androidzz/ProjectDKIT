package Command;

/**
 *
 * @author Lorenas
 */
public class CommandFactory {

    public Command createCommand(String commandStr) {
        Command command = null;

        //Instantiate the required Command object...
        if (commandStr.equals("login")) {
            command = new LoginCommand();
        }
        if (commandStr.equals("register")) {
            command = new RegisterCommand();
        }

        //Return the instantiated Command object to the calling code...
        return command;// may be null
    }
}
