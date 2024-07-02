// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

import jagex.client.*;
import jagex.p;
import java.io.IOException;

public class q {

    public q(k k1, j j1) {
        qgb = true;
        rgb = false;
        ugb = 750;
        xgb = new int[256];
        dhb = new byte[4][2304];
        ehb = new byte[4][2304];
        fhb = new byte[4][2304];
        ghb = new byte[4][2304];
        hhb = new byte[4][2304];
        ihb = new byte[4][2304];
        jhb = new byte[4][2304];
        khb = new int[4][2304];
        lhb = 96;
        mhb = 96;
        nhb = new int[lhb * mhb * 2];
        ohb = new int[lhb * mhb * 2];
        phb = new int[lhb][mhb];
        qhb = new int[lhb][mhb];
        rhb = new int[lhb][mhb];
        shb = false;
        thb = new i[64];
        uhb = new i[4][64];
        vhb = new i[4][64];
        tgb = k1;
        sgb = j1;
        for(int l = 0; l < 64; l++)
            xgb[l] = k.ki(255 - l * 4, 255 - (int)((double)l * 1.75D), 255 - l * 4);

        for(int i1 = 0; i1 < 64; i1++)
            xgb[i1 + 64] = k.ki(i1 * 3, 144, 0);

        for(int l1 = 0; l1 < 64; l1++)
            xgb[l1 + 128] = k.ki(192 - (int)((double)l1 * 1.5D), 144 - (int)((double)l1 * 1.5D), 0);

        for(int i2 = 0; i2 < 64; i2++)
            xgb[i2 + 192] = k.ki(96 - (int)((double)i2 * 1.5D), 48 + (int)((double)i2 * 1.5D), 0);

    }

    public int io(int l, int i1, int j1, int k1, int l1, int i2, int ai[], 
            int ai1[], boolean flag) {
        for(int j2 = 0; j2 < lhb; j2++) {
            for(int k2 = 0; k2 < mhb; k2++)
                phb[j2][k2] = 0;

        }

        int l2 = 0;
        int i3 = 0;
        int j3 = l;
        int k3 = i1;
        phb[l][i1] = 99;
        ai[l2] = l;
        ai1[l2++] = i1;
        int l3 = ai.length;
        boolean flag1 = false;
        while(i3 != l2)  {
            j3 = ai[i3];
            k3 = ai1[i3];
            i3 = (i3 + 1) % l3;
            if(j3 >= j1 && j3 <= l1 && k3 >= k1 && k3 <= i2) {
                flag1 = true;
                break;
            }
            if(flag) {
                if(j3 > 0 && j3 - 1 >= j1 && j3 - 1 <= l1 && k3 >= k1 && k3 <= i2 && (qhb[j3 - 1][k3] & 8) == 0) {
                    flag1 = true;
                    break;
                }
                if(j3 < lhb - 1 && j3 + 1 >= j1 && j3 + 1 <= l1 && k3 >= k1 && k3 <= i2 && (qhb[j3 + 1][k3] & 2) == 0) {
                    flag1 = true;
                    break;
                }
                if(k3 > 0 && j3 >= j1 && j3 <= l1 && k3 - 1 >= k1 && k3 - 1 <= i2 && (qhb[j3][k3 - 1] & 4) == 0) {
                    flag1 = true;
                    break;
                }
                if(k3 < mhb - 1 && j3 >= j1 && j3 <= l1 && k3 + 1 >= k1 && k3 + 1 <= i2 && (qhb[j3][k3 + 1] & 1) == 0) {
                    flag1 = true;
                    break;
                }
            }
            if(j3 > 0 && phb[j3 - 1][k3] == 0 && (qhb[j3 - 1][k3] & 0x78) == 0) {
                ai[l2] = j3 - 1;
                ai1[l2] = k3;
                l2 = (l2 + 1) % l3;
                phb[j3 - 1][k3] = 2;
            }
            if(j3 < lhb - 1 && phb[j3 + 1][k3] == 0 && (qhb[j3 + 1][k3] & 0x72) == 0) {
                ai[l2] = j3 + 1;
                ai1[l2] = k3;
                l2 = (l2 + 1) % l3;
                phb[j3 + 1][k3] = 8;
            }
            if(k3 > 0 && phb[j3][k3 - 1] == 0 && (qhb[j3][k3 - 1] & 0x74) == 0) {
                ai[l2] = j3;
                ai1[l2] = k3 - 1;
                l2 = (l2 + 1) % l3;
                phb[j3][k3 - 1] = 1;
            }
            if(k3 < mhb - 1 && phb[j3][k3 + 1] == 0 && (qhb[j3][k3 + 1] & 0x71) == 0) {
                ai[l2] = j3;
                ai1[l2] = k3 + 1;
                l2 = (l2 + 1) % l3;
                phb[j3][k3 + 1] = 4;
            }
            if(j3 > 0 && k3 > 0 && (qhb[j3][k3 - 1] & 0x74) == 0 && (qhb[j3 - 1][k3] & 0x78) == 0 && (qhb[j3 - 1][k3 - 1] & 0x7c) == 0 && phb[j3 - 1][k3 - 1] == 0) {
                ai[l2] = j3 - 1;
                ai1[l2] = k3 - 1;
                l2 = (l2 + 1) % l3;
                phb[j3 - 1][k3 - 1] = 3;
            }
            if(j3 < lhb - 1 && k3 > 0 && (qhb[j3][k3 - 1] & 0x74) == 0 && (qhb[j3 + 1][k3] & 0x72) == 0 && (qhb[j3 + 1][k3 - 1] & 0x76) == 0 && phb[j3 + 1][k3 - 1] == 0) {
                ai[l2] = j3 + 1;
                ai1[l2] = k3 - 1;
                l2 = (l2 + 1) % l3;
                phb[j3 + 1][k3 - 1] = 9;
            }
            if(j3 > 0 && k3 < mhb - 1 && (qhb[j3][k3 + 1] & 0x71) == 0 && (qhb[j3 - 1][k3] & 0x78) == 0 && (qhb[j3 - 1][k3 + 1] & 0x79) == 0 && phb[j3 - 1][k3 + 1] == 0) {
                ai[l2] = j3 - 1;
                ai1[l2] = k3 + 1;
                l2 = (l2 + 1) % l3;
                phb[j3 - 1][k3 + 1] = 6;
            }
            if(j3 < lhb - 1 && k3 < mhb - 1 && (qhb[j3][k3 + 1] & 0x71) == 0 && (qhb[j3 + 1][k3] & 0x72) == 0 && (qhb[j3 + 1][k3 + 1] & 0x73) == 0 && phb[j3 + 1][k3 + 1] == 0) {
                ai[l2] = j3 + 1;
                ai1[l2] = k3 + 1;
                l2 = (l2 + 1) % l3;
                phb[j3 + 1][k3 + 1] = 12;
            }
        }
        if(!flag1)
            return -1;
        i3 = 0;
        ai[i3] = j3;
        ai1[i3++] = k3;
        int j4;
        for(int i4 = j4 = phb[j3][k3]; j3 != l || k3 != i1; i4 = phb[j3][k3]) {
            if(i4 != j4) {
                j4 = i4;
                ai[i3] = j3;
                ai1[i3++] = k3;
            }
            if((i4 & 2) != 0)
                j3++;
            else
            if((i4 & 8) != 0)
                j3--;
            if((i4 & 1) != 0)
                k3++;
            else
            if((i4 & 4) != 0)
                k3--;
        }

        return i3;
    }

    public void hp(int l, int i1, int j1) {
        qhb[l][i1] |= j1;
    }

    public void ap(int l, int i1, int j1) {
        qhb[l][i1] &= 65535 - j1;
    }

    public void ip(int l, int i1, int j1, int k1) {
        if(l < 0 || i1 < 0 || l >= lhb - 1 || i1 >= mhb - 1)
            return;
        if(t.rlb[k1] == 1) {
            if(j1 == 0) {
                qhb[l][i1] |= 1;
                if(i1 > 0)
                    hp(l, i1 - 1, 4);
            } else
            if(j1 == 1) {
                qhb[l][i1] |= 2;
                if(l > 0)
                    hp(l - 1, i1, 8);
            } else
            if(j1 == 2)
                qhb[l][i1] |= 0x10;
            else
            if(j1 == 3)
                qhb[l][i1] |= 0x20;
            oo(l, i1, 1, 1);
        }
    }

    public void go(int l, int i1, int j1, int k1) {
        if(l < 0 || i1 < 0 || l >= lhb - 1 || i1 >= mhb - 1)
            return;
        if(t.rlb[k1] == 1) {
            if(j1 == 0) {
                qhb[l][i1] &= 0xfffe;
                if(i1 > 0)
                    ap(l, i1 - 1, 4);
            } else
            if(j1 == 1) {
                qhb[l][i1] &= 0xfffd;
                if(l > 0)
                    ap(l - 1, i1, 8);
            } else
            if(j1 == 2)
                qhb[l][i1] &= 0xffef;
            else
            if(j1 == 3)
                qhb[l][i1] &= 0xffdf;
            oo(l, i1, 1, 1);
        }
    }

    public void wo(int l, int i1, int j1) {
        if(l < 0 || i1 < 0 || l >= lhb - 1 || i1 >= mhb - 1)
            return;
        if(t.glb[j1] == 1 || t.glb[j1] == 2) {
            int k1 = jo(l, i1);
            int l1;
            int i2;
            if(k1 == 0 || k1 == 4) {
                l1 = t.elb[j1];
                i2 = t.flb[j1];
            } else {
                i2 = t.elb[j1];
                l1 = t.flb[j1];
            }
            for(int j2 = l; j2 < l + l1; j2++) {
                for(int k2 = i1; k2 < i1 + i2; k2++)
                    if(t.glb[j1] == 1)
                        qhb[j2][k2] |= 0x40;
                    else
                    if(k1 == 0) {
                        qhb[j2][k2] |= 2;
                        if(j2 > 0)
                            hp(j2 - 1, k2, 8);
                    } else
                    if(k1 == 2) {
                        qhb[j2][k2] |= 4;
                        if(k2 < mhb - 1)
                            hp(j2, k2 + 1, 1);
                    } else
                    if(k1 == 4) {
                        qhb[j2][k2] |= 8;
                        if(j2 < lhb - 1)
                            hp(j2 + 1, k2, 2);
                    } else
                    if(k1 == 6) {
                        qhb[j2][k2] |= 1;
                        if(k2 > 0)
                            hp(j2, k2 - 1, 4);
                    }

            }

            oo(l, i1, l1, i2);
        }
    }

    public void gp(int l, int i1, int j1) {
        if(l < 0 || i1 < 0 || l >= lhb - 1 || i1 >= mhb - 1)
            return;
        if(t.glb[j1] == 1 || t.glb[j1] == 2) {
            int k1 = jo(l, i1);
            int l1;
            int i2;
            if(k1 == 0 || k1 == 4) {
                l1 = t.elb[j1];
                i2 = t.flb[j1];
            } else {
                i2 = t.elb[j1];
                l1 = t.flb[j1];
            }
            for(int j2 = l; j2 < l + l1; j2++) {
                for(int k2 = i1; k2 < i1 + i2; k2++)
                    if(t.glb[j1] == 1)
                        qhb[j2][k2] &= 0xffbf;
                    else
                    if(k1 == 0) {
                        qhb[j2][k2] &= 0xfffd;
                        if(j2 > 0)
                            ap(j2 - 1, k2, 8);
                    } else
                    if(k1 == 2) {
                        qhb[j2][k2] &= 0xfffb;
                        if(k2 < mhb - 1)
                            ap(j2, k2 + 1, 1);
                    } else
                    if(k1 == 4) {
                        qhb[j2][k2] &= 0xfff7;
                        if(j2 < lhb - 1)
                            ap(j2 + 1, k2, 2);
                    } else
                    if(k1 == 6) {
                        qhb[j2][k2] &= 0xfffe;
                        if(k2 > 0)
                            ap(j2, k2 - 1, 4);
                    }

            }

            oo(l, i1, l1, i2);
        }
    }

    public void oo(int l, int i1, int j1, int k1) {
        if(l < 1 || i1 < 1 || l + j1 >= lhb || i1 + k1 >= mhb)
            return;
        for(int l1 = l; l1 <= l + j1; l1++) {
            for(int i2 = i1; i2 <= i1 + k1; i2++)
                if((mp(l1, i2) & 0x63) != 0 || (mp(l1 - 1, i2) & 0x59) != 0 || (mp(l1, i2 - 1) & 0x56) != 0 || (mp(l1 - 1, i2 - 1) & 0x6c) != 0)
                    uo(l1, i2, 35);
                else
                    uo(l1, i2, 0);

        }

    }

    public void uo(int l, int i1, int j1) {
        int k1 = l / 12;
        int l1 = i1 / 12;
        int i2 = (l - 1) / 12;
        int j2 = (i1 - 1) / 12;
        jp(k1, l1, l, i1, j1);
        if(k1 != i2)
            jp(i2, l1, l, i1, j1);
        if(l1 != j2)
            jp(k1, j2, l, i1, j1);
        if(k1 != i2 && l1 != j2)
            jp(i2, j2, l, i1, j1);
    }

    public void jp(int l, int i1, int j1, int k1, int l1) {
        i i2 = thb[l + i1 * 8];
        for(int j2 = 0; j2 < i2.qg; j2++)
            if(i2.li[j2] == j1 * 128 && i2.ni[j2] == k1 * 128) {
                i2.de(j2, l1);
                return;
            }

    }

    public int mp(int l, int i1) {
        if(l < 0 || i1 < 0 || l >= lhb || i1 >= mhb)
            return 0;
        else
            return qhb[l][i1];
    }

    public int po(int l, int i1) {
        int j1 = l >> 7;
        int k1 = i1 >> 7;
        int l1 = l & 0x7f;
        int i2 = i1 & 0x7f;
        if(j1 < 0 || k1 < 0 || j1 >= lhb - 1 || k1 >= mhb - 1)
            return 0;
        int j2;
        int k2;
        int l2;
        if(l1 <= 128 - i2) {
            j2 = vo(j1, k1);
            k2 = vo(j1 + 1, k1) - j2;
            l2 = vo(j1, k1 + 1) - j2;
        } else {
            j2 = vo(j1 + 1, k1 + 1);
            k2 = vo(j1, k1 + 1) - j2;
            l2 = vo(j1 + 1, k1) - j2;
            l1 = 128 - l1;
            i2 = 128 - i2;
        }
        int i3 = j2 + (k2 * l1) / 128 + (l2 * i2) / 128;
        return i3;
    }

    public int vo(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return (dhb[byte0][l * 48 + i1] & 0xff) * 3;
    }

    public int ho(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return ehb[byte0][l * 48 + i1] & 0xff;
    }

    public int xo(int l, int i1, int j1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return ihb[byte0][l * 48 + i1] & 0xff;
    }

    public void to(int l, int i1, int j1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        ihb[byte0][l * 48 + i1] = (byte)j1;
    }

    public int dp(int l, int i1, int j1) {
        int k1 = xo(l, i1, j1);
        if(k1 == 0)
            return -1;
        int l1 = t.cmb[k1 - 1];
        return l1 != 2 ? 0 : 1;
    }

    public int no(int l, int i1, int j1, int k1) {
        int l1 = xo(l, i1, j1);
        if(l1 == 0)
            return k1;
        else
            return t.bmb[l1 - 1];
    }

    public int mo(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return khb[byte0][l * 48 + i1];
    }

    public int cp(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return hhb[byte0][l * 48 + i1];
    }

    public int jo(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return jhb[byte0][l * 48 + i1];
    }

    public boolean fp(int l, int i1) {
        return cp(l, i1) > 0 || cp(l - 1, i1) > 0 || cp(l - 1, i1 - 1) > 0 || cp(l, i1 - 1) > 0;
    }

    public boolean ep(int l, int i1) {
        return cp(l, i1) > 0 && cp(l - 1, i1) > 0 && cp(l - 1, i1 - 1) > 0 && cp(l, i1 - 1) > 0;
    }

    public int qo(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return ghb[byte0][l * 48 + i1] & 0xff;
    }

    public int zo(int l, int i1) {
        if(l < 0 || l >= 96 || i1 < 0 || i1 >= 96)
            return 0;
        byte byte0 = 0;
        if(l >= 48 && i1 < 48) {
            byte0 = 1;
            l -= 48;
        } else
        if(l < 48 && i1 >= 48) {
            byte0 = 2;
            i1 -= 48;
        } else
        if(l >= 48 && i1 >= 48) {
            byte0 = 3;
            l -= 48;
            i1 -= 48;
        }
        return fhb[byte0][l * 48 + i1] & 0xff;
    }

    public void fo(int l, int i1, int j1, int k1) {
        String s = "m" + j1 + l / 10 + l % 10 + i1 / 10 + i1 % 10;
        int l1;
        try {
            byte abyte0[];
            if(qgb) {
                abyte0 = p.ln(s + ".jm", 0, chb);
                if(abyte0 == null || abyte0.length == 0)
                    throw new IOException("Map not defined");
            } else {
                abyte0 = new byte[20736];
                p.in("../gamedata/maps/" + s + ".jm", abyte0, 20736);
            }
            int i2 = 0;
            int j2 = 0;
            for(int k2 = 0; k2 < 2304; k2++) {
                i2 = i2 + abyte0[j2++] & 0xff;
                dhb[k1][k2] = (byte)i2;
            }

            i2 = 0;
            for(int l2 = 0; l2 < 2304; l2++) {
                i2 = i2 + abyte0[j2++] & 0xff;
                ehb[k1][l2] = (byte)i2;
            }

            for(int i3 = 0; i3 < 2304; i3++)
                fhb[k1][i3] = abyte0[j2++];

            for(int j3 = 0; j3 < 2304; j3++)
                ghb[k1][j3] = abyte0[j2++];

            for(int k3 = 0; k3 < 2304; k3++) {
                khb[k1][k3] = (abyte0[j2] & 0xff) * 256 + (abyte0[j2 + 1] & 0xff);
                j2 += 2;
            }

            for(int l3 = 0; l3 < 2304; l3++)
                hhb[k1][l3] = abyte0[j2++];

            for(int i4 = 0; i4 < 2304; i4++)
                ihb[k1][i4] = abyte0[j2++];

            for(int j4 = 0; j4 < 2304; j4++)
                jhb[k1][j4] = abyte0[j2++];

            return;
        }
        catch(IOException _ex) {
            l1 = 0;
        }
        for(; l1 < 2304; l1++) {
            dhb[k1][l1] = 0;
            ehb[k1][l1] = 0;
            fhb[k1][l1] = 0;
            ghb[k1][l1] = 0;
            khb[k1][l1] = 0;
            hhb[k1][l1] = 0;
            ihb[k1][l1] = 0;
            if(j1 == 0)
                ihb[k1][l1] = -6;
            if(j1 == 3)
                ihb[k1][l1] = 8;
            jhb[k1][l1] = 0;
        }

    }

    public void lp() {
        tgb.yi();
        for(int l = 0; l < 64; l++) {
            thb[l] = null;
            for(int i1 = 0; i1 < 4; i1++)
                uhb[i1][l] = null;

            for(int j1 = 0; j1 < 4; j1++)
                vhb[j1][l] = null;

        }

        System.gc();
    }

    public void yo(int l, int i1, int j1) {
        lp();
        int k1 = (l + 24) / 48;
        int l1 = (i1 + 24) / 48;
        lo(l, i1, j1, true);
        if(j1 == 0) {
            lo(l, i1, 1, false);
            lo(l, i1, 2, false);
            fo(k1 - 1, l1 - 1, j1, 0);
            fo(k1, l1 - 1, j1, 1);
            fo(k1 - 1, l1, j1, 2);
            fo(k1, l1, j1, 3);
            so();
        }
    }

    public void so() {
        for(int l = 0; l < 96; l++) {
            for(int i1 = 0; i1 < 96; i1++)
                if(xo(l, i1, 0) == 250)
                    if(l == 47 && xo(l + 1, i1, 0) != 250 && xo(l + 1, i1, 0) != 2)
                        to(l, i1, 9);
                    else
                    if(i1 == 47 && xo(l, i1 + 1, 0) != 250 && xo(l, i1 + 1, 0) != 2)
                        to(l, i1, 9);
                    else
                        to(l, i1, 2);

        }

    }

    public void ko(int l, int i1, int j1, int k1, int l1) {
        int i2 = l * 3;
        int j2 = i1 * 3;
        int k2 = tgb.zi(k1);
        int l2 = tgb.zi(l1);
        k2 = k2 >> 1 & 0x7f7f7f;
        l2 = l2 >> 1 & 0x7f7f7f;
        if(j1 == 0) {
            sgb.wg(i2, j2, 3, k2);
            sgb.wg(i2, j2 + 1, 2, k2);
            sgb.wg(i2, j2 + 2, 1, k2);
            sgb.wg(i2 + 2, j2 + 1, 1, l2);
            sgb.wg(i2 + 1, j2 + 2, 2, l2);
            return;
        }
        if(j1 == 1) {
            sgb.wg(i2, j2, 3, l2);
            sgb.wg(i2 + 1, j2 + 1, 2, l2);
            sgb.wg(i2 + 2, j2 + 2, 1, l2);
            sgb.wg(i2, j2 + 1, 1, k2);
            sgb.wg(i2, j2 + 2, 2, k2);
        }
    }

    public void lo(int l, int i1, int j1, boolean flag) {
        int k1 = (l + 24) / 48;
        int l1 = (i1 + 24) / 48;
        fo(k1 - 1, l1 - 1, j1, 0);
        fo(k1, l1 - 1, j1, 1);
        fo(k1 - 1, l1, j1, 2);
        fo(k1, l1, j1, 3);
        so();
        if(whb == null)
            whb = new i(lhb * mhb * 2 + 256, lhb * mhb * 2 + 256, true, true, false, false, true);
        if(flag) {
            sgb.rf();
            for(int i2 = 0; i2 < 96; i2++) {
                for(int k2 = 0; k2 < 96; k2++)
                    qhb[i2][k2] = 0;

            }

            i l2 = whb;
            l2.df();
            for(int j3 = 0; j3 < 96; j3++) {
                for(int i4 = 0; i4 < 96; i4++) {
                    int i5 = -vo(j3, i4);
                    if(xo(j3, i4, j1) > 0 && t.cmb[xo(j3, i4, j1) - 1] == 4)
                        i5 = 0;
                    if(xo(j3 - 1, i4, j1) > 0 && t.cmb[xo(j3 - 1, i4, j1) - 1] == 4)
                        i5 = 0;
                    if(xo(j3, i4 - 1, j1) > 0 && t.cmb[xo(j3, i4 - 1, j1) - 1] == 4)
                        i5 = 0;
                    if(xo(j3 - 1, i4 - 1, j1) > 0 && t.cmb[xo(j3 - 1, i4 - 1, j1) - 1] == 4)
                        i5 = 0;
                    int j6 = l2.ue(j3 * 128, i5, i4 * 128);
                    int j8 = (int)(Math.random() * 10D) - 5;
                    l2.de(j6, j8);
                }

            }

            for(int j4 = 0; j4 < 95; j4++) {
                for(int j5 = 0; j5 < 95; j5++) {
                    int k6 = ho(j4, j5);
                    int k8 = xgb[k6];
                    int i11 = k8;
                    int k13 = k8;
                    int l15 = 0;
                    if(j1 == 1 || j1 == 2) {
                        k8 = 0xbc614e;
                        i11 = 0xbc614e;
                        k13 = 0xbc614e;
                    }
                    if(xo(j4, j5, j1) > 0) {
                        int l17 = xo(j4, j5, j1);
                        int l6 = t.cmb[l17 - 1];
                        int i20 = dp(j4, j5, j1);
                        k8 = i11 = t.bmb[l17 - 1];
                        if(l6 == 4) {
                            k8 = 1;
                            i11 = 1;
                        }
                        if(l6 == 5) {
                            if(mo(j4, j5) > 0 && mo(j4, j5) < 24000)
                                if(no(j4 - 1, j5, j1, k13) != 0xbc614e && no(j4, j5 - 1, j1, k13) != 0xbc614e) {
                                    k8 = no(j4 - 1, j5, j1, k13);
                                    l15 = 0;
                                } else
                                if(no(j4 + 1, j5, j1, k13) != 0xbc614e && no(j4, j5 + 1, j1, k13) != 0xbc614e) {
                                    i11 = no(j4 + 1, j5, j1, k13);
                                    l15 = 0;
                                } else
                                if(no(j4 + 1, j5, j1, k13) != 0xbc614e && no(j4, j5 - 1, j1, k13) != 0xbc614e) {
                                    i11 = no(j4 + 1, j5, j1, k13);
                                    l15 = 1;
                                } else
                                if(no(j4 - 1, j5, j1, k13) != 0xbc614e && no(j4, j5 + 1, j1, k13) != 0xbc614e) {
                                    k8 = no(j4 - 1, j5, j1, k13);
                                    l15 = 1;
                                }
                        } else
                        if(l6 != 2 || mo(j4, j5) > 0 && mo(j4, j5) < 24000)
                            if(dp(j4 - 1, j5, j1) != i20 && dp(j4, j5 - 1, j1) != i20) {
                                k8 = k13;
                                l15 = 0;
                            } else
                            if(dp(j4 + 1, j5, j1) != i20 && dp(j4, j5 + 1, j1) != i20) {
                                i11 = k13;
                                l15 = 0;
                            } else
                            if(dp(j4 + 1, j5, j1) != i20 && dp(j4, j5 - 1, j1) != i20) {
                                i11 = k13;
                                l15 = 1;
                            } else
                            if(dp(j4 - 1, j5, j1) != i20 && dp(j4, j5 + 1, j1) != i20) {
                                k8 = k13;
                                l15 = 1;
                            }
                        if(t.dmb[l17 - 1] != 0)
                            qhb[j4][j5] |= 0x40;
                        if(t.cmb[l17 - 1] == 2)
                            qhb[j4][j5] |= 0x80;
                    }
                    ko(j4, j5, l15, k8, i11);
                    int i18 = ((vo(j4 + 1, j5 + 1) - vo(j4 + 1, j5)) + vo(j4, j5 + 1)) - vo(j4, j5);
                    if(k8 != i11 || i18 != 0) {
                        int ai[] = new int[3];
                        int ai7[] = new int[3];
                        if(l15 == 0) {
                            if(k8 != 0xbc614e) {
                                ai[0] = j5 + j4 * lhb + lhb;
                                ai[1] = j5 + j4 * lhb;
                                ai[2] = j5 + j4 * lhb + 1;
                                int l22 = l2.te(3, ai, 0xbc614e, k8);
                                nhb[l22] = j4;
                                ohb[l22] = j5;
                                l2.xh[l22] = 0x30d40 + l22;
                            }
                            if(i11 != 0xbc614e) {
                                ai7[0] = j5 + j4 * lhb + 1;
                                ai7[1] = j5 + j4 * lhb + lhb + 1;
                                ai7[2] = j5 + j4 * lhb + lhb;
                                int i23 = l2.te(3, ai7, 0xbc614e, i11);
                                nhb[i23] = j4;
                                ohb[i23] = j5;
                                l2.xh[i23] = 0x30d40 + i23;
                            }
                        } else {
                            if(k8 != 0xbc614e) {
                                ai[0] = j5 + j4 * lhb + 1;
                                ai[1] = j5 + j4 * lhb + lhb + 1;
                                ai[2] = j5 + j4 * lhb;
                                int j23 = l2.te(3, ai, 0xbc614e, k8);
                                nhb[j23] = j4;
                                ohb[j23] = j5;
                                l2.xh[j23] = 0x30d40 + j23;
                            }
                            if(i11 != 0xbc614e) {
                                ai7[0] = j5 + j4 * lhb + lhb;
                                ai7[1] = j5 + j4 * lhb;
                                ai7[2] = j5 + j4 * lhb + lhb + 1;
                                int k23 = l2.te(3, ai7, 0xbc614e, i11);
                                nhb[k23] = j4;
                                ohb[k23] = j5;
                                l2.xh[k23] = 0x30d40 + k23;
                            }
                        }
                    } else
                    if(k8 != 0xbc614e) {
                        int ai1[] = new int[4];
                        ai1[0] = j5 + j4 * lhb + lhb;
                        ai1[1] = j5 + j4 * lhb;
                        ai1[2] = j5 + j4 * lhb + 1;
                        ai1[3] = j5 + j4 * lhb + lhb + 1;
                        int l20 = l2.te(4, ai1, 0xbc614e, k8);
                        nhb[l20] = j4;
                        ohb[l20] = j5;
                        l2.xh[l20] = 0x30d40 + l20;
                    }
                }

            }

            for(int k5 = 1; k5 < 95; k5++) {
                for(int i7 = 1; i7 < 95; i7++)
                    if(xo(k5, i7, j1) > 0 && t.cmb[xo(k5, i7, j1) - 1] == 4) {
                        int l8 = t.bmb[xo(k5, i7, j1) - 1];
                        int j11 = l2.ue(k5 * 128, -vo(k5, i7), i7 * 128);
                        int l13 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7), i7 * 128);
                        int i16 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7 + 1), (i7 + 1) * 128);
                        int j18 = l2.ue(k5 * 128, -vo(k5, i7 + 1), (i7 + 1) * 128);
                        int ai2[] = {
                            j11, l13, i16, j18
                        };
                        int i21 = l2.te(4, ai2, l8, 0xbc614e);
                        nhb[i21] = k5;
                        ohb[i21] = i7;
                        l2.xh[i21] = 0x30d40 + i21;
                        ko(k5, i7, 0, l8, l8);
                    } else
                    if(xo(k5, i7, j1) == 0 || t.cmb[xo(k5, i7, j1) - 1] != 3) {
                        if(xo(k5, i7 + 1, j1) > 0 && t.cmb[xo(k5, i7 + 1, j1) - 1] == 4) {
                            int i9 = t.bmb[xo(k5, i7 + 1, j1) - 1];
                            int k11 = l2.ue(k5 * 128, -vo(k5, i7), i7 * 128);
                            int i14 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7), i7 * 128);
                            int j16 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7 + 1), (i7 + 1) * 128);
                            int k18 = l2.ue(k5 * 128, -vo(k5, i7 + 1), (i7 + 1) * 128);
                            int ai3[] = {
                                k11, i14, j16, k18
                            };
                            int j21 = l2.te(4, ai3, i9, 0xbc614e);
                            nhb[j21] = k5;
                            ohb[j21] = i7;
                            l2.xh[j21] = 0x30d40 + j21;
                            ko(k5, i7, 0, i9, i9);
                        }
                        if(xo(k5, i7 - 1, j1) > 0 && t.cmb[xo(k5, i7 - 1, j1) - 1] == 4) {
                            int j9 = t.bmb[xo(k5, i7 - 1, j1) - 1];
                            int l11 = l2.ue(k5 * 128, -vo(k5, i7), i7 * 128);
                            int j14 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7), i7 * 128);
                            int k16 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7 + 1), (i7 + 1) * 128);
                            int l18 = l2.ue(k5 * 128, -vo(k5, i7 + 1), (i7 + 1) * 128);
                            int ai4[] = {
                                l11, j14, k16, l18
                            };
                            int k21 = l2.te(4, ai4, j9, 0xbc614e);
                            nhb[k21] = k5;
                            ohb[k21] = i7;
                            l2.xh[k21] = 0x30d40 + k21;
                            ko(k5, i7, 0, j9, j9);
                        }
                        if(xo(k5 + 1, i7, j1) > 0 && t.cmb[xo(k5 + 1, i7, j1) - 1] == 4) {
                            int k9 = t.bmb[xo(k5 + 1, i7, j1) - 1];
                            int i12 = l2.ue(k5 * 128, -vo(k5, i7), i7 * 128);
                            int k14 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7), i7 * 128);
                            int l16 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7 + 1), (i7 + 1) * 128);
                            int i19 = l2.ue(k5 * 128, -vo(k5, i7 + 1), (i7 + 1) * 128);
                            int ai5[] = {
                                i12, k14, l16, i19
                            };
                            int l21 = l2.te(4, ai5, k9, 0xbc614e);
                            nhb[l21] = k5;
                            ohb[l21] = i7;
                            l2.xh[l21] = 0x30d40 + l21;
                            ko(k5, i7, 0, k9, k9);
                        }
                        if(xo(k5 - 1, i7, j1) > 0 && t.cmb[xo(k5 - 1, i7, j1) - 1] == 4) {
                            int l9 = t.bmb[xo(k5 - 1, i7, j1) - 1];
                            int j12 = l2.ue(k5 * 128, -vo(k5, i7), i7 * 128);
                            int l14 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7), i7 * 128);
                            int i17 = l2.ue((k5 + 1) * 128, -vo(k5 + 1, i7 + 1), (i7 + 1) * 128);
                            int j19 = l2.ue(k5 * 128, -vo(k5, i7 + 1), (i7 + 1) * 128);
                            int ai6[] = {
                                j12, l14, i17, j19
                            };
                            int i22 = l2.te(4, ai6, l9, 0xbc614e);
                            nhb[i22] = k5;
                            ohb[i22] = i7;
                            l2.xh[i22] = 0x30d40 + i22;
                            ko(k5, i7, 0, l9, l9);
                        }
                    }

            }

            l2.ye(true, 40, 48, -50, -10, -50);
            thb = whb.ae(0, 0, 1536, 1536, 8, 64, 233, false);
            for(int j7 = 0; j7 < 64; j7++)
                tgb.ai(thb[j7]);

            for(int i10 = 0; i10 < 96; i10++) {
                for(int k12 = 0; k12 < 96; k12++)
                    rhb[i10][k12] = vo(i10, k12);

            }

        }
        whb.df();
        int j2 = 0x606060;
        for(int i3 = 0; i3 < 95; i3++) {
            for(int k3 = 0; k3 < 95; k3++) {
                int k4 = qo(i3, k3);
                if(k4 > 0 && (t.tlb[k4 - 1] == 0 || rgb)) {
                    kp(whb, k4 - 1, i3, k3, i3 + 1, k3);
                    if(flag && t.rlb[k4 - 1] != 0) {
                        qhb[i3][k3] |= 1;
                        if(k3 > 0)
                            hp(i3, k3 - 1, 4);
                    }
                    if(flag)
                        sgb.wg(i3 * 3, k3 * 3, 3, j2);
                }
                k4 = zo(i3, k3);
                if(k4 > 0 && (t.tlb[k4 - 1] == 0 || rgb)) {
                    kp(whb, k4 - 1, i3, k3, i3, k3 + 1);
                    if(flag && t.rlb[k4 - 1] != 0) {
                        qhb[i3][k3] |= 2;
                        if(i3 > 0)
                            hp(i3 - 1, k3, 8);
                    }
                    if(flag)
                        sgb.bh(i3 * 3, k3 * 3, 3, j2);
                }
                k4 = mo(i3, k3);
                if(k4 > 0 && k4 < 12000 && (t.tlb[k4 - 1] == 0 || rgb)) {
                    kp(whb, k4 - 1, i3, k3, i3 + 1, k3 + 1);
                    if(flag && t.rlb[k4 - 1] != 0)
                        qhb[i3][k3] |= 0x20;
                    if(flag) {
                        sgb.qg(i3 * 3, k3 * 3, j2);
                        sgb.qg(i3 * 3 + 1, k3 * 3 + 1, j2);
                        sgb.qg(i3 * 3 + 2, k3 * 3 + 2, j2);
                    }
                }
                if(k4 > 12000 && k4 < 24000 && (t.tlb[k4 - 12001] == 0 || rgb)) {
                    kp(whb, k4 - 12001, i3 + 1, k3, i3, k3 + 1);
                    if(flag && t.rlb[k4 - 12001] != 0)
                        qhb[i3][k3] |= 0x10;
                    if(flag) {
                        sgb.qg(i3 * 3 + 2, k3 * 3, j2);
                        sgb.qg(i3 * 3 + 1, k3 * 3 + 1, j2);
                        sgb.qg(i3 * 3, k3 * 3 + 2, j2);
                    }
                }
            }

        }

        if(flag)
            sgb.qf(ugb - 1, 0, 0, 285, 285);
        whb.ye(false, 60, 24, -50, -10, -50);
        uhb[j1] = whb.ae(0, 0, 1536, 1536, 8, 64, 338, true);
        for(int l3 = 0; l3 < 64; l3++)
            tgb.ai(uhb[j1][l3]);

        for(int l4 = 0; l4 < 95; l4++) {
            for(int l5 = 0; l5 < 95; l5++) {
                int k7 = qo(l4, l5);
                if(k7 > 0)
                    bp(k7 - 1, l4, l5, l4 + 1, l5);
                k7 = zo(l4, l5);
                if(k7 > 0)
                    bp(k7 - 1, l4, l5, l4, l5 + 1);
                k7 = mo(l4, l5);
                if(k7 > 0 && k7 < 12000)
                    bp(k7 - 1, l4, l5, l4 + 1, l5 + 1);
                if(k7 > 12000 && k7 < 24000)
                    bp(k7 - 12001, l4 + 1, l5, l4, l5 + 1);
            }

        }

        for(int i6 = 1; i6 < 95; i6++) {
            for(int l7 = 1; l7 < 95; l7++) {
                int j10 = cp(i6, l7);
                if(j10 > 0) {
                    int l12 = i6;
                    int i15 = l7;
                    int j17 = i6 + 1;
                    int k19 = l7;
                    int j20 = i6 + 1;
                    int j22 = l7 + 1;
                    int l23 = i6;
                    int j24 = l7 + 1;
                    int l24 = 0;
                    int j25 = rhb[l12][i15];
                    int l25 = rhb[j17][k19];
                    int j26 = rhb[j20][j22];
                    int l26 = rhb[l23][j24];
                    if(j25 > 0x13880)
                        j25 -= 0x13880;
                    if(l25 > 0x13880)
                        l25 -= 0x13880;
                    if(j26 > 0x13880)
                        j26 -= 0x13880;
                    if(l26 > 0x13880)
                        l26 -= 0x13880;
                    if(j25 > l24)
                        l24 = j25;
                    if(l25 > l24)
                        l24 = l25;
                    if(j26 > l24)
                        l24 = j26;
                    if(l26 > l24)
                        l24 = l26;
                    if(l24 >= 0x13880)
                        l24 -= 0x13880;
                    if(j25 < 0x13880)
                        rhb[l12][i15] = l24;
                    else
                        rhb[l12][i15] -= 0x13880;
                    if(l25 < 0x13880)
                        rhb[j17][k19] = l24;
                    else
                        rhb[j17][k19] -= 0x13880;
                    if(j26 < 0x13880)
                        rhb[j20][j22] = l24;
                    else
                        rhb[j20][j22] -= 0x13880;
                    if(l26 < 0x13880)
                        rhb[l23][j24] = l24;
                    else
                        rhb[l23][j24] -= 0x13880;
                }
            }

        }

        whb.df();
        for(int i8 = 1; i8 < 95; i8++) {
            for(int k10 = 1; k10 < 95; k10++) {
                int i13 = cp(i8, k10);
                if(i13 > 0) {
                    int j15 = i8;
                    int k17 = k10;
                    int l19 = i8 + 1;
                    int k20 = k10;
                    int k22 = i8 + 1;
                    int i24 = k10 + 1;
                    int k24 = i8;
                    int i25 = k10 + 1;
                    int k25 = i8 * 128;
                    int i26 = k10 * 128;
                    int k26 = k25 + 128;
                    int i27 = i26 + 128;
                    int j27 = k25;
                    int k27 = i26;
                    int l27 = k26;
                    int i28 = i27;
                    int j28 = rhb[j15][k17];
                    int k28 = rhb[l19][k20];
                    int l28 = rhb[k22][i24];
                    int i29 = rhb[k24][i25];
                    int j29 = t.wlb[i13 - 1];
                    if(ep(j15, k17) && j28 < 0x13880) {
                        j28 += j29 + 0x13880;
                        rhb[j15][k17] = j28;
                    }
                    if(ep(l19, k20) && k28 < 0x13880) {
                        k28 += j29 + 0x13880;
                        rhb[l19][k20] = k28;
                    }
                    if(ep(k22, i24) && l28 < 0x13880) {
                        l28 += j29 + 0x13880;
                        rhb[k22][i24] = l28;
                    }
                    if(ep(k24, i25) && i29 < 0x13880) {
                        i29 += j29 + 0x13880;
                        rhb[k24][i25] = i29;
                    }
                    if(j28 >= 0x13880)
                        j28 -= 0x13880;
                    if(k28 >= 0x13880)
                        k28 -= 0x13880;
                    if(l28 >= 0x13880)
                        l28 -= 0x13880;
                    if(i29 >= 0x13880)
                        i29 -= 0x13880;
                    byte byte0 = 16;
                    if(!fp(j15 - 1, k17))
                        k25 -= byte0;
                    if(!fp(j15 + 1, k17))
                        k25 += byte0;
                    if(!fp(j15, k17 - 1))
                        i26 -= byte0;
                    if(!fp(j15, k17 + 1))
                        i26 += byte0;
                    if(!fp(l19 - 1, k20))
                        k26 -= byte0;
                    if(!fp(l19 + 1, k20))
                        k26 += byte0;
                    if(!fp(l19, k20 - 1))
                        k27 -= byte0;
                    if(!fp(l19, k20 + 1))
                        k27 += byte0;
                    if(!fp(k22 - 1, i24))
                        l27 -= byte0;
                    if(!fp(k22 + 1, i24))
                        l27 += byte0;
                    if(!fp(k22, i24 - 1))
                        i27 -= byte0;
                    if(!fp(k22, i24 + 1))
                        i27 += byte0;
                    if(!fp(k24 - 1, i25))
                        j27 -= byte0;
                    if(!fp(k24 + 1, i25))
                        j27 += byte0;
                    if(!fp(k24, i25 - 1))
                        i28 -= byte0;
                    if(!fp(k24, i25 + 1))
                        i28 += byte0;
                    i13 = t.ylb[i13 - 1];
                    j28 = -j28;
                    k28 = -k28;
                    l28 = -l28;
                    i29 = -i29;
                    if(mo(i8, k10) > 12000 && mo(i8, k10) < 24000 && cp(i8 - 1, k10 - 1) == 0) {
                        int ai8[] = new int[3];
                        ai8[0] = whb.ue(l27, l28, i27);
                        ai8[1] = whb.ue(j27, i29, i28);
                        ai8[2] = whb.ue(k26, k28, k27);
                        whb.te(3, ai8, i13, 0xbc614e);
                    } else
                    if(mo(i8, k10) > 12000 && mo(i8, k10) < 24000 && cp(i8 + 1, k10 + 1) == 0) {
                        int ai9[] = new int[3];
                        ai9[0] = whb.ue(k25, j28, i26);
                        ai9[1] = whb.ue(k26, k28, k27);
                        ai9[2] = whb.ue(j27, i29, i28);
                        whb.te(3, ai9, i13, 0xbc614e);
                    } else
                    if(mo(i8, k10) > 0 && mo(i8, k10) < 12000 && cp(i8 + 1, k10 - 1) == 0) {
                        int ai10[] = new int[3];
                        ai10[0] = whb.ue(j27, i29, i28);
                        ai10[1] = whb.ue(k25, j28, i26);
                        ai10[2] = whb.ue(l27, l28, i27);
                        whb.te(3, ai10, i13, 0xbc614e);
                    } else
                    if(mo(i8, k10) > 0 && mo(i8, k10) < 12000 && cp(i8 - 1, k10 + 1) == 0) {
                        int ai11[] = new int[3];
                        ai11[0] = whb.ue(k26, k28, k27);
                        ai11[1] = whb.ue(l27, l28, i27);
                        ai11[2] = whb.ue(k25, j28, i26);
                        whb.te(3, ai11, i13, 0xbc614e);
                    } else
                    if(j28 == k28 && l28 == i29) {
                        int ai12[] = new int[4];
                        ai12[0] = whb.ue(k25, j28, i26);
                        ai12[1] = whb.ue(k26, k28, k27);
                        ai12[2] = whb.ue(l27, l28, i27);
                        ai12[3] = whb.ue(j27, i29, i28);
                        whb.te(4, ai12, i13, 0xbc614e);
                    } else
                    if(j28 == i29 && k28 == l28) {
                        int ai13[] = new int[4];
                        ai13[0] = whb.ue(j27, i29, i28);
                        ai13[1] = whb.ue(k25, j28, i26);
                        ai13[2] = whb.ue(k26, k28, k27);
                        ai13[3] = whb.ue(l27, l28, i27);
                        whb.te(4, ai13, i13, 0xbc614e);
                    } else {
                        boolean flag1 = true;
                        if(cp(i8 - 1, k10 - 1) > 0)
                            flag1 = false;
                        if(cp(i8 + 1, k10 + 1) > 0)
                            flag1 = false;
                        if(!flag1) {
                            int ai14[] = new int[3];
                            ai14[0] = whb.ue(k26, k28, k27);
                            ai14[1] = whb.ue(l27, l28, i27);
                            ai14[2] = whb.ue(k25, j28, i26);
                            whb.te(3, ai14, i13, 0xbc614e);
                            int ai16[] = new int[3];
                            ai16[0] = whb.ue(j27, i29, i28);
                            ai16[1] = whb.ue(k25, j28, i26);
                            ai16[2] = whb.ue(l27, l28, i27);
                            whb.te(3, ai16, i13, 0xbc614e);
                        } else {
                            int ai15[] = new int[3];
                            ai15[0] = whb.ue(k25, j28, i26);
                            ai15[1] = whb.ue(k26, k28, k27);
                            ai15[2] = whb.ue(j27, i29, i28);
                            whb.te(3, ai15, i13, 0xbc614e);
                            int ai17[] = new int[3];
                            ai17[0] = whb.ue(l27, l28, i27);
                            ai17[1] = whb.ue(j27, i29, i28);
                            ai17[2] = whb.ue(k26, k28, k27);
                            whb.te(3, ai17, i13, 0xbc614e);
                        }
                    }
                }
            }

        }

        whb.ye(true, 50, 50, -50, -10, -50);
        vhb[j1] = whb.ae(0, 0, 1536, 1536, 8, 64, 169, true);
        for(int l10 = 0; l10 < 64; l10++)
            tgb.ai(vhb[j1][l10]);

        for(int j13 = 0; j13 < 96; j13++) {
            for(int k15 = 0; k15 < 96; k15++)
                if(rhb[j13][k15] >= 0x13880)
                    rhb[j13][k15] -= 0x13880;

        }

    }

    public void ro(i ai[]) {
        for(int l = 0; l < lhb - 2; l++) {
            for(int i1 = 0; i1 < mhb - 2; i1++)
                if(mo(l, i1) > 48000 && mo(l, i1) < 60000) {
                    int j1 = mo(l, i1) - 48001;
                    int k1 = jo(l, i1);
                    int l1;
                    int i2;
                    if(k1 == 0 || k1 == 4) {
                        l1 = t.elb[j1];
                        i2 = t.flb[j1];
                    } else {
                        i2 = t.elb[j1];
                        l1 = t.flb[j1];
                    }
                    wo(l, i1, j1);
                    i j2 = ai[t.dlb[j1]].af(false, true, false, false);
                    int k2 = ((l + l + l1) * 128) / 2;
                    int i3 = ((i1 + i1 + i2) * 128) / 2;
                    j2.fe(k2, -po(k2, i3), i3);
                    j2.qe(0, jo(l, i1) * 32, 0);
                    tgb.ai(j2);
                    j2.he(48, 48, -50, -10, -50);
                    if(l1 > 1 || i2 > 1) {
                        for(int k3 = l; k3 < l + l1; k3++) {
                            for(int l3 = i1; l3 < i1 + i2; l3++)
                                if((k3 > l || l3 > i1) && mo(k3, l3) - 48001 == j1) {
                                    int l2 = k3;
                                    int j3 = l3;
                                    byte byte0 = 0;
                                    if(l2 >= 48 && j3 < 48) {
                                        byte0 = 1;
                                        l2 -= 48;
                                    } else
                                    if(l2 < 48 && j3 >= 48) {
                                        byte0 = 2;
                                        j3 -= 48;
                                    } else
                                    if(l2 >= 48 && j3 >= 48) {
                                        byte0 = 3;
                                        l2 -= 48;
                                        j3 -= 48;
                                    }
                                    khb[byte0][l2 * 48 + j3] = 0;
                                }

                        }

                    }
                }

        }

    }

    public void kp(i l, int i1, int j1, int k1, int l1, int i2) {
        uo(j1, k1, 40);
        uo(l1, i2, 40);
        int j2 = t.olb[i1];
        int k2 = t.plb[i1];
        int l2 = t.qlb[i1];
        int i3 = j1 * 128;
        int j3 = k1 * 128;
        int k3 = l1 * 128;
        int l3 = i2 * 128;
        int i4 = l.ue(i3, -rhb[j1][k1], j3);
        int j4 = l.ue(i3, -rhb[j1][k1] - j2, j3);
        int k4 = l.ue(k3, -rhb[l1][i2] - j2, l3);
        int l4 = l.ue(k3, -rhb[l1][i2], l3);
        int ai[] = {
            i4, j4, k4, l4
        };
        int i5 = l.te(4, ai, k2, l2);
        if(t.tlb[i1] == 5) {
            l.xh[i5] = 30000 + i1;
            return;
        } else {
            l.xh[i5] = 0;
            return;
        }
    }

    public void bp(int l, int i1, int j1, int k1, int l1) {
        int i2 = t.olb[l];
        if(rhb[i1][j1] < 0x13880)
            rhb[i1][j1] += 0x13880 + i2;
        if(rhb[k1][l1] < 0x13880)
            rhb[k1][l1] += 0x13880 + i2;
    }

    boolean qgb;
    boolean rgb;
    j sgb;
    k tgb;
    int ugb;
    final int vgb = 0xbc614e;
    final int wgb = 128;
    int xgb[];
    int ygb;
    int zgb[];
    int ahb[];
    int bhb[];
    byte chb[];
    byte dhb[][];
    byte ehb[][];
    byte fhb[][];
    byte ghb[][];
    byte hhb[][];
    byte ihb[][];
    byte jhb[][];
    int khb[][];
    int lhb;
    int mhb;
    int nhb[];
    int ohb[];
    int phb[][];
    int qhb[][];
    int rhb[][];
    boolean shb;
    i thb[];
    i uhb[][];
    i vhb[][];
    i whb;
}
