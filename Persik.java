
// class Persik extends Tanaman {
//     public Persik() {
//     super(120, 60, 12, 25, 0.4, 0.2);
//     }

//     @Override
//     public void berkembang() {

//     }

//     @Override
//     public String status() {
//         return "Persik";
//     }
// }
//     interface Perawatan {
//         void treatment();
// }

// class Persik extends Tanaman implements Perawatan {

//     public Persik(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
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
//         setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.025));
//     }

//     @Override
//     public String toString() {
//         return "Persik [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
//     }
// }

// class Persik extends Tanaman implements Perawatan {

//     public Persik() {
//         super(100, 0, 100, 0, 0.25, 0);  // masaHidup: 100, lamaHidup: 0, berbuah: 100, buah: 0, perkembangan: 0.25, prosesBerbuah: 0
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
//     public String status() {
//         if (getLamaHidup() >= getMasaHidup()) {
//             return "Mati";
//         } else {
//             return "Hidup";
//         }
//     }

//     @Override
//     public void treatment() {
//         setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.025));
//     }

//     @Override
//     public String toString() {
//         return "Persik [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
//     }
// }

class Persik extends Tanaman implements Perawatan {

    public Persik() {
        super(100, 0, 10, 0, 0.25, 0);  // masaHidup: 100, lamaHidup: 0, berbuah: 10, buah: 0, perkembangan: 0.25, prosesBerbuah: 0
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
    public String status() {
        return super.status();
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.025));
    }

    @Override
    public String toString() {
        return "Persik [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
    }
}
