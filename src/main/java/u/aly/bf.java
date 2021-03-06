package u.aly;

import com.umeng.socialize.common.SocializeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Latent */
public class bf implements Serializable, Cloneable, bz<bf, e> {
    public static final Map<e, cl> c;
    private static final dd d = new dd("Latent");
    private static final ct e = new ct("latency", (byte) 8, (short) 1);
    private static final ct f = new ct("interval", (byte) 10, (short) 2);
    private static final Map<Class<? extends dg>, dh> g = new HashMap();
    private static final int h = 0;
    private static final int i = 1;
    public int a;
    public long b;
    private byte j;

    public /* synthetic */ cg b(int i) {
        return c(i);
    }

    public /* synthetic */ bz g() {
        return a();
    }

    static {
        g.put(di.class, new b(null));
        g.put(dj.class, new d(null));
        Map enumMap = new EnumMap(e.class);
        enumMap.put(e.a, new cl("latency", (byte) 1, new cm((byte) 8)));
        enumMap.put(e.b, new cl("interval", (byte) 1, new cm((byte) 10)));
        c = Collections.unmodifiableMap(enumMap);
        cl.a(bf.class, c);
    }

    public bf() {
        this.j = (byte) 0;
    }

    public bf(int i, long j) {
        this();
        this.a = i;
        a(true);
        this.b = j;
        b(true);
    }

    public bf(bf bfVar) {
        this.j = (byte) 0;
        this.j = bfVar.j;
        this.a = bfVar.a;
        this.b = bfVar.b;
    }

    public bf a() {
        return new bf(this);
    }

    public void b() {
        a(false);
        this.a = 0;
        b(false);
        this.b = 0;
    }

    public int c() {
        return this.a;
    }

    public bf a(int i) {
        this.a = i;
        a(true);
        return this;
    }

    public void d() {
        this.j = bw.b(this.j, 0);
    }

    public boolean e() {
        return bw.a(this.j, 0);
    }

    public void a(boolean z) {
        this.j = bw.a(this.j, 0, z);
    }

    public long f() {
        return this.b;
    }

    public bf a(long j) {
        this.b = j;
        b(true);
        return this;
    }

    public void h() {
        this.j = bw.b(this.j, 1);
    }

    public boolean i() {
        return bw.a(this.j, 1);
    }

    public void b(boolean z) {
        this.j = bw.a(this.j, 1, z);
    }

    public e c(int i) {
        return e.a(i);
    }

    public void a(cy cyVar) throws cf {
        ((dh) g.get(cyVar.D())).b().b(cyVar, this);
    }

    public void b(cy cyVar) throws cf {
        ((dh) g.get(cyVar.D())).b().a(cyVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Latent(");
        stringBuilder.append("latency:");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append("interval:");
        stringBuilder.append(this.b);
        stringBuilder.append(SocializeConstants.OP_CLOSE_PAREN);
        return stringBuilder.toString();
    }

    public void j() throws cf {
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            b(new cs(new dk((OutputStream) objectOutputStream)));
        } catch (cf e) {
            throw new IOException(e.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.j = (byte) 0;
            a(new cs(new dk((InputStream) objectInputStream)));
        } catch (cf e) {
            throw new IOException(e.getMessage());
        }
    }
}
