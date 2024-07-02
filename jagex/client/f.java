// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import jagex.g;
import jagex.p;
import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;

// Referenced classes of package jagex.client:
//            l, a

public class f extends l {

    public void t(BigInteger biginteger, BigInteger biginteger1) {
        rd = biginteger;
        sd = biginteger1;
    }

    public int d() {
        try {
            String s1 = getParameter("ranseed");
            String s2 = s1.substring(0, 10);
            int i1 = Integer.parseInt(s2);
            if(i1 == 0x3ade68b1) {
                byte abyte0[] = new byte[4];
                jagex.p.in("uid.dat", abyte0, 4);
                i1 = jagex.p.yn(abyte0, 0);
            }
            return i1;
        }
        catch(Exception _ex) {
            return 0;
        }
    }

    public void m(String s1, String s2, boolean flag) {
        if(ud > 0) {
            db(vc[6], vc[7]);
            try {
                Thread.sleep(2000L);
            }
            catch(Exception _ex) { }
            db(vc[8], vc[9]);
            return;
        }
        try {
            bd = s1;
            s1 = jagex.p._mthdo(s1, 20);
            cd = s2;
            s2 = jagex.p._mthdo(s2, 20);
            if(s1.trim().length() == 0) {
                db(vc[0], vc[1]);
                return;
            }
            if(flag)
                f(vc[2], vc[3]);
            else
                db(vc[6], vc[7]);
            if(dk())
                dd = new a(yc, this, ad);
            else
                dd = new a(yc, null, ad);
            dd.qe = xc;
            int i1 = dd.kb();
            td = i1;
            System.out.println("Session id: " + i1);
            if(flag)
                dd.gb(19);
            else
                dd.gb(0);
            dd.dc(wc);
            dd.lb(jagex.p.sn(s1));
            dd.vb(s2, i1, rd, sd);
            dd.cc(d());
            dd.rb();
            dd.gc();
            int j1 = dd.gc();
            System.out.println("Login response: " + j1);
            if(j1 == 0) {
                fd = 0;
                g();
                return;
            }
            if(j1 == 1) {
                fd = 0;
                c();
                return;
            }
            if(flag) {
                s1 = "";
                s2 = "";
                h();
                return;
            }
            if(j1 == 3) {
                db(vc[10], vc[11]);
                return;
            }
            if(j1 == 4) {
                db(vc[4], vc[5]);
                return;
            }
            if(j1 == 5) {
                db(vc[16], vc[17]);
                return;
            }
            if(j1 == 6) {
                db(vc[18], vc[19]);
                return;
            }
            if(j1 == 7) {
                db(vc[20], vc[21]);
                return;
            }
            if(j1 == 11) {
                db(vc[22], vc[23]);
                return;
            }
            if(j1 == 12) {
                db(vc[24], vc[25]);
                return;
            }
            if(j1 == 13) {
                db(vc[14], vc[15]);
                return;
            }
            if(j1 == 14) {
                db(vc[8], vc[9]);
                ud = 1500;
                return;
            } else {
                db(vc[12], vc[13]);
                return;
            }
        }
        catch(Exception exception) {
            System.out.println(String.valueOf(exception));
        }
        if(!dk())
            yc = zc;
        if(fd > 0) {
            try {
                Thread.sleep(5000L);
            }
            catch(Exception _ex) { }
            fd--;
            m(s1, s2, flag);
        }
        if(flag) {
            s1 = "";
            s2 = "";
            h();
        } else {
            db(vc[12], vc[13]);
        }
    }

    public void bb() {
        if(dd != null)
            try {
                dd.gb(1);
                dd.rb();
            }
            catch(IOException _ex) { }
        bd = "";
        cd = "";
        h();
    }

    public void q() {
        System.out.println("Lost connection");
        fd = 10;
        m(bd, cd, true);
    }

    public void f(String s1, String s2) {
        Graphics g1 = getGraphics();
        Font font = new Font("Helvetica", 1, 15);
        int i1 = rj();
        int j1 = bk();
        g1.setColor(Color.black);
        g1.fillRect(i1 / 2 - 140, j1 / 2 - 25, 280, 50);
        g1.setColor(Color.white);
        g1.drawRect(i1 / 2 - 140, j1 / 2 - 25, 280, 50);
        lj(g1, s1, font, i1 / 2, j1 / 2 - 10);
        lj(g1, s2, font, i1 / 2, j1 / 2 + 10);
    }

