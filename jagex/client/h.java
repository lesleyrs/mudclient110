// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;


// Referenced classes of package jagex.client:
//            j

public class h {

    public h(j j1, int i) {
        vf = -1;
        jg = true;
        we = j1;
        ye = i;
        ze = new boolean[i];
        af = new boolean[i];
        bf = new boolean[i];
        cf = new boolean[i];
        hf = new boolean[i];
        df = new int[i];
        ef = new int[i];
        ff = new int[i];
        gf = new int[i];
        _fldif = new int[i];
        jf = new int[i];
        kf = new int[i];
        lf = new int[i];
        mf = new int[i];
        nf = new int[i];
        of = new int[i];
        pf = new String[i];
        qf = new String[i][];
        xf = cd(114, 114, 176);
        yf = cd(14, 14, 62);
        zf = cd(200, 208, 232);
        ag = cd(96, 129, 184);
        bg = cd(53, 95, 115);
        cg = cd(117, 142, 171);
        dg = cd(98, 122, 158);
        eg = cd(86, 100, 136);
        fg = cd(135, 146, 179);
        gg = cd(97, 112, 151);
        hg = cd(88, 102, 136);
        ig = cd(84, 93, 120);
    }

    public int cd(int i, int k, int l) {
        return j.pg((mg * i) / 114, (ng * k) / 114, (og * l) / 176);
    }

    public void td() {
        tf = 0;
    }

    public void vd(int i, int k, int l, int i1) {
        rf = i;
        sf = k;
        uf = i1;
        if(l != 0)
            tf = l;
        if(l == 1) {
            for(int j1 = 0; j1 < xe; j1++) {
                if(ze[j1] && kf[j1] == 10 && rf >= _fldif[j1] && sf >= jf[j1] && rf <= _fldif[j1] + lf[j1] && sf <= jf[j1] + mf[j1])
                    cf[j1] = true;
                if(ze[j1] && kf[j1] == 14 && rf >= _fldif[j1] && sf >= jf[j1] && rf <= _fldif[j1] + lf[j1] && sf <= jf[j1] + mf[j1])
                    ff[j1] = 1 - ff[j1];
            }

        }
        if(i1 == 1)
            wf++;
        else
            wf = 0;
        if(l == 1 || wf > 20) {
            for(int k1 = 0; k1 < xe; k1++)
                if(ze[k1] && kf[k1] == 15 && rf >= _fldif[k1] && sf >= jf[k1] && rf <= _fldif[k1] + lf[k1] && sf <= jf[k1] + mf[k1])
                    cf[k1] = true;

            wf -= 5;
        }
    }

    public boolean xd(int i) {
        if(ze[i] && cf[i]) {
            cf[i] = false;
            return true;
        } else {
            return false;
        }
    }

    public void ud(int i) {
        if(i == 0)
            return;
        if(vf != -1 && pf[vf] != null && ze[vf]) {
            int k = pf[vf].length();
            if(i == 8 && k > 0)
                pf[vf] = pf[vf].substring(0, k - 1);
            if((i == 10 || i == 13) && k > 0)
                cf[vf] = true;
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
            if(k < nf[vf]) {
                for(int l = 0; l < s.length(); l++)
                    if(i == s.charAt(l))
                        pf[vf] += (char)i;

            }
            if(i == 9) {
                do
                    vf = (vf + 1) % xe;
                while(kf[vf] != 5 && kf[vf] != 6);
                return;
            }
        }
    }

    public void nc() {
        for(int i = 0; i < xe; i++)
            if(ze[i])
                if(kf[i] == 0)
                    md(i, _fldif[i], jf[i], pf[i], of[i]);
                else
                if(kf[i] == 1)
                    md(i, _fldif[i] - we.jf(pf[i], of[i]) / 2, jf[i], pf[i], of[i]);
                else
                if(kf[i] == 2)
                    nd(_fldif[i], jf[i], lf[i], mf[i]);
                else
                if(kf[i] == 3)
                    ad(_fldif[i], jf[i], lf[i]);
                else
                if(kf[i] == 4)
                    id(i, _fldif[i], jf[i], lf[i], mf[i], of[i], qf[i], ef[i], df[i]);
                else
                if(kf[i] == 5 || kf[i] == 6)
                    xc(i, _fldif[i], jf[i], lf[i], mf[i], pf[i], of[i]);
                else
                if(kf[i] == 7)
                    uc(i, _fldif[i], jf[i], of[i], qf[i]);
                else
                if(kf[i] == 8)
                    hc(i, _fldif[i], jf[i], of[i], qf[i]);
                else
                if(kf[i] == 9)
                    lc(i, _fldif[i], jf[i], lf[i], mf[i], of[i], qf[i], ef[i], df[i]);
                else
                if(kf[i] == 11)
                    ld(_fldif[i], jf[i], lf[i], mf[i]);
                else
                if(kf[i] == 12)
                    dd(_fldif[i], jf[i], of[i]);
                else
                if(kf[i] == 14)
                    hd(i, _fldif[i], jf[i], lf[i], mf[i]);

        tf = 0;
    }

