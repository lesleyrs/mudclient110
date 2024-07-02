// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

import jagex.client.*;
import jagex.g;
import jagex.p;
import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.URL;

public class mudclient extends f {

    public static void qm(String as[]) {
        mudclient mudclient1 = new mudclient();
        mudclient1.mt = false;
        mudclient1.gj(mudclient1.iu, mudclient1.ju + 22, "Runescape by Andrew Gower", false);
        mudclient1.uq = 10;
    }

    public void kj() {
        if(mt) {
            String s = getDocumentBase().getHost().toLowerCase();
            if(!s.endsWith("jagex.com") && !s.endsWith("jagex.co.uk") && !s.endsWith("runescape.com") && !s.endsWith("runescape.co.uk") && !s.endsWith("runescape.net") && !s.endsWith("runescape.org") && !s.endsWith("penguin.local") && !s.endsWith("puffin.local") && !s.endsWith("puffin") && !s.endsWith("jagex.dnsalias.com")) {
                kt = true;
                return;
            }
        }
        t(ht, it);
        int i1 = 0;
        for(int j1 = 0; j1 < 99; j1++) {
            int k1 = j1 + 1;
            int i2 = (int)((double)k1 + 300D * Math.pow(2D, (double)k1 / 7D));
            i1 += i2;
            ux[j1] = i1;
        }

        super.ad = 43594;
        super.aq = -11;
        f.xc = 1000;
        f.wc = c.hc;
        try {
            String s1 = getParameter("poff");
            int j2 = Integer.parseInt(s1);
            super.ad += j2;
            System.out.println("Offset: " + j2);
        }
        catch(Exception _ex) { }
        dl();
        mu = 2000;
        lu = mu + 100;
        qw = lu + 50;
        ou = qw + 300;
        bu = getGraphics();
        yj(50);
        du = new n(iu, ju + 12, 2600, this);
        du.qs = this;
        du.xf(0, 0, iu, ju + 12);
        h.kg = false;
        h.lg = lu;
        cy = new h(du, 5);
        int l1 = ((j) (du)).ak - 199;
        byte byte0 = 36;
        dy = cy.wc(l1, byte0 + 24, 196, 90, 1, 500, true);
        gy = new h(du, 5);
        hy = gy.wc(l1, byte0 + 40, 196, 126, 1, 500, true);
        ky = new h(du, 5);
        ly = ky.wc(l1, byte0 + 24, 196, 226, 1, 500, true);
        nm();
        fm(true);
        cu = new k(du, 15000, 15000, 1000);
        cu.ji(iu / 2, ju / 2, iu / 2, ju / 2, iu, ku);
        cu.mm = 2400;
        cu.nm = 2400;
        cu.om = 1;
        cu.pm = 2300;
        cu.ii(-50, -10, -50);
        xu = new q(cu, du);
        xu.ugb = mu;
        gm();
        pl();
        fn();
        tj(100, "Starting game...");
        rl();
        bl();
        ql();
        am();
        ll();
        yk();
        fk();
        cm();
    }

    public void dl() {
        if(dk()) {
            byte abyte0[] = null;
            try {
                abyte0 = ij("config" + c.ic + ".jag", "Configuration", 10);
            }
            catch(IOException ioexception) {
                System.out.println("Load error:" + ioexception);
            }
            t.xp(abyte0);
            return;
        } else {
            uj(10, "Loading configuration");
            t.fq();
            return;
        }
    }

    public void nm() {
        if(dk()) {
            byte abyte0[] = null;
            try {
                abyte0 = ij("media" + c.kc + ".jag", "2d graphics", 20);
            }
            catch(IOException ioexception) {
                System.out.println("Load error:" + ioexception);
            }
            du.og(abyte0, p.nn("inv1.tga", abyte0), mu, true, false);
            du.mg(abyte0, p.nn("inv2.tga", abyte0), mu + 1, true, 1, 6, false);
            du.og(abyte0, p.nn("bubble.tga", abyte0), mu + 9, true, false);
            du.og(abyte0, p.nn("runescape.tga", abyte0), mu + 10, true, false);
            du.tg(abyte0, p.nn("splat.tga", abyte0), mu + 11, true, 3, false);
            du.mg(abyte0, p.nn("icon.tga", abyte0), mu + 14, true, 4, 2, false);
            du.og(abyte0, p.nn("hbar.tga", abyte0), mu + 22, false, false);
            du.og(abyte0, p.nn("hbar2.tga", abyte0), mu + 23, true, false);
            du.og(abyte0, p.nn("compass.tga", abyte0), mu + 24, true, false);
            du.tg(abyte0, p.nn("scrollbar.tga", abyte0), lu, true, 2, false);
            du.tg(abyte0, p.nn("corners.tga", abyte0), lu + 2, true, 4, false);
            du.tg(abyte0, p.nn("arrows.tga", abyte0), lu + 6, true, 2, false);
            du.mg(abyte0, p.nn("buttons.tga", abyte0), mu + 25, true, 1, 2, false);
            eu = nj(p.ln("hbar.tga", 0, abyte0));
            int i1 = t.sib;
            for(int k1 = 1; i1 > 0; k1++) {
                int i2 = i1;
                i1 -= 30;
                if(i2 > 30)
                    i2 = 30;
                du.mg(abyte0, p.nn("objects" + k1 + ".tga", abyte0), qw + (k1 - 1) * 30, true, 10, (i2 + 9) / 10, false);
            }

            du.tg(abyte0, p.nn("projectile.tga", abyte0), ou, true, t.fmb, false);
            return;
        }
        byte abyte1[] = new byte[0x186a0];
        tj(20, "Loading 2d graphics");
        try {
            p.in("../gamedata/media/inv1.tga", abyte1, 0x186a0);
            du.og(abyte1, 0, mu, true, false);
            p.in("../gamedata/media/inv2.tga", abyte1, 0x186a0);
            du.mg(abyte1, 0, mu + 1, true, 1, 6, false);
            p.in("../gamedata/media/bubble.tga", abyte1, 0x186a0);
            du.og(abyte1, 0, mu + 9, true, false);
            p.in("../gamedata/media/runescape.tga", abyte1, 0x186a0);
            du.og(abyte1, 0, mu + 10, true, false);
            p.in("../gamedata/media/splat.tga", abyte1, 0x186a0);
            du.tg(abyte1, 0, mu + 11, true, 3, false);
            p.in("../gamedata/media/icon.tga", abyte1, 0x186a0);
            du.mg(abyte1, 0, mu + 14, true, 4, 2, false);
            p.in("../gamedata/media/hbar.tga", abyte1, 0x186a0);
            du.og(abyte1, 0, mu + 22, false, false);
            eu = nj(abyte1);
            p.in("../gamedata/media/hbar2.tga", abyte1, 0x186a0);
            du.og(abyte1, 0, mu + 23, true, false);
            p.in("../gamedata/media/compass.tga", abyte1, 0x186a0);
            du.og(abyte1, 0, mu + 24, true, false);
            p.in("../gamedata/media/scrollbar.tga", abyte1, 0x186a0);
            du.tg(abyte1, 0, lu, true, 2, false);
            p.in("../gamedata/media/corners.tga", abyte1, 0x186a0);
            du.tg(abyte1, 0, lu + 2, true, 4, false);
            p.in("../gamedata/media/arrows.tga", abyte1, 0x186a0);
            du.tg(abyte1, 0, lu + 6, true, 2, false);
            p.in("../gamedata/media/buttons.tga", abyte1, 0x186a0);
            du.mg(abyte1, 0, mu + 25, true, 1, 2, false);
            int j1 = t.sib;
            for(int l1 = 1; j1 > 0; l1++) {
                int j2 = j1;
                j1 -= 30;
                if(j2 > 30)
                    j2 = 30;
                p.in("../gamedata/media/objects" + l1 + ".tga", abyte1, 0x186a0);
                du.mg(abyte1, 0, qw + (l1 - 1) * 30, true, 10, (j2 + 9) / 10, false);
            }

            p.in("../gamedata/media/projectile.tga", abyte1, 0x186a0);
            du.tg(abyte1, 0, ou, true, t.fmb, false);
            return;
        }
        catch(IOException _ex) {
            System.out.println("ERROR: in raw media loader");
        }
    }

    public void fm(boolean flag) {
        ofb = 0;
        pfb = ofb;
        byte abyte0[] = null;
        if(dk() && flag) {
            String s = "entity" + c.nc + ".jag";
            try {
                abyte0 = ij(s, "people and monsters", 30);
            }
            catch(IOException ioexception) {
                System.out.println("Load error:" + ioexception);
            }
        } else {
            tj(30, "Loading people and monsters");
        }
        int i1 = 0;
label0:
        for(int j1 = 0; j1 < t.qkb; j1++) {
            String s1 = t.skb[j1];
            for(int k1 = 0; k1 < j1; k1++) {
                if(!t.skb[k1].equalsIgnoreCase(s1))
                    continue;
                t.xkb[j1] = t.xkb[k1];
                continue label0;
            }

            if(flag)
                if(dk()) {
                    boolean flag1 = true;
                    if(t.ukb[j1] != 0)
                        flag1 = false;
                    du.tg(p.ln(s1 + ".tga", 0, abyte0), 0, pfb, true, 15, flag1);
                    i1 += 15;
                    if(t.vkb[j1] == 1) {
                        du.tg(p.ln(s1 + "a.tga", 0, abyte0), 0, pfb + 15, true, 3, true);
                        i1 += 3;
                    }
                    if(t.wkb[j1] == 1) {
                        du.tg(p.ln(s1 + "f.tga", 0, abyte0), 0, pfb + 18, true, 9, true);
                        i1 += 9;
                    }
                } else {
                    try {
                        byte abyte1[] = new byte[0x927c0];
                        p.in("../gamedata/entity/" + s1 + ".tga", abyte1, 0x927c0);
                        i1 += 15;
                        boolean flag2 = true;
                        if(t.ukb[j1] != 0)
                            flag2 = false;
                        du.tg(abyte1, 0, pfb, true, 15, flag2);
                        if(t.vkb[j1] == 1) {
                            p.in("../gamedata/entity/" + s1 + "a.tga", abyte1, 0x30d40);
                            i1 += 3;
                            du.tg(abyte1, 0, pfb + 15, true, 3, true);
                        }
                        if(t.wkb[j1] == 1) {
                            p.in("../gamedata/entity/" + s1 + "f.tga", abyte1, 0x30d40);
                            i1 += 9;
                            du.tg(abyte1, 0, pfb + 18, true, 9, true);
                        }
                    }
                    catch(IOException _ex) {
                        System.out.println("ERROR: in raw entity loader - no:" + j1 + " " + s1);
                    }
                }
            t.xkb[j1] = pfb;
            pfb += 27;
        }

        System.out.println("Loaded: " + i1 + " frames of animation");
    }

    public void gm() {
        if(dk()) {
            cu.kh("textures" + c.mc + ".jag", 7, 11, 50, this);
            return;
        } else {
            tj(50, "Loading textures");
            cu.ri("../gamedata/textures");
            return;
        }
    }

    public void pl() {
        t.vp("torcha2");
        t.vp("torcha3");
        t.vp("torcha4");
        t.vp("skulltorcha2");
        t.vp("skulltorcha3");
        t.vp("skulltorcha4");
        t.vp("firea2");
        t.vp("firea3");
        if(dk()) {
            byte abyte0[] = null;
            try {
                abyte0 = ij("models" + c.lc + ".jag", "3d models", 70);
            }
            catch(IOException ioexception) {
                System.out.println("Load error:" + ioexception);
            }
            for(int j1 = 0; j1 < t.rnb; j1++) {
                int k1 = p.nn(t.snb[j1] + ".ob3", abyte0);
                if(k1 != 0)
                    cx[j1] = new i(abyte0, k1, true);
                else
                    cx[j1] = new i(1, 1);
            }

            return;
        }
        tj(70, "Loading 3d models");
        for(int i1 = 0; i1 < t.rnb; i1++)
            cx[i1] = new i("../gamedata/models/" + t.snb[i1] + ".ob2");

    }

    public void fn() {
        if(dk()) {
            xu.chb = null;
            try {
                xu.chb = ij("maps" + c.jc + ".jag", "map", 90);
                return;
            }
            catch(IOException ioexception) {
                System.out.println("Load error:" + ioexception);
            }
            return;
        } else {
            xu.qgb = false;
            return;
        }
    }

    public void rl() {
        oz = new h(du, 10);
        pz = oz.jc(5, 269, 502, 56, 1, 20, true);
        qz = oz.kc(7, 324, 498, 14, 1, 80, false, true);
        rz = oz.jc(5, 269, 502, 56, 1, 20, true);
        sz = oz.jc(5, 269, 502, 56, 1, 20, true);
        oz.tc(qz);
    }

    public void qj() {
        if(kt)
            return;
        if(lt)
            return;
        try {
            nt++;
            if(hu == 0) {
                super.bq = 0;
                ol();
            }
            if(hu == 1) {
                super.bq++;
                um();
            }
            super.yq = 0;
            super.ar = 0;
            au++;
            if(au > 500) {
                au = 0;
                int i1 = (int)(Math.random() * 4D);
                if((i1 & 1) == 1)
                    wt += xt;
                if((i1 & 2) == 2)
                    yt += zt;
            }
            if(wt < -50)
                xt = 2;
            if(wt > 50)
                xt = -2;
            if(yt < -50)
                zt = 2;
            if(yt > 50)
                zt = -2;
            if(kz > 0)
                kz--;
            if(lz > 0)
                lz--;
            if(mz > 0)
                mz--;
            if(nz > 0) {
                nz--;
                return;
            }
        }
        catch(OutOfMemoryError _ex) {
            mm();
            lt = true;
        }
    }

    public void wj() {
        if(kt) {
            Graphics g1 = getGraphics();
            g1.setColor(Color.black);
            g1.fillRect(0, 0, 512, 356);
            g1.setFont(new Font("Helvetica", 1, 20));
            g1.setColor(Color.white);
            g1.drawString("Error - unable to load game!", 50, 50);
            g1.drawString("To play RuneScape make sure you play from", 50, 100);
            g1.drawString("http://www.runescape.com", 50, 150);
            yj(1);
            return;
        }
        if(lt) {
            Graphics g2 = getGraphics();
            g2.setColor(Color.black);
            g2.fillRect(0, 0, 512, 356);
            g2.setFont(new Font("Helvetica", 1, 20));
            g2.setColor(Color.white);
            g2.drawString("Error - out of memory!", 50, 50);
            g2.drawString("Close ALL unnecessary programs", 50, 100);
            g2.drawString("and windows before loading the game", 50, 150);
            g2.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
            yj(1);
            return;
        }
        try {
            if(hu == 0) {
                du.dl = false;
                vm();
            }
            if(hu == 1) {
                du.dl = true;
                fl();
                return;
            }
        }
        catch(OutOfMemoryError _ex) {
            mm();
            lt = true;
        }
    }

    public void xj() {
        bb();
        mm();
    }

    public void mm() {
        try {
            if(du != null) {
                du.ng();
                du.gk = null;
                du = null;
            }
            if(cu != null) {
                cu.yi();
                cu = null;
            }
            cx = null;
            xw = null;
            gx = null;
            zv = null;
            aw = null;
            kw = null;
            lw = null;
            cw = null;
            if(xu != null) {
                xu.thb = null;
                xu.uhb = null;
                xu.vhb = null;
                xu.whb = null;
                xu = null;
            }
            System.gc();
            return;
        }
        catch(Exception _ex) {
            return;
        }
    }

    public void fk() {
        bu.drawImage(eu, 0, 0, this);
    }

    public void ek(int i1) {
        if(hu == 0) {
            if(kcb == 0)
                lcb.ud(i1);
            if(kcb == 1)
                ocb.ud(i1);
            if(kcb == 2)
                xcb.ud(i1);
            if(kcb == 3)
                meb.ud(i1);
        }
        if(hu == 1) {
            if(rfb) {
                kdb.ud(i1);
                return;
            }
            if(aeb) {
                if(eeb == -1)
                    beb.ud(i1);
                return;
            }
            if(ccb == 0 && bcb == 0)
                oz.ud(i1);
            if(ccb == 3 || ccb == 4 || ccb == 5)
                ccb = 0;
        }
    }

    public void pj(int i1, int j1, int k1) {
        ut[tt] = j1;
        vt[tt] = k1;
        tt = tt + 1 & 0x1fff;
        for(int l1 = 10; l1 < 4000; l1++) {
            int i2 = tt - l1 & 0x1fff;
            if(ut[i2] == j1 && vt[i2] == k1) {
                boolean flag = false;
                for(int j2 = 1; j2 < l1; j2++) {
                    int k2 = tt - j2 & 0x1fff;
                    int l2 = i2 - j2 & 0x1fff;
                    if(ut[l2] != j1 || vt[l2] != k1)
                        flag = true;
                    if(ut[k2] != ut[l2] || vt[k2] != vt[l2])
                        break;
                    if(j2 == l1 - 1 && flag && gcb == 0 && fcb == 0) {
                        trylogout();
                        return;
                    }
                }

            }
        }

    }

    public void yk() {
        hu = 0;
        kcb = 0;
        idb = "";
        jdb = "";
        gdb = "Please enter a username:";
        hdb = "*" + idb + "*";
        wv = 0;
        iw = 0;
    }

    public void dm() {
        super.er = "";
        super.fr = "";
    }

    public void trylogout() {
        if(hu == 0)
            return;
        if(gcb > 450) {
            sk("@cya@You can't logout during combat!", 3);
            return;
        }
        if(gcb > 0) {
            sk("@cya@You can't logout for 10 seconds after combat", 3);
            return;
        } else {
            super.dd.gb(6);
            super.dd.xb();
            fcb = 1000;
            return;
        }
    }

