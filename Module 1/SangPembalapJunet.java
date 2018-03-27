public class SangPembalapJunet {
    public static void main(String[] args) {
       float kecepatan, kelilingLingkaran, pi, lingkaranSirkuit, lurusanSirkuit, jarakTempuh, totalTempuhJunet, waktuTempuhJunet, waktuTempuhAsep;
       int putaran = 200;
       
       kecepatan            = 318f;
       pi                   = 3.14f;
       lingkaranSirkuit     = 0.5f;
       lurusanSirkuit       = 1.6f;
       waktuTempuhAsep      = 2.8f;
       
       // mencari keliling lingkaran
       kelilingLingkaran    = pi * lingkaranSirkuit;
       System.out.println("Keliling Lingkaran Sirkuit: " + kelilingLingkaran + "km");
       
       // mencari jarak tempuh sirkuit dalam satu putaran
       jarakTempuh = (lurusanSirkuit*2) + kelilingLingkaran;
       System.out.println("Jarak Tempuh Sirkuit: " + jarakTempuh + "km");
       
       // putaran junet
       System.out.println("Putaran Junet: " + putaran + " kali");
       
       // mencari total tempuh junet
       totalTempuhJunet = jarakTempuh * putaran;
       System.out.println("Total Tempuh Junet: " + totalTempuhJunet + "km");
       
       // mencari waktu tempuh junet (dalam jam)
       waktuTempuhJunet = totalTempuhJunet / kecepatan;
       System.out.println("Waktu Junet: " + (int)waktuTempuhJunet + " Jam");
       
       boolean winner = (waktuTempuhJunet<waktuTempuhAsep);
       
       // false berarti lebih lambat dan true berarti lebih cepat
       System.out.println("Apakah junet lebih cepat dari asep? : " + (winner));    
    }
}
