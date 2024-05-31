
public interface Perawatan {
    void treatment();
}

class Tomat extends Tanaman implements Perawatan {

    public Tomat(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
    }

    @Override
    public void berkembang() {
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        setLamaHidup(getLamaHidup() + 1);
        
        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.05));
    }
}

class Stroberi extends Tanaman implements Perawatan {

    public Stroberi(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
    }

    @Override
    public void berkembang() {
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        setLamaHidup(getLamaHidup() + 1);
        
        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.05));
    }
}

class Persik extends Tanaman implements Perawatan {

    public Persik(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
    }

    @Override
    public void berkembang() {
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        setLamaHidup(getLamaHidup() + 1);
        
        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.025));
    }
}