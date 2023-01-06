package com.android.e_cipari.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.e_cipari.R
import com.android.e_cipari.databinding.ActivityArtikelBinding
import com.android.e_cipari.model.Artikel

class ArtikelActivity : AppCompatActivity() {

    private val binding by lazy { ActivityArtikelBinding.inflate(layoutInflater) }
    private var listArticle = ArrayList<Artikel>()
    private var adapterArticle = ArtikelAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            actionBar.apply {
                txtTitle.text = "Artikel"
                btnBack.visibility = View.VISIBLE
                btnBack.setOnClickListener { onBackPressed() }
                btnMenu.visibility = View.INVISIBLE
            }

            listArticle.add(Artikel("PAKAN SUPLEMEN TERNAK BERUPA MINERAL BLOK UNTUK SAPI PERAH",
                "Masyarakat Kelurahan Cipari, Kecamatan Cigugur sebagian besar berprofesi sebagai peternak. Ternak peliharaan utamanya ialah sapi perah. Untuk pakan ternak sendiri berupa hijauan dan konsentrat. Sebagai hewan mamalia, sapi membutuhkan nutrisi seperti karbohidrat, protein, vitamin dan mineral. Nutrisi-nutrisi tersebut sebenarnya sudah terkandung dalam suatu pakan. Namun untuk nutrisi tertentu misalnya mineral jumlahnya sangat sedikit. Kekurangan mineral pada ternak dapat terlihat melalui penurunan nafsu makan, penurunan bobot badan dan ganggan reproduksi. Untuk dapat tumbuh dan berkembang secara optimal, ternak sapi harus tercukupi kebutuhan mineralnya. Selama ini belum ada inovasi suplemen pakan berupa mineral blok. \n" +
                        "\tMineral blok merupakan mineral untuk ternak ruminansia yang dicetak dalam bentuk balok dan bisa dijilati oleh ternak kapanpun mereka membutuhkan. Keberadaannya sangat diperlukan, tapi terkadang banyak peternak yang melupakannya. Mineral blok memiliki fungsi antara lain sebagai penyusun tulang dan gigi, penyusun nutrisi organik, seperti lipid dan protein yang ditemukan dalam jaringan sel, otot dan organ tubuh, sebagai garam terlarut dalam darah, cairan tubuh dan berperan dalam mempertahankan hubungan osmotik serta keseimbangan asam-basa cairan tubuh, bahan enzim, hormon dan subtansi lain yang di perlukan untuk metabolisme, serta sangat diperlukan untuk kehamilan. \n" +
                        "Alat dan bahan yang diperlukan antara lain: \n" +
                        "Botol bekas, Air secukupnya, Mineral 2 kg, Garam 2 kg, Semen putih 1 kg.\n" +
                        "Cara Pembuatannya adalah:\n" +
                        "Campur garam dapur, ultra mineral dan semen.\n" +
                        "Aduk campuran hingga merata.\n" +
                        "Tambahkan air sedikit demi sedikit ke dalam adonan hingga adonan bisa dicetak yaitu ditandai dengan adonan yang tidak pecah apabila digenggam.\n" +
                        "Cetak adukan dengan menggunakan botol bekas\n" +
                        "Keringkan di ruangan terlindung dari air hujan.\n" +
                        "Setelah kering, mineral blok siap diberikan ke hewan ternak.\n",
                R.drawable.suplemen))

            listArticle.add(Artikel("RUMPUT VARIETAS \"GAMA UMAMI\" SEBAGAI UPAYA PENINGKATAN KETERSEDIAAN HIJAUAN DI KELURAHAN CIPARI",
                "Rumput terdiri dari rumput lokal yang tumbuh alami di area-area tertentu. Beberapa contoh rumput lokal yang digunakan untuk pakan ternak adalah rumput gajah, pakchong, lamtoro dan lainnya. Beberapa tahun terakhir Fakultas Peternakan (Fapet) UGM mengembangkan rumput Gama Umami, yaitu mutasi rumput gajah yang telah diradiasi sinar gamma sehingga menghasilkan rumput yang lebih unggul dibandingkan dengan tetuanya." +
                        "Rumput gajah sendiri memiliki nama latin Pennisetum purpureum cv. Mott dengan ciri-ciri berbatang pendek, namun pertumbuhan cepat, tinggi tanaman rata-rata 125 cm, daun lembut tidak bersegmen, dalam satu rumpun mampu tumbuh sekitar 50-80 batang. Sedangkan keuggulan dari Rumput Gama umami dibandingkan dengan rumput gajah adalah tingginya bisa mencapai 3,4-3,7 m, panjang tanaman berukuran 3,7-3,8 m, panjang daun 1,1-1,3 meter, panjang ruas 12-15,3 cm, batang rumput ini berdiameter 2,2 cm lalu, jumah tunasnya bisa tumbuh sebanyak 41-50, pada penanaman musim kemarau gama umami akan tumbuh tunas yang besar dan bisa tumbuh sekitar 10 tunas, presentase tumbuh lewat stek batang tinggi, 2 bulan penanaman pertama bisa tumbuh 20 tunas setiap minggunya, tunas terus tumbuh hingga 5 kali lipat pada pemotongan selanjutnya, daun lebih hijau, hanya tumbuh bulu sedikit pada daun, batangnya empuk dan memiliki rasa agak manis, palatabilitas dan produktivitas lebih bagus. ",
                R.drawable.gamaumami))

            listArticle.add(Artikel("PEMBUATAN PUPUK KOMPOS DARI KOTORAN SAPI UNTUK MENINGKATKAN UMKM",
                "Kompos merupakan hasil dekomposis bahan organik kompleks menjadi sederhana dengan\n" +
                        "memanfaatkan mikroorganisme sabagai pengurai. Tujuan proses pengomposan yaitu untuk\n" +
                        "mendekomposisi bahan-bahan organik menjadi lebih stabil dan aman untuk digunakan. Hasil dari\n" +
                        "proses pengomposan yaitu unsur hara yang menyerupai humus mirip tanah yang dapat\n" +
                        "dimanfaatkan oleh tanaman.\n" +
                        "Manfaat dari pengomposan yaitu menyediakan bahan organik sederhana bagi tanaman,\n" +
                        "menghilangkan bau feses, menghilangkan pathogen-patogen yang terdapat di dalam feses,\n" +
                        "memperbaiki kualitas tanah dan meninglkatkan nilai jual dari feses.\n" +
                        "Ciri-ciri fese yang sudah menjadi kopos adalah bau kotoran hilang, berwarna coklat tua sampai\n" +
                        "kehitaman, lembab, tekstur remah, dan bau seperti tanah.\n" +
                        "Alat dan bahan yang digunakan yaitu karung, sekop, EM4, molases, air dan kotoran sapi. Untuk\n" +
                        "metodenya sendiri yaitu :\n" +
                        "Kompos merupakan hasil dekomposis bahan organik kompleks menjadi sederhana dengan\n" +
                        "memanfaatkan mikroorganisme sabagai pengurai. Tujuan proses pengomposan yaitu untuk\n" +
                        "mendekomposisi bahan-bahan organik menjadi lebih stabil dan aman untuk digunakan. Hasil dari\n" +
                        "proses pengomposan yaitu unsur hara yang menyerupai humus mirip tanah yang dapat\n" +
                        "dimanfaatkan oleh tanaman.\n" +
                        "Manfaat dari pengomposan yaitu menyediakan bahan organik sederhana bagi tanaman,\n" +
                        "menghilangkan bau feses, menghilangkan pathogen-patogen yang terdapat di dalam feses,\n" +
                        "memperbaiki kualitas tanah dan meninglkatkan nilai jual dari feses.\n" +
                        "Ciri-ciri fese yang sudah menjadi kopos adalah bau kotoran hilang, berwarna coklat tua sampai\n" +
                        "kehitaman, lembab, tekstur remah, dan bau seperti tanah.\n" +
                        "Alat dan bahan yang digunakan yaitu karung, sekop, EM4, molases, air dan kotoran sapi. Untuk\n" +
                        "metodenya sendiri yaitu :",
                R.drawable.kompos))


