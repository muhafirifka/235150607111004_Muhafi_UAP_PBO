
// class Tomat extends Tanaman implements Perawatan {

//     public Tomat() {
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
//         setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.05));
//     }

//     @Override
//     public String toString() {
//         return "Tomat [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
//     }
// }

class Tomat extends Tanaman implements Perawatan {

    public Tomat() {
        super(100, 0, 10, 0, 0.25, 0); 
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
        setPerkembangan(getPerkembangan() + (getPerkembangan() * 0.05));
    }

    @Override
    public String toString() {
        return "Tomat [masaHidup=" + getMasaHidup() + ", lamaHidup=" + getLamaHidup() + ", buah=" + getBuah() + ", status=" + status() + "]";
    }
}

