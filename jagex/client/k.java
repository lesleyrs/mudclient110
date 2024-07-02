// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import jagex.*;
import java.io.IOException;
import java.io.PrintStream;

// Referenced classes of package jagex.client:
//            i, u, r, l, 
//            j, a

public class k {

    public k(j j1, int i1, int k1, int l1) {
        gm = 50;
        hm = new int[gm];
        im = new int[gm][256];
        lm = 5;
        mm = 1000;
        nm = 1000;
        om = 20;
        pm = 10;
        sm = false;
        tm = 1.1000000000000001D;
        um = 1;
        vm = false;
        zm = 100;
        an = new i[zm];
        bn = new int[zm];
        cn = 512;
        dn = 256;
        en = 192;
        fn = 256;
        gn = 256;
        hn = 8;
        in = 4;
        bp = new int[40];
        cp = new int[40];
        dp = new int[40];
        ep = new int[40];
        fp = new int[40];
        gp = new int[40];
        hp = false;
        wo = j1;
        dn = j1.ak / 2;
        en = j1.bk / 2;
        xo = j1.gk;
        pn = 0;
        qn = i1;
        rn = new i[qn];
        sn = new int[qn];
        tn = 0;
        un = new r[k1];
        for(int i2 = 0; i2 < k1; i2++)
            un[i2] = new r();

        wn = 0;
        eo = new i(l1 * 2, l1);
        xn = new int[l1];
        bo = new int[l1];
        co = new int[l1];
        yn = new int[l1];
        zn = new int[l1];
        ao = new int[l1];
        _flddo = new int[l1];
        if(uo == null)
            uo = new byte[17691];
        jn = 0;
        kn = 0;
        ln = 0;
        mn = 0;
        nn = 0;
        on = 0;
        for(int j2 = 0; j2 < 256; j2++) {
            rm[j2] = (int)(Math.sin((double)j2 * 0.02454369D) * 32768D);
            rm[j2 + 256] = (int)(Math.cos((double)j2 * 0.02454369D) * 32768D);
        }

        for(int k2 = 0; k2 < 1024; k2++) {
            qm[k2] = (int)(Math.sin((double)k2 * 0.00613592315D) * 32768D);
            qm[k2 + 1024] = (int)(Math.cos((double)k2 * 0.00613592315D) * 32768D);
        }

    }

    public void ai(i i1) {
        if(pn < qn) {
            sn[pn] = 0;
            rn[pn++] = i1;
        }
    }

    public void ei(i i1) {
        for(int j1 = 0; j1 < pn; j1++)
            if(rn[j1] == i1) {
                pn--;
                for(int k1 = j1; k1 < pn; k1++) {
                    rn[k1] = rn[k1 + 1];
                    sn[k1] = sn[k1 + 1];
                }

            }

    }

    public void yi() {
        gi();
        for(int i1 = 0; i1 < pn; i1++)
            rn[i1] = null;

        pn = 0;
    }

    public void gi() {
        wn = 0;
        eo.df();
    }

    public void pi(int i1) {
        wn -= i1;
        eo.re(i1, i1 * 2);
        if(wn < 0)
            wn = 0;
    }

    public int dj(int i1, int j1, int k1, int l1, int i2, int j2) {
        xn[wn] = i1;
        yn[wn] = j1;
        zn[wn] = k1;
        ao[wn] = l1;
        bo[wn] = i2;
        co[wn] = j2;
        _flddo[wn] = 0;
        int k2 = eo.je(j1, k1, l1);
        int l2 = eo.je(j1, k1 - j2, l1);
        int ai1[] = {
            k2, l2
        };
        eo.te(2, ai1, 0, 0);
        eo.yh[wn++] = 0;
        return wn - 1;
    }

    public int rh(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
        xn[wn] = i1;
        yn[wn] = j1;
        zn[wn] = k1;
        ao[wn] = l1;
        bo[wn] = i2;
        co[wn] = j2;
        _flddo[wn] = 0;
        int l2 = eo.je(j1, k1, l1);
        int i3 = eo.je(j1, k1 - j2, l1);
        int ai1[] = {
            l2, i3
        };
        eo.te(2, ai1, 0, 0);
        eo.xh[wn] = k2;
        eo.yh[wn++] = 0;
        return wn - 1;
    }

    public void sh(int i1) {
        eo.yh[i1] = 1;
    }

    public void ti(int i1, int j1) {
        _flddo[i1] = j1;
    }

    public void bi(int i1, int j1) {
        wm = i1 - fn;
        xm = j1;
        ym = 0;
        vm = true;
    }

    public int xi() {
        return ym;
    }

    public int[] si() {
        return bn;
    }

    public i[] uh() {
        return an;
    }

    public void ji(int i1, int j1, int k1, int l1, int i2, int j2) {
        dn = k1;
        en = l1;
        fn = i1;
        gn = j1;
        cn = i2;
        hn = j2;
        yo = new u[l1 + j1];
        for(int k2 = 0; k2 < l1 + j1; k2++)
            yo[k2] = new u();

    }

    private void wh(r ar[], int i1, int j1) {
        if(i1 < j1) {
            int k1 = i1 - 1;
            int l1 = j1 + 1;
            int i2 = (i1 + j1) / 2;
            r r1 = ar[i2];
            ar[i2] = ar[i1];
            ar[i1] = r1;
            int j2 = r1.fib;
            while(k1 < l1)  {
                do
                    l1--;
                while(ar[l1].fib < j2);
                do
                    k1++;
                while(ar[k1].fib > j2);
                if(k1 < l1) {
                    r r2 = ar[k1];
                    ar[k1] = ar[l1];
                    ar[l1] = r2;
                }
            }
            wh(ar, i1, l1);
            wh(ar, l1 + 1, j1);
        }
    }

    public void nh(int i1, r ar[], int j1) {
        for(int k1 = 0; k1 <= j1; k1++) {
            ar[k1].lib = false;
            ar[k1].mib = k1;
            ar[k1].nib = -1;
        }

        int l1 = 0;
        do {
            while(ar[l1].lib) 
                l1++;
            if(l1 == j1)
                return;
            r r1 = ar[l1];
            r1.lib = true;
            int i2 = l1;
            int j2 = l1 + i1;
            if(j2 >= j1)
                j2 = j1 - 1;
            for(int k2 = j2; k2 >= i2 + 1; k2--) {
                r r2 = ar[k2];
                if(r1.xhb < r2.zhb && r2.xhb < r1.zhb && r1.yhb < r2.aib && r2.yhb < r1.aib && r1.mib != r2.nib && !oh(r1, r2) && mh(r2, r1)) {
                    aj(ar, i2, k2);
                    if(ar[k2] != r2)
                        k2++;
                    i2 = op;
                    r2.nib = r1.mib;
                }
            }

        } while(true);
    }

    public boolean aj(r ar[], int i1, int j1) {
        do {
            r r1 = ar[i1];
            for(int k1 = i1 + 1; k1 <= j1; k1++) {
                r r2 = ar[k1];
                if(!oh(r2, r1))
                    break;
                ar[i1] = r2;
                ar[k1] = r1;
                i1 = k1;
                if(i1 == j1) {
                    op = i1;
                    pp = i1 - 1;
                    return true;
                }
            }

            r r3 = ar[j1];
            for(int l1 = j1 - 1; l1 >= i1; l1--) {
                r r4 = ar[l1];
                if(!oh(r3, r4))
                    break;
                ar[j1] = r4;
                ar[l1] = r3;
                j1 = l1;
                if(i1 == j1) {
                    op = j1 + 1;
                    pp = j1;
                    return true;
                }
            }

            if(i1 + 1 >= j1) {
                op = i1;
                pp = j1;
                return false;
            }
            if(!aj(ar, i1 + 1, j1)) {
                op = i1;
                return false;
            }
            j1 = pp;
        } while(true);
    }

    public void wi(int i1, int j1, int k1) {
        int l1 = -mn + 1024 & 0x3ff;
        int i2 = -nn + 1024 & 0x3ff;
        int j2 = -on + 1024 & 0x3ff;
        if(j2 != 0) {
            int k2 = qm[j2];
            int j3 = qm[j2 + 1024];
            int i4 = j1 * k2 + i1 * j3 >> 15;
            j1 = j1 * j3 - i1 * k2 >> 15;
            i1 = i4;
        }
        if(l1 != 0) {
            int l2 = qm[l1];
            int k3 = qm[l1 + 1024];
            int j4 = j1 * k3 - k1 * l2 >> 15;
            k1 = j1 * l2 + k1 * k3 >> 15;
            j1 = j4;
        }
        if(i2 != 0) {
            int i3 = qm[i2];
            int l3 = qm[i2 + 1024];
            int k4 = k1 * i3 + i1 * l3 >> 15;
            k1 = k1 * l3 - i1 * i3 >> 15;
            i1 = k4;
        }
        if(i1 < ip)
            ip = i1;
        if(i1 > jp)
            jp = i1;
        if(j1 < kp)
            kp = j1;
        if(j1 > lp)
            lp = j1;
        if(k1 < mp)
            mp = k1;
        if(k1 > np)
            np = k1;
    }

    public void bj() {
        hp = wo.zk;
        int l4 = dn * mm >> hn;
        int i5 = en * mm >> hn;
        ip = 0;
        jp = 0;
        kp = 0;
        lp = 0;
        mp = 0;
        np = 0;
        wi(-l4, -i5, mm);
        wi(-l4, i5, mm);
        wi(l4, -i5, mm);
        wi(l4, i5, mm);
        wi(-dn, -en, 0);
        wi(-dn, en, 0);
        wi(dn, -en, 0);
        wi(dn, en, 0);
        ip += jn;
        jp += jn;
        kp += kn;
        lp += kn;
        mp += ln;
        np += ln;
        rn[pn] = eo;
        eo.lh = 2;
        for(int l1 = 0; l1 < pn; l1++)
            rn[l1].ne(jn, kn, ln, mn, nn, on, hn, lm);

        rn[pn].ne(jn, kn, ln, mn, nn, on, hn, lm);
        tn = 0;
        for(int j5 = 0; j5 < pn; j5++) {
            i i1 = rn[j5];
            if(i1.mh) {
                for(int i2 = 0; i2 < i1.yg; i2++) {
                    int k5 = i1.zg[i2];
                    int ai2[] = i1.ah[i2];
                    boolean flag = false;
                    for(int j6 = 0; j6 < k5; j6++) {
                        int l2 = i1.tg[ai2[j6]];
                        if(l2 <= lm || l2 >= mm)
                            continue;
                        flag = true;
                        break;
                    }

                    if(flag) {
                        int k3 = 0;
                        for(int j7 = 0; j7 < k5; j7++) {
                            int i3 = i1.ug[ai2[j7]];
                            if(i3 > -dn)
                                k3 |= 1;
                            if(i3 < dn)
                                k3 |= 2;
                            if(k3 == 3)
                                break;
                        }

                        if(k3 == 3) {
                            int l3 = 0;
                            for(int k8 = 0; k8 < k5; k8++) {
                                int j3 = i1.vg[ai2[k8]];
                                if(j3 > -en)
                                    l3 |= 1;
                                if(j3 < en)
                                    l3 |= 2;
                                if(l3 == 3)
                                    break;
                            }

                            if(l3 == 3) {
                                r r2 = un[tn];
                                r2.dib = i1;
                                r2.eib = i2;
                                cj(tn);
                                int k10;
                                if(r2.jib < 0)
                                    k10 = i1.bh[i2];
                                else
                                    k10 = i1.ch[i2];
                                if(k10 != 0xbc614e) {
                                    int i4 = 0;
                                    for(int k11 = 0; k11 < k5; k11++)
                                        i4 += i1.tg[ai2[k11]];

                                    int k4;
                                    r2.fib = k4 = i4 / k5 + i1.kh;
                                    r2.kib = k10;
                                    tn++;
                                }
                            }
                        }
                    }
                }

            }
        }

        i j1 = eo;
        if(j1.mh) {
            for(int j2 = 0; j2 < j1.yg; j2++) {
                int ai1[] = j1.ah[j2];
                int i6 = ai1[0];
                int k6 = j1.ug[i6];
                int k7 = j1.vg[i6];
                int l8 = j1.tg[i6];
                if(l8 > lm && l8 < nm) {
                    int l9 = (bo[j2] << hn) / l8;
                    int l10 = (co[j2] << hn) / l8;
                    if(k6 - l9 / 2 <= dn && k6 + l9 / 2 >= -dn && k7 - l10 <= en && k7 >= -en) {
                        r r3 = un[tn];
                        r3.dib = j1;
                        r3.eib = j2;
                        fj(tn);
                        r3.fib = (l8 + j1.tg[ai1[1]]) / 2;
                        tn++;
                    }
                }
            }

        }
        if(tn == 0)
            return;
        km = tn;
        wh(un, fm, tn - 1);
        nh(100, un, tn);
        for(int l5 = 0; l5 < tn; l5++) {
            r r1 = un[l5];
            i k1 = r1.dib;
            int k2 = r1.eib;
            if(k1 == eo) {
                int ai3[] = k1.ah[k2];
                int l7 = ai3[0];
                int i9 = k1.ug[l7];
                int i10 = k1.vg[l7];
                int i11 = k1.tg[l7];
                int l11 = (bo[k2] << hn) / i11;
                int j12 = (co[k2] << hn) / i11;
                int l12 = i10 - k1.vg[ai3[1]];
                int i13 = ((k1.ug[ai3[1]] - i9) * l12) / j12;
                i13 = k1.ug[ai3[1]] - i9;
                int k13 = i9 - l11 / 2;
                int i14 = (gn + i10) - j12;
                wo.ig(k13 + fn, i14, l11, j12, xn[k2], i13, (256 << hn) / i11);
                if(vm && ym < zm) {
                    k13 += (_flddo[k2] << hn) / i11;
                    if(xm >= i14 && xm <= i14 + j12 && wm >= k13 && wm <= k13 + l11 && !k1.ci && k1.yh[k2] == 0) {
                        an[ym] = k1;
                        bn[ym] = k2;
                        ym++;
                    }
                }
            } else {
                int j10 = 0;
                int i12 = 0;
                int k12 = k1.zg[k2];
                int ai4[] = k1.ah[k2];
                if(k1.fh[k2] != 0xbc614e)
                    if(r1.jib < 0)
                        i12 = k1.vj - k1.fh[k2];
                    else
                        i12 = k1.vj + k1.fh[k2];
                for(int j13 = 0; j13 < k12; j13++) {
                    int j4 = ai4[j13];
                    ep[j13] = k1.rg[j4];
                    fp[j13] = k1.sg[j4];
                    gp[j13] = k1.tg[j4];
                    if(k1.fh[k2] == 0xbc614e)
                        if(r1.jib < 0)
                            i12 = (k1.vj - k1.wg[j4]) + k1.xg[j4];
                        else
                            i12 = k1.vj + k1.wg[j4] + k1.xg[j4];
                    if(k1.tg[j4] >= lm) {
                        bp[j10] = k1.ug[j4];
                        cp[j10] = k1.vg[j4];
                        dp[j10] = i12;
                        if(k1.tg[j4] > pm)
                            dp[j10] += (k1.tg[j4] - pm) / om;
                        j10++;
                    } else {
                        int j11;
                        if(j13 == 0)
                            j11 = ai4[k12 - 1];
                        else
                            j11 = ai4[j13 - 1];
                        if(k1.tg[j11] >= lm) {
                            int j9 = k1.tg[j4] - k1.tg[j11];
                            int l6 = k1.rg[j4] - ((k1.rg[j4] - k1.rg[j11]) * (k1.tg[j4] - lm)) / j9;
                            int i8 = k1.sg[j4] - ((k1.sg[j4] - k1.sg[j11]) * (k1.tg[j4] - lm)) / j9;
                            bp[j10] = (l6 << hn) / lm;
                            cp[j10] = (i8 << hn) / lm;
                            dp[j10] = i12;
                            j10++;
                        }
                        if(j13 == k12 - 1)
                            j11 = ai4[0];
                        else
                            j11 = ai4[j13 + 1];
                        if(k1.tg[j11] >= lm) {
                            int k9 = k1.tg[j4] - k1.tg[j11];
                            int i7 = k1.rg[j4] - ((k1.rg[j4] - k1.rg[j11]) * (k1.tg[j4] - lm)) / k9;
                            int j8 = k1.sg[j4] - ((k1.sg[j4] - k1.sg[j11]) * (k1.tg[j4] - lm)) / k9;
                            bp[j10] = (i7 << hn) / lm;
                            cp[j10] = (j8 << hn) / lm;
                            dp[j10] = i12;
                            j10++;
                        }
                    }
                }

                for(int l13 = 0; l13 < k12; l13++) {
                    if(dp[l13] < 0)
                        dp[l13] = 0;
                    else
                    if(dp[l13] > 255)
                        dp[l13] = 255;
                    if(r1.kib >= 0)
                        if(mo[r1.kib] == 1)
                            dp[l13] <<= 9;
                        else
                            dp[l13] <<= 6;
                }

                lh(fm, fm, fm, fm, j10, bp, cp, dp, k1, k2);
                if(ap > zo)
                    vh(fm, fm, k12, ep, fp, gp, r1.kib, k1);
            }
        }

        vm = false;
    }

