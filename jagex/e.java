// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex;

import java.io.*;

// Referenced classes of package jagex:
//            g, p

public class e extends g {

    public e(String s) throws IOException {
        uc = p.jn(s);
    }

    public void yb() {
        super.yb();
        try {
            if(uc != null) {
                uc.close();
                return;
            }
        }
        catch(IOException _ex) {
            System.out.println("Error closing stream");
        }
    }

    public int gc() throws IOException {
        return uc.read();
    }

    public int eb() throws IOException {
        return uc.available();
    }

    public void pb(int i, int j, byte abyte0[]) throws IOException {
        int k = 0;
        boolean flag = false;
        int l;
        for(; k < i; k += l)
            if((l = uc.read(abyte0, k + j, i - k)) <= 0)
                throw new IOException("EOF");

    }

    private InputStream uc;
}