    protected void hd(int i, int k, int l, int i1, int j1) {
        we.dg(k, l, i1, j1, 0xffffff);
        we.wg(k, l, i1, fg);
        we.bh(k, l, j1, fg);
        we.wg(k, (l + j1) - 1, i1, ig);
        we.bh((k + i1) - 1, l, j1, ig);
        if(ff[i] == 1) {
            for(int k1 = 0; k1 < j1; k1++) {
                we.wg(k + k1, l + k1, 1, 0);
                we.wg((k + i1) - 1 - k1, l + k1, 1, 0);
            }

        }
    }

    protected void md(int i, int k, int l, String s, int i1) {
        int j1 = l + we.sg(i1) / 3;
        od(i, k, j1, s, i1);
    }

    protected void od(int i, int k, int l, String s, int i1) {
        int j1;
        if(hf[i])
            j1 = 0xffffff;
        else
            j1 = 0;
        we.sf(s, k, l, i1, j1);
    }

    protected void xc(int i, int k, int l, int i1, int j1, String s, int k1) {
        if(bf[i]) {
            int l1 = s.length();
            s = "";
            for(int j2 = 0; j2 < l1; j2++)
                s = s + "X";

        }
        if(kf[i] == 5) {
            if(tf == 1 && rf >= k && sf >= l - j1 / 2 && rf <= k + i1 && sf <= l + j1 / 2)
                vf = i;
        } else
        if(kf[i] == 6) {
            if(tf == 1 && rf >= k - i1 / 2 && sf >= l - j1 / 2 && rf <= k + i1 / 2 && sf <= l + j1 / 2)
                vf = i;
            k -= we.jf(s, k1) / 2;
        }
        if(vf == i)
            s = s + "*";
        int i2 = l + we.sg(k1) / 3;
        od(i, k, i2, s, k1);
    }

    public void nd(int i, int k, int l, int i1) {
        we.xf(i, k, i + l, k + i1);
        we.lg(i, k, l, i1, ig, fg);
        if(kg) {
            for(int j1 = i - (k & 0x3f); j1 < i + l; j1 += 128) {
                for(int k1 = k - (k & 0x1f); k1 < k + i1; k1 += 128)
                    we.vg(j1, k1, 6 + lg, 128);

            }

        }
        we.wg(i, k, l, fg);
        we.wg(i + 1, k + 1, l - 2, fg);
        we.wg(i + 2, k + 2, l - 4, gg);
        we.bh(i, k, i1, fg);
        we.bh(i + 1, k + 1, i1 - 2, fg);
        we.bh(i + 2, k + 2, i1 - 4, gg);
        we.wg(i, (k + i1) - 1, l, ig);
        we.wg(i + 1, (k + i1) - 2, l - 2, ig);
        we.wg(i + 2, (k + i1) - 3, l - 4, hg);
        we.bh((i + l) - 1, k, i1, ig);
        we.bh((i + l) - 2, k + 1, i1 - 2, ig);
        we.bh((i + l) - 3, k + 2, i1 - 4, hg);
        we.yf();
    }

    public void ld(int i, int k, int l, int i1) {
        we.dg(i, k, l, i1, 0);
        we.wf(i, k, l, i1, cg);
        we.wf(i + 1, k + 1, l - 2, i1 - 2, dg);
        we.wf(i + 2, k + 2, l - 4, i1 - 4, eg);
        we.dh(i, k, 2 + lg);
        we.dh((i + l) - 7, k, 3 + lg);
        we.dh(i, (k + i1) - 7, 4 + lg);
        we.dh((i + l) - 7, (k + i1) - 7, 5 + lg);
    }

    protected void dd(int i, int k, int l) {
        we.dh(i, k, l);
    }

    protected void ad(int i, int k, int l) {
        we.wg(i, k, l, 0);
    }

