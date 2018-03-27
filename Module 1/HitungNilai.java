class HitungNilai {
    public static void main(String[] args) {
        double nilaiUas, nilaiUts, nilaiPraktikum, nilaiTugas, nilaiTotal, kehadiran;
        String nilaiIndex;

        kehadiran = 80;
        nilaiIndex = null;
        
        // filling variable with static input
        nilaiUas = 50 * 25 / 100;
        nilaiUts = 90 * 25 / 100;
        nilaiPraktikum = 100 * 25 / 100;
        nilaiTugas = 70 * 25 / 100;

        // filtering presence below 75%
        if (kehadiran <= 75) {
            nilaiIndex = "E";
        } else {
            nilaiTotal = nilaiUas + nilaiUts + nilaiPraktikum + nilaiTugas;
            if (nilaiTotal >= 80.1) {
                nilaiIndex = "A";
            } else {
                nilaiIndex = "Bagus";
            }
        }

        System.out.println(nilaiIndex);

    }
}