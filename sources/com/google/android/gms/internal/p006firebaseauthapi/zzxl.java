package com.google.android.gms.internal.p006firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxl */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
public final class zzxl implements zzuj<zzxl> {
    private static final String zza = zzxl.class.getSimpleName();
    private String zzb;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) throws zzpz {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzaf.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzyc.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
