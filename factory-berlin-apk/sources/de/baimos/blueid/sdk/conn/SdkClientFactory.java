package de.baimos.blueid.sdk.conn;

import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.conn.protocols.Protocol;
import de.baimos.bp;
import de.baimos.cd;
import de.baimos.ce;
import de.baimos.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SdkClientFactory {
    private Map<String, Class<? extends bp>> b = new HashMap();
    private Map<String, Channel> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, Protocol> f8225d = new HashMap();

    public Channel a(String str) {
        Channel channel = this.c.get(str);
        return channel == null ? new d(str) : channel;
    }

    public Protocol a(int i2) {
        return this.f8225d.get(Integer.valueOf(i2));
    }

    public List<Protocol> a() {
        ArrayList arrayList = new ArrayList(this.f8225d.values());
        Collections.sort(arrayList, new Comparator<Protocol>() {
            /* renamed from: a */
            public int compare(Protocol protocol, Protocol protocol2) {
                return protocol.getPriority() - protocol2.getPriority();
            }
        });
        return arrayList;
    }

    public void a(Channel channel) {
        this.c.put(channel.getId(), channel);
    }

    public void a(Channel channel, Class<? extends bp> cls) {
        this.b.put(channel.getId(), cls);
    }

    public void a(Protocol protocol) {
        int id = protocol.getId();
        if (this.f8225d.put(Integer.valueOf(id), protocol) != null) {
            throw new IllegalStateException("two protocols with same id: " + id);
        }
    }

    public bp b(String str) {
        for (String next : this.b.keySet()) {
            if (str.startsWith(next + ":")) {
                try {
                    return (bp) this.b.get(next).getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to create client instance for url " + str + ". Please make sure that your BlueID SDK is not outdated.", e2);
                }
            }
        }
        if (str.startsWith("http:") || str.startsWith("https:")) {
            System.setProperty("http.keepAlive", "false");
            return new ce(str);
        } else if (str.startsWith("socket:")) {
            return new cd(str);
        } else {
            throw new RuntimeException("no client exists that can handle the url " + str);
        }
    }

    public void b() {
        this.f8225d.clear();
    }

    public void c() {
        this.c.clear();
    }

    public void d() {
        this.b.clear();
    }
}
