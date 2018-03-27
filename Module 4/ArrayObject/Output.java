/**
 * Output
 */

public class Output {
    public static void main(String[] args) {
        Karyawan[] dataKaryawan = new Karyawan[15];

        dataKaryawan[0] = new Karyawan();
        dataKaryawan[0].nama = "Jeremy";
        dataKaryawan[0].nik = "1202174374";
        dataKaryawan[0].alamat = "Taman Pabuaran";

        dataKaryawan[1] = new Karyawan();
        dataKaryawan[1].nama = "Budi";
        dataKaryawan[1].nik = "Budi";
        dataKaryawan[1].alamat = "Budi";


        System.out.println(dataKaryawan[1].nama);

    }
}