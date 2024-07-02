// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import jagex.p;
import java.io.*;

// Referenced classes of package jagex.client:
//            k

public class i {

    public i(int j, int l) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        ce(j, l);
        si = new int[l][1];
        for(int i1 = 0; i1 < l; i1++)
            si[i1][0] = i1;

    }

    public i(int j, int l, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        zh = flag;
        ai = flag1;
        bi = flag2;
        ci = flag3;
        di = flag4;
        ce(j, l);
    }

    private i(int j, int l, boolean flag) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        ce(j, l);
        si = new int[l][];
    }

    private void ce(int j, int l) {
        li = new int[j];
        mi = new int[j];
        ni = new int[j];
        wg = new int[j];
        xg = new byte[j];
        zg = new int[l];
        ah = new int[l][];
        bh = new int[l];
        ch = new int[l];
        fh = new int[l];
        eh = new int[l];
        dh = new int[l];
        if(!di) {
            rg = new int[j];
            sg = new int[j];
            tg = new int[j];
            ug = new int[j];
            vg = new int[j];
        }
        if(!ci) {
            yh = new byte[l];
            xh = new int[l];
        }
        if(zh) {
            oi = li;
            pi = mi;
            qi = ni;
        } else {
            oi = new int[j];
            pi = new int[j];
            qi = new int[j];
        }
        if(!bi || !ai) {
            gh = new int[l];
            hh = new int[l];
            ih = new int[l];
        }
        if(!ai) {
            ti = new int[l];
            ui = new int[l];
            vi = new int[l];
            wi = new int[l];
            xi = new int[l];
            yi = new int[l];
        }
        yg = 0;
        qg = 0;
        ki = j;
        ri = l;
        zi = aj = bj = 0;
        cj = dj = ej = 0;
        fj = gj = hj = 256;
        ij = jj = kj = lj = mj = nj = 256;
        oj = 0;
    }

    public void ze() {
        rg = new int[qg];
        sg = new int[qg];
        tg = new int[qg];
        ug = new int[qg];
        vg = new int[qg];
    }

    public void df() {
        yg = 0;
        qg = 0;
    }

    public void re(int j, int l) {
        yg -= j;
        if(yg < 0)
            yg = 0;
        qg -= l;
        if(qg < 0)
            qg = 0;
    }

    public i(byte abyte0[], int j, boolean flag) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        int l = p.zn(abyte0, j);
        j += 2;
        int i1 = p.zn(abyte0, j);
        j += 2;
        ce(l, i1);
        si = new int[i1][1];
        for(int j1 = 0; j1 < l; j1++) {
            li[j1] = p.bo(abyte0, j);
            j += 2;
        }

        for(int k1 = 0; k1 < l; k1++) {
            mi[k1] = p.bo(abyte0, j);
            j += 2;
        }

        for(int l1 = 0; l1 < l; l1++) {
            ni[l1] = p.bo(abyte0, j);
            j += 2;
        }

        qg = l;
        for(int i2 = 0; i2 < i1; i2++)
            zg[i2] = abyte0[j++] & 0xff;

        for(int j2 = 0; j2 < i1; j2++) {
            bh[j2] = p.bo(abyte0, j);
            j += 2;
            if(bh[j2] == 32767)
                bh[j2] = ji;
        }

        for(int k2 = 0; k2 < i1; k2++) {
            ch[k2] = p.bo(abyte0, j);
            j += 2;
            if(ch[k2] == 32767)
                ch[k2] = ji;
        }

        for(int l2 = 0; l2 < i1; l2++) {
            int i3 = abyte0[j++] & 0xff;
            if(i3 == 0)
                fh[l2] = 0;
            else
                fh[l2] = ji;
        }

        for(int j3 = 0; j3 < i1; j3++) {
            ah[j3] = new int[zg[j3]];
            for(int k3 = 0; k3 < zg[j3]; k3++)
                if(l < 256) {
                    ah[j3][k3] = abyte0[j++] & 0xff;
                } else {
                    ah[j3][k3] = p.zn(abyte0, j);
                    j += 2;
                }

        }

        yg = i1;
        lh = 1;
    }

    public i(byte abyte0[], int j) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        wj = abyte0;
        xj = j;
        yj = 0;
        xe(wj);
        int l = xe(wj);
        int i1 = xe(wj);
        boolean flag = false;
        ce(l, i1);
        si = new int[i1][];
        for(int j3 = 0; j3 < l; j3++) {
            int j1 = xe(wj);
            int k1 = xe(wj);
            int l1 = xe(wj);
            ue(j1, k1, l1);
        }

        for(int k3 = 0; k3 < i1; k3++) {
            int i2 = xe(wj);
            int j2 = xe(wj);
            int k2 = xe(wj);
            int l2 = xe(wj);
            uj = xe(wj);
            vj = xe(wj);
            int i3 = xe(wj);
            int ai1[] = new int[i2];
            for(int l3 = 0; l3 < i2; l3++)
                ai1[l3] = xe(wj);

            int ai2[] = new int[l2];
            for(int i4 = 0; i4 < l2; i4++)
                ai2[i4] = xe(wj);

            int j4 = te(i2, ai1, j2, k2);
            si[k3] = ai2;
            if(i3 == 0)
                fh[j4] = 0;
            else
                fh[j4] = ji;
        }

        lh = 1;
    }

    public i(String s) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        boolean flag = false;
        boolean flag1 = false;
        byte abyte0[] = null;
        try {
            java.io.InputStream inputstream = p.jn(s);
            DataInputStream datainputstream = new DataInputStream(inputstream);
            abyte0 = new byte[3];
            xj = 0;
            yj = 0;
            for(int j = 0; j < 3; j += datainputstream.read(abyte0, j, 3 - j));
            int i1 = xe(abyte0);
            abyte0 = new byte[i1];
            xj = 0;
            yj = 0;
            for(int l = 0; l < i1; l += datainputstream.read(abyte0, l, i1 - l));
            datainputstream.close();
        }
        catch(IOException _ex) {
            qg = 0;
            yg = 0;
            return;
        }
        int j1 = xe(abyte0);
        int k1 = xe(abyte0);
        boolean flag2 = false;
        ce(j1, k1);
        si = new int[k1][];
        for(int l3 = 0; l3 < j1; l3++) {
            int l1 = xe(abyte0);
            int i2 = xe(abyte0);
            int j2 = xe(abyte0);
            ue(l1, i2, j2);
        }

        for(int i4 = 0; i4 < k1; i4++) {
            int k2 = xe(abyte0);
            int l2 = xe(abyte0);
            int i3 = xe(abyte0);
            int j3 = xe(abyte0);
            uj = xe(abyte0);
            vj = xe(abyte0);
            int k3 = xe(abyte0);
            int ai1[] = new int[k2];
            for(int j4 = 0; j4 < k2; j4++)
                ai1[j4] = xe(abyte0);

            int ai2[] = new int[j3];
            for(int k4 = 0; k4 < j3; k4++)
                ai2[k4] = xe(abyte0);

            int l4 = te(k2, ai1, l2, i3);
            si[i4] = ai2;
            if(k3 == 0)
                fh[l4] = 0;
            else
                fh[l4] = ji;
        }

        lh = 1;
    }

    public i(i ai1[], int j, boolean flag, boolean flag1, boolean flag2, boolean flag3) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        zh = flag;
        ai = flag1;
        bi = flag2;
        ci = flag3;
        le(ai1, j, false);
    }

    public i(i ai1[], int j) {
        lh = 1;
        mh = true;
        th = true;
        uh = false;
        vh = false;
        wh = -1;
        zh = false;
        ai = false;
        bi = false;
        ci = false;
        di = false;
        ii = 4;
        ji = 0xbc614e;
        pj = 0xbc614e;
        qj = 180;
        rj = 155;
        sj = 95;
        tj = 256;
        uj = 512;
        vj = 32;
        le(ai1, j, true);
    }

    public void le(i ai1[], int j, boolean flag) {
        int l = 0;
        int i1 = 0;
        for(int j1 = 0; j1 < j; j1++) {
            l += ai1[j1].yg;
            i1 += ai1[j1].qg;
        }

        ce(i1, l);
        if(flag)
            si = new int[l][];
        for(int k1 = 0; k1 < j; k1++) {
            i l1 = ai1[k1];
            l1.oe();
            vj = l1.vj;
            uj = l1.uj;
            qj = l1.qj;
            rj = l1.rj;
            sj = l1.sj;
            tj = l1.tj;
            for(int i2 = 0; i2 < l1.yg; i2++) {
                int ai2[] = new int[l1.zg[i2]];
                int ai3[] = l1.ah[i2];
                for(int j2 = 0; j2 < l1.zg[i2]; j2++)
                    ai2[j2] = ue(l1.li[ai3[j2]], l1.mi[ai3[j2]], l1.ni[ai3[j2]]);

                int k2 = te(l1.zg[i2], ai2, l1.bh[i2], l1.ch[i2]);
                fh[k2] = l1.fh[i2];
                eh[k2] = l1.eh[i2];
                dh[k2] = l1.dh[i2];
                if(flag)
                    if(j > 1) {
                        si[k2] = new int[l1.si[i2].length + 1];
                        si[k2][0] = k1;
                        for(int l2 = 0; l2 < l1.si[i2].length; l2++)
                            si[k2][l2 + 1] = l1.si[i2][l2];

                    } else {
                        si[k2] = new int[l1.si[i2].length];
                        for(int i3 = 0; i3 < l1.si[i2].length; i3++)
                            si[k2][i3] = l1.si[i2][i3];

                    }
            }

        }

        lh = 1;
    }

    public i(int j, int ai1[], int ai2[], int ai3[], int l, int i1) {
        this(j, 1);
        qg = j;
        for(int j1 = 0; j1 < j; j1++) {
            li[j1] = ai1[j1];
            mi[j1] = ai2[j1];
            ni[j1] = ai3[j1];
        }

        yg = 1;
        zg[0] = j;
        int ai4[] = new int[j];
        for(int k1 = 0; k1 < j; k1++)
            ai4[k1] = k1;

        ah[0] = ai4;
        bh[0] = l;
        ch[0] = i1;
        lh = 1;
    }

    public int ue(int j, int l, int i1) {
        for(int j1 = 0; j1 < qg; j1++)
            if(li[j1] == j && mi[j1] == l && ni[j1] == i1)
                return j1;

        if(qg >= ki) {
            return -1;
        } else {
            li[qg] = j;
            mi[qg] = l;
            ni[qg] = i1;
            return qg++;
        }
    }

    public int je(int j, int l, int i1) {
        if(qg >= ki) {
            return -1;
        } else {
            li[qg] = j;
            mi[qg] = l;
            ni[qg] = i1;
            return qg++;
        }
    }

    public int te(int j, int ai1[], int l, int i1) {
        if(yg >= ri) {
            return -1;
        } else {
            zg[yg] = j;
            ah[yg] = ai1;
            bh[yg] = l;
            ch[yg] = i1;
            lh = 1;
            return yg++;
        }
    }

    public i[] ae(int j, int l, int i1, int j1, int k1, int l1, int i2, 
            boolean flag) {
        oe();
        int ai1[] = new int[l1];
        int ai2[] = new int[l1];
        for(int j2 = 0; j2 < l1; j2++) {
            ai1[j2] = 0;
            ai2[j2] = 0;
        }

        for(int k2 = 0; k2 < yg; k2++) {
            int l2 = 0;
            int i3 = 0;
            int k3 = zg[k2];
            int ai4[] = ah[k2];
            for(int k4 = 0; k4 < k3; k4++) {
                l2 += li[ai4[k4]];
                i3 += ni[ai4[k4]];
            }

            int i5 = l2 / (k3 * i1) + (i3 / (k3 * j1)) * k1;
            ai1[i5] += k3;
            ai2[i5]++;
        }

        i ai3[] = new i[l1];
        for(int j3 = 0; j3 < l1; j3++) {
            if(ai1[j3] > i2)
                ai1[j3] = i2;
            ai3[j3] = new i(ai1[j3], ai2[j3], true, true, true, flag, true);
            ai3[j3].uj = uj;
            ai3[j3].vj = vj;
        }

        for(int l3 = 0; l3 < yg; l3++) {
            int i4 = 0;
            int l4 = 0;
            int j5 = zg[l3];
            int ai5[] = ah[l3];
            for(int k5 = 0; k5 < j5; k5++) {
                i4 += li[ai5[k5]];
                l4 += ni[ai5[k5]];
            }

            int l5 = i4 / (j5 * i1) + (l4 / (j5 * j1)) * k1;
            ff(ai3[l5], ai5, j5, l3);
        }

        for(int j4 = 0; j4 < l1; j4++)
            ai3[j4].ze();

        return ai3;
    }

    public void ff(i j, int ai1[], int l, int i1) {
        int ai2[] = new int[l];
        for(int j1 = 0; j1 < l; j1++) {
            int k1 = ai2[j1] = j.ue(li[ai1[j1]], mi[ai1[j1]], ni[ai1[j1]]);
            j.wg[k1] = wg[ai1[j1]];
            j.xg[k1] = xg[ai1[j1]];
        }

        int l1 = j.te(l, ai2, bh[i1], ch[i1]);
        if(!j.ci && !ci)
            j.xh[l1] = xh[i1];
        j.fh[l1] = fh[i1];
        j.eh[l1] = eh[i1];
        j.dh[l1] = dh[i1];
    }

    public void ye(boolean flag, int j, int l, int i1, int j1, int k1) {
        vj = 256 - j * 4;
        uj = (64 - l) * 16 + 128;
        if(bi)
            return;
        for(int l1 = 0; l1 < yg; l1++)
            if(flag)
                fh[l1] = ji;
            else
                fh[l1] = 0;

        qj = i1;
        rj = j1;
        sj = k1;
        tj = (int)Math.sqrt(i1 * i1 + j1 * j1 + k1 * k1);
        se();
    }

    public void he(int j, int l, int i1, int j1, int k1) {
        vj = 256 - j * 4;
        uj = (64 - l) * 16 + 128;
        if(bi) {
            return;
        } else {
            qj = i1;
            rj = j1;
            sj = k1;
            tj = (int)Math.sqrt(i1 * i1 + j1 * j1 + k1 * k1);
            se();
            return;
        }
    }

    public void ef(int j, int l, int i1) {
        if(bi) {
            return;
        } else {
            qj = j;
            rj = l;
            sj = i1;
            tj = (int)Math.sqrt(j * j + l * l + i1 * i1);
            se();
            return;
        }
    }

    public void de(int j, int l) {
        xg[j] = (byte)l;
    }

    public void bf(int j, int l, int i1) {
        cj = cj + j & 0xff;
        dj = dj + l & 0xff;
        ej = ej + i1 & 0xff;
        cf();
        lh = 1;
    }

    public void qe(int j, int l, int i1) {
        cj = j & 0xff;
        dj = l & 0xff;
        ej = i1 & 0xff;
        cf();
        lh = 1;
    }

    public void fe(int j, int l, int i1) {
        zi += j;
        aj += l;
        bj += i1;
        cf();
        lh = 1;
    }

    public void me(int j, int l, int i1) {
        zi = j;
        aj = l;
        bj = i1;
        cf();
        lh = 1;
    }

    public int gf() {
        return zi;
    }

    public void be(int j, int l, int i1) {
        fj = j;
        gj = l;
        hj = i1;
        cf();
        lh = 1;
    }

    public void ge(int j, int l, int i1, int j1, int k1, int l1) {
        ij = j;
        jj = l;
        kj = i1;
        lj = j1;
        mj = k1;
        nj = l1;
        cf();
        lh = 1;
    }

    private void cf() {
        if(ij != 256 || jj != 256 || kj != 256 || lj != 256 || mj != 256 || nj != 256) {
            oj = 4;
            return;
        }
        if(fj != 256 || gj != 256 || hj != 256) {
            oj = 3;
            return;
        }
        if(cj != 0 || dj != 0 || ej != 0) {
            oj = 2;
            return;
        }
        if(zi != 0 || aj != 0 || bj != 0) {
            oj = 1;
            return;
        } else {
            oj = 0;
            return;
        }
    }

    private void hf(int j, int l, int i1) {
        for(int j1 = 0; j1 < qg; j1++) {
            oi[j1] += j;
            pi[j1] += l;
            qi[j1] += i1;
        }

    }

    private void ke(int j, int l, int i1) {
        for(int k3 = 0; k3 < qg; k3++) {
            if(i1 != 0) {
                int j1 = ei[i1];
                int i2 = ei[i1 + 256];
                int l2 = pi[k3] * j1 + oi[k3] * i2 >> 15;
                pi[k3] = pi[k3] * i2 - oi[k3] * j1 >> 15;
                oi[k3] = l2;
            }
            if(j != 0) {
                int k1 = ei[j];
                int j2 = ei[j + 256];
                int i3 = pi[k3] * j2 - qi[k3] * k1 >> 15;
                qi[k3] = pi[k3] * k1 + qi[k3] * j2 >> 15;
                pi[k3] = i3;
            }
            if(l != 0) {
                int l1 = ei[l];
                int k2 = ei[l + 256];
                int j3 = qi[k3] * l1 + oi[k3] * k2 >> 15;
                qi[k3] = qi[k3] * k2 - oi[k3] * l1 >> 15;
                oi[k3] = j3;
            }
        }

    }

    private void ie(int j, int l, int i1, int j1, int k1, int l1) {
        for(int i2 = 0; i2 < qg; i2++) {
            if(j != 0)
                oi[i2] += pi[i2] * j >> 8;
            if(l != 0)
                qi[i2] += pi[i2] * l >> 8;
            if(i1 != 0)
                oi[i2] += qi[i2] * i1 >> 8;
            if(j1 != 0)
                pi[i2] += qi[i2] * j1 >> 8;
            if(k1 != 0)
                qi[i2] += oi[i2] * k1 >> 8;
            if(l1 != 0)
                pi[i2] += oi[i2] * l1 >> 8;
        }

    }

    private void pe(int j, int l, int i1) {
        for(int j1 = 0; j1 < qg; j1++) {
            oi[j1] = oi[j1] * j >> 8;
            pi[j1] = pi[j1] * l >> 8;
            qi[j1] = qi[j1] * i1 >> 8;
        }

    }

    private void zd() {
        nh = ph = rh = 0xf423f;
        pj = oh = qh = sh = 0xfff0bdc1;
        for(int j = 0; j < yg; j++) {
            int ai1[] = ah[j];
            int i1 = ai1[0];
            int k1 = zg[j];
            int l1;
            int i2 = l1 = oi[i1];
            int j2;
            int k2 = j2 = pi[i1];
            int l2;
            int i3 = l2 = qi[i1];
            for(int l = 0; l < k1; l++) {
                int j1 = ai1[l];
                if(oi[j1] < l1)
                    l1 = oi[j1];
                else
                if(oi[j1] > i2)
                    i2 = oi[j1];
                if(pi[j1] < j2)
                    j2 = pi[j1];
                else
                if(pi[j1] > k2)
                    k2 = pi[j1];
                if(qi[j1] < l2)
                    l2 = qi[j1];
                else
                if(qi[j1] > i3)
                    i3 = qi[j1];
            }

            if(!ai) {
                ti[j] = l1;
                ui[j] = i2;
                vi[j] = j2;
                wi[j] = k2;
                xi[j] = l2;
                yi[j] = i3;
            }
            if(i2 - l1 > pj)
                pj = i2 - l1;
            if(k2 - j2 > pj)
                pj = k2 - j2;
            if(i3 - l2 > pj)
                pj = i3 - l2;
            if(l1 < nh)
                nh = l1;
            if(i2 > oh)
                oh = i2;
            if(j2 < ph)
                ph = j2;
            if(k2 > qh)
                qh = k2;
            if(l2 < rh)
                rh = l2;
            if(i3 > sh)
                sh = i3;
        }

    }

    public void se() {
        if(bi)
            return;
        int j = uj * tj >> 8;
        for(int l = 0; l < yg; l++)
            if(fh[l] != ji)
                fh[l] = (gh[l] * qj + hh[l] * rj + ih[l] * sj) / j;

        int ai1[] = new int[qg];
        int ai2[] = new int[qg];
        int ai3[] = new int[qg];
        int ai4[] = new int[qg];
        for(int i1 = 0; i1 < qg; i1++) {
            ai1[i1] = 0;
            ai2[i1] = 0;
            ai3[i1] = 0;
            ai4[i1] = 0;
        }

        for(int j1 = 0; j1 < yg; j1++)
            if(fh[j1] == ji) {
                for(int k1 = 0; k1 < zg[j1]; k1++) {
                    int i2 = ah[j1][k1];
                    ai1[i2] += gh[j1];
                    ai2[i2] += hh[j1];
                    ai3[i2] += ih[j1];
                    ai4[i2]++;
                }

            }

        for(int l1 = 0; l1 < qg; l1++)
            if(ai4[l1] > 0)
                wg[l1] = (ai1[l1] * qj + ai2[l1] * rj + ai3[l1] * sj) / (j * ai4[l1]);

    }

    public void ve() {
        if(bi && ai)
            return;
        for(int j = 0; j < yg; j++) {
            int ai1[] = ah[j];
            int l = oi[ai1[0]];
            int i1 = pi[ai1[0]];
            int j1 = qi[ai1[0]];
            int k1 = oi[ai1[1]] - l;
            int l1 = pi[ai1[1]] - i1;
            int i2 = qi[ai1[1]] - j1;
            int j2 = oi[ai1[2]] - l;
            int k2 = pi[ai1[2]] - i1;
            int l2 = qi[ai1[2]] - j1;
            int i3 = l1 * l2 - k2 * i2;
            int j3 = i2 * j2 - l2 * k1;
            int k3;
            for(k3 = k1 * k2 - j2 * l1; i3 > 8192 || j3 > 8192 || k3 > 8192 || i3 < -8192 || j3 < -8192 || k3 < -8192; k3 >>= 1) {
                i3 >>= 1;
                j3 >>= 1;
            }

            int l3 = (int)(256D * Math.sqrt(i3 * i3 + j3 * j3 + k3 * k3));
            if(l3 <= 0)
                l3 = 1;
            gh[j] = (i3 * 0x10000) / l3;
            hh[j] = (j3 * 0x10000) / l3;
            ih[j] = (k3 * 65535) / l3;
            eh[j] = -1;
        }

        se();
    }

    public void yd() {
        if(lh == 2) {
            lh = 0;
            for(int j = 0; j < qg; j++) {
                oi[j] = li[j];
                pi[j] = mi[j];
                qi[j] = ni[j];
            }

            nh = ph = rh = 0xff676981;
            pj = oh = qh = sh = 0x98967f;
            return;
        }
        if(lh == 1) {
            lh = 0;
            for(int l = 0; l < qg; l++) {
                oi[l] = li[l];
                pi[l] = mi[l];
                qi[l] = ni[l];
            }

            if(oj >= 2)
                ke(cj, dj, ej);
            if(oj >= 3)
                pe(fj, gj, hj);
            if(oj >= 4)
                ie(ij, jj, kj, lj, mj, nj);
            if(oj >= 1)
                hf(zi, aj, bj);
            zd();
            ve();
        }
    }

    public void ne(int j, int l, int i1, int j1, int k1, int l1, int i2, 
            int j2) {
        yd();
        if(rh > k.np || sh < k.mp || nh > k.jp || oh < k.ip || ph > k.lp || qh < k.kp) {
            mh = false;
            return;
        }
        mh = true;
        int j3 = 0;
        int k3 = 0;
        int l3 = 0;
        int i4 = 0;
        int j4 = 0;
        int k4 = 0;
        if(l1 != 0) {
            j3 = fi[l1];
            k3 = fi[l1 + 1024];
        }
        if(k1 != 0) {
            j4 = fi[k1];
            k4 = fi[k1 + 1024];
        }
        if(j1 != 0) {
            l3 = fi[j1];
            i4 = fi[j1 + 1024];
        }
        for(int l4 = 0; l4 < qg; l4++) {
            int i5 = oi[l4] - j;
            int j5 = pi[l4] - l;
            int k5 = qi[l4] - i1;
            if(l1 != 0) {
                int k2 = j5 * j3 + i5 * k3 >> 15;
                j5 = j5 * k3 - i5 * j3 >> 15;
                i5 = k2;
            }
            if(k1 != 0) {
                int l2 = k5 * j4 + i5 * k4 >> 15;
                k5 = k5 * k4 - i5 * j4 >> 15;
                i5 = l2;
            }
            if(j1 != 0) {
                int i3 = j5 * i4 - k5 * l3 >> 15;
                k5 = j5 * l3 + k5 * i4 >> 15;
                j5 = i3;
            }
            if(k5 >= j2)
                ug[l4] = (i5 << i2) / k5;
            else
                ug[l4] = i5 << i2;
            if(k5 >= j2)
                vg[l4] = (j5 << i2) / k5;
            else
                vg[l4] = j5 << i2;
            rg[l4] = i5;
            sg[l4] = j5;
            tg[l4] = k5;
        }

    }

    public void oe() {
        yd();
        for(int j = 0; j < qg; j++) {
            li[j] = oi[j];
            mi[j] = pi[j];
            ni[j] = qi[j];
        }

        zi = aj = bj = 0;
        cj = dj = ej = 0;
        fj = gj = hj = 256;
        ij = jj = kj = lj = mj = nj = 256;
        oj = 0;
    }

    public i we() {
        i ai1[] = new i[1];
        ai1[0] = this;
        i j = new i(ai1, 1);
        j.kh = kh;
        return j;
    }

    public i af(boolean flag, boolean flag1, boolean flag2, boolean flag3) {
        i ai1[] = new i[1];
        ai1[0] = this;
        i j = new i(ai1, 1, flag, flag1, flag2, flag3);
        j.kh = kh;
        return j;
    }

    public void ee(i j) {
        cj = j.cj;
        dj = j.dj;
        ej = j.ej;
        zi = j.zi;
        aj = j.aj;
        bj = j.bj;
        cf();
        lh = 1;
    }

    public int xe(byte abyte0[]) {
        for(; abyte0[xj] == 10 || abyte0[xj] == 13; xj++);
        int j = hi[abyte0[xj++] & 0xff];
        int l = hi[abyte0[xj++] & 0xff];
        int i1 = hi[abyte0[xj++] & 0xff];
        int j1 = (j * 4096 + l * 64 + i1) - 0x20000;
        if(j1 == 0x1e240)
            j1 = ji;
        return j1;
    }

    public int qg;
    public int rg[];
    public int sg[];
    public int tg[];
    public int ug[];
    public int vg[];
    public int wg[];
    public byte xg[];
    public int yg;
    public int zg[];
    public int ah[][];
    public int bh[];
    public int ch[];
    public int dh[];
    public int eh[];
    public int fh[];
    public int gh[];
    public int hh[];
    public int ih[];
    public int jh;
    public int kh;
    public int lh;
    public boolean mh;
    public int nh;
    public int oh;
    public int ph;
    public int qh;
    public int rh;
    public int sh;
    public boolean th;
    public boolean uh;
    public boolean vh;
    public int wh;
    public int xh[];
    public byte yh[];
    private boolean zh;
    public boolean ai;
    public boolean bi;
    public boolean ci;
    public boolean di;
    private static int ei[];
    private static int fi[];
    private static byte gi[];
    private static int hi[];
    private int ii;
    private int ji;
    public int ki;
    public int li[];
    public int mi[];
    public int ni[];
    public int oi[];
    public int pi[];
    public int qi[];
    private int ri;
    private int si[][];
    private int ti[];
    private int ui[];
    private int vi[];
    private int wi[];
    private int xi[];
    private int yi[];
    private int zi;
    private int aj;
    private int bj;
    private int cj;
    private int dj;
    private int ej;
    private int fj;
    private int gj;
    private int hj;
    private int ij;
    private int jj;
    private int kj;
    private int lj;
    private int mj;
    private int nj;
    private int oj;
    private int pj;
    private int qj;
    private int rj;
    private int sj;
    private int tj;
    protected int uj;
    protected int vj;
    private byte wj[];
    private int xj;
    private int yj;

    static  {
        ei = new int[512];
        fi = new int[2048];
        gi = new byte[64];
        hi = new int[256];
        for(int j = 0; j < 256; j++) {
            ei[j] = (int)(Math.sin((double)j * 0.02454369D) * 32768D);
            ei[j + 256] = (int)(Math.cos((double)j * 0.02454369D) * 32768D);
        }

        for(int l = 0; l < 1024; l++) {
            fi[l] = (int)(Math.sin((double)l * 0.00613592315D) * 32768D);
            fi[l + 1024] = (int)(Math.cos((double)l * 0.00613592315D) * 32768D);
        }

        for(int i1 = 0; i1 < 10; i1++)
            gi[i1] = (byte)(48 + i1);

        for(int j1 = 0; j1 < 26; j1++)
            gi[j1 + 10] = (byte)(65 + j1);

        for(int k1 = 0; k1 < 26; k1++)
            gi[k1 + 36] = (byte)(97 + k1);

        gi[62] = -93;
        gi[63] = 36;
        for(int l1 = 0; l1 < 10; l1++)
            hi[48 + l1] = l1;

        for(int i2 = 0; i2 < 26; i2++)
            hi[65 + i2] = i2 + 10;

        for(int j2 = 0; j2 < 26; j2++)
            hi[97 + j2] = j2 + 36;

        hi[163] = 62;
        hi[36] = 63;
    }
}