    private void lh(int i1, int j1, int k1, int l1, int i2, int ai1[], int ai2[], 
            int ai3[], i j2, int k2) {
        if(i2 == 3) {
            int l2 = ai2[0] + gn;
            int l3 = ai2[1] + gn;
            int l4 = ai2[2] + gn;
            int l5 = ai1[0];
            int i7 = ai1[1];
            int k8 = ai1[2];
            int i10 = ai3[0];
            int k11 = ai3[1];
            int k12 = ai3[2];
            int k13 = (gn + en) - 1;
            int i14 = 0;
            int k14 = 0;
            int i15 = 0;
            int k15 = 0;
            int i16 = 0xbc614e;
            int k16 = 0xff439eb2;
            if(l4 != l2) {
                k14 = (k8 - l5 << 8) / (l4 - l2);
                k15 = (k12 - i10 << 8) / (l4 - l2);
                if(l2 < l4) {
                    i14 = l5 << 8;
                    i15 = i10 << 8;
                    i16 = l2;
                    k16 = l4;
                } else {
                    i14 = k8 << 8;
                    i15 = k12 << 8;
                    i16 = l4;
                    k16 = l2;
                }
                if(i16 < 0) {
                    i14 -= k14 * i16;
                    i15 -= k15 * i16;
                    i16 = 0;
                }
                if(k16 > k13)
                    k16 = k13;
            }
            int i17 = 0;
            int k17 = 0;
            int i18 = 0;
            int k18 = 0;
            int i19 = 0xbc614e;
            int k19 = 0xff439eb2;
            if(l3 != l2) {
                k17 = (i7 - l5 << 8) / (l3 - l2);
                k18 = (k11 - i10 << 8) / (l3 - l2);
                if(l2 < l3) {
                    i17 = l5 << 8;
                    i18 = i10 << 8;
                    i19 = l2;
                    k19 = l3;
                } else {
                    i17 = i7 << 8;
                    i18 = k11 << 8;
                    i19 = l3;
                    k19 = l2;
                }
                if(i19 < 0) {
                    i17 -= k17 * i19;
                    i18 -= k18 * i19;
                    i19 = 0;
                }
                if(k19 > k13)
                    k19 = k13;
            }
            int i20 = 0;
            int k20 = 0;
            int i21 = 0;
            int k21 = 0;
            int i22 = 0xbc614e;
            int k22 = 0xff439eb2;
            if(l4 != l3) {
                k20 = (k8 - i7 << 8) / (l4 - l3);
                k21 = (k12 - k11 << 8) / (l4 - l3);
                if(l3 < l4) {
                    i20 = i7 << 8;
                    i21 = k11 << 8;
                    i22 = l3;
                    k22 = l4;
                } else {
                    i20 = k8 << 8;
                    i21 = k12 << 8;
                    i22 = l4;
                    k22 = l3;
                }
                if(i22 < 0) {
                    i20 -= k20 * i22;
                    i21 -= k21 * i22;
                    i22 = 0;
                }
                if(k22 > k13)
                    k22 = k13;
            }
            zo = i16;
            if(i19 < zo)
                zo = i19;
            if(i22 < zo)
                zo = i22;
            ap = k16;
            if(k19 > ap)
                ap = k19;
            if(k22 > ap)
                ap = k22;
            int i23 = 0;
            for(k1 = zo; k1 < ap; k1++) {
                if(k1 >= i16 && k1 < k16) {
                    i1 = j1 = i14;
                    l1 = i23 = i15;
                    i14 += k14;
                    i15 += k15;
                } else {
                    i1 = 0xa0000;
                    j1 = 0xfff60000;
                }
                if(k1 >= i19 && k1 < k19) {
                    if(i17 < i1) {
                        i1 = i17;
                        l1 = i18;
                    }
                    if(i17 > j1) {
                        j1 = i17;
                        i23 = i18;
                    }
                    i17 += k17;
                    i18 += k18;
                }
                if(k1 >= i22 && k1 < k22) {
                    if(i20 < i1) {
                        i1 = i20;
                        l1 = i21;
                    }
                    if(i20 > j1) {
                        j1 = i20;
                        i23 = i21;
                    }
                    i20 += k20;
                    i21 += k21;
                }
                u u7 = yo[k1];
                u7.tnb = i1;
                u7.unb = j1;
                u7.vnb = l1;
                u7.wnb = i23;
            }

            if(zo < gn - en)
                zo = gn - en;
        } else
        if(i2 == 4) {
            int i3 = ai2[0] + gn;
            int i4 = ai2[1] + gn;
            int i5 = ai2[2] + gn;
            int i6 = ai2[3] + gn;
            int j7 = ai1[0];
            int l8 = ai1[1];
            int j10 = ai1[2];
            int l11 = ai1[3];
            int l12 = ai3[0];
            int l13 = ai3[1];
            int j14 = ai3[2];
            int l14 = ai3[3];
            int j15 = (gn + en) - 1;
            int l15 = 0;
            int j16 = 0;
            int l16 = 0;
            int j17 = 0;
            int l17 = 0xbc614e;
            int j18 = 0xff439eb2;
            if(i6 != i3) {
                j16 = (l11 - j7 << 8) / (i6 - i3);
                j17 = (l14 - l12 << 8) / (i6 - i3);
                if(i3 < i6) {
                    l15 = j7 << 8;
                    l16 = l12 << 8;
                    l17 = i3;
                    j18 = i6;
                } else {
                    l15 = l11 << 8;
                    l16 = l14 << 8;
                    l17 = i6;
                    j18 = i3;
                }
                if(l17 < 0) {
                    l15 -= j16 * l17;
                    l16 -= j17 * l17;
                    l17 = 0;
                }
                if(j18 > j15)
                    j18 = j15;
            }
            int l18 = 0;
            int j19 = 0;
            int l19 = 0;
            int j20 = 0;
            int l20 = 0xbc614e;
            int j21 = 0xff439eb2;
            if(i4 != i3) {
                j19 = (l8 - j7 << 8) / (i4 - i3);
                j20 = (l13 - l12 << 8) / (i4 - i3);
                if(i3 < i4) {
                    l18 = j7 << 8;
                    l19 = l12 << 8;
                    l20 = i3;
                    j21 = i4;
                } else {
                    l18 = l8 << 8;
                    l19 = l13 << 8;
                    l20 = i4;
                    j21 = i3;
                }
                if(l20 < 0) {
                    l18 -= j19 * l20;
                    l19 -= j20 * l20;
                    l20 = 0;
                }
                if(j21 > j15)
                    j21 = j15;
            }
            int l21 = 0;
            int j22 = 0;
            int l22 = 0;
            int j23 = 0;
            int k23 = 0xbc614e;
            int l23 = 0xff439eb2;
            if(i5 != i4) {
                j22 = (j10 - l8 << 8) / (i5 - i4);
                j23 = (j14 - l13 << 8) / (i5 - i4);
                if(i4 < i5) {
                    l21 = l8 << 8;
                    l22 = l13 << 8;
                    k23 = i4;
                    l23 = i5;
                } else {
                    l21 = j10 << 8;
                    l22 = j14 << 8;
                    k23 = i5;
                    l23 = i4;
                }
                if(k23 < 0) {
                    l21 -= j22 * k23;
                    l22 -= j23 * k23;
                    k23 = 0;
                }
                if(l23 > j15)
                    l23 = j15;
            }
            int i24 = 0;
            int j24 = 0;
            int k24 = 0;
            int l24 = 0;
            int i25 = 0xbc614e;
            int j25 = 0xff439eb2;
            if(i6 != i5) {
                j24 = (l11 - j10 << 8) / (i6 - i5);
                l24 = (l14 - j14 << 8) / (i6 - i5);
                if(i5 < i6) {
                    i24 = j10 << 8;
                    k24 = j14 << 8;
                    i25 = i5;
                    j25 = i6;
                } else {
                    i24 = l11 << 8;
                    k24 = l14 << 8;
                    i25 = i6;
                    j25 = i5;
                }
                if(i25 < 0) {
                    i24 -= j24 * i25;
                    k24 -= l24 * i25;
                    i25 = 0;
                }
                if(j25 > j15)
                    j25 = j15;
            }
            zo = l17;
            if(l20 < zo)
                zo = l20;
            if(k23 < zo)
                zo = k23;
            if(i25 < zo)
                zo = i25;
            ap = j18;
            if(j21 > ap)
                ap = j21;
            if(l23 > ap)
                ap = l23;
            if(j25 > ap)
                ap = j25;
            int k25 = 0;
            for(k1 = zo; k1 < ap; k1++) {
                if(k1 >= l17 && k1 < j18) {
                    i1 = j1 = l15;
                    l1 = k25 = l16;
                    l15 += j16;
                    l16 += j17;
                } else {
                    i1 = 0xa0000;
                    j1 = 0xfff60000;
                }
                if(k1 >= l20 && k1 < j21) {
                    if(l18 < i1) {
                        i1 = l18;
                        l1 = l19;
                    }
                    if(l18 > j1) {
                        j1 = l18;
                        k25 = l19;
                    }
                    l18 += j19;
                    l19 += j20;
                }
                if(k1 >= k23 && k1 < l23) {
                    if(l21 < i1) {
                        i1 = l21;
                        l1 = l22;
                    }
                    if(l21 > j1) {
                        j1 = l21;
                        k25 = l22;
                    }
                    l21 += j22;
                    l22 += j23;
                }
                if(k1 >= i25 && k1 < j25) {
                    if(i24 < i1) {
                        i1 = i24;
                        l1 = k24;
                    }
                    if(i24 > j1) {
                        j1 = i24;
                        k25 = k24;
                    }
                    i24 += j24;
                    k24 += l24;
                }
                u u8 = yo[k1];
                u8.tnb = i1;
                u8.unb = j1;
                u8.vnb = l1;
                u8.wnb = k25;
            }

            if(zo < gn - en)
                zo = gn - en;
        } else {
            ap = zo = ai2[0] += gn;
            for(k1 = 1; k1 < i2; k1++) {
                int j3;
                if((j3 = ai2[k1] += gn) < zo)
                    zo = j3;
                else
                if(j3 > ap)
                    ap = j3;
            }

            if(zo < gn - en)
                zo = gn - en;
            if(ap >= gn + en)
                ap = (gn + en) - 1;
            if(zo >= ap)
                return;
            for(k1 = zo; k1 < ap; k1++) {
                u u1 = yo[k1];
                u1.tnb = 0xa0000;
                u1.unb = 0xfff60000;
            }

            int k3 = i2 - 1;
            int j4 = ai2[0];
            int j5 = ai2[k3];
            if(j4 < j5) {
                int j6 = ai1[0] << 8;
                int k7 = (ai1[k3] - ai1[0] << 8) / (j5 - j4);
                int i9 = ai3[0] << 8;
                int k10 = (ai3[k3] - ai3[0] << 8) / (j5 - j4);
                if(j4 < 0) {
                    j6 -= k7 * j4;
                    i9 -= k10 * j4;
                    j4 = 0;
                }
                if(j5 > ap)
                    j5 = ap;
                for(k1 = j4; k1 <= j5; k1++) {
                    u u3 = yo[k1];
                    u3.tnb = u3.unb = j6;
                    u3.vnb = u3.wnb = i9;
                    j6 += k7;
                    i9 += k10;
                }

            } else
            if(j4 > j5) {
                int k6 = ai1[k3] << 8;
                int l7 = (ai1[0] - ai1[k3] << 8) / (j4 - j5);
                int j9 = ai3[k3] << 8;
                int l10 = (ai3[0] - ai3[k3] << 8) / (j4 - j5);
                if(j5 < 0) {
                    k6 -= l7 * j5;
                    j9 -= l10 * j5;
                    j5 = 0;
                }
                if(j4 > ap)
                    j4 = ap;
                for(k1 = j5; k1 <= j4; k1++) {
                    u u4 = yo[k1];
                    u4.tnb = u4.unb = k6;
                    u4.vnb = u4.wnb = j9;
                    k6 += l7;
                    j9 += l10;
                }

            }
            for(k1 = 0; k1 < k3; k1++) {
                int l6 = k1 + 1;
                int k4 = ai2[k1];
                int k5 = ai2[l6];
                if(k4 < k5) {
                    int i8 = ai1[k1] << 8;
                    int k9 = (ai1[l6] - ai1[k1] << 8) / (k5 - k4);
                    int i11 = ai3[k1] << 8;
                    int i12 = (ai3[l6] - ai3[k1] << 8) / (k5 - k4);
                    if(k4 < 0) {
                        i8 -= k9 * k4;
                        i11 -= i12 * k4;
                        k4 = 0;
                    }
                    if(k5 > ap)
                        k5 = ap;
                    for(int i13 = k4; i13 <= k5; i13++) {
                        u u5 = yo[i13];
                        if(i8 < u5.tnb) {
                            u5.tnb = i8;
                            u5.vnb = i11;
                        }
                        if(i8 > u5.unb) {
                            u5.unb = i8;
                            u5.wnb = i11;
                        }
                        i8 += k9;
                        i11 += i12;
                    }

                } else
                if(k4 > k5) {
                    int j8 = ai1[l6] << 8;
                    int l9 = (ai1[k1] - ai1[l6] << 8) / (k4 - k5);
                    int j11 = ai3[l6] << 8;
                    int j12 = (ai3[k1] - ai3[l6] << 8) / (k4 - k5);
                    if(k5 < 0) {
                        j8 -= l9 * k5;
                        j11 -= j12 * k5;
                        k5 = 0;
                    }
                    if(k4 > ap)
                        k4 = ap;
                    for(int j13 = k5; j13 <= k4; j13++) {
                        u u6 = yo[j13];
                        if(j8 < u6.tnb) {
                            u6.tnb = j8;
                            u6.vnb = j11;
                        }
                        if(j8 > u6.unb) {
                            u6.unb = j8;
                            u6.wnb = j11;
                        }
                        j8 += l9;
                        j11 += j12;
                    }

                }
            }

            if(zo < gn - en)
                zo = gn - en;
        }
        if(vm && ym < zm && xm >= zo && xm < ap) {
            u u2 = yo[xm];
            if(wm >= u2.tnb >> 8 && wm <= u2.unb >> 8 && u2.tnb <= u2.unb && !j2.ci && j2.yh[k2] == 0) {
                an[ym] = j2;
                bn[ym] = k2;
                ym++;
            }
        }
    }

