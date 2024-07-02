// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import jagex.g;
import jagex.p;
import java.applet.Applet;
import java.io.*;
import java.net.*;

public class a extends g
    implements Runnable {

    public a(InputStream inputstream) {
        d = false;
        i = true;
        a = inputstream;
    }

    public a(Socket socket) throws IOException {
        d = false;
        i = true;
        c = socket;
        a = socket.getInputStream();
        b = socket.getOutputStream();
    }

    public a(String s) throws IOException {
        d = false;
        i = true;
        a = p.jn(s);
    }

    public a(String s, Applet applet, int j) throws IOException {
        d = false;
        i = true;
        if(applet != null)
            c = new Socket(InetAddress.getByName(applet.getCodeBase().getHost()), j);
        else
            c = new Socket(InetAddress.getByName(s), j);
        c.setSoTimeout(30000);
        c.setTcpNoDelay(true);
        a = c.getInputStream();
        b = c.getOutputStream();
    }

    public void yb() {
        super.yb();
        d = true;
        try {
            if(a != null)
                a.close();
            if(b != null)
                b.close();
            if(c != null)
                c.close();
        }
        catch(IOException _ex) {
            System.out.println("Error closing stream");
        }
        if(h != null) {
            i = true;
            synchronized(this) {
                notify();
            }
            h = null;
        }
        e = null;
    }

    public int gc() throws IOException {
        if(d)
            return 0;
        else
            return a.read();
    }

    public int eb() throws IOException {
        if(d)
            return 0;
        else
            return a.available();
    }

    public void pb(int j, int k, byte abyte0[]) throws IOException {
        if(d)
            return;
        int l = 0;
        boolean flag = false;
        int i1;
        for(; l < j; l += i1)
            if((i1 = a.read(abyte0, l + k, j - l)) <= 0)
                throw new IOException("EOF");

    }

    public void ib(byte abyte0[], int j, int k) throws IOException {
        if(d)
            return;
        if(e == null)
            e = new byte[5000];
        synchronized(this) {
            for(int l = 0; l < k; l++) {
                e[g] = abyte0[l + j];
                g = (g + 1) % 5000;
                if(g == (f + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            if(h == null) {
                i = false;
                h = new Thread(this);
                h.setDaemon(true);
                h.setPriority(4);
                h.start();
            }
            notify();
        }
    }

    public void run() {
        while(h != null && !i)  {
            int j;
            int k;
            synchronized(this) {
                if(g == f)
                    try {
                        wait();
                    }
                    catch(InterruptedException _ex) { }
                if(h == null || i)
                    return;
                k = f;
                if(g >= f)
                    j = g - f;
                else
                    j = 5000 - f;
            }
            if(j > 0) {
                try {
                    b.write(e, k, j);
                }
                catch(IOException ioexception) {
                    super.yd = true;
                    super.zd = "Twriter:" + ioexception;
                }
                f = (f + j) % 5000;
                try {
                    if(g == f)
                        b.flush();
                }
                catch(IOException ioexception1) {
                    super.yd = true;
                    super.zd = "Twriter:" + ioexception1;
                }
            }
        }
    }

    private InputStream a;
    private OutputStream b;
    private Socket c;
    private boolean d;
    private byte e[];
    private int f;
    private int g;
    private Thread h;
    private boolean i;
}
