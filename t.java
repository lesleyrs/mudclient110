// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

import jagex.*;
import java.io.IOException;
import java.io.PrintStream;

public class t {

    public static void fq() {
        try {
            dq(new e("../gamedata/config/projectile.txt"));
            cq(new e("../gamedata/config/entity.txt"));
            up(new e("../gamedata/config/objects.txt"));
            eq(new e("../gamedata/config/npc.txt"));
            pp(new e("../gamedata/config/location.txt"));
            zp(new e("../gamedata/config/boundary.txt"));
            op(new e("../gamedata/config/roof.txt"));
            sp(new e("../gamedata/config/floor.txt"));
            tp(new e("../gamedata/config/spells.txt"));
            aq(new e("../gamedata/config/shop.txt"));
            bq(new e("../gamedata/config/prayers.txt"));
            qp(new e("../gamedata/config/words.txt"));
            yp(new e("../gamedata/config/badwords.txt"));
            gq();
            return;
        }
        catch(IOException ioexception) {
            System.out.println("Error loading config files");
            ioexception.printStackTrace();
            return;
        }
    }

    public static void xp(byte abyte0[]) {
        try {
            dq(new s(abyte0, p.nn("projectile.txt", abyte0)));
            cq(new s(abyte0, p.nn("entity.txt", abyte0)));
            up(new s(abyte0, p.nn("objects.txt", abyte0)));
            eq(new s(abyte0, p.nn("npc.txt", abyte0)));
            pp(new s(abyte0, p.nn("location.txt", abyte0)));
            zp(new s(abyte0, p.nn("boundary.txt", abyte0)));
            op(new s(abyte0, p.nn("roof.txt", abyte0)));
            sp(new s(abyte0, p.nn("floor.txt", abyte0)));
            tp(new s(abyte0, p.nn("spells.txt", abyte0)));
            aq(new s(abyte0, p.nn("shop.txt", abyte0)));
            bq(new s(abyte0, p.nn("prayers.txt", abyte0)));
            qp(new s(abyte0, p.nn("words.txt", abyte0)));
            yp(new s(abyte0, p.nn("badwords.txt", abyte0)));
            gq();
            return;
        }
        catch(IOException ioexception) {
            System.out.println("Error loading config files");
            ioexception.printStackTrace();
            return;
        }
    }

    public static void qp(g g1) throws IOException {
        do {
            try {
                String s1 = g1.ac();
                if(s1.equals("-EOF-") || (s1 == null || s1.length() <= 0))
                    break;
                mnb[lnb++] = s1;
                continue;
            }
            catch(Exception _ex) { }
            break;
        } while(true);
        System.out.println("Loaded " + lnb + " allowed words");
        p.lgb = lnb;
        p.mgb = mnb;
    }

    public static void yp(g g1) throws IOException {
        do {
            try {
                String s1 = g1.ac();
                if(s1.equals("-EOF-") || (s1 == null || s1.length() <= 0))
                    break;
                onb[nnb++] = s1;
                continue;
            }
            catch(Exception _ex) { }
            break;
        } while(true);
        System.out.println("Loaded " + nnb + " banned words");
        String as[] = {
            "a", "e", "i", "o", "u"
        };
        int i = nnb;
        for(int j = 0; j < i; j++) {
            String s2 = onb[j];
            if(s2.length() >= 5) {
                for(int k = 1; k < s2.length() - 1; k++) {
                    char c = s2.charAt(k);
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                        for(int l = 0; l < 5; l++) {
                            String s3 = as[l];
                            if(s3.charAt(0) != c) {
                                String s6 = s2.substring(0, k) + s3 + s2.substring(k + 1);
                                onb[nnb++] = s6;
                                s6 = s2.substring(0, k) + s3 + c + s2.substring(k + 1);
                                onb[nnb++] = s6;
                            }
                        }

                        String s4 = s2.substring(0, k) + s2.substring(k + 1);
                        onb[nnb++] = s4;
                    }
                    char c1 = s2.charAt(k + 1);
                    String s5 = s2.substring(0, k) + c1 + c + s2.substring(k + 2);
                    onb[nnb++] = s5;
                }

            }
        }

