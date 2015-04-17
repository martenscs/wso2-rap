package net.martenscs.wso2.application.email;

/**
 * Interface defining the application's command IDs.
 * Key bindings can be defined for specific commands.
 * To associate an action with a command, use IAction.setActionDefinitionId(commandId).
 *
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

	public static final String CMD_OPEN = "net.martenscs.wso2.application.email.open";
	public static final String CMD_OPEN_MESSAGE = "net.martenscs.wso2.application.email.openMessage";

}
