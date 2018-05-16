package fauzi.hilmy.app17;

import java.util.ArrayList;

public class ShirtData {
    public static String[][] dataBaju = new String[][]{
            {"1. Kaos lengan pendek / Short Sleeve Shirts", "https://www.customink.com/mms/images/catalog/styles/207900/catalog_detail_image_large.jpg", "Kaos ini dikenal juga dengan sebutan Short sleeve shirts, ini adalah jenis kaos yang paling umum yang dimiliki oleh seorang pria. Kita bisa dengan mudah menemukannya hampir disemua distro atau outlet baju dimana saja. Contoh kaos lengan pendek yang sedang trend saat ini adalah kaos distro dan kaos surf ."},
            {"2. Kaos Tangan Panjang / Long-Sleeved T-shirt", "http://www.kaos-kerah.com/wp-content/uploads/2017/05/kaos-tangan-panjang-2.jpg", "Kaos tangan panjang atau biasa disebut long-sleeved T-shirt mempunyai bagian lengan yang panjang, yang panjangnya kira-kira sampai pergelangan lengan atau lebih sedikit. Biasanya pada bagian ujungnya diakhiri dengan manset (ujung tangan yang seperti karet), namun ada juga yang tidak."},
            {"3. Kaos Raglan", "http://www.kaos-kerah.com/wp-content/uploads/2017/05/kaos-raglan-2.jpg", "Kaos raglan adalah salah satu jenis kaos yang memiliki kareteristik unik dan khas, dimana Anda akan melihat bahwa jahitan kaos raglan antara lengan dan tubuh miring dari area leher ke area di bawah lengan, dan ini berbeda dengan kaos biasa pada umumnya. Dan tidak hanya itu, ciri khas lainnya dari kaos raglan adalah warna dari potongan bagian tangan selalu berbeda. Untuk jenisnya ada yang tangan pendek, 3/4, atau tangan panjang."},
            {"4. Kaos O neck", "http://www.kaos-kerah.com/wp-content/uploads/2017/05/kaos-jenis-o-neck.jpg", "Kaos O neck adalah kaos dengan kerah berbentuk huruf O atau bulat. Ini adalah bentuk standart dari leher kaos-kaos yang ada saat ini. Dan mungkin jenis kaos yang sedang Anda kenakan saat ini adalah jenis kaos O neck. Untuk jenisnya mungkin bisa ditemukan pada jenis kaos lainnya, seperti tangan pendek, kaos tangan 3/4, atau tangan panjang."},
            {"5. Kaos V neck", "http://www.kaos-kerah.com/wp-content/uploads/2017/07/kaos-vneck.jpg", "Kaos V neck adalah kaos yang mempunyai bentuk kerah berbentuk huruf V, atau meruncing diujungnya. Dan perlu diketahui bahwa kaos V neck tidak hanya ditemukan pada kaos wanita saja, tapi banyak juga jenis kaos pria yang menggunakan kerah V neck."},
            {"6. Kaos Polo", "http://www.kaos-kerah.com/wp-content/uploads/2017/07/polo-4.jpg", "Kaos polo adalah jenis kaos yang mempunyai kerah pada bagian lehernya. Jenis kaos untuk pria ini bisa berkesan formal dan elegan, sehingga bisa juga dikenakan pada acara-acara formal sekalipun. Tapi yang perlu kita tahu bahwa kaos polo tidak hanya untuk laki-laki saja, tapi kaos polo untuk perempuan’pun banyak kita jumpai."},
            {"7. Kaos berkancing / Henley T-shirts", "https://dynamic.zacdn.com/L7bBa0_YnpYc9IWtXyMJuOK4GDc=/fit-in/346x500/filters:quality(90):fill(ffffff)/http://static.id.zalora.net/p/lgs-0530-6050251-1.jpg", "Henley t-shirts mungkin kita jarang mendengarnya, namun ciri dari jenis model kaos pria ini adalah memiliki kancing seperti yang dimiliki kaos polo tapi tanpa kerah pada bagian lehernya. Henley t-shirts modelnya bervariasi, ada yang berbentuk singlet, kaos tangan pendek, dalam model raglan, atau kaos tangan panjang sekalipun, yang penting ciri khasnya adalah berkancing seperti kaos polo namun tanpa kerah."},
            {"8. Kaos Bergaris / Striped T-shirt", "https://cdn.lookastic.com/white-and-navy-horizontal-striped-crew-neck-t-shirt/washed-striped-t-shirt-original-442414.jpg", "Dari namanya mungkin Anda sudah dapat menebaknya, yaitu striped atau bergaris. Kaos ini mempunyai ciri khas yaitu bergaris garis. Untuk jenisnya ada yang Horizontal Striped T-shirt atau bergaris menyamping, dan ada juga yang Vertical Striped T-shirt atau bergaris dari atas kebawah. Untuk model"},
            {"9. Kaos Berkantung  / Pocket T-Shirt", "http://www.knightsgear.com/content/images/thumbs/0002930_usa-made-pocket-t-shirt.jpeg", "Jenis kaos pria ini mudah dikenali dengan adanya kantung yang ukurannya tidak terlalu besar yang umumnya terletak di sebelah kiri dada. Kantung ini lebih ke variasi saja karena ukurannya yang kecil."},
            {"10. Hooded T-shirts", "https://cdn.ccs.com/media/catalog/product/cache/4/image/9df78eab33525d08d6e5fb8d27136e95/d/i/diamond-supply-co-speckle-hooded-t-shirt-black_3.1506710694.jpg", "Dari namanya apakah kamu sudah bisa menebaknya ? Hood atau hooded artinya adalah tudung atau berkerudung. Ya, jenis kaos untuk pria ini adalah jenis kaos yang memiliki kerudung atau penutut kepala dibagian atasnya, tapi bukan sweater hoodie looh yahh.\n \t Yang membedakan kaos model hooded dan sweater hoodie adalah biasanya kalau sweater hoodie dibagian ujung bawah nya mengenakan karet, sedangkan kaos hooded tidak, jadi tampak seperti kaos biasa namun dengan tambahan aksen penutup kepala."}
    };

