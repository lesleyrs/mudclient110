// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex;

import java.io.IOException;
import java.math.BigInteger;

// Referenced classes of package jagex:
//            p

public class g {

    public void yb() {
    }

    public int gc() throws IOException {
        return 0;
    }

    public int eb() throws IOException {
        return 0;
    }

    public void pb(int i, int j, byte abyte0[]) throws IOException {
    }

    public void ib(byte abyte0[], int i, int j) throws IOException {
    }

    public int nb() throws IOException {
        return gc();
    }

    public int mb() throws IOException {
        int i = nb();
        int j = nb();
        return i * 256 + j;
    }

    public int kb() throws IOException {
        int i = mb();
        int j = mb();
        return i * 0x10000 + j;
    }

    public void jb(int i, byte abyte0[]) throws IOException {
        pb(i, 0, abyte0);
    }

    public String ac() throws IOException {
        String s = "";
        int i;
        for(i = gc(); i == 10 || i == 13; i = gc());
        for(; i != 10 && i != 13 && i != -1; i = gc())
            s = s + ne[i];

        return s;
    }

    public void fb() throws IOException {
        for(int i = gc(); i != 61 && i != -1; i = gc());
    }

    public int ob() throws IOException {
        int i = 0;
        boolean flag = false;
        int j;
        for(j = gc(); j < 48 || j > 57;) {
            if(j == 45)
                flag = true;
            j = gc();
            if(j == -1)
                throw new IOException("Eof!");
        }

        for(; j >= 48 && j <= 57; j = gc())
            i = (i * 10 + j) - 48;

        if(flag)
            i = -i;
        return i;
    }

    public String wb() throws IOException {
        String s = "";
        boolean flag = false;
        int i;
        for(i = gc(); i < 32 || i == 44 || i == 59 || i == 61;) {
            i = gc();
            if(i == -1)
                throw new IOException("Eof!");
        }

        if(i == 34) {
            flag = true;
            i = gc();
        }
        for(; i != -1; i = gc()) {
            if(!flag && (i == 44 || i == 61 || i == 59) || flag && i == 34)
                break;
            s = s + ne[i];
        }

        return s;
    }

    public int hb() throws IOException {
        int i = 0;
        int j;
        for(j = gc(); (j < 48 || j > 57) && (j < 97 || j > 102) && (j < 65 || j > 70);) {
            j = gc();
            if(j == -1)
                throw new IOException("Eof!");
        }

        do {
            if(j >= 48 && j <= 57)
                i = (i * 16 + j) - 48;
            else
            if(j >= 97 && j <= 102) {
                i = (i * 16 + j + 10) - 97;
            } else {
                if(j < 65 || j > 70)
                    break;
                i = (i * 16 + j + 10) - 65;
            }
            j = gc();
        } while(true);
        return i;
    }

    public int ub(byte abyte0[]) {
        try {
            pe++;
            if(qe > 0 && pe > qe) {
                yd = true;
                zd = "time-out";
                return 0;
            }
            if(oe == 0 && eb() >= 2) {
                oe = gc();
                if(oe >= 160)
                    oe = (oe - 160) * 256 + gc();
            }
            if(oe > 0 && eb() >= oe) {
                if(oe >= 160) {
                    jb(oe, abyte0);
                } else {
                    abyte0[oe - 1] = (byte)gc();
                    if(oe > 1)
                        jb(oe - 1, abyte0);
                }
                int i = oe;
                oe = 0;
                pe = 0;
                return i;
            }
        }
        catch(IOException ioexception) {
            yd = true;
            zd = ioexception.getMessage();
        }
        return 0;
    }

    public void ec(int i) {
        ue[se++] = (byte)i;
    }

    public void dc(int i) {
        ue[se++] = (byte)(i >> 8);
        ue[se++] = (byte)i;
    }

    public void sb(int i, int j) {
        ue[re + j] = (byte)(i >> 8);
        ue[re + j + 1] = (byte)i;
    }

    public void cc(int i) {
        ue[se++] = (byte)(i >> 24);
        ue[se++] = (byte)(i >> 16);
        ue[se++] = (byte)(i >> 8);
        ue[se++] = (byte)i;
    }

    public void lb(long l) {
        cc((int)(l >> 32));
        cc((int)(l & -1L));
    }

    public void zb(String s) {
        s.getBytes(0, s.length(), ue, se);
        se += s.length();
    }

    public void fc(byte abyte0[], int i, int j) {
        for(int k = 0; k < j; k++)
            ue[se++] = abyte0[i + k];

    }