        System.out.println("Generated " + nnb + " banned words");
        p.jgb = nnb;
        p.kgb = onb;
    }

    public static void aq(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        wmb = i;
        System.out.println("Found " + i + " shops");
        xmb = new String[i];
        ymb = new int[i];
        cnb = new int[i];
        zmb = new int[i];
        anb = new int[i];
        bnb = new int[i];
        dnb = new int[i][40];
        enb = new int[i][40];
        fnb = new int[i][40];
        for(int j = 0; j < i; j++) {
            g1.fb();
            xmb[j] = g1.wb();
            int k = ymb[j] = g1.ob();
            zmb[j] = g1.ob();
            anb[j] = g1.ob();
            bnb[j] = g1.ob();
            cnb[j] = g1.ob();
            for(int l = 0; l < k; l++) {
                g1.fb();
                dnb[j][l] = np(g1.wb());
                enb[j][l] = g1.ob();
                fnb[j][l] = g1.ob();
            }

        }

    }

    public static void tp(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        omb = i;
        System.out.println("Found " + i + " spells");
        pmb = new String[i];
        qmb = new String[i];
        rmb = new int[i];
        tmb = new int[i];
        smb = new int[i];
        umb = new int[i][];
        vmb = new int[i][];
        for(int j = 0; j < i; j++) {
            g1.fb();
            pmb[j] = g1.wb();
            rmb[j] = g1.ob();
            qmb[j] = g1.wb();
            tmb[j] = g1.ob();
            g1.fb();
            int k = smb[j] = g1.ob();
            umb[j] = new int[k];
            vmb[j] = new int[k];
            for(int l = 0; l < k; l++) {
                umb[j][l] = np(g1.wb());
                vmb[j][l] = g1.ob();
            }

        }

        g1.yb();
    }

    public static void bq(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        gnb = i;
        System.out.println("Found " + i + " prayers");
        hnb = new String[i];
        inb = new String[i];
        jnb = new int[i];
        knb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            hnb[j] = g1.wb();
            jnb[j] = g1.ob();
            inb[j] = g1.wb();
            knb[j] = g1.ob();
        }

        g1.yb();
    }

    public static void dq(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        emb = i;
        System.out.println("Found " + i + " projectiles");
        gmb = new String[i];
        hmb = new String[i];
        imb = new int[i];
        jmb = new int[i];
        kmb = new int[i];
        lmb = new int[i];
        mmb = new int[i];
        nmb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            gmb[j] = g1.wb();
            imb[j] = g1.ob();
            jmb[j] = g1.ob();
            kmb[j] = g1.ob();
            lmb[j] = g1.ob();
            hmb[j] = g1.wb();
            nmb[j] = g1.ob();
            if(imb[j] + 1 > fmb)
                fmb = imb[j] + 1;
        }

        g1.yb();
    }

    public static void gq() {
        for(int i = 0; i < emb; i++)
            mmb[i] = np(hmb[i]);

    }

    public static void cq(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        qkb = i;
        System.out.println("Found " + i + " entities");
        rkb = new String[i];
        skb = new String[i];
        ukb = new int[i];
        tkb = new int[i];
        vkb = new int[i];
        wkb = new int[i];
        xkb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            rkb[j] = g1.wb();
            skb[j] = g1.wb();
            tkb[j] = g1.hb();
            ukb[j] = g1.ob();
            vkb[j] = g1.ob();
            wkb[j] = g1.ob();
        }

        g1.yb();
    }

    public static void eq(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        mjb = i;
        System.out.println("Found " + i + " npcs");
        njb = new String[i][];
        ojb = new String[i];
        pjb = new int[i];
        qjb = new int[i];
        rjb = new int[i];
        sjb = new int[i];
        tjb = new int[i];
        ujb = new int[i];
        vjb = new int[i];
        wjb = new int[i];
        xjb = new int[i];
        yjb = new int[i];
        zjb = new int[i];
        akb = new int[i];
        bkb = new int[i];
        ckb = new int[i];
        dkb = new int[i];
        ekb = new int[i][12];
        fkb = new int[i];
        gkb = new int[i];
        hkb = new int[i];
        ikb = new int[i];
        jkb = new int[i];
        kkb = new int[i];
        lkb = new int[i];
        mkb = new int[i];
        nkb = new int[i];
        okb = new int[i][];
        pkb = new int[i][];
        for(int j = 0; j < i; j++) {
            g1.fb();
            int k = g1.ob();
            njb[j] = new String[k];
            for(int l = 0; l < k; l++)
                njb[j][l] = g1.wb();

            ojb[j] = g1.wb();
            g1.fb();
            pjb[j] = g1.ob();
            qjb[j] = g1.ob();
            rjb[j] = g1.ob();
            sjb[j] = g1.ob();
            tjb[j] = g1.ob();
            ujb[j] = g1.ob();
            vjb[j] = g1.ob();
            wjb[j] = g1.ob();
            xjb[j] = g1.ob();
            yjb[j] = g1.ob();
            zjb[j] = g1.ob();
            akb[j] = g1.ob();
            bkb[j] = g1.ob();
            ckb[j] = g1.ob();
            dkb[j] = g1.ob();
            g1.fb();
            for(int i1 = 0; i1 < 12; i1++)
                ekb[j][i1] = wp(g1.wb());

            fkb[j] = g1.hb();
            gkb[j] = g1.hb();
            hkb[j] = g1.hb();
            ikb[j] = g1.hb();
            g1.fb();
            jkb[j] = g1.ob();
            kkb[j] = g1.ob();
            lkb[j] = g1.ob();
            mkb[j] = g1.ob();
            nkb[j] = g1.ob();
            g1.fb();
            int j1 = g1.ob();
            okb[j] = new int[j1];
            pkb[j] = new int[j1];
            for(int k1 = 0; k1 < j1; k1++) {
                okb[j][k1] = np(g1.wb());
                pkb[j][k1] = g1.ob();
            }

        }

        g1.yb();
    }

    public static void up(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        rib = i;
        System.out.println("Found " + i + " objects");
        tib = new String[i][];
        uib = new String[i];
        wib = new String[i];
        xib = new int[i];
        yib = new int[i];
        zib = new int[i];
        ajb = new int[i];
        bjb = new int[i];
        cjb = new int[i];
        djb = new int[i];
        ejb = new int[i];
        fjb = new int[i];
        gjb = new int[i];
        hjb = new int[i];
        ijb = new int[i];
        jjb = new int[i];
        kjb = new int[i];
        ljb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            int k = g1.ob();
            tib[j] = new String[k];
            for(int l = 0; l < k; l++)
                tib[j][l] = g1.wb();

            uib[j] = g1.wb();
            g1.fb();
            xib[j] = g1.ob();
            if(xib[j] >= sib)
                sib = xib[j] + 1;
            yib[j] = g1.ob();
            zib[j] = g1.ob();
            wib[j] = g1.wb();
            g1.fb();
            ajb[j] = g1.ob();
            bjb[j] = g1.ob();
            cjb[j] = g1.ob();
            djb[j] = g1.ob();
            ejb[j] = g1.ob();
            fjb[j] = g1.ob();
            gjb[j] = rp(g1.wb()) + 1;
            g1.fb();
            hjb[j] = g1.ob();
            ijb[j] = wp(g1.wb());
            jjb[j] = g1.hb();
            kjb[j] = g1.ob();
            ljb[j] = g1.ob();
        }

        g1.yb();
    }

    public static void pp(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        ykb = i;
        System.out.println("Found " + i + " locations");
        zkb = new String[i][];
        alb = new String[i];
        blb = new String[i];
        clb = new String[i];
        dlb = new int[i];
        elb = new int[i];
        flb = new int[i];
        glb = new int[i];
        hlb = new int[i];
        ilb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            int k = g1.ob();
            zkb[j] = new String[k];
            for(int l = 0; l < k; l++)
                zkb[j][l] = g1.wb();

            alb[j] = g1.wb();
            g1.fb();
            dlb[j] = vp(g1.wb());
            elb[j] = g1.ob();
            flb[j] = g1.ob();
            glb[j] = g1.ob();
            hlb[j] = g1.ob();
            blb[j] = g1.wb();
            if(blb[j].equals("_"))
                blb[j] = "WalkTo";
            clb[j] = g1.wb();
            if(clb[j].equals("_"))
                clb[j] = "Examine";
            ilb[j] = g1.ob();
        }

        g1.yb();
    }

    public static void zp(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        jlb = i;
        System.out.println("Found " + i + " boundaries");
        klb = new String[i][];
        llb = new String[i];
        mlb = new String[i];
        nlb = new String[i];
        olb = new int[i];
        plb = new int[i];
        qlb = new int[i];
        rlb = new int[i];
        slb = new int[i];
        tlb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            int k = g1.ob();
            klb[j] = new String[k];
            for(int l = 0; l < k; l++)
                klb[j][l] = g1.wb();

            llb[j] = g1.wb();
            g1.fb();
            olb[j] = g1.ob();
            plb[j] = g1.ob();
            qlb[j] = g1.ob();
            rlb[j] = g1.ob();
            slb[j] = g1.ob();
            tlb[j] = g1.ob();
            mlb[j] = g1.wb();
            if(mlb[j].equals("_"))
                mlb[j] = "WalkTo";
            nlb[j] = g1.wb();
            if(nlb[j].equals("_"))
                nlb[j] = "Examine";
        }

        g1.yb();
    }

    public static void op(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        ulb = i;
        System.out.println("Found " + i + " roofs");
        vlb = new String[i];
        wlb = new int[i];
        xlb = new int[i];
        ylb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            vlb[j] = g1.wb();
            wlb[j] = g1.ob();
            xlb[j] = g1.ob();
            ylb[j] = g1.ob();
        }

        g1.yb();
    }

    public static void sp(g g1) throws IOException {
        g1.fb();
        int i = g1.ob();
        zlb = i;
        System.out.println("Found " + i + " floors");
        amb = new String[i];
        bmb = new int[i];
        cmb = new int[i];
        dmb = new int[i];
        for(int j = 0; j < i; j++) {
            g1.fb();
            amb[j] = g1.wb();
            bmb[j] = g1.ob();
            cmb[j] = g1.ob();
            dmb[j] = g1.ob();
        }

        g1.yb();
    }

    public static int wp(String s1) {
        if(s1.equalsIgnoreCase("na"))
            return -1;
        for(int i = 0; i < qkb; i++)
            if(s1.equalsIgnoreCase(rkb[i]))
                return i;

        System.out.println("WARNING: unable to match entity " + s1);
        return 0;
    }

    public static int vp(String s1) {
        if(s1.equalsIgnoreCase("na"))
            return 0;
        for(int i = 0; i < rnb; i++)
            if(snb[i].equalsIgnoreCase(s1))
                return i;

        snb[rnb++] = s1;
        return rnb - 1;
    }

    public static int np(String s1) {
        if(s1.equalsIgnoreCase("na"))
            return 0;
        for(int i = 0; i < rib; i++) {
            for(int j = 0; j < tib[i].length; j++)
                if(tib[i][j].equalsIgnoreCase(s1))
                    return i;

        }

        System.out.println("WARNING: unable to match object: " + s1);
        return 0;
    }

    public static int rp(String s1) {
        if(s1.equals("_"))
            return -1;
        for(int i = 0; i < emb; i++)
            if(gmb[i].equalsIgnoreCase(s1))
                return i;

        System.out.println("WARNING: unable to match projectile: " + s1);
        return -1;
    }

    public t() {
    }

    public final int qib = 0xbc614e;
    public static int rib;
    public static int sib;
    public static String tib[][];
    public static String uib[];
    public static String vib[];
    public static String wib[];
    public static int xib[];
    public static int yib[];
    public static int zib[];
    public static int ajb[];
    public static int bjb[];
    public static int cjb[];
    public static int djb[];
    public static int ejb[];
    public static int fjb[];
    public static int gjb[];
    public static int hjb[];
    public static int ijb[];
    public static int jjb[];
    public static int kjb[];
    public static int ljb[];
    public static int mjb;
    public static String njb[][];
    public static String ojb[];
    public static int pjb[];
    public static int qjb[];
    public static int rjb[];
    public static int sjb[];
    public static int tjb[];
    public static int ujb[];
    public static int vjb[];
    public static int wjb[];
    public static int xjb[];
    public static int yjb[];
    public static int zjb[];
    public static int akb[];
    public static int bkb[];
    public static int ckb[];
    public static int dkb[];
    public static int ekb[][];
    public static int fkb[];
    public static int gkb[];
    public static int hkb[];
    public static int ikb[];
    public static int jkb[];
    public static int kkb[];
    public static int lkb[];
    public static int mkb[];
    public static int nkb[];
    public static int okb[][];
    public static int pkb[][];
    public static int qkb;
    public static String rkb[];
    public static String skb[];
    public static int tkb[];
    public static int ukb[];
    public static int vkb[];
    public static int wkb[];
    public static int xkb[];
    public static int ykb;
    public static String zkb[][];
    public static String alb[];
    public static String blb[];
    public static String clb[];
    public static int dlb[];
    public static int elb[];
    public static int flb[];
    public static int glb[];
    public static int hlb[];
    public static int ilb[];
    public static int jlb;
    public static String klb[][];
    public static String llb[];
    public static String mlb[];
    public static String nlb[];
    public static int olb[];
    public static int plb[];
    public static int qlb[];
    public static int rlb[];
    public static int slb[];
    public static int tlb[];
    public static int ulb;
    public static String vlb[];
    public static int wlb[];
    public static int xlb[];
    public static int ylb[];
    public static int zlb;
    public static String amb[];
    public static int bmb[];
    public static int cmb[];
    public static int dmb[];
    public static int emb;
    public static int fmb;
    public static String gmb[];
    public static String hmb[];
    public static int imb[];
    public static int jmb[];
    public static int kmb[];
    public static int lmb[];
    public static int mmb[];
    public static int nmb[];
    public static int omb;
    public static String pmb[];
    public static String qmb[];
    public static int rmb[];
    public static int smb[];
    public static int tmb[];
    public static int umb[][];
    public static int vmb[][];
    public static int wmb;
    public static String xmb[];
    public static int ymb[];
    public static int zmb[];
    public static int anb[];
    public static int bnb[];
    public static int cnb[];
    public static int dnb[][];
    public static int enb[][];
    public static int fnb[][];
    public static int gnb;
    public static String hnb[];
    public static String inb[];
    public static int jnb[];
    public static int knb[];
    public static int lnb;
    public static String mnb[] = new String[5000];
    public static int nnb;
    public static String onb[] = new String[5000];
    static String pnb[] = {
        "attack", "defense", "strength", "hits", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", 
        "fishing", "firemaking", "crafting", "smithing", "mining", "herblaw"
    };
    public static String qnb[] = {
        "attack", "defense", "strength", "hits", "aggression", "bravery", "regenerate", "perception"
    };
    public static int rnb;
    public static String snb[] = new String[200];

}