    public static ArrayList<Shirt> getDataBaju() {
        Shirt baju = null;
        ArrayList<Shirt> listt = new ArrayList<>();
        for (int i = 0; i < dataBaju.length; i++) {
            baju = new Shirt();
            baju.setNama(dataBaju[i][0]);
            baju.setPhoto(dataBaju[i][1]);
            baju.setDescription(dataBaju[i][2]);
            listt.add(baju);
        }
        return listt;
    }

    public static String[][] dataJaket = new String[][]{
            {"1. Jaket Windbreaker", "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//101/MTA-1693775/refill-stuff_refill-stuff-windbreaker-printing-jacket-pria---black-grey_full04.jpg", "Memiliki ciri khas karet di pergelangan tangannya, memiliki hoodie dan kerah sehingga cocok bagi yang sering menghabiskan waktu di daerah yang berhawa dingin atau para pengendara motor.\n" +
                    "\n" +
                    "Jacket ini didesain secara khusus sehingga mampu menjaga suhu tubuh tetap normal dan merasa hangat meskipun kondisi cuaca sedang tidak bersahabat atau kondisi cuaca yang ekstrim seperti angin besar hingga suhu yang dingin."},
            {"2. Jaket Bomber", "https://mm-image-marketing.s3.amazonaws.com/jual/fashion/blues-jaket-bomber-navy-2525114.jpg", "Memiliki nama lain “flight jacket”, outer ini awalnya dipakai oleh para pilot dan menjadi tren fashion remaja di tahun 1970an. Di tahun 1990an, jacket ini kembali menjadi trend an dipakai oleh para penyanyi dan musisi hip hop. Jacket ini memiliki ciri khas berbentuk bulky atau gemuk, dilengkapi dengan risleting dan kantung di kedua sisinya."},
            {"3. Jaket Varsity", "https://ecs7.tokopedia.net/img/cache/300/product-1/2016/9/14/9164698/9164698_cb75da2e-da40-4f6e-a736-4b25a84df683.jpg", "Awalnya jacket ini bernama Letterman Jacket dan hanya digunakan oleh para mahasiswa Universitas Harvard. Seiring dengan berjalannya waktu, jacket ini menyebar penggunaannya ke kampus-kampus lain hingga sekolah menengah atas dan kini dipakai oleh siapa saja. Ciri khas dari jacket ini adalah huruf yang dibordir di dada kiri jacket."},
            {"4. Jaket Kulit", "https://3.bp.blogspot.com/-Uk3mYzg0aKM/WN-WBe2e4GI/AAAAAAAAAjk/BqWSKjKfBjMm-RXivfNnc1QNo5pw2XaAwCLcB/s320/Jaket%2BKulit%2BPria.jpg", "Sesuai dengan namanya, jaket ini terbuat dari bahan kulit binatang baik itu kulit asli maupun kulit sintetis atau buatan. Pelindung dari cuaca dingin dan angin ini memiliki ciri tampak depan adalah bukaan jacket berupa risleting, kancing, atau sabuk dari leher hingga bawah."},
            {"5. Sports Jacket", "https://www.tiptoptailors.ca/media/A2W/products/68241/5121-626-3059-322_a_details.jpg", "Disebut juga sports coat, tweed jacket atau tweed coat yang dipakai untuk acara formal. Ciri khasnya adalah terbuat dari bahan suede, corduroy, denim, dan tweed dengan potongan sederhana mirip jas. Jacket ini biasanya dipakai untuk kegiatan aktif di luar ruangan."},
            {"6. Jaket Parka", "https://mm-image-marketing.mataharimall.co/jual/jaket/fashion-jaket-parka-pria-navy-1503151.jpg", "Rumornya jaket ini berasal dari orang-orang Inuit atau Eskimo untuk melindungi tubuh mereka dari hawa dingin yang ekstrim. Potongannya yang nyaman dan hoodie atau tudung berbulu menjadi populer di kalangan militer Amerika Serikat pada tahun 50an sebelum variasi ekor ikan selama Perang Korea.\n" +
                    "\n" +
                    "Adalah sub-budaya Mod di Britania sekitar tahun 60an yang membuat parka menjadi fashion utama dan diolah lagi oleh merek-merek mewah dengan siluet baru. Ciri khasnya adalah parka merupakan jacket yang tahan air, berkerudung tanpa bukaan depan, dan kadang-kadang drawstrings di pinggang dan manset. Kini, parka dipakai untuk kesempatan kasual bersama celana jeans dan sepatu trainer."},
            {"7. Duffle Coat", "http://images.asos-media.com/products/bellfield-duffle-coat/8124522-1-navy?$XXL$&wid=513&fit=constrain", "Duffle coat awalnya merupakan mantel “pendeta” Polandia yang populer di tahun 1800an yang diciptakan oleh desainer Inggris bernama John Partridge.\n" +
                    "\n" +
                    "Namun, sebenarnya, yang mempopulerkan adalah militer Inggris ketika mereka merilis kelebihan mantel ini kepada publik setelah Perang Dunia II. Dengan segera, para seniman, siswa, dan intelektual mulai mengadopsinya. Duffle coat cocok dipakai bersama celana jeans atau chino, sweater cashmere dan rajutan kabel, dan sepatu boot, brogue, atau sneaker.\n" +
                    "\n" +
                    "Ciri khasnya adalah kantong berukuran besar di bagian depan dan ada empat atau enam kancing di depan dada. Bahan kancingnya kebanyakan dari kayu ikat. Biasanya panjang coat ini mencapai lutut dan terbuat dari bahan wol."},
            {"8. Pea Coat", "https://www.privatewhitevc.com/media/catalog/product/cache/image/1768x2400/e9c3970ab036de70892d86c6d221abfe/g/1/g15206_nav.jpg", "Awalnya coat ini didesain bagi para “reefers”, pelaut yang memanjat kilang kapal layar.Pea coat klasik memiliki cantelan yang erat, sedikit lekukan pada pinggang, dan memanjang hingga seputaran pinggul.\n" +
                    "\n" +
                    "Ciri lain dari coat ini adalah memiliki kerah yang lebar, kancing double-breasted atau kancing dua baris yang terbuat dari metal, kayu, atau plastik, dan saku di sisi-sisinya. Coat ini cocok untuk dipakai ke kantor atau tampilan smart casual di akhir pekan."},
            {"9. Trench Coat", "https://s7.landsend.com/is/image/LandsEnd/487284_AG18_HF_E61?fmt=jpeg,rgb&qlt=80,1&op_sharpen=0&resMode=sharp2&op_usm=0.5,1,3,0&icc=sRGB%20IEC61966-2.1,relative&iccEmbed=1&hei=561&wid=374", "Trench coat merupakan versi ringan, pendek, dan tahan air dari mantel tebal yang biasa dipakai oleh pasukan Inggris. Adalah Burberry and Aquascutum yang menciptakannya. Seperti halnya Duffle, coat militer dipopulerkan awalnya oleh Humphrey Bogart dan para aktor Hollywood lainnya.\n" +
                    "\n" +
                    "Ciri khas coat ini terbuat dari bahan yang tahan air, memiliki 10 kancing depan, kerah yang lebar, terdapat sabuk di pinggang, serta memiliki tali di sekitar pergelangan tangan. Coat ini juga memiliki tali bahu yang dekat dengan kancing dan memiliki warna tradisional warna khaki."},
            {"10. Mackintosh Coat", "https://cdn-images.farfetch-contents.com/12/55/99/78/12559978_11946130_322.jpg", "Diciptakan oleh ahli kimia asal Skotlandia bernama Charles Macintosh pada tahun 1823. Mantel ‘Mac’ ini menampilkan sebuah bahan tahan air yang unik yang melindungi tubuh dari hujan, hujan es, mau pun salju. Mac cocok untuk dipakai ke kantor dan cukup fleksibel untuk memakainya bersama sepatu trainer."},
            {"11. Overcoat", "https://cdn.shopify.com/s/files/1/0407/7545/products/image_3ad567fa-9037-4af0-afdd-6c487e7f3935.jpg?v=1507552806", "Mantel ini merupakan outer tradisional yang keren tanpa harus menarik perhatian. Parka atau duffel akan terlihat tanggung disandingkan dengan overcoat. Tidak hanya untuk musim dingin, mantel ini merupakan barang fashion yang penting dan mendasar pada musim gugur dan musim semi, tergantung bahannya."}
    };

    public static ArrayList<Shirt> getDataJaket() {
        Shirt jaket = null;
        ArrayList<Shirt> listJaket = new ArrayList<>();
        for (int i = 0; i < dataJaket.length; i++) {
            jaket = new Shirt();
            jaket.setNama(dataJaket[i][0]);
            jaket.setPhoto(dataJaket[i][1]);
            jaket.setDescription(dataJaket[i][2]);
            listJaket.add(jaket);
        }
        return listJaket;
    }

    public static String[][] dataSweater = new String[][]{
            {"Model Sweatshirt", "https://images-na.ssl-images-amazon.com/images/I/61dtBG1Ts-L._UL1500_.jpg", "Sweatshirt adalah jenis sweater yang terbuat dari bahan kain dan memiliki potongan mirip dengan celana olahraga (sweatpants). Sweatshirt biasanya dikenakan dengan celana olahraga sebagai suatu kesatuan pakaian olahraga. Model baju sweatshirt dirancang untuk meningkatkan suhu tubuh dan mengeluarkan keringat.\n \t Biasanya sweatshirt terbuat dari sejenis bahan katun tebal dan selain dari model pullover juga terdapat model dengan resleting dan hoodie. Sweatshirt dapat digunakan sebagai pakaian kasual dengan variasi desain bergambar atau tulisan menggunaakan aplikasi sablon ataupun bordir. Jenis model sweatshirt ini dapat digunakan baik oleh pria maupun wanita."},
            {"Sweater crew neck", "https://images-na.ssl-images-amazon.com/images/I/91%2BpP50HUoL._UY445_.jpg", "Sweater Crew Neck adalah sebuah sweater yang memiliki lubang leher bulat. Jenis sweater crew neck ini merupakan model sweater yang paling sering ditemui karena simple dan cocok untuk digunakan untuk tampilan kasual."},
            {"Sweater V Neck", "http://www.lalibrasil.com/wp-content/uploads/2017/11/tommy-hilfiger-sweaters-fleece-mens-cotton-and-silk-v-neck-sweater-sodalite-blue-heather.jpg", "Sweater v neck adalah jenis sweater dengan lubang leher berbentuk huruf V dengan sudut siku di dada atas tengah."},
            {"Cardigan", "https://images.express.com/is/image/expressfashion/0021_01805026_0058?cache=on&wid=361&fmt=jpeg&qlt=75,1&resmode=sharp2&op_usm=1,1,5,0&defaultImage=Photo-Coming-Soon", "Cardigan adalah jenis pakaian rajutan serupa dengan sweater tetapi memiliki depan terbuka yang biasanya memiliki kancing. Jenis model cardigan memiliki versi terbaru dengan depan yang terbuka tanpa kancing. Cardigan bisa disebut juga sebagai jaket sweater wanita, karena biasanya banyak dikenakan oleh wanita dan jarang menjadi pilihan baju sweater pria."},
            {"Hoodie Jumper", "https://id-test-11.slatic.net/p/7/jaket-polos-hoodie-jumper-orange-8107-83651403-75843541491ac3171eb6e37e622824de-catalog.jpg_340x340q80.jpg_.webp", "Hoodie jumper adalah sebuah model hoodie tanpa bukaan depan dan resleting sehingga termasuk ke dalam jenis pullover."},
            {"Hoodie", "https://www.customink.com/mms/images/catalog/styles/291900/catalog_detail_image_large.jpg", "Hoodie adalah sebuah sweatshirt yang memiliki tudung juga disebut sebagai hooded sweatshirt. Hoodie kadang memiliki muff yang dijahit pada bagian bawah depan dan juga tali untuk menyesuaikan bukaan tudung."},
            {"Zip Up Hoodie", "https://scene7.zumiez.com/is/image/zumiez/pdp_hero/Zine-Hooligan-Black-Speckle-Zip-Up-Hoodie-_216131-front.jpg", "Zip Up Hoodie adalah sebuah model hoodie yang memiliki bukaan depan dengan resleting dari mulai bawah pinggang sampai bagian leher."},
            {"Full Zip Hoodie", "https://content.backcountry.com/images/items/900/NKE/NKE00OA/DARGREHEA.jpg", "Full Zip Hoodie adalah sebuah model hoodie yang memiliki bukaan depan dengan resleting dari mulai bawah pinggang sampai bagian tudung sehingga dapat menutupi seluruh wajah."}
    };

    public static ArrayList<Shirt> getDataSweater() {
        Shirt sweater = null;
        ArrayList<Shirt> listSweater = new ArrayList<>();
        for (int i = 0; i < dataSweater.length; i++) {
            sweater = new Shirt();
            sweater.setNama(dataSweater[i][0]);
            sweater.setPhoto(dataSweater[i][1]);
            sweater.setDescription(dataSweater[i][2]);
            listSweater.add(sweater);
        }
        return listSweater;
    }
}