    protected void id(int i, int k, int l, int i1, int j1, int k1, String as[], 
            int l1, int i2) {
        int j2 = j1 / we.sg(k1);
        if(i2 > l1 - j2)
            i2 = l1 - j2;
        if(i2 < 0)
            i2 = 0;
        df[i] = i2;
        if(j2 < l1) {
            int k2 = (k + i1) - 12;
            int i3 = ((j1 - 27) * j2) / l1;
            if(i3 < 6)
                i3 = 6;
            int k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
            if(uf == 1 && rf >= k2 && rf <= k2 + 12) {
                if(sf > l && sf < l + 12 && i2 > 0)
                    i2--;
                if(sf > (l + j1) - 12 && sf < l + j1 && i2 < l1 - j2)
                    i2++;
                df[i] = i2;
            }
            if(uf == 1 && (rf >= k2 && rf <= k2 + 12 || rf >= k2 - 12 && rf <= k2 + 24 && af[i])) {
                if(sf > l + 12 && sf < (l + j1) - 12) {
                    af[i] = true;
                    int i4 = sf - l - 12 - i3 / 2;
                    i2 = (i4 * l1) / (j1 - 24);
                    if(i2 > l1 - j2)
                        i2 = l1 - j2;
                    if(i2 < 0)
                        i2 = 0;
                    df[i] = i2;
                }
            } else {
                af[i] = false;
            }
            k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
            rd(k, l, i1, j1, k3, i3);
        }
        int l2 = j1 - j2 * we.sg(k1);
        int j3 = l + (we.sg(k1) * 5) / 6 + l2 / 2;
        for(int l3 = i2; l3 < l1; l3++) {
            od(i, k + 2, j3, as[l3], k1);
            j3 += we.sg(k1) - pg;
            if(j3 >= l + j1)
                return;
        }

    }

    protected void rd(int i, int k, int l, int i1, int j1, int k1) {
        int l1 = (i + l) - 12;
        we.wf(l1, k, 12, i1, 0);
        we.dh(l1 + 1, k + 1, lg);
        we.dh(l1 + 1, (k + i1) - 12, 1 + lg);
        we.wg(l1, k + 13, 12, 0);
        we.wg(l1, (k + i1) - 13, 12, 0);
        we.lg(l1 + 1, k + 14, 11, i1 - 27, xf, yf);
        we.dg(l1 + 3, j1 + k + 14, 7, k1, ag);
        we.bh(l1 + 2, j1 + k + 14, k1, zf);
        we.bh(l1 + 2 + 8, j1 + k + 14, k1, bg);
    }

    protected void uc(int i, int k, int l, int i1, String as[]) {
        int j1 = 0;
        int k1 = as.length;
        for(int l1 = 0; l1 < k1; l1++) {
            j1 += we.jf(as[l1], i1);
            if(l1 < k1 - 1)
                j1 += we.jf("  ", i1);
        }

        int i2 = k - j1 / 2;
        int j2 = l + we.sg(i1) / 3;
        for(int k2 = 0; k2 < k1; k2++) {
            int l2;
            if(hf[i])
                l2 = 0xffffff;
            else
                l2 = 0;
            if(rf >= i2 && rf <= i2 + we.jf(as[k2], i1) && sf <= j2 && sf > j2 - we.sg(i1)) {
                if(hf[i])
                    l2 = 0x808080;
                else
                    l2 = 0xffffff;
                if(tf == 1) {
                    ff[i] = k2;
                    cf[i] = true;
                }
            }
            if(ff[i] == k2)
                if(hf[i])
                    l2 = 0xff0000;
                else
                    l2 = 0xc00000;
            we.sf(as[k2], i2, j2, i1, l2);
            i2 += we.jf(as[k2] + "  ", i1);
        }

    }

    protected void hc(int i, int k, int l, int i1, String as[]) {
        int j1 = as.length;
        int k1 = l - (we.sg(i1) * (j1 - 1)) / 2;
        for(int l1 = 0; l1 < j1; l1++) {
            int i2;
            if(hf[i])
                i2 = 0xffffff;
            else
                i2 = 0;
            int j2 = we.jf(as[l1], i1);
            if(rf >= k - j2 / 2 && rf <= k + j2 / 2 && sf - 2 <= k1 && sf - 2 > k1 - we.sg(i1)) {
                if(hf[i])
                    i2 = 0x808080;
                else
                    i2 = 0xffffff;
                if(tf == 1) {
                    ff[i] = l1;
                    cf[i] = true;
                }
            }
            if(ff[i] == l1)
                if(hf[i])
                    i2 = 0xff0000;
                else
                    i2 = 0xc00000;
            we.sf(as[l1], k - j2 / 2, k1, i1, i2);
            k1 += we.sg(i1);
        }

    }