    private void vh(int i1, int j1, int k1, int ai1[], int ai2[], int ai3[], int l1, 
            i i2) {
        if(l1 >= 0) {
            if(l1 >= jo)
                l1 = 0;
            qi(l1);
            int j2 = ai1[0];
            int l2 = ai2[0];
            int k3 = ai3[0];
            int j4 = j2 - ai1[1];
            int l4 = l2 - ai2[1];
            int j5 = k3 - ai3[1];
            k1--;
            int j7 = ai1[k1] - j2;
            int k8 = ai2[k1] - l2;
            int l9 = ai3[k1] - k3;
            if(mo[l1] == 1) {
                int i11 = j7 * l2 - k8 * j2 << 12;
                int l11 = k8 * k3 - l9 * l2 << (5 - hn) + 7 + 4;
                int j12 = l9 * j2 - j7 * k3 << (5 - hn) + 7;
                int l12 = j4 * l2 - l4 * j2 << 12;
                int j13 = l4 * k3 - j5 * l2 << (5 - hn) + 7 + 4;
                int l13 = j5 * j2 - j4 * k3 << (5 - hn) + 7;
                int j14 = l4 * j7 - j4 * k8 << 5;
                int l14 = j5 * k8 - l4 * l9 << (5 - hn) + 4;
                int j15 = j4 * l9 - j5 * j7 >> hn - 5;
                int l15 = l11 >> 4;
                int j16 = j13 >> 4;
                int l16 = l14 >> 4;
                int j17 = zo - gn;
                int l17 = cn;
                int j18 = fn + zo * l17;
                byte byte1 = 1;
                i11 += j12 * j17;
                l12 += l13 * j17;
                j14 += j15 * j17;
                if(hp) {
                    if((zo & 1) == 1) {
                        zo++;
                        i11 += j12;
                        l12 += l13;
                        j14 += j15;
                        j18 += l17;
                    }
                    j12 <<= 1;
                    l13 <<= 1;
                    j15 <<= 1;
                    l17 <<= 1;
                    byte1 = 2;
                }
                if(i2.uh) {
                    for(i1 = zo; i1 < ap; i1 += byte1) {
                        u u4 = yo[i1];
                        j1 = u4.tnb >> 8;
                        int l18 = u4.unb >> 8;
                        int l21 = l18 - j1;
                        if(l21 <= 0) {
                            i11 += j12;
                            l12 += l13;
                            j14 += j15;
                            j18 += l17;
                        } else {
                            int j23 = u4.vnb;
                            int l24 = (u4.wnb - j23) / l21;
                            if(j1 < -dn) {
                                j23 += (-dn - j1) * l24;
                                j1 = -dn;
                                l21 = l18 - j1;
                            }
                            if(l18 > dn) {
                                int i19 = dn;
                                l21 = i19 - j1;
                            }
                            ui(xo, po[l1], fm, fm, i11 + l15 * j1, l12 + j16 * j1, j14 + l16 * j1, l11, j13, l14, l21, j18 + j1, j23, l24 << 2);
                            i11 += j12;
                            l12 += l13;
                            j14 += j15;
                            j18 += l17;
                        }
                    }

                    return;
                }
                if(!oo[l1]) {
                    for(i1 = zo; i1 < ap; i1 += byte1) {
                        u u5 = yo[i1];
                        j1 = u5.tnb >> 8;
                        int j19 = u5.unb >> 8;
                        int i22 = j19 - j1;
                        if(i22 <= 0) {
                            i11 += j12;
                            l12 += l13;
                            j14 += j15;
                            j18 += l17;
                        } else {
                            int k23 = u5.vnb;
                            int i25 = (u5.wnb - k23) / i22;
                            if(j1 < -dn) {
                                k23 += (-dn - j1) * i25;
                                j1 = -dn;
                                i22 = j19 - j1;
                            }
                            if(j19 > dn) {
                                int k19 = dn;
                                i22 = k19 - j1;
                            }
                            zh(xo, po[l1], fm, fm, i11 + l15 * j1, l12 + j16 * j1, j14 + l16 * j1, l11, j13, l14, i22, j18 + j1, k23, i25 << 2);
                            i11 += j12;
                            l12 += l13;
                            j14 += j15;
                            j18 += l17;
                        }
                    }

                    return;
                }
                for(i1 = zo; i1 < ap; i1 += byte1) {
                    u u6 = yo[i1];
                    j1 = u6.tnb >> 8;
                    int l19 = u6.unb >> 8;
                    int j22 = l19 - j1;
                    if(j22 <= 0) {
                        i11 += j12;
                        l12 += l13;
                        j14 += j15;
                        j18 += l17;
                    } else {
                        int l23 = u6.vnb;
                        int j25 = (u6.wnb - l23) / j22;
                        if(j1 < -dn) {
                            l23 += (-dn - j1) * j25;
                            j1 = -dn;
                            j22 = l19 - j1;
                        }
                        if(l19 > dn) {
                            int i20 = dn;
                            j22 = i20 - j1;
                        }
                        ni(xo, fm, fm, fm, po[l1], i11 + l15 * j1, l12 + j16 * j1, j14 + l16 * j1, l11, j13, l14, j22, j18 + j1, l23, j25);
                        i11 += j12;
                        l12 += l13;
                        j14 += j15;
                        j18 += l17;
                    }
                }

                return;
            }
            int j11 = j7 * l2 - k8 * j2 << 11;
            int i12 = k8 * k3 - l9 * l2 << (5 - hn) + 6 + 4;
            int k12 = l9 * j2 - j7 * k3 << (5 - hn) + 6;
            int i13 = j4 * l2 - l4 * j2 << 11;
            int k13 = l4 * k3 - j5 * l2 << (5 - hn) + 6 + 4;
            int i14 = j5 * j2 - j4 * k3 << (5 - hn) + 6;
            int k14 = l4 * j7 - j4 * k8 << 5;
            int i15 = j5 * k8 - l4 * l9 << (5 - hn) + 4;
            int k15 = j4 * l9 - j5 * j7 >> hn - 5;
            int i16 = i12 >> 4;
            int k16 = k13 >> 4;
            int i17 = i15 >> 4;
            int k17 = zo - gn;
            int i18 = cn;
            int k18 = fn + zo * i18;
            byte byte2 = 1;
            j11 += k12 * k17;
            i13 += i14 * k17;
            k14 += k15 * k17;
            if(hp) {
                if((zo & 1) == 1) {
                    zo++;
                    j11 += k12;
                    i13 += i14;
                    k14 += k15;
                    k18 += i18;
                }
                k12 <<= 1;
                i14 <<= 1;
                k15 <<= 1;
                i18 <<= 1;
                byte2 = 2;
            }
            if(i2.uh) {
                for(i1 = zo; i1 < ap; i1 += byte2) {
                    u u7 = yo[i1];
                    j1 = u7.tnb >> 8;
                    int j20 = u7.unb >> 8;
                    int k22 = j20 - j1;
                    if(k22 <= 0) {
                        j11 += k12;
                        i13 += i14;
                        k14 += k15;
                        k18 += i18;
                    } else {
                        int i24 = u7.vnb;
                        int k25 = (u7.wnb - i24) / k22;
                        if(j1 < -dn) {
                            i24 += (-dn - j1) * k25;
                            j1 = -dn;
                            k22 = j20 - j1;
                        }
                        if(j20 > dn) {
                            int k20 = dn;
                            k22 = k20 - j1;
                        }
                        ci(xo, po[l1], fm, fm, j11 + i16 * j1, i13 + k16 * j1, k14 + i17 * j1, i12, k13, i15, k22, k18 + j1, i24, k25);
                        j11 += k12;
                        i13 += i14;
                        k14 += k15;
                        k18 += i18;
                    }
                }

                return;
            }
            if(!oo[l1]) {
                for(i1 = zo; i1 < ap; i1 += byte2) {
                    u u8 = yo[i1];
                    j1 = u8.tnb >> 8;
                    int l20 = u8.unb >> 8;
                    int l22 = l20 - j1;
                    if(l22 <= 0) {
                        j11 += k12;
                        i13 += i14;
                        k14 += k15;
                        k18 += i18;
                    } else {
                        int j24 = u8.vnb;
                        int l25 = (u8.wnb - j24) / l22;
                        if(j1 < -dn) {
                            j24 += (-dn - j1) * l25;
                            j1 = -dn;
                            l22 = l20 - j1;
                        }
                        if(l20 > dn) {
                            int i21 = dn;
                            l22 = i21 - j1;
                        }
                        vi(xo, po[l1], fm, fm, j11 + i16 * j1, i13 + k16 * j1, k14 + i17 * j1, i12, k13, i15, l22, k18 + j1, j24, l25);
                        j11 += k12;
                        i13 += i14;
                        k14 += k15;
                        k18 += i18;
                    }
                }

                return;
            }
            for(i1 = zo; i1 < ap; i1 += byte2) {
                u u9 = yo[i1];
                j1 = u9.tnb >> 8;
                int j21 = u9.unb >> 8;
                int i23 = j21 - j1;
                if(i23 <= 0) {
                    j11 += k12;
                    i13 += i14;
                    k14 += k15;
                    k18 += i18;
                } else {
                    int k24 = u9.vnb;
                    int i26 = (u9.wnb - k24) / i23;
                    if(j1 < -dn) {
                        k24 += (-dn - j1) * i26;
                        j1 = -dn;
                        i23 = j21 - j1;
                    }
                    if(j21 > dn) {
                        int k21 = dn;
                        i23 = k21 - j1;
                    }
                    yh(xo, fm, fm, fm, po[l1], j11 + i16 * j1, i13 + k16 * j1, k14 + i17 * j1, i12, k13, i15, i23, k18 + j1, k24, i26);
                    j11 += k12;
                    i13 += i14;
                    k14 += k15;
                    k18 += i18;
                }
            }

            return;
        }
        for(int k2 = 0; k2 < gm; k2++) {
            if(hm[k2] == l1) {
                jm = im[k2];
                break;
            }
            if(k2 == gm - 1) {
                int i3 = (int)(Math.random() * (double)gm);
                hm[i3] = l1;
                l1 = -1 - l1;
                int l3 = (l1 >> 10 & 0x1f) * 8;
                int k4 = (l1 >> 5 & 0x1f) * 8;
                int i5 = (l1 & 0x1f) * 8;
                for(int k5 = 0; k5 < 256; k5++) {
                    int k7 = k5 * k5;
                    int l8 = (l3 * k7) / 0x10000;
                    int i10 = (k4 * k7) / 0x10000;
                    int k11 = (i5 * k7) / 0x10000;
                    im[i3][255 - k5] = (l8 << 16) + (i10 << 8) + k11;
                }

                jm = im[i3];
            }
        }

        int j3 = cn;
        int i4 = fn + zo * j3;
        byte byte0 = 1;
        if(hp) {
            if((zo & 1) == 1) {
                zo++;
                i4 += j3;
            }
            j3 <<= 1;
            byte0 = 2;
        }
        if(i2.vh) {
            for(i1 = zo; i1 < ap; i1 += byte0) {
                u u1 = yo[i1];
                j1 = u1.tnb >> 8;
                int l5 = u1.unb >> 8;
                int l7 = l5 - j1;
                if(l7 <= 0) {
                    i4 += j3;
                } else {
                    int i9 = u1.vnb;
                    int j10 = (u1.wnb - i9) / l7;
                    if(j1 < -dn) {
                        i9 += (-dn - j1) * j10;
                        j1 = -dn;
                        l7 = l5 - j1;
                    }
                    if(l5 > dn) {
                        int i6 = dn;
                        l7 = i6 - j1;
                    }
                    mi(xo, -l7, i4 + j1, fm, jm, i9, j10);
                    i4 += j3;
                }
            }

            return;
        }
        if(sm) {
            for(i1 = zo; i1 < ap; i1 += byte0) {
                u u2 = yo[i1];
                j1 = u2.tnb >> 8;
                int j6 = u2.unb >> 8;
                int i8 = j6 - j1;
                if(i8 <= 0) {
                    i4 += j3;
                } else {
                    int j9 = u2.vnb;
                    int k10 = (u2.wnb - j9) / i8;
                    if(j1 < -dn) {
                        j9 += (-dn - j1) * k10;
                        j1 = -dn;
                        i8 = j6 - j1;
                    }
                    if(j6 > dn) {
                        int k6 = dn;
                        i8 = k6 - j1;
                    }
                    ph(xo, -i8, i4 + j1, fm, jm, j9, k10);
                    i4 += j3;
                }
            }

            return;
        }
        for(i1 = zo; i1 < ap; i1 += byte0) {
            u u3 = yo[i1];
            j1 = u3.tnb >> 8;
            int l6 = u3.unb >> 8;
            int j8 = l6 - j1;
            if(j8 <= 0) {
                i4 += j3;
            } else {
                int k9 = u3.vnb;
                int l10 = (u3.wnb - k9) / j8;
                if(j1 < -dn) {
                    k9 += (-dn - j1) * l10;
                    j1 = -dn;
                    j8 = l6 - j1;
                }
                if(l6 > dn) {
                    int i7 = dn;
                    j8 = i7 - j1;
                }
                di(xo, -j8, i4 + j1, fm, jm, k9, l10);
                i4 += j3;
            }
        }

    }

