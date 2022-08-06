package de.baimos.blueid.sdk.api;

import java.util.Set;

public interface SecuredObject {
    Channel getChannelForCommand(String str, Command command);

    Set<Channel> getChannelsForCommand(Command command);

    Command getCommandById(String str);

    Set<Command> getCommands();

    String getId();

    String getName();
}
