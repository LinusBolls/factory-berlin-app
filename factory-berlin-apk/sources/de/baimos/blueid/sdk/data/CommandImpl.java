package de.baimos.blueid.sdk.data;

import de.baimos.blueid.sdk.api.Command;

public class CommandImpl implements Command {
    private String a;

    public CommandImpl(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommandImpl)) {
            return false;
        }
        return this.a.equals(((CommandImpl) obj).a);
    }

    public String getId() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CommandImpl{id='" + this.a + '\'' + '}';
    }
}