    public void am() {
        beb = new h(du, 100);
        int i1 = 8;
        ceb = beb.pd(256, i1, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
        i1 += 22;
        beb.pd(256, i1, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
        i1 += 13;
        beb.pd(256, i1, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
        i1 += 22;
        beb.pd(256, i1, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
        i1 += 13;
        beb.pd(256, i1, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
        i1 += 13;
        beb.pd(256, i1, "answer, then press the 'different question' button to get a better question.", 1, true);
        i1 += 35;
        for(int j1 = 0; j1 < 5; j1++) {
            beb.gd(170, i1, 310, 30);
            keb[j1] = "~:" + jeb[j1];
            feb[j1] = beb.pd(170, i1 - 7, (j1 + 1) + ": " + ggb[jeb[j1]], 1, true);
            geb[j1] = beb.ed(170, i1 + 7, 310, 30, 1, 80, false, true);
            beb.gd(370, i1, 80, 30);
            beb.pd(370, i1 - 7, "Different", 1, true);
            beb.pd(370, i1 + 7, "Question", 1, true);
            heb[j1] = beb.sd(370, i1, 80, 30);
            beb.gd(455, i1, 80, 30);
            beb.pd(455, i1 - 7, "Enter own", 1, true);
            beb.pd(455, i1 + 7, "Question", 1, true);
            ieb[j1] = beb.sd(455, i1, 80, 30);
            i1 += 35;
        }

        beb.tc(geb[0]);
        i1 += 10;
        beb.gd(256, i1, 250, 30);
        beb.pd(256, i1, "Click here when finished", 4, true);
        deb = beb.sd(256, i1, 250, 30);
    }

    public void zk() {
        if(eeb != -1) {
            if(super.fr.length() > 0) {
                keb[eeb] = super.fr;
                beb.qd(feb[eeb], (eeb + 1) + ": " + keb[eeb]);
                beb.qd(geb[eeb], "");
                eeb = -1;
            }
            return;
        }
        beb.vd(super.vq, super.wq, super.yq, super.xq);
        for(int i1 = 0; i1 < 5; i1++)
            if(beb.xd(heb[i1])) {
                for(boolean flag = false; !flag;) {
                    jeb[i1] = (jeb[i1] + 1) % ggb.length;
                    flag = true;
                    for(int k1 = 0; k1 < 5; k1++)
                        if(k1 != i1 && jeb[k1] == jeb[i1])
                            flag = false;

                }

                keb[i1] = "~:" + jeb[i1];
                beb.qd(feb[i1], (i1 + 1) + ": " + ggb[jeb[i1]]);
                beb.qd(geb[i1], "");
            }

        for(int j1 = 0; j1 < 5; j1++)
            if(beb.xd(ieb[j1])) {
                eeb = j1;
                super.er = "";
                super.fr = "";
            }

        if(beb.xd(deb)) {
            for(int l1 = 0; l1 < 5; l1++) {
                String s = beb.vc(geb[l1]);
                if(s == null || s.length() < 3) {
                    beb.qd(ceb, "@yel@Please provide a longer answer to question: " + (l1 + 1));
                    return;
                }
            }

            for(int i2 = 0; i2 < 5; i2++) {
                String s1 = beb.vc(geb[i2]);
                for(int k2 = 0; k2 < i2; k2++) {
                    String s3 = beb.vc(geb[k2]);
                    if(s1.equalsIgnoreCase(s3)) {
                        beb.qd(ceb, "@yel@Each question must have a different answer");
                        return;
                    }
                }

            }

            super.dd.gb(208);
            for(int j2 = 0; j2 < 5; j2++) {
                String s2 = keb[j2];
                if(s2 == null || s2.length() == 0)
                    s2 = String.valueOf(j2 + 1);
                if(s2.length() > 50)
                    s2 = s2.substring(0, 50);
                super.dd.ec(s2.length());
                super.dd.zb(s2);
                super.dd.bc(p.vn(beb.vc(geb[j2])), super.td, ht, it);
            }

            super.dd.xb();
            for(int l2 = 0; l2 < 5; l2++) {
                jeb[l2] = l2;
                keb[l2] = "~:" + jeb[l2];
                beb.qd(geb[l2], "");
                beb.qd(feb[l2], (l2 + 1) + ": " + ggb[jeb[l2]]);
            }

            du.rf();
            aeb = false;
        }
    }

    public void pk() {
        du.zk = false;
        du.rf();
        beb.nc();
        if(eeb != -1) {
            int i1 = 150;
            du.dg(26, i1, 460, 60, 0);
            du.wf(26, i1, 460, 60, 0xffffff);
            i1 += 22;
            du.zg("Please enter your question", 256, i1, 4, 0xffffff);
            i1 += 25;
            du.zg(super.er + "*", 256, i1, 4, 0xffffff);
        }
        du.dh(0, ju, mu + 22);
        du.pf(bu, 0, 11);
    }

    public void ll() {
        meb = new h(du, 100);
        int i1 = 10;
        neb = meb.pd(256, i1, "@yel@To prove this is your account please provide the answers to", 1, true);
        i1 += 15;
        oeb = meb.pd(256, i1, "@yel@your security questions. You will then be able to reset your password", 1, true);
        i1 += 35;
        for(int j1 = 0; j1 < 5; j1++) {
            meb.gd(256, i1, 410, 30);
            xeb[j1] = meb.pd(256, i1 - 7, (j1 + 1) + ": question?", 1, true);
            yeb[j1] = meb.ed(256, i1 + 7, 310, 30, 1, 80, true, true);
            i1 += 35;
        }

        meb.tc(yeb[0]);
        meb.gd(256, i1, 410, 30);
        meb.pd(256, i1 - 7, "If you know it, enter a previous password used on this account", 1, true);
        peb = meb.ed(256, i1 + 7, 310, 30, 1, 80, true, true);
        i1 += 35;
        meb.gd(151, i1, 200, 30);
        meb.pd(151, i1 - 7, "Choose a NEW password", 1, true);
        qeb = meb.ed(146, i1 + 7, 200, 30, 1, 80, true, true);
        meb.gd(361, i1, 200, 30);
        meb.pd(361, i1 - 7, "Confirm new password", 1, true);
        reb = meb.ed(366, i1 + 7, 200, 30, 1, 80, true, true);
        i1 += 35;
        meb.gd(201, i1, 100, 30);
        meb.pd(201, i1, "Submit", 4, true);
        seb = meb.sd(201, i1, 100, 30);
        meb.gd(311, i1, 100, 30);
        meb.pd(311, i1, "Cancel", 4, true);
        teb = meb.sd(311, i1, 100, 30);
    }

    public void ql() {
        kdb = new h(du, 100);
        kdb.pd(256, 10, "Design Your Character", 4, true);
        char c1 = '\214';
        int i1 = 34;
        kdb.gd(c1, i1, 200, 25);
        kdb.pd(c1, i1, "Appearance", 4, false);
        i1 += 15;
        kdb.pd(c1 - 55, i1 + 110, "Front", 3, true);
        kdb.pd(c1, i1 + 110, "Side", 3, true);
        kdb.pd(c1 + 55, i1 + 110, "Back", 3, true);
        byte byte0 = 54;
        i1 += 145;
        kdb.pc(c1 - byte0, i1, 53, 41);
        kdb.pd(c1 - byte0, i1 - 8, "Head", 1, true);
        kdb.pd(c1 - byte0, i1 + 8, "Type", 1, true);
        kdb.rc(c1 - byte0 - 40, i1, h.lg + 7);
        ldb = kdb.sd(c1 - byte0 - 40, i1, 20, 20);
        kdb.rc((c1 - byte0) + 40, i1, h.lg + 6);
        mdb = kdb.sd((c1 - byte0) + 40, i1, 20, 20);
        kdb.pc(c1 + byte0, i1, 53, 41);
        kdb.pd(c1 + byte0, i1 - 8, "Hair", 1, true);
        kdb.pd(c1 + byte0, i1 + 8, "Color", 1, true);
        kdb.rc((c1 + byte0) - 40, i1, h.lg + 7);
        ndb = kdb.sd((c1 + byte0) - 40, i1, 20, 20);
        kdb.rc(c1 + byte0 + 40, i1, h.lg + 6);
        odb = kdb.sd(c1 + byte0 + 40, i1, 20, 20);
        i1 += 50;
        kdb.pc(c1 - byte0, i1, 53, 41);
        kdb.pd(c1 - byte0, i1, "Gender", 1, true);
        kdb.rc(c1 - byte0 - 40, i1, h.lg + 7);
        pdb = kdb.sd(c1 - byte0 - 40, i1, 20, 20);
        kdb.rc((c1 - byte0) + 40, i1, h.lg + 6);
        qdb = kdb.sd((c1 - byte0) + 40, i1, 20, 20);
        kdb.pc(c1 + byte0, i1, 53, 41);
        kdb.pd(c1 + byte0, i1 - 8, "Top", 1, true);
        kdb.pd(c1 + byte0, i1 + 8, "Color", 1, true);
        kdb.rc((c1 + byte0) - 40, i1, h.lg + 7);
        rdb = kdb.sd((c1 + byte0) - 40, i1, 20, 20);
        kdb.rc(c1 + byte0 + 40, i1, h.lg + 6);
        sdb = kdb.sd(c1 + byte0 + 40, i1, 20, 20);
        i1 += 50;
        kdb.pc(c1 - byte0, i1, 53, 41);
        kdb.pd(c1 - byte0, i1 - 8, "Skin", 1, true);
        kdb.pd(c1 - byte0, i1 + 8, "Color", 1, true);
        kdb.rc(c1 - byte0 - 40, i1, h.lg + 7);
        tdb = kdb.sd(c1 - byte0 - 40, i1, 20, 20);
        kdb.rc((c1 - byte0) + 40, i1, h.lg + 6);
        udb = kdb.sd((c1 - byte0) + 40, i1, 20, 20);
        kdb.pc(c1 + byte0, i1, 53, 41);
        kdb.pd(c1 + byte0, i1 - 8, "Bottom", 1, true);
        kdb.pd(c1 + byte0, i1 + 8, "Color", 1, true);
        kdb.rc((c1 + byte0) - 40, i1, h.lg + 7);
        vdb = kdb.sd((c1 + byte0) - 40, i1, 20, 20);
        kdb.rc(c1 + byte0 + 40, i1, h.lg + 6);
        wdb = kdb.sd(c1 + byte0 + 40, i1, 20, 20);
        c1 = '\u0174';
        i1 = 35;
        kdb.gd(c1, i1, 200, 25);
        kdb.pd(c1, i1, "Character Type", 4, false);
        i1 += 22;
        kdb.pd(c1, i1, "Each character type has different starting", 0, true);
        i1 += 13;
        kdb.pd(c1, i1, "bonuses. But the choice you make here", 0, true);
        i1 += 13;
        kdb.pd(c1, i1, "isn't permanent, and will change depending", 0, true);
        i1 += 13;
        kdb.pd(c1, i1, "on how you play the game.", 0, true);
        i1 += 73;
        kdb.pc(c1, i1, 215, 125);
        String as[] = {
            "Adventurer", "Warrior", "Wizard", "Ranger", "Miner"
        };
        ydb = kdb.ic(c1, i1 + 2, as, 3, true);
        i1 += 82;
        kdb.gd(c1, i1, 200, 30);
        kdb.pd(c1, i1, "Start Game", 4, false);
        xdb = kdb.sd(c1, i1, 200, 30);
    }

    public void tk() {
        du.zk = false;
        du.rf();
        kdb.nc();
        char c1 = '\214';
        byte byte0 = 50;
        du.rg(c1 - 32 - 55, byte0, 64, 102, t.xkb[ufb], agb[xfb]);
        du.bg(c1 - 32 - 55, byte0, 64, 102, t.xkb[tfb], agb[wfb], cgb[yfb], 0, false);
        du.bg(c1 - 32 - 55, byte0, 64, 102, t.xkb[sfb], bgb[vfb], cgb[yfb], 0, false);
        du.rg(c1 - 32, byte0, 64, 102, t.xkb[ufb] + 6, agb[xfb]);
        du.bg(c1 - 32, byte0, 64, 102, t.xkb[tfb] + 6, agb[wfb], cgb[yfb], 0, false);
        du.bg(c1 - 32, byte0, 64, 102, t.xkb[sfb] + 6, bgb[vfb], cgb[yfb], 0, false);
        du.rg((c1 - 32) + 55, byte0, 64, 102, t.xkb[ufb] + 12, agb[xfb]);
        du.bg((c1 - 32) + 55, byte0, 64, 102, t.xkb[tfb] + 12, agb[wfb], cgb[yfb], 0, false);
        du.bg((c1 - 32) + 55, byte0, 64, 102, t.xkb[sfb] + 12, bgb[vfb], cgb[yfb], 0, false);
        du.dh(0, ju, mu + 22);
        du.pf(bu, 0, 11);
    }

    public void cl() {
        kdb.vd(super.vq, super.wq, super.yq, super.xq);
        if(kdb.xd(ldb))
            do
                sfb = ((sfb - 1) + t.qkb) % t.qkb;
            while((t.ukb[sfb] & 3) != 1 || (t.ukb[sfb] & 4 * zfb) == 0);
        if(kdb.xd(mdb))
            do
                sfb = (sfb + 1) % t.qkb;
            while((t.ukb[sfb] & 3) != 1 || (t.ukb[sfb] & 4 * zfb) == 0);
        if(kdb.xd(ndb))
            vfb = ((vfb - 1) + bgb.length) % bgb.length;
        if(kdb.xd(odb))
            vfb = (vfb + 1) % bgb.length;
        if(kdb.xd(pdb) || kdb.xd(qdb)) {
            for(zfb = 3 - zfb; (t.ukb[sfb] & 3) != 1 || (t.ukb[sfb] & 4 * zfb) == 0; sfb = (sfb + 1) % t.qkb);
            for(; (t.ukb[tfb] & 3) != 2 || (t.ukb[tfb] & 4 * zfb) == 0; tfb = (tfb + 1) % t.qkb);
        }
        if(kdb.xd(rdb))
            wfb = ((wfb - 1) + agb.length) % agb.length;
        if(kdb.xd(sdb))
            wfb = (wfb + 1) % agb.length;
        if(kdb.xd(tdb))
            yfb = ((yfb - 1) + cgb.length) % cgb.length;
        if(kdb.xd(udb))
            yfb = (yfb + 1) % cgb.length;
        if(kdb.xd(vdb))
            xfb = ((xfb - 1) + agb.length) % agb.length;
        if(kdb.xd(wdb))
            xfb = (xfb + 1) % agb.length;
        if(kdb.xd(xdb)) {
            super.dd.gb(236);
            super.dd.ec(zfb);
            super.dd.ec(sfb);
            super.dd.ec(tfb);
            super.dd.ec(ufb);
            super.dd.ec(vfb);
            super.dd.ec(wfb);
            super.dd.ec(xfb);
            super.dd.ec(yfb);
            super.dd.ec(kdb.zc(ydb));
            super.dd.xb();
            du.rf();
            rfb = false;
        }
    }

    public void bl() {
        lcb = new h(du, 50);
        int i1 = 40;
        lcb.pd(256, 200 + i1, "Click on an option", 5, true);
        lcb.gd(156, 240 + i1, 120, 35);
        lcb.gd(356, 240 + i1, 120, 35);
        lcb.pd(156, 240 + i1, "New User", 5, false);
        lcb.pd(356, 240 + i1, "Existing User", 5, false);
        mcb = lcb.sd(156, 240 + i1, 120, 35);
        ncb = lcb.sd(356, 240 + i1, 120, 35);
        ocb = new h(du, 50);
        i1 = 70;
        pcb = ocb.pd(256, i1 + 8, "To create an account please enter all the requested details", 4, true);
        i1 += 25;
        ocb.gd(256, i1 + 17, 250, 34);
        ocb.pd(256, i1 + 8, "Choose a Username", 4, false);
        tcb = ocb.ed(256, i1 + 25, 200, 40, 4, 12, false, false);
        ocb.tc(tcb);
        i1 += 40;
        ocb.gd(141, i1 + 17, 220, 34);
        ocb.pd(141, i1 + 8, "Choose a Password", 4, false);
        ucb = ocb.ed(141, i1 + 25, 220, 40, 4, 20, true, false);
        ocb.gd(371, i1 + 17, 220, 34);
        ocb.pd(371, i1 + 8, "Confirm Password", 4, false);
        vcb = ocb.ed(371, i1 + 25, 220, 40, 4, 20, true, false);
        i1 += 40;
        i1 += 20;
        wcb = ocb.yc(60, i1, 14);
        ocb.qc(75, i1, "I have read and agree to the terms+conditions listed at:", 4, true);
        i1 += 15;
        ocb.pd(256, i1, "http://www.runescape.com/runeterms.html", 4, true);
        i1 += 20;
        ocb.gd(156, i1 + 17, 150, 34);
        ocb.pd(156, i1 + 17, "Submit", 5, false);
        scb = ocb.sd(156, i1 + 17, 150, 34);
        ocb.gd(356, i1 + 17, 150, 34);
        ocb.pd(356, i1 + 17, "Cancel", 5, false);
        rcb = ocb.sd(356, i1 + 17, 150, 34);
        xcb = new h(du, 50);
        i1 = 230;
        ycb = xcb.pd(256, i1 - 10, "Please enter your username and password", 4, true);
        i1 += 28;
        xcb.gd(140, i1, 200, 40);
        xcb.pd(140, i1 - 10, "Username:", 4, false);
        zcb = xcb.ed(140, i1 + 10, 200, 40, 4, 12, false, false);
        i1 += 47;
        xcb.gd(190, i1, 200, 40);
        xcb.pd(190, i1 - 10, "Password:", 4, false);
        adb = xcb.ed(190, i1 + 10, 200, 40, 4, 20, true, false);
        i1 -= 55;
        xcb.gd(410, i1, 120, 25);
        xcb.pd(410, i1, "Ok", 4, false);
        bdb = xcb.sd(410, i1, 120, 25);
        i1 += 30;
        xcb.gd(410, i1, 120, 25);
        xcb.pd(410, i1, "Cancel", 4, false);
        cdb = xcb.sd(410, i1, 120, 25);
        i1 += 30;
        xcb.gd(410, i1, 160, 25);
        xcb.pd(410, i1, "I've lost my password", 4, false);
        ddb = xcb.sd(410, i1, 160, 25);
        xcb.tc(zcb);
    }

    public void vm() {
        du.zk = false;
        du.rf();
        if(kcb == 0 || kcb == 2) {
            int i1 = (nt * 2) % 3072;
            if(i1 < 1024) {
                du.dh(0, 10, 2500);
                if(i1 > 768)
                    du.vg(0, 10, 2501, i1 - 768);
            } else
            if(i1 < 2048) {
                du.dh(0, 10, 2501);
                if(i1 > 1792)
                    du.vg(0, 10, mu + 10, i1 - 1792);
            } else {
                du.dh(0, 10, mu + 10);
                if(i1 > 2816)
                    du.vg(0, 10, 2500, i1 - 2816);
            }
        }
        if(kcb == 0)
            lcb.nc();
        if(kcb == 1)
            ocb.nc();
        if(kcb == 2)
            xcb.nc();
        if(kcb == 3)
            meb.nc();
        du.dh(0, ju, mu + 22);
        du.pf(bu, 0, 11);
    }

    public void cm() {
        int i1 = 0;
        byte byte0 = 50;
        byte byte1 = 50;
        xu.yo(byte0 * 48 + 23, byte1 * 48 + 23, i1);
        xu.ro(cx);
        char c1 = '\u2600';
        char c2 = '\u1900';
        char c3 = '\u044C';
        char c4 = '\u0378';
        cu.mm = 4100;
        cu.nm = 4100;
        cu.om = 1;
        cu.pm = 4000;
        cu.fi(c1, -xu.po(c1, c2), c2, 912, c4, 0, c3 * 2);
        cu.bj();
        du.lf();
        du.lf();
        du.dg(0, 0, 512, 6, 0);
        for(int j1 = 6; j1 >= 1; j1--)
            du.xg(0, j1, 0, j1, 512, 8);

        du.dg(0, 194, 512, 20, 0);
        for(int k1 = 6; k1 >= 1; k1--)
            du.xg(0, k1, 0, 194 - k1, 512, 8);

        du.dh(15, 15, mu + 10);
        du.ah(2500, 0, 0, 512, 200);
        c1 = '\u2400';
        c2 = '\u2400';
        c3 = '\u044C';
        c4 = '\u0378';
        cu.mm = 4100;
        cu.nm = 4100;
        cu.om = 1;
        cu.pm = 4000;
        cu.fi(c1, -xu.po(c1, c2), c2, 912, c4, 0, c3 * 2);
        cu.bj();
        du.lf();
        du.lf();
        du.dg(0, 0, 512, 6, 0);
        for(int l1 = 6; l1 >= 1; l1--)
            du.xg(0, l1, 0, l1, 512, 8);

        du.dg(0, 194, 512, 20, 0);
        for(int i2 = 6; i2 >= 1; i2--)
            du.xg(0, i2, 0, 194 - i2, 512, 8);

        du.dh(15, 15, mu + 10);
        du.ah(2501, 0, 0, 512, 200);
        for(int j2 = 0; j2 < 64; j2++) {
            cu.ei(xu.vhb[0][j2]);
            cu.ei(xu.uhb[1][j2]);
            cu.ei(xu.vhb[1][j2]);
            cu.ei(xu.uhb[2][j2]);
            cu.ei(xu.vhb[2][j2]);
        }

        c1 = '\u2B80';
        c2 = '\u2880';
        c3 = '\u01F4';
        c4 = '\u0178';
        cu.mm = 4100;
        cu.nm = 4100;
        cu.om = 1;
        cu.pm = 4000;
        cu.fi(c1, -xu.po(c1, c2), c2, 912, c4, 0, c3 * 2);
        cu.bj();
        du.lf();
        du.lf();
        du.dg(0, 0, 512, 6, 0);
        for(int k2 = 6; k2 >= 1; k2--)
            du.xg(0, k2, 0, k2, 512, 8);

        du.dg(0, 194, 512, 20, 0);
        for(int l2 = 6; l2 >= 1; l2--)
            du.xg(0, l2, 0, 194, 512, 8);

        du.dh(15, 15, mu + 10);
        du.ah(mu + 10, 0, 0, 512, 200);
    }

    public void ol() {
        if(super.ud > 0)
            super.ud--;
        if(kcb == 0) {
            lcb.vd(super.vq, super.wq, super.yq, super.xq);
            if(lcb.xd(mcb)) {
                kcb = 1;
                ocb.qd(tcb, "");
                ocb.qd(ucb, "");
                ocb.qd(vcb, "");
                ocb.tc(tcb);
                ocb.bd(wcb, 0);
                ocb.qd(pcb, "To create an account please enter all the requested details");
            }
            if(lcb.xd(ncb)) {
                kcb = 2;
                xcb.qd(ycb, "Please enter your username and password");
                xcb.qd(zcb, "");
                xcb.qd(adb, "");
                xcb.tc(zcb);
                return;
            }
        } else
        if(kcb == 1) {
            ocb.vd(super.vq, super.wq, super.yq, super.xq);
            if(ocb.xd(tcb))
                ocb.tc(ucb);
            if(ocb.xd(ucb))
                ocb.tc(vcb);
            if(ocb.xd(vcb))
                ocb.tc(tcb);
            if(ocb.xd(rcb))
                kcb = 0;
            if(ocb.xd(scb)) {
                if(ocb.vc(tcb) == null || ocb.vc(tcb).length() == 0 || ocb.vc(ucb) == null || ocb.vc(ucb).length() == 0) {
                    ocb.qd(pcb, "@yel@Please fill in ALL requested information to continue!");
                    return;
                }
                if(!ocb.vc(ucb).equalsIgnoreCase(ocb.vc(vcb))) {
                    ocb.qd(pcb, "@yel@The two passwords entered are not the same as each other!");
                    return;
                }
                if(ocb.vc(ucb).length() < 5) {
                    ocb.qd(pcb, "@yel@Your password must be at least 5 letters long");
                    return;
                }
                if(ocb.zc(wcb) == 0) {
                    ocb.qd(pcb, "@yel@You must agree to the terms+conditions to continue");
                    return;
                } else {
                    ocb.qd(pcb, "Please wait... Creating new account");
                    vm();
                    ck();
                    String s = ocb.vc(tcb);
                    String s2 = ocb.vc(ucb);
                    n(s, s2);
                    return;
                }
            }
        } else
        if(kcb == 2) {
            xcb.vd(super.vq, super.wq, super.yq, super.xq);
            if(xcb.xd(cdb))
                kcb = 0;
            if(xcb.xd(zcb))
                xcb.tc(adb);
            if(xcb.xd(adb) || xcb.xd(bdb)) {
                idb = xcb.vc(zcb);
                jdb = xcb.vc(adb);
                m(idb, jdb, false);
            }
            if(xcb.xd(ddb)) {
                idb = xcb.vc(zcb);
                idb = p._mthdo(idb, 20);
                if(idb.trim().length() == 0) {
                    db("You must enter your username to recover your password", "");
                    return;
                }
                db(f.vc[6], f.vc[7]);
                try {
                    if(dk())
                        super.dd = new a(super.yc, this, super.ad);
                    else
                        super.dd = new a(super.yc, null, super.ad);
                    super.dd.qe = f.xc;
                    super.dd.kb();
                    super.dd.gb(4);
                    super.dd.lb(p.sn(idb));
                    super.dd.rb();
                    super.dd.mb();
                    int i1 = super.dd.gc();
                    System.out.println("Getpq response: " + i1);
                    if(i1 == 0) {
                        db("Sorry, the recovery questions for this user have not been set", "");
                        return;
                    }
                    for(int j1 = 0; j1 < 5; j1++) {
                        int k1 = super.dd.gc();
                        byte abyte0[] = new byte[5000];
                        super.dd.jb(k1, abyte0);
                        String s5 = new String(abyte0, 0, k1);
                        if(s5.startsWith("~:")) {
                            s5 = s5.substring(2);
                            int j2 = 0;
                            try {
                                j2 = Integer.parseInt(s5);
                            }
                            catch(Exception _ex) { }
                            s5 = ggb[j2];
                        }
                        meb.qd(xeb[j1], s5);
                    }

                    if(leb) {
                        db("Sorry, you have already attempted 1 recovery, try again later", "");
                        return;
                    }
                    kcb = 3;
                    meb.qd(neb, "@yel@To prove this is your account please provide the answers to");
                    meb.qd(oeb, "@yel@your security questions. You will then be able to reset your password");
                    for(int l1 = 0; l1 < 5; l1++)
                        meb.qd(yeb[l1], "");

                    meb.qd(peb, "");
                    meb.qd(qeb, "");
                    meb.qd(reb, "");
                    return;
                }
                catch(Exception _ex) {
                    db(f.vc[12], f.vc[13]);
                }
                return;
            }
        } else
        if(kcb == 3) {
            meb.vd(super.vq, super.wq, super.yq, super.xq);
            if(meb.xd(seb)) {
                String s1 = meb.vc(qeb);
                String s3 = meb.vc(reb);
                if(!s1.equalsIgnoreCase(s3)) {
                    db("@yel@The two new passwords entered are not the same as each other!", "");
                    return;
                }
                if(s1.length() < 5) {
                    db("@yel@Your new password must be at least 5 letters long", "");
                    return;
                }
                db(f.vc[6], f.vc[7]);
                try {
                    if(dk())
                        super.dd = new a(super.yc, this, super.ad);
                    else
                        super.dd = new a(super.yc, null, super.ad);
                    super.dd.qe = f.xc;
                    int i2 = super.dd.kb();
                    String s4 = p._mthdo(meb.vc(peb), 20);
                    String s6 = p._mthdo(meb.vc(qeb), 20);
                    super.dd.gb(8);
                    super.dd.lb(p.sn(idb));
                    super.dd.cc(d());
                    super.dd.vb(s4 + s6, i2, ht, it);
                    for(int k2 = 0; k2 < 5; k2++)
                        super.dd.bc(p.vn(meb.vc(yeb[k2])), i2, ht, it);

                    super.dd.rb();
                    super.dd.gc();
                    int l2 = super.dd.gc();
                    System.out.println("Recover response: " + l2);
                    if(l2 == 0) {
                        kcb = 2;
                        db("Sorry, recovery failed. You may try again in 1 hour", "");
                        leb = true;
                        return;
                    }
                    if(l2 == 1) {
                        kcb = 2;
                        db("Your pass has been reset. You may now use the new pass to login", "");
                        return;
                    } else {
                        kcb = 2;
                        db("Recovery failed! Attempts exceeded?", "");
                        return;
                    }
                }
                catch(Exception _ex) {
                    db(f.vc[12], f.vc[13]);
                }
            }
            if(meb.xd(teb))
                kcb = 0;
        }
    }

    public void db(String s, String s1) {
        if(kcb == 1)
            ocb.qd(pcb, s + " " + s1);
        if(kcb == 2)
            xcb.qd(ycb, s + " " + s1);
        if(kcb == 3) {
            meb.qd(neb, s);
            meb.qd(oeb, s1);
        }
        hdb = s1;
        vm();
        ck();
    }

    public void l() {
        fcb = 0;
        sk("@cya@Sorry, you can't logout at the moment", 3);
    }

    public void q() {
        if(fcb != 0) {
            h();
            return;
        } else {
            super.q();
            return;
        }
    }

    public void h() {
        kcb = 0;
        hu = 0;
        fcb = 0;
    }

    public void g() {
        acb = 0;
        fcb = 0;
        kcb = 0;
        hu = 1;
        dm();
        du.rf();
        du.pf(bu, 0, 11);
        for(int i1 = 0; i1 < ww; i1++) {
            cu.ei(xw[i1]);
            xu.gp(yw[i1], zw[i1], ax[i1]);
        }

        for(int j1 = 0; j1 < fx; j1++) {
            cu.ei(gx[j1]);
            xu.go(hx[j1], ix[j1], jx[j1], kx[j1]);
        }

        ww = 0;
        fx = 0;
        pw = 0;
        wv = 0;
        for(int k1 = 0; k1 < uv; k1++)
            zv[k1] = null;

        for(int l1 = 0; l1 < vv; l1++)
            aw[l1] = null;

        iw = 0;
        for(int i2 = 0; i2 < gw; i2++)
            kw[i2] = null;

        for(int j2 = 0; j2 < hw; j2++)
            lw[j2] = null;

        for(int k2 = 0; k2 < 50; k2++)
            qy[k2] = false;

        pt = 0;
        super.yq = 0;
        super.xq = 0;
        gbb = false;
        obb = false;
    }

    public void v() {
        String s = ocb.vc(tcb);
        String s1 = ocb.vc(ucb);
        kcb = 2;
        xcb.qd(ycb, "Please enter your username and password");
        xcb.qd(zcb, s);
        xcb.qd(adb, s1);
        vm();
        ck();
        m(s, s1, false);
    }

    public void um() {
        if(super.dd.tb())
            super.bq = 0;
        k();
        if(fcb > 0)
            fcb--;
        if(super.bq > 4500 && gcb == 0 && fcb == 0) {
            super.bq -= 500;
            trylogout();
            return;
        }
        if(cw.pr == 8 || cw.pr == 9)
            gcb = 500;
        if(gcb > 0)
            gcb--;
        if(rfb) {
            cl();
            return;
        }
        if(aeb) {
            zk();
            return;
        }
        for(int i1 = 0; i1 < wv; i1++) {
            m m1 = aw[i1];
            int k1 = (m1.sr + 1) % 10;
            if(m1.rr != k1) {
                int i2 = -1;
                int l3 = m1.rr;
                int i5;
                if(l3 < k1)
                    i5 = k1 - l3;
                else
                    i5 = (10 + k1) - l3;
                int l5 = 4;
                if(i5 > 2)
                    l5 = (i5 - 1) * 4;
                if(m1.tr[l3] - m1.lr > gu * 3 || m1.ur[l3] - m1.mr > gu * 3 || m1.tr[l3] - m1.lr < -gu * 3 || m1.ur[l3] - m1.mr < -gu * 3 || i5 > 8) {
                    m1.lr = m1.tr[l3];
                    m1.mr = m1.ur[l3];
                } else {
                    if(m1.lr < m1.tr[l3]) {
                        m1.lr += l5;
                        m1.or++;
                        i2 = 2;
                    } else
                    if(m1.lr > m1.tr[l3]) {
                        m1.lr -= l5;
                        m1.or++;
                        i2 = 6;
                    }
                    if(m1.lr - m1.tr[l3] < l5 && m1.lr - m1.tr[l3] > -l5)
                        m1.lr = m1.tr[l3];
                    if(m1.mr < m1.ur[l3]) {
                        m1.mr += l5;
                        m1.or++;
                        if(i2 == -1)
                            i2 = 4;
                        else
                        if(i2 == 2)
                            i2 = 3;
                        else
                            i2 = 5;
                    } else
                    if(m1.mr > m1.ur[l3]) {
                        m1.mr -= l5;
                        m1.or++;
                        if(i2 == -1)
                            i2 = 0;
                        else
                        if(i2 == 2)
                            i2 = 1;
                        else
                            i2 = 7;
                    }
                    if(m1.mr - m1.ur[l3] < l5 && m1.mr - m1.ur[l3] > -l5)
                        m1.mr = m1.ur[l3];
                }
                if(i2 != -1)
                    m1.pr = i2;
                if(m1.lr == m1.tr[l3] && m1.mr == m1.ur[l3])
                    m1.rr = (l3 + 1) % 10;
            } else {
                m1.pr = m1.qr;
            }
            if(m1.xr > 0)
                m1.xr--;
            if(m1.zr > 0)
                m1.zr--;
            if(m1.ds > 0)
                m1.ds--;
            if(hcb > 0) {
                hcb--;
                if(hcb == 0)
                    sk("You have been granted another life. Be more careful this time!", 3);
                if(hcb == 0)
                    sk("You retain your skills. Unless you attacked another player recently,", 3);
                if(hcb == 0)
                    sk("you also keep your best 3 items. Everything else lands where you died.", 3);
            }
        }

        for(int j1 = 0; j1 < iw; j1++) {
            m m2 = lw[j1];
            int j2 = (m2.sr + 1) % 10;
            if(m2.rr != j2) {
                int i4 = -1;
                int j5 = m2.rr;
                int i6;
                if(j5 < j2)
                    i6 = j2 - j5;
                else
                    i6 = (10 + j2) - j5;
                int j6 = 4;
                if(i6 > 2)
                    j6 = (i6 - 1) * 4;
                if(m2.tr[j5] - m2.lr > gu * 3 || m2.ur[j5] - m2.mr > gu * 3 || m2.tr[j5] - m2.lr < -gu * 3 || m2.ur[j5] - m2.mr < -gu * 3 || i6 > 8) {
                    m2.lr = m2.tr[j5];
                    m2.mr = m2.ur[j5];
                } else {
                    if(m2.lr < m2.tr[j5]) {
                        m2.lr += j6;
                        m2.or++;
                        i4 = 2;
                    } else
                    if(m2.lr > m2.tr[j5]) {
                        m2.lr -= j6;
                        m2.or++;
                        i4 = 6;
                    }
                    if(m2.lr - m2.tr[j5] < j6 && m2.lr - m2.tr[j5] > -j6)
                        m2.lr = m2.tr[j5];
                    if(m2.mr < m2.ur[j5]) {
                        m2.mr += j6;
                        m2.or++;
                        if(i4 == -1)
                            i4 = 4;
                        else
                        if(i4 == 2)
                            i4 = 3;
                        else
                            i4 = 5;
                    } else
                    if(m2.mr > m2.ur[j5]) {
                        m2.mr -= j6;
                        m2.or++;
                        if(i4 == -1)
                            i4 = 0;
                        else
                        if(i4 == 2)
                            i4 = 1;
                        else
                            i4 = 7;
                    }
                    if(m2.mr - m2.ur[j5] < j6 && m2.mr - m2.ur[j5] > -j6)
                        m2.mr = m2.ur[j5];
                }
                if(i4 != -1)
                    m2.pr = i4;
                if(m2.lr == m2.tr[j5] && m2.mr == m2.ur[j5])
                    m2.rr = (j5 + 1) % 10;
            } else {
                m2.pr = m2.qr;
                if(m2.nr == 43)
                    m2.or++;
            }
            if(m2.xr > 0)
                m2.xr--;
            if(m2.zr > 0)
                m2.zr--;
            if(m2.ds > 0)
                m2.ds--;
        }

        for(int l1 = 0; l1 < wv; l1++) {
            m m3 = aw[l1];
            if(m3.ms > 0)
                m3.ms--;
        }

        if(ry) {
            if(ov - cw.lr < -500 || ov - cw.lr > 500 || pv - cw.mr < -500 || pv - cw.mr > 500) {
                ov = cw.lr;
                pv = cw.mr;
            }
        } else {
            if(ov - cw.lr < -500 || ov - cw.lr > 500 || pv - cw.mr < -500 || pv - cw.mr > 500) {
                ov = cw.lr;
                pv = cw.mr;
            }
            if(ov != cw.lr)
                ov += (cw.lr - ov) / (16 + (mv - 500) / 15);
            if(pv != cw.mr)
                pv += (cw.mr - pv) / (16 + (mv - 500) / 15);
            if(sy) {
                int k2 = qv * 32;
                int j4 = k2 - sv;
                byte byte0 = 1;
                if(j4 != 0) {
                    rv++;
                    if(j4 > 128) {
                        byte0 = -1;
                        j4 = 256 - j4;
                    } else
                    if(j4 > 0)
                        byte0 = 1;
                    else
                    if(j4 < -128) {
                        byte0 = 1;
                        j4 = 256 + j4;
                    } else
                    if(j4 < 0) {
                        byte0 = -1;
                        j4 = -j4;
                    }
                    sv += ((rv * j4 + 255) / 256) * byte0;
                    sv &= 0xff;
                } else {
                    rv = 0;
                }
            }
        }
        if(super.wq > ju - 4) {
            if(super.vq > 15 && super.vq < 96 && super.yq == 1)
                tz = 0;
            if(super.vq > 110 && super.vq < 194 && super.yq == 1) {
                tz = 1;
                oz.df[pz] = 0xf423f;
            }
            if(super.vq > 215 && super.vq < 295 && super.yq == 1) {
                tz = 2;
                oz.df[rz] = 0xf423f;
            }
            if(super.vq > 315 && super.vq < 395 && super.yq == 1) {
                tz = 3;
                oz.df[sz] = 0xf423f;
            }
            super.yq = 0;
            super.xq = 0;
        }
        oz.vd(super.vq, super.wq, super.yq, super.xq);
        if(tz > 0 && super.vq >= 494 && super.wq >= ju - 66)
            super.yq = 0;
        if(oz.xd(qz)) {
            String s = oz.vc(qz);
            oz.qd(qz, "");
            if(s.startsWith("admin:")) {
                if(s.equalsIgnoreCase("admin:lostcon99") && !mt)
                    super.dd.yb();
                else
                if(s.equalsIgnoreCase("admin:closecon99") && !mt)
                    bb();
                else
                    s(s.substring(6));
            } else {
                int k4 = p.mn(s);
                r(p.ngb, k4);
                s = p.qn(p.ngb, 0, k4, true);
                cw.xr = 150;
                cw.wr = s;
                sk(cw.ir + ": " + s, 2);
            }
        }
        if(tz == 0) {
            for(int l2 = 0; l2 < uz; l2++)
                if(wz[l2] > 0)
                    wz[l2]--;

        }
        if(hcb != 0)
            super.yq = 0;
        if(lab || xz) {
            if(super.xq != 0)
                vab++;
            else
                vab = 0;
            if(vab > 300)
                wab += 50;
            else
            if(vab > 150)
                wab += 5;
            else
            if(vab > 50)
                wab++;
            else
            if(vab > 20 && (vab & 5) == 0)
                wab++;
        } else {
            vab = 0;
            wab = 0;
        }
        if(super.yq == 1)
            pt = 1;
        else
        if(super.yq == 2)
            pt = 2;
        cu.bi(super.vq, super.wq);
        super.yq = 0;
        if(sy) {
            if(rv == 0 || ry) {
                if(super.oq) {
                    qv = qv + 1 & 7;
                    super.oq = false;
                    if(!nv) {
                        if((qv & 1) == 0)
                            qv = qv + 1 & 7;
                        for(int i3 = 0; i3 < 8; i3++) {
                            if(km(qv))
                                break;
                            qv = qv + 1 & 7;
                        }

                    }
                }
                if(super.pq) {
                    qv = qv + 7 & 7;
                    super.pq = false;
                    if(!nv) {
                        if((qv & 1) == 0)
                            qv = qv + 7 & 7;
                        for(int j3 = 0; j3 < 8; j3++) {
                            if(km(qv))
                                break;
                            qv = qv + 7 & 7;
                        }

                    }
                }
            }
        } else
        if(super.oq)
            sv = sv + 2 & 0xff;
        else
        if(super.pq)
            sv = sv - 2 & 0xff;
        if(nv && mv > 550)
            mv -= 4;
        else
        if(!nv && mv < 750)
            mv += 4;
        if(uu > 0)
            uu--;
        else
        if(uu < 0)
            uu++;
        cu.li(17);
        pu++;
        if(pu > 5) {
            pu = 0;
            qu = qu + 1 & 3;
            ru = (ru + 1) % 3;
        }
        for(int k3 = 0; k3 < ww; k3++) {
            int l4 = yw[k3];
            int k5 = zw[k3];
            if(l4 >= 0 && k5 >= 0 && l4 < 96 && k5 < 96 && ax[k3] == 74)
                xw[k3].bf(1, 0, 0);
        }

    }

    public void sk(String s, int i1) {
        if(i1 == 2 || i1 == 4 || i1 == 6) {
            for(; s.length() > 5 && s.charAt(0) == '@' && s.charAt(4) == '@'; s = s.substring(5));
            int j1 = s.indexOf(":");
            if(j1 != -1) {
                String s1 = s.substring(0, j1);
                long l1 = p.sn(s1);
                for(int i2 = 0; i2 < super.kd; i2++)
                    if(super.ld[i2] == l1)
                        return;

            }
        }
        if(i1 == 2)
            s = "@yel@" + s;
        if(i1 == 3 || i1 == 4)
            s = "@whi@" + s;
        if(i1 == 6)
            s = "@cya@" + s;
        if(tz != 0) {
            if(i1 == 4 || i1 == 3)
                kz = 200;
            if(i1 == 2 && tz != 1)
                lz = 200;
            if(i1 == 5 && tz != 2)
                mz = 200;
            if(i1 == 6 && tz != 3)
                nz = 200;
            if(i1 == 3 && tz != 0)
                tz = 0;
            if(i1 == 6 && tz != 3 && tz != 0)
                tz = 0;
        }
        for(int k1 = uz - 1; k1 > 0; k1--) {
            vz[k1] = vz[k1 - 1];
            wz[k1] = wz[k1 - 1];
        }

        vz[0] = s;
        wz[0] = 300;
        if(i1 == 2)
            if(oz.df[pz] == oz.ef[pz] - 4)
                oz.mc(pz, s, true);
            else
                oz.mc(pz, s, false);
        if(i1 == 5)
            if(oz.df[rz] == oz.ef[rz] - 4)
                oz.mc(rz, s, true);
            else
                oz.mc(rz, s, false);
        if(i1 == 6) {
            if(oz.df[sz] == oz.ef[sz] - 4) {
                oz.mc(sz, s, true);
                return;
            }
            oz.mc(sz, s, false);
        }
    }

    public void i(String s) {
        if(s.startsWith("@bor@")) {
            sk(s, 4);
            return;
        }
        if(s.startsWith("@que@")) {
            sk("@whi@" + s, 5);
            return;
        }
        if(s.startsWith("@pri@")) {
            sk(s, 6);
            return;
        } else {
            sk(s, 3);
            return;
        }
    }

    public m xk(int i1, int j1, int k1, int l1) {
        if(zv[i1] == null) {
            zv[i1] = new m();
            zv[i1].jr = i1;
            zv[i1].kr = 0;
        }
        m m1 = zv[i1];
        boolean flag = false;
        for(int i2 = 0; i2 < xv; i2++) {
            if(bw[i2].jr != i1)
                continue;
            flag = true;
            break;
        }

        if(flag) {
            m1.qr = l1;
            int j2 = m1.sr;
            if(j1 != m1.tr[j2] || k1 != m1.ur[j2]) {
                m1.sr = j2 = (j2 + 1) % 10;
                m1.tr[j2] = j1;
                m1.ur[j2] = k1;
            }
        } else {
            m1.jr = i1;
            m1.rr = 0;
            m1.sr = 0;
            m1.tr[0] = m1.lr = j1;
            m1.ur[0] = m1.mr = k1;
            m1.qr = m1.pr = l1;
            m1.or = 0;
        }
        aw[wv++] = m1;
        return m1;
    }

    public m sm(int i1, int j1, int k1, int l1, int i2) {
        if(kw[i1] == null) {
            kw[i1] = new m();
            kw[i1].jr = i1;
        }
        m m1 = kw[i1];
        boolean flag = false;
        for(int j2 = 0; j2 < jw; j2++) {
            if(mw[j2].jr != i1)
                continue;
            flag = true;
            break;
        }

        if(flag) {
            m1.nr = i2;
            m1.qr = l1;
            int k2 = m1.sr;
            if(j1 != m1.tr[k2] || k1 != m1.ur[k2]) {
                m1.sr = k2 = (k2 + 1) % 10;
                m1.tr[k2] = j1;
                m1.ur[k2] = k1;
            }
        } else {
            m1.jr = i1;
            m1.rr = 0;
            m1.sr = 0;
            m1.tr[0] = m1.lr = j1;
            m1.ur[0] = m1.mr = k1;
            m1.nr = i2;
            m1.qr = m1.pr = l1;
            m1.or = 0;
        }
        lw[iw++] = m1;
        return m1;
    }

    public void o(int i1, int j1, byte abyte0[]) {
        try {
            if(i1 == 255) {
                xv = wv;
                for(int k1 = 0; k1 < xv; k1++)
                    bw[k1] = aw[k1];

                int j8 = 8;
                dw = p.un(abyte0, j8, 10);
                j8 += 10;
                ew = p.un(abyte0, j8, 12);
                j8 += 12;
                int i14 = p.un(abyte0, j8, 4);
                j8 += 4;
                boolean flag = wm(dw, ew);
                dw -= cv;
                ew -= dv;
                int k22 = dw * gu + 64;
                int k25 = ew * gu + 64;
                if(flag) {
                    cw.sr = 0;
                    cw.rr = 0;
                    cw.lr = cw.tr[0] = k22;
                    cw.mr = cw.ur[0] = k25;
                }
                wv = 0;
                cw = xk(fw, k22, k25, i14);
                int l28 = p.un(abyte0, j8, 8);
                j8 += 8;
                for(int k33 = 0; k33 < l28; k33++) {
                    m m4 = bw[k33 + 1];
                    int k39 = p.un(abyte0, j8, 1);
                    j8++;
                    if(k39 != 0) {
                        int k41 = p.un(abyte0, j8, 1);
                        j8++;
                        if(k41 == 0) {
                            int l42 = p.un(abyte0, j8, 3);
                            j8 += 3;
                            int l43 = m4.sr;
                            int k44 = m4.tr[l43];
                            int l44 = m4.ur[l43];
                            if(l42 == 2 || l42 == 1 || l42 == 3)
                                k44 += gu;
                            if(l42 == 6 || l42 == 5 || l42 == 7)
                                k44 -= gu;
                            if(l42 == 4 || l42 == 3 || l42 == 5)
                                l44 += gu;
                            if(l42 == 0 || l42 == 1 || l42 == 7)
                                l44 -= gu;
                            m4.qr = l42;
                            m4.sr = l43 = (l43 + 1) % 10;
                            m4.tr[l43] = k44;
                            m4.ur[l43] = l44;
                        } else {
                            int i43 = p.un(abyte0, j8, 4);
                            if((i43 & 0xc) == 12) {
                                j8 += 2;
                                continue;
                            }
                            m4.qr = p.un(abyte0, j8, 4);
                            j8 += 4;
                        }
                    }
                    aw[wv++] = m4;
                }

                int i37 = 0;
                while(j8 + 24 < j1 * 8)  {
                    int l39 = p.un(abyte0, j8, 11);
                    j8 += 11;
                    int l41 = p.un(abyte0, j8, 5);
                    j8 += 5;
                    if(l41 > 15)
                        l41 -= 32;
                    int j43 = p.un(abyte0, j8, 5);
                    j8 += 5;
                    if(j43 > 15)
                        j43 -= 32;
                    int j14 = p.un(abyte0, j8, 4);
                    j8 += 4;
                    int i44 = p.un(abyte0, j8, 1);
                    j8++;
                    int l22 = (dw + l41) * gu + 64;
                    int l25 = (ew + j43) * gu + 64;
                    xk(l39, l22, l25, j14);
                    if(i44 == 0)
                        nw[i37++] = l39;
                }
                if(i37 > 0) {
                    super.dd.gb(254);
                    super.dd.dc(i37);
                    for(int i40 = 0; i40 < i37; i40++) {
                        m m5 = zv[nw[i40]];
                        super.dd.dc(m5.jr);
                        super.dd.dc(m5.kr);
                    }

                    super.dd.xb();
                    i37 = 0;
                    return;
                }
            } else {
                if(i1 == 254) {
                    for(int l1 = 1; l1 < j1;)
                        if(p.wn(abyte0[l1]) == 255) {
                            int k8 = 0;
                            int k14 = dw + abyte0[l1 + 1] >> 3;
                            int l18 = ew + abyte0[l1 + 2] >> 3;
                            l1 += 3;
                            for(int i23 = 0; i23 < pw; i23++) {
                                int i26 = (rw[i23] >> 3) - k14;
                                int i29 = (sw[i23] >> 3) - l18;
                                if(i26 != 0 || i29 != 0) {
                                    if(i23 != k8) {
                                        rw[k8] = rw[i23];
                                        sw[k8] = sw[i23];
                                        tw[k8] = tw[i23];
                                        uw[k8] = uw[i23];
                                    }
                                    k8++;
                                }
                            }

                            pw = k8;
                        } else {
                            int l8 = p.zn(abyte0, l1);
                            l1 += 2;
                            int l14 = dw + abyte0[l1++];
                            int i19 = ew + abyte0[l1++];
                            if((l8 & 0x8000) == 0) {
                                rw[pw] = l14;
                                sw[pw] = i19;
                                tw[pw] = l8;
                                uw[pw] = 0;
                                for(int j23 = 0; j23 < ww; j23++) {
                                    if(yw[j23] != l14 || zw[j23] != i19)
                                        continue;
                                    uw[pw] = t.ilb[ax[j23]];
                                    break;
                                }

                                pw++;
                            } else {
                                l8 &= 0x7fff;
                                int k23 = 0;
                                for(int j26 = 0; j26 < pw; j26++)
                                    if(rw[j26] != l14 || sw[j26] != i19 || tw[j26] != l8) {
                                        if(j26 != k23) {
                                            rw[k23] = rw[j26];
                                            sw[k23] = sw[j26];
                                            tw[k23] = tw[j26];
                                            uw[k23] = uw[j26];
                                        }
                                        k23++;
                                    } else {
                                        l8 = -123;
                                    }

                                pw = k23;
                            }
                        }

                    return;
                }
                if(i1 == 253) {
                    for(int i2 = 1; i2 < j1;)
                        if(p.wn(abyte0[i2]) == 255) {
                            int i9 = 0;
                            int i15 = dw + abyte0[i2 + 1] >> 3;
                            int j19 = ew + abyte0[i2 + 2] >> 3;
                            i2 += 3;
                            for(int l23 = 0; l23 < ww; l23++) {
                                int k26 = (yw[l23] >> 3) - i15;
                                int j29 = (zw[l23] >> 3) - j19;
                                if(k26 != 0 || j29 != 0) {
                                    if(l23 != i9) {
                                        xw[i9] = xw[l23];
                                        xw[i9].wh = i9;
                                        yw[i9] = yw[l23];
                                        zw[i9] = zw[l23];
                                        ax[i9] = ax[l23];
                                        bx[i9] = bx[l23];
                                    }
                                    i9++;
                                } else {
                                    cu.ei(xw[l23]);
                                    xu.gp(yw[l23], zw[l23], ax[l23]);
                                }
                            }

                            ww = i9;
                        } else {
                            int j9 = p.zn(abyte0, i2);
                            i2 += 2;
                            int j15 = dw + abyte0[i2++];
                            int k19 = ew + abyte0[i2++];
                            int i24 = 0;
                            for(int l26 = 0; l26 < ww; l26++)
                                if(yw[l26] != j15 || zw[l26] != k19) {
                                    if(l26 != i24) {
                                        xw[i24] = xw[l26];
                                        xw[i24].wh = i24;
                                        yw[i24] = yw[l26];
                                        zw[i24] = zw[l26];
                                        ax[i24] = ax[l26];
                                        bx[i24] = bx[l26];
                                    }
                                    i24++;
                                } else {
                                    cu.ei(xw[l26]);
                                    xu.gp(yw[l26], zw[l26], ax[l26]);
                                }

                            ww = i24;
                            if(j9 != 60000) {
                                int k29 = xu.jo(j15, k19);
                                int l33;
                                int j37;
                                if(k29 == 0 || k29 == 4) {
                                    l33 = t.elb[j9];
                                    j37 = t.flb[j9];
                                } else {
                                    j37 = t.elb[j9];
                                    l33 = t.flb[j9];
                                }
                                int j40 = ((j15 + j15 + l33) * gu) / 2;
                                int i42 = ((k19 + k19 + j37) * gu) / 2;
                                int k43 = t.dlb[j9];
                                i j44 = cx[k43].we();
                                cu.ai(j44);
                                j44.wh = ww;
                                j44.bf(0, k29 * 32, 0);
                                j44.fe(j40, -xu.po(j40, i42), i42);
                                j44.ye(true, 48, 48, -50, -10, -50);
                                xu.wo(j15, k19, j9);
                                if(j9 == 74)
                                    j44.fe(0, -480, 0);
                                yw[ww] = j15;
                                zw[ww] = k19;
                                ax[ww] = j9;
                                bx[ww] = k29;
                                xw[ww++] = j44;
                            }
                        }

                    return;
                }
                if(i1 == 252) {
                    int j2 = 1;
                    ox = abyte0[j2++] & 0xff;
                    for(int k9 = 0; k9 < ox; k9++) {
                        int k15 = p.zn(abyte0, j2);
                        j2 += 2;
                        px[k9] = k15 & 0x7fff;
                        rx[k9] = k15 / 32768;
                        if(t.zib[k15 & 0x7fff] == 0) {
                            qx[k9] = p.hn(abyte0, j2);
                            if(qx[k9] >= 128)
                                j2 += 4;
                            else
                                j2++;
                        } else {
                            qx[k9] = 1;
                        }
                    }

                    return;
                }
                if(i1 == 250) {
                    int k2 = p.zn(abyte0, 1);
                    int l9 = 3;
                    for(int l15 = 0; l15 < k2; l15++) {
                        int l19 = p.zn(abyte0, l9);
                        l9 += 2;
                        m m1 = zv[l19];
                        byte byte4 = abyte0[l9];
                        l9++;
                        if(byte4 == 0) {
                            int l29 = p.zn(abyte0, l9);
                            l9 += 2;
                            if(m1 != null) {
                                m1.zr = 150;
                                m1.yr = l29;
                            }
                        } else
                        if(byte4 == 1) {
                            byte byte5 = abyte0[l9];
                            l9++;
                            if(m1 != null) {
                                String s1 = p.qn(abyte0, l9, byte5, true);
                                boolean flag2 = false;
                                for(int k40 = 0; k40 < super.kd; k40++)
                                    if(super.ld[k40] == m1.hr)
                                        flag2 = true;

                                if(!flag2) {
                                    m1.xr = 150;
                                    m1.wr = s1;
                                    sk(m1.ir + ": " + m1.wr, 2);
                                }
                            }
                            l9 += byte5;
                        } else
                        if(byte4 == 2) {
                            int i30 = p.wn(abyte0[l9]);
                            l9++;
                            int i34 = p.wn(abyte0[l9]);
                            l9++;
                            int k37 = p.wn(abyte0[l9]);
                            l9++;
                            if(m1 != null) {
                                m1.as = i30;
                                m1.bs = i34;
                                m1.cs = k37;
                                m1.ds = 200;
                                if(m1 == cw) {
                                    vx[3] = i34;
                                    wx[3] = k37;
                                }
                            }
                        } else
                        if(byte4 == 3) {
                            int j30 = p.zn(abyte0, l9);
                            l9 += 2;
                            int j34 = p.zn(abyte0, l9);
                            l9 += 2;
                            if(m1 != null) {
                                m1.js = j30;
                                m1.ls = j34;
                                m1.ks = -1;
                                m1.ms = nu;
                            }
                        } else
                        if(byte4 == 4) {
                            int k30 = p.zn(abyte0, l9);
                            l9 += 2;
                            int k34 = p.zn(abyte0, l9);
                            l9 += 2;
                            if(m1 != null) {
                                m1.js = k30;
                                m1.ks = k34;
                                m1.ls = -1;
                                m1.ms = nu;
                            }
                        } else
                        if(byte4 == 5) {
                            if(m1 != null) {
                                m1.kr = p.zn(abyte0, l9);
                                l9 += 2;
                                m1.hr = p.rn(abyte0, l9);
                                l9 += 8;
                                m1.ir = p.xn(m1.hr);
                                int l30 = p.wn(abyte0[l9]);
                                l9++;
                                for(int l34 = 0; l34 < l30; l34++) {
                                    m1.vr[l34] = p.wn(abyte0[l9]);
                                    l9++;
                                }

                                for(int l37 = l30; l37 < 12; l37++)
                                    m1.vr[l37] = 0;

                                m1.fs = abyte0[l9++] & 0xff;
                                m1.gs = abyte0[l9++] & 0xff;
                                m1.hs = abyte0[l9++] & 0xff;
                                m1.is = abyte0[l9++] & 0xff;
                                m1.es = abyte0[l9++] & 0xff;
                                m1.ps = abyte0[l9++] & 0xff;
                            } else {
                                l9 += 14;
                                int i31 = p.wn(abyte0[l9]);
                                l9 += i31 + 1;
                            }
                        } else
                        if(byte4 == 6) {
                            byte byte6 = abyte0[l9];
                            l9++;
                            if(m1 != null) {
                                String s2 = p.qn(abyte0, l9, byte6, false);
                                m1.xr = 150;
                                m1.wr = s2;
                                if(m1 == cw)
                                    sk(m1.ir + ": " + m1.wr, 5);
                            }
                            l9 += byte6;
                        }
                    }

                    return;
                }
                if(i1 == 249) {
                    for(int l2 = 1; l2 < j1;)
                        if(p.wn(abyte0[l2]) == 255) {
                            int i10 = 0;
                            int i16 = dw + abyte0[l2 + 1] >> 3;
                            int i20 = ew + abyte0[l2 + 2] >> 3;
                            l2 += 3;
                            for(int j24 = 0; j24 < fx; j24++) {
                                int i27 = (hx[j24] >> 3) - i16;
                                int j31 = (ix[j24] >> 3) - i20;
                                if(i27 != 0 || j31 != 0) {
                                    if(j24 != i10) {
                                        gx[i10] = gx[j24];
                                        gx[i10].wh = i10 + 10000;
                                        hx[i10] = hx[j24];
                                        ix[i10] = ix[j24];
                                        jx[i10] = jx[j24];
                                        kx[i10] = kx[j24];
                                    }
                                    i10++;
                                } else {
                                    cu.ei(gx[j24]);
                                    xu.go(hx[j24], ix[j24], jx[j24], kx[j24]);
                                }
                            }

                            fx = i10;
                        } else {
                            int j10 = p.zn(abyte0, l2);
                            l2 += 2;
                            int j16 = dw + abyte0[l2++];
                            int j20 = ew + abyte0[l2++];
                            byte byte3 = abyte0[l2++];
                            int j27 = 0;
                            for(int k31 = 0; k31 < fx; k31++)
                                if(hx[k31] != j16 || ix[k31] != j20 || jx[k31] != byte3) {
                                    if(k31 != j27) {
                                        gx[j27] = gx[k31];
                                        gx[j27].wh = j27 + 10000;
                                        hx[j27] = hx[k31];
                                        ix[j27] = ix[k31];
                                        jx[j27] = jx[k31];
                                        kx[j27] = kx[k31];
                                    }
                                    j27++;
                                } else {
                                    cu.ei(gx[k31]);
                                    xu.go(hx[k31], ix[k31], jx[k31], kx[k31]);
                                }

                            fx = j27;
                            if(j10 != 65535) {
                                xu.ip(j16, j20, byte3, j10);
                                i i35 = jm(j16, j20, byte3, j10, fx);
                                gx[fx] = i35;
                                hx[fx] = j16;
                                ix[fx] = j20;
                                kx[fx] = j10;
                                jx[fx++] = byte3;
                            }
                        }

                    return;
                }
                if(i1 == 248) {
                    jw = iw;
                    iw = 0;
                    for(int i3 = 0; i3 < jw; i3++)
                        mw[i3] = lw[i3];

                    int k10 = 8;
                    int k16 = p.un(abyte0, k10, 8);
                    k10 += 8;
                    for(int k20 = 0; k20 < k16; k20++) {
                        m m2 = mw[k20];
                        int k27 = p.un(abyte0, k10, 1);
                        k10++;
                        if(k27 != 0) {
                            int l31 = p.un(abyte0, k10, 1);
                            k10++;
                            if(l31 == 0) {
                                int j35 = p.un(abyte0, k10, 3);
                                k10 += 3;
                                int i38 = m2.sr;
                                int l40 = m2.tr[i38];
                                int j42 = m2.ur[i38];
                                if(j35 == 2 || j35 == 1 || j35 == 3)
                                    l40 += gu;
                                if(j35 == 6 || j35 == 5 || j35 == 7)
                                    l40 -= gu;
                                if(j35 == 4 || j35 == 3 || j35 == 5)
                                    j42 += gu;
                                if(j35 == 0 || j35 == 1 || j35 == 7)
                                    j42 -= gu;
                                m2.qr = j35;
                                m2.sr = i38 = (i38 + 1) % 10;
                                m2.tr[i38] = l40;
                                m2.ur[i38] = j42;
                            } else {
                                int k35 = p.un(abyte0, k10, 4);
                                if((k35 & 0xc) == 12) {
                                    k10 += 2;
                                    continue;
                                }
                                m2.qr = p.un(abyte0, k10, 4);
                                k10 += 4;
                            }
                        }
                        lw[iw++] = m2;
                    }

                    while(k10 + 31 < j1 * 8)  {
                        int k24 = p.un(abyte0, k10, 11);
                        k10 += 11;
                        int l27 = p.un(abyte0, k10, 5);
                        k10 += 5;
                        if(l27 > 15)
                            l27 -= 32;
                        int i32 = p.un(abyte0, k10, 5);
                        k10 += 5;
                        if(i32 > 15)
                            i32 -= 32;
                        int l35 = p.un(abyte0, k10, 4);
                        k10 += 4;
                        int j38 = (dw + l27) * gu + 64;
                        int i41 = (ew + i32) * gu + 64;
                        int k42 = p.un(abyte0, k10, 8);
                        k10 += 8;
                        if(k42 >= t.mjb)
                            k42 = 24;
                        sm(k24, j38, i41, l35, k42);
                    }
                    return;
                }
                if(i1 == 247) {
                    int j3 = p.zn(abyte0, 1);
                    int l10 = 3;
                    for(int l16 = 0; l16 < j3; l16++) {
                        int l20 = p.zn(abyte0, l10);
                        l10 += 2;
                        m m3 = kw[l20];
                        int i28 = p.wn(abyte0[l10]);
                        l10++;
                        if(i28 == 1) {
                            int j32 = p.zn(abyte0, l10);
                            l10 += 2;
                            byte byte7 = abyte0[l10];
                            l10++;
                            if(m3 != null) {
                                String s3 = p.qn(abyte0, l10, byte7, false);
                                m3.xr = 150;
                                m3.wr = s3;
                                if(j32 == cw.jr)
                                    sk("@yel@" + t.njb[m3.nr][0] + ": " + m3.wr, 5);
                            }
                            l10 += byte7;
                        } else
                        if(i28 == 2) {
                            int k32 = p.wn(abyte0[l10]);
                            l10++;
                            int i36 = p.wn(abyte0[l10]);
                            l10++;
                            int k38 = p.wn(abyte0[l10]);
                            l10++;
                            if(m3 != null) {
                                m3.as = k32;
                                m3.bs = i36;
                                m3.cs = k38;
                                m3.ds = 200;
                            }
                        }
                    }

                    return;
                }
                if(i1 == 246) {
                    xbb = true;
                    int k3 = p.wn(abyte0[1]);
                    ybb = k3;
                    int i11 = 2;
                    for(int i17 = 0; i17 < k3; i17++) {
                        int i21 = p.wn(abyte0[i11]);
                        i11++;
                        zbb[i17] = new String(abyte0, i11, i21);
                        i11 += i21;
                    }

                    return;
                }
                if(i1 == 245) {
                    xbb = false;
                    return;
                }
                if(i1 == 244) {
                    jcb = true;
                    fw = p.zn(abyte0, 1);
                    yu = p.zn(abyte0, 3);
                    zu = p.zn(abyte0, 5);
                    ev = p.zn(abyte0, 7);
                    av = p.zn(abyte0, 9);
                    zu -= ev * av;
                    return;
                }
                if(i1 == 243) {
                    int l3 = 1;
                    for(int j11 = 0; j11 < 16; j11++)
                        vx[j11] = p.wn(abyte0[l3++]);

                    for(int j17 = 0; j17 < 16; j17++)
                        wx[j17] = p.wn(abyte0[l3++]);

                    for(int j21 = 0; j21 < 16; j21++) {
                        xx[j21] = p.yn(abyte0, l3);
                        l3 += 4;
                    }

                    zx = p.wn(abyte0[l3++]);
                    return;
                }
                if(i1 == 242) {
                    for(int i4 = 0; i4 < 5; i4++)
                        yx[i4] = p.wn(abyte0[1 + i4]);

                    return;
                }
                if(i1 == 241) {
                    hcb = 250;
                    return;
                }
                if(i1 == 240) {
                    int j4 = (j1 - 1) / 4;
                    for(int k11 = 0; k11 < j4; k11++) {
                        int k17 = dw + p.bo(abyte0, 1 + k11 * 4) >> 3;
                        int k21 = ew + p.bo(abyte0, 3 + k11 * 4) >> 3;
                        int l24 = 0;
                        for(int j28 = 0; j28 < pw; j28++) {
                            int l32 = (rw[j28] >> 3) - k17;
                            int j36 = (sw[j28] >> 3) - k21;
                            if(l32 != 0 || j36 != 0) {
                                if(j28 != l24) {
                                    rw[l24] = rw[j28];
                                    sw[l24] = sw[j28];
                                    tw[l24] = tw[j28];
                                    uw[l24] = uw[j28];
                                }
                                l24++;
                            }
                        }

                        pw = l24;
                        l24 = 0;
                        for(int i33 = 0; i33 < ww; i33++) {
                            int k36 = (yw[i33] >> 3) - k17;
                            int l38 = (zw[i33] >> 3) - k21;
                            if(k36 != 0 || l38 != 0) {
                                if(i33 != l24) {
                                    xw[l24] = xw[i33];
                                    xw[l24].wh = l24;
                                    yw[l24] = yw[i33];
                                    zw[l24] = zw[i33];
                                    ax[l24] = ax[i33];
                                    bx[l24] = bx[i33];
                                }
                                l24++;
                            } else {
                                cu.ei(xw[i33]);
                                xu.gp(yw[i33], zw[i33], ax[i33]);
                            }
                        }

                        ww = l24;
                        l24 = 0;
                        for(int l36 = 0; l36 < fx; l36++) {
                            int i39 = (hx[l36] >> 3) - k17;
                            int j41 = (ix[l36] >> 3) - k21;
                            if(i39 != 0 || j41 != 0) {
                                if(l36 != l24) {
                                    gx[l24] = gx[l36];
                                    gx[l24].wh = l24 + 10000;
                                    hx[l24] = hx[l36];
                                    ix[l24] = ix[l36];
                                    jx[l24] = jx[l36];
                                    kx[l24] = kx[l36];
                                }
                                l24++;
                            } else {
                                cu.ei(gx[l36]);
                                xu.go(hx[l36], ix[l36], jx[l36], kx[l36]);
                            }
                        }

                        fx = l24;
                    }

                    return;
                }
                if(i1 == 239) {
                    rfb = true;
                    return;
                }
                if(i1 == 238) {
                    int k4 = p.zn(abyte0, 1);
                    if(zv[k4] != null)
                        mab = zv[k4].ir;
                    lab = true;
                    tab = false;
                    uab = false;
                    nab = 0;
                    qab = 0;
                    return;
                }
                if(i1 == 237) {
                    lab = false;
                    yab = false;
                    return;
                }
                if(i1 == 236) {
                    qab = abyte0[1] & 0xff;
                    int l4 = 2;
                    for(int l11 = 0; l11 < qab; l11++) {
                        rab[l11] = p.zn(abyte0, l4);
                        l4 += 2;
                        sab[l11] = p.yn(abyte0, l4);
                        l4 += 4;
                    }

                    tab = false;
                    uab = false;
                    return;
                }
                if(i1 == 235) {
                    byte byte0 = abyte0[1];
                    if(byte0 == 1) {
                        tab = true;
                        return;
                    } else {
                        tab = false;
                        return;
                    }
                }
                if(i1 == 234) {
                    gbb = true;
                    int i5 = 1;
                    int i12 = abyte0[i5++] & 0xff;
                    byte byte2 = abyte0[i5++];
                    hbb = abyte0[i5++] & 0xff;
                    ibb = abyte0[i5++] & 0xff;
                    for(int l21 = 0; l21 < 40; l21++)
                        jbb[l21] = -1;

                    for(int i25 = 0; i25 < i12; i25++) {
                        jbb[i25] = p.zn(abyte0, i5);
                        i5 += 2;
                        kbb[i25] = p.zn(abyte0, i5);
                        i5 += 2;
                        lbb[i25] = abyte0[i5++];
                    }

                    if(byte2 == 1) {
                        int k28 = 39;
                        for(int j33 = 0; j33 < ox; j33++) {
                            if(k28 < i12)
                                break;
                            boolean flag1 = false;
                            for(int j39 = 0; j39 < 40; j39++) {
                                if(jbb[j39] != px[j33])
                                    continue;
                                flag1 = true;
                                break;
                            }

                            if(px[j33] == 10)
                                flag1 = true;
                            if(!flag1) {
                                jbb[k28] = px[j33] & 0x7fff;
                                kbb[k28] = 0;
                                lbb[k28] = 0;
                                k28--;
                            }
                        }

                    }
                    if(mbb >= 0 && mbb < 40 && jbb[mbb] != nbb) {
                        mbb = -1;
                        nbb = -2;
                        return;
                    }
                } else {
                    if(i1 == 233) {
                        gbb = false;
                        return;
                    }
                    if(i1 == 229) {
                        byte byte1 = abyte0[1];
                        if(byte1 == 1) {
                            uab = true;
                            return;
                        } else {
                            uab = false;
                            return;
                        }
                    }
                    if(i1 == 228) {
                        System.out.println("Got config");
                        sy = p.wn(abyte0[1]) == 1;
                        az = p.wn(abyte0[2]) == 1;
                        return;
                    }
                    if(i1 == 227) {
                        for(int j5 = 0; j5 < j1 - 1; j5++)
                            qy[j5] = abyte0[j5 + 1] == 1;

                        return;
                    }
                    if(i1 == 226) {
                        for(int k5 = 0; k5 < ny; k5++)
                            py[k5] = abyte0[k5 + 1] == 1;

                        return;
                    }
                    if(i1 == 224) {
                        aeb = true;
                        for(int l5 = 0; l5 < 5; l5++) {
                            jeb[l5] = l5;
                            keb[l5] = "~:" + jeb[l5];
                            beb.qd(geb[l5], "");
                            beb.qd(feb[l5], (l5 + 1) + ": " + ggb[jeb[l5]]);
                        }

                        return;
                    }
                    if(i1 == 222) {
                        obb = true;
                        int i6 = 1;
                        pbb = abyte0[i6++] & 0xff;
                        for(int j12 = 0; j12 < pbb; j12++) {
                            qbb[j12] = p.zn(abyte0, i6);
                            i6 += 2;
                            rbb[j12] = p.hn(abyte0, i6);
                            if(rbb[j12] >= 128)
                                i6 += 4;
                            else
                                i6++;
                        }

                        vl();
                        return;
                    }
                    if(i1 == 221) {
                        obb = false;
                        return;
                    }
                    if(i1 == 220) {
                        int j6 = abyte0[1] & 0xff;
                        xx[j6] = p.yn(abyte0, 2);
                        return;
                    }
                    if(i1 == 219) {
                        int k6 = p.zn(abyte0, 1);
                        if(zv[k6] != null)
                            yz = zv[k6].ir;
                        xz = true;
                        zz = 0;
                        cab = 0;
                        fab = false;
                        gab = false;
                        hab = false;
                        iab = false;
                        jab = false;
                        kab = false;
                        return;
                    }
                    if(i1 == 218) {
                        xz = false;
                        return;
                    }
                    if(i1 == 217) {
                        yab = true;
                        zab = false;
                        lab = false;
                        int l6 = 1;
                        xab = p.rn(abyte0, l6);
                        l6 += 8;
                        dbb = abyte0[l6++] & 0xff;
                        for(int k12 = 0; k12 < dbb; k12++) {
                            ebb[k12] = p.zn(abyte0, l6);
                            l6 += 2;
                            fbb[k12] = p.yn(abyte0, l6);
                            l6 += 4;
                        }

                        abb = abyte0[l6++] & 0xff;
                        for(int l17 = 0; l17 < abb; l17++) {
                            bbb[l17] = p.zn(abyte0, l6);
                            l6 += 2;
                            cbb[l17] = p.yn(abyte0, l6);
                            l6 += 4;
                        }

                        return;
                    }
                    if(i1 == 216) {
                        cab = abyte0[1] & 0xff;
                        int i7 = 2;
                        for(int l12 = 0; l12 < cab; l12++) {
                            dab[l12] = p.zn(abyte0, i7);
                            i7 += 2;
                            eab[l12] = p.yn(abyte0, i7);
                            i7 += 4;
                        }

                        fab = false;
                        gab = false;
                        return;
                    }
                    if(i1 != 215) {
                        if(i1 == 214) {
                            int j7 = 1;
                            int i13 = abyte0[j7++] & 0xff;
                            int i18 = p.zn(abyte0, j7);
                            j7 += 2;
                            int i22 = p.hn(abyte0, j7);
                            if(i22 >= 128)
                                j7 += 4;
                            else
                                j7++;
                            if(i22 == 0) {
                                pbb--;
                                for(int j25 = i13; j25 < pbb; j25++) {
                                    qbb[j25] = qbb[j25 + 1];
                                    rbb[j25] = rbb[j25 + 1];
                                }

                            } else {
                                qbb[i13] = i18;
                                rbb[i13] = i22;
                                if(i13 >= pbb)
                                    pbb = i13 + 1;
                            }
                            vl();
                            return;
                        }
                        if(i1 == 213) {
                            int k7 = 1;
                            int j13 = 1;
                            int j18 = abyte0[k7++] & 0xff;
                            int j22 = p.zn(abyte0, k7);
                            k7 += 2;
                            if(t.zib[j22 & 0x7fff] == 0) {
                                j13 = p.hn(abyte0, k7);
                                if(j13 >= 128)
                                    k7 += 4;
                                else
                                    k7++;
                            }
                            px[j18] = j22 & 0x7fff;
                            rx[j18] = j22 / 32768;
                            qx[j18] = j13;
                            if(j18 >= ox) {
                                ox = j18 + 1;
                                return;
                            }
                        } else {
                            if(i1 == 212) {
                                int l7 = abyte0[1] & 0xff;
                                ox--;
                                for(int k13 = l7; k13 < ox; k13++) {
                                    px[k13] = px[k13 + 1];
                                    qx[k13] = qx[k13 + 1];
                                    rx[k13] = rx[k13 + 1];
                                }

                                return;
                            }
                            if(i1 == 211) {
                                int i8 = 1;
                                int l13 = abyte0[i8++] & 0xff;
                                vx[l13] = p.wn(abyte0[i8++]);
                                wx[l13] = p.wn(abyte0[i8++]);
                                xx[l13] = p.yn(abyte0, i8);
                                i8 += 4;
                            }
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception) {
            if(jt < 3) {
                super.dd.gb(17);
                super.dd.zb(runtimeexception.toString());
                super.dd.xb();
                super.dd.gb(17);
                super.dd.zb("p-type:" + i1 + " p-size:" + j1);
                super.dd.xb();
                super.dd.gb(17);
                super.dd.zb("rx:" + dw + " ry:" + ew + " num3l:" + ww);
                super.dd.xb();
                String s = "";
                for(int k18 = 0; k18 < 80 && k18 < j1; k18++)
                    s = s + abyte0[k18] + " ";

                super.dd.gb(17);
                super.dd.zb(s);
                super.dd.xb();
                jt++;
            }
        }
    }

    public void vl() {
        sbb = pbb;
        for(int i1 = 0; i1 < pbb; i1++) {
            tbb[i1] = qbb[i1];
            ubb[i1] = rbb[i1];
        }

        for(int j1 = 0; j1 < ox; j1++) {
            if(sbb >= 48)
                break;
            int k1 = px[j1];
            boolean flag = false;
            for(int l1 = 0; l1 < sbb; l1++) {
                if(tbb[l1] != k1)
                    continue;
                flag = true;
                break;
            }

            if(!flag) {
                tbb[sbb] = k1;
                ubb[sbb] = 0;
                sbb++;
            }
        }

    }

    public boolean km(int i1) {
        int j1 = cw.lr / 128;
        int k1 = cw.mr / 128;
        for(int l1 = 2; l1 >= 1; l1--) {
            if(i1 == 1 && ((xu.qhb[j1][k1 - l1] & 0x80) == 128 || (xu.qhb[j1 - l1][k1] & 0x80) == 128 || (xu.qhb[j1 - l1][k1 - l1] & 0x80) == 128))
                return false;
            if(i1 == 3 && ((xu.qhb[j1][k1 + l1] & 0x80) == 128 || (xu.qhb[j1 - l1][k1] & 0x80) == 128 || (xu.qhb[j1 - l1][k1 + l1] & 0x80) == 128))
                return false;
            if(i1 == 5 && ((xu.qhb[j1][k1 + l1] & 0x80) == 128 || (xu.qhb[j1 + l1][k1] & 0x80) == 128 || (xu.qhb[j1 + l1][k1 + l1] & 0x80) == 128))
                return false;
            if(i1 == 7 && ((xu.qhb[j1][k1 - l1] & 0x80) == 128 || (xu.qhb[j1 + l1][k1] & 0x80) == 128 || (xu.qhb[j1 + l1][k1 - l1] & 0x80) == 128))
                return false;
            if(i1 == 0 && (xu.qhb[j1][k1 - l1] & 0x80) == 128)
                return false;
            if(i1 == 2 && (xu.qhb[j1 - l1][k1] & 0x80) == 128)
                return false;
            if(i1 == 4 && (xu.qhb[j1][k1 + l1] & 0x80) == 128)
                return false;
            if(i1 == 6 && (xu.qhb[j1 + l1][k1] & 0x80) == 128)
                return false;
        }

        return true;
    }

    public void sl() {
        if((qv & 1) == 1 && km(qv))
            return;
        if((qv & 1) == 0 && km(qv)) {
            if(km(qv + 1 & 7)) {
                qv = qv + 1 & 7;
                return;
            }
            if(km(qv + 7 & 7))
                qv = qv + 7 & 7;
            return;
        }
        int ai[] = {
            1, -1, 2, -2, 3, -3, 4
        };
        for(int i1 = 0; i1 < 7; i1++) {
            if(!km(qv + ai[i1] + 8 & 7))
                continue;
            qv = qv + ai[i1] + 8 & 7;
            break;
        }

        if((qv & 1) == 0 && km(qv)) {
            if(km(qv + 1 & 7)) {
                qv = qv + 1 & 7;
                return;
            }
            if(km(qv + 7 & 7))
                qv = qv + 7 & 7;
            return;
        } else {
            return;
        }
    }

    public void fl() {
        if(hcb != 0) {
            du.lf();
            du.zg("Oh dear! You are dead...", iu / 2, ju / 2, 7, 0xff0000);
            hl();
            du.pf(bu, 0, 11);
            return;
        }
        if(rfb) {
            tk();
            return;
        }
        if(aeb) {
            pk();
            return;
        }
        if(!xu.shb)
            return;
        for(int i1 = 0; i1 < 64; i1++) {
            cu.ei(xu.vhb[bv][i1]);
            if(bv == 0) {
                cu.ei(xu.uhb[1][i1]);
                cu.ei(xu.vhb[1][i1]);
                cu.ei(xu.uhb[2][i1]);
                cu.ei(xu.vhb[2][i1]);
            }
            nv = true;
            if(bv == 0 && (xu.qhb[cw.lr / 128][cw.mr / 128] & 0x80) == 0) {
                cu.ai(xu.vhb[bv][i1]);
                if(bv == 0) {
                    cu.ai(xu.uhb[1][i1]);
                    cu.ai(xu.vhb[1][i1]);
                    cu.ai(xu.uhb[2][i1]);
                    cu.ai(xu.vhb[2][i1]);
                }
                nv = false;
            }
        }

        if(qu != su) {
            su = qu;
            for(int j1 = 0; j1 < ww; j1++) {
                if(ax[j1] == 51) {
                    int i2 = yw[j1];
                    int i3 = zw[j1];
                    int j4 = i2 - cw.lr / 128;
                    int k5 = i3 - cw.mr / 128;
                    byte byte0 = 7;
                    if(i2 >= 0 && i3 >= 0 && i2 < 96 && i3 < 96 && j4 > -byte0 && j4 < byte0 && k5 > -byte0 && k5 < byte0) {
                        cu.ei(xw[j1]);
                        String s1 = "torcha" + (qu + 1);
                        int j11 = t.vp(s1);
                        i k12 = cx[j11].we();
                        cu.ai(k12);
                        k12.ye(true, 48, 48, -50, -10, -50);
                        k12.ee(xw[j1]);
                        k12.wh = j1;
                        xw[j1] = k12;
                    }
                }
                if(ax[j1] == 143) {
                    int j2 = yw[j1];
                    int j3 = zw[j1];
                    int k4 = j2 - cw.lr / 128;
                    int l5 = j3 - cw.mr / 128;
                    byte byte1 = 7;
                    if(j2 >= 0 && j3 >= 0 && j2 < 96 && j3 < 96 && k4 > -byte1 && k4 < byte1 && l5 > -byte1 && l5 < byte1) {
                        cu.ei(xw[j1]);
                        String s2 = "skulltorcha" + (qu + 1);
                        int k11 = t.vp(s2);
                        i l12 = cx[k11].we();
                        cu.ai(l12);
                        l12.ye(true, 48, 48, -50, -10, -50);
                        l12.ee(xw[j1]);
                        l12.wh = j1;
                        xw[j1] = l12;
                    }
                }
            }

        }
        if(ru != tu) {
            tu = ru;
            for(int k1 = 0; k1 < ww; k1++)
                if(ax[k1] == 97) {
                    int k2 = yw[k1];
                    int k3 = zw[k1];
                    int l4 = k2 - cw.lr / 128;
                    int i6 = k3 - cw.mr / 128;
                    byte byte2 = 9;
                    if(k2 >= 0 && k3 >= 0 && k2 < 96 && k3 < 96 && l4 > -byte2 && l4 < byte2 && i6 > -byte2 && i6 < byte2) {
                        cu.ei(xw[k1]);
                        String s3 = "firea" + (ru + 1);
                        int l11 = t.vp(s3);
                        i i13 = cx[l11].we();
                        cu.ai(i13);
                        i13.ye(true, 48, 48, -50, -10, -50);
                        i13.ee(xw[k1]);
                        i13.wh = k1;
                        xw[k1] = i13;
                    }
                }

        }
        cu.pi(yv);
        yv = 0;
        for(int l1 = 0; l1 < wv; l1++) {
            m m1 = aw[l1];
            if(m1.hs != 255) {
                int l3 = m1.lr;
                int i5 = m1.mr;
                int j6 = -xu.po(l3, i5);
                int l8 = cu.rh(5000 + l1, l3, j6, i5, 145, 220, l1 + 10000);
                yv++;
                if(m1 == cw)
                    cu.sh(l8);
                if(m1.pr == 8)
                    cu.ti(l8, -30);
                if(m1.pr == 9)
                    cu.ti(l8, 30);
            }
        }

        for(int l2 = 0; l2 < wv; l2++) {
            m m2 = aw[l2];
            if(m2.ms > 0) {
                m m3 = null;
                if(m2.ls != -1)
                    m3 = kw[m2.ls];
                else
                if(m2.ks != -1)
                    m3 = zv[m2.ks];
                if(m3 != null) {
                    int k6 = m2.lr;
                    int i9 = m2.mr;
                    int l10 = -xu.po(k6, i9) - 110;
                    int i12 = m3.lr;
                    int j13 = m3.mr;
                    int k13 = -xu.po(i12, j13) - t.kkb[m3.nr] / 2;
                    int l13 = (k6 * m2.ms + i12 * (nu - m2.ms)) / nu;
                    int i14 = (l10 * m2.ms + k13 * (nu - m2.ms)) / nu;
                    int j14 = (i9 * m2.ms + j13 * (nu - m2.ms)) / nu;
                    cu.rh(ou + m2.js, l13, i14, j14, 32, 32, 0);
                    yv++;
                }
            }
        }

        for(int i4 = 0; i4 < iw; i4++) {
            m m4 = lw[i4];
            int l6 = m4.lr;
            int j9 = m4.mr;
            int i11 = -xu.po(l6, j9);
            int j12 = cu.rh(20000 + i4, l6, i11, j9, t.jkb[m4.nr], t.kkb[m4.nr], i4 + 30000);
            yv++;
            if(m4.pr == 8)
                cu.ti(j12, -30);
            if(m4.pr == 9)
                cu.ti(j12, 30);
        }

        for(int j5 = 0; j5 < pw; j5++) {
            int i7 = rw[j5] * gu + 64;
            int k9 = sw[j5] * gu + 64;
            cu.rh(40000 + tw[j5], i7, -xu.po(i7, k9) - uw[j5], k9, 96, 64, j5 + 20000);
            yv++;
        }

        du.zk = false;
        du.rf();
        du.zk = super.br;
        if(bv == 3) {
            int j7 = 40 + (int)(Math.random() * 3D);
            int l9 = 40 + (int)(Math.random() * 7D);
            cu.ej(j7, l9, -50, -10, -50);
        }
        ffb = 0;
        zeb = 0;
        kfb = 0;
        if(ry) {
            if(sy && !nv) {
                int k7 = qv;
                sl();
                if(qv != k7) {
                    ov = cw.lr;
                    pv = cw.mr;
                }
            }
            cu.mm = 3000;
            cu.nm = 3000;
            cu.om = 1;
            cu.pm = 2800;
            sv = qv * 32;
            int l7 = ov + wt;
            int i10 = pv + yt;
            cu.fi(l7, -xu.po(l7, i10), i10, 912, sv * 4, 0, 2000);
        } else {
            if(sy && !nv)
                sl();
            if(!super.br) {
                cu.mm = 2400;
                cu.nm = 2400;
                cu.om = 1;
                cu.pm = 2300;
            } else {
                cu.mm = 2200;
                cu.nm = 2200;
                cu.om = 1;
                cu.pm = 2100;
            }
            int i8 = ov + wt;
            int j10 = pv + yt;
            cu.fi(i8, -xu.po(i8, j10), j10, 912, sv * 4, 0, mv * 2);
        }
        cu.bj();
        wl();
        if(uu > 0)
            du.dh(vu - 8, wu - 8, mu + 14 + (24 - uu) / 6);
        if(uu < 0)
            du.dh(vu - 8, wu - 8, mu + 18 + (24 + uu) / 6);
        if(!jcb) {
            int j8 = 2203 - (ew + zu + dv);
            if(j8 > 0) {
                int k10 = 1 + j8 / 6;
                du.dh(453, ju - 56, mu + 13);
                du.zg("Wilderness", 465, ju - 20, 1, 0xffff00);
                du.zg("Level: " + k10, 465, ju - 7, 1, 0xffff00);
                if(icb == 0)
                    icb = 2;
            }
            if(icb == 0 && j8 > -10 && j8 <= 0)
                icb = 1;
        }
        if(tz == 0) {
            for(int k8 = 0; k8 < uz; k8++)
                if(wz[k8] > 0) {
                    String s = vz[k8];
                    du.sf(s, 7, ju - 18 - k8 * 12, 1, 0xffff00);
                }

        }
        oz.wd(pz);
        oz.wd(rz);
        oz.wd(sz);
        if(tz == 1)
            oz.kd(pz);
        else
        if(tz == 2)
            oz.kd(rz);
        else
        if(tz == 3)
            oz.kd(sz);
        h.pg = 2;
        oz.nc();
        h.pg = 0;
        du.vg(((j) (du)).ak - 3 - 197, 3, mu, 128);
        qk();
        du.dl = false;
        hl();
        du.pf(bu, 0, 11);
    }

    public void hl() {
        du.dh(0, ju - 4, mu + 23);
        int i1 = j.pg(200, 200, 255);
        if(tz == 0)
            i1 = j.pg(255, 200, 50);
        if(kz % 30 > 15)
            i1 = j.pg(255, 50, 50);
        du.zg("All messages", 54, ju + 6, 0, i1);
        i1 = j.pg(200, 200, 255);
        if(tz == 1)
            i1 = j.pg(255, 200, 50);
        if(lz % 30 > 15)
            i1 = j.pg(255, 50, 50);
        du.zg("Chat history", 155, ju + 6, 0, i1);
        i1 = j.pg(200, 200, 255);
        if(tz == 2)
            i1 = j.pg(255, 200, 50);
        if(mz % 30 > 15)
            i1 = j.pg(255, 50, 50);
        du.zg("Quest history", 255, ju + 6, 0, i1);
        i1 = j.pg(200, 200, 255);
        if(tz == 3)
            i1 = j.pg(255, 200, 50);
        if(nz % 30 > 15)
            i1 = j.pg(255, 50, 50);
        du.zg("Private history", 355, ju + 6, 0, i1);
    }

    public void ym(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
        int l2 = t.xib[i2] + qw;
        int i3 = t.jjb[i2];
        du.bg(i1, j1, k1, l1, l2, i3, 0, 0, false);
    }

    public void dn(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
        m m1 = lw[i2];
        int l2 = m1.pr + (sv + 16) / 32 & 7;
        boolean flag = false;
        int i3 = l2;
        if(i3 == 5) {
            i3 = 3;
            flag = true;
        } else
        if(i3 == 6) {
            i3 = 2;
            flag = true;
        } else
        if(i3 == 7) {
            i3 = 1;
            flag = true;
        }
        int j3 = i3 * 3 + dgb[(m1.or / t.lkb[m1.nr]) % 4];
        if(m1.pr == 8) {
            i3 = 5;
            l2 = 2;
            flag = false;
            i1 -= (t.nkb[m1.nr] * k2) / 100;
            j3 = i3 * 3 + egb[(nt / (t.mkb[m1.nr] - 1)) % 8];
        } else
        if(m1.pr == 9) {
            i3 = 5;
            l2 = 2;
            flag = true;
            i1 += (t.nkb[m1.nr] * k2) / 100;
            j3 = i3 * 3 + fgb[(nt / t.mkb[m1.nr]) % 8];
        }
        for(int k3 = 0; k3 < 12; k3++) {
            int l3 = qfb[l2][k3];
            int k4 = t.ekb[m1.nr][l3];
            if(k4 >= 0) {
                int i5 = 0;
                int j5 = 0;
                int k5 = j3;
                if(flag && i3 >= 1 && i3 <= 3 && t.wkb[k4] == 1)
                    k5 += 15;
                if(i3 != 5 || t.vkb[k4] == 1) {
                    int l5 = k5 + t.xkb[k4];
                    i5 = (i5 * k1) / ((j) (du)).rk[l5];
                    j5 = (j5 * l1) / ((j) (du)).sk[l5];
                    int i6 = (k1 * ((j) (du)).rk[l5]) / ((j) (du)).rk[t.xkb[k4]];
                    i5 -= (i6 - k1) / 2;
                    int j6 = t.tkb[k4];
                    int k6 = 0;
                    if(j6 == 1) {
                        j6 = t.fkb[m1.nr];
                        k6 = t.ikb[m1.nr];
                    } else
                    if(j6 == 2) {
                        j6 = t.gkb[m1.nr];
                        k6 = t.ikb[m1.nr];
                    } else
                    if(j6 == 3) {
                        j6 = t.hkb[m1.nr];
                        k6 = t.ikb[m1.nr];
                    }
                    du.bg(i1 + i5, j1 + j5, i6, l1, l5, j6, k6, j2, flag);
                }
            }
        }

        if(m1.xr > 0) {
            dfb[zeb] = du.jf(m1.wr, 1) / 2;
            efb[zeb] = du.sg(1);
            if(dfb[zeb] > 300) {
                dfb[zeb] = 300;
                efb[zeb] *= 2;
            }
            bfb[zeb] = i1 + k1 / 2;
            cfb[zeb] = j1;
            afb[zeb++] = m1.wr;
        }
        if(m1.pr == 8 || m1.pr == 9 || m1.ds != 0) {
            if(m1.ds > 0) {
                int i4 = i1;
                if(m1.pr == 8)
                    i4 -= (20 * k2) / 100;
                else
                if(m1.pr == 9)
                    i4 += (20 * k2) / 100;
                int l4 = (m1.bs * 30) / m1.cs;
                lfb[kfb] = i4 + k1 / 2;
                mfb[kfb] = j1;
                nfb[kfb++] = l4;
            }
            if(m1.ds > 150) {
                int j4 = i1;
                if(m1.pr == 8)
                    j4 -= (10 * k2) / 100;
                else
                if(m1.pr == 9)
                    j4 += (10 * k2) / 100;
                du.dh((j4 + k1 / 2) - 12, (j1 + l1 / 2) - 12, mu + 12);
                du.zg(String.valueOf(m1.as), (j4 + k1 / 2) - 1, j1 + l1 / 2 + 5, 3, 0xffffff);
            }
        }
    }

    public void tl(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
        m m1 = aw[i2];
        if(m1.hs == 255)
            return;
        int l2 = m1.pr + (sv + 16) / 32 & 7;
        boolean flag = false;
        int i3 = l2;
        if(i3 == 5) {
            i3 = 3;
            flag = true;
        } else
        if(i3 == 6) {
            i3 = 2;
            flag = true;
        } else
        if(i3 == 7) {
            i3 = 1;
            flag = true;
        }
        int j3 = i3 * 3 + dgb[(m1.or / 6) % 4];
        if(m1.pr == 8) {
            i3 = 5;
            l2 = 2;
            flag = false;
            i1 -= (5 * k2) / 100;
            j3 = i3 * 3 + egb[(nt / 5) % 8];
        } else
        if(m1.pr == 9) {
            i3 = 5;
            l2 = 2;
            flag = true;
            i1 += (5 * k2) / 100;
            j3 = i3 * 3 + fgb[(nt / 6) % 8];
        }
        for(int k3 = 0; k3 < 12; k3++) {
            int l3 = qfb[l2][k3];
            int l4 = m1.vr[l3] - 1;
            if(l4 >= 0) {
                int k5 = 0;
                int i6 = 0;
                int j6 = j3;
                if(flag && i3 >= 1 && i3 <= 3)
                    if(t.wkb[l4] == 1)
                        j6 += 15;
                    else
                    if(l3 == 4 && i3 == 1) {
                        k5 = -22;
                        i6 = -3;
                        j6 = i3 * 3 + dgb[(2 + m1.or / 6) % 4];
                    } else
                    if(l3 == 4 && i3 == 2) {
                        k5 = 0;
                        i6 = -8;
                        j6 = i3 * 3 + dgb[(2 + m1.or / 6) % 4];
                    } else
                    if(l3 == 4 && i3 == 3) {
                        k5 = 26;
                        i6 = -5;
                        j6 = i3 * 3 + dgb[(2 + m1.or / 6) % 4];
                    } else
                    if(l3 == 3 && i3 == 1) {
                        k5 = 22;
                        i6 = 3;
                        j6 = i3 * 3 + dgb[(2 + m1.or / 6) % 4];
                    } else
                    if(l3 == 3 && i3 == 2) {
                        k5 = 0;
                        i6 = 8;
                        j6 = i3 * 3 + dgb[(2 + m1.or / 6) % 4];
                    } else
                    if(l3 == 3 && i3 == 3) {
                        k5 = -26;
                        i6 = 5;
                        j6 = i3 * 3 + dgb[(2 + m1.or / 6) % 4];
                    }
                if(i3 != 5 || t.vkb[l4] == 1) {
                    int k6 = j6 + t.xkb[l4];
                    k5 = (k5 * k1) / ((j) (du)).rk[k6];
                    i6 = (i6 * l1) / ((j) (du)).sk[k6];
                    int l6 = (k1 * ((j) (du)).rk[k6]) / ((j) (du)).rk[t.xkb[l4]];
                    k5 -= (l6 - k1) / 2;
                    int i7 = t.tkb[l4];
                    int j7 = cgb[m1.is];
                    if(i7 == 1)
                        i7 = bgb[m1.fs];
                    else
                    if(i7 == 2)
                        i7 = agb[m1.gs];
                    else
                    if(i7 == 3)
                        i7 = agb[m1.hs];
                    du.bg(i1 + k5, j1 + i6, l6, l1, k6, i7, j7, j2, flag);
                }
            }
        }

        if(m1.xr > 0) {
            dfb[zeb] = du.jf(m1.wr, 1) / 2;
            efb[zeb] = du.sg(1);
            if(dfb[zeb] > 300) {
                dfb[zeb] = 300;
                efb[zeb] *= 2;
            }
            bfb[zeb] = i1 + k1 / 2;
            cfb[zeb] = j1;
            afb[zeb++] = m1.wr;
        }
        if(m1.zr > 0) {
            gfb[ffb] = i1 + k1 / 2;
            hfb[ffb] = j1;
            ifb[ffb] = k2;
            jfb[ffb++] = m1.yr;
        }
        if(m1.pr == 8 || m1.pr == 9 || m1.ds != 0) {
            if(m1.ds > 0) {
                int i4 = i1;
                if(m1.pr == 8)
                    i4 -= (20 * k2) / 100;
                else
                if(m1.pr == 9)
                    i4 += (20 * k2) / 100;
                int i5 = (m1.bs * 30) / m1.cs;
                lfb[kfb] = i4 + k1 / 2;
                mfb[kfb] = j1;
                nfb[kfb++] = i5;
            }
            if(m1.ds > 150) {
                int j4 = i1;
                if(m1.pr == 8)
                    j4 -= (10 * k2) / 100;
                else
                if(m1.pr == 9)
                    j4 += (10 * k2) / 100;
                du.dh((j4 + k1 / 2) - 12, (j1 + l1 / 2) - 12, mu + 11);
                du.zg(String.valueOf(m1.as), (j4 + k1 / 2) - 1, j1 + l1 / 2 + 5, 3, 0xffffff);
            }
        }
        if(m1.ps == 1 && m1.zr == 0) {
            int k4 = j2 + i1 + k1 / 2;
            if(m1.pr == 8)
                k4 -= (20 * k2) / 100;
            else
            if(m1.pr == 9)
                k4 += (20 * k2) / 100;
            int j5 = (16 * k2) / 100;
            int l5 = (16 * k2) / 100;
            du.tf(k4 - j5 / 2, j1 - l5 / 2 - (10 * k2) / 100, j5, l5, mu + 13);
        }
    }

    public void wl() {
        for(int i1 = 0; i1 < zeb; i1++) {
            int j1 = bfb[i1];
            int l1 = cfb[i1];
            int k2 = dfb[i1];
            int j3 = efb[i1];
            boolean flag = true;
            while(flag)  {
                flag = false;
                for(int k4 = 0; k4 < i1; k4++)
                    if(l1 > cfb[k4] - efb[k4] && l1 - j3 < cfb[k4] && j1 - k2 < bfb[k4] + dfb[k4] && j1 + k2 > bfb[k4] - dfb[k4]) {
                        l1 = cfb[k4] - j3;
                        flag = true;
                    }

            }
            cfb[i1] = l1;
            du.fh(afb[i1], j1, l1, 1, 0xffff00, 300);
        }

        for(int k1 = 0; k1 < ffb; k1++) {
            int i2 = gfb[k1];
            int l2 = hfb[k1];
            int k3 = ifb[k1];
            int i4 = jfb[k1];
            int l4 = (39 * k3) / 100;
            int i5 = (27 * k3) / 100;
            int j5 = l2 - i5;
            du.ug(i2 - l4 / 2, j5, l4, i5, mu + 9, 85);
            int k5 = (36 * k3) / 100;
            int l5 = (24 * k3) / 100;
            du.bg(i2 - k5 / 2, (j5 + i5 / 2) - l5 / 2, k5, l5, t.xib[i4] + qw, t.jjb[i4], 0, 0, false);
        }

        for(int j2 = 0; j2 < kfb; j2++) {
            int i3 = lfb[j2];
            int l3 = mfb[j2];
            int j4 = nfb[j2];
            du.zf(i3 - 15, l3 - 3, j4, 5, 65280, 192);
            du.zf((i3 - 15) + j4, l3 - 3, 30 - j4, 5, 0xff0000, 192);
        }

    }

    public int ml(int i1) {
        int j1 = 0;
        for(int k1 = 0; k1 < ox; k1++)
            if(px[k1] == i1)
                if(t.zib[i1] == 1)
                    j1++;
                else
                    j1 += qx[k1];

        return j1;
    }

    public boolean rm(int i1, int j1) {
        if(i1 == 31 && an(197))
            return true;
        if(i1 == 32 && an(102))
            return true;
        if(i1 == 33 && an(101))
            return true;
        if(i1 == 34 && an(103))
            return true;
        return ml(i1) >= j1;
    }

    public boolean an(int i1) {
        for(int j1 = 0; j1 < ox; j1++)
            if(px[j1] == i1 && rx[j1] == 1)
                return true;

        return false;
    }

    public void cn(int i1, int j1, int k1) {
        du.qg(i1, j1, k1);
        du.qg(i1 - 1, j1, k1);
        du.qg(i1 + 1, j1, k1);
        du.qg(i1, j1 - 1, k1);
        du.qg(i1, j1 + 1, k1);
    }

    public void jl(int i1, int j1, int k1, int l1, boolean flag) {
        em(i1, j1, k1, l1, k1, l1, false, flag);
    }

    public void om(int i1, int j1, int k1, int l1, boolean flag) {
        if(em(i1, j1, k1, l1, k1, l1, false, flag)) {
            return;
        } else {
            em(i1, j1, k1, l1, k1, l1, true, flag);
            return;
        }
    }

    public void uk(int i1, int j1, int k1, int l1) {
        int i2;
        int j2;
        if(k1 == 0 || k1 == 4) {
            i2 = t.elb[l1];
            j2 = t.flb[l1];
        } else {
            j2 = t.elb[l1];
            i2 = t.flb[l1];
        }
        if(t.glb[l1] == 2 || t.glb[l1] == 3) {
            if(k1 == 0) {
                i1--;
                i2++;
            }
            if(k1 == 2)
                j2++;
            if(k1 == 4)
                i2++;
            if(k1 == 6) {
                j1--;
                j2++;
            }
            em(dw, ew, i1, j1, (i1 + i2) - 1, (j1 + j2) - 1, false, true);
            return;
        } else {
            em(dw, ew, i1, j1, (i1 + i2) - 1, (j1 + j2) - 1, true, true);
            return;
        }
    }

    public void gl(int i1, int j1, int k1) {
        if(k1 == 0) {
            em(dw, ew, i1, j1 - 1, i1, j1, false, true);
            return;
        }
        if(k1 == 1) {
            em(dw, ew, i1 - 1, j1, i1, j1, false, true);
            return;
        } else {
            em(dw, ew, i1, j1, i1, j1, true, true);
            return;
        }
    }

    public boolean em(int i1, int j1, int k1, int l1, int i2, int j2, boolean flag, 
            boolean flag1) {
        int k2 = xu.io(i1, j1, k1, l1, i2, j2, rt, st, flag);
        if(k2 == -1)
            return false;
        k2--;
        i1 = rt[k2];
        j1 = st[k2];
        k2--;
        if(flag1)
            super.dd.gb(215);
        else
            super.dd.gb(255);
        super.dd.dc(i1 + cv);
        super.dd.dc(j1 + dv);
        for(int l2 = k2; l2 >= 0 && l2 > k2 - 25; l2--) {
            super.dd.ec(rt[l2] - i1);
            super.dd.ec(st[l2] - j1);
        }

        super.dd.xb();
        uu = -24;
        vu = super.vq;
        wu = super.wq;
        return true;
    }

    public boolean wm(int i1, int j1) {
        if(hcb != 0) {
            xu.shb = false;
            return false;
        }
        jcb = false;
        i1 += yu;
        j1 += zu;
        if(bv == ev && i1 > fv && i1 < hv && j1 > gv && j1 < iv) {
            xu.shb = true;
            return false;
        }
        du.zg("Loading... Please wait", 256, 192, 1, 0xffffff);
        hl();
        du.pf(bu, 0, 11);
        int k1 = cv;
        int l1 = dv;
        int i2 = (i1 + 24) / 48;
        int j2 = (j1 + 24) / 48;
        bv = ev;
        cv = i2 * 48 - 48;
        dv = j2 * 48 - 48;
        fv = i2 * 48 - 32;
        gv = j2 * 48 - 32;
        hv = i2 * 48 + 32;
        iv = j2 * 48 + 32;
        xu.yo(i1, j1, bv);
        cv -= yu;
        dv -= zu;
        int k2 = cv - k1;
        int l2 = dv - l1;
        for(int i3 = 0; i3 < ww; i3++) {
            yw[i3] -= k2;
            zw[i3] -= l2;
            int j3 = yw[i3];
            int l3 = zw[i3];
            int k4 = ax[i3];
            i j5 = xw[i3];
            try {
                int i6 = bx[i3];
                int l6;
                int k7;
                if(i6 == 0 || i6 == 4) {
                    l6 = t.elb[k4];
                    k7 = t.flb[k4];
                } else {
                    k7 = t.elb[k4];
                    l6 = t.flb[k4];
                }
                int l7 = ((j3 + j3 + l6) * gu) / 2;
                int i8 = ((l3 + l3 + k7) * gu) / 2;
                if(j3 >= 0 && l3 >= 0 && j3 < 96 && l3 < 96) {
                    cu.ai(j5);
                    j5.me(l7, -xu.po(l7, i8), i8);
                    xu.wo(j3, l3, k4);
                    if(k4 == 74)
                        j5.fe(0, -480, 0);
                }
            }
            catch(RuntimeException runtimeexception) {
                System.out.println("Loc Error: " + runtimeexception.getMessage());
                System.out.println("i:" + i3 + " obj:" + j5);
                runtimeexception.printStackTrace();
            }
        }

        for(int k3 = 0; k3 < fx; k3++) {
            hx[k3] -= k2;
            ix[k3] -= l2;
            int i4 = hx[k3];
            int l4 = ix[k3];
            int k5 = kx[k3];
            int j6 = jx[k3];
            try {
                xu.ip(i4, l4, j6, k5);
                i i7 = jm(i4, l4, j6, k5, k3);
                gx[k3] = i7;
            }
            catch(RuntimeException runtimeexception1) {
                System.out.println("Bound Error: " + runtimeexception1.getMessage());
                runtimeexception1.printStackTrace();
            }
        }

        for(int j4 = 0; j4 < pw; j4++) {
            rw[j4] -= k2;
            sw[j4] -= l2;
        }

        for(int i5 = 0; i5 < wv; i5++) {
            m m1 = aw[i5];
            m1.lr -= k2 * gu;
            m1.mr -= l2 * gu;
            for(int k6 = 0; k6 <= m1.sr; k6++) {
                m1.tr[k6] -= k2 * gu;
                m1.ur[k6] -= l2 * gu;
            }

        }

        for(int l5 = 0; l5 < iw; l5++) {
            m m2 = lw[l5];
            m2.lr -= k2 * gu;
            m2.mr -= l2 * gu;
            for(int j7 = 0; j7 <= m2.sr; j7++) {
                m2.tr[j7] -= k2 * gu;
                m2.ur[j7] -= l2 * gu;
            }

        }

        xu.shb = true;
        return true;
    }

    public i jm(int i1, int j1, int k1, int l1, int i2) {
        int j2 = i1;
        int k2 = j1;
        int l2 = i1;
        int i3 = j1;
        int j3 = t.plb[l1];
        int k3 = t.qlb[l1];
        int l3 = t.olb[l1];
        i i4 = new i(4, 1);
        if(k1 == 0)
            l2 = i1 + 1;
        if(k1 == 1)
            i3 = j1 + 1;
        if(k1 == 2) {
            j2 = i1 + 1;
            i3 = j1 + 1;
        }
        if(k1 == 3) {
            l2 = i1 + 1;
            i3 = j1 + 1;
        }
        j2 *= gu;
        k2 *= gu;
        l2 *= gu;
        i3 *= gu;
        int j4 = i4.ue(j2, -xu.po(j2, k2), k2);
        int k4 = i4.ue(j2, -xu.po(j2, k2) - l3, k2);
        int l4 = i4.ue(l2, -xu.po(l2, i3) - l3, i3);
        int i5 = i4.ue(l2, -xu.po(l2, i3), i3);
        int ai[] = {
            j4, k4, l4, i5
        };
        i4.te(4, ai, j3, k3);
        i4.ye(false, 60, 24, -50, -10, -50);
        if(i1 >= 0 && j1 >= 0 && i1 < 96 && j1 < 96)
            cu.ai(i4);
        i4.wh = i2 + 10000;
        return i4;
    }

    public void qk() {
        if(fcb != 0)
            hm();
        else
        if(icb == 1)
            xm();
        else
        if(obb && gcb == 0)
            ul();
        else
        if(gbb && gcb == 0)
            yl();
        else
        if(yab)
            lm();
        else
        if(lab)
            pm();
        else
        if(xz)
            en();
        else
        if(ccb != 0)
            zl();
        else
        if(bcb != 0) {
            rk();
        } else {
            if(xbb)
                nl();
            if(cw.ds > 0)
                el();
            al();
            boolean flag = !xbb && !ty;
            if(flag)
                yy = 0;
            if(mx == 0 && flag)
                kl();
            if(mx == 1)
                bm(flag);
            if(mx == 2)
                wk(flag);
            if(mx == 3)
                xl(flag);
            if(mx == 4)
                bn(flag);
            if(mx == 5)
                vk(flag);
            if(mx == 6)
                zm(flag);
            if(!ty && !xbb)
                il();
            if(ty && !xbb)
                tm();
        }
        pt = 0;
    }

    public void nl() {
        if(pt != 0) {
            for(int i1 = 0; i1 < ybb; i1++) {
                if(super.vq >= du.jf(zbb[i1], 1) || super.wq <= i1 * 12 || super.wq >= 12 + i1 * 12)
                    continue;
                super.dd.gb(237);
                super.dd.ec(i1);
                super.dd.xb();
                break;
            }

            pt = 0;
            xbb = false;
            return;
        }
        for(int j1 = 0; j1 < ybb; j1++) {
            int k1 = 65535;
            if(super.vq < du.jf(zbb[j1], 1) && super.wq > j1 * 12 && super.wq < 12 + j1 * 12)
                k1 = 0xff0000;
            du.sf(zbb[j1], 6, 12 + j1 * 12, 1, k1);
        }

    }

    public void el() {
        byte byte0 = 7;
        byte byte1 = 15;
        char c1 = '\257';
        if(pt != 0) {
            for(int i1 = 0; i1 < 5; i1++) {
                if(i1 <= 0 || super.vq <= byte0 || super.vq >= byte0 + c1 || super.wq <= byte1 + i1 * 20 || super.wq >= byte1 + i1 * 20 + 20)
                    continue;
                acb = i1 - 1;
                pt = 0;
                super.dd.gb(231);
                super.dd.ec(acb);
                super.dd.xb();
                break;
            }

        }
        for(int j1 = 0; j1 < 5; j1++) {
            if(j1 == acb + 1)
                du.zf(byte0, byte1 + j1 * 20, c1, 20, j.pg(255, 0, 0), 128);
            else
                du.zf(byte0, byte1 + j1 * 20, c1, 20, j.pg(190, 190, 190), 128);
            du.wg(byte0, byte1 + j1 * 20, c1, 0);
            du.wg(byte0, byte1 + j1 * 20 + 20, c1, 0);
        }

        du.zg("Select combat style", byte0 + c1 / 2, byte1 + 16, 3, 0xffffff);
        du.zg("Controlled (+1 of each)", byte0 + c1 / 2, byte1 + 36, 3, 0);
        du.zg("Aggressive (+3 strength)", byte0 + c1 / 2, byte1 + 56, 3, 0);
        du.zg("Accurate   (+3 attack)", byte0 + c1 / 2, byte1 + 76, 3, 0);
        du.zg("Defensive  (+3 defense)", byte0 + c1 / 2, byte1 + 96, 3, 0);
    }

    public void hm() {
        du.dg(126, 137, 260, 60, 0);
        du.wf(126, 137, 260, 60, 0xffffff);
        du.zg("Logging out...", 256, 173, 5, 0xffffff);
    }

    public void xm() {
        int i1 = 97;
        du.dg(86, 77, 340, 180, 0);
        du.wf(86, 77, 340, 180, 0xffffff);
        du.zg("Warning! Proceed with caution", 256, i1, 4, 0xff0000);
        i1 += 26;
        du.zg("If you go much further north you will enter the", 256, i1, 1, 0xffffff);
        i1 += 13;
        du.zg("wilderness. This a very dangerous area where", 256, i1, 1, 0xffffff);
        i1 += 13;
        du.zg("other players can attack you!", 256, i1, 1, 0xffffff);
        i1 += 22;
        du.zg("The further north you go the more dangerous it", 256, i1, 1, 0xffffff);
        i1 += 13;
        du.zg("becomes, but the more treasure you will find.", 256, i1, 1, 0xffffff);
        i1 += 22;
        du.zg("In the wilderness an indicator at the bottom-right", 256, i1, 1, 0xffffff);
        i1 += 13;
        du.zg("of the screen will show the current level of danger", 256, i1, 1, 0xffffff);
        i1 += 22;
        int j1 = 0xffffff;
        if(super.wq > i1 - 12 && super.wq <= i1 && super.vq > 181 && super.vq < 331)
            j1 = 0xff0000;
        du.zg("Click here to close window", 256, i1, 1, j1);
        if(pt != 0) {
            if(super.wq > i1 - 12 && super.wq <= i1 && super.vq > 181 && super.vq < 331)
                icb = 2;
            if(super.vq < 86 || super.vq > 426 || super.wq < 77 || super.wq > 257)
                icb = 2;
            pt = 0;
        }
    }

    public void zl() {
        if(pt != 0) {
            pt = 0;
            if(super.vq < 106 || super.wq < 150 || super.vq > 406 || super.wq > 210) {
                ccb = 0;
                return;
            }
        }
        int i1 = 150;
        du.dg(106, i1, 300, 60, 0);
        du.wf(106, i1, 300, 60, 0xffffff);
        i1 += 22;
        if(ccb == 6) {
            du.zg("Please enter your current password", 256, i1, 4, 0xffffff);
            i1 += 25;
            String s = "*";
            for(int j1 = 0; j1 < super.cr.length(); j1++)
                s = "X" + s;

            du.zg(s, 256, i1, 4, 0xffffff);
            if(super.dr.length() > 0) {
                dcb = super.dr;
                super.cr = "";
                super.dr = "";
                ccb = 1;
                return;
            }
        } else
        if(ccb == 1) {
            du.zg("Please enter your new password", 256, i1, 4, 0xffffff);
            i1 += 25;
            String s1 = "*";
            for(int k1 = 0; k1 < super.cr.length(); k1++)
                s1 = "X" + s1;

            du.zg(s1, 256, i1, 4, 0xffffff);
            if(super.dr.length() > 0) {
                ecb = super.dr;
                super.cr = "";
                super.dr = "";
                if(ecb.length() >= 5) {
                    ccb = 2;
                    return;
                } else {
                    ccb = 5;
                    return;
                }
            }
        } else
        if(ccb == 2) {
            du.zg("Enter password again to confirm", 256, i1, 4, 0xffffff);
            i1 += 25;
            String s2 = "*";
            for(int l1 = 0; l1 < super.cr.length(); l1++)
                s2 = "X" + s2;

            du.zg(s2, 256, i1, 4, 0xffffff);
            if(super.dr.length() > 0)
                if(super.dr.equalsIgnoreCase(ecb)) {
                    ccb = 4;
                    y(dcb, ecb);
                    return;
                } else {
                    ccb = 3;
                    return;
                }
        } else {
            if(ccb == 3) {
                du.zg("Passwords do not match!", 256, i1, 4, 0xffffff);
                i1 += 25;
                du.zg("Press any key to close", 256, i1, 4, 0xffffff);
                return;
            }
            if(ccb == 4) {
                du.zg("Ok, your request has been sent", 256, i1, 4, 0xffffff);
                i1 += 25;
                du.zg("Press any key to close", 256, i1, 4, 0xffffff);
                return;
            }
            if(ccb == 5) {
                du.zg("Password must be at", 256, i1, 4, 0xffffff);
                i1 += 25;
                du.zg("least 5 letters long", 256, i1, 4, 0xffffff);
            }
        }
    }

    public void rk() {
        if(pt != 0) {
            pt = 0;
            if(bcb == 1 && (super.vq < 106 || super.wq < 145 || super.vq > 406 || super.wq > 215)) {
                bcb = 0;
                return;
            }
            if(bcb == 2 && (super.vq < 6 || super.wq < 145 || super.vq > 506 || super.wq > 215)) {
                bcb = 0;
                return;
            }
            if(bcb == 3 && (super.vq < 106 || super.wq < 145 || super.vq > 406 || super.wq > 215)) {
                bcb = 0;
                return;
            }
            if(super.vq > 236 && super.vq < 276 && super.wq > 193 && super.wq < 213) {
                bcb = 0;
                return;
            }
        }
        int i1 = 145;
        if(bcb == 1) {
            du.dg(106, i1, 300, 70, 0);
            du.wf(106, i1, 300, 70, 0xffffff);
            i1 += 20;
            du.zg("Enter name to add to friends list", 256, i1, 4, 0xffffff);
            i1 += 20;
            du.zg(super.cr + "*", 256, i1, 4, 0xffffff);
            if(super.dr.length() > 0) {
                String s = super.dr.trim();
                super.cr = "";
                super.dr = "";
                bcb = 0;
                if(s.length() > 0 && p.sn(s) != cw.hr)
                    u(s);
            }
        }
        if(bcb == 2) {
            du.dg(6, i1, 500, 70, 0);
            du.wf(6, i1, 500, 70, 0xffffff);
            i1 += 20;
            du.zg("Enter message to send to " + p.xn(jy), 256, i1, 4, 0xffffff);
            i1 += 20;
            du.zg(super.er + "*", 256, i1, 4, 0xffffff);
            if(super.fr.length() > 0) {
                String s1 = super.fr;
                super.er = "";
                super.fr = "";
                bcb = 0;
                int k1 = p.mn(s1);
                w(jy, p.ngb, k1);
                s1 = p.qn(p.ngb, 0, k1, true);
                i("@pri@You tell " + p.xn(jy) + ": " + s1);
            }
        }
        if(bcb == 3) {
            du.dg(106, i1, 300, 70, 0);
            du.wf(106, i1, 300, 70, 0xffffff);
            i1 += 20;
            du.zg("Enter name to add to ignore list", 256, i1, 4, 0xffffff);
            i1 += 20;
            du.zg(super.cr + "*", 256, i1, 4, 0xffffff);
            if(super.dr.length() > 0) {
                String s2 = super.dr.trim();
                super.cr = "";
                super.dr = "";
                bcb = 0;
                if(s2.length() > 0 && p.sn(s2) != cw.hr)
                    z(s2);
            }
        }
        int j1 = 0xffffff;
        if(super.vq > 236 && super.vq < 276 && super.wq > 193 && super.wq < 213)
            j1 = 0xffff00;
        du.zg("Cancel", 256, 208, 1, j1);
    }

    public void ul() {
        char c1 = '\u0198';
        char c2 = '\u014E';
        if(vbb >= sbb)
            vbb = -1;
        if(vbb >= 0 && vbb < 48 && tbb[vbb] != wbb) {
            vbb = -1;
            wbb = -2;
        }
        if(pt != 0) {
            pt = 0;
            int i1 = super.vq - (256 - c1 / 2);
            int k1 = super.wq - (170 - c2 / 2);
            if(i1 >= 0 && k1 >= 12 && i1 < 408 && k1 < 280) {
                int i2 = 0;
                for(int l2 = 0; l2 < 6; l2++) {
                    for(int j6 = 0; j6 < 8; j6++) {
                        int i7 = 7 + j6 * 49;
                        int l7 = 28 + l2 * 34;
                        if(i1 > i7 && i1 < i7 + 49 && k1 > l7 && k1 < l7 + 34 && i2 < sbb && tbb[i2] != -1) {
                            wbb = tbb[i2];
                            vbb = i2;
                        }
                        i2++;
                    }

                }

                i1 = 256 - c1 / 2;
                k1 = 170 - c2 / 2;
                int k6;
                if(vbb < 0)
                    k6 = -1;
                else
                    k6 = tbb[vbb];
                if(k6 != -1) {
                    int j2 = ubb[vbb];
                    if(t.zib[k6] == 1 && j2 > 1)
                        j2 = 1;
                    if(j2 >= 1 && super.vq >= i1 + 220 && super.wq >= k1 + 238 && super.vq < i1 + 250 && super.wq <= k1 + 249) {
                        super.dd.gb(206);
                        super.dd.dc(k6);
                        super.dd.dc(1);
                        super.dd.xb();
                    }
                    if(j2 >= 5 && super.vq >= i1 + 250 && super.wq >= k1 + 238 && super.vq < i1 + 280 && super.wq <= k1 + 249) {
                        super.dd.gb(206);
                        super.dd.dc(k6);
                        super.dd.dc(5);
                        super.dd.xb();
                    }
                    if(j2 >= 25 && super.vq >= i1 + 280 && super.wq >= k1 + 238 && super.vq < i1 + 305 && super.wq <= k1 + 249) {
                        super.dd.gb(206);
                        super.dd.dc(k6);
                        super.dd.dc(25);
                        super.dd.xb();
                    }
                    if(j2 >= 100 && super.vq >= i1 + 305 && super.wq >= k1 + 238 && super.vq < i1 + 335 && super.wq <= k1 + 249) {
                        super.dd.gb(206);
                        super.dd.dc(k6);
                        super.dd.dc(100);
                        super.dd.xb();
                    }
                    if(j2 >= 500 && super.vq >= i1 + 335 && super.wq >= k1 + 238 && super.vq < i1 + 368 && super.wq <= k1 + 249) {
                        super.dd.gb(206);
                        super.dd.dc(k6);
                        super.dd.dc(500);
                        super.dd.xb();
                    }
                    if(j2 >= 2500 && super.vq >= i1 + 370 && super.wq >= k1 + 238 && super.vq < i1 + 400 && super.wq <= k1 + 249) {
                        super.dd.gb(206);
                        super.dd.dc(k6);
                        super.dd.dc(2500);
                        super.dd.xb();
                    }
                    if(ml(k6) >= 1 && super.vq >= i1 + 220 && super.wq >= k1 + 263 && super.vq < i1 + 250 && super.wq <= k1 + 274) {
                        super.dd.gb(205);
                        super.dd.dc(k6);
                        super.dd.dc(1);
                        super.dd.xb();
                    }
                    if(ml(k6) >= 5 && super.vq >= i1 + 250 && super.wq >= k1 + 263 && super.vq < i1 + 280 && super.wq <= k1 + 274) {
                        super.dd.gb(205);
                        super.dd.dc(k6);
                        super.dd.dc(5);
                        super.dd.xb();
                    }
                    if(ml(k6) >= 25 && super.vq >= i1 + 280 && super.wq >= k1 + 263 && super.vq < i1 + 305 && super.wq <= k1 + 274) {
                        super.dd.gb(205);
                        super.dd.dc(k6);
                        super.dd.dc(25);
                        super.dd.xb();
                    }
                    if(ml(k6) >= 100 && super.vq >= i1 + 305 && super.wq >= k1 + 263 && super.vq < i1 + 335 && super.wq <= k1 + 274) {
                        super.dd.gb(205);
                        super.dd.dc(k6);
                        super.dd.dc(100);
                        super.dd.xb();
                    }
                    if(ml(k6) >= 500 && super.vq >= i1 + 335 && super.wq >= k1 + 263 && super.vq < i1 + 368 && super.wq <= k1 + 274) {
                        super.dd.gb(205);
                        super.dd.dc(k6);
                        super.dd.dc(500);
                        super.dd.xb();
                    }
                    if(ml(k6) >= 2500 && super.vq >= i1 + 370 && super.wq >= k1 + 263 && super.vq < i1 + 400 && super.wq <= k1 + 274) {
                        super.dd.gb(205);
                        super.dd.dc(k6);
                        super.dd.dc(2500);
                        super.dd.xb();
                    }
                }
            } else {
                super.dd.gb(207);
                super.dd.xb();
                obb = false;
                return;
            }
        }
        int j1 = 256 - c1 / 2;
        int l1 = 170 - c2 / 2;
        du.dg(j1, l1, 408, 12, 192);
        int k2 = 0x989898;
        du.zf(j1, l1 + 12, 408, 17, k2, 160);
        du.zf(j1, l1 + 29, 8, 204, k2, 160);
        du.zf(j1 + 399, l1 + 29, 9, 204, k2, 160);
        du.zf(j1, l1 + 233, 408, 47, k2, 160);
        du.sf("Bank", j1 + 1, l1 + 10, 1, 0xffffff);
        int i3 = 0xffffff;
        if(super.vq > j1 + 320 && super.wq >= l1 && super.vq < j1 + 408 && super.wq < l1 + 12)
            i3 = 0xff0000;
        du.eh("Close window", j1 + 406, l1 + 10, 1, i3);
        du.sf("Number in bank in green", j1 + 7, l1 + 24, 1, 65280);
        du.sf("Number held in blue", j1 + 289, l1 + 24, 1, 65535);
        int l6 = 0xd0d0d0;
        int j7 = 0;
        for(int i8 = 0; i8 < 6; i8++) {
            for(int j8 = 0; j8 < 8; j8++) {
                int l8 = j1 + 7 + j8 * 49;
                int i9 = l1 + 28 + i8 * 34;
                if(vbb == j7)
                    du.zf(l8, i9, 49, 34, 0xff0000, 160);
                else
                    du.zf(l8, i9, 49, 34, l6, 160);
                du.wf(l8, i9, 50, 35, 0);
                if(j7 < sbb && tbb[j7] != -1) {
                    du.bg(l8, i9, 48, 32, qw + t.xib[tbb[j7]], t.jjb[tbb[j7]], 0, 0, false);
                    du.sf(String.valueOf(ubb[j7]), l8 + 1, i9 + 10, 1, 65280);
                    du.eh(String.valueOf(ml(tbb[j7])), l8 + 47, i9 + 29, 1, 65535);
                }
                j7++;
            }

        }

        du.wg(j1 + 5, l1 + 256, 398, 0);
        if(vbb == -1) {
            du.zg("Select an object to withdraw or deposit", j1 + 204, l1 + 248, 3, 0xffff00);
            return;
        }
        int k8;
        if(vbb < 0)
            k8 = -1;
        else
            k8 = tbb[vbb];
        if(k8 != -1) {
            int k7 = ubb[vbb];
            if(t.zib[k8] == 1 && k7 > 1)
                k7 = 1;
            if(k7 > 0) {
                du.sf("Withdraw " + t.tib[k8][0], j1 + 2, l1 + 248, 1, 0xffffff);
                int j3 = 0xffffff;
                if(super.vq >= j1 + 220 && super.wq >= l1 + 238 && super.vq < j1 + 250 && super.wq <= l1 + 249)
                    j3 = 0xff0000;
                du.sf("One", j1 + 222, l1 + 248, 1, j3);
                if(k7 >= 5) {
                    int k3 = 0xffffff;
                    if(super.vq >= j1 + 250 && super.wq >= l1 + 238 && super.vq < j1 + 280 && super.wq <= l1 + 249)
                        k3 = 0xff0000;
                    du.sf("Five", j1 + 252, l1 + 248, 1, k3);
                }
                if(k7 >= 25) {
                    int l3 = 0xffffff;
                    if(super.vq >= j1 + 280 && super.wq >= l1 + 238 && super.vq < j1 + 305 && super.wq <= l1 + 249)
                        l3 = 0xff0000;
                    du.sf("25", j1 + 282, l1 + 248, 1, l3);
                }
                if(k7 >= 100) {
                    int i4 = 0xffffff;
                    if(super.vq >= j1 + 305 && super.wq >= l1 + 238 && super.vq < j1 + 335 && super.wq <= l1 + 249)
                        i4 = 0xff0000;
                    du.sf("100", j1 + 307, l1 + 248, 1, i4);
                }
                if(k7 >= 500) {
                    int j4 = 0xffffff;
                    if(super.vq >= j1 + 335 && super.wq >= l1 + 238 && super.vq < j1 + 368 && super.wq <= l1 + 249)
                        j4 = 0xff0000;
                    du.sf("500", j1 + 337, l1 + 248, 1, j4);
                }
                if(k7 >= 2500) {
                    int k4 = 0xffffff;
                    if(super.vq >= j1 + 370 && super.wq >= l1 + 238 && super.vq < j1 + 400 && super.wq <= l1 + 249)
                        k4 = 0xff0000;
                    du.sf("2500", j1 + 370, l1 + 248, 1, k4);
                }
            }
            if(ml(k8) > 0) {
                du.sf("Deposit " + t.tib[k8][0], j1 + 2, l1 + 273, 1, 0xffffff);
                int l4 = 0xffffff;
                if(super.vq >= j1 + 220 && super.wq >= l1 + 263 && super.vq < j1 + 250 && super.wq <= l1 + 274)
                    l4 = 0xff0000;
                du.sf("One", j1 + 222, l1 + 273, 1, l4);
                if(ml(k8) >= 5) {
                    int i5 = 0xffffff;
                    if(super.vq >= j1 + 250 && super.wq >= l1 + 263 && super.vq < j1 + 280 && super.wq <= l1 + 274)
                        i5 = 0xff0000;
                    du.sf("Five", j1 + 252, l1 + 273, 1, i5);
                }
                if(ml(k8) >= 25) {
                    int j5 = 0xffffff;
                    if(super.vq >= j1 + 280 && super.wq >= l1 + 263 && super.vq < j1 + 305 && super.wq <= l1 + 274)
                        j5 = 0xff0000;
                    du.sf("25", j1 + 282, l1 + 273, 1, j5);
                }
                if(ml(k8) >= 100) {
                    int k5 = 0xffffff;
                    if(super.vq >= j1 + 305 && super.wq >= l1 + 263 && super.vq < j1 + 335 && super.wq <= l1 + 274)
                        k5 = 0xff0000;
                    du.sf("100", j1 + 307, l1 + 273, 1, k5);
                }
                if(ml(k8) >= 500) {
                    int l5 = 0xffffff;
                    if(super.vq >= j1 + 335 && super.wq >= l1 + 263 && super.vq < j1 + 368 && super.wq <= l1 + 274)
                        l5 = 0xff0000;
                    du.sf("500", j1 + 337, l1 + 273, 1, l5);
                }
                if(ml(k8) >= 2500) {
                    int i6 = 0xffffff;
                    if(super.vq >= j1 + 370 && super.wq >= l1 + 263 && super.vq < j1 + 400 && super.wq <= l1 + 274)
                        i6 = 0xff0000;
                    du.sf("2500", j1 + 370, l1 + 273, 1, i6);
                }
            }
        }
    }

    public void yl() {
        if(pt != 0) {
            pt = 0;
            int i1 = super.vq - 52;
            int j1 = super.wq - 44;
            if(i1 >= 0 && j1 >= 12 && i1 < 408 && j1 < 246) {
                int k1 = 0;
                for(int i2 = 0; i2 < 5; i2++) {
                    for(int i3 = 0; i3 < 8; i3++) {
                        int l3 = 7 + i3 * 49;
                        int l4 = 28 + i2 * 34;
                        if(i1 > l3 && i1 < l3 + 49 && j1 > l4 && j1 < l4 + 34 && jbb[k1] != -1) {
                            mbb = k1;
                            nbb = jbb[k1];
                        }
                        k1++;
                    }

                }

                if(mbb >= 0) {
                    int j3 = jbb[mbb];
                    if(j3 != -1) {
                        if(kbb[mbb] > 0 && i1 > 298 && j1 >= 204 && i1 < 408 && j1 <= 215) {
                            int i4 = ibb + lbb[mbb];
                            if(i4 < 10)
                                i4 = 10;
                            int i5 = (i4 * t.yib[j3]) / 100;
                            super.dd.gb(217);
                            super.dd.dc(jbb[mbb]);
                            super.dd.dc(i5);
                            super.dd.xb();
                        }
                        if(ml(j3) > 0 && i1 > 2 && j1 >= 229 && i1 < 112 && j1 <= 240) {
                            int j4 = hbb + lbb[mbb];
                            if(j4 < 10)
                                j4 = 10;
                            int j5 = (j4 * t.yib[j3]) / 100;
                            super.dd.gb(216);
                            super.dd.dc(jbb[mbb]);
                            super.dd.dc(j5);
                            super.dd.xb();
                        }
                    }
                }
            } else {
                super.dd.gb(218);
                super.dd.xb();
                gbb = false;
                return;
            }
        }
        byte byte0 = 52;
        byte byte1 = 44;
        du.dg(byte0, byte1, 408, 12, 192);
        int l1 = 0x989898;
        du.zf(byte0, byte1 + 12, 408, 17, l1, 160);
        du.zf(byte0, byte1 + 29, 8, 170, l1, 160);
        du.zf(byte0 + 399, byte1 + 29, 9, 170, l1, 160);
        du.zf(byte0, byte1 + 199, 408, 47, l1, 160);
        du.sf("Buying and selling items", byte0 + 1, byte1 + 10, 1, 0xffffff);
        int j2 = 0xffffff;
        if(super.vq > byte0 + 320 && super.wq >= byte1 && super.vq < byte0 + 408 && super.wq < byte1 + 12)
            j2 = 0xff0000;
        du.eh("Close window", byte0 + 406, byte1 + 10, 1, j2);
        du.sf("Shops stock in green", byte0 + 2, byte1 + 24, 1, 65280);
        du.sf("Number you own in blue", byte0 + 135, byte1 + 24, 1, 65535);
        du.sf("Your money: " + ml(10) + "gp", byte0 + 280, byte1 + 24, 1, 0xffff00);
        int k3 = 0xd0d0d0;
        int k4 = 0;
        for(int k5 = 0; k5 < 5; k5++) {
            for(int l5 = 0; l5 < 8; l5++) {
                int j6 = byte0 + 7 + l5 * 49;
                int i7 = byte1 + 28 + k5 * 34;
                if(mbb == k4)
                    du.zf(j6, i7, 49, 34, 0xff0000, 160);
                else
                    du.zf(j6, i7, 49, 34, k3, 160);
                du.wf(j6, i7, 50, 35, 0);
                if(jbb[k4] != -1) {
                    du.bg(j6, i7, 48, 32, qw + t.xib[jbb[k4]], t.jjb[jbb[k4]], 0, 0, false);
                    du.sf(String.valueOf(kbb[k4]), j6 + 1, i7 + 10, 1, 65280);
                    du.eh(String.valueOf(ml(jbb[k4])), j6 + 47, i7 + 10, 1, 65535);
                }
                k4++;
            }

        }

        du.wg(byte0 + 5, byte1 + 222, 398, 0);
        if(mbb == -1) {
            du.zg("Select an object to buy or sell", byte0 + 204, byte1 + 214, 3, 0xffff00);
            return;
        }
        int i6 = jbb[mbb];
        if(i6 != -1) {
            if(kbb[mbb] > 0) {
                int k6 = ibb + lbb[mbb];
                if(k6 < 10)
                    k6 = 10;
                int j7 = (k6 * t.yib[i6]) / 100;
                du.sf("Buy a new " + t.tib[i6][0] + " for " + j7 + "gp", byte0 + 2, byte1 + 214, 1, 0xffff00);
                int k2 = 0xffffff;
                if(super.vq > byte0 + 298 && super.wq >= byte1 + 204 && super.vq < byte0 + 408 && super.wq <= byte1 + 215)
                    k2 = 0xff0000;
                du.eh("Click here to buy", byte0 + 405, byte1 + 214, 3, k2);
            } else {
                du.zg("This item is not currently available to buy", byte0 + 204, byte1 + 214, 3, 0xffff00);
            }
            if(ml(i6) > 0) {
                int l6 = hbb + lbb[mbb];
                if(l6 < 10)
                    l6 = 10;
                int k7 = (l6 * t.yib[i6]) / 100;
                du.eh("Sell your " + t.tib[i6][0] + " for " + k7 + "gp", byte0 + 405, byte1 + 239, 1, 0xffff00);
                int l2 = 0xffffff;
                if(super.vq > byte0 + 2 && super.wq >= byte1 + 229 && super.vq < byte0 + 112 && super.wq <= byte1 + 240)
                    l2 = 0xff0000;
                du.sf("Click here to sell", byte0 + 2, byte1 + 239, 3, l2);
                return;
            }
            du.zg("You do not have any of this item to sell", byte0 + 204, byte1 + 239, 3, 0xffff00);
        }
    }

    public void lm() {
        byte byte0 = 22;
        byte byte1 = 36;
        du.dg(byte0, byte1, 468, 16, 192);
        int i1 = 0x989898;
        du.zf(byte0, byte1 + 16, 468, 246, i1, 160);
        du.zg("Please confirm your trade with @yel@" + p.xn(xab), byte0 + 234, byte1 + 12, 1, 0xffffff);
        du.zg("You are about to give:", byte0 + 117, byte1 + 30, 1, 0xffff00);
        for(int j1 = 0; j1 < nab; j1++) {
            String s = t.tib[oab[j1]][0];
            if(t.zib[oab[j1]] == 0)
                s = s + " (" + pab[j1] + ")";
            du.zg(s, byte0 + 117, byte1 + 42 + j1 * 12, 1, 0xffffff);
        }

        if(nab == 0)
            du.zg("Nothing!", byte0 + 117, byte1 + 42, 1, 0xffffff);
        du.zg("In return you will receive:", byte0 + 351, byte1 + 30, 1, 0xffff00);
        for(int k1 = 0; k1 < qab; k1++) {
            String s1 = t.tib[rab[k1]][0];
            if(t.zib[rab[k1]] == 0)
                s1 = s1 + " (" + sab[k1] + ")";
            du.zg(s1, byte0 + 351, byte1 + 42 + k1 * 12, 1, 0xffffff);
        }

        if(qab == 0)
            du.zg("Nothing!", byte0 + 351, byte1 + 42, 1, 0xffffff);
        du.zg("Are you sure you want to do this?", byte0 + 234, byte1 + 200, 4, 65535);
        du.zg("There is NO WAY to reverse a trade if you change your mind.", byte0 + 234, byte1 + 215, 1, 0xffffff);
        du.zg("Remember that not all players are trustworthy", byte0 + 234, byte1 + 230, 1, 0xffffff);
        if(!zab) {
            du.dh((byte0 + 118) - 35, byte1 + 238, mu + 25);
            du.dh((byte0 + 352) - 35, byte1 + 238, mu + 26);
        } else {
            du.zg("Waiting for other player...", byte0 + 234, byte1 + 250, 1, 0xffff00);
        }
        if(pt == 1) {
            if(super.vq < byte0 || super.wq < byte1 || super.vq > byte0 + 468 || super.wq > byte1 + 262) {
                yab = false;
                super.dd.gb(233);
                super.dd.xb();
            }
            if(super.vq >= (byte0 + 118) - 35 && super.vq <= byte0 + 118 + 70 && super.wq >= byte1 + 238 && super.wq <= byte1 + 238 + 21) {
                zab = true;
                super.dd.gb(202);
                super.dd.xb();
            }
            if(super.vq >= (byte0 + 352) - 35 && super.vq <= byte0 + 353 + 70 && super.wq >= byte1 + 238 && super.wq <= byte1 + 238 + 21) {
                yab = false;
                super.dd.gb(233);
                super.dd.xb();
            }
            pt = 0;
        }
    }

    public void pm() {
        if(pt != 0 && wab == 0)
            wab = 1;
        if(wab > 0) {
            int i1 = super.vq - 22;
            int j1 = super.wq - 36;
            if(i1 >= 0 && j1 >= 0 && i1 < 468 && j1 < 262) {
                if(i1 > 216 && j1 > 30 && i1 < 462 && j1 < 235) {
                    int k1 = (i1 - 217) / 49 + ((j1 - 31) / 34) * 5;
                    if(k1 >= 0 && k1 < ox) {
                        boolean flag = false;
                        int l2 = 0;
                        int k3 = px[k1];
                        for(int k4 = 0; k4 < nab; k4++)
                            if(oab[k4] == k3)
                                if(t.zib[k3] == 0) {
                                    for(int i5 = 0; i5 < wab; i5++) {
                                        if(pab[k4] < qx[k1])
                                            pab[k4]++;
                                        flag = true;
                                    }

                                } else {
                                    l2++;
                                }

                        if(ml(k3) <= l2)
                            flag = true;
                        if(!flag && nab < 12) {
                            oab[nab] = k3;
                            pab[nab] = 1;
                            nab++;
                            flag = true;
                        }
                        if(flag) {
                            super.dd.gb(234);
                            super.dd.ec(nab);
                            for(int j5 = 0; j5 < nab; j5++) {
                                super.dd.dc(oab[j5]);
                                super.dd.cc(pab[j5]);
                            }

                            super.dd.xb();
                            tab = false;
                            uab = false;
                        }
                    }
                }
                if(i1 > 8 && j1 > 30 && i1 < 205 && j1 < 133) {
                    int l1 = (i1 - 9) / 49 + ((j1 - 31) / 34) * 4;
                    if(l1 >= 0 && l1 < nab) {
                        int j2 = oab[l1];
                        for(int i3 = 0; i3 < wab; i3++) {
                            if(t.zib[j2] == 0 && pab[l1] > 1) {
                                pab[l1]--;
                                continue;
                            }
                            nab--;
                            vab = 0;
                            for(int l3 = l1; l3 < nab; l3++) {
                                oab[l3] = oab[l3 + 1];
                                pab[l3] = pab[l3 + 1];
                            }

                            break;
                        }

                        super.dd.gb(234);
                        super.dd.ec(nab);
                        for(int i4 = 0; i4 < nab; i4++) {
                            super.dd.dc(oab[i4]);
                            super.dd.cc(pab[i4]);
                        }

                        super.dd.xb();
                        tab = false;
                        uab = false;
                    }
                }
                if(i1 >= 217 && j1 >= 238 && i1 <= 286 && j1 <= 259) {
                    uab = true;
                    super.dd.gb(232);
                    super.dd.xb();
                }
                if(i1 >= 394 && j1 >= 238 && i1 < 463 && j1 < 259) {
                    lab = false;
                    super.dd.gb(233);
                    super.dd.xb();
                }
            } else
            if(pt != 0) {
                lab = false;
                super.dd.gb(233);
                super.dd.xb();
            }
            pt = 0;
            wab = 0;
        }
        if(!lab)
            return;
        byte byte0 = 22;
        byte byte1 = 36;
        du.dg(byte0, byte1, 468, 12, 192);
        int i2 = 0x989898;
        du.zf(byte0, byte1 + 12, 468, 18, i2, 160);
        du.zf(byte0, byte1 + 30, 8, 248, i2, 160);
        du.zf(byte0 + 205, byte1 + 30, 11, 248, i2, 160);
        du.zf(byte0 + 462, byte1 + 30, 6, 248, i2, 160);
        du.zf(byte0 + 8, byte1 + 133, 197, 22, i2, 160);
        du.zf(byte0 + 8, byte1 + 258, 197, 20, i2, 160);
        du.zf(byte0 + 216, byte1 + 235, 246, 43, i2, 160);
        int k2 = 0xd0d0d0;
        du.zf(byte0 + 8, byte1 + 30, 197, 103, k2, 160);
        du.zf(byte0 + 8, byte1 + 155, 197, 103, k2, 160);
        du.zf(byte0 + 216, byte1 + 30, 246, 205, k2, 160);
        for(int j3 = 0; j3 < 4; j3++)
            du.wg(byte0 + 8, byte1 + 30 + j3 * 34, 197, 0);

        for(int j4 = 0; j4 < 4; j4++)
            du.wg(byte0 + 8, byte1 + 155 + j4 * 34, 197, 0);

        for(int l4 = 0; l4 < 7; l4++)
            du.wg(byte0 + 216, byte1 + 30 + l4 * 34, 246, 0);

        for(int k5 = 0; k5 < 6; k5++) {
            if(k5 < 5)
                du.bh(byte0 + 8 + k5 * 49, byte1 + 30, 103, 0);
            if(k5 < 5)
                du.bh(byte0 + 8 + k5 * 49, byte1 + 155, 103, 0);
            du.bh(byte0 + 216 + k5 * 49, byte1 + 30, 205, 0);
        }

        du.sf("Trading with: " + mab, byte0 + 1, byte1 + 10, 1, 0xffffff);
        du.sf("Your Offer", byte0 + 9, byte1 + 27, 4, 0xffffff);
        du.sf("Opponent's Offer", byte0 + 9, byte1 + 152, 4, 0xffffff);
        du.sf("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
        if(!uab)
            du.dh(byte0 + 217, byte1 + 238, mu + 25);
        du.dh(byte0 + 394, byte1 + 238, mu + 26);
        if(tab) {
            du.zg("Other player", byte0 + 341, byte1 + 246, 1, 0xffffff);
            du.zg("has accepted", byte0 + 341, byte1 + 256, 1, 0xffffff);
        }
        if(uab) {
            du.zg("Waiting for", byte0 + 217 + 35, byte1 + 246, 1, 0xffffff);
            du.zg("other player", byte0 + 217 + 35, byte1 + 256, 1, 0xffffff);
        }
        for(int l5 = 0; l5 < ox; l5++) {
            int i6 = 217 + byte0 + (l5 % 5) * 49;
            int k6 = 31 + byte1 + (l5 / 5) * 34;
            du.bg(i6, k6, 48, 32, qw + t.xib[px[l5]], t.jjb[px[l5]], 0, 0, false);
            if(t.zib[px[l5]] == 0)
                du.sf(String.valueOf(qx[l5]), i6 + 1, k6 + 10, 1, 0xffff00);
        }

        for(int j6 = 0; j6 < nab; j6++) {
            int l6 = 9 + byte0 + (j6 % 4) * 49;
            int j7 = 31 + byte1 + (j6 / 4) * 34;
            du.bg(l6, j7, 48, 32, qw + t.xib[oab[j6]], t.jjb[oab[j6]], 0, 0, false);
            if(t.zib[oab[j6]] == 0)
                du.sf(String.valueOf(pab[j6]), l6 + 1, j7 + 10, 1, 0xffff00);
            if(super.vq > l6 && super.vq < l6 + 48 && super.wq > j7 && super.wq < j7 + 32)
                du.sf(t.tib[oab[j6]][0] + ": @whi@" + t.uib[oab[j6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

        for(int i7 = 0; i7 < qab; i7++) {
            int k7 = 9 + byte0 + (i7 % 4) * 49;
            int l7 = 156 + byte1 + (i7 / 4) * 34;
            du.bg(k7, l7, 48, 32, qw + t.xib[rab[i7]], t.jjb[rab[i7]], 0, 0, false);
            if(t.zib[rab[i7]] == 0)
                du.sf(String.valueOf(sab[i7]), k7 + 1, l7 + 10, 1, 0xffff00);
            if(super.vq > k7 && super.vq < k7 + 48 && super.wq > l7 && super.wq < l7 + 32)
                du.sf(t.tib[rab[i7]][0] + ": @whi@" + t.uib[rab[i7]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

    }

    public void en() {
        if(pt != 0 && wab == 0)
            wab = 1;
        if(wab > 0) {
            int i1 = super.vq - 22;
            int j1 = super.wq - 36;
            if(i1 >= 0 && j1 >= 0 && i1 < 468 && j1 < 262) {
                if(i1 > 216 && j1 > 30 && i1 < 462 && j1 < 235) {
                    int k1 = (i1 - 217) / 49 + ((j1 - 31) / 34) * 5;
                    if(k1 >= 0 && k1 < ox) {
                        boolean flag1 = false;
                        int l2 = 0;
                        int k3 = px[k1];
                        for(int k4 = 0; k4 < zz; k4++)
                            if(aab[k4] == k3)
                                if(t.zib[k3] == 0) {
                                    for(int i5 = 0; i5 < wab; i5++) {
                                        if(bab[k4] < qx[k1])
                                            bab[k4]++;
                                        flag1 = true;
                                    }

                                } else {
                                    l2++;
                                }

                        if(ml(k3) <= l2)
                            flag1 = true;
                        if(!flag1 && zz < 8) {
                            aab[zz] = k3;
                            bab[zz] = 1;
                            zz++;
                            flag1 = true;
                        }
                        if(flag1) {
                            super.dd.gb(201);
                            super.dd.ec(zz);
                            for(int j5 = 0; j5 < zz; j5++) {
                                super.dd.dc(aab[j5]);
                                super.dd.cc(bab[j5]);
                            }

                            super.dd.xb();
                            fab = false;
                            gab = false;
                        }
                    }
                }
                if(i1 > 8 && j1 > 30 && i1 < 205 && j1 < 129) {
                    int l1 = (i1 - 9) / 49 + ((j1 - 31) / 34) * 4;
                    if(l1 >= 0 && l1 < zz) {
                        int j2 = aab[l1];
                        for(int i3 = 0; i3 < wab; i3++) {
                            if(t.zib[j2] == 0 && bab[l1] > 1) {
                                bab[l1]--;
                                continue;
                            }
                            zz--;
                            vab = 0;
                            for(int l3 = l1; l3 < zz; l3++) {
                                aab[l3] = aab[l3 + 1];
                                bab[l3] = bab[l3 + 1];
                            }

                            break;
                        }

                        super.dd.gb(201);
                        super.dd.ec(zz);
                        for(int i4 = 0; i4 < zz; i4++) {
                            super.dd.dc(aab[i4]);
                            super.dd.cc(bab[i4]);
                        }

                        super.dd.xb();
                        fab = false;
                        gab = false;
                    }
                }
                boolean flag = false;
                if(i1 >= 93 && j1 >= 221 && i1 <= 104 && j1 <= 232) {
                    hab = !hab;
                    flag = true;
                }
                if(i1 >= 93 && j1 >= 240 && i1 <= 104 && j1 <= 251) {
                    iab = !iab;
                    flag = true;
                }
                if(i1 >= 191 && j1 >= 221 && i1 <= 202 && j1 <= 232) {
                    jab = !jab;
                    flag = true;
                }
                if(i1 >= 191 && j1 >= 240 && i1 <= 202 && j1 <= 251) {
                    kab = !kab;
                    flag = true;
                }
                if(flag) {
                    super.dd.gb(200);
                    super.dd.ec(hab ? 1 : 0);
                    super.dd.ec(iab ? 1 : 0);
                    super.dd.ec(jab ? 1 : 0);
                    super.dd.ec(kab ? 1 : 0);
                    super.dd.xb();
                }
                if(i1 >= 217 && j1 >= 238 && i1 <= 286 && j1 <= 259) {
                    gab = true;
                    super.dd.gb(199);
                    super.dd.xb();
                }
                if(i1 >= 394 && j1 >= 238 && i1 < 463 && j1 < 259) {
                    xz = false;
                    super.dd.gb(203);
                    super.dd.xb();
                }
            } else
            if(pt != 0) {
                xz = false;
                super.dd.gb(203);
                super.dd.xb();
            }
            pt = 0;
            wab = 0;
        }
        if(!xz)
            return;
        byte byte0 = 22;
        byte byte1 = 36;
        du.dg(byte0, byte1, 468, 12, 0xc90b1d);
        int i2 = 0x989898;
        du.zf(byte0, byte1 + 12, 468, 18, i2, 160);
        du.zf(byte0, byte1 + 30, 8, 248, i2, 160);
        du.zf(byte0 + 205, byte1 + 30, 11, 248, i2, 160);
        du.zf(byte0 + 462, byte1 + 30, 6, 248, i2, 160);
        du.zf(byte0 + 8, byte1 + 99, 197, 24, i2, 160);
        du.zf(byte0 + 8, byte1 + 192, 197, 23, i2, 160);
        du.zf(byte0 + 8, byte1 + 258, 197, 20, i2, 160);
        du.zf(byte0 + 216, byte1 + 235, 246, 43, i2, 160);
        int k2 = 0xd0d0d0;
        du.zf(byte0 + 8, byte1 + 30, 197, 69, k2, 160);
        du.zf(byte0 + 8, byte1 + 123, 197, 69, k2, 160);
        du.zf(byte0 + 8, byte1 + 215, 197, 43, k2, 160);
        du.zf(byte0 + 216, byte1 + 30, 246, 205, k2, 160);
        for(int j3 = 0; j3 < 3; j3++)
            du.wg(byte0 + 8, byte1 + 30 + j3 * 34, 197, 0);

        for(int j4 = 0; j4 < 3; j4++)
            du.wg(byte0 + 8, byte1 + 123 + j4 * 34, 197, 0);

        for(int l4 = 0; l4 < 7; l4++)
            du.wg(byte0 + 216, byte1 + 30 + l4 * 34, 246, 0);

        for(int k5 = 0; k5 < 6; k5++) {
            if(k5 < 5)
                du.bh(byte0 + 8 + k5 * 49, byte1 + 30, 69, 0);
            if(k5 < 5)
                du.bh(byte0 + 8 + k5 * 49, byte1 + 123, 69, 0);
            du.bh(byte0 + 216 + k5 * 49, byte1 + 30, 205, 0);
        }

        du.wg(byte0 + 8, byte1 + 215, 197, 0);
        du.wg(byte0 + 8, byte1 + 257, 197, 0);
        du.bh(byte0 + 8, byte1 + 215, 43, 0);
        du.bh(byte0 + 204, byte1 + 215, 43, 0);
        du.sf("Preparing to duel with: " + yz, byte0 + 1, byte1 + 10, 1, 0xffffff);
        du.sf("Your Stake", byte0 + 9, byte1 + 27, 4, 0xffffff);
        du.sf("Opponent's Stake", byte0 + 9, byte1 + 120, 4, 0xffffff);
        du.sf("Duel Options", byte0 + 9, byte1 + 212, 4, 0xffffff);
        du.sf("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
        du.sf("No retreating", byte0 + 8 + 1, byte1 + 215 + 16, 3, 0xffff00);
        du.sf("No magic", byte0 + 8 + 1, byte1 + 215 + 35, 3, 0xffff00);
        du.sf("No prayer", byte0 + 8 + 102, byte1 + 215 + 16, 3, 0xffff00);
        du.sf("No weapons", byte0 + 8 + 102, byte1 + 215 + 35, 3, 0xffff00);
        du.wf(byte0 + 93, byte1 + 215 + 6, 11, 11, 0xffff00);
        if(hab)
            du.dg(byte0 + 95, byte1 + 215 + 8, 7, 7, 0xffff00);
        du.wf(byte0 + 93, byte1 + 215 + 25, 11, 11, 0xffff00);
        if(iab)
            du.dg(byte0 + 95, byte1 + 215 + 27, 7, 7, 0xffff00);
        du.wf(byte0 + 191, byte1 + 215 + 6, 11, 11, 0xffff00);
        if(jab)
            du.dg(byte0 + 193, byte1 + 215 + 8, 7, 7, 0xffff00);
        du.wf(byte0 + 191, byte1 + 215 + 25, 11, 11, 0xffff00);
        if(kab)
            du.dg(byte0 + 193, byte1 + 215 + 27, 7, 7, 0xffff00);
        if(!gab)
            du.dh(byte0 + 217, byte1 + 238, mu + 25);
        du.dh(byte0 + 394, byte1 + 238, mu + 26);
        if(fab) {
            du.zg("Other player", byte0 + 341, byte1 + 246, 1, 0xffffff);
            du.zg("has accepted", byte0 + 341, byte1 + 256, 1, 0xffffff);
        }
        if(gab) {
            du.zg("Waiting for", byte0 + 217 + 35, byte1 + 246, 1, 0xffffff);
            du.zg("other player", byte0 + 217 + 35, byte1 + 256, 1, 0xffffff);
        }
        for(int l5 = 0; l5 < ox; l5++) {
            int i6 = 217 + byte0 + (l5 % 5) * 49;
            int k6 = 31 + byte1 + (l5 / 5) * 34;
            du.bg(i6, k6, 48, 32, qw + t.xib[px[l5]], t.jjb[px[l5]], 0, 0, false);
            if(t.zib[px[l5]] == 0)
                du.sf(String.valueOf(qx[l5]), i6 + 1, k6 + 10, 1, 0xffff00);
        }

        for(int j6 = 0; j6 < zz; j6++) {
            int l6 = 9 + byte0 + (j6 % 4) * 49;
            int j7 = 31 + byte1 + (j6 / 4) * 34;
            du.bg(l6, j7, 48, 32, qw + t.xib[aab[j6]], t.jjb[aab[j6]], 0, 0, false);
            if(t.zib[aab[j6]] == 0)
                du.sf(String.valueOf(bab[j6]), l6 + 1, j7 + 10, 1, 0xffff00);
            if(super.vq > l6 && super.vq < l6 + 48 && super.wq > j7 && super.wq < j7 + 32)
                du.sf(t.tib[aab[j6]][0] + ": @whi@" + t.uib[aab[j6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

        for(int i7 = 0; i7 < cab; i7++) {
            int k7 = 9 + byte0 + (i7 % 4) * 49;
            int l7 = 124 + byte1 + (i7 / 4) * 34;
            du.bg(k7, l7, 48, 32, qw + t.xib[dab[i7]], t.jjb[dab[i7]], 0, 0, false);
            if(t.zib[dab[i7]] == 0)
                du.sf(String.valueOf(eab[i7]), k7 + 1, l7 + 10, 1, 0xffff00);
            if(super.vq > k7 && super.vq < k7 + 48 && super.wq > l7 && super.wq < l7 + 32)
                du.sf(t.tib[dab[i7]][0] + ": @whi@" + t.uib[dab[i7]], byte0 + 8, byte1 + 273, 1, 0xffff00);
        }

    }

    public void al() {
        if(mx == 0 && super.vq >= ((j) (du)).ak - 35 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 && super.wq < 35)
            mx = 1;
        if(mx == 0 && super.vq >= ((j) (du)).ak - 35 - 33 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 33 && super.wq < 35)
            mx = 2;
        if(mx == 0 && super.vq >= ((j) (du)).ak - 35 - 66 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 66 && super.wq < 35)
            mx = 3;
        if(mx == 0 && super.vq >= ((j) (du)).ak - 35 - 99 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 99 && super.wq < 35)
            mx = 4;
        if(mx == 0 && super.vq >= ((j) (du)).ak - 35 - 132 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 132 && super.wq < 35)
            mx = 5;
        if(mx == 0 && super.vq >= ((j) (du)).ak - 35 - 165 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 165 && super.wq < 35)
            mx = 6;
        if(mx != 0 && super.vq >= ((j) (du)).ak - 35 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 && super.wq < 26)
            mx = 1;
        if(mx != 0 && super.vq >= ((j) (du)).ak - 35 - 33 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 33 && super.wq < 26)
            mx = 2;
        if(mx != 0 && super.vq >= ((j) (du)).ak - 35 - 66 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 66 && super.wq < 26)
            mx = 3;
        if(mx != 0 && super.vq >= ((j) (du)).ak - 35 - 99 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 99 && super.wq < 26)
            mx = 4;
        if(mx != 0 && super.vq >= ((j) (du)).ak - 35 - 132 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 132 && super.wq < 26)
            mx = 5;
        if(mx != 0 && super.vq >= ((j) (du)).ak - 35 - 165 && super.wq >= 3 && super.vq < ((j) (du)).ak - 3 - 165 && super.wq < 26)
            mx = 6;
        if(mx == 1 && (super.vq < ((j) (du)).ak - 248 || super.wq > 36 + (nx / 5) * 34))
            mx = 0;
        if(mx == 3 && (super.vq < ((j) (du)).ak - 199 || super.wq > 284))
            mx = 0;
        if((mx == 2 || mx == 4 || mx == 5) && (super.vq < ((j) (du)).ak - 199 || super.wq > 240))
            mx = 0;
        if(mx == 6 && (super.vq < ((j) (du)).ak - 199 || super.wq > 252))
            mx = 0;
    }

    public void bm(boolean flag) {
        int i1 = ((j) (du)).ak - 248;
        du.dh(i1, 3, mu + 1);
        for(int j1 = 0; j1 < nx; j1++) {
            int k1 = i1 + (j1 % 5) * 49;
            int i2 = 36 + (j1 / 5) * 34;
            if(j1 < ox && rx[j1] == 1)
                du.zf(k1, i2, 49, 34, 0xff0000, 128);
            else
                du.zf(k1, i2, 49, 34, j.pg(181, 181, 181), 128);
            if(j1 < ox) {
                du.bg(k1, i2, 48, 32, qw + t.xib[px[j1]], t.jjb[px[j1]], 0, 0, false);
                if(t.zib[px[j1]] == 0)
                    du.sf(String.valueOf(qx[j1]), k1 + 1, i2 + 10, 1, 0xffff00);
            }
        }

        for(int l1 = 1; l1 <= 4; l1++)
            du.bh(i1 + l1 * 49, 36, (nx / 5) * 34, 0);

        for(int j2 = 1; j2 <= nx / 5 - 1; j2++)
            du.wg(i1, 36 + j2 * 34, 245, 0);

        if(!flag)
            return;
        i1 = super.vq - (((j) (du)).ak - 248);
        int k2 = super.wq - 36;
        if(i1 >= 0 && k2 >= 0 && i1 < 248 && k2 < (nx / 5) * 34) {
            int l2 = i1 / 49 + (k2 / 34) * 5;
            if(l2 < ox) {
                int i3 = px[l2];
                if(fy >= 0) {
                    if(t.tmb[fy] == 3) {
                        cz[yy] = "Cast " + t.pmb[fy] + " on";
                        bz[yy] = "@lre@" + t.tib[i3][0];
                        dz[yy] = 600;
                        gz[yy] = l2;
                        hz[yy] = fy;
                        yy++;
                        return;
                    }
                } else {
                    if(sx >= 0) {
                        cz[yy] = "Use " + tx + " with";
                        bz[yy] = "@lre@" + t.tib[i3][0];
                        dz[yy] = 610;
                        gz[yy] = l2;
                        hz[yy] = sx;
                        yy++;
                        return;
                    }
                    if(rx[l2] == 1) {
                        cz[yy] = "Remove";
                        bz[yy] = "@lre@" + t.tib[i3][0];
                        dz[yy] = 620;
                        gz[yy] = l2;
                        yy++;
                    } else
                    if(t.hjb[i3] != 0) {
                        if((t.hjb[i3] & 0x18) != 0)
                            cz[yy] = "Wield";
                        else
                            cz[yy] = "Wear";
                        bz[yy] = "@lre@" + t.tib[i3][0];
                        dz[yy] = 630;
                        gz[yy] = l2;
                        yy++;
                    }
                    if(!t.wib[i3].equals("_")) {
                        cz[yy] = t.wib[i3];
                        bz[yy] = "@lre@" + t.tib[i3][0];
                        dz[yy] = 640;
                        gz[yy] = l2;
                        yy++;
                    }
                    cz[yy] = "Use";
                    bz[yy] = "@lre@" + t.tib[i3][0];
                    dz[yy] = 650;
                    gz[yy] = l2;
                    yy++;
                    cz[yy] = "Drop";
                    bz[yy] = "@lre@" + t.tib[i3][0];
                    dz[yy] = 660;
                    gz[yy] = l2;
                    yy++;
                    cz[yy] = "Examine";
                    bz[yy] = "@lre@" + t.tib[i3][0];
                    dz[yy] = 3600;
                    gz[yy] = i3;
                    yy++;
                }
            }
        }
    }

    public void wk(boolean flag) {
        int i1 = ((j) (du)).ak - 199;
        char c1 = '\234';
        char c3 = '\230';
        du.dh(i1 - 49, 3, mu + 2);
        i1 += 40;
        du.dg(i1, 36, c1, c3, 0);
        du.xf(i1, 36, i1 + c1, 36 + c3);
        char c5 = '\300';
        int k1 = ((cw.lr - 6040) * 3 * c5) / 2048;
        int i3 = ((cw.mr - 6040) * 3 * c5) / 2048;
        int k4 = k.qm[1024 - sv * 4 & 0x3ff];
        int i5 = k.qm[(1024 - sv * 4 & 0x3ff) + 1024];
        int k5 = i3 * k4 + k1 * i5 >> 18;
        i3 = i3 * i5 - k1 * k4 >> 18;
        k1 = k5;
        du.uf((i1 + c1 / 2) - k1, 36 + c3 / 2 + i3, mu - 1, sv + 64 & 0xff, c5);
        for(int i7 = 0; i7 < ww; i7++) {
            int l1 = (((yw[i7] * gu + 64) - cw.lr) * 3 * c5) / 2048;
            int j3 = (((zw[i7] * gu + 64) - cw.mr) * 3 * c5) / 2048;
            int l5 = j3 * k4 + l1 * i5 >> 18;
            j3 = j3 * i5 - l1 * k4 >> 18;
            l1 = l5;
            cn(i1 + c1 / 2 + l1, (36 + c3 / 2) - j3, 65535);
        }

        for(int j7 = 0; j7 < pw; j7++) {
            int i2 = (((rw[j7] * gu + 64) - cw.lr) * 3 * c5) / 2048;
            int k3 = (((sw[j7] * gu + 64) - cw.mr) * 3 * c5) / 2048;
            int i6 = k3 * k4 + i2 * i5 >> 18;
            k3 = k3 * i5 - i2 * k4 >> 18;
            i2 = i6;
            cn(i1 + c1 / 2 + i2, (36 + c3 / 2) - k3, 0xff0000);
        }

        for(int k7 = 0; k7 < iw; k7++) {
            m m1 = lw[k7];
            int j2 = ((m1.lr - cw.lr) * 3 * c5) / 2048;
            int l3 = ((m1.mr - cw.mr) * 3 * c5) / 2048;
            int j6 = l3 * k4 + j2 * i5 >> 18;
            l3 = l3 * i5 - j2 * k4 >> 18;
            j2 = j6;
            cn(i1 + c1 / 2 + j2, (36 + c3 / 2) - l3, 0xffff00);
        }

        for(int l7 = 0; l7 < wv; l7++) {
            m m2 = aw[l7];
            int k2 = ((m2.lr - cw.lr) * 3 * c5) / 2048;
            int i4 = ((m2.mr - cw.mr) * 3 * c5) / 2048;
            int k6 = i4 * k4 + k2 * i5 >> 18;
            i4 = i4 * i5 - k2 * k4 >> 18;
            k2 = k6;
            int j8 = 0xffffff;
            for(int k8 = 0; k8 < super.hd; k8++) {
                if(m2.hr != super.id[k8] || super.jd[k8] != 10)
                    continue;
                j8 = 65280;
                break;
            }

            cn(i1 + c1 / 2 + k2, (36 + c3 / 2) - i4, j8);
        }

        du.eg(i1 + c1 / 2, 36 + c3 / 2, 2, 0xffffff, 255);
        du.uf(i1 + 19, 55, mu + 24, sv + 128 & 0xff, 128);
        du.xf(0, 0, iu, ju + 12);
        if(!flag)
            return;
        i1 = super.vq - (((j) (du)).ak - 199);
        int i8 = super.wq - 36;
        if(i1 >= 40 && i8 >= 0 && i1 < 196 && i8 < 152) {
            char c2 = '\234';
            char c4 = '\230';
            char c6 = '\300';
            int j1 = ((j) (du)).ak - 199;
            j1 += 40;
            int l2 = ((super.vq - (j1 + c2 / 2)) * 16384) / (3 * c6);
            int j4 = ((super.wq - (36 + c4 / 2)) * 16384) / (3 * c6);
            int l4 = k.qm[1024 - sv * 4 & 0x3ff];
            int j5 = k.qm[(1024 - sv * 4 & 0x3ff) + 1024];
            int l6 = j4 * l4 + l2 * j5 >> 15;
            j4 = j4 * j5 - l2 * l4 >> 15;
            l2 = l6;
            l2 += cw.lr;
            j4 = cw.mr - j4;
            if(pt == 1)
                jl(dw, ew, l2 / 128, j4 / 128, false);
            pt = 0;
        }
    }

    public void xl(boolean flag) {
        int i1 = ((j) (du)).ak - 199;
        int j1 = 36;
        du.dh(i1 - 49, 3, mu + 3);
        char c1 = '\304';
        char c2 = '\372';
        int l1;
        int k1 = l1 = j.pg(160, 160, 160);
        if(my == 0)
            k1 = j.pg(220, 220, 220);
        else
            l1 = j.pg(220, 220, 220);
        du.zf(i1, j1, c1 / 2, 24, k1, 128);
        du.zf(i1 + c1 / 2, j1, c1 / 2, 24, l1, 128);
        du.zf(i1, j1 + 24, c1, c2 - 24, j.pg(220, 220, 220), 128);
        du.wg(i1, j1 + 24, c1, 0);
        du.bh(i1 + c1 / 2, j1, 24, 0);
        du.zg("Stats", i1 + c1 / 4, j1 + 16, 4, 0);
        du.zg("Quests", i1 + c1 / 4 + c1 / 2, j1 + 16, 4, 0);
        if(my == 0) {
            int i2 = 72;
            int k2 = -1;
            du.sf("Skills", i1 + 5, i2, 3, 0xffff00);
            i2 += 13;
            for(int l2 = 0; l2 < 8; l2++) {
                int i3 = 0xffffff;
                if(super.vq > i1 + 3 && super.wq >= i2 - 11 && super.wq < i2 + 2 && super.vq < i1 + 90) {
                    i3 = 0xff0000;
                    k2 = l2;
                }
                du.sf(ay[l2] + ":@yel@" + vx[l2] + "/" + wx[l2], i1 + 5, i2, 1, i3);
                i3 = 0xffffff;
                if(super.vq >= i1 + 90 && super.wq >= i2 - 13 - 11 && super.wq < (i2 - 13) + 2 && super.vq < i1 + 196) {
                    i3 = 0xff0000;
                    k2 = l2 + 8;
                }
                du.sf(ay[l2 + 8] + ":@yel@" + vx[l2 + 8] + "/" + wx[l2 + 8], (i1 + c1 / 2) - 8, i2 - 13, 1, i3);
                i2 += 13;
            }

            du.sf("Quest Points:@yel@" + zx, (i1 + c1 / 2) - 8, i2 - 13, 1, 0xffffff);
            i2 += 8;
            du.sf("Equipment Status", i1 + 5, i2, 3, 0xffff00);
            i2 += 12;
            for(int j3 = 0; j3 < 3; j3++) {
                du.sf(by[j3] + ":@yel@" + yx[j3], i1 + 5, i2, 1, 0xffffff);
                if(j3 < 2)
                    du.sf(by[j3 + 3] + ":@yel@" + yx[j3 + 3], i1 + c1 / 2 + 25, i2, 1, 0xffffff);
                i2 += 13;
            }

            i2 += 6;
            du.wg(i1, i2 - 15, c1, 0);
            if(k2 != -1) {
                du.sf(ay[k2] + " skill", i1 + 5, i2, 1, 0xffff00);
                i2 += 12;
                int k3 = ux[0];
                for(int i4 = 0; i4 < 98; i4++)
                    if(xx[k2] >= ux[i4])
                        k3 = ux[i4 + 1];

                du.sf("Total xp: " + xx[k2] / 4, i1 + 5, i2, 1, 0xffffff);
                i2 += 12;
                du.sf("Next level at: " + k3 / 4, i1 + 5, i2, 1, 0xffffff);
            } else {
                du.sf("Overall levels", i1 + 5, i2, 1, 0xffff00);
                i2 += 12;
                int l3 = 0;
                for(int j4 = 0; j4 < 16; j4++)
                    l3 += wx[j4];

                du.sf("Skill total: " + l3, i1 + 5, i2, 1, 0xffffff);
                i2 += 12;
                du.sf("Combat level: " + cw.es, i1 + 5, i2, 1, 0xffffff);
                i2 += 12;
            }
        }
        if(my == 1) {
            ky.sc(ly);
            ky.jd(ly, 0, "@whi@Quest-list (green=completed)");
            for(int j2 = 0; j2 < ny; j2++)
                ky.jd(ly, j2 + 1, (py[j2] ? "@gre@" : "@red@") + oy[j2]);

            ky.nc();
        }
        if(!flag)
            return;
        i1 = super.vq - (((j) (du)).ak - 199);
        j1 = super.wq - 36;
        if(i1 >= 0 && j1 >= 0 && i1 < c1 && j1 < c2) {
            if(my == 1)
                ky.vd(i1 + (((j) (du)).ak - 199), j1 + 36, super.yq, super.xq);
            if(j1 <= 24 && pt == 1) {
                if(i1 < 98) {
                    my = 0;
                    return;
                }
                if(i1 > 98)
                    my = 1;
            }
        }
    }

    public void bn(boolean flag) {
        int i1 = ((j) (du)).ak - 199;
        int j1 = 36;
        du.dh(i1 - 49, 3, mu + 4);
        char c1 = '\304';
        char c2 = '\266';
        int l1;
        int k1 = l1 = j.pg(160, 160, 160);
        if(ey == 0)
            k1 = j.pg(220, 220, 220);
        else
            l1 = j.pg(220, 220, 220);
        du.zf(i1, j1, c1 / 2, 24, k1, 128);
        du.zf(i1 + c1 / 2, j1, c1 / 2, 24, l1, 128);
        du.zf(i1, j1 + 24, c1, 90, j.pg(220, 220, 220), 128);
        du.zf(i1, j1 + 24 + 90, c1, c2 - 90 - 24, j.pg(160, 160, 160), 128);
        du.wg(i1, j1 + 24, c1, 0);
        du.bh(i1 + c1 / 2, j1, 24, 0);
        du.wg(i1, j1 + 113, c1, 0);
        du.zg("Magic", i1 + c1 / 4, j1 + 16, 4, 0);
        du.zg("Prayers", i1 + c1 / 4 + c1 / 2, j1 + 16, 4, 0);
        if(ey == 0) {
            cy.sc(dy);
            int i2 = 0;
            for(int i3 = 0; i3 < t.omb; i3++) {
                String s = "@yel@";
                for(int l4 = 0; l4 < t.smb[i3]; l4++) {
                    int k5 = t.umb[i3][l4];
                    if(rm(k5, t.vmb[i3][l4]))
                        continue;
                    s = "@whi@";
                    break;
                }

                int l5 = vx[6];
                if(t.rmb[i3] > l5)
                    s = "@bla@";
                cy.jd(dy, i2++, s + "Level " + t.rmb[i3] + ": " + t.pmb[i3]);
            }

            cy.nc();
            int i4 = cy.oc(dy);
            if(i4 != -1) {
                du.sf("Level " + t.rmb[i4] + ": " + t.pmb[i4], i1 + 2, j1 + 124, 1, 0xffff00);
                du.sf(t.qmb[i4], i1 + 2, j1 + 136, 0, 0xffffff);
                for(int i5 = 0; i5 < t.smb[i4]; i5++) {
                    int i6 = t.umb[i4][i5];
                    du.dh(i1 + 2 + i5 * 44, j1 + 150, qw + t.xib[i6]);
                    int j6 = ml(i6);
                    int k6 = t.vmb[i4][i5];
                    String s2 = "@red@";
                    if(rm(i6, k6))
                        s2 = "@gre@";
                    du.sf(s2 + j6 + "/" + k6, i1 + 2 + i5 * 44, j1 + 150, 1, 0xffffff);
                }

            } else {
                du.sf("Point at a spell for a description", i1 + 2, j1 + 124, 1, 0);
            }
        }
        if(ey == 1) {
            cy.sc(dy);
            int j2 = 0;
            for(int j3 = 0; j3 < t.gnb; j3++) {
                String s1 = "@whi@";
                if(t.jnb[j3] > wx[5])
                    s1 = "@bla@";
                if(qy[j3])
                    s1 = "@gre@";
                cy.jd(dy, j2++, s1 + "Level " + t.jnb[j3] + ": " + t.hnb[j3]);
            }

            cy.nc();
            int j4 = cy.oc(dy);
            if(j4 != -1) {
                du.zg("Level " + t.jnb[j4] + ": " + t.hnb[j4], i1 + c1 / 2, j1 + 130, 1, 0xffff00);
                du.zg(t.inb[j4], i1 + c1 / 2, j1 + 145, 0, 0xffffff);
                du.zg("Drain rate: " + t.knb[j4], i1 + c1 / 2, j1 + 160, 1, 0);
            } else {
                du.sf("Point at a prayer for a description", i1 + 2, j1 + 124, 1, 0);
            }
        }
        if(!flag)
            return;
        i1 = super.vq - (((j) (du)).ak - 199);
        j1 = super.wq - 36;
        if(i1 >= 0 && j1 >= 0 && i1 < 196 && j1 < 182) {
            cy.vd(i1 + (((j) (du)).ak - 199), j1 + 36, super.yq, super.xq);
            if(j1 <= 24 && pt == 1)
                if(i1 < 98 && ey == 1) {
                    ey = 0;
                    cy.fd(dy);
                } else
                if(i1 > 98 && ey == 0) {
                    ey = 1;
                    cy.fd(dy);
                }
            if(pt == 1 && ey == 0) {
                int k2 = cy.oc(dy);
                if(k2 != -1) {
                    int k3 = vx[6];
                    if(t.rmb[k2] > k3) {
                        sk("Your magic ability is not high enough for this spell", 3);
                    } else {
                        int k4;
                        for(k4 = 0; k4 < t.smb[k2]; k4++) {
                            int j5 = t.umb[k2][k4];
                            if(rm(j5, t.vmb[k2][k4]))
                                continue;
                            sk("You don't have all the reagents you need for this spell", 3);
                            k4 = -1;
                            break;
                        }

                        if(k4 == t.smb[k2]) {
                            fy = k2;
                            sx = -1;
                        }
                    }
                }
            }
            if(pt == 1 && ey == 1) {
                int l2 = cy.oc(dy);
                if(l2 != -1) {
                    int l3 = wx[5];
                    if(t.jnb[l2] > l3)
                        sk("Your prayer ability is not high enough for this prayer", 3);
                    else
                    if(vx[5] == 0)
                        sk("You have run out of prayer points. Return to a church to recharge", 3);
                    else
                    if(qy[l2]) {
                        super.dd.gb(211);
                        super.dd.ec(l2);
                        super.dd.xb();
                        qy[l2] = false;
                    } else {
                        super.dd.gb(212);
                        super.dd.ec(l2);
                        super.dd.xb();
                        qy[l2] = true;
                    }
                }
            }
            pt = 0;
        }
    }

    public void vk(boolean flag) {
        int i1 = ((j) (du)).ak - 199;
        int j1 = 36;
        du.dh(i1 - 49, 3, mu + 5);
        char c1 = '\304';
        char c2 = '\266';
        int l1;
        int k1 = l1 = j.pg(160, 160, 160);
        if(iy == 0)
            k1 = j.pg(220, 220, 220);
        else
            l1 = j.pg(220, 220, 220);
        du.zf(i1, j1, c1 / 2, 24, k1, 128);
        du.zf(i1 + c1 / 2, j1, c1 / 2, 24, l1, 128);
        du.zf(i1, j1 + 24, c1, c2 - 24, j.pg(220, 220, 220), 128);
        du.wg(i1, j1 + 24, c1, 0);
        du.bh(i1 + c1 / 2, j1, 24, 0);
        du.wg(i1, (j1 + c2) - 16, c1, 0);
        du.zg("Friends", i1 + c1 / 4, j1 + 16, 4, 0);
        du.zg("Ignore", i1 + c1 / 4 + c1 / 2, j1 + 16, 4, 0);
        gy.sc(hy);
        if(iy == 0) {
            for(int i2 = 0; i2 < super.hd; i2++) {
                String s;
                if(super.jd[i2] == 10)
                    s = "@gre@";
                else
                if(super.jd[i2] > 0)
                    s = "@yel@";
                else
                    s = "@red@";
                gy.jd(hy, i2, s + p.xn(super.id[i2]) + "~439~@whi@Remove         WWWWWWWWWW");
            }

        }
        if(iy == 1) {
            for(int j2 = 0; j2 < super.kd; j2++)
                gy.jd(hy, j2, "@yel@" + p.xn(super.ld[j2]) + "~439~@whi@Remove         WWWWWWWWWW");

        }
        gy.nc();
        if(iy == 0) {
            int k2 = gy.oc(hy);
            if(k2 >= 0 && super.vq < 489) {
                if(super.vq > 429)
                    du.zg("Click to remove " + p.xn(super.id[k2]), i1 + c1 / 2, j1 + 35, 1, 0xffffff);
                else
                if(super.jd[k2] == 10)
                    du.zg("Click to message " + p.xn(super.id[k2]), i1 + c1 / 2, j1 + 35, 1, 0xffffff);
                else
                if(super.jd[k2] > 0)
                    du.zg(p.xn(super.id[k2]) + " is on world " + super.jd[k2], i1 + c1 / 2, j1 + 35, 1, 0xffffff);
                else
                    du.zg(p.xn(super.id[k2]) + " is offline", i1 + c1 / 2, j1 + 35, 1, 0xffffff);
            } else {
                du.zg("Click a name to send a message", i1 + c1 / 2, j1 + 35, 1, 0xffffff);
            }
            int k3;
            if(super.vq > i1 && super.vq < i1 + c1 && super.wq > (j1 + c2) - 16 && super.wq < j1 + c2)
                k3 = 0xffff00;
            else
                k3 = 0xffffff;
            du.zg("Click here to add a friend", i1 + c1 / 2, (j1 + c2) - 3, 1, k3);
        }
        if(iy == 1) {
            int l2 = gy.oc(hy);
            if(l2 >= 0 && super.vq < 489 && super.vq > 429) {
                if(super.vq > 429)
                    du.zg("Click to remove " + p.xn(super.ld[l2]), i1 + c1 / 2, j1 + 35, 1, 0xffffff);
            } else {
                du.zg("Blocking messages from:", i1 + c1 / 2, j1 + 35, 1, 0xffffff);
            }
            int l3;
            if(super.vq > i1 && super.vq < i1 + c1 && super.wq > (j1 + c2) - 16 && super.wq < j1 + c2)
                l3 = 0xffff00;
            else
                l3 = 0xffffff;
            du.zg("Click here to add a name", i1 + c1 / 2, (j1 + c2) - 3, 1, l3);
        }
        if(!flag)
            return;
        i1 = super.vq - (((j) (du)).ak - 199);
        j1 = super.wq - 36;
        if(i1 >= 0 && j1 >= 0 && i1 < 196 && j1 < 182) {
            gy.vd(i1 + (((j) (du)).ak - 199), j1 + 36, super.yq, super.xq);
            if(j1 <= 24 && pt == 1)
                if(i1 < 98 && iy == 1) {
                    iy = 0;
                    gy.fd(hy);
                } else
                if(i1 > 98 && iy == 0) {
                    iy = 1;
                    gy.fd(hy);
                }
            if(pt == 1 && iy == 0) {
                int i3 = gy.oc(hy);
                if(i3 >= 0 && super.vq < 489)
                    if(super.vq > 429)
                        j(super.id[i3]);
                    else
                    if(super.jd[i3] != 0) {
                        bcb = 2;
                        jy = super.id[i3];
                        super.er = "";
                        super.fr = "";
                    }
            }
            if(pt == 1 && iy == 1) {
                int j3 = gy.oc(hy);
                if(j3 >= 0 && super.vq < 489 && super.vq > 429)
                    p(super.ld[j3]);
            }
            if(j1 > 166 && pt == 1 && iy == 0) {
                bcb = 1;
                super.cr = "";
                super.dr = "";
            }
            if(j1 > 166 && pt == 1 && iy == 1) {
                bcb = 3;
                super.cr = "";
                super.dr = "";
            }
            pt = 0;
        }
    }

    public void zm(boolean flag) {
        int i1 = ((j) (du)).ak - 199;
        int j1 = 36;
        du.dh(i1 - 49, 3, mu + 6);
        char c1 = '\304';
        du.zf(i1, 36, c1, 75, j.pg(181, 181, 181), 160);
        du.zf(i1, 111, c1, 105, j.pg(201, 2011, 201), 160);
        du.zf(i1, 216, c1, 30, j.pg(181, 181, 181), 160);
        int k1 = i1 + 3;
        int i2 = j1 + 15;
        du.sf("Game options - click to toggle", k1, i2, 1, 0);
        i2 += 15;
        if(sy)
            du.sf("Camera angle mode - @gre@Auto", k1, i2, 1, 0xffffff);
        else
            du.sf("Camera angle mode - @red@Manual", k1, i2, 1, 0xffffff);
        i2 += 15;
        if(az)
            du.sf("Mouse buttons - @red@One", k1, i2, 1, 0xffffff);
        else
            du.sf("Mouse buttons - @gre@Two", k1, i2, 1, 0xffffff);
        i2 += 15;
        int k2 = 0xffffff;
        if(super.vq > k1 && super.vq < k1 + c1 && super.wq > i2 - 12 && super.wq < i2 + 4)
            k2 = 0xffff00;
        du.sf("Change password", k1, i2, 1, k2);
        i2 += 15;
        i2 += 15;
        du.sf("Privacy settings. Will be applied to", i1 + 3, i2, 1, 0);
        i2 += 15;
        du.sf("all people not on your friends list", i1 + 3, i2, 1, 0);
        i2 += 15;
        if(super.md == 0)
            du.sf("Hide online-status: @red@<off>", i1 + 3, i2, 1, 0xffffff);
        else
            du.sf("Hide online-status: @gre@<on>", i1 + 3, i2, 1, 0xffffff);
        i2 += 15;
        if(super.nd == 0)
            du.sf("Block chat messages: @red@<off>", i1 + 3, i2, 1, 0xffffff);
        else
            du.sf("Block chat messages: @gre@<on>", i1 + 3, i2, 1, 0xffffff);
        i2 += 15;
        if(super.od == 0)
            du.sf("Block private messages: @red@<off>", i1 + 3, i2, 1, 0xffffff);
        else
            du.sf("Block private messages: @gre@<on>", i1 + 3, i2, 1, 0xffffff);
        i2 += 15;
        if(super.pd == 0)
            du.sf("Block trade requests: @red@<off>", i1 + 3, i2, 1, 0xffffff);
        else
            du.sf("Block trade requests: @gre@<on>", i1 + 3, i2, 1, 0xffffff);
        i2 += 15;
        i2 += 15;
        k2 = 0xffffff;
        if(super.vq > k1 && super.vq < k1 + c1 && super.wq > i2 - 12 && super.wq < i2 + 4)
            k2 = 0xffff00;
        du.sf("Click here to logout", i1 + 3, i2, 1, k2);
        if(!flag)
            return;
        i1 = super.vq - (((j) (du)).ak - 199);
        j1 = super.wq - 36;
        if(i1 >= 0 && j1 >= 0 && i1 < 196 && j1 < 231) {
            int l2 = ((j) (du)).ak - 199;
            byte byte0 = 36;
            char c2 = '\304';
            int l1 = l2 + 3;
            int j2 = byte0 + 30;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                sy = !sy;
                super.dd.gb(213);
                super.dd.ec(0);
                super.dd.ec(sy ? 1 : 0);
                super.dd.xb();
            }
            j2 += 15;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                az = !az;
                super.dd.gb(213);
                super.dd.ec(2);
                super.dd.ec(az ? 1 : 0);
                super.dd.xb();
            }
            j2 += 15;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                ccb = 6;
                super.cr = "";
                super.dr = "";
            }
            boolean flag1 = false;
            j2 += 60;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                super.md = 1 - super.md;
                flag1 = true;
            }
            j2 += 15;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                super.nd = 1 - super.nd;
                flag1 = true;
            }
            j2 += 15;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                super.od = 1 - super.od;
                flag1 = true;
            }
            j2 += 15;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1) {
                super.pd = 1 - super.pd;
                flag1 = true;
            }
            if(flag1)
                cb(super.md, super.nd, super.od, super.pd, 0);
            j2 += 30;
            if(super.vq > l1 && super.vq < l1 + c2 && super.wq > j2 - 12 && super.wq < j2 + 4 && pt == 1)
                trylogout();
            pt = 0;
        }
    }

    public void kl() {
        int i1 = -1;
        for(int j1 = 0; j1 < ww; j1++)
            dx[j1] = false;

        for(int k1 = 0; k1 < fx; k1++)
            lx[k1] = false;

        int l1 = cu.xi();
        i ai[] = cu.uh();
        int ai1[] = cu.si();
        for(int i2 = 0; i2 < l1; i2++) {
            int j2 = ai1[i2];
            i l2 = ai[i2];
            if(l2.xh[j2] <= 65535 || l2.xh[j2] >= 0x30d40 && l2.xh[j2] <= 0x493e0)
                if(l2 == cu.eo) {
                    int i3 = l2.xh[j2] % 10000;
                    int l3 = l2.xh[j2] / 10000;
                    if(l3 == 1) {
                        String s = "";
                        int k4 = 0;
                        if(cw.es > 0 && aw[i3].es > 0)
                            k4 = cw.es - aw[i3].es;
                        if(k4 < 0)
                            s = "@or1@";
                        if(k4 < -3)
                            s = "@or2@";
                        if(k4 < -6)
                            s = "@or3@";
                        if(k4 < -9)
                            s = "@red@";
                        if(k4 > 0)
                            s = "@gr1@";
                        if(k4 > 3)
                            s = "@gr2@";
                        if(k4 > 6)
                            s = "@gr3@";
                        if(k4 > 9)
                            s = "@gre@";
                        s = " " + s + "(level-" + aw[i3].es + ")";
                        if(fy >= 0) {
                            if(t.tmb[fy] == 1 || t.tmb[fy] == 2 && ew < 2203) {
                                cz[yy] = "Cast " + t.pmb[fy] + " on";
                                bz[yy] = "@whi@" + aw[i3].ir;
                                dz[yy] = 800;
                                ez[yy] = aw[i3].lr;
                                fz[yy] = aw[i3].mr;
                                gz[yy] = aw[i3].jr;
                                hz[yy] = fy;
                                yy++;
                            }
                        } else
                        if(sx >= 0) {
                            cz[yy] = "Use " + tx + " with";
                            bz[yy] = "@whi@" + aw[i3].ir;
                            dz[yy] = 810;
                            ez[yy] = aw[i3].lr;
                            fz[yy] = aw[i3].mr;
                            gz[yy] = aw[i3].jr;
                            hz[yy] = sx;
                            yy++;
                        } else {
                            if(ew + zu + dv < 2203 && (aw[i3].mr - 64) / gu + zu + dv < 2203) {
                                cz[yy] = "Attack";
                                bz[yy] = "@whi@" + aw[i3].ir + s;
                                if(k4 >= 0 && k4 < 5)
                                    dz[yy] = 805;
                                else
                                    dz[yy] = 2805;
                                ez[yy] = aw[i3].lr;
                                fz[yy] = aw[i3].mr;
                                gz[yy] = aw[i3].jr;
                                yy++;
                            }
                            cz[yy] = "Trade with";
                            bz[yy] = "@whi@" + aw[i3].ir;
                            dz[yy] = 2810;
                            gz[yy] = aw[i3].jr;
                            yy++;
                            cz[yy] = "Follow";
                            bz[yy] = "@whi@" + aw[i3].ir;
                            dz[yy] = 2820;
                            gz[yy] = aw[i3].jr;
                            yy++;
                        }
                    } else
                    if(l3 == 2) {
                        if(fy >= 0) {
                            if(t.tmb[fy] == 3) {
                                cz[yy] = "Cast " + t.pmb[fy] + " on";
                                bz[yy] = "@lre@" + t.tib[tw[i3]][0];
                                dz[yy] = 200;
                                ez[yy] = rw[i3];
                                fz[yy] = sw[i3];
                                gz[yy] = tw[i3];
                                hz[yy] = fy;
                                yy++;
                            }
                        } else
                        if(sx >= 0) {
                            cz[yy] = "Use " + tx + " with";
                            bz[yy] = "@lre@" + t.tib[tw[i3]][0];
                            dz[yy] = 210;
                            ez[yy] = rw[i3];
                            fz[yy] = sw[i3];
                            gz[yy] = tw[i3];
                            hz[yy] = sx;
                            yy++;
                        } else {
                            cz[yy] = "Take";
                            bz[yy] = "@lre@" + t.tib[tw[i3]][0];
                            dz[yy] = 220;
                            ez[yy] = rw[i3];
                            fz[yy] = sw[i3];
                            gz[yy] = tw[i3];
                            yy++;
                            cz[yy] = "Examine";
                            bz[yy] = "@lre@" + t.tib[tw[i3]][0];
                            dz[yy] = 3200;
                            gz[yy] = tw[i3];
                            yy++;
                        }
                    } else
                    if(l3 == 3) {
                        String s1 = "";
                        int l4 = -1;
                        int i5 = lw[i3].nr;
                        if(t.tjb[i5] > 0) {
                            int j5 = (t.pjb[i5] + t.sjb[i5] + t.qjb[i5] + t.rjb[i5]) / 4;
                            int k5 = (wx[0] + wx[1] + wx[2] + wx[3] + 27) / 4;
                            l4 = k5 - j5;
                            s1 = "@yel@";
                            if(l4 < 0)
                                s1 = "@or1@";
                            if(l4 < -3)
                                s1 = "@or2@";
                            if(l4 < -6)
                                s1 = "@or3@";
                            if(l4 < -9)
                                s1 = "@red@";
                            if(l4 > 0)
                                s1 = "@gr1@";
                            if(l4 > 3)
                                s1 = "@gr2@";
                            if(l4 > 6)
                                s1 = "@gr3@";
                            if(l4 > 9)
                                s1 = "@gre@";
                            s1 = " " + s1 + "(level-" + j5 + ")";
                        }
                        if(fy >= 0) {
                            if(t.tmb[fy] == 2) {
                                cz[yy] = "Cast " + t.pmb[fy] + " on";
                                bz[yy] = "@yel@" + t.njb[lw[i3].nr][0];
                                dz[yy] = 700;
                                ez[yy] = lw[i3].lr;
                                fz[yy] = lw[i3].mr;
                                gz[yy] = lw[i3].jr;
                                hz[yy] = fy;
                                yy++;
                            }
                        } else
                        if(sx >= 0) {
                            cz[yy] = "Use " + tx + " with";
                            bz[yy] = "@yel@" + t.njb[lw[i3].nr][0];
                            dz[yy] = 710;
                            ez[yy] = lw[i3].lr;
                            fz[yy] = lw[i3].mr;
                            gz[yy] = lw[i3].jr;
                            hz[yy] = sx;
                            yy++;
                        } else {
                            if(t.tjb[i5] > 0) {
                                cz[yy] = "Attack";
                                bz[yy] = "@yel@" + t.njb[lw[i3].nr][0] + s1;
                                if(l4 >= 0)
                                    dz[yy] = 715;
                                else
                                    dz[yy] = 2715;
                                ez[yy] = lw[i3].lr;
                                fz[yy] = lw[i3].mr;
                                gz[yy] = lw[i3].jr;
                                yy++;
                            }
                            cz[yy] = "Talk-to";
                            bz[yy] = "@yel@" + t.njb[lw[i3].nr][0];
                            dz[yy] = 720;
                            ez[yy] = lw[i3].lr;
                            fz[yy] = lw[i3].mr;
                            gz[yy] = lw[i3].jr;
                            yy++;
                            cz[yy] = "Examine";
                            bz[yy] = "@yel@" + t.njb[lw[i3].nr][0];
                            dz[yy] = 3700;
                            gz[yy] = lw[i3].nr;
                            yy++;
                        }
                    }
                } else
                if(l2 != null && l2.wh >= 10000) {
                    int j3 = l2.wh - 10000;
                    int i4 = kx[j3];
                    if(!lx[j3]) {
                        if(fy >= 0) {
                            if(t.tmb[fy] == 4) {
                                cz[yy] = "Cast " + t.pmb[fy] + " on";
                                bz[yy] = "@cya@" + t.klb[i4][0];
                                dz[yy] = 300;
                                ez[yy] = hx[j3];
                                fz[yy] = ix[j3];
                                gz[yy] = jx[j3];
                                hz[yy] = fy;
                                yy++;
                            }
                        } else
                        if(sx >= 0) {
                            cz[yy] = "Use " + tx + " with";
                            bz[yy] = "@cya@" + t.klb[i4][0];
                            dz[yy] = 310;
                            ez[yy] = hx[j3];
                            fz[yy] = ix[j3];
                            gz[yy] = jx[j3];
                            hz[yy] = sx;
                            yy++;
                        } else {
                            if(!t.mlb[i4].equalsIgnoreCase("WalkTo")) {
                                cz[yy] = t.mlb[i4];
                                bz[yy] = "@cya@" + t.klb[i4][0];
                                dz[yy] = 320;
                                ez[yy] = hx[j3];
                                fz[yy] = ix[j3];
                                gz[yy] = jx[j3];
                                yy++;
                            }
                            if(!t.nlb[i4].equalsIgnoreCase("Examine")) {
                                cz[yy] = t.nlb[i4];
                                bz[yy] = "@cya@" + t.klb[i4][0];
                                dz[yy] = 2300;
                                ez[yy] = hx[j3];
                                fz[yy] = ix[j3];
                                gz[yy] = jx[j3];
                                yy++;
                            }
                            cz[yy] = "Examine";
                            bz[yy] = "@cya@" + t.klb[i4][0];
                            dz[yy] = 3300;
                            gz[yy] = i4;
                            yy++;
                        }
                        lx[j3] = true;
                    }
                } else
                if(l2 != null && l2.wh >= 0) {
                    int k3 = l2.wh;
                    int j4 = ax[k3];
                    if(!dx[k3]) {
                        if(fy >= 0) {
                            if(t.tmb[fy] == 5) {
                                cz[yy] = "Cast " + t.pmb[fy] + " on";
                                bz[yy] = "@cya@" + t.zkb[j4][0];
                                dz[yy] = 400;
                                ez[yy] = yw[k3];
                                fz[yy] = zw[k3];
                                gz[yy] = bx[k3];
                                hz[yy] = ax[k3];
                                iz[yy] = fy;
                                yy++;
                            }
                        } else
                        if(sx >= 0) {
                            cz[yy] = "Use " + tx + " with";
                            bz[yy] = "@cya@" + t.zkb[j4][0];
                            dz[yy] = 410;
                            ez[yy] = yw[k3];
                            fz[yy] = zw[k3];
                            gz[yy] = bx[k3];
                            hz[yy] = ax[k3];
                            iz[yy] = sx;
                            yy++;
                        } else {
                            if(!t.blb[j4].equalsIgnoreCase("WalkTo")) {
                                cz[yy] = t.blb[j4];
                                bz[yy] = "@cya@" + t.zkb[j4][0];
                                dz[yy] = 420;
                                ez[yy] = yw[k3];
                                fz[yy] = zw[k3];
                                gz[yy] = bx[k3];
                                hz[yy] = ax[k3];
                                yy++;
                            }
                            if(!t.clb[j4].equalsIgnoreCase("Examine")) {
                                cz[yy] = t.clb[j4];
                                bz[yy] = "@cya@" + t.zkb[j4][0];
                                dz[yy] = 2400;
                                ez[yy] = yw[k3];
                                fz[yy] = zw[k3];
                                gz[yy] = bx[k3];
                                hz[yy] = ax[k3];
                                yy++;
                            }
                            cz[yy] = "Examine";
                            bz[yy] = "@cya@" + t.zkb[j4][0];
                            dz[yy] = 3400;
                            gz[yy] = j4;
                            yy++;
                        }
                        dx[k3] = true;
                    }
                } else {
                    if(j2 >= 0)
                        j2 = l2.xh[j2] - 0x30d40;
                    if(j2 >= 0)
                        i1 = j2;
                }
        }

        if(fy >= 0 && t.tmb[fy] <= 1) {
            cz[yy] = "Cast " + t.pmb[fy] + " on self";
            bz[yy] = "";
            dz[yy] = 1000;
            gz[yy] = fy;
            yy++;
        }
        if(i1 != -1) {
            int k2 = i1;
            if(fy >= 0) {
                if(t.tmb[fy] == 6) {
                    cz[yy] = "Cast " + t.pmb[fy] + " on ground";
                    bz[yy] = "";
                    dz[yy] = 900;
                    ez[yy] = xu.nhb[k2];
                    fz[yy] = xu.ohb[k2];
                    gz[yy] = fy;
                    yy++;
                    return;
                }
            } else
            if(sx < 0) {
                cz[yy] = "Walk here";
                bz[yy] = "";
                dz[yy] = 920;
                ez[yy] = xu.nhb[k2];
                fz[yy] = xu.ohb[k2];
                yy++;
            }
        }
    }

    public void tm() {
        if(pt != 0) {
            for(int i1 = 0; i1 < yy; i1++) {
                int k1 = uy + 2;
                int i2 = vy + 27 + i1 * 15;
                if(super.vq <= k1 - 2 || super.wq <= i2 - 12 || super.wq >= i2 + 4 || super.vq >= (k1 - 3) + wy)
                    continue;
                im(jz[i1]);
                break;
            }

            pt = 0;
            ty = false;
            return;
        }
        if(super.vq < uy - 10 || super.wq < vy - 10 || super.vq > uy + wy + 10 || super.wq > vy + xy + 10) {
            ty = false;
            return;
        }
        du.zf(uy, vy, wy, xy, 0xd0d0d0, 160);
        du.sf("Choose option", uy + 2, vy + 12, 1, 65535);
        for(int j1 = 0; j1 < yy; j1++) {
            int l1 = uy + 2;
            int j2 = vy + 27 + j1 * 15;
            int k2 = 0xffffff;
            if(super.vq > l1 - 2 && super.wq > j2 - 12 && super.wq < j2 + 4 && super.vq < (l1 - 3) + wy)
                k2 = 0xffff00;
            du.sf(cz[jz[j1]] + " " + bz[jz[j1]], l1, j2, 1, k2);
        }

    }

    public void il() {
        if(fy >= 0 || sx >= 0) {
            cz[yy] = "Cancel";
            bz[yy] = "";
            dz[yy] = 4000;
            yy++;
        }
        for(int i1 = 0; i1 < yy; i1++)
            jz[i1] = i1;

        for(boolean flag = false; !flag;) {
            flag = true;
            for(int j1 = 0; j1 < yy - 1; j1++) {
                int l1 = jz[j1];
                int j2 = jz[j1 + 1];
                if(dz[l1] > dz[j2]) {
                    jz[j1] = j2;
                    jz[j1 + 1] = l1;
                    flag = false;
                }
            }

        }

        if(yy > 20)
            yy = 20;
        if(yy > 0) {
            int k1 = -1;
            for(int i2 = 0; i2 < yy; i2++) {
                if(bz[jz[i2]] == null || bz[jz[i2]].length() <= 0)
                    continue;
                k1 = i2;
                break;
            }

            String s = null;
            if((sx >= 0 || fy >= 0) && yy == 1)
                s = "Choose a target";
            else
            if((sx >= 0 || fy >= 0) && yy > 1)
                s = "@whi@" + cz[jz[0]] + " " + bz[jz[0]];
            else
            if(k1 != -1)
                s = bz[jz[k1]] + ": @whi@" + cz[jz[0]];
            if(yy == 2 && s != null)
                s = s + "@whi@ / 1 more option";
            if(yy > 2 && s != null)
                s = s + "@whi@ / " + (yy - 1) + " more options";
            if(s != null)
                du.sf(s, 6, 14, 1, 0xffff00);
            if(!az && pt == 1 || az && pt == 1 && yy == 1) {
                im(jz[0]);
                pt = 0;
                return;
            }
            if(!az && pt == 2 || az && pt == 1) {
                xy = (yy + 1) * 15;
                wy = du.jf("Choose option", 1) + 5;
                for(int k2 = 0; k2 < yy; k2++) {
                    int l2 = du.jf(cz[k2] + " " + bz[k2], 1) + 5;
                    if(l2 > wy)
                        wy = l2;
                }

                uy = super.vq - wy / 2;
                vy = super.wq - 7;
                ty = true;
                if(uy < 0)
                    uy = 0;
                if(vy < 0)
                    vy = 0;
                if(uy + wy > 510)
                    uy = 510 - wy;
                if(vy + xy > 315)
                    vy = 315 - xy;
                pt = 0;
            }
        }
    }

    public void im(int i1) {
        int j1 = ez[i1];
        int k1 = fz[i1];
        int l1 = gz[i1];
        int i2 = hz[i1];
        int j2 = iz[i1];
        int k2 = dz[i1];
        if(k2 == 200) {
            om(dw, ew, j1, k1, true);
            super.dd.gb(224);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 210) {
            om(dw, ew, j1, k1, true);
            super.dd.gb(250);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            sx = -1;
        }
        if(k2 == 220) {
            om(dw, ew, j1, k1, true);
            super.dd.gb(252);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 3200)
            sk(t.uib[l1], 3);
        if(k2 == 300) {
            gl(j1, k1, l1);
            super.dd.gb(223);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.ec(l1);
            super.dd.dc(i2);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 310) {
            gl(j1, k1, l1);
            super.dd.gb(239);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.ec(l1);
            super.dd.dc(i2);
            super.dd.xb();
            sx = -1;
        }
        if(k2 == 320) {
            gl(j1, k1, l1);
            super.dd.gb(238);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.ec(l1);
            super.dd.xb();
        }
        if(k2 == 2300) {
            gl(j1, k1, l1);
            super.dd.gb(229);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.ec(l1);
            super.dd.xb();
        }
        if(k2 == 3300)
            sk(t.llb[l1], 3);
        if(k2 == 400) {
            uk(j1, k1, l1, i2);
            super.dd.gb(222);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.dc(j2);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 410) {
            uk(j1, k1, l1, i2);
            super.dd.gb(241);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.dc(j2);
            super.dd.xb();
            sx = -1;
        }
        if(k2 == 420) {
            uk(j1, k1, l1, i2);
            super.dd.gb(242);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.xb();
        }
        if(k2 == 2400) {
            uk(j1, k1, l1, i2);
            super.dd.gb(230);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.xb();
        }
        if(k2 == 3400)
            sk(t.alb[l1], 3);
        if(k2 == 600) {
            super.dd.gb(220);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 610) {
            super.dd.gb(240);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            sx = -1;
        }
        if(k2 == 620) {
            super.dd.gb(248);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 630) {
            super.dd.gb(249);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 640) {
            super.dd.gb(246);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 650) {
            sx = l1;
            mx = 0;
            tx = t.tib[px[sx]][0];
        }
        if(k2 == 660) {
            super.dd.gb(251);
            super.dd.dc(l1);
            super.dd.xb();
            sx = -1;
            mx = 0;
            sk("Dropping " + t.tib[px[l1]][0], 4);
        }
        if(k2 == 3600)
            sk(t.uib[l1], 3);
        if(k2 == 700) {
            int l2 = (j1 - 64) / gu;
            int k4 = (k1 - 64) / gu;
            jl(dw, ew, l2, k4, true);
            super.dd.gb(225);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 710) {
            int i3 = (j1 - 64) / gu;
            int l4 = (k1 - 64) / gu;
            jl(dw, ew, i3, l4, true);
            super.dd.gb(243);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            sx = -1;
        }
        if(k2 == 720) {
            int j3 = (j1 - 64) / gu;
            int i5 = (k1 - 64) / gu;
            jl(dw, ew, j3, i5, true);
            super.dd.gb(245);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 715 || k2 == 2715) {
            int k3 = (j1 - 64) / gu;
            int j5 = (k1 - 64) / gu;
            jl(dw, ew, k3, j5, true);
            super.dd.gb(244);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 3700)
            sk(t.ojb[l1], 3);
        if(k2 == 800) {
            int l3 = (j1 - 64) / gu;
            int k5 = (k1 - 64) / gu;
            jl(dw, ew, l3, k5, true);
            super.dd.gb(226);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 810) {
            int i4 = (j1 - 64) / gu;
            int l5 = (k1 - 64) / gu;
            jl(dw, ew, i4, l5, true);
            super.dd.gb(219);
            super.dd.dc(l1);
            super.dd.dc(i2);
            super.dd.xb();
            sx = -1;
        }
        if(k2 == 805 || k2 == 2805) {
            int j4 = (j1 - 64) / gu;
            int i6 = (k1 - 64) / gu;
            jl(dw, ew, j4, i6, true);
            super.dd.gb(228);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 2806) {
            super.dd.gb(204);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 2810) {
            super.dd.gb(235);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 2820) {
            super.dd.gb(214);
            super.dd.dc(l1);
            super.dd.xb();
        }
        if(k2 == 900) {
            jl(dw, ew, j1, k1, true);
            super.dd.gb(221);
            super.dd.dc(j1 + cv);
            super.dd.dc(k1 + dv);
            super.dd.dc(l1);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 920) {
            jl(dw, ew, j1, k1, false);
            if(uu == -24)
                uu = 24;
        }
        if(k2 == 1000) {
            super.dd.gb(227);
            super.dd.dc(l1);
            super.dd.xb();
            fy = -1;
        }
        if(k2 == 4000) {
            sx = -1;
            fy = -1;
        }
    }

    public mudclient() {
        ht = new BigInteger("18439792161837834709");
        it = new BigInteger("192956484481579778191558061814292671521");
        kt = false;
        lt = false;
        mt = true;
        ot = 0xbc614e;
        qt = 8000;
        rt = new int[qt];
        st = new int[qt];
        ut = new int[8192];
        vt = new int[8192];
        xt = 2;
        zt = 2;
        gu = 128;
        iu = 512;
        ju = 334;
        ku = 9;
        nu = 40;
        su = -1;
        tu = -1;
        bv = -1;
        ev = -1;
        mv = 550;
        nv = false;
        qv = 1;
        sv = 128;
        uv = 4000;
        vv = 500;
        zv = new m[uv];
        aw = new m[vv];
        bw = new m[vv];
        cw = new m();
        fw = -1;
        gw = 1500;
        hw = 500;
        kw = new m[gw];
        lw = new m[hw];
        mw = new m[hw];
        nw = new int[500];
        ow = 500;
        rw = new int[ow];
        sw = new int[ow];
        tw = new int[ow];
        uw = new int[ow];
        vw = 1500;
        xw = new i[vw];
        yw = new int[vw];
        zw = new int[vw];
        ax = new int[vw];
        bx = new int[vw];
        cx = new i[200];
        dx = new boolean[vw];
        ex = 500;
        gx = new i[ex];
        hx = new int[ex];
        ix = new int[ex];
        jx = new int[ex];
        kx = new int[ex];
        lx = new boolean[ex];
        nx = 30;
        px = new int[35];
        qx = new int[35];
        rx = new int[35];
        sx = -1;
        tx = "";
        ux = new int[99];
        vx = new int[16];
        wx = new int[16];
        xx = new int[16];
        yx = new int[5];
        fy = -1;
        ny = 17;
        py = new boolean[ny];
        qy = new boolean[50];
        ry = false;
        sy = true;
        ty = false;
        zy = 200;
        az = false;
        bz = new String[zy];
        cz = new String[zy];
        dz = new int[zy];
        ez = new int[zy];
        fz = new int[zy];
        gz = new int[zy];
        hz = new int[zy];
        iz = new int[zy];
        jz = new int[zy];
        uz = 5;
        vz = new String[uz];
        wz = new int[uz];
        xz = false;
        yz = "";
        aab = new int[8];
        bab = new int[8];
        dab = new int[8];
        eab = new int[8];
        fab = false;
        gab = false;
        hab = false;
        iab = false;
        jab = false;
        kab = false;
        lab = false;
        mab = "";
        oab = new int[14];
        pab = new int[14];
        rab = new int[14];
        sab = new int[14];
        tab = false;
        uab = false;
        yab = false;
        zab = false;
        bbb = new int[14];
        cbb = new int[14];
        ebb = new int[14];
        fbb = new int[14];
        gbb = false;
        jbb = new int[256];
        kbb = new int[256];
        lbb = new int[256];
        mbb = -1;
        nbb = -2;
        obb = false;
        qbb = new int[256];
        rbb = new int[256];
        tbb = new int[256];
        ubb = new int[256];
        vbb = -1;
        wbb = -2;
        xbb = false;
        zbb = new String[5];
        dcb = "";
        ecb = "";
        jcb = false;
        gdb = "";
        hdb = "";
        idb = "";
        jdb = "";
        aeb = false;
        eeb = -1;
        feb = new int[5];
        geb = new int[5];
        heb = new int[5];
        ieb = new int[5];
        keb = new String[5];
        leb = false;
        xeb = new int[5];
        yeb = new int[5];
        afb = new String[50];
        bfb = new int[50];
        cfb = new int[50];
        dfb = new int[50];
        efb = new int[50];
        gfb = new int[50];
        hfb = new int[50];
        ifb = new int[50];
        jfb = new int[50];
        lfb = new int[50];
        mfb = new int[50];
        nfb = new int[50];
        rfb = false;
        tfb = 1;
        ufb = 2;
        vfb = 2;
        wfb = 8;
        xfb = 14;
        zfb = 1;
    }

    public BigInteger ht;
    public BigInteger it;
    int jt;
    boolean kt;
    boolean lt;
    public boolean mt;
    int nt;
    int ot;
    int pt;
    int qt;
    int rt[];
    int st[];
    int tt;
    int ut[];
    int vt[];
    int wt;
    int xt;
    int yt;
    int zt;
    int au;
    Graphics bu;
    k cu;
    n du;
    Image eu;
    int fu;
    int gu;
    int hu;
    int iu;
    int ju;
    int ku;
    int lu;
    int mu;
    int nu;
    int ou;
    int pu;
    int qu;
    int ru;
    int su;
    int tu;
    int uu;
    int vu;
    int wu;
    q xu;
    int yu;
    int zu;
    int av;
    int bv;
    int cv;
    int dv;
    int ev;
    int fv;
    int gv;
    int hv;
    int iv;
    int jv;
    int kv;
    int lv;
    int mv;
    boolean nv;
    int ov;
    int pv;
    int qv;
    int rv;
    int sv;
    int tv;
    int uv;
    int vv;
    int wv;
    int xv;
    int yv;
    m zv[];
    m aw[];
    m bw[];
    m cw;
    int dw;
    int ew;
    int fw;
    int gw;
    int hw;
    int iw;
    int jw;
    m kw[];
    m lw[];
    m mw[];
    int nw[];
    int ow;
    int pw;
    int qw;
    int rw[];
    int sw[];
    int tw[];
    int uw[];
    int vw;
    int ww;
    i xw[];
    int yw[];
    int zw[];
    int ax[];
    int bx[];
    i cx[];
    boolean dx[];
    int ex;
    int fx;
    i gx[];
    int hx[];
    int ix[];
    int jx[];
    int kx[];
    boolean lx[];
    int mx;
    int nx;
    int ox;
    int px[];
    int qx[];
    int rx[];
    int sx;
    String tx;
    int ux[];
    int vx[];
    int wx[];
    int xx[];
    int yx[];
    int zx;
    String ay[] = {
        "Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", 
        "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw"
    };
    String by[] = {
        "Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"
    };
    h cy;
    int dy;
    int ey;
    int fy;
    h gy;
    int hy;
    int iy;
    long jy;
    h ky;
    int ly;
    int my;
    int ny;
    String oy[] = {
        "Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", 
        "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion", "Dragon slayer"
    };
    boolean py[];
    boolean qy[];
    boolean ry;
    boolean sy;
    boolean ty;
    int uy;
    int vy;
    int wy;
    int xy;
    int yy;
    int zy;
    boolean az;
    String bz[];
    String cz[];
    int dz[];
    int ez[];
    int fz[];
    int gz[];
    int hz[];
    int iz[];
    int jz[];
    int kz;
    int lz;
    int mz;
    int nz;
    h oz;
    int pz;
    int qz;
    int rz;
    int sz;
    int tz;
    int uz;
    String vz[];
    int wz[];
    boolean xz;
    String yz;
    int zz;
    int aab[];
    int bab[];
    int cab;
    int dab[];
    int eab[];
    boolean fab;
    boolean gab;
    boolean hab;
    boolean iab;
    boolean jab;
    boolean kab;
    boolean lab;
    String mab;
    int nab;
    int oab[];
    int pab[];
    int qab;
    int rab[];
    int sab[];
    boolean tab;
    boolean uab;
    int vab;
    int wab;
    long xab;
    boolean yab;
    boolean zab;
    int abb;
    int bbb[];
    int cbb[];
    int dbb;
    int ebb[];
    int fbb[];
    boolean gbb;
    int hbb;
    int ibb;
    int jbb[];
    int kbb[];
    int lbb[];
    int mbb;
    int nbb;
    boolean obb;
    int pbb;
    int qbb[];
    int rbb[];
    int sbb;
    int tbb[];
    int ubb[];
    int vbb;
    int wbb;
    boolean xbb;
    int ybb;
    String zbb[];
    int acb;
    int bcb;
    int ccb;
    String dcb;
    String ecb;
    int fcb;
    int gcb;
    int hcb;
    int icb;
    boolean jcb;
    int kcb;
    h lcb;
    int mcb;
    int ncb;
    h ocb;
    int pcb;
    int qcb;
    int rcb;
    int scb;
    int tcb;
    int ucb;
    int vcb;
    int wcb;
    h xcb;
    int ycb;
    int zcb;
    int adb;
    int bdb;
    int cdb;
    int ddb;
    int edb;
    int fdb;
    String gdb;
    String hdb;
    String idb;
    String jdb;
    h kdb;
    int ldb;
    int mdb;
    int ndb;
    int odb;
    int pdb;
    int qdb;
    int rdb;
    int sdb;
    int tdb;
    int udb;
    int vdb;
    int wdb;
    int xdb;
    int ydb;
    int zdb;
    boolean aeb;
    h beb;
    int ceb;
    int deb;
    int eeb;
    int feb[];
    int geb[];
    int heb[];
    int ieb[];
    int jeb[] = {
        0, 1, 2, 3, 4
    };
    String keb[];
    boolean leb;
    h meb;
    int neb;
    int oeb;
    int peb;
    int qeb;
    int reb;
    int seb;
    int teb;
    int ueb;
    int veb;
    int web;
    int xeb[];
    int yeb[];
    int zeb;
    String afb[];
    int bfb[];
    int cfb[];
    int dfb[];
    int efb[];
    int ffb;
    int gfb[];
    int hfb[];
    int ifb[];
    int jfb[];
    int kfb;
    int lfb[];
    int mfb[];
    int nfb[];
    int ofb;
    int pfb;
    int qfb[][] = {
        {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            3, 4
        }, {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            3, 4
        }, {
            11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 
            8, 4
        }, {
            3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 
            0, 5
        }, {
            11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 
            8, 3
        }, {
            11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
            4, 3
        }
    };
    boolean rfb;
    int sfb;
    int tfb;
    int ufb;
    int vfb;
    int wfb;
    int xfb;
    int yfb;
    int zfb;
    public int agb[] = {
        0xff0000, 0xff8000, 0xffe000, 0xa0e000, 57344, 32768, 41088, 45311, 33023, 12528, 
        0xe000e0, 0x303030, 0x604000, 0x805000, 0xffffff
    };
    public int bgb[] = {
        0xffc030, 0xffa040, 0x805030, 0x604020, 0x303030, 0xff6020, 0xff4000, 0xffffff, 65280, 65535
    };
    public int cgb[] = {
        0xecded0, 0xccb366, 0xb38c40, 0x997326, 0x906020
    };
    int dgb[] = {
        0, 1, 2, 1
    };
    int egb[] = {
        0, 1, 2, 1, 0, 0, 0, 0
    };
    int fgb[] = {
        0, 0, 0, 0, 0, 1, 2, 1
    };
    String ggb[] = {
        "Where were you born?", "What was your first teacher's name?", "What is your father's middle name?", "Who was your first best friend?", "What is your favourite vacation spot?", "What is your mother's middle name?", "What was your first pet's name?", "What was the name of your first school?", "What is your mother's maiden name?", "Who was your first boyfriend/girlfriend?", 
        "What was the first computer game you purchased?", "Who is your favourite actor/actress?", "Who is your favourite author?", "Who is your favourite musician?", "Who is your favourite cartoon character?", "What is your favourite book?", "What is your favourite food?", "What is your favourite movie?"
    };
}
