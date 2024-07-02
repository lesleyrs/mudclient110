// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

import jagex.client.j;
import java.awt.Component;

public class n extends j {

    public n(int i, int k, int l, Component component) {
        super(i, k, l, component);
        boolean flag = false;
        if(flag)
            new j(i, k, l, component);
    }

    public void ig(int i, int k, int l, int i1, int j1, int k1, int l1) {
        if(j1 >= 40000) {
            qs.ym(i, k, l, i1, j1 - 40000, k1, l1);
            return;
        }
        if(j1 >= 20000) {
            qs.dn(i, k, l, i1, j1 - 20000, k1, l1);
            return;
        }
        if(j1 >= 5000) {
            qs.tl(i, k, l, i1, j1 - 5000, k1, l1);
            return;
        } else {
            super.tf(i, k, l, i1, j1);
            return;
        }
    }

    public mudclient qs;
}