    public void n(String s1, String s2) {
        if(ud > 0) {
            db(vc[6], vc[7]);
            try {
                Thread.sleep(2000L);
            }
            catch(Exception _ex) { }
            db(vc[8], vc[9]);
            return;
        }
        try {
            s1 = jagex.p._mthdo(s1, 20);
            s2 = jagex.p._mthdo(s2, 20);
            db(vc[6], vc[7]);
            if(dk())
                dd = new a(yc, this, ad);
            else
                dd = new a(yc, null, ad);
            int i1 = dd.kb();
            td = i1;
            System.out.println("Session id: " + i1);
            dd.gb(2);
            dd.dc(wc);
            dd.lb(jagex.p.sn(s1));
            dd.vb(s2, i1, rd, sd);
            dd.cc(d());
            dd.rb();
            dd.gc();
            int j1 = dd.gc();
            dd.yb();
            System.out.println("Newplayer response: " + j1);
            if(j1 == 2) {
                v();
                return;
            }
            if(j1 == 3) {
                db(vc[14], vc[15]);
                return;
            }
            if(j1 == 4) {
                db(vc[4], vc[5]);
                return;
            }
            if(j1 == 5) {
                db(vc[16], vc[17]);
                return;
            }
            if(j1 == 6) {
                db(vc[18], vc[19]);
                return;
            }
            if(j1 == 7) {
                db(vc[20], vc[21]);
                return;
            }
            if(j1 == 11) {
                db(vc[22], vc[23]);
                return;
            }
            if(j1 == 12) {
                db(vc[24], vc[25]);
                return;
            }
            if(j1 == 13) {
                db(vc[14], vc[15]);
                return;
            }
            if(j1 == 14) {
                db(vc[8], vc[9]);
                ud = 1500;
                return;
            } else {
                db(vc[12], vc[13]);
                return;
            }
        }
        catch(Exception exception) {
            System.out.println(String.valueOf(exception));
        }
        db(vc[12], vc[13]);
    }

    public void k() {
        long l1 = System.currentTimeMillis();
        if(dd.tb())
            gd = l1;
        if(l1 - gd > 5000L) {
            gd = l1;
            dd.gb(5);
            dd.xb();
        }
        try {
            dd.qb(20);
        }
        catch(IOException _ex) {
            q();
            return;
        }
        if(!x())
            return;
        int i1 = dd.ub(ed);
        if(i1 > 0)
            e(ed[0] & 0xff, i1);
    }

    public void e(int i1, int j1) {
        if(i1 == 8) {
            String s1 = new String(ed, 1, j1 - 1);
            i(s1);
        }
        if(i1 == 9)
            bb();
        if(i1 == 10) {
            l();
            return;
        }
        if(i1 == 23) {
            hd = jagex.p.wn(ed[1]);
            for(int k1 = 0; k1 < hd; k1++) {
                id[k1] = jagex.p.rn(ed, 2 + k1 * 9);
                jd[k1] = jagex.p.wn(ed[10 + k1 * 9]);
            }

            ab();
            return;
        }
        if(i1 == 24) {
            long l1 = jagex.p.rn(ed, 1);
            int j2 = ed[9] & 0xff;
            for(int k2 = 0; k2 < hd; k2++)
                if(id[k2] == l1) {
                    if(jd[k2] == 0 && j2 != 0)
                        i("@pri@" + jagex.p.xn(l1) + " has logged in");
                    if(jd[k2] != 0 && j2 == 0)
                        i("@pri@" + jagex.p.xn(l1) + " has logged out");
                    jd[k2] = j2;
                    j1 = 0;
                    ab();
                    return;
                }

            id[hd] = l1;
            jd[hd] = j2;
            hd++;
            i("@pri@" + jagex.p.xn(l1) + " has been added to your friends list");
            ab();
            return;
        }
        if(i1 == 26) {
            kd = jagex.p.wn(ed[1]);
            for(int i2 = 0; i2 < kd; i2++)
                ld[i2] = jagex.p.rn(ed, 2 + i2 * 8);

            return;
        }
        if(i1 == 27) {
            md = ed[1];
            nd = ed[2];
            od = ed[3];
            pd = ed[4];
            qd = ed[5];
            return;
        }
        if(i1 == 28) {
            long l2 = jagex.p.rn(ed, 1);
            String s2 = jagex.p.qn(ed, 9, j1 - 9, true);
            i("@pri@" + jagex.p.xn(l2) + ": tells you " + s2);
            return;
        } else {
            o(i1, j1, ed);
            return;
        }
    }

    public void ab() {
        boolean flag = true;
        while(flag)  {
            flag = false;
            for(int i1 = 0; i1 < hd - 1; i1++)
                if(jd[i1] < jd[i1 + 1]) {
                    int j1 = jd[i1];
                    jd[i1] = jd[i1 + 1];
                    jd[i1 + 1] = j1;
                    long l1 = id[i1];
                    id[i1] = id[i1 + 1];
                    id[i1 + 1] = l1;
                    flag = true;
                }

        }
    }

