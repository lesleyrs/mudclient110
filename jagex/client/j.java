// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import java.awt.*;
import java.awt.image.*;
import java.io.PrintStream;

public class j
    implements ImageProducer, ImageObserver {

    public j(int i, int k, int l, Component component) {
        uk = true;
        zk = false;
        dl = false;
        ik = component;
        wk = k;
        yk = i;
        dk = ak = i;
        ek = bk = k;
        ck = i * k;
        gk = new int[i * k];
        kk = new int[l][];
        tk = new boolean[l];
        lk = new byte[l][];
        mk = new int[l][];
        nk = new int[l];
        ok = new int[l];
        rk = new int[l];
        sk = new int[l];
        pk = new int[l];
        qk = new int[l];
        if(i > 1 && k > 1 && component != null) {
            fk = new DirectColorModel(32, 0xff0000, 65280, 255);
            int i1 = ak * bk;
            for(int j1 = 0; j1 < i1; j1++)
                gk[j1] = 0;

            jk = component.createImage(this);
            ag();
            component.prepareImage(jk, component);
            ag();
            component.prepareImage(jk, component);
            ag();
            component.prepareImage(jk, component);
        }
    }

    public synchronized void ch(int i, int k) {
        if(ak > dk)
            ak = dk;
        if(bk > ek)
            bk = ek;
        ak = i;
        bk = k;
        ck = i * k;
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer) {
        hk = imageconsumer;
        imageconsumer.setDimensions(ak, bk);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(fk);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        return hk == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
        if(hk == imageconsumer)
            hk = null;
    }

    public void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public synchronized void ag() {
        if(hk == null) {
            return;
        } else {
            hk.setPixels(0, 0, ak, bk, fk, gk, 0, ak);
            hk.imageComplete(2);
            return;
        }
    }

    public void xf(int i, int k, int l, int i1) {
        if(i < 0)
            i = 0;
        if(k < 0)
            k = 0;
        if(l > ak)
            l = ak;
        if(i1 > bk)
            i1 = bk;
        xk = i;
        vk = k;
        yk = l;
        wk = i1;
    }

    public void yf() {
        xk = 0;
        vk = 0;
        yk = ak;
        wk = bk;
    }

    public void pf(Graphics g, int i, int k) {
        ag();
        g.drawImage(jk, i, k, this);
    }

    public void rf() {
        int i = ak * bk;
        if(!zk) {
            for(int k = 0; k < i; k++)
                gk[k] = 0;

            return;
        }
        int l = 0;
        for(int i1 = -bk; i1 < 0; i1 += 2) {
            for(int j1 = -ak; j1 < 0; j1++)
                gk[l++] = 0;

            l += ak;
        }

    }

    public void eg(int i, int k, int l, int i1, int j1) {
        int k1 = 256 - j1;
        int l1 = (i1 >> 16 & 0xff) * j1;
        int i2 = (i1 >> 8 & 0xff) * j1;
        int j2 = (i1 & 0xff) * j1;
        int j3 = k - l;
        if(j3 < 0)
            j3 = 0;
        int k3 = k + l;
        if(k3 >= bk)
            k3 = bk - 1;
        byte byte0 = 1;
        if(zk) {
            byte0 = 2;
            if((j3 & 1) != 0)
                j3++;
        }
        for(int l3 = j3; l3 <= k3; l3 += byte0) {
            int i4 = l3 - k;
            int j4 = (int)Math.sqrt(l * l - i4 * i4);
            int k4 = i - j4;
            if(k4 < 0)
                k4 = 0;
            int l4 = i + j4;
            if(l4 >= ak)
                l4 = ak - 1;
            int i5 = k4 + l3 * ak;
            for(int j5 = k4; j5 <= l4; j5++) {
                int k2 = (gk[i5] >> 16 & 0xff) * k1;
                int l2 = (gk[i5] >> 8 & 0xff) * k1;
                int i3 = (gk[i5] & 0xff) * k1;
                int k5 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
                gk[i5++] = k5;
            }

        }

    }

    public void zf(int i, int k, int l, int i1, int j1, int k1) {
        if(i < xk) {
            l -= xk - i;
            i = xk;
        }
        if(k < vk) {
            i1 -= vk - k;
            k = vk;
        }
        if(i + l > yk)
            l = yk - i;
        if(k + i1 > wk)
            i1 = wk - k;
        int l1 = 256 - k1;
        int i2 = (j1 >> 16 & 0xff) * k1;
        int j2 = (j1 >> 8 & 0xff) * k1;
        int k2 = (j1 & 0xff) * k1;
        int k3 = ak - l;
        byte byte0 = 1;
        if(zk) {
            byte0 = 2;
            k3 += ak;
            if((k & 1) != 0) {
                k++;
                i1--;
            }
        }
        int l3 = i + k * ak;
        for(int i4 = 0; i4 < i1; i4 += byte0) {
            for(int j4 = -l; j4 < 0; j4++) {
                int l2 = (gk[l3] >> 16 & 0xff) * l1;
                int i3 = (gk[l3] >> 8 & 0xff) * l1;
                int j3 = (gk[l3] & 0xff) * l1;
                int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                gk[l3++] = k4;
            }

            l3 += k3;
        }

    }

    public void lg(int i, int k, int l, int i1, int j1, int k1) {
        if(i < xk) {
            l -= xk - i;
            i = xk;
        }
        if(i + l > yk)
            l = yk - i;
        int l1 = k1 >> 16 & 0xff;
        int i2 = k1 >> 8 & 0xff;
        int j2 = k1 & 0xff;
        int k2 = j1 >> 16 & 0xff;
        int l2 = j1 >> 8 & 0xff;
        int i3 = j1 & 0xff;
        int j3 = ak - l;
        byte byte0 = 1;
        if(zk) {
            byte0 = 2;
            j3 += ak;
            if((k & 1) != 0) {
                k++;
                i1--;
            }
        }
        int k3 = i + k * ak;
        for(int l3 = 0; l3 < i1; l3 += byte0)
            if(l3 + k >= vk && l3 + k < wk) {
                int i4 = ((l1 * l3 + k2 * (i1 - l3)) / i1 << 16) + ((i2 * l3 + l2 * (i1 - l3)) / i1 << 8) + (j2 * l3 + i3 * (i1 - l3)) / i1;
                for(int j4 = -l; j4 < 0; j4++)
                    gk[k3++] = i4;

                k3 += j3;
            } else {
                k3 += ak;
            }

    }

    public void dg(int i, int k, int l, int i1, int j1) {
        if(i < xk) {
            l -= xk - i;
            i = xk;
        }
        if(k < vk) {
            i1 -= vk - k;
            k = vk;
        }
        if(i + l > yk)
            l = yk - i;
        if(k + i1 > wk)
            i1 = wk - k;
        int k1 = ak - l;
        byte byte0 = 1;
        if(zk) {
            byte0 = 2;
            k1 += ak;
            if((k & 1) != 0) {
                k++;
                i1--;
            }
        }
        int l1 = i + k * ak;
        for(int i2 = -i1; i2 < 0; i2 += byte0) {
            for(int j2 = -l; j2 < 0; j2++)
                gk[l1++] = j1;

            l1 += k1;
        }

    }

    public void wf(int i, int k, int l, int i1, int j1) {
        wg(i, k, l, j1);
        wg(i, (k + i1) - 1, l, j1);
        bh(i, k, i1, j1);
        bh((i + l) - 1, k, i1, j1);
    }

    public void wg(int i, int k, int l, int i1) {
        if(k < vk || k >= wk)
            return;
        if(i < xk) {
            l -= xk - i;
            i = xk;
        }
        if(i + l > yk)
            l = yk - i;
        int j1 = i + k * ak;
        for(int k1 = 0; k1 < l; k1++)
            gk[j1 + k1] = i1;

    }

    public void bh(int i, int k, int l, int i1) {
        if(i < xk || i >= yk)
            return;
        if(k < vk) {
            l -= vk - k;
            k = vk;
        }
        if(k + l > yk)
            l = wk - k;
        int j1 = i + k * ak;
        for(int k1 = 0; k1 < l; k1++)
            gk[j1 + k1 * ak] = i1;

    }

    public void qg(int i, int k, int l) {
        if(i < xk || k < vk || i >= yk || k >= wk) {
            return;
        } else {
            gk[i + k * ak] = l;
            return;
        }
    }

    public void lf() {
        int l = ak * bk;
        for(int k = 0; k < l; k++) {
            int i = gk[k] & 0xffffff;
            gk[k] = (i >>> 1 & 0x7f7f7f) + (i >>> 2 & 0x3f3f3f) + (i >>> 3 & 0x1f1f1f) + (i >>> 4 & 0xf0f0f);
        }

    }

    public void xg(int i, int k, int l, int i1, int j1, int k1) {
        for(int l1 = l; l1 < l + j1; l1++) {
            for(int i2 = i1; i2 < i1 + k1; i2++) {
                int j2 = 0;
                int k2 = 0;
                int l2 = 0;
                int i3 = 0;
                for(int j3 = l1 - i; j3 <= l1 + i; j3++)
                    if(j3 >= 0 && j3 < ak) {
                        for(int k3 = i2 - k; k3 <= i2 + k; k3++)
                            if(k3 >= 0 && k3 < bk) {
                                int l3 = gk[j3 + ak * k3];
                                j2 += l3 >> 16 & 0xff;
                                k2 += l3 >> 8 & 0xff;
                                l2 += l3 & 0xff;
                                i3++;
                            }

                    }

                gk[l1 + ak * i2] = (j2 / i3 << 16) + (k2 / i3 << 8) + l2 / i3;
            }

        }

    }

    public static int pg(int i, int k, int l) {
        return (i << 16) + (k << 8) + l;
    }

    public void ng() {
        for(int i = 0; i < kk.length; i++) {
            kk[i] = null;
            nk[i] = 0;
            ok[i] = 0;
            lk[i] = null;
            mk[i] = null;
        }

    }

    public void og(byte abyte0[], int i, int k, boolean flag, boolean flag1) {
        mg(abyte0, i, k, flag, 1, 1, flag1);
    }

    public void tg(byte abyte0[], int i, int k, boolean flag, int l, boolean flag1) {
        mg(abyte0, i, k, flag, l, 1, flag1);
    }

    public void mg(byte abyte0[], int i, int k, boolean flag, int l, int i1, boolean flag1) {
        int j1 = (abyte0[13 + i] & 0xff) * 256 + (abyte0[12 + i] & 0xff);
        int k1 = (abyte0[15 + i] & 0xff) * 256 + (abyte0[14 + i] & 0xff);
        int l1 = -1;
        int ai[] = new int[256];
        for(int i2 = 0; i2 < 256; i2++) {
            ai[i2] = 0xff000000 + ((abyte0[i + 20 + i2 * 3] & 0xff) << 16) + ((abyte0[i + 19 + i2 * 3] & 0xff) << 8) + (abyte0[i + 18 + i2 * 3] & 0xff);
            if(ai[i2] == -65281)
                l1 = i2;
        }

        if(l1 == -1)
            flag = false;
        if(flag1 && flag)
            ai[l1] = ai[0];
        int j2 = j1 / l;
        int k2 = k1 / i1;
        int ai1[] = new int[j2 * k2];
        for(int l2 = 0; l2 < i1; l2++) {
            for(int i3 = 0; i3 < l; i3++) {
                int j3 = 0;
                for(int k3 = k2 * l2; k3 < k2 * (l2 + 1); k3++) {
                    for(int l3 = j2 * i3; l3 < j2 * (i3 + 1); l3++)
                        if(flag1)
                            ai1[j3++] = abyte0[i + 786 + l3 + (k1 - k3 - 1) * j1] & 0xff;
                        else
                            ai1[j3++] = ai[abyte0[i + 786 + l3 + (k1 - k3 - 1) * j1] & 0xff];

                }

                if(flag1)
                    nf(ai1, j2, k2, k++, flag, ai, l1);
                else
                    nf(ai1, j2, k2, k++, flag, null, -65281);
            }

        }

    }

    private void nf(int ai[], int i, int k, int l, boolean flag, int ai1[], int i1) {
        int j1 = 0;
        int k1 = 0;
        int l1 = i;
        int i2 = k;
        if(flag && uk) {
label0:
            for(int j2 = 0; j2 < k; j2++) {
                for(int i3 = 0; i3 < i; i3++) {
                    int i4 = ai[i3 + j2 * i];
                    if(i4 == i1)
                        continue;
                    k1 = j2;
                    break label0;
                }

            }

label1:
            for(int j3 = 0; j3 < i; j3++) {
                for(int j4 = 0; j4 < k; j4++) {
                    int j5 = ai[j3 + j4 * i];
                    if(j5 == i1)
                        continue;
                    j1 = j3;
                    break label1;
                }

            }

label2:
            for(int k4 = k - 1; k4 >= 0; k4--) {
                for(int k5 = 0; k5 < i; k5++) {
                    int k6 = ai[k5 + k4 * i];
                    if(k6 == i1)
                        continue;
                    i2 = k4 + 1;
                    break label2;
                }

            }

label3:
            for(int l5 = i - 1; l5 >= 0; l5--) {
                for(int l6 = 0; l6 < k; l6++) {
                    int i7 = ai[l5 + l6 * i];
                    if(i7 == i1)
                        continue;
                    l1 = l5 + 1;
                    break label3;
                }

            }

        }
        nk[l] = l1 - j1;
        ok[l] = i2 - k1;
        tk[l] = flag;
        pk[l] = j1;
        qk[l] = k1;
        rk[l] = i;
        sk[l] = k;
        if(ai1 == null) {
            kk[l] = new int[(l1 - j1) * (i2 - k1)];
            int k2 = 0;
            for(int k3 = k1; k3 < i2; k3++) {
                for(int l4 = j1; l4 < l1; l4++) {
                    int i6 = ai[l4 + k3 * i];
                    if(flag) {
                        if(i6 == i1)
                            i6 = 0;
                        if(i6 == 0xff000000)
                            i6 = 0xff010101;
                    }
                    kk[l][k2++] = i6 & 0xffffff;
                }

            }

            return;
        }
        lk[l] = new byte[(l1 - j1) * (i2 - k1)];
        mk[l] = ai1;
        int l2 = 0;
        for(int l3 = k1; l3 < i2; l3++) {
            for(int i5 = j1; i5 < l1; i5++) {
                int j6 = ai[i5 + l3 * i];
                if(flag)
                    if(j6 == i1)
                        j6 = 0;
                    else
                    if(j6 == 0)
                        j6 = i1;
                lk[l][l2++] = (byte)j6;
            }

        }

    }

    public void ah(int i, int k, int l, int i1, int j1) {
        int ai[] = new int[32768];
        int k1 = k + l * ak;
        for(int l1 = l; l1 < l + j1; l1++) {
            for(int i2 = k; i2 < k + i1; i2++) {
                int j2 = gk[k1++];
                ai[((j2 & 0xf80000) >> 9) + ((j2 & 0xf800) >> 6) + ((j2 & 0xf8) >> 3)]++;
            }

            k1 += ak - i1;
        }

        int ai1[] = new int[256];
        int ai2[] = new int[256];
        for(int k2 = 0; k2 < 32768; k2++) {
            int l2 = ai[k2];
            if(l2 > ai2[255]) {
                for(int j3 = 1; j3 < 256; j3++) {
                    if(l2 <= ai2[j3])
                        continue;
                    for(int k3 = 255; k3 > j3; k3--) {
                        ai1[k3] = ai1[k3 - 1];
                        ai2[k3] = ai2[k3 - 1];
                    }

                    ai1[j3] = ((k2 & 0x7c00) << 9) + ((k2 & 0x3e0) << 6) + ((k2 & 0x1f) << 3) + 0x40404;
                    ai2[j3] = l2;
                    break;
                }

            }
            ai[k2] = 0;
        }

        int i3 = i1 * j1;
        k1 = 0;
        byte abyte0[] = new byte[i3];
        for(int l3 = l; l3 < l + j1; l3++) {
            for(int i4 = k; i4 < k + i1; i4++) {
                int j4 = gk[i4 + l3 * ak];
                int k4 = ((j4 & 0xf80000) >> 9) + ((j4 & 0xf800) >> 6) + ((j4 & 0xf8) >> 3);
                int l4 = ai[k4];
                if(l4 == 0) {
                    int i5 = 0x3b9ac9ff;
                    int j5 = j4 >> 16 & 0xff;
                    int k5 = j4 >> 8 & 0xff;
                    int l5 = j4 & 0xff;
                    for(int i6 = 1; i6 < 256; i6++) {
                        int j6 = ai1[i6];
                        int k6 = j6 >> 16 & 0xff;
                        int l6 = j6 >> 8 & 0xff;
                        int i7 = j6 & 0xff;
                        int j7 = (j5 - k6) * (j5 - k6) + (k5 - l6) * (k5 - l6) + (l5 - i7) * (l5 - i7);
                        if(j7 < i5) {
                            i5 = j7;
                            l4 = i6;
                        }
                    }

                    ai[k4] = l4;
                }
                abyte0[k1++] = (byte)l4;
            }

        }

        nk[i] = i1;
        ok[i] = j1;
        tk[i] = false;
        pk[i] = 0;
        qk[i] = 0;
        rk[i] = i1;
        sk[i] = j1;
        lk[i] = abyte0;
        mk[i] = ai1;
        kk[i] = null;
    }

    public void qf(int i, int k, int l, int i1, int j1) {
        nk[i] = i1;
        ok[i] = j1;
        tk[i] = false;
        pk[i] = 0;
        qk[i] = 0;
        rk[i] = i1;
        sk[i] = j1;
        int k1 = i1 * j1;
        int l1 = 0;
        kk[i] = new int[k1];
        for(int i2 = k; i2 < k + i1; i2++) {
            for(int j2 = l; j2 < l + j1; j2++)
                kk[i][l1++] = gk[i2 + j2 * ak];

        }

    }

    public void dh(int i, int k, int l) {
        if(tk[l]) {
            i += pk[l];
            k += qk[l];
        }
        int i1 = i + k * ak;
        int j1 = 0;
        int k1 = ok[l];
        int l1 = nk[l];
        int i2 = ak - l1;
        int j2 = 0;
        if(k < vk) {
            int k2 = vk - k;
            k1 -= k2;
            k = vk;
            j1 += k2 * l1;
            i1 += k2 * ak;
        }
        if(k + k1 >= wk)
            k1 -= ((k + k1) - wk) + 1;
        if(i < xk) {
            int l2 = xk - i;
            l1 -= l2;
            i = xk;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if(i + l1 >= yk) {
            int i3 = ((i + l1) - yk) + 1;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if(l1 <= 0 || k1 <= 0)
            return;
        byte byte0 = 1;
        if(zk) {
            byte0 = 2;
            i2 += ak;
            j2 += nk[l];
            if((k & 1) != 0) {
                i1 += ak;
                k1--;
            }
        }
        if(kk[l] == null) {
            hg(gk, lk[l], mk[l], j1, i1, l1, k1, i2, j2, byte0);
            return;
        } else {
            mf(gk, kk[l], zj, j1, i1, l1, k1, i2, j2, byte0);
            return;
        }
    }

    public void tf(int i, int k, int l, int i1, int j1) {
        try {
            int k1 = nk[j1];
            int l1 = ok[j1];
            int i2 = 0;
            int j2 = 0;
            int k2 = (k1 << 16) / l;
            int l2 = (l1 << 16) / i1;
            if(tk[j1]) {
                int i3 = rk[j1];
                int k3 = sk[j1];
                k2 = (i3 << 16) / l;
                l2 = (k3 << 16) / i1;
                i += ((pk[j1] * l + i3) - 1) / i3;
                k += ((qk[j1] * i1 + k3) - 1) / k3;
                if((pk[j1] * l) % i3 != 0)
                    i2 = (i3 - (pk[j1] * l) % i3 << 16) / l;
                if((qk[j1] * i1) % k3 != 0)
                    j2 = (k3 - (qk[j1] * i1) % k3 << 16) / i1;
                l = (l * (nk[j1] - (i2 >> 16))) / i3;
                i1 = (i1 * (ok[j1] - (j2 >> 16))) / k3;
            }
            int j3 = i + k * ak;
            int l3 = ak - l;
            if(k < vk) {
                int i4 = vk - k;
                i1 -= i4;
                k = 0;
                j3 += i4 * ak;
                j2 += l2 * i4;
            }
            if(k + i1 >= wk)
                i1 -= ((k + i1) - wk) + 1;
            if(i < xk) {
                int j4 = xk - i;
                l -= j4;
                i = 0;
                j3 += j4;
                i2 += k2 * j4;
                l3 += j4;
            }
            if(i + l >= yk) {
                int k4 = ((i + l) - yk) + 1;
                l -= k4;
                l3 += k4;
            }
            byte byte0 = 1;
            if(zk) {
                byte0 = 2;
                l3 += ak;
                l2 += l2;
                if((k & 1) != 0) {
                    j3 += ak;
                    i1--;
                }
            }
            vf(gk, kk[j1], zj, i2, j2, j3, l3, l, i1, k2, l2, k1, byte0);
            return;
        }
        catch(Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void vg(int i, int k, int l, int i1) {
        if(tk[l]) {
            i += pk[l];
            k += qk[l];
        }
        int j1 = i + k * ak;
        int k1 = 0;
        int l1 = ok[l];
        int i2 = nk[l];
        int j2 = ak - i2;
        int k2 = 0;
        if(k < vk) {
            int l2 = vk - k;
            l1 -= l2;
            k = vk;
            k1 += l2 * i2;
            j1 += l2 * ak;
        }
        if(k + l1 >= wk)
            l1 -= ((k + l1) - wk) + 1;
        if(i < xk) {
            int i3 = xk - i;
            i2 -= i3;
            i = xk;
            k1 += i3;
            j1 += i3;
            k2 += i3;
            j2 += i3;
        }
        if(i + i2 >= yk) {
            int j3 = ((i + i2) - yk) + 1;
            i2 -= j3;
            k2 += j3;
            j2 += j3;
        }
        if(i2 <= 0 || l1 <= 0)
            return;
        byte byte0 = 1;
        if(zk) {
            byte0 = 2;
            j2 += ak;
            k2 += nk[l];
            if((k & 1) != 0) {
                j1 += ak;
                l1--;
            }
        }
        if(kk[l] == null) {
            hh(gk, lk[l], mk[l], k1, j1, i2, l1, j2, k2, byte0, i1);
            return;
        } else {
            kg(gk, kk[l], zj, k1, j1, i2, l1, j2, k2, byte0, i1);
            return;
        }
    }

    public void ug(int i, int k, int l, int i1, int j1, int k1) {
        try {
            int l1 = nk[j1];
            int i2 = ok[j1];
            int j2 = 0;
            int k2 = 0;
            int l2 = (l1 << 16) / l;
            int i3 = (i2 << 16) / i1;
            if(tk[j1]) {
                int j3 = rk[j1];
                int l3 = sk[j1];
                l2 = (j3 << 16) / l;
                i3 = (l3 << 16) / i1;
                i += ((pk[j1] * l + j3) - 1) / j3;
                k += ((qk[j1] * i1 + l3) - 1) / l3;
                if((pk[j1] * l) % j3 != 0)
                    j2 = (j3 - (pk[j1] * l) % j3 << 16) / l;
                if((qk[j1] * i1) % l3 != 0)
                    k2 = (l3 - (qk[j1] * i1) % l3 << 16) / i1;
                l = (l * (nk[j1] - (j2 >> 16))) / j3;
                i1 = (i1 * (ok[j1] - (k2 >> 16))) / l3;
            }
            int k3 = i + k * ak;
            int i4 = ak - l;
            if(k < vk) {
                int j4 = vk - k;
                i1 -= j4;
                k = 0;
                k3 += j4 * ak;
                k2 += i3 * j4;
            }
            if(k + i1 >= wk)
                i1 -= ((k + i1) - wk) + 1;
            if(i < xk) {
                int k4 = xk - i;
                l -= k4;
                i = 0;
                k3 += k4;
                j2 += l2 * k4;
                i4 += k4;
            }
            if(i + l >= yk) {
                int l4 = ((i + l) - yk) + 1;
                l -= l4;
                i4 += l4;
            }
            byte byte0 = 1;
            if(zk) {
                byte0 = 2;
                i4 += ak;
                i3 += i3;
                if((k & 1) != 0) {
                    k3 += ak;
                    i1--;
                }
            }
            cg(gk, kk[j1], zj, j2, k2, k3, i4, l, i1, l2, i3, l1, byte0, k1);
            return;
        }
        catch(Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    public void rg(int i, int k, int l, int i1, int j1, int k1) {
        try {
            int l1 = nk[j1];
            int i2 = ok[j1];
            int j2 = 0;
            int k2 = 0;
            int l2 = (l1 << 16) / l;
            int i3 = (i2 << 16) / i1;
            if(tk[j1]) {
                int j3 = rk[j1];
                int l3 = sk[j1];
                l2 = (j3 << 16) / l;
                i3 = (l3 << 16) / i1;
                i += ((pk[j1] * l + j3) - 1) / j3;
                k += ((qk[j1] * i1 + l3) - 1) / l3;
                if((pk[j1] * l) % j3 != 0)
                    j2 = (j3 - (pk[j1] * l) % j3 << 16) / l;
                if((qk[j1] * i1) % l3 != 0)
                    k2 = (l3 - (qk[j1] * i1) % l3 << 16) / i1;
                l = (l * (nk[j1] - (j2 >> 16))) / j3;
                i1 = (i1 * (ok[j1] - (k2 >> 16))) / l3;
            }
            int k3 = i + k * ak;
            int i4 = ak - l;
            if(k < vk) {
                int j4 = vk - k;
                i1 -= j4;
                k = 0;
                k3 += j4 * ak;
                k2 += i3 * j4;
            }
            if(k + i1 >= wk)
                i1 -= ((k + i1) - wk) + 1;
            if(i < xk) {
                int k4 = xk - i;
                l -= k4;
                i = 0;
                k3 += k4;
                j2 += l2 * k4;
                i4 += k4;
            }
            if(i + l >= yk) {
                int l4 = ((i + l) - yk) + 1;
                l -= l4;
                i4 += l4;
            }
            byte byte0 = 1;
            if(zk) {
                byte0 = 2;
                i4 += ak;
                i3 += i3;
                if((k & 1) != 0) {
                    k3 += ak;
                    i1--;
                }
            }
            jh(gk, kk[j1], zj, j2, k2, k3, i4, l, i1, l2, i3, l1, byte0, k1);
            return;
        }
        catch(Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    private void mf(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2) {
        int j2 = -(i1 >> 2);
        i1 = -(i1 & 3);
        for(int k2 = -j1; k2 < 0; k2 += i2) {
            for(int l2 = j2; l2 < 0; l2++) {
                i = ai1[k++];
                if(i != 0)
                    ai[l++] = i;
                else
                    l++;
                i = ai1[k++];
                if(i != 0)
                    ai[l++] = i;
                else
                    l++;
                i = ai1[k++];
                if(i != 0)
                    ai[l++] = i;
                else
                    l++;
                i = ai1[k++];
                if(i != 0)
                    ai[l++] = i;
                else
                    l++;
            }

            for(int i3 = i1; i3 < 0; i3++) {
                i = ai1[k++];
                if(i != 0)
                    ai[l++] = i;
                else
                    l++;
            }

            l += k1;
            k += l1;
        }

    }

    private void hg(int ai[], byte abyte0[], int ai1[], int i, int k, int l, int i1, 
            int j1, int k1, int l1) {
        int i2 = -(l >> 2);
        l = -(l & 3);
        for(int j2 = -i1; j2 < 0; j2 += l1) {
            for(int k2 = i2; k2 < 0; k2++) {
                byte byte0 = abyte0[i++];
                if(byte0 != 0)
                    ai[k++] = ai1[byte0 & 0xff];
                else
                    k++;
                byte0 = abyte0[i++];
                if(byte0 != 0)
                    ai[k++] = ai1[byte0 & 0xff];
                else
                    k++;
                byte0 = abyte0[i++];
                if(byte0 != 0)
                    ai[k++] = ai1[byte0 & 0xff];
                else
                    k++;
                byte0 = abyte0[i++];
                if(byte0 != 0)
                    ai[k++] = ai1[byte0 & 0xff];
                else
                    k++;
            }

            for(int l2 = l; l2 < 0; l2++) {
                byte byte1 = abyte0[i++];
                if(byte1 != 0)
                    ai[k++] = ai1[byte1 & 0xff];
                else
                    k++;
            }

            k += j1;
            i += k1;
        }

    }

    private void vf(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2, int k2, int l2) {
        try {
            int i3 = k;
            for(int j3 = -l1; j3 < 0; j3 += l2) {
                int k3 = (l >> 16) * k2;
                for(int l3 = -k1; l3 < 0; l3++) {
                    i = ai1[(k >> 16) + k3];
                    if(i != 0)
                        ai[i1++] = i;
                    else
                        i1++;
                    k += i2;
                }

                l += j2;
                k = i3;
                i1 += j1;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in plot_scale");
        }
    }

    private void kg(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2) {
        int k2 = 256 - j2;
        for(int l2 = -j1; l2 < 0; l2 += i2) {
            for(int i3 = -i1; i3 < 0; i3++) {
                i = ai1[k++];
                if(i != 0) {
                    int j3 = ai[l];
                    ai[l++] = ((i & 0xff00ff) * j2 + (j3 & 0xff00ff) * k2 & 0xff00ff00) + ((i & 0xff00) * j2 + (j3 & 0xff00) * k2 & 0xff0000) >> 8;
                } else {
                    l++;
                }
            }

            l += k1;
            k += l1;
        }

    }

    private void hh(int ai[], byte abyte0[], int ai1[], int i, int k, int l, int i1, 
            int j1, int k1, int l1, int i2) {
        int j2 = 256 - i2;
        for(int k2 = -i1; k2 < 0; k2 += l1) {
            for(int l2 = -l; l2 < 0; l2++) {
                int i3 = abyte0[i++];
                if(i3 != 0) {
                    i3 = ai1[i3 & 0xff];
                    int j3 = ai[k];
                    ai[k++] = ((i3 & 0xff00ff) * i2 + (j3 & 0xff00ff) * j2 & 0xff00ff00) + ((i3 & 0xff00) * i2 + (j3 & 0xff00) * j2 & 0xff0000) >> 8;
                } else {
                    k++;
                }
            }

            k += j1;
            i += k1;
        }

    }

    private void cg(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
        int j3 = 256 - i3;
        try {
            int k3 = k;
            for(int l3 = -l1; l3 < 0; l3 += l2) {
                int i4 = (l >> 16) * k2;
                for(int j4 = -k1; j4 < 0; j4++) {
                    i = ai1[(k >> 16) + i4];
                    if(i != 0) {
                        int k4 = ai[i1];
                        ai[i1++] = ((i & 0xff00ff) * i3 + (k4 & 0xff00ff) * j3 & 0xff00ff00) + ((i & 0xff00) * i3 + (k4 & 0xff00) * j3 & 0xff0000) >> 8;
                    } else {
                        i1++;
                    }
                    k += i2;
                }

                l += j2;
                k = k3;
                i1 += j1;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in tran_scale");
        }
    }

    private void jh(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
        int j3 = i3 >> 16 & 0xff;
        int k3 = i3 >> 8 & 0xff;
        int l3 = i3 & 0xff;
        try {
            int i4 = k;
            for(int j4 = -l1; j4 < 0; j4 += l2) {
                int k4 = (l >> 16) * k2;
                for(int l4 = -k1; l4 < 0; l4++) {
                    i = ai1[(k >> 16) + k4];
                    if(i != 0) {
                        int i5 = i >> 16 & 0xff;
                        int j5 = i >> 8 & 0xff;
                        int k5 = i & 0xff;
                        if(i5 == j5 && j5 == k5)
                            ai[i1++] = ((i5 * j3 >> 8) << 16) + ((j5 * k3 >> 8) << 8) + (k5 * l3 >> 8);
                        else
                            ai[i1++] = i;
                    } else {
                        i1++;
                    }
                    k += i2;
                }

                l += j2;
                k = i4;
                i1 += j1;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in plot_scale");
        }
    }

    public void uf(int i, int k, int l, int i1, int j1) {
        int k1 = ak;
        int l1 = bk;
        if(el == null) {
            el = new int[512];
            for(int i2 = 0; i2 < 256; i2++) {
                el[i2] = (int)(Math.sin((double)i2 * 0.02454369D) * 32768D);
                el[i2 + 256] = (int)(Math.cos((double)i2 * 0.02454369D) * 32768D);
            }

        }
        int j2 = -rk[l] / 2;
        int k2 = -sk[l] / 2;
        if(tk[l]) {
            j2 += pk[l];
            k2 += qk[l];
        }
        int l2 = j2 + nk[l];
        int i3 = k2 + ok[l];
        int j3 = l2;
        int k3 = k2;
        int l3 = j2;
        int i4 = i3;
        i1 &= 0xff;
        int j4 = el[i1] * j1;
        int k4 = el[i1 + 256] * j1;
        int l4 = i + (k2 * j4 + j2 * k4 >> 22);
        int i5 = k + (k2 * k4 - j2 * j4 >> 22);
        int j5 = i + (k3 * j4 + j3 * k4 >> 22);
        int k5 = k + (k3 * k4 - j3 * j4 >> 22);
        int l5 = i + (i3 * j4 + l2 * k4 >> 22);
        int i6 = k + (i3 * k4 - l2 * j4 >> 22);
        int j6 = i + (i4 * j4 + l3 * k4 >> 22);
        int k6 = k + (i4 * k4 - l3 * j4 >> 22);
        int l6 = i5;
        int i7 = i5;
        if(k5 < l6)
            l6 = k5;
        else
        if(k5 > i7)
            i7 = k5;
        if(i6 < l6)
            l6 = i6;
        else
        if(i6 > i7)
            i7 = i6;
        if(k6 < l6)
            l6 = k6;
        else
        if(k6 > i7)
            i7 = k6;
        if(l6 < vk)
            l6 = vk;
        if(i7 > wk)
            i7 = wk;
        if(fl == null || fl.length != l1 + 1) {
            fl = new int[l1 + 1];
            gl = new int[l1 + 1];
            hl = new int[l1 + 1];
            il = new int[l1 + 1];
            jl = new int[l1 + 1];
            kl = new int[l1 + 1];
        }
        for(int j7 = l6; j7 <= i7; j7++) {
            fl[j7] = 0x5f5e0ff;
            gl[j7] = 0xfa0a1f01;
        }

        int j8 = 0;
        int l8 = 0;
        int j9 = 0;
        int k9 = nk[l];
        int l9 = ok[l];
        j2 = 0;
        k2 = 0;
        j3 = k9 - 1;
        k3 = 0;
        l2 = k9 - 1;
        i3 = l9 - 1;
        l3 = 0;
        i4 = l9 - 1;
        if(k6 != i5) {
            j8 = (j6 - l4 << 8) / (k6 - i5);
            j9 = (i4 - k2 << 8) / (k6 - i5);
        }
        int k7;
        int l7;
        int i8;
        int i9;
        if(i5 > k6) {
            i8 = j6 << 8;
            i9 = i4 << 8;
            k7 = k6;
            l7 = i5;
        } else {
            i8 = l4 << 8;
            i9 = k2 << 8;
            k7 = i5;
            l7 = k6;
        }
        if(k7 < 0) {
            i8 -= j8 * k7;
            i9 -= j9 * k7;
            k7 = 0;
        }
        if(l7 > l1 - 1)
            l7 = l1 - 1;
        for(int i10 = k7; i10 <= l7; i10++) {
            fl[i10] = gl[i10] = i8;
            i8 += j8;
            hl[i10] = il[i10] = 0;
            jl[i10] = kl[i10] = i9;
            i9 += j9;
        }

        if(k5 != i5) {
            j8 = (j5 - l4 << 8) / (k5 - i5);
            l8 = (j3 - j2 << 8) / (k5 - i5);
        }
        int k8;
        if(i5 > k5) {
            i8 = j5 << 8;
            k8 = j3 << 8;
            k7 = k5;
            l7 = i5;
        } else {
            i8 = l4 << 8;
            k8 = j2 << 8;
            k7 = i5;
            l7 = k5;
        }
        if(k7 < 0) {
            i8 -= j8 * k7;
            k8 -= l8 * k7;
            k7 = 0;
        }
        if(l7 > l1 - 1)
            l7 = l1 - 1;
        for(int j10 = k7; j10 <= l7; j10++) {
            if(i8 < fl[j10]) {
                fl[j10] = i8;
                hl[j10] = k8;
                jl[j10] = 0;
            }
            if(i8 > gl[j10]) {
                gl[j10] = i8;
                il[j10] = k8;
                kl[j10] = 0;
            }
            i8 += j8;
            k8 += l8;
        }

        if(i6 != k5) {
            j8 = (l5 - j5 << 8) / (i6 - k5);
            j9 = (i3 - k3 << 8) / (i6 - k5);
        }
        if(k5 > i6) {
            i8 = l5 << 8;
            k8 = l2 << 8;
            i9 = i3 << 8;
            k7 = i6;
            l7 = k5;
        } else {
            i8 = j5 << 8;
            k8 = j3 << 8;
            i9 = k3 << 8;
            k7 = k5;
            l7 = i6;
        }
        if(k7 < 0) {
            i8 -= j8 * k7;
            i9 -= j9 * k7;
            k7 = 0;
        }
        if(l7 > l1 - 1)
            l7 = l1 - 1;
        for(int k10 = k7; k10 <= l7; k10++) {
            if(i8 < fl[k10]) {
                fl[k10] = i8;
                hl[k10] = k8;
                jl[k10] = i9;
            }
            if(i8 > gl[k10]) {
                gl[k10] = i8;
                il[k10] = k8;
                kl[k10] = i9;
            }
            i8 += j8;
            i9 += j9;
        }

        if(k6 != i6) {
            j8 = (j6 - l5 << 8) / (k6 - i6);
            l8 = (l3 - l2 << 8) / (k6 - i6);
        }
        if(i6 > k6) {
            i8 = j6 << 8;
            k8 = l3 << 8;
            i9 = i4 << 8;
            k7 = k6;
            l7 = i6;
        } else {
            i8 = l5 << 8;
            k8 = l2 << 8;
            i9 = i3 << 8;
            k7 = i6;
            l7 = k6;
        }
        if(k7 < 0) {
            i8 -= j8 * k7;
            k8 -= l8 * k7;
            k7 = 0;
        }
        if(l7 > l1 - 1)
            l7 = l1 - 1;
        for(int l10 = k7; l10 <= l7; l10++) {
            if(i8 < fl[l10]) {
                fl[l10] = i8;
                hl[l10] = k8;
                jl[l10] = i9;
            }
            if(i8 > gl[l10]) {
                gl[l10] = i8;
                il[l10] = k8;
                kl[l10] = i9;
            }
            i8 += j8;
            k8 += l8;
        }

        int i11 = l6 * k1;
        int ai[] = kk[l];
        for(int j11 = l6; j11 < i7; j11++) {
            int k11 = fl[j11] >> 8;
            int l11 = gl[j11] >> 8;
            if(l11 - k11 <= 0) {
                i11 += k1;
            } else {
                int i12 = hl[j11] << 9;
                int j12 = ((il[j11] << 9) - i12) / (l11 - k11);
                int k12 = jl[j11] << 9;
                int l12 = ((kl[j11] << 9) - k12) / (l11 - k11);
                if(k11 < xk) {
                    i12 += (xk - k11) * j12;
                    k12 += (xk - k11) * l12;
                    k11 = xk;
                }
                if(l11 > yk)
                    l11 = yk;
                if(!zk || (j11 & 1) == 0)
                    if(!tk[l])
                        fg(gk, ai, zj, i11 + k11, i12, k12, j12, l12, k11 - l11, k9);
                    else
                        jg(gk, ai, zj, i11 + k11, i12, k12, j12, l12, k11 - l11, k9);
                i11 += k1;
            }
        }

    }

    private void fg(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2) {
        for(i = l1; i < 0; i++) {
            gk[k++] = ai1[(l >> 17) + (i1 >> 17) * i2];
            l += j1;
            i1 += k1;
        }

    }

    private void jg(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2) {
        for(int j2 = l1; j2 < 0; j2++) {
            i = ai1[(l >> 17) + (i1 >> 17) * i2];
            if(i != 0)
                gk[k++] = i;
            else
                k++;
            l += j1;
            i1 += k1;
        }

    }

    public void ig(int i, int k, int l, int i1, int j1, int k1, int l1) {
        tf(i, k, l, i1, j1);
    }

    public void bg(int i, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, boolean flag) {
        try {
            if(k1 == 0)
                k1 = 0xffffff;
            if(l1 == 0)
                l1 = 0xffffff;
            int j2 = nk[j1];
            int k2 = ok[j1];
            int l2 = 0;
            int i3 = 0;
            int j3 = i2 << 16;
            int k3 = (j2 << 16) / l;
            int l3 = (k2 << 16) / i1;
            int i4 = -(i2 << 16) / i1;
            if(tk[j1]) {
                int j4 = rk[j1];
                int l4 = sk[j1];
                k3 = (j4 << 16) / l;
                l3 = (l4 << 16) / i1;
                int k5 = pk[j1];
                int l5 = qk[j1];
                if(flag)
                    k5 = j4 - nk[j1] - k5;
                i += ((k5 * l + j4) - 1) / j4;
                int i6 = ((l5 * i1 + l4) - 1) / l4;
                k += i6;
                j3 += i6 * i4;
                if((k5 * l) % j4 != 0)
                    l2 = (j4 - (k5 * l) % j4 << 16) / l;
                if((l5 * i1) % l4 != 0)
                    i3 = (l4 - (l5 * i1) % l4 << 16) / i1;
                l = ((((nk[j1] << 16) - l2) + k3) - 1) / k3;
                i1 = ((((ok[j1] << 16) - i3) + l3) - 1) / l3;
            }
            int k4 = k * ak;
            j3 += i << 16;
            if(k < vk) {
                int i5 = vk - k;
                i1 -= i5;
                k = vk;
                k4 += i5 * ak;
                i3 += l3 * i5;
                j3 += i4 * i5;
            }
            if(k + i1 >= wk)
                i1 -= ((k + i1) - wk) + 1;
            int j5 = k4 / ak & 1;
            if(!zk)
                j5 = 2;
            if(l1 == 0xffffff) {
                if(kk[j1] != null)
                    if(!flag) {
                        ih(gk, kk[j1], zj, l2, i3, k4, l, i1, k3, l3, j2, k1, j3, i4, j5);
                        return;
                    } else {
                        ih(gk, kk[j1], zj, (nk[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, j3, i4, j5);
                        return;
                    }
                if(!flag) {
                    of(gk, lk[j1], mk[j1], zj, l2, i3, k4, l, i1, k3, l3, j2, k1, j3, i4, j5);
                    return;
                } else {
                    of(gk, lk[j1], mk[j1], zj, (nk[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, j3, i4, j5);
                    return;
                }
            }
            if(kk[j1] != null)
                if(!flag) {
                    gg(gk, kk[j1], zj, l2, i3, k4, l, i1, k3, l3, j2, k1, l1, j3, i4, j5);
                    return;
                } else {
                    gg(gk, kk[j1], zj, (nk[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, l1, j3, i4, j5);
                    return;
                }
            if(!flag) {
                gh(gk, lk[j1], mk[j1], zj, l2, i3, k4, l, i1, k3, l3, j2, k1, l1, j3, i4, j5);
                return;
            } else {
                gh(gk, lk[j1], mk[j1], zj, (nk[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, l1, j3, i4, j5);
                return;
            }
        }
        catch(Exception _ex) {
            System.out.println("error in sprite clipping routine");
        }
    }

    private void ih(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2, int k2, int l2, int i3, 
            int j3) {
        int j4 = k2 >> 16 & 0xff;
        int k4 = k2 >> 8 & 0xff;
        int l4 = k2 & 0xff;
        try {
            int i5 = k;
            for(int j5 = -k1; j5 < 0; j5++) {
                int k5 = (l >> 16) * j2;
                int l5 = l2 >> 16;
                int i6 = j1;
                if(l5 < xk) {
                    int j6 = xk - l5;
                    i6 -= j6;
                    l5 = xk;
                    k += l1 * j6;
                }
                if(l5 + i6 >= yk) {
                    int k6 = (l5 + i6) - yk;
                    i6 -= k6;
                }
                j3 = 1 - j3;
                if(j3 != 0) {
                    for(int l6 = l5; l6 < l5 + i6; l6++) {
                        i = ai1[(k >> 16) + k5];
                        if(i != 0) {
                            int k3 = i >> 16 & 0xff;
                            int l3 = i >> 8 & 0xff;
                            int i4 = i & 0xff;
                            if(k3 == l3 && l3 == i4)
                                ai[l6 + i1] = ((k3 * j4 >> 8) << 16) + ((l3 * k4 >> 8) << 8) + (i4 * l4 >> 8);
                            else
                                ai[l6 + i1] = i;
                        }
                        k += l1;
                    }

                }
                l += i2;
                k = i5;
                i1 += ak;
                l2 += i3;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void gg(int ai[], int ai1[], int i, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2, int k2, int l2, int i3, 
            int j3, int k3) {
        int k4 = k2 >> 16 & 0xff;
        int l4 = k2 >> 8 & 0xff;
        int i5 = k2 & 0xff;
        int j5 = l2 >> 16 & 0xff;
        int k5 = l2 >> 8 & 0xff;
        int l5 = l2 & 0xff;
        try {
            int i6 = k;
            for(int j6 = -k1; j6 < 0; j6++) {
                int k6 = (l >> 16) * j2;
                int l6 = i3 >> 16;
                int i7 = j1;
                if(l6 < xk) {
                    int j7 = xk - l6;
                    i7 -= j7;
                    l6 = xk;
                    k += l1 * j7;
                }
                if(l6 + i7 >= yk) {
                    int k7 = (l6 + i7) - yk;
                    i7 -= k7;
                }
                k3 = 1 - k3;
                if(k3 != 0) {
                    for(int l7 = l6; l7 < l6 + i7; l7++) {
                        i = ai1[(k >> 16) + k6];
                        if(i != 0) {
                            int l3 = i >> 16 & 0xff;
                            int i4 = i >> 8 & 0xff;
                            int j4 = i & 0xff;
                            if(l3 == i4 && i4 == j4)
                                ai[l7 + i1] = ((l3 * k4 >> 8) << 16) + ((i4 * l4 >> 8) << 8) + (j4 * i5 >> 8);
                            else
                            if(l3 == 255 && i4 == j4)
                                ai[l7 + i1] = ((l3 * j5 >> 8) << 16) + ((i4 * k5 >> 8) << 8) + (j4 * l5 >> 8);
                            else
                                ai[l7 + i1] = i;
                        }
                        k += l1;
                    }

                }
                l += i2;
                k = i6;
                i1 += ak;
                i3 += j3;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void of(int ai[], byte abyte0[], int ai1[], int i, int k, int l, int i1, 
            int j1, int k1, int l1, int i2, int j2, int k2, int l2, 
            int i3, int j3) {
        int j4 = k2 >> 16 & 0xff;
        int k4 = k2 >> 8 & 0xff;
        int l4 = k2 & 0xff;
        try {
            int i5 = k;
            for(int j5 = -k1; j5 < 0; j5++) {
                int k5 = (l >> 16) * j2;
                int l5 = l2 >> 16;
                int i6 = j1;
                if(l5 < xk) {
                    int j6 = xk - l5;
                    i6 -= j6;
                    l5 = xk;
                    k += l1 * j6;
                }
                if(l5 + i6 >= yk) {
                    int k6 = (l5 + i6) - yk;
                    i6 -= k6;
                }
                j3 = 1 - j3;
                if(j3 != 0) {
                    for(int l6 = l5; l6 < l5 + i6; l6++) {
                        i = abyte0[(k >> 16) + k5] & 0xff;
                        if(i != 0) {
                            i = ai1[i];
                            int k3 = i >> 16 & 0xff;
                            int l3 = i >> 8 & 0xff;
                            int i4 = i & 0xff;
                            if(k3 == l3 && l3 == i4)
                                ai[l6 + i1] = ((k3 * j4 >> 8) << 16) + ((l3 * k4 >> 8) << 8) + (i4 * l4 >> 8);
                            else
                                ai[l6 + i1] = i;
                        }
                        k += l1;
                    }

                }
                l += i2;
                k = i5;
                i1 += ak;
                l2 += i3;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    private void gh(int ai[], byte abyte0[], int ai1[], int i, int k, int l, int i1, 
            int j1, int k1, int l1, int i2, int j2, int k2, int l2, 
            int i3, int j3, int k3) {
        int k4 = k2 >> 16 & 0xff;
        int l4 = k2 >> 8 & 0xff;
        int i5 = k2 & 0xff;
        int j5 = l2 >> 16 & 0xff;
        int k5 = l2 >> 8 & 0xff;
        int l5 = l2 & 0xff;
        try {
            int i6 = k;
            for(int j6 = -k1; j6 < 0; j6++) {
                int k6 = (l >> 16) * j2;
                int l6 = i3 >> 16;
                int i7 = j1;
                if(l6 < xk) {
                    int j7 = xk - l6;
                    i7 -= j7;
                    l6 = xk;
                    k += l1 * j7;
                }
                if(l6 + i7 >= yk) {
                    int k7 = (l6 + i7) - yk;
                    i7 -= k7;
                }
                k3 = 1 - k3;
                if(k3 != 0) {
                    for(int l7 = l6; l7 < l6 + i7; l7++) {
                        i = abyte0[(k >> 16) + k6] & 0xff;
                        if(i != 0) {
                            i = ai1[i];
                            int l3 = i >> 16 & 0xff;
                            int i4 = i >> 8 & 0xff;
                            int j4 = i & 0xff;
                            if(l3 == i4 && i4 == j4)
                                ai[l7 + i1] = ((l3 * k4 >> 8) << 16) + ((i4 * l4 >> 8) << 8) + (j4 * i5 >> 8);
                            else
                            if(l3 == 255 && i4 == j4)
                                ai[l7 + i1] = ((l3 * j5 >> 8) << 16) + ((i4 * k5 >> 8) << 8) + (j4 * l5 >> 8);
                            else
                                ai[l7 + i1] = i;
                        }
                        k += l1;
                    }

                }
                l += i2;
                k = i6;
                i1 += ak;
                i3 += j3;
            }

            return;
        }
        catch(Exception _ex) {
            System.out.println("error in transparent sprite plot routine");
        }
    }

    public static int kf(byte abyte0[]) {
        al[cl] = abyte0;
        return cl++;
    }

    public void eh(String s, int i, int k, int l, int i1) {
        sf(s, i - jf(s, l), k, l, i1);
    }

    public void zg(String s, int i, int k, int l, int i1) {
        sf(s, i - jf(s, l) / 2, k, l, i1);
    }

    public void fh(String s, int i, int k, int l, int i1, int j1) {
        int k1 = 0;
        byte abyte0[] = al[l];
        int l1 = 0;
        int i2 = 0;
        for(int j2 = 0; j2 < s.length(); j2++) {
            if(s.charAt(j2) == '@' && j2 + 4 < s.length() && s.charAt(j2 + 4) == '@')
                j2 += 4;
            else
            if(s.charAt(j2) == '~' && j2 + 4 < s.length() && s.charAt(j2 + 4) == '~')
                j2 += 4;
            else
                k1 += abyte0[bl[s.charAt(j2)] + 7];
            if(s.charAt(j2) == ' ')
                i2 = j2;
            if(k1 > j1) {
                if(i2 <= l1)
                    i2 = j2;
                zg(s.substring(l1, i2), i, k, l, i1);
                k1 = 0;
                l1 = j2 = i2 + 1;
                k += sg(l);
            }
        }

        if(k1 > 0)
            zg(s.substring(l1), i, k, l, i1);
    }

    public void sf(String s, int i, int k, int l, int i1) {
        byte abyte0[] = al[l];
        for(int j1 = 0; j1 < s.length(); j1++)
            if(s.charAt(j1) == '@' && j1 + 4 < s.length() && s.charAt(j1 + 4) == '@') {
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("red"))
                    i1 = 0xff0000;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("lre"))
                    i1 = 0xff9040;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("yel"))
                    i1 = 0xffff00;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gre"))
                    i1 = 65280;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("blu"))
                    i1 = 255;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("cya"))
                    i1 = 65535;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("mag"))
                    i1 = 0xff00ff;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("whi"))
                    i1 = 0xffffff;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("bla"))
                    i1 = 0;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("dre"))
                    i1 = 0xc00000;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("ora"))
                    i1 = 0xff9040;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("ran"))
                    i1 = (int)(Math.random() * 16777215D);
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("or1"))
                    i1 = 0xffb000;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("or2"))
                    i1 = 0xff7000;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("or3"))
                    i1 = 0xff3000;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gr1"))
                    i1 = 0xc0ff00;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gr2"))
                    i1 = 0x80ff00;
                else
                if(s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gr3"))
                    i1 = 0x40ff00;
                j1 += 4;
            } else
            if(s.charAt(j1) == '~' && j1 + 4 < s.length() && s.charAt(j1 + 4) == '~') {
                char c = s.charAt(j1 + 1);
                char c1 = s.charAt(j1 + 2);
                char c2 = s.charAt(j1 + 3);
                if(c >= '0' && c <= '9' && c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9')
                    i = Integer.parseInt(s.substring(j1 + 1, j1 + 4));
                j1 += 4;
            } else {
                int k1 = bl[s.charAt(j1)];
                if(dl && i1 != 0)
                    yg(k1, i + 1, k, 0, abyte0);
                if(dl && i1 != 0)
                    yg(k1, i, k + 1, 0, abyte0);
                yg(k1, i, k, i1, abyte0);
                i += abyte0[k1 + 7];
            }

    }

    private void yg(int i, int k, int l, int i1, byte abyte0[]) {
        int j1 = k + abyte0[i + 5];
        int k1 = l - abyte0[i + 6];
        int l1 = abyte0[i + 3];
        int i2 = abyte0[i + 4];
        int j2 = abyte0[i] * 16384 + abyte0[i + 1] * 128 + abyte0[i + 2];
        int k2 = j1 + k1 * ak;
        int l2 = ak - l1;
        int i3 = 0;
        if(k1 < vk) {
            int j3 = vk - k1;
            i2 -= j3;
            k1 = vk;
            j2 += j3 * l1;
            k2 += j3 * ak;
        }
        if(k1 + i2 >= wk)
            i2 -= ((k1 + i2) - wk) + 1;
        if(j1 < xk) {
            int k3 = xk - j1;
            l1 -= k3;
            j1 = xk;
            j2 += k3;
            k2 += k3;
            i3 += k3;
            l2 += k3;
        }
        if(j1 + l1 >= yk) {
            int l3 = ((j1 + l1) - yk) + 1;
            l1 -= l3;
            i3 += l3;
            l2 += l3;
        }
        if(l1 > 0 && i2 > 0)
            _mthif(gk, abyte0, i1, j2, k2, l1, i2, l2, i3);
    }

    private void _mthif(int ai[], byte abyte0[], int i, int k, int l, int i1, int j1, 
            int k1, int l1) {
        int i2 = -(i1 >> 2);
        i1 = -(i1 & 3);
        for(int j2 = -j1; j2 < 0; j2++) {
            for(int k2 = i2; k2 < 0; k2++) {
                if(abyte0[k++] != 0)
                    ai[l++] = i;
                else
                    l++;
                if(abyte0[k++] != 0)
                    ai[l++] = i;
                else
                    l++;
                if(abyte0[k++] != 0)
                    ai[l++] = i;
                else
                    l++;
                if(abyte0[k++] != 0)
                    ai[l++] = i;
                else
                    l++;
            }

            for(int l2 = i1; l2 < 0; l2++)
                if(abyte0[k++] != 0)
                    ai[l++] = i;
                else
                    l++;

            l += k1;
            k += l1;
        }

    }

    public int sg(int i) {
        if(i == 0)
            return al[i][8] - 2;
        else
            return al[i][8] - 1;
    }

    public int jf(String s, int i) {
        int k = 0;
        byte abyte0[] = al[i];
        for(int l = 0; l < s.length(); l++)
            if(s.charAt(l) == '@' && l + 4 < s.length() && s.charAt(l + 4) == '@')
                l += 4;
            else
            if(s.charAt(l) == '~' && l + 4 < s.length() && s.charAt(l + 4) == '~')
                l += 4;
            else
                k += abyte0[bl[s.charAt(l)] + 7];

        return k;
    }

    public boolean imageUpdate(Image image, int i, int k, int l, int i1, int j1) {
        return true;
    }

    int zj;
    public int ak;
    public int bk;
    public int ck;
    public int dk;
    public int ek;
    ColorModel fk;
    public int gk[];
    ImageConsumer hk;
    private Component ik;
    public Image jk;
    private int kk[][];
    private byte lk[][];
    private int mk[][];
    public int nk[];
    public int ok[];
    public int pk[];
    public int qk[];
    public int rk[];
    public int sk[];
    public boolean tk[];
    private boolean uk;
    private int vk;
    private int wk;
    private int xk;
    private int yk;
    public boolean zk;
    static byte al[][] = new byte[50][];
    static int bl[];
    static int cl;
    public boolean dl;
    int el[];
    int fl[];
    int gl[];
    int hl[];
    int il[];
    int jl[];
    int kl[];
    public static final int ll = 0;
    public static final int ml = 0xffffff;
    public static final int nl = 0xff0000;
    public static final int ol = 0xc00000;
    public static final int pl = 65280;
    public static final int ql = 255;
    public static final int rl = 0xffff00;
    public static final int sl = 65535;
    public static final int tl = 0xff00ff;
    public static final int ul = 0xc0c0c0;
    public static final int vl = 0x808080;
    public static final int wl = 0x404040;
    public static final int xl = 0;
    public static final int yl = 1;
    public static final int zl = 2;
    public static final int am = 3;
    public static final int bm = 4;
    public static final int cm = 5;
    public static final int dm = 6;
    public static final int em = 7;

    static  {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        bl = new int[256];
        for(int i = 0; i < 256; i++) {
            int k = s.indexOf(i);
            if(k == -1)
                k = 74;
            bl[i] = k * 9;
        }

    }
}
