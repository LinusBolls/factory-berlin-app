package de.baimos.blueid.sdk.data;

import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.api.SecuredObject;
import de.baimos.blueid.sdk.api.exceptions.ChannelNotAllowedException;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.dr;
import de.baimos.ds;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends JSONObject implements SecuredObject {
    private static final dr a = ds.a(b.class);
    private List<c> b = new ArrayList();

    public b(JSONObject jSONObject, SdkClientFactory sdkClientFactory) {
        super(jSONObject.toString());
        JSONArray optJSONArray = optJSONArray("tickets");
        int i2 = 0;
        while (optJSONArray != null && i2 < optJSONArray.length()) {
            dr drVar = a;
            drVar.d("ticketArray.optJSONObject(" + i2 + ") " + optJSONArray.optJSONObject(i2));
            this.b.add(new c(optJSONArray.optJSONObject(i2), this, sdkClientFactory));
            i2++;
        }
    }

    public c a(Command command, Channel channel) {
        dr drVar;
        StringBuilder sb;
        String str;
        c cVar = null;
        for (c next : b()) {
            if (next.a().contains(command) && next.b().contains(channel)) {
                if (cVar == null) {
                    drVar = a;
                    sb = new StringBuilder();
                    str = "valid ticket found ";
                } else if (cVar.d() < next.d()) {
                    drVar = a;
                    sb = new StringBuilder();
                    str = "ticket with newer creation date is found ";
                }
                sb.append(str);
                sb.append(next);
                drVar.d(sb.toString());
                cVar = next;
            }
        }
        return cVar;
    }

    public String a() {
        return optString("revocations");
    }

    public String a(Channel channel) {
        return a(channel.getId());
    }

    public String a(String str) {
        JSONArray optJSONArray = optJSONArray("urls");
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            String optString = optJSONArray.optString(i2);
            if (optString != null) {
                if (optString.startsWith(str + "://")) {
                    return optString;
                }
            }
        }
        throw new ChannelNotAllowedException(str);
    }

    public List<c> b() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (c next : this.b) {
            if (next.c() <= currentTimeMillis && next.f() >= currentTimeMillis) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Channel getChannelForCommand(String str, Command command) {
        for (Channel next : getChannelsForCommand(command)) {
            if (str.equals(next.getId())) {
                return next;
            }
        }
        return null;
    }

    public Set<Channel> getChannelsForCommand(Command command) {
        HashSet hashSet = new HashSet();
        for (c next : b()) {
            if (next.a().contains(command)) {
                hashSet.addAll(next.b());
            }
        }
        return hashSet;
    }

    public Command getCommandById(String str) {
        for (Command next : getCommands()) {
            if (next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Set<Command> getCommands() {
        HashSet hashSet = new HashSet();
        for (c a2 : b()) {
            hashSet.addAll(a2.a());
        }
        return hashSet;
    }

    public String getId() {
        return optString("id");
    }

    public String getName() {
        return optString("name");
    }

    public String toString() {
        if (a.d()) {
            return super.toString();
        }
        return "SecuredObject {id=" + getId() + ",commands=" + getCommands() + "}";
    }
}