    private static void zh(int ai1[], int ai2[], int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3) {
        if(i3 <= 0)
            return;
        int i4 = 0;
        int j4 = 0;
        int i5 = 0;
        if(i2 != 0) {
            i1 = k1 / i2 << 7;
            j1 = l1 / i2 << 7;
        }
        if(i1 < 0)
            i1 = 0;
        else
        if(i1 > 16256)
            i1 = 16256;
        k1 += j2;
        l1 += k2;
        i2 += l2;
        if(i2 != 0) {
            i4 = k1 / i2 << 7;
            j4 = l1 / i2 << 7;
        }
        if(i4 < 0)
            i4 = 0;
        else
        if(i4 > 16256)
            i4 = 16256;
        int k4 = i4 - i1 >> 4;
        int l4 = j4 - j1 >> 4;
        for(int j5 = i3 >> 4; j5 > 0; j5--) {
            i1 += k3 & 0x600000;
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            i1 = (i1 & 0x3fff) + (k3 & 0x600000);
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            i1 = (i1 & 0x3fff) + (k3 & 0x600000);
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            i1 = (i1 & 0x3fff) + (k3 & 0x600000);
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 = i4;
            j1 = j4;
            k1 += j2;
            l1 += k2;
            i2 += l2;
            if(i2 != 0) {
                i4 = k1 / i2 << 7;
                j4 = l1 / i2 << 7;
            }
            if(i4 < 0)
                i4 = 0;
            else
            if(i4 > 16256)
                i4 = 16256;
            k4 = i4 - i1 >> 4;
            l4 = j4 - j1 >> 4;
        }

        for(int k5 = 0; k5 < (i3 & 0xf); k5++) {
            if((k5 & 3) == 0) {
                i1 = (i1 & 0x3fff) + (k3 & 0x600000);
                i5 = k3 >> 23;
                k3 += l3;
            }
            ai1[j3++] = ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
            i1 += k4;
            j1 += l4;
        }

    }

    private static void ui(int ai1[], int ai2[], int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3) {
        if(i3 <= 0)
            return;
        int i4 = 0;
        int j4 = 0;
        int i5 = 0;
        if(i2 != 0) {
            i1 = k1 / i2 << 7;
            j1 = l1 / i2 << 7;
        }
        if(i1 < 0)
            i1 = 0;
        else
        if(i1 > 16256)
            i1 = 16256;
        k1 += j2;
        l1 += k2;
        i2 += l2;
        if(i2 != 0) {
            i4 = k1 / i2 << 7;
            j4 = l1 / i2 << 7;
        }
        if(i4 < 0)
            i4 = 0;
        else
        if(i4 > 16256)
            i4 = 16256;
        int k4 = i4 - i1 >> 4;
        int l4 = j4 - j1 >> 4;
        for(int j5 = i3 >> 4; j5 > 0; j5--) {
            i1 += k3 & 0x600000;
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            i1 = (i1 & 0x3fff) + (k3 & 0x600000);
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            i1 = (i1 & 0x3fff) + (k3 & 0x600000);
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            i1 = (i1 & 0x3fff) + (k3 & 0x600000);
            i5 = k3 >> 23;
            k3 += l3;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 = i4;
            j1 = j4;
            k1 += j2;
            l1 += k2;
            i2 += l2;
            if(i2 != 0) {
                i4 = k1 / i2 << 7;
                j4 = l1 / i2 << 7;
            }
            if(i4 < 0)
                i4 = 0;
            else
            if(i4 > 16256)
                i4 = 16256;
            k4 = i4 - i1 >> 4;
            l4 = j4 - j1 >> 4;
        }

        for(int k5 = 0; k5 < (i3 & 0xf); k5++) {
            if((k5 & 3) == 0) {
                i1 = (i1 & 0x3fff) + (k3 & 0x600000);
                i5 = k3 >> 23;
                k3 += l3;
            }
            ai1[j3++] = (ai2[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai1[j3] >> 1 & 0x7f7f7f);
            i1 += k4;
            j1 += l4;
        }

    }

    private static void ni(int ai1[], int i1, int j1, int k1, int ai2[], int l1, int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3, int i4) {
        if(j3 <= 0)
            return;
        int j4 = 0;
        int k4 = 0;
        i4 <<= 2;
        if(j2 != 0) {
            j4 = l1 / j2 << 7;
            k4 = i2 / j2 << 7;
        }
        if(j4 < 0)
            j4 = 0;
        else
        if(j4 > 16256)
            j4 = 16256;
        for(int j5 = j3; j5 > 0; j5 -= 16) {
            l1 += k2;
            i2 += l2;
            j2 += i3;
            j1 = j4;
            k1 = k4;
            if(j2 != 0) {
                j4 = l1 / j2 << 7;
                k4 = i2 / j2 << 7;
            }
            if(j4 < 0)
                j4 = 0;
            else
            if(j4 > 16256)
                j4 = 16256;
            int l4 = j4 - j1 >> 4;
            int i5 = k4 - k1 >> 4;
            int k5 = l3 >> 23;
            j1 += l3 & 0x600000;
            l3 += i4;
            if(j5 < 16) {
                for(int l5 = 0; l5 < j5; l5++) {
                    if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                        ai1[k3] = i1;
                    k3++;
                    j1 += l4;
                    k1 += i5;
                    if((l5 & 3) == 3) {
                        j1 = (j1 & 0x3fff) + (l3 & 0x600000);
                        k5 = l3 >> 23;
                        l3 += i4;
                    }
                }

            } else {
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                j1 = (j1 & 0x3fff) + (l3 & 0x600000);
                k5 = l3 >> 23;
                l3 += i4;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                j1 = (j1 & 0x3fff) + (l3 & 0x600000);
                k5 = l3 >> 23;
                l3 += i4;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                j1 = (j1 & 0x3fff) + (l3 & 0x600000);
                k5 = l3 >> 23;
                l3 += i4;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
            }
        }

    }

    private static void vi(int ai1[], int ai2[], int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3) {
        if(i3 <= 0)
            return;
        int i4 = 0;
        int j4 = 0;
        l3 <<= 2;
        if(i2 != 0) {
            i4 = k1 / i2 << 6;
            j4 = l1 / i2 << 6;
        }
        if(i4 < 0)
            i4 = 0;
        else
        if(i4 > 4032)
            i4 = 4032;
        for(int i5 = i3; i5 > 0; i5 -= 16) {
            k1 += j2;
            l1 += k2;
            i2 += l2;
            i1 = i4;
            j1 = j4;
            if(i2 != 0) {
                i4 = k1 / i2 << 6;
                j4 = l1 / i2 << 6;
            }
            if(i4 < 0)
                i4 = 0;
            else
            if(i4 > 4032)
                i4 = 4032;
            int k4 = i4 - i1 >> 4;
            int l4 = j4 - j1 >> 4;
            int j5 = k3 >> 20;
            i1 += k3 & 0xc0000;
            k3 += l3;
            if(i5 < 16) {
                for(int k5 = 0; k5 < i5; k5++) {
                    ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                    i1 += k4;
                    j1 += l4;
                    if((k5 & 3) == 3) {
                        i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                        j5 = k3 >> 20;
                        k3 += l3;
                    }
                }

            } else {
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                j5 = k3 >> 20;
                k3 += l3;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                j5 = k3 >> 20;
                k3 += l3;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                j5 = k3 >> 20;
                k3 += l3;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
                i1 += k4;
                j1 += l4;
                ai1[j3++] = ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
            }
        }

    }

    private static void ci(int ai1[], int ai2[], int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3) {
        if(i3 <= 0)
            return;
        int i4 = 0;
        int j4 = 0;
        l3 <<= 2;
        if(i2 != 0) {
            i4 = k1 / i2 << 6;
            j4 = l1 / i2 << 6;
        }
        if(i4 < 0)
            i4 = 0;
        else
        if(i4 > 4032)
            i4 = 4032;
        for(int i5 = i3; i5 > 0; i5 -= 16) {
            k1 += j2;
            l1 += k2;
            i2 += l2;
            i1 = i4;
            j1 = j4;
            if(i2 != 0) {
                i4 = k1 / i2 << 6;
                j4 = l1 / i2 << 6;
            }
            if(i4 < 0)
                i4 = 0;
            else
            if(i4 > 4032)
                i4 = 4032;
            int k4 = i4 - i1 >> 4;
            int l4 = j4 - j1 >> 4;
            int j5 = k3 >> 20;
            i1 += k3 & 0xc0000;
            k3 += l3;
            if(i5 < 16) {
                for(int k5 = 0; k5 < i5; k5++) {
                    ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                    i1 += k4;
                    j1 += l4;
                    if((k5 & 3) == 3) {
                        i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                        j5 = k3 >> 20;
                        k3 += l3;
                    }
                }

            } else {
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                j5 = k3 >> 20;
                k3 += l3;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                j5 = k3 >> 20;
                k3 += l3;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                i1 = (i1 & 0xfff) + (k3 & 0xc0000);
                j5 = k3 >> 20;
                k3 += l3;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
                i1 += k4;
                j1 += l4;
                ai1[j3++] = (ai2[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai1[j3] >> 1 & 0x7f7f7f);
            }
        }

    }

    private static void yh(int ai1[], int i1, int j1, int k1, int ai2[], int l1, int i2, int j2, 
            int k2, int l2, int i3, int j3, int k3, int l3, int i4) {
        if(j3 <= 0)
            return;
        int j4 = 0;
        int k4 = 0;
        i4 <<= 2;
        if(j2 != 0) {
            j4 = l1 / j2 << 6;
            k4 = i2 / j2 << 6;
        }
        if(j4 < 0)
            j4 = 0;
        else
        if(j4 > 4032)
            j4 = 4032;
        for(int j5 = j3; j5 > 0; j5 -= 16) {
            l1 += k2;
            i2 += l2;
            j2 += i3;
            j1 = j4;
            k1 = k4;
            if(j2 != 0) {
                j4 = l1 / j2 << 6;
                k4 = i2 / j2 << 6;
            }
            if(j4 < 0)
                j4 = 0;
            else
            if(j4 > 4032)
                j4 = 4032;
            int l4 = j4 - j1 >> 4;
            int i5 = k4 - k1 >> 4;
            int k5 = l3 >> 20;
            j1 += l3 & 0xc0000;
            l3 += i4;
            if(j5 < 16) {
                for(int l5 = 0; l5 < j5; l5++) {
                    if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                        ai1[k3] = i1;
                    k3++;
                    j1 += l4;
                    k1 += i5;
                    if((l5 & 3) == 3) {
                        j1 = (j1 & 0xfff) + (l3 & 0xc0000);
                        k5 = l3 >> 20;
                        l3 += i4;
                    }
                }

            } else {
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                j1 = (j1 & 0xfff) + (l3 & 0xc0000);
                k5 = l3 >> 20;
                l3 += i4;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                j1 = (j1 & 0xfff) + (l3 & 0xc0000);
                k5 = l3 >> 20;
                l3 += i4;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                j1 = (j1 & 0xfff) + (l3 & 0xc0000);
                k5 = l3 >> 20;
                l3 += i4;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
                j1 += l4;
                k1 += i5;
                if((i1 = ai2[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
                    ai1[k3] = i1;
                k3++;
            }
        }

    }

    private static void ph(int ai1[], int i1, int j1, int k1, int ai2[], int l1, int i2) {
        if(i1 >= 0)
            return;
        i2 <<= 1;
        k1 = ai2[l1 >> 8 & 0xff];
        l1 += i2;
        int j2 = i1 / 8;
        for(int k2 = j2; k2 < 0; k2++) {
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
        }

        j2 = -(i1 % 8);
        for(int l2 = 0; l2 < j2; l2++) {
            ai1[j1++] = k1;
            if((l2 & 1) == 1) {
                k1 = ai2[l1 >> 8 & 0xff];
                l1 += i2;
            }
        }

    }

    private static void mi(int ai1[], int i1, int j1, int k1, int ai2[], int l1, int i2) {
        if(i1 >= 0)
            return;
        i2 <<= 2;
        k1 = ai2[l1 >> 8 & 0xff];
        l1 += i2;
        int j2 = i1 / 16;
        for(int k2 = j2; k2 < 0; k2++) {
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
        }

        j2 = -(i1 % 16);
        for(int l2 = 0; l2 < j2; l2++) {
            ai1[j1++] = k1 + (ai1[j1] >> 1 & 0x7f7f7f);
            if((l2 & 3) == 3) {
                k1 = ai2[l1 >> 8 & 0xff];
                l1 += i2;
                l1 += i2;
            }
        }

    }

    private static void di(int ai1[], int i1, int j1, int k1, int ai2[], int l1, int i2) {
        if(i1 >= 0)
            return;
        i2 <<= 2;
        k1 = ai2[l1 >> 8 & 0xff];
        l1 += i2;
        int j2 = i1 / 16;
        for(int k2 = j2; k2 < 0; k2++) {
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            ai1[j1++] = k1;
            k1 = ai2[l1 >> 8 & 0xff];
            l1 += i2;
        }

        j2 = -(i1 % 16);
        for(int l2 = 0; l2 < j2; l2++) {
            ai1[j1++] = k1;
            if((l2 & 3) == 3) {
                k1 = ai2[l1 >> 8 & 0xff];
                l1 += i2;
            }
        }

    }

    public void fi(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
        l1 &= 0x3ff;
        i2 &= 0x3ff;
        j2 &= 0x3ff;
        mn = 1024 - l1 & 0x3ff;
        nn = 1024 - i2 & 0x3ff;
        on = 1024 - j2 & 0x3ff;
        int l2 = 0;
        int i3 = 0;
        int j3 = k2;
        if(l1 != 0) {
            int k3 = qm[l1];
            int j4 = qm[l1 + 1024];
            int i5 = i3 * j4 - j3 * k3 >> 15;
            j3 = i3 * k3 + j3 * j4 >> 15;
            i3 = i5;
        }
        if(i2 != 0) {
            int l3 = qm[i2];
            int k4 = qm[i2 + 1024];
            int j5 = j3 * l3 + l2 * k4 >> 15;
            j3 = j3 * k4 - l2 * l3 >> 15;
            l2 = j5;
        }
        if(j2 != 0) {
            int i4 = qm[j2];
            int l4 = qm[j2 + 1024];
            int k5 = i3 * i4 + l2 * l4 >> 15;
            i3 = i3 * l4 - l2 * i4 >> 15;
            l2 = k5;
        }
        jn = i1 - l2;
        kn = j1 - i3;
        ln = k1 - j3;
    }

    private void cj(int i1) {
        r r1 = un[i1];
        i j1 = r1.dib;
        int k1 = r1.eib;
        int ai1[] = j1.ah[k1];
        int l1 = j1.zg[k1];
        int i2 = j1.eh[k1];
        int k2 = j1.rg[ai1[0]];
        int l2 = j1.sg[ai1[0]];
        int i3 = j1.tg[ai1[0]];
        int j3 = j1.rg[ai1[1]] - k2;
        int k3 = j1.sg[ai1[1]] - l2;
        int l3 = j1.tg[ai1[1]] - i3;
        int i4 = j1.rg[ai1[2]] - k2;
        int j4 = j1.sg[ai1[2]] - l2;
        int k4 = j1.tg[ai1[2]] - i3;
        int l4 = k3 * k4 - j4 * l3;
        int i5 = l3 * i4 - k4 * j3;
        int j5 = j3 * j4 - i4 * k3;
        if(i2 == -1) {
            i2 = 0;
            for(; l4 > 25000 || i5 > 25000 || j5 > 25000 || l4 < -25000 || i5 < -25000 || j5 < -25000; j5 >>= 1) {
                i2++;
                l4 >>= 1;
                i5 >>= 1;
            }

            j1.eh[k1] = i2;
            j1.dh[k1] = (int)((double)in * Math.sqrt(l4 * l4 + i5 * i5 + j5 * j5));
        } else {
            l4 >>= i2;
            i5 >>= i2;
            j5 >>= i2;
        }
        r1.jib = k2 * l4 + l2 * i5 + i3 * j5;
        r1.gib = l4;
        r1.hib = i5;
        r1.iib = j5;
        int k5 = j1.tg[ai1[0]];
        int l5 = k5;
        int i6 = j1.ug[ai1[0]];
        int j6 = i6;
        int k6 = j1.vg[ai1[0]];
        int l6 = k6;
        for(int i7 = 1; i7 < l1; i7++) {
            int j2 = j1.tg[ai1[i7]];
            if(j2 > l5)
                l5 = j2;
            else
            if(j2 < k5)
                k5 = j2;
            j2 = j1.ug[ai1[i7]];
            if(j2 > j6)
                j6 = j2;
            else
            if(j2 < i6)
                i6 = j2;
            j2 = j1.vg[ai1[i7]];
            if(j2 > l6)
                l6 = j2;
            else
            if(j2 < k6)
                k6 = j2;
        }

        r1.bib = k5;
        r1.cib = l5;
        r1.xhb = i6;
        r1.zhb = j6;
        r1.yhb = k6;
        r1.aib = l6;
    }

    private void fj(int i1) {
        r r1 = un[i1];
        i j1 = r1.dib;
        int k1 = r1.eib;
        int ai1[] = j1.ah[k1];
        int i2 = 0;
        int j2 = 0;
        int k2 = 1;
        int l2 = j1.rg[ai1[0]];
        int i3 = j1.sg[ai1[0]];
        int j3 = j1.tg[ai1[0]];
        j1.dh[k1] = 1;
        j1.eh[k1] = 0;
        r1.jib = l2 * i2 + i3 * j2 + j3 * k2;
        r1.gib = i2;
        r1.hib = j2;
        r1.iib = k2;
        int k3 = j1.tg[ai1[0]];
        int l3 = k3;
        int i4 = j1.ug[ai1[0]];
        int j4 = i4;
        if(j1.ug[ai1[1]] < i4)
            i4 = j1.ug[ai1[1]];
        else
            j4 = j1.ug[ai1[1]];
        int k4 = j1.vg[ai1[1]];
        int l4 = j1.vg[ai1[0]];
        int l1 = j1.tg[ai1[1]];
        if(l1 > l3)
            l3 = l1;
        else
        if(l1 < k3)
            k3 = l1;
        l1 = j1.ug[ai1[1]];
        if(l1 > j4)
            j4 = l1;
        else
        if(l1 < i4)
            i4 = l1;
        l1 = j1.vg[ai1[1]];
        if(l1 > l4)
            l4 = l1;
        else
        if(l1 < k4)
            k4 = l1;
        r1.bib = k3;
        r1.cib = l3;
        r1.xhb = i4 - 20;
        r1.zhb = j4 + 20;
        r1.yhb = k4;
        r1.aib = l4;
    }

    private boolean oh(r r1, r r2) {
        if(r1.xhb >= r2.zhb)
            return true;
        if(r2.xhb >= r1.zhb)
            return true;
        if(r1.yhb >= r2.aib)
            return true;
        if(r2.yhb >= r1.aib)
            return true;
        if(r1.bib >= r2.cib)
            return true;
        if(r2.bib > r1.cib)
            return false;
        i i1 = r1.dib;
        i j1 = r2.dib;
        int k1 = r1.eib;
        int l1 = r2.eib;
        int ai1[] = i1.ah[k1];
        int ai2[] = j1.ah[l1];
        int i2 = i1.zg[k1];
        int j2 = j1.zg[l1];
        int i4 = j1.rg[ai2[0]];
        int j4 = j1.sg[ai2[0]];
        int k4 = j1.tg[ai2[0]];
        int l4 = r2.gib;
        int i5 = r2.hib;
        int j5 = r2.iib;
        int k5 = j1.dh[l1];
        int l5 = r2.jib;
        boolean flag = false;
        for(int i6 = 0; i6 < i2; i6++) {
            int k2 = ai1[i6];
            int k3 = (i4 - i1.rg[k2]) * l4 + (j4 - i1.sg[k2]) * i5 + (k4 - i1.tg[k2]) * j5;
            if((k3 >= -k5 || l5 >= 0) && (k3 <= k5 || l5 <= 0))
                continue;
            flag = true;
            break;
        }

        if(!flag)
            return true;
        i4 = i1.rg[ai1[0]];
        j4 = i1.sg[ai1[0]];
        k4 = i1.tg[ai1[0]];
        l4 = r1.gib;
        i5 = r1.hib;
        j5 = r1.iib;
        k5 = i1.dh[k1];
        l5 = r1.jib;
        flag = false;
        for(int j6 = 0; j6 < j2; j6++) {
            int l2 = ai2[j6];
            int l3 = (i4 - j1.rg[l2]) * l4 + (j4 - j1.sg[l2]) * i5 + (k4 - j1.tg[l2]) * j5;
            if((l3 >= -k5 || l5 <= 0) && (l3 <= k5 || l5 >= 0))
                continue;
            flag = true;
            break;
        }

        if(!flag)
            return true;
        int ai3[];
        int ai4[];
        if(i2 == 2) {
            ai3 = new int[4];
            ai4 = new int[4];
            int k6 = ai1[0];
            int i3 = ai1[1];
            ai3[0] = i1.ug[k6] - 20;
            ai3[1] = i1.ug[i3] - 20;
            ai3[2] = i1.ug[i3] + 20;
            ai3[3] = i1.ug[k6] + 20;
            ai4[0] = ai4[3] = i1.vg[k6];
            ai4[1] = ai4[2] = i1.vg[i3];
        } else {
            ai3 = new int[i2];
            ai4 = new int[i2];
            for(int l6 = 0; l6 < i2; l6++) {
                int k7 = ai1[l6];
                ai3[l6] = i1.ug[k7];
                ai4[l6] = i1.vg[k7];
            }

        }
        int ai5[];
        int ai6[];
        if(j2 == 2) {
            ai5 = new int[4];
            ai6 = new int[4];
            int i7 = ai2[0];
            int j3 = ai2[1];
            ai5[0] = j1.ug[i7] - 20;
            ai5[1] = j1.ug[j3] - 20;
            ai5[2] = j1.ug[j3] + 20;
            ai5[3] = j1.ug[i7] + 20;
            ai6[0] = ai6[3] = j1.vg[i7];
            ai6[1] = ai6[2] = j1.vg[j3];
        } else {
            ai5 = new int[j2];
            ai6 = new int[j2];
            for(int j7 = 0; j7 < j2; j7++) {
                int l7 = ai2[j7];
                ai5[j7] = j1.ug[l7];
                ai6[j7] = j1.vg[l7];
            }

        }
        return !qh(ai3, ai4, ai5, ai6);
    }

    private boolean mh(r r1, r r2) {
        i i1 = r1.dib;
        i j1 = r2.dib;
        int k1 = r1.eib;
        int l1 = r2.eib;
        int ai1[] = i1.ah[k1];
        int ai2[] = j1.ah[l1];
        int i2 = i1.zg[k1];
        int j2 = j1.zg[l1];
        int k3 = j1.rg[ai2[0]];
        int l3 = j1.sg[ai2[0]];
        int i4 = j1.tg[ai2[0]];
        int j4 = r2.gib;
        int k4 = r2.hib;
        int l4 = r2.iib;
        int i5 = j1.dh[l1];
        int j5 = r2.jib;
        boolean flag = false;
        for(int k5 = 0; k5 < i2; k5++) {
            int k2 = ai1[k5];
            int i3 = (k3 - i1.rg[k2]) * j4 + (l3 - i1.sg[k2]) * k4 + (i4 - i1.tg[k2]) * l4;
            if((i3 >= -i5 || j5 >= 0) && (i3 <= i5 || j5 <= 0))
                continue;
            flag = true;
            break;
        }

        if(!flag)
            return true;
        k3 = i1.rg[ai1[0]];
        l3 = i1.sg[ai1[0]];
        i4 = i1.tg[ai1[0]];
        j4 = r1.gib;
        k4 = r1.hib;
        l4 = r1.iib;
        i5 = i1.dh[k1];
        j5 = r1.jib;
        flag = false;
        for(int l5 = 0; l5 < j2; l5++) {
            int l2 = ai2[l5];
            int j3 = (k3 - j1.rg[l2]) * j4 + (l3 - j1.sg[l2]) * k4 + (i4 - j1.tg[l2]) * l4;
            if((j3 >= -i5 || j5 <= 0) && (j3 <= i5 || j5 >= 0))
                continue;
            flag = true;
            break;
        }

        return !flag;
    }

    public void kh(String s1, int i1, int j1, int k1, l l1) {
        try {
            ro = l1.ij(s1, "textures", k1);
            byte abyte0[] = p.ln("textures.txt", 0, ro);
            s s2 = new s(abyte0);
            s2.fb();
            jo = s2.ob();
            ko = new String[jo];
            oo = new boolean[jo];
            no = new long[jo];
            lo = new int[jo];
            mo = new int[jo];
            po = new int[jo][];
            for(int i2 = 0; i2 < jo; i2++) {
                s2.fb();
                ko[i2] = s2.wb();
                lo[i2] = s2.hb();
                mo[i2] = s2.ob();
                oo[i2] = false;
                po[i2] = null;
                no[i2] = 0L;
            }

            qo = 0L;
            so = new int[i1][];
            to = new int[j1][];
            for(int j2 = 0; j2 < jo; j2++)
                qi(j2);

            return;
        }
        catch(IOException _ex) {
            System.out.println("Error loading texture set");
        }
    }

    public void li(int i1) {
        if(po[i1] == null)
            return;
        int ai1[] = po[i1];
        for(int j1 = 0; j1 < 64; j1++) {
            int k1 = j1 + 4032;
            int l1 = ai1[k1];
            for(int j2 = 0; j2 < 63; j2++) {
                ai1[k1] = ai1[k1 - 64];
                k1 -= 64;
            }

            po[i1][k1] = l1;
        }

        char c = '\u1000';
        for(int i2 = 0; i2 < c; i2++) {
            int k2 = ai1[i2];
            ai1[c + i2] = k2 - (k2 >>> 3) & 0xf8f8ff;
            ai1[c * 2 + i2] = k2 - (k2 >>> 2) & 0xf8f8ff;
            ai1[c * 3 + i2] = k2 - (k2 >>> 2) - (k2 >>> 3) & 0xf8f8ff;
        }

    }

    public void qi(int i1) {
        if(i1 < 0)
            return;
        no[i1] = qo++;
        if(po[i1] != null)
            return;
        if(mo[i1] == 0) {
            for(int j1 = 0; j1 < so.length; j1++)
                if(so[j1] == null) {
                    so[j1] = new int[16384];
                    po[i1] = so[j1];
                    p.eo(ko[i1] + ".tga", 0, ro, uo);
                    oi(i1);
                    return;
                }

            long l1 = 1L << 30;
            int i2 = 0;
            for(int k2 = 0; k2 < jo; k2++)
                if(k2 != i1 && mo[k2] == 0 && po[k2] != null && no[k2] < l1) {
                    l1 = no[k2];
                    i2 = k2;
                }

            po[i1] = po[i2];
            po[i2] = null;
            p.eo(ko[i1] + ".tga", 0, ro, uo);
            oi(i1);
            return;
        }
        for(int k1 = 0; k1 < to.length; k1++)
            if(to[k1] == null) {
                to[k1] = new int[0x10000];
                po[i1] = to[k1];
                p.eo(ko[i1] + ".tga", 0, ro, uo);
                oi(i1);
                return;
            }

        long l2 = 1L << 30;
        int j2 = 0;
        for(int i3 = 0; i3 < jo; i3++)
            if(i3 != i1 && mo[i3] == 1 && po[i3] != null && no[i3] < l2) {
                l2 = no[i3];
                j2 = i3;
            }

        po[i1] = po[j2];
        po[j2] = null;
        p.eo(ko[i1] + ".tga", 0, ro, uo);
        oi(i1);
    }

    public void ri(String s1) {
        try {
            a a1 = new a(s1 + "/textures.txt");
            a1.fb();
            jo = a1.ob();
            ko = new String[jo];
            oo = new boolean[jo];
            no = new long[jo];
            lo = new int[jo];
            mo = new int[jo];
            po = new int[jo][];
            for(int i1 = 0; i1 < jo; i1++) {
                a1.fb();
                ko[i1] = a1.wb();
                lo[i1] = a1.hb();
                mo[i1] = a1.ob();
                oo[i1] = false;
            }

            a1.yb();
            for(int j1 = 0; j1 < jo; j1++) {
                char c;
                if(mo[j1] == 0)
                    c = '\u151B';
                else
                    c = '\u451B';
                char c1;
                if(mo[j1] == 0)
                    c1 = '@';
                else
                    c1 = '\200';
                po[j1] = new int[c1 * c1 * 4];
                p.in(s1 + "/" + ko[j1] + ".tga", uo, c);
                oi(j1);
            }

            return;
        }
        catch(IOException _ex) {
            System.out.println("Error loading texture set");
        }
    }

    private void oi(int i1) {
        char c;
        if(mo[i1] == 0)
            c = '@';
        else
            c = '\200';
        int ai1[] = po[i1];
        int j1 = 0;
        for(int k1 = 0; k1 < 256; k1++)
            vo[k1] = ((uo[20 + k1 * 3] & 0xff) << 16) + ((uo[19 + k1 * 3] & 0xff) << 8) + (uo[18 + k1 * 3] & 0xff);

        for(int l1 = c - 1; l1 >= 0; l1--) {
            for(int i2 = 0; i2 < c; i2++) {
                int k2 = vo[uo[786 + i2 + l1 * c] & 0xff];
                if(k2 != 0xff00ff && lo[i1] != 0) {
                    int i3 = k2 >> 16 & 0xff;
                    int j3 = k2 >> 8 & 0xff;
                    int k3 = k2 & 0xff;
                    if(i3 == j3 && j3 == k3) {
                        int l3 = lo[i1] >> 16 & 0xff;
                        int i4 = lo[i1] >> 8 & 0xff;
                        int j4 = lo[i1] & 0xff;
                        k2 = ((i3 * l3 >> 8) << 16) + ((j3 * i4 >> 8) << 8) + (k3 * j4 >> 8);
                    }
                }
                k2 &= 0xf8f8ff;
                if(k2 == 0)
                    k2 = 1;
                else
                if(k2 == 0xf800ff) {
                    k2 = 0;
                    oo[i1] = true;
                }
                ai1[j1++] = k2;
            }

        }

        for(int j2 = 0; j2 < j1; j2++) {
            int l2 = ai1[j2];
            ai1[j1 + j2] = l2 - (l2 >>> 3) & 0xf8f8ff;
            ai1[j1 * 2 + j2] = l2 - (l2 >>> 2) & 0xf8f8ff;
            ai1[j1 * 3 + j2] = l2 - (l2 >>> 2) - (l2 >>> 3) & 0xf8f8ff;
        }

    }

    public int zi(int i1) {
        if(i1 == 0xbc614e)
            return 0;
        qi(i1);
        if(i1 >= 0)
            return po[i1][0];
        if(i1 < 0) {
            i1 = -(i1 + 1);
            int j1 = i1 >> 10 & 0x1f;
            int k1 = i1 >> 5 & 0x1f;
            int l1 = i1 & 0x1f;
            return (j1 << 19) + (k1 << 11) + (l1 << 3);
        } else {
            return 0;
        }
    }

    public void ii(int i1, int j1, int k1) {
        if(i1 == 0 && j1 == 0 && k1 == 0)
            i1 = 32;
        for(int l1 = 0; l1 < pn; l1++)
            rn[l1].ef(i1, j1, k1);

    }

    public void ej(int i1, int j1, int k1, int l1, int i2) {
        if(k1 == 0 && l1 == 0 && i2 == 0)
            k1 = 32;
        for(int j2 = 0; j2 < pn; j2++)
            rn[j2].he(i1, j1, k1, l1, i2);

    }

    public static int ki(int i1, int j1, int k1) {
        return -1 - (i1 / 8) * 1024 - (j1 / 8) * 32 - k1 / 8;
    }

    public int th(int i1, int j1, int k1, int l1, int i2) {
        if(l1 == j1)
            return i1;
        else
            return i1 + ((k1 - i1) * (i2 - j1)) / (l1 - j1);
    }

    public boolean hi(int i1, int j1, int k1, int l1, boolean flag) {
        if(flag && i1 <= k1 || i1 < k1) {
            if(i1 > l1)
                return true;
            if(j1 > k1)
                return true;
            if(j1 > l1)
                return true;
            return !flag;
        }
        if(i1 < l1)
            return true;
        if(j1 < k1)
            return true;
        if(j1 < l1)
            return true;
        else
            return flag;
    }

    public boolean xh(int i1, int j1, int k1, boolean flag) {
        if(flag && i1 <= k1 || i1 < k1) {
            if(j1 > k1)
                return true;
            return !flag;
        }
        if(j1 < k1)
            return true;
        else
            return flag;
    }

    public boolean qh(int ai1[], int ai2[], int ai3[], int ai4[]) {
        int i1 = ai1.length;
        int j1 = ai3.length;
        byte byte0 = 0;
        int i21;
        int k21 = i21 = ai2[0];
        int k1 = 0;
        int j21;
        int l21 = j21 = ai4[0];
        int i2 = 0;
        for(int i22 = 1; i22 < i1; i22++)
            if(ai2[i22] < i21) {
                i21 = ai2[i22];
                k1 = i22;
            } else
            if(ai2[i22] > k21)
                k21 = ai2[i22];

        for(int j22 = 1; j22 < j1; j22++)
            if(ai4[j22] < j21) {
                j21 = ai4[j22];
                i2 = j22;
            } else
            if(ai4[j22] > l21)
                l21 = ai4[j22];

        if(j21 >= k21)
            return false;
        if(i21 >= l21)
            return false;
        int l1;
        int j2;
        boolean flag;
        if(ai2[k1] < ai4[i2]) {
            for(l1 = k1; ai2[l1] < ai4[i2]; l1 = (l1 + 1) % i1);
            for(; ai2[k1] < ai4[i2]; k1 = ((k1 - 1) + i1) % i1);
            int k2 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[i2]);
            int k7 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[i2]);
            int l11 = ai3[i2];
            flag = (k2 < l11) | (k7 < l11);
            if(xh(k2, k7, l11, flag))
                return true;
            j2 = (i2 + 1) % j1;
            i2 = ((i2 - 1) + j1) % j1;
            if(k1 == l1)
                byte0 = 1;
        } else {
            for(j2 = i2; ai4[j2] < ai2[k1]; j2 = (j2 + 1) % j1);
            for(; ai4[i2] < ai2[k1]; i2 = ((i2 - 1) + j1) % j1);
            int l2 = ai1[k1];
            int i12 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[k1]);
            int l16 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[k1]);
            flag = (l2 < i12) | (l2 < l16);
            if(xh(i12, l16, l2, !flag))
                return true;
            l1 = (k1 + 1) % i1;
            k1 = ((k1 - 1) + i1) % i1;
            if(i2 == j2)
                byte0 = 2;
        }
        while(byte0 == 0) 
            if(ai2[k1] < ai2[l1]) {
                if(ai2[k1] < ai4[i2]) {
                    if(ai2[k1] < ai4[j2]) {
                        int i3 = ai1[k1];
                        int l7 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai2[k1]);
                        int j12 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[k1]);
                        int i17 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[k1]);
                        if(hi(i3, l7, j12, i17, flag))
                            return true;
                        k1 = ((k1 - 1) + i1) % i1;
                        if(k1 == l1)
                            byte0 = 1;
                    } else {
                        int j3 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[j2]);
                        int i8 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[j2]);
                        int k12 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai4[j2]);
                        int j17 = ai3[j2];
                        if(hi(j3, i8, k12, j17, flag))
                            return true;
                        j2 = (j2 + 1) % j1;
                        if(i2 == j2)
                            byte0 = 2;
                    }
                } else
                if(ai4[i2] < ai4[j2]) {
                    int k3 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[i2]);
                    int j8 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[i2]);
                    int l12 = ai3[i2];
                    int k17 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai4[i2]);
                    if(hi(k3, j8, l12, k17, flag))
                        return true;
                    i2 = ((i2 - 1) + j1) % j1;
                    if(i2 == j2)
                        byte0 = 2;
                } else {
                    int l3 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[j2]);
                    int k8 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[j2]);
                    int i13 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai4[j2]);
                    int l17 = ai3[j2];
                    if(hi(l3, k8, i13, l17, flag))
                        return true;
                    j2 = (j2 + 1) % j1;
                    if(i2 == j2)
                        byte0 = 2;
                }
            } else
            if(ai2[l1] < ai4[i2]) {
                if(ai2[l1] < ai4[j2]) {
                    int i4 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai2[l1]);
                    int l8 = ai1[l1];
                    int j13 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[l1]);
                    int i18 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[l1]);
                    if(hi(i4, l8, j13, i18, flag))
                        return true;
                    l1 = (l1 + 1) % i1;
                    if(k1 == l1)
                        byte0 = 1;
                } else {
                    int j4 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[j2]);
                    int i9 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[j2]);
                    int k13 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai4[j2]);
                    int j18 = ai3[j2];
                    if(hi(j4, i9, k13, j18, flag))
                        return true;
                    j2 = (j2 + 1) % j1;
                    if(i2 == j2)
                        byte0 = 2;
                }
            } else
            if(ai4[i2] < ai4[j2]) {
                int k4 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[i2]);
                int j9 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[i2]);
                int l13 = ai3[i2];
                int k18 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai4[i2]);
                if(hi(k4, j9, l13, k18, flag))
                    return true;
                i2 = ((i2 - 1) + j1) % j1;
                if(i2 == j2)
                    byte0 = 2;
            } else {
                int l4 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[j2]);
                int k9 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[j2]);
                int i14 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai4[j2]);
                int l18 = ai3[j2];
                if(hi(l4, k9, i14, l18, flag))
                    return true;
                j2 = (j2 + 1) % j1;
                if(i2 == j2)
                    byte0 = 2;
            }
        while(byte0 == 1) 
            if(ai2[k1] < ai4[i2]) {
                if(ai2[k1] < ai4[j2]) {
                    int i5 = ai1[k1];
                    int j14 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[k1]);
                    int i19 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[k1]);
                    return xh(j14, i19, i5, !flag);
                }
                int j5 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[j2]);
                int l9 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[j2]);
                int k14 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai4[j2]);
                int j19 = ai3[j2];
                if(hi(j5, l9, k14, j19, flag))
                    return true;
                j2 = (j2 + 1) % j1;
                if(i2 == j2)
                    byte0 = 0;
            } else
            if(ai4[i2] < ai4[j2]) {
                int k5 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[i2]);
                int i10 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[i2]);
                int l14 = ai3[i2];
                int k19 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai4[i2]);
                if(hi(k5, i10, l14, k19, flag))
                    return true;
                i2 = ((i2 - 1) + j1) % j1;
                if(i2 == j2)
                    byte0 = 0;
            } else {
                int l5 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[j2]);
                int j10 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[j2]);
                int i15 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai4[j2]);
                int l19 = ai3[j2];
                if(hi(l5, j10, i15, l19, flag))
                    return true;
                j2 = (j2 + 1) % j1;
                if(i2 == j2)
                    byte0 = 0;
            }
        while(byte0 == 2) 
            if(ai4[i2] < ai2[k1]) {
                if(ai4[i2] < ai2[l1]) {
                    int i6 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[i2]);
                    int k10 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[i2]);
                    int j15 = ai3[i2];
                    return xh(i6, k10, j15, flag);
                }
                int j6 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai2[l1]);
                int l10 = ai1[l1];
                int k15 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[l1]);
                int i20 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[l1]);
                if(hi(j6, l10, k15, i20, flag))
                    return true;
                l1 = (l1 + 1) % i1;
                if(k1 == l1)
                    byte0 = 0;
            } else
            if(ai2[k1] < ai2[l1]) {
                int k6 = ai1[k1];
                int i11 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai2[k1]);
                int l15 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[k1]);
                int j20 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[k1]);
                if(hi(k6, i11, l15, j20, flag))
                    return true;
                k1 = ((k1 - 1) + i1) % i1;
                if(k1 == l1)
                    byte0 = 0;
            } else {
                int l6 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai2[l1]);
                int j11 = ai1[l1];
                int i16 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[l1]);
                int k20 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[l1]);
                if(hi(l6, j11, i16, k20, flag))
                    return true;
                l1 = (l1 + 1) % i1;
                if(k1 == l1)
                    byte0 = 0;
            }
        if(ai2[k1] < ai4[i2]) {
            int i7 = ai1[k1];
            int j16 = th(ai3[(i2 + 1) % j1], ai4[(i2 + 1) % j1], ai3[i2], ai4[i2], ai2[k1]);
            int l20 = th(ai3[((j2 - 1) + j1) % j1], ai4[((j2 - 1) + j1) % j1], ai3[j2], ai4[j2], ai2[k1]);
            return xh(j16, l20, i7, !flag);
        }
        int j7 = th(ai1[(k1 + 1) % i1], ai2[(k1 + 1) % i1], ai1[k1], ai2[k1], ai4[i2]);
        int k11 = th(ai1[((l1 - 1) + i1) % i1], ai2[((l1 - 1) + i1) % i1], ai1[l1], ai2[l1], ai4[i2]);
        int k16 = ai3[i2];
        return xh(j7, k11, k16, flag);
    }

    int fm;
    int gm;
    int hm[];
    int im[][];
    int jm[];
    public int km;
    public int lm;
    public int mm;
    public int nm;
    public int om;
    public int pm;
    public static int qm[] = new int[2048];
    private static int rm[] = new int[512];
    public boolean sm;
    public double tm;
    public int um;
    private boolean vm;
    private int wm;
    private int xm;
    private int ym;
    private int zm;
    private i an[];
    private int bn[];
    private int cn;
    private int dn;
    private int en;
    private int fn;
    private int gn;
    private int hn;
    private int in;
    private int jn;
    private int kn;
    private int ln;
    private int mn;
    private int nn;
    private int on;
    private int pn;
    private int qn;
    private i rn[];
    private int sn[];
    private int tn;
    private r un[];
    private int vn;
    private int wn;
    private int xn[];
    private int yn[];
    private int zn[];
    private int ao[];
    private int bo[];
    private int co[];
    private int _flddo[];
    public i eo;
    private static final int fo = 16;
    private static final int go = 4;
    private static final int ho = 5;
    private static final int io = 0xbc614e;
    int jo;
    String ko[];
    int lo[];
    int mo[];
    long no[];
    boolean oo[];
    int po[][];
    private static long qo;
    byte ro[];
    int so[][];
    int to[][];
    private static byte uo[];
    private static int vo[] = new int[256];
    j wo;
    public int xo[];
    u yo[];
    int zo;
    int ap;
    int bp[];
    int cp[];
    int dp[];
    int ep[];
    int fp[];
    int gp[];
    boolean hp;
    static int ip;
    static int jp;
    static int kp;
    static int lp;
    static int mp;
    static int np;
    int op;
    int pp;

}
