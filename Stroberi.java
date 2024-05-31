// class Stroberi extends Tanaman {
//     public Stroberi() {
//         super(80, 40, 8, 15, 0.6, 0.3);
// }
//     @Override
//     public void berkembang() {
//     }

//     @Override
//     public String status() {
//         return "Stroberi";
//     }
// }

// class Stroberi extends Tanaman implements Perawatan {

//     public Stroberi(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
//         super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
//     }

//     @Override
//     public void berkembang() {
//         setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
//         setLamaHidup(getLamaHidup() + 1);
        
//         if (getProsesBerbuah() >= getBerbuah()) {
//             setBuah(getBuah() + 1);
//             setProsesBerbuah(getProsesBerbuah() - getBerbuah());
//         }
//     }

//     @Override
//     public void treatment() {
//         setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.05));
//     }

//     @Override
//     public String toString() {
//         return "Stroberi [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
//     }
// }

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

    @Override
    public String toString() {
        return "Stroberi [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
    }
}
