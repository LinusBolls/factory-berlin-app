package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.i2;
import com.google.android.gms.internal.measurement.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class u {
    public static r3<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, m0.a);
    public static r3<Boolean> A0;
    public static r3<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, p0.a);
    public static r3<Boolean> B0;
    public static r3<Integer> C = a("measurement.upload.retry_count", 6, 6, o0.a);
    public static r3<Boolean> C0;
    public static r3<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, r0.a);
    public static r3<Boolean> D0;
    public static r3<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, q0.a);
    public static r3<Boolean> E0;
    public static r3<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, s0.a);
    public static r3<Boolean> F0;
    public static r3<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, (p3) null);
    public static r3<Boolean> G0;
    public static r3<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, (p3) null);
    public static r3<Boolean> H0;
    public static r3<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, (p3) null);
    public static r3<Boolean> I0;
    public static r3<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, v0.a);
    public static r3<Boolean> J0;
    public static r3<Boolean> K;
    public static r3<Boolean> K0;
    public static r3<String> L = a("measurement.test.string_flag", "---", "---", x0.a);
    public static r3<Boolean> L0;
    public static r3<Long> M = a("measurement.test.long_flag", -1L, -1L, w0.a);
    public static r3<Long> M0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, g3.a);
    public static r3<Integer> N = a("measurement.test.int_flag", -2, -2, z0.a);
    public static r3<Boolean> N0;
    public static r3<Double> O;
    public static r3<Boolean> O0;
    public static r3<Integer> P = a("measurement.experiment.max_ids", 50, 50, b1.a);
    public static r3<Boolean> P0;
    public static r3<Integer> Q = a("measurement.max_bundles_per_iteration", 100, 100, a1.a);
    public static r3<Boolean> Q0;
    public static r3<Boolean> R;
    public static r3<Integer> R0 = a("measurement.service.storage_consent_support_version", 203290, 203290, m3.a);
    public static r3<Boolean> S;
    public static r3<Boolean> S0;
    public static r3<Boolean> T;
    public static r3<Boolean> T0;
    public static r3<Boolean> U;
    public static r3<Boolean> U0;
    public static r3<Boolean> V;
    public static r3<Boolean> W;
    public static r3<Boolean> X;
    public static r3<Boolean> Y;
    public static r3<Boolean> Z;
    /* access modifiers changed from: private */
    public static List<r3<?>> a = Collections.synchronizedList(new ArrayList());
    public static r3<Boolean> a0;
    public static r3<Long> b = a("measurement.ad_id_cache_time", 10000L, 10000L, t.a);
    public static r3<Boolean> b0;
    public static r3<Long> c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, w.a);
    public static r3<Boolean> c0;

    /* renamed from: d  reason: collision with root package name */
    public static r3<Long> f3133d = a("measurement.config.cache_time", 86400000L, 3600000L, g0.a);
    public static r3<Boolean> d0;

    /* renamed from: e  reason: collision with root package name */
    public static r3<String> f3134e = a("measurement.config.url_scheme", "https", "https", t0.a);
    public static r3<Boolean> e0;

    /* renamed from: f  reason: collision with root package name */
    public static r3<String> f3135f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", d1.a);
    public static r3<Boolean> f0;

    /* renamed from: g  reason: collision with root package name */
    public static r3<Integer> f3136g = a("measurement.upload.max_bundles", 100, 100, q1.a);
    public static r3<Boolean> g0;

    /* renamed from: h  reason: collision with root package name */
    public static r3<Integer> f3137h = a("measurement.upload.max_batch_size", 65536, 65536, z1.a);
    public static r3<Boolean> h0;

    /* renamed from: i  reason: collision with root package name */
    public static r3<Integer> f3138i = a("measurement.upload.max_bundle_size", 65536, 65536, n2.a);
    public static r3<Boolean> i0;

    /* renamed from: j  reason: collision with root package name */
    public static r3<Integer> f3139j = a("measurement.upload.max_events_per_bundle", 1000, 1000, w2.a);
    public static r3<Boolean> j0;

    /* renamed from: k  reason: collision with root package name */
    public static r3<Integer> f3140k = a("measurement.upload.max_events_per_day", 100000, 100000, k3.a);
    public static r3<Boolean> k0;

    /* renamed from: l  reason: collision with root package name */
    public static r3<Integer> f3141l = a("measurement.upload.max_error_events_per_day", 1000, 1000, v.a);
    public static r3<Boolean> l0;

    /* renamed from: m  reason: collision with root package name */
    public static r3<Integer> f3142m = a("measurement.upload.max_public_events_per_day", 50000, 50000, y.a);
    public static r3<Boolean> m0;

    /* renamed from: n  reason: collision with root package name */
    public static r3<Integer> f3143n = a("measurement.upload.max_conversions_per_day", 10000, 10000, x.a);
    public static r3<Boolean> n0;
    public static r3<Integer> o = a("measurement.upload.max_realtime_events_per_day", 10, 10, a0.a);
    public static r3<Boolean> o0;
    public static r3<Integer> p = a("measurement.store.max_stored_events_per_app", 100000, 100000, z.a);
    public static r3<Boolean> p0;
    public static r3<String> q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", d0.a);
    public static r3<Boolean> q0;
    public static r3<Long> r = a("measurement.upload.backoff_period", 43200000L, 43200000L, c0.a);
    public static r3<Boolean> r0;
    public static r3<Long> s = a("measurement.upload.window_interval", 3600000L, 3600000L, f0.a);
    public static r3<Boolean> s0;
    public static r3<Long> t = a("measurement.upload.interval", 3600000L, 3600000L, e0.a);
    public static r3<Boolean> t0;
    public static r3<Long> u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, h0.a);
    public static r3<Boolean> u0;
    public static r3<Long> v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, j0.a);
    public static r3<Boolean> v0;
    public static r3<Long> w = a("measurement.upload.minimum_delay", 500L, 500L, i0.a);
    public static r3<Boolean> w0;
    public static r3<Long> x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, l0.a);
    public static r3<Boolean> x0;
    public static r3<Long> y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, k0.a);
    public static r3<Boolean> y0;
    public static r3<Long> z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, n0.a);
    public static r3<Boolean> z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, u0.a);
        Double valueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf, valueOf, y0.a);
        Boolean bool2 = Boolean.FALSE;
        R = a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, e1.a);
        Boolean bool3 = Boolean.TRUE;
        S = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool3, bool3, g1.a);
        Boolean bool4 = Boolean.TRUE;
        T = a("measurement.collection.firebase_global_collection_flag_enabled", bool4, bool4, f1.a);
        Boolean bool5 = Boolean.TRUE;
        U = a("measurement.collection.efficient_engagement_reporting_enabled_2", bool5, bool5, i1.a);
        Boolean bool6 = Boolean.FALSE;
        V = a("measurement.collection.redundant_engagement_removal_enabled", bool6, bool6, h1.a);
        Boolean bool7 = Boolean.TRUE;
        W = a("measurement.client.freeride_engagement_fix", bool7, bool7, k1.a);
        Boolean bool8 = Boolean.TRUE;
        X = a("measurement.collection.log_event_and_bundle_v2", bool8, bool8, j1.a);
        Boolean bool9 = Boolean.FALSE;
        Y = a("measurement.quality.checksum", bool9, bool9, (p3) null);
        Boolean bool10 = Boolean.FALSE;
        Z = a("measurement.sdk.dynamite.allow_remote_dynamite2", bool10, bool10, m1.a);
        Boolean bool11 = Boolean.TRUE;
        a0 = a("measurement.sdk.collection.validate_param_names_alphabetical", bool11, bool11, l1.a);
        Boolean bool12 = Boolean.FALSE;
        b0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool12, bool12, o1.a);
        Boolean bool13 = Boolean.FALSE;
        c0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool13, bool13, n1.a);
        Boolean bool14 = Boolean.FALSE;
        d0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool14, bool14, p1.a);
        Boolean bool15 = Boolean.TRUE;
        e0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool15, bool15, s1.a);
        Boolean bool16 = Boolean.TRUE;
        f0 = a("measurement.sdk.collection.last_deep_link_referrer2", bool16, bool16, r1.a);
        Boolean bool17 = Boolean.FALSE;
        g0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool17, bool17, u1.a);
        Boolean bool18 = Boolean.FALSE;
        h0 = a("measurement.sdk.collection.last_gclid_from_referrer2", bool18, bool18, t1.a);
        Boolean bool19 = Boolean.TRUE;
        i0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool19, bool19, w1.a);
        Boolean bool20 = Boolean.FALSE;
        j0 = a("measurement.upload.file_lock_state_check", bool20, bool20, v1.a);
        Boolean bool21 = Boolean.FALSE;
        k0 = a("measurement.ga.ga_app_id", bool21, bool21, y1.a);
        Boolean bool22 = Boolean.TRUE;
        l0 = a("measurement.lifecycle.app_backgrounded_tracking", bool22, bool22, x1.a);
        Boolean bool23 = Boolean.FALSE;
        m0 = a("measurement.lifecycle.app_in_background_parameter", bool23, bool23, a2.a);
        Boolean bool24 = Boolean.FALSE;
        n0 = a("measurement.integration.disable_firebase_instance_id", bool24, bool24, c2.a);
        Boolean bool25 = Boolean.FALSE;
        o0 = a("measurement.lifecycle.app_backgrounded_engagement", bool25, bool25, b2.a);
        Boolean bool26 = Boolean.FALSE;
        p0 = a("measurement.collection.service.update_with_analytics_fix", bool26, bool26, f2.a);
        Boolean bool27 = Boolean.FALSE;
        q0 = a("measurement.service.use_appinfo_modified", bool27, bool27, e2.a);
        Boolean bool28 = Boolean.TRUE;
        r0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool28, bool28, h2.a);
        Boolean bool29 = Boolean.TRUE;
        s0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool29, bool29, g2.a);
        Boolean bool30 = Boolean.FALSE;
        t0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool30, bool30, j2.a);
        Boolean bool31 = Boolean.FALSE;
        u0 = a("measurement.upload.file_truncate_fix", bool31, bool31, i2.a);
        Boolean bool32 = Boolean.FALSE;
        v0 = a("measurement.sdk.referrer.delayed_install_referrer_api", bool32, bool32, l2.a);
        Boolean bool33 = Boolean.TRUE;
        w0 = a("measurement.sdk.screen.disabling_automatic_reporting", bool33, bool33, k2.a);
        Boolean bool34 = Boolean.TRUE;
        x0 = a("measurement.sdk.screen.manual_screen_view_logging", bool34, bool34, m2.a);
        Boolean bool35 = Boolean.TRUE;
        y0 = a("measurement.gold.enhanced_ecommerce.format_logs", bool35, bool35, p2.a);
        Boolean bool36 = Boolean.TRUE;
        z0 = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", bool36, bool36, o2.a);
        Boolean bool37 = Boolean.TRUE;
        A0 = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", bool37, bool37, r2.a);
        Boolean bool38 = Boolean.TRUE;
        B0 = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", bool38, bool38, q2.a);
        Boolean bool39 = Boolean.TRUE;
        C0 = a("measurement.gold.enhanced_ecommerce.updated_schema.client", bool39, bool39, t2.a);
        Boolean bool40 = Boolean.TRUE;
        D0 = a("measurement.gold.enhanced_ecommerce.updated_schema.service", bool40, bool40, s2.a);
        Boolean bool41 = Boolean.FALSE;
        a("measurement.collection.synthetic_data_mitigation", bool41, bool41, v2.a);
        Boolean bool42 = Boolean.TRUE;
        E0 = a("measurement.service.configurable_service_limits", bool42, bool42, u2.a);
        Boolean bool43 = Boolean.TRUE;
        F0 = a("measurement.client.configurable_service_limits", bool43, bool43, x2.a);
        Boolean bool44 = Boolean.TRUE;
        G0 = a("measurement.androidId.delete_feature", bool44, bool44, z2.a);
        Boolean bool45 = Boolean.TRUE;
        H0 = a("measurement.client.global_params", bool45, bool45, y2.a);
        Boolean bool46 = Boolean.TRUE;
        I0 = a("measurement.service.global_params", bool46, bool46, b3.a);
        Boolean bool47 = Boolean.TRUE;
        J0 = a("measurement.service.global_params_in_payload", bool47, bool47, a3.a);
        Boolean bool48 = Boolean.TRUE;
        K0 = a("measurement.client.string_reader", bool48, bool48, d3.a);
        Boolean bool49 = Boolean.TRUE;
        L0 = a("measurement.sdk.attribution.cache", bool49, bool49, c3.a);
        Boolean bool50 = Boolean.TRUE;
        N0 = a("measurement.service.database_return_empty_collection", bool50, bool50, f3.a);
        Boolean bool51 = Boolean.TRUE;
        O0 = a("measurement.service.ssaid_removal", bool51, bool51, i3.a);
        Boolean bool52 = Boolean.FALSE;
        P0 = a("measurement.client.consent_state_v1", bool52, bool52, h3.a);
        Boolean bool53 = Boolean.FALSE;
        Q0 = a("measurement.service.consent_state_v1_W33", bool53, bool53, j3.a);
        Boolean bool54 = Boolean.FALSE;
        S0 = a("measurement.client.ad_impression.dev", bool54, bool54, l3.a);
        Boolean bool55 = Boolean.FALSE;
        T0 = a("measurement.service.ad_impression", bool55, bool55, o3.a);
        Boolean bool56 = Boolean.FALSE;
        U0 = a("measurement.service.separate_public_internal_event_blacklisting", bool56, bool56, n3.a);
    }

    private static <V> r3<V> a(String str, V v2, V v3, p3<V> p3Var) {
        r3 r3Var = new r3(str, v2, v3, p3Var);
        a.add(r3Var);
        return r3Var;
    }

    public static Map<String, String> c(Context context) {
        s1 b2 = s1.b(context.getContentResolver(), i2.a("com.google.android.gms.measurement"));
        return b2 == null ? Collections.emptyMap() : b2.c();
    }
}