    public void bc(long l, int i, BigInteger biginteger, BigInteger biginteger1) {
        byte abyte0[] = new byte[15];
        abyte0[0] = (byte)(int)(1.0D + Math.random() * 127D);
        abyte0[1] = (byte)(int)(Math.random() * 256D);
        abyte0[2] = (byte)(int)(Math.random() * 256D);
        p.co(abyte0, 3, i);
        p.on(abyte0, 7, l);
        BigInteger biginteger2 = new BigInteger(1, abyte0);
        BigInteger biginteger3 = biginteger2.modPow(biginteger, biginteger1);
        byte abyte1[] = biginteger3.toByteArray();
        ue[se++] = (byte)abyte1.length;
        for(int j = 0; j < abyte1.length; j++)
            ue[se++] = abyte1[j];

    }

    public void vb(String s, int i, BigInteger biginteger, BigInteger biginteger1) {
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        byte abyte1[] = new byte[15];
        for(int k = 0; k < j; k += 7) {
            abyte1[0] = (byte)(int)(1.0D + Math.random() * 127D);
            abyte1[1] = (byte)(int)(Math.random() * 256D);
            abyte1[2] = (byte)(int)(Math.random() * 256D);
            abyte1[3] = (byte)(int)(Math.random() * 256D);
            p.co(abyte1, 4, i);
            for(int l = 0; l < 7; l++)
                if(k + l < j)
                    abyte1[8 + l] = abyte0[k + l];
                else
                    abyte1[8 + l] = 32;

            BigInteger biginteger2 = new BigInteger(1, abyte1);
            BigInteger biginteger3 = biginteger2.modPow(biginteger, biginteger1);
            byte abyte2[] = biginteger3.toByteArray();
            ue[se++] = (byte)abyte2.length;
            for(int i1 = 0; i1 < abyte2.length; i1++)
                ue[se++] = abyte2[i1];

        }

    }

    public void gb(int i) {
        if(re > (xd * 4) / 5)
            try {
                qb(0);
            }
            catch(IOException ioexception) {
                yd = true;
                zd = ioexception.getMessage();
            }
        if(ue == null)
            ue = new byte[xd];
        ue[re + 2] = (byte)i;
        ue[re + 3] = 0;
        se = re + 3;
        te = 8;
    }

    public void xb() {
        if(te != 8)
            se++;
        int i = se - re - 2;
        if(i >= 160) {
            ue[re] = (byte)(160 + i / 256);
            ue[re + 1] = (byte)(i & 0xff);
        } else {
            ue[re] = (byte)i;
            se--;
            ue[re + 1] = ue[se];
        }
        if(xd <= 10000) {
            int j = ue[re + 2] & 0xff;
            vd[j]++;
            wd[j] += se - re;
        }
        re = se;
    }

    public void rb() throws IOException {
        xb();
        qb(0);
    }

    public void qb(int i) throws IOException {
        if(yd) {
            re = 0;
            se = 3;
            yd = false;
            throw new IOException(zd);
        }
        ae++;
        if(ae < i)
            return;
        if(re > 0) {
            ae = 0;
            ib(ue, 0, re);
        }
        re = 0;
        se = 3;
    }

    public boolean tb() {
        return re > 0;
    }

    public g() {
        xd = 5000;
        yd = false;
        zd = "";
        se = 3;
        te = 8;
    }

    public static int vd[] = new int[256];
    public static int wd[] = new int[256];
    protected int xd;
    protected boolean yd;
    protected String zd;
    protected int ae;
    final int be = 61;
    final int ce = 59;
    final int de = 42;
    final int ee = 43;
    final int fe = 44;
    final int ge = 45;
    final int he = 46;
    final int ie = 47;
    final int je = 92;
    final int ke = 32;
    final int le = 124;
    final int me = 34;
    static char ne[];
    private int oe;
    public int pe;
    public int qe;
    private int re;
    private int se;
    private int te;
    private byte ue[];
    private static int ve[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff, 
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff, 
        0x3fffffff, 0x7fffffff, -1
    };

    static  {
        ne = new char[256];
        for(int i = 0; i < 256; i++)
            ne[i] = (char)i;

        ne[61] = '=';
        ne[59] = ';';
        ne[42] = '*';
        ne[43] = '+';
        ne[44] = ',';
        ne[45] = '-';
        ne[46] = '.';
        ne[47] = '/';
        ne[92] = '\\';
        ne[124] = '|';
        ne[33] = '!';
        ne[34] = '"';
    }
}
