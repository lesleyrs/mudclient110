// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

package jagex.client;

import java.awt.*;

// Referenced classes of package jagex.client:
//            l

public class d extends Frame {

    public d(l l1, int i, int j, String s, boolean flag, boolean flag1) {
        rc = 28;
        oc = i;
        pc = j;
        sc = l1;
        if(flag1)
            rc = 48;
        else
            rc = 28;
        setTitle(s);
        setResizable(flag);
        show();
        toFront();
        resize(oc, pc);
        tc = getGraphics();
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        if(qc == 0)
            g.translate(0, 24);
        else
            g.translate(-5, 0);
        return g;
    }

    public void resize(int i, int j) {
        super.resize(i, j + rc);
    }

    public int a() {
        return size().width;
    }

    public int b() {
        return size().height - rc;
    }

    public boolean handleEvent(Event event) {
        if(event.id == 401)
            sc.keyDown(event, event.key);
        else
        if(event.id == 402)
            sc.keyUp(event, event.key);
        else
        if(event.id == 501)
            sc.mouseDown(event, event.x, event.y - 24);
        else
        if(event.id == 506)
            sc.mouseDrag(event, event.x, event.y - 24);
        else
        if(event.id == 502)
            sc.mouseUp(event, event.x, event.y - 24);
        else
        if(event.id == 503)
            sc.mouseMove(event, event.x, event.y - 24);
        else
        if(event.id == 201)
            sc.destroy();
        else
        if(event.id == 1001)
            sc.action(event, event.target);
        else
        if(event.id == 403)
            sc.keyDown(event, event.key);
        else
        if(event.id == 404)
            sc.keyUp(event, event.key);
        return true;
    }

    public final void paint(Graphics g) {
        sc.paint(g);
    }

    int oc;
    int pc;
    int qc;
    int rc;
    l sc;
    Graphics tc;
}
