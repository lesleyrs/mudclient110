// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex;

import java.io.PrintStream;

// Referenced classes of package jagex:
//            b

public class o {

    public static int hk(byte abyte0[], int i, byte abyte1[], int j, int k) {
        b b1 = new b();
        b1.t = abyte1;
        b1.u = k;
        b1.y = abyte0;
        b1.z = 0;
        b1.v = j;
        b1.ab = i;
        b1.hb = 0;
        b1.gb = 0;
        b1.w = 0;
        b1.x = 0;
        b1.bb = 0;
        b1.cb = 0;
        b1.jb = 0;
        ik(b1);
        i -= b1.ab;
        return i;
    }

    private static void jk(b b1) {
        byte byte4 = b1.db;
        int i = b1.eb;
        int j = b1.ob;
        int k = b1.mb;
        int ai[] = b.rb;
        int l = b1.lb;
        byte abyte0[] = b1.y;
        int i1 = b1.z;
        int j1 = b1.ab;
        int k1 = j1;
        int l1 = b1.fc + 1;
label0:
        do {
            if(i > 0) {
                do {
                    if(j1 == 0)
                        break label0;
                    if(i == 1)
                        break;
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while(true);
                if(j1 == 0) {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while(flag)  {
                flag = false;
                if(j == l1) {
                    i = 0;
                    break label0;
                }
                byte4 = (byte)k;
                l = ai[l];
                byte byte0 = (byte)(l & 0xff);
                l >>= 8;
                j++;
                if(byte0 != k) {
                    k = byte0;
                    if(j1 == 0) {
                        i = 1;
                    } else {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if(j != l1)
                    continue;
                if(j1 == 0) {
                    i = 1;
                    break label0;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
                flag = true;
            }
            i = 2;
            l = ai[l];
            byte byte1 = (byte)(l & 0xff);
            l >>= 8;
            if(++j != l1)
                if(byte1 != k) {
                    k = byte1;
                } else {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte)(l & 0xff);
                    l >>= 8;
                    if(++j != l1)
                        if(byte2 != k) {
                            k = byte2;
                        } else {
                            l = ai[l];
                            byte byte3 = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                        }
                }
        } while(true);
        int i2 = b1.bb;
        b1.bb += k1 - j1;
        if(b1.bb < i2)
            b1.cb++;
        b1.db = byte4;
        b1.eb = i;
        b1.ob = j;
        b1.mb = k;
        b.rb = ai;
        b1.lb = l;
        b1.y = abyte0;
        b1.z = i1;
        b1.ab = j1;
    }

    private static void ik(b b1) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag15 = false;
        boolean flag16 = false;
        boolean flag17 = false;
        boolean flag18 = false;
        int k8 = 0;
        int ai[] = null;
        int ai1[] = null;
        int ai2[] = null;
        b1.ib = 1;
        if(b.rb == null)
            b.rb = new int[b1.ib * 0x186a0];
        boolean flag19 = true;
        while(flag19)  {
            byte byte0 = gk(b1);
            if(byte0 == 23)
                return;
            byte0 = gk(b1);
            byte0 = gk(b1);
            byte0 = gk(b1);
            byte0 = gk(b1);
            byte0 = gk(b1);
            b1.jb++;
            byte0 = gk(b1);
            byte0 = gk(b1);
            byte0 = gk(b1);
            byte0 = gk(b1);
            byte0 = lk(b1);
            if(byte0 != 0)
                b1.fb = true;
            else
                b1.fb = false;
            if(b1.fb)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            b1.kb = 0;
            byte0 = gk(b1);
            b1.kb = b1.kb << 8 | byte0 & 0xff;
            byte0 = gk(b1);
            b1.kb = b1.kb << 8 | byte0 & 0xff;
            byte0 = gk(b1);
            b1.kb = b1.kb << 8 | byte0 & 0xff;
            for(int j = 0; j < 16; j++) {
                byte byte1 = lk(b1);
                if(byte1 == 1)
                    b1.ub[j] = true;
                else
                    b1.ub[j] = false;
            }

            for(int k = 0; k < 256; k++)
                b1.tb[k] = false;

            for(int l = 0; l < 16; l++)
                if(b1.ub[l]) {
                    for(int i3 = 0; i3 < 16; i3++) {
                        byte byte2 = lk(b1);
                        if(byte2 == 1)
                            b1.tb[l * 16 + i3] = true;
                    }

                }

            kk(b1);
            int i4 = b1.sb + 2;
            int j4 = mk(3, b1);
            int k4 = mk(15, b1);
            for(int i1 = 0; i1 < k4; i1++) {
                int j3 = 0;
                do {
                    byte byte3 = lk(b1);
                    if(byte3 == 0)
                        break;
                    j3++;
                } while(true);
                b1.zb[i1] = (byte)j3;
            }

            byte abyte0[] = new byte[6];
            for(byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for(int j1 = 0; j1 < k4; j1++) {
                byte byte17 = b1.zb[j1];
                byte byte15 = abyte0[byte17];
                for(; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                b1.yb[j1] = byte15;
            }

            for(int k3 = 0; k3 < j4; k3++) {
                int l6 = mk(5, b1);
                for(int k1 = 0; k1 < i4; k1++) {
                    do {
                        byte byte4 = lk(b1);
                        if(byte4 == 0)
                            break;
                        byte4 = lk(b1);
                        if(byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while(true);
                    b1.ac[k3][k1] = (byte)l6;
                }

            }

            for(int l3 = 0; l3 < j4; l3++) {
                byte byte8 = 32;
                int i = 0;
                for(int l1 = 0; l1 < i4; l1++) {
                    if(b1.ac[l3][l1] > i)
                        i = b1.ac[l3][l1];
                    if(b1.ac[l3][l1] < byte8)
                        byte8 = b1.ac[l3][l1];
                }

                nk(b1.bc[l3], b1.cc[l3], b1.dc[l3], b1.ac[l3], byte8, i, i4);
                b1.ec[l3] = byte8;
            }

            int l4 = b1.sb + 1;
            int l5 = 0x186a0 * b1.ib;
            int i5 = -1;
            int j5 = 0;
            for(int i2 = 0; i2 <= 255; i2++)
                b1.nb[i2] = 0;

            int j9 = 4095;
            for(int l8 = 15; l8 >= 0; l8--) {
                for(int i9 = 15; i9 >= 0; i9--) {
                    b1.wb[j9] = (byte)(l8 * 16 + i9);
                    j9--;
                }

                b1.xb[l8] = j9 + 1;
            }

            int i6 = 0;
            if(j5 == 0) {
                i5++;
                j5 = 50;
                byte byte12 = b1.yb[i5];
                k8 = b1.ec[byte12];
                ai = b1.bc[byte12];
                ai2 = b1.dc[byte12];
                ai1 = b1.cc[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for(l7 = mk(i7, b1); l7 > ai[i7]; l7 = l7 << 1 | byte9) {
                i7++;
                byte9 = lk(b1);
            }

            for(int k5 = ai2[l7 - ai1[i7]]; k5 != l4;)
                if(k5 == 0 || k5 == 1) {
                    int j6 = -1;
                    int k6 = 1;
                    do {
                        if(k5 == 0)
                            j6 += k6;
                        else
                        if(k5 == 1)
                            j6 += 2 * k6;
                        k6 *= 2;
                        if(j5 == 0) {
                            i5++;
                            j5 = 50;
                            byte byte13 = b1.yb[i5];
                            k8 = b1.ec[byte13];
                            ai = b1.bc[byte13];
                            ai2 = b1.dc[byte13];
                            ai1 = b1.cc[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for(i8 = mk(j7, b1); i8 > ai[j7]; i8 = i8 << 1 | byte10) {
                            j7++;
                            byte10 = lk(b1);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while(k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = b1.vb[b1.wb[b1.xb[0]] & 0xff];
                    b1.nb[byte5 & 0xff] += j6;
                    for(; j6 > 0; j6--) {
                        b.rb[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else {
                    int j11 = k5 - 1;
                    byte byte6;
                    if(j11 < 16) {
                        int j10 = b1.xb[0];
                        byte6 = b1.wb[j10 + j11];
                        for(; j11 > 3; j11 -= 4) {
                            int k11 = j10 + j11;
                            b1.wb[k11] = b1.wb[k11 - 1];
                            b1.wb[k11 - 1] = b1.wb[k11 - 2];
                            b1.wb[k11 - 2] = b1.wb[k11 - 3];
                            b1.wb[k11 - 3] = b1.wb[k11 - 4];
                        }

                        for(; j11 > 0; j11--)
                            b1.wb[j10 + j11] = b1.wb[(j10 + j11) - 1];

                        b1.wb[j10] = byte6;
                    } else {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = b1.xb[l10] + i11;
                        byte6 = b1.wb[k10];
                        for(; k10 > b1.xb[l10]; k10--)
                            b1.wb[k10] = b1.wb[k10 - 1];

                        b1.xb[l10]++;
                        for(; l10 > 0; l10--) {
                            b1.xb[l10]--;
                            b1.wb[b1.xb[l10]] = b1.wb[(b1.xb[l10 - 1] + 16) - 1];
                        }

                        b1.xb[0]--;
                        b1.wb[b1.xb[0]] = byte6;
                        if(b1.xb[0] == 0) {
                            int i10 = 4095;
                            for(int k9 = 15; k9 >= 0; k9--) {
                                for(int l9 = 15; l9 >= 0; l9--) {
                                    b1.wb[i10] = b1.wb[b1.xb[k9] + l9];
                                    i10--;
                                }

                                b1.xb[k9] = i10 + 1;
                            }

                        }
                    }
                    b1.nb[b1.vb[byte6 & 0xff] & 0xff]++;
                    b.rb[i6] = b1.vb[byte6 & 0xff] & 0xff;
                    i6++;
                    if(j5 == 0) {
                        i5++;
                        j5 = 50;
                        byte byte14 = b1.yb[i5];
                        k8 = b1.ec[byte14];
                        ai = b1.bc[byte14];
                        ai2 = b1.dc[byte14];
                        ai1 = b1.cc[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for(j8 = mk(k7, b1); j8 > ai[k7]; j8 = j8 << 1 | byte11) {
                        k7++;
                        byte11 = lk(b1);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            b1.eb = 0;
            b1.db = 0;
            b1.pb[0] = 0;
            for(int j2 = 1; j2 <= 256; j2++)
                b1.pb[j2] = b1.nb[j2 - 1];

            for(int k2 = 1; k2 <= 256; k2++)
                b1.pb[k2] += b1.pb[k2 - 1];

            for(int l2 = 0; l2 < i6; l2++) {
                byte byte7 = (byte)(b.rb[l2] & 0xff);
                b.rb[b1.pb[byte7 & 0xff]] |= l2 << 8;
                b1.pb[byte7 & 0xff]++;
            }

            b1.lb = b.rb[b1.kb] >> 8;
            b1.ob = 0;
            b1.lb = b.rb[b1.lb];
            b1.mb = (byte)(b1.lb & 0xff);
            b1.lb >>= 8;
            b1.ob++;
            b1.fc = i6;
            jk(b1);
            if(b1.ob == b1.fc + 1 && b1.eb == 0)
                flag19 = true;
            else
                flag19 = false;
        }
    }

    private static byte gk(b b1) {
        return (byte)mk(8, b1);
    }

    private static byte lk(b b1) {
        return (byte)mk(1, b1);
    }

    private static int mk(int i, b b1) {
        int j;
        do {
            if(b1.hb >= i) {
                int k = b1.gb >> b1.hb - i & (1 << i) - 1;
                b1.hb -= i;
                j = k;
                break;
            }
            b1.gb = b1.gb << 8 | b1.t[b1.u] & 0xff;
            b1.hb += 8;
            b1.u++;
            b1.v--;
            b1.w++;
            if(b1.w == 0)
                b1.x++;
        } while(true);
        return j;
    }

    private static int ok(int i, int ai[]) {
        int j = 0;
        int k = 256;
        do {
            int l = j + k >> 1;
            if(i >= ai[l])
                j = l;
            else
                k = l;
        } while(k - j != 1);
        return j;
    }

    private static void kk(b b1) {
        b1.sb = 0;
        for(int i = 0; i < 256; i++)
            if(b1.tb[i]) {
                b1.vb[b1.sb] = (byte)i;
                b1.sb++;
            }

    }

    private static void nk(int ai[], int ai1[], int ai2[], byte abyte0[], int i, int j, int k) {
        int l = 0;
        for(int i1 = i; i1 <= j; i1++) {
            for(int l2 = 0; l2 < k; l2++)
                if(abyte0[l2] == i1) {
                    ai2[l] = l2;
                    l++;
                }

        }

        for(int j1 = 0; j1 < 23; j1++)
            ai1[j1] = 0;

        for(int k1 = 0; k1 < k; k1++)
            ai1[abyte0[k1] + 1]++;

        for(int l1 = 1; l1 < 23; l1++)
            ai1[l1] += ai1[l1 - 1];

        for(int i2 = 0; i2 < 23; i2++)
            ai[i2] = 0;

        int i3 = 0;
        for(int j2 = i; j2 <= j; j2++) {
            i3 += ai1[j2 + 1] - ai1[j2];
            ai[j2] = i3 - 1;
            i3 <<= 1;
        }

        for(int k2 = i + 1; k2 <= j; k2++)
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];

    }

    public o() {
    }

    static final int rs = 1;
    static final int ss = 2;
    static final int ts = 10;
    static final int us = 14;
    static final int vs = 0;
    static final int ws = 4;
    static final int xs = 4096;
    static final int ys = 16;
    static final int zs = 258;
    static final int at = 23;
    static final int bt = 0;
    static final int ct = 1;
    static final int dt = 6;
    static final int et = 50;
    static final int ft = 4;
    static final int gt = 18002;
}