    protected void lc(int i, int k, int l, int i1, int j1, int k1, String as[], 
            int l1, int i2) {
        int j2 = j1 / we.sg(k1);
        if(j2 < l1) {
            int k2 = (k + i1) - 12;
            int i3 = ((j1 - 27) * j2) / l1;
            if(i3 < 6)
                i3 = 6;
            int k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
            if(uf == 1 && rf >= k2 && rf <= k2 + 12) {
                if(sf > l && sf < l + 12 && i2 > 0)
                    i2--;
                if(sf > (l + j1) - 12 && sf < l + j1 && i2 < l1 - j2)
                    i2++;
                df[i] = i2;
            }
            if(uf == 1 && (rf >= k2 && rf <= k2 + 12 || rf >= k2 - 12 && rf <= k2 + 24 && af[i])) {
                if(sf > l + 12 && sf < (l + j1) - 12) {
                    af[i] = true;
                    int i4 = sf - l - 12 - i3 / 2;
                    i2 = (i4 * l1) / (j1 - 24);
                    if(i2 < 0)
                        i2 = 0;
                    if(i2 > l1 - j2)
                        i2 = l1 - j2;
                    df[i] = i2;
                }
            } else {
                af[i] = false;
            }
            k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
            rd(k, l, i1, j1, k3, i3);
        } else {
            i2 = 0;
            df[i] = 0;
        }
        gf[i] = -1;
        int l2 = j1 - j2 * we.sg(k1);
        int j3 = l + (we.sg(k1) * 5) / 6 + l2 / 2;
        for(int l3 = i2; l3 < l1; l3++) {
            int j4;
            if(hf[i])
                j4 = 0xffffff;
            else
                j4 = 0;
            if(rf >= k + 2 && rf <= k + 2 + we.jf(as[l3], k1) && sf - 2 <= j3 && sf - 2 > j3 - we.sg(k1)) {
                if(hf[i])
                    j4 = 0x808080;
                else
                    j4 = 0xffffff;
                gf[i] = l3;
                if(tf == 1) {
                    ff[i] = l3;
                    cf[i] = true;
                }
            }
            if(ff[i] == l3 && jg)
                j4 = 0xff0000;
            we.sf(as[l3], k + 2, j3, k1, j4);
            j3 += we.sg(k1);
            if(j3 >= l + j1)
                return;
        }

    }

    public int qc(int i, int k, String s, int l, boolean flag) {
        kf[xe] = 0;
        ze[xe] = true;
        cf[xe] = false;
        of[xe] = l;
        hf[xe] = flag;
        _fldif[xe] = i;
        jf[xe] = k;
        pf[xe] = s;
        return xe++;
    }

    public int pd(int i, int k, String s, int l, boolean flag) {
        kf[xe] = 1;
        ze[xe] = true;
        cf[xe] = false;
        of[xe] = l;
        hf[xe] = flag;
        _fldif[xe] = i;
        jf[xe] = k;
        pf[xe] = s;
        return xe++;
    }

    public int gd(int i, int k, int l, int i1) {
        kf[xe] = 2;
        ze[xe] = true;
        cf[xe] = false;
        _fldif[xe] = i - l / 2;
        jf[xe] = k - i1 / 2;
        lf[xe] = l;
        mf[xe] = i1;
        return xe++;
    }

    public int pc(int i, int k, int l, int i1) {
        kf[xe] = 11;
        ze[xe] = true;
        cf[xe] = false;
        _fldif[xe] = i - l / 2;
        jf[xe] = k - i1 / 2;
        lf[xe] = l;
        mf[xe] = i1;
        return xe++;
    }

    public int rc(int i, int k, int l) {
        int i1 = we.nk[l];
        int j1 = we.ok[l];
        kf[xe] = 12;
        ze[xe] = true;
        cf[xe] = false;
        _fldif[xe] = i - i1 / 2;
        jf[xe] = k - j1 / 2;
        lf[xe] = i1;
        mf[xe] = j1;
        of[xe] = l;
        return xe++;
    }

    public int jc(int i, int k, int l, int i1, int j1, int k1, boolean flag) {
        kf[xe] = 4;
        ze[xe] = true;
        cf[xe] = false;
        _fldif[xe] = i;
        jf[xe] = k;
        lf[xe] = l;
        mf[xe] = i1;
        hf[xe] = flag;
        of[xe] = j1;
        nf[xe] = k1;
        ef[xe] = 0;
        df[xe] = 0;
        qf[xe] = new String[k1];
        return xe++;
    }