    public void y(String s1, String s2) {
        s1 = jagex.p._mthdo(s1, 20);
        s2 = jagex.p._mthdo(s2, 20);
        dd.gb(25);
        dd.vb(s1 + s2, td, rd, sd);
        dd.xb();
    }

    public void cb(int i1, int j1, int k1, int l1, int i2) {
        dd.gb(31);
        dd.ec(i1);
        dd.ec(j1);
        dd.ec(k1);
        dd.ec(l1);
        dd.ec(i2);
        dd.xb();
    }

    public void z(String s1) {
        long l1 = jagex.p.sn(s1);
        dd.gb(29);
        dd.lb(l1);
        dd.xb();
        for(int i1 = 0; i1 < kd; i1++)
            if(ld[i1] == l1)
                return;

        if(kd >= 50) {
            return;
        } else {
            ld[kd++] = l1;
            return;
        }
    }

    public void p(long l1) {
        dd.gb(30);
        dd.lb(l1);
        dd.xb();
        for(int i1 = 0; i1 < kd; i1++)
            if(ld[i1] == l1) {
                kd--;
                for(int j1 = i1; j1 < kd; j1++)
                    ld[j1] = ld[j1 + 1];

                return;
            }

    }

    public void u(String s1) {
        dd.gb(26);
        dd.lb(jagex.p.sn(s1));
        dd.xb();
    }

    public void j(long l1) {
        dd.gb(27);
        dd.lb(l1);
        dd.xb();
        for(int i1 = 0; i1 < hd; i1++) {
            if(id[i1] != l1)
                continue;
            hd--;
            for(int j1 = i1; j1 < hd; j1++) {
                id[j1] = id[j1 + 1];
                jd[j1] = jd[j1 + 1];
            }

            break;
        }

        i("@pri@" + jagex.p.xn(l1) + " has been removed from your friends list");
    }

    public void w(long l1, byte abyte0[], int i1) {
        dd.gb(28);
        dd.lb(l1);
        dd.fc(abyte0, 0, i1);
        dd.xb();
    }

    public void r(byte abyte0[], int i1) {
        dd.gb(3);
        dd.fc(abyte0, 0, i1);
        dd.xb();
    }

    public void s(String s1) {
        dd.gb(7);
        dd.zb(s1);
        dd.xb();
    }

    public void db(String s1, String s2) {
    }

    public void c() {
    }

    public void g() {
    }

    public void h() {
    }

    public void l() {
    }

    public void v() {
    }

    public void o(int i1, int j1, byte abyte0[]) {
    }

    public void i(String s1) {
    }

    public boolean x() {
        return true;
    }

    public f() {
        yc = "127.0.0.1";
        zc = "66.28.11.53";
        ad = 43594;
        bd = "";
        cd = "";
        ed = new byte[5000];
        id = new long[100];
        jd = new int[100];
        ld = new long[50];
    }

    public static String vc[];
    public static int wc = 1;
    public static int xc;
    public String yc;
    public String zc;
    public int ad;
    String bd;
    String cd;
    public a dd;
    byte ed[];
    int fd;
    long gd;
    public int hd;
    public long id[];
    public int jd[];
    public int kd;
    public long ld[];
    public int md;
    public int nd;
    public int od;
    public int pd;
    public int qd;
    public BigInteger rd;
    public BigInteger sd;
    public int td;
    public int ud;

    static  {
        vc = new String[50];
        vc[0] = "You must enter both a username";
        vc[1] = "and a password - Please try again";
        vc[2] = "Connection lost! Please wait...";
        vc[3] = "Attempting to re-establish";
        vc[4] = "That username is already in use.";
        vc[5] = "Wait 60 seconds then retry";
        vc[6] = "Please wait...";
        vc[7] = "Connecting to server";
        vc[8] = "Sorry! The server is currently full.";
        vc[9] = "Please try again later";
        vc[10] = "Invalid username or password.";
        vc[11] = "Try again, or create a new account";
        vc[12] = "Sorry! Unable to connect to server.";
        vc[13] = "Check your internet settings";
        vc[14] = "Username already taken.";
        vc[15] = "Please choose another username";
        vc[16] = "The client has been updated.";
        vc[17] = "Please reload this page";
        vc[18] = "You may only use 1 character at once.";
        vc[19] = "Your ip-address is already in use";
        vc[20] = "Login attempts exceeded!";
        vc[21] = "Please try again in 5 minutes";
        vc[22] = "Account has been temporarily disabled";
        vc[23] = "for cheating or abuse";
        vc[24] = "Account has been permanently disabled";
        vc[25] = "for cheating or abuse";
    }
}
