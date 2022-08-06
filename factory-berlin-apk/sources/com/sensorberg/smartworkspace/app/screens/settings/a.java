package com.sensorberg.smartworkspace.app.screens.settings;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: LogUtils.kt */
public final class a {
    private final File a;

    public a(File file) {
        k.e(file, "filesDir");
        this.a = file;
    }

    public final void a(String str, List<String> list) {
        k.e(str, "line");
        k.e(list, "log");
        List n0 = q.n0(str, new String[]{AndroidSdkMetrics.SEPARATOR}, false, 0, 6, (Object) null);
        if (n0.size() >= 5) {
            list.add(((String) n0.get(1)) + ": " + ((String) n0.get(4)));
            return;
        }
        list.add(str);
    }

    public final BufferedReader b(File file) {
        k.e(file, "file");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    }

    public final List<String> c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (File file : new File(this.a.getAbsolutePath() + "/logs").listFiles()) {
                k.d(file, "file");
                BufferedReader b = b(file);
                d(b, arrayList);
                b.close();
            }
            return arrayList;
        } catch (IOException unused) {
            return n.g();
        }
    }

    public final void d(BufferedReader bufferedReader, List<String> list) {
        k.e(bufferedReader, "reader");
        k.e(list, "log");
        String readLine = bufferedReader.readLine();
        while (readLine != null) {
            a(readLine, list);
            readLine = bufferedReader.readLine();
        }
    }
}