            listArticle.add(Artikel("PENTINGNYA SANITASI PASCA PMK (PENYAKIT MULUT DAN KUKU) "+
                    "PADA SAPI PERAH DI KELURAHAN CIPARI",
                "Penyakit Mulut dan Kuku (Food and Mouth Disease) yang biasa disingkat PMK disebabkan oleh virus famili Picornaviridae genus Aphtovirus. Penyakit ini bersifat akut dan sangat menular. Penyakit ini menyerang semua hewan berkuku belah/genap, seperti sapi, kerbau, babi, kambing, domba termasuk juga hewan liar seperti gajah, rusa dan sebagainya. Virus dapat bertahan lama di lingkungan, dan bertahan hidup di tulang, kelenjar, susu serta produk susu. Penyakit Mulut Dan Kuku pada hewan spesies berbeda sedikit rentan karena virus ini memiliki masa inkubasi 28 hari (Sumadwita et al., 2022).\n" +
                        "\tKementan 2019 menyatakan bahwa gejala umum pada hewan yang teserang PMK adalah demam munculnya lepuh, bisul serta koreng pada mulut, lidah, hidung, kaki dan puting. Kemudian lesi atau kerusakan (ketidaknormalan) di bagian atau jaringan pada sela jari kaki. Ternak yang terinfeksi biasanya mengalami depresi, enggan bergerak, cairan hidung dan air liur berlebihan dan hilang nafsu makan. Akibatnya terjadi penurunan pada produksi susu, berat badan dan pertumbuhannya. Tingkat penularan PMK sangat tinggi melalui berbagai transmisi, antara lain yaitu kontak langsung maupun tidak langsung dengan hewan penderita (droplet, leleran hidung, atau serpihan kulit), melalui vector, dan dapat juga melalui udara\n" +
                        "\tBeberapa waktu lalu hampir seluruh peternakan sapi perah yang ada di Kelurahan Cipari terserang PMK. Kurang lebih 400 sapi perah mati karena penyakit ini. Hal tersebut menyebabkan kerugian ekonomi yang tinggi. Untuk mencegah apabila penyakit ini menyerang lagi bisa dengan sanitasi dan biosecurity. Beberapa diantaranya adalah:\n" +
                        "Vaksinasi\n" +
                        "Program vaksinasi menjadi rujukan utama dalam pemberantasan dan penanganan penyakit PMK. Vaksinasi bertujuan mencapai harapan terbentuknya herd imunity. Pemberian vaksin pada sapi merupakan langkah efektif dalam pemberantasan penyakit PMK. Pada dasarnya, vaksin dibuat melalui tahapan isolasi dan duplikasi gen yang mengode pembentukan kulit protein virus. Gen tersebut kemudian akan dimasukan pada plasmid bakteri E.Coli dan selanjuya E.Coli akan membentuk protein yang nantinya akan direkayasa untuk berkerja terhadap virus PMK (Abdurahman, 2008).\n" +
                        "Isolasi dan karantina ternak\n" +
                        "\tSelain dilakukan vaksinasi, ternak yang diketahui menderita gejala klinis PMK harus dilakukan isolasi sebagai upaya meminimalisir penyebaran penularan penyakit PMK antar ternak. beberapa daerah bahkan memerlakukan kebijakan lockdown dan menutup lalu lintas perdagangan ternak baik dari dalam maupun dari luar daerah sebaagai bentuk antisipasi dan upaya tindakan preventif. Identifikasi penularan dan penyebaran PMK dapat diduga dari  pemasukan hewan ternak yaitu sapi dari luar daerah, pembelian sapi dipasar hewan dari suatu daerah, peternak maupun pengunjung yang mendatangi kandang ternak sakit, biosecurity yang buruk dan transportasi.\n" +
                        "Pengobatan simptomatik\n" +
                        "\tPenanganan secara tanggap terhadap ternak yang terserang PMK dilakukan oleh petani peternak dengan menggunakan obat simptomatik. Berbagai contoh pengobatan simptomatik yang dilakukan oleh petani-peternak diaantaranya adalah penggunaan antiseptik didaerah mulut, pengobatan secara tradisional melalui pembuatan ramuan jamu dari tanaman herbal, cairan cukup untuk dehidrasi yang disebabkan sulit minum dan karena demam, pengobatan suportif lainnya (Basuki et al., 2019)\n",
                R.drawable.pmk))

            adapterArticle = ArtikelAdapter()
            adapterArticle.setData(listArticle)
            rvArtikel.apply {
                layoutManager = LinearLayoutManager(this@ArtikelActivity)
                adapter = adapterArticle
            }
        }
    }
}