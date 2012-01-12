package org.bukkit.command;

import org.bukkit.Server;
import org.bukkit.conversations.Conversation;
import org.bukkit.permissions.Permissible;

public interface CommandSender extends Permissible {

    /**
     * Sends this sender a message
     *
     * @param message Message to be displayed
     */
    public void sendMessage(String message);

    /**
     * Returns the server instance that this command is running on
     *
     * @return Server instance
     */
    public Server getServer();

    /**
     * Gets the name of this command sender
     *
     * @return Name of the sender
     */
    public String getName();

    /**
     * Enters into a dialog with a Conversation object
     * @param conversation The conversation to begin
     */
    public void beginConversation(Conversation conversation);

    /**
     * Abandons an active conversation.
     * @param conversation The conversation to abandon
     */
    public void abandonConversation(Conversation conversation);
}
