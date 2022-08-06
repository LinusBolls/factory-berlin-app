package com.sensorberg.smartworkspace.app;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.io.File;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

@SuppressLint({"ApplySharedPref"})
@i(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/sensorberg/smartworkspace/app/MigrationFromFactory;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "Companion", "Folder", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: MigrationFromFactory.kt */
public final class MigrationFromFactory extends BroadcastReceiver {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: MigrationFromFactory.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final void b(Context context) {
            String[] databaseList = context.databaseList();
            k.d(databaseList, "context.databaseList()");
            for (String str : databaseList) {
                if (k.a(str, "notifications-sdk")) {
                    n.a.a.k("Factory Migration: Do not delete notifications-SDK databases. " + str, new Object[0]);
                } else {
                    k.d(str, "name");
                    if (p.D(str, "androidx.work.", false, 2, (Object) null)) {
                        n.a.a.k("Factory Migration: Do not delete WorkManager databases. " + str, new Object[0]);
                    } else {
                        n.a.a.f("Factory Migration: Deleting database " + str, new Object[0]);
                        context.deleteDatabase(str);
                    }
                }
            }
            File filesDir = context.getFilesDir();
            k.d(filesDir, "context.filesDir");
            File[] listFiles = new File(filesDir.getParentFile(), "shared_prefs").listFiles();
            k.d(listFiles, "sharedPrefsFolder.listFiles()");
            for (File file : listFiles) {
                k.d(file, "file");
                String b = j.b(file);
                if (p.D(b, "com.crashlytics.", false, 2, (Object) null)) {
                    n.a.a.k("Factory Migration: Do not delete crashlytics preferences. " + b, new Object[0]);
                } else {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(b, 0);
                    n.a.a.f("Factory Migration: Clearing shared prefs " + b, new Object[0]);
                    sharedPreferences.edit().clear().commit();
                    MigrationFromFactory.a.c(file, (b) null);
                }
            }
            File cacheDir = context.getCacheDir();
            k.d(cacheDir, "context.cacheDir");
            c(cacheDir, b.CACHE);
            File filesDir2 = context.getFilesDir();
            k.d(filesDir2, "context.filesDir");
            c(filesDir2, b.FILES);
            File noBackupFilesDir = context.getNoBackupFilesDir();
            k.d(noBackupFilesDir, "context.noBackupFilesDir");
            c(noBackupFilesDir, b.NO_BACKUP);
        }

        private final void c(File file, b bVar) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                k.d(listFiles, "file.listFiles()");
                for (File file2 : listFiles) {
                    if (bVar == b.FILES) {
                        k.d(file2, "child");
                        if (file2.isDirectory() && k.a(file2.getName(), "logs")) {
                            n.a.a.k("Factory Migration: Do not delete white label app logs", new Object[0]);
                        }
                    }
                    if (bVar == b.FILES) {
                        k.d(file2, "child");
                        if (file2.isDirectory() && k.a(file2.getName(), ".Fabric")) {
                            n.a.a.k("Factory Migration: Do not delete .Fabric files", new Object[0]);
                        }
                    }
                    if (bVar == b.NO_BACKUP) {
                        k.d(file2, "child");
                        if (!file2.isDirectory()) {
                            String name = file2.getName();
                            k.d(name, "child.name");
                            if (p.D(name, "prefs_encryptor_", false, 2, (Object) null)) {
                                String name2 = file2.getName();
                                k.d(name2, "child.name");
                                if (p.p(name2, ".json", false, 2, (Object) null)) {
                                    n.a.a.k("Factory Migration: Do not delete encryptor preferences. " + file2.getCanonicalPath(), new Object[0]);
                                }
                            }
                            String name3 = file2.getName();
                            k.d(name3, "child.name");
                            if (p.D(name3, "encryptor_", false, 2, (Object) null)) {
                                String name4 = file2.getName();
                                k.d(name4, "child.name");
                                if (q.I(name4, ".db", false, 2, (Object) null)) {
                                    n.a.a.k("Factory Migration: Do not delete encryptor databases. " + file2.getCanonicalPath(), new Object[0]);
                                }
                            }
                        }
                    }
                    a aVar = MigrationFromFactory.a;
                    k.d(file2, "child");
                    aVar.c(file2, (b) null);
                }
            }
            if (!file.isDirectory() || bVar == null) {
                n.a.a.f("Factory Migration: Deleting file " + file.getCanonicalPath(), new Object[0]);
                file.delete();
                return;
            }
            n.a.a.k("Factory Migration: Do not delete base folder " + bVar, new Object[0]);
        }

        public final boolean d(SharedPreferences sharedPreferences) {
            k.e(sharedPreferences, "prefs");
            return sharedPreferences.getBoolean("factory-v2-migration-executed", false);
        }

        public final void e(SharedPreferences sharedPreferences) {
            k.e(sharedPreferences, "prefs");
            sharedPreferences.edit().putBoolean("factory-v2-migration-executed", true).commit();
        }

        public final boolean f(String str, String str2) {
            return k.a(str2, "android.intent.action.MY_PACKAGE_REPLACED") && k.a(str, "com.sensorberg.factory");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MigrationFromFactory.kt */
    public enum b {
        NO_BACKUP,
        FILES,
        CACHE
    }

    /* compiled from: MigrationFromFactory.kt */
    static final class c extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f6891h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ SharedPreferences f6892i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f6893j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, SharedPreferences sharedPreferences, BroadcastReceiver.PendingResult pendingResult) {
            super(0);
            this.f6891h = context;
            this.f6892i = sharedPreferences;
            this.f6893j = pendingResult;
        }

        public final void a() {
            try {
                MigrationFromFactory.a.b(this.f6891h);
            } catch (Exception e2) {
                n.a.a.e(e2, "MigrationFromFactory. Failed to clear all. " + e2.getMessage(), new Object[0]);
            }
            a aVar = MigrationFromFactory.a;
            SharedPreferences sharedPreferences = this.f6892i;
            k.d(sharedPreferences, "prefs");
            aVar.e(sharedPreferences);
            this.f6893j.finish();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public void onReceive(Context context, Intent intent) {
        k.e(context, "context");
        if (a.f(context.getPackageName(), intent != null ? intent.getAction() : null)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("factory-v2-migration", 0);
            a aVar = a;
            k.d(sharedPreferences, "prefs");
            if (!aVar.d(sharedPreferences)) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                k.d(goAsync, "goAsync()");
                g.e.e.a aVar2 = g.e.e.a.f9778f;
                aVar2.j(aVar2.d(), new c(context, sharedPreferences, goAsync));
            }
        }
    }
}
