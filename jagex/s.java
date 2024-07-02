// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex;

import java.io.IOException;

// Referenced classes of package jagex:
//            g

public class s extends g {

    public s(byte abyte0[]) {
        pib = abyte0;
        oib = 0;
    }

    public s(byte abyte0[], int i) {
        pib = abyte0;
        oib = i;
    }

    public void yb() {
        super.yb();
        pib = null;
    }

    public int gc() throws IOException {
        return pib[oib++];
    }

    public int eb() throws IOException {
        return pib.length - oib;
    }

    public void pb(int i, int j, byte abyte0[]) throws IOException {
        for(int k = 0; k < i; k++)
            abyte0[j + k] = pib[oib++];

    }

    private int oib;
    private byte pib[];
}
