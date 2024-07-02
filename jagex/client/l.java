// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import jagex.o;
import jagex.p;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.*;

// Referenced classes of package jagex.client:
//            d, j

public class l extends Applet
    implements Runnable {

    public void kj() {
    }

    public synchronized void qj() {
    }

    public void xj() {
    }

    public synchronized void wj() {
    }

    public void fk() {
    }

    public final void gj(int i, int k, String s, boolean flag) {
        xp = false;
        System.out.println("Started application");
        qp = i;
        rp = k;
        wp = new d(this, i, k, s, flag, false);
        cq = 1;
        sp = new Thread(this);
        sp.start();
        sp.setPriority(1);
    }

    public final boolean dk() {
        return xp;
    }

    public final void sj(int i, int k, String s, boolean flag) {
        if(wp != null) {
            return;
        } else {
            qp = i;
            rp = k;
            wp = new d(this, i, k, s, flag, xp);
            return;
        }
    }

    public final void hj(int i, int k) {
        if(wp == null) {
            return;
        } else {
            wp.resize(i, k);
            qp = i;
            rp = k;
            return;
        }
    }

    public final void jj(Image image) {
        if(wp == null) {
            return;
        } else {
            wp.setIconImage(image);
            return;
        }
    }

    public void zj(int i, int k) {
        hj(i, k);
    }

    public final Graphics getGraphics() {
        if(wp == null)
            return super.getGraphics();
        else
            return wp.getGraphics();
    }

    public final int rj() {
        return qp;
    }

    public final int bk() {
        return rp;
    }

    public final Image createImage(int i, int k) {
        if(wp == null)
            return super.createImage(i, k);
        else
            return wp.createImage(i, k);
    }

    public Frame vj() {
        return wp;
    }

    public final void yj(int i) {
        tp = 1000 / i;
    }

    public final void ak(int i) {
        up = i;
    }

    public final void ck() {
        for(int i = 0; i < 10; i++)
            vp[i] = 0L;

    }

    public synchronized boolean keyDown(Event event, int i) {
        ek(i);
        zq = i;
        ar = i;
        bq = 0;
        if(i == 1006)
            oq = true;
        if(i == 1007)
            pq = true;
        if(i == 1004)
            qq = true;
        if(i == 1005)
            rq = true;
        if((char)i == ' ')
            sq = true;
        if((char)i == 'n' || (char)i == 'm')
            tq = true;
        if((char)i == 'N' || (char)i == 'M')
            tq = true;
        if((char)i == '{')
            mq = true;
        if((char)i == '}')
            nq = true;
        if((char)i == '\u03F0')
            br = !br;
        if((i >= 97 && i <= 122 || i >= 65 && i <= 90 || i >= 48 && i <= 57 || i == 32) && cr.length() < 20)
            cr += (char)i;
        if(i >= 32 && i <= 122 && er.length() < 80)
            er += (char)i;
        if(i == 8 && cr.length() > 0)
            cr = cr.substring(0, cr.length() - 1);
        if(i == 8 && er.length() > 0)
            er = er.substring(0, er.length() - 1);
        if(i == 10 || i == 13) {
            dr = cr;
            fr = er;
        }
        return true;
    }

    public void ek(int i) {
    }

    public synchronized boolean keyUp(Event event, int i) {
        zq = 0;
        if(i == 1006)
            oq = false;
        if(i == 1007)
            pq = false;
        if(i == 1004)
            qq = false;
        if(i == 1005)
            rq = false;
        if((char)i == ' ')
            sq = false;
        if((char)i == 'n' || (char)i == 'm')
            tq = false;
        if((char)i == 'N' || (char)i == 'M')
            tq = false;
        if((char)i == '{')
            mq = false;
        if((char)i == '}')
            nq = false;
        return true;
    }

    public synchronized boolean mouseMove(Event event, int i, int k) {
        vq = i;
        wq = k + aq;
        xq = 0;
        bq = 0;
        return true;
    }

    public synchronized boolean mouseUp(Event event, int i, int k) {
        vq = i;
        wq = k + aq;
        xq = 0;
        return true;
    }

    public synchronized boolean mouseDown(Event event, int i, int k) {
        vq = i;
        wq = k + aq;
        if(event.metaDown())
            xq = 2;
        else
            xq = 1;
        yq = xq;
        bq = 0;
        pj(xq, i, k);
        return true;
    }

    public void pj(int i, int k, int i1) {
    }

    public synchronized boolean mouseDrag(Event event, int i, int k) {
        vq = i;
        wq = k + aq;
        if(event.metaDown())
            xq = 2;
        else
            xq = 1;
        return true;
    }

    public final void init() {
        xp = true;
        System.out.println("Started applet");
        qp = size().width;
        rp = size().height;
        cq = 1;
        p.hgb = getCodeBase();
        sp = new Thread(this);
        sp.start();
    }

    public final void start() {
        if(yp >= 0)
            yp = 0;
    }

    public final void stop() {
        if(yp >= 0)
            yp = 4000 / tp;
    }

    public final void destroy() {
        yp = -1;
        try {
            Thread.sleep(5000L);
        }
        catch(Exception _ex) { }
        if(yp == -1) {
            System.out.println("5 seconds expired, forcing kill");
            mj();
            if(sp != null) {
                sp.stop();
                sp = null;
            }
        }
    }

    public final void mj() {
        yp = -2;
        System.out.println("Closing program");
        xj();
        try {
            Thread.sleep(1000L);
        }
        catch(Exception _ex) { }
        if(wp != null)
            wp.dispose();
        if(!xp)
            System.exit(0);
    }

    public final void run() {
        if(cq == 1) {
            cq = 2;
            lq = getGraphics();
            oj();
            uj(0, "Loading...");
            kj();
            cq = 0;
        }
        int i = 0;
        int k = 256;
        int i1 = 1;
        int j1 = 0;
        for(int k1 = 0; k1 < 10; k1++)
            vp[k1] = System.currentTimeMillis();

        long l1 = System.currentTimeMillis();
        while(yp >= 0)  {
            if(yp > 0) {
                yp--;
                if(yp == 0) {
                    mj();
                    sp = null;
                    return;
                }
            }
            int i2 = k;
            int j2 = i1;
            k = 300;
            i1 = 1;
            long l2 = System.currentTimeMillis();
            if(vp[i] == 0L) {
                k = i2;
                i1 = j2;
            } else
            if(l2 > vp[i])
                k = (int)((long)(2560 * tp) / (l2 - vp[i]));
            if(k < 25)
                k = 25;
            if(k > 256) {
                k = 256;
                i1 = (int)((long)tp - (l2 - vp[i]) / 10L);
                if(i1 < uq)
                    i1 = uq;
            }
            try {
                Thread.sleep(i1);
            }
            catch(InterruptedException _ex) { }
            vp[i] = l2;
            i = (i + 1) % 10;
            if(i1 > 1) {
                for(int k2 = 0; k2 < 10; k2++)
                    if(vp[k2] != 0L)
                        vp[k2] += i1;

            }
            int i3 = 0;
            while(j1 < 256)  {
                qj();
                j1 += k;
                if(++i3 > up) {
                    j1 = 0;
                    zp += 6;
                    if(zp > 25) {
                        zp = 0;
                        br = true;
                    }
                    break;
                }
            }
            zp--;
            j1 &= 0xff;
            wj();
            gr = (1000 * k) / (tp * 256);
            if(xp && i == 0)
                showStatus("Fps:" + gr + "Del:" + i1);
            if(wp != null && (wp.a() != qp || wp.b() != rp))
                zj(wp.a(), wp.b());
        }
        if(yp == -1)
            mj();
        sp = null;
    }

    public final void update(Graphics g) {
        paint(g);
    }

    public final void paint(Graphics g) {
        if(cq == 2 && kq != null) {
            uj(fq, gq);
            return;
        }
        if(cq == 0)
            fk();
    }

    public void oj() {
        try {
            byte abyte0[] = p.pn("jagex.jag");
            byte abyte1[] = p.ln("logo.tga", 0, abyte0);
            kq = nj(abyte1);
            j.kf(p.ln("h11p.jf", 0, abyte0));
            j.kf(p.ln("h12b.jf", 0, abyte0));
            j.kf(p.ln("h12p.jf", 0, abyte0));
            j.kf(p.ln("h13b.jf", 0, abyte0));
            j.kf(p.ln("h14b.jf", 0, abyte0));
            j.kf(p.ln("h16b.jf", 0, abyte0));
            j.kf(p.ln("h20b.jf", 0, abyte0));
            j.kf(p.ln("h24b.jf", 0, abyte0));
            return;
        }
        catch(IOException _ex) {
            System.out.println("Error loading jagex.dat");
        }
    }

    public void uj(int i, String s) {
        int k = (qp - 281) / 2;
        int i1 = (rp - 148) / 2;
        lq.setColor(Color.black);
        lq.fillRect(0, 0, qp, rp);
        if(!eq)
            lq.drawImage(kq, k, i1, this);
        k += 2;
        i1 += 90;
        fq = i;
        gq = s;
        lq.setColor(new Color(132, 132, 132));
        if(eq)
            lq.setColor(new Color(220, 0, 0));
        lq.drawRect(k - 2, i1 - 2, 280, 23);
        lq.fillRect(k, i1, (277 * i) / 100, 20);
        lq.setColor(new Color(198, 198, 198));
        if(eq)
            lq.setColor(new Color(255, 255, 255));
        lj(lq, s, hq, k + 138, i1 + 10);
        if(!eq) {
            lj(lq, "Created by JAGeX - visit www.jagex.com", iq, k + 138, i1 + 30);
            lj(lq, "Copyright \2512000 Andrew Gower", iq, k + 138, i1 + 44);
        } else {
            lq.setColor(new Color(132, 132, 152));
            lj(lq, "Copyright \2512000 Andrew Gower", jq, k + 138, rp - 20);
        }
        if(dq != null) {
            lq.setColor(Color.white);
            lj(lq, dq, iq, k + 138, i1 - 120);
        }
    }

    public void tj(int i, String s) {
        int k = (qp - 281) / 2;
        int i1 = (rp - 148) / 2;
        k += 2;
        i1 += 90;
        fq = i;
        gq = s;
        int j1 = (277 * i) / 100;
        lq.setColor(new Color(132, 132, 132));
        if(eq)
            lq.setColor(new Color(220, 0, 0));
        lq.fillRect(k, i1, j1, 20);
        lq.setColor(Color.black);
        lq.fillRect(k + j1, i1, 277 - j1, 20);
        lq.setColor(new Color(198, 198, 198));
        if(eq)
            lq.setColor(new Color(255, 255, 255));
        lj(lq, s, hq, k + 138, i1 + 10);
    }

    public void lj(Graphics g, String s, Font font, int i, int k) {
        Object obj;
        if(wp == null)
            obj = this;
        else
            obj = wp;
        FontMetrics fontmetrics = ((Component) (obj)).getFontMetrics(font);
        fontmetrics.stringWidth(s);
        g.setFont(font);
        g.drawString(s, i - fontmetrics.stringWidth(s) / 2, k + fontmetrics.getHeight() / 4);
    }

    public Image nj(byte abyte0[]) {
        int i = abyte0[13] * 256 + abyte0[12];
        int k = abyte0[15] * 256 + abyte0[14];
        byte abyte1[] = new byte[256];
        byte abyte2[] = new byte[256];
        byte abyte3[] = new byte[256];
        for(int i1 = 0; i1 < 256; i1++) {
            abyte1[i1] = abyte0[20 + i1 * 3];
            abyte2[i1] = abyte0[19 + i1 * 3];
            abyte3[i1] = abyte0[18 + i1 * 3];
        }

        IndexColorModel indexcolormodel = new IndexColorModel(8, 256, abyte1, abyte2, abyte3);
        byte abyte4[] = new byte[i * k];
        int j1 = 0;
        for(int k1 = k - 1; k1 >= 0; k1--) {
            for(int l1 = 0; l1 < i; l1++)
                abyte4[j1++] = abyte0[786 + l1 + k1 * i];

        }

        MemoryImageSource memoryimagesource = new MemoryImageSource(i, k, indexcolormodel, abyte4, 0, i);
        Image image = createImage(memoryimagesource);
        return image;
    }

    public byte[] ij(String s, String s1, int i) throws IOException {
        int k = 0;
        int i1 = 0;
        int j1 = 0;
        byte abyte0[] = null;
        while(k < 2) 
            try {
                tj(i, "Loading " + s1 + " - 0%");
                if(k == 1)
                    s = s.toUpperCase();
                java.io.InputStream inputstream = p.jn(s);
                DataInputStream datainputstream = new DataInputStream(inputstream);
                byte abyte2[] = new byte[6];
                datainputstream.readFully(abyte2, 0, 6);
                i1 = ((abyte2[0] & 0xff) << 16) + ((abyte2[1] & 0xff) << 8) + (abyte2[2] & 0xff);
                j1 = ((abyte2[3] & 0xff) << 16) + ((abyte2[4] & 0xff) << 8) + (abyte2[5] & 0xff);
                tj(i, "Loading " + s1 + " - 5%");
                int k1 = 0;
                abyte0 = new byte[j1];
                while(k1 < j1)  {
                    int l1 = j1 - k1;
                    if(l1 > 1000)
                        l1 = 1000;
                    datainputstream.readFully(abyte0, k1, l1);
                    k1 += l1;
                    tj(i, "Loading " + s1 + " - " + (5 + (k1 * 95) / j1) + "%");
                }
                k = 2;
                datainputstream.close();
            }
            catch(IOException _ex) {
                k++;
            }
        tj(i, "Unpacking " + s1);
        if(j1 != i1) {
            byte abyte1[] = new byte[i1];
            o.hk(abyte1, i1, abyte0, j1, 0);
            return abyte1;
        } else {
            return abyte0;
        }
    }

    public l() {
        qp = 512;
        rp = 384;
        tp = 20;
        up = 1000;
        vp = new long[10];
        cq = 1;
        eq = false;
        gq = "Loading";
        hq = new Font("TimesRoman", 0, 15);
        iq = new Font("Helvetica", 1, 13);
        jq = new Font("Helvetica", 0, 12);
        mq = false;
        nq = false;
        oq = false;
        pq = false;
        qq = false;
        rq = false;
        sq = false;
        tq = false;
        uq = 1;
        br = false;
        cr = "";
        dr = "";
        er = "";
        fr = "";
    }

    private int qp;
    private int rp;
    private Thread sp;
    private int tp;
    private int up;
    private long vp[];
    static d wp = null;
    private boolean xp;
    private int yp;
    private int zp;
    public int aq;
    public int bq;
    public int cq;
    public String dq;
    private boolean eq;
    private int fq;
    private String gq;
    private Font hq;
    private Font iq;
    private Font jq;
    private Image kq;
    private Graphics lq;
    public boolean mq;
    public boolean nq;
    public boolean oq;
    public boolean pq;
    public boolean qq;
    public boolean rq;
    public boolean sq;
    public boolean tq;
    public int uq;
    public int vq;
    public int wq;
    public int xq;
    public int yq;
    public int zq;
    public int ar;
    public boolean br;
    public String cr;
    public String dr;
    public String er;
    public String fr;
    public int gr;

}