    public int kc(int i, int k, int l, int i1, int j1, int k1, boolean flag, 
            boolean flag1) {
        kf[xe] = 5;
        ze[xe] = true;
        bf[xe] = flag;
        cf[xe] = false;
        of[xe] = j1;
        hf[xe] = flag1;
        _fldif[xe] = i;
        jf[xe] = k;
        lf[xe] = l;
        mf[xe] = i1;
        nf[xe] = k1;
        pf[xe] = "";
        return xe++;
    }

    public int ed(int i, int k, int l, int i1, int j1, int k1, boolean flag, 
            boolean flag1) {
        kf[xe] = 6;
        ze[xe] = true;
        bf[xe] = flag;
        cf[xe] = false;
        of[xe] = j1;
        hf[xe] = flag1;
        _fldif[xe] = i;
        jf[xe] = k;
        lf[xe] = l;
        mf[xe] = i1;
        nf[xe] = k1;
        pf[xe] = "";
        return xe++;
    }

    public int ic(int i, int k, String as[], int l, boolean flag) {
        kf[xe] = 8;
        ze[xe] = true;
        cf[xe] = false;
        of[xe] = l;
        hf[xe] = flag;
        _fldif[xe] = i;
        jf[xe] = k;
        qf[xe] = as;
        ff[xe] = 0;
        return xe++;
    }

    public int wc(int i, int k, int l, int i1, int j1, int k1, boolean flag) {
        kf[xe] = 9;
        ze[xe] = true;
        cf[xe] = false;
        of[xe] = j1;
        hf[xe] = flag;
        _fldif[xe] = i;
        jf[xe] = k;
        lf[xe] = l;
        mf[xe] = i1;
        nf[xe] = k1;
        qf[xe] = new String[k1];
        ef[xe] = 0;
        df[xe] = 0;
        ff[xe] = -1;
        gf[xe] = -1;
        return xe++;
    }

    public int sd(int i, int k, int l, int i1) {
        kf[xe] = 10;
        ze[xe] = true;
        cf[xe] = false;
        _fldif[xe] = i - l / 2;
        jf[xe] = k - i1 / 2;
        lf[xe] = l;
        mf[xe] = i1;
        return xe++;
    }

    public int yc(int i, int k, int l) {
        kf[xe] = 14;
        ze[xe] = true;
        cf[xe] = false;
        _fldif[xe] = i - l / 2;
        jf[xe] = k - l / 2;
        lf[xe] = l;
        mf[xe] = l;
        return xe++;
    }

    public void sc(int i) {
        ef[i] = 0;
    }

    public void fd(int i) {
        df[i] = 0;
        gf[i] = -1;
    }

    public void jd(int i, int k, String s) {
        qf[i][k] = s;
        if(k + 1 > ef[i])
            ef[i] = k + 1;
    }

    public void mc(int i, String s, boolean flag) {
        int k = ef[i]++;
        if(k >= nf[i]) {
            k--;
            ef[i]--;
            for(int l = 0; l < k; l++)
                qf[i][l] = qf[i][l + 1];

        }
        qf[i][k] = s;
        if(flag)
            df[i] = 0xf423f;
    }

    public void qd(int i, String s) {
        pf[i] = s;
    }

    public String vc(int i) {
        if(pf[i] == null)
            return "null";
        else
            return pf[i];
    }

    public void kd(int i) {
        ze[i] = true;
    }

    public void wd(int i) {
        ze[i] = false;
    }

    public void tc(int i) {
        vf = i;
    }

    public int zc(int i) {
        return ff[i];
    }

    public int oc(int i) {
        int k = gf[i];
        return k;
    }

    public void bd(int i, int k) {
        ff[i] = k;
    }

    protected j we;
    int xe;
    int ye;
    public boolean ze[];
    public boolean af[];
    public boolean bf[];
    public boolean cf[];
    public int df[];
    public int ef[];
    public int ff[];
    public int gf[];
    boolean hf[];
    int _fldif[];
    int jf[];
    int kf[];
    int lf[];
    int mf[];
    int nf[];
    int of[];
    String pf[];
    String qf[][];
    int rf;
    int sf;
    int tf;
    int uf;
    int vf;
    int wf;
    int xf;
    int yf;
    int zf;
    int ag;
    int bg;
    int cg;
    int dg;
    int eg;
    int fg;
    int gg;
    int hg;
    int ig;
    public boolean jg;
    public static boolean kg = true;
    public static int lg;
    public static int mg = 114;
    public static int ng = 114;
    public static int og = 176;
    public static int pg;

}
