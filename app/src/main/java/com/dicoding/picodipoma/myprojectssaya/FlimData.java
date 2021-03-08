package com.dicoding.picodipoma.myprojectssaya;

import java.util.ArrayList;

public class FlimData {
    private static String[] flimNames = {
            "Pembalas: Perang Infinity",
            "Bohemian Rhapsody",
            "Tarian Bebas Tegang Tinggi",
            "Deadpool 2",
            "Bumblebee",
            "Spider-Man: Into the Spider-Verse",
            "The Old Man & the Gun",
            "Black Panther",
            "Aquaman",
            "Tomb Raider",

    };

    private static String[] flimDetail = {
            "Ketika Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor dan gitaris bass John Deacon mengambil dunia musik dengan badai ketika mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band bersama di tengah kesuksesan dan kelebihan.",
            "Zander Raines, koreografer muda yang menyilaukan dan menggelora, memberikan terobosan seumur hidup bagi dua seniman penuh harapan ketika ia berperan sebagai penari kontemporer yang memukau, Barlow, dan pianis inovatif, Charlie, dalam pertunjukan Broadway baru di New York yang paling dinanti-nantikan: Free Dance. Tapi langkah itu membuang keseimbangan kreatif pertunjukan itu ketika Charlie jatuh cinta pada Barlow sementara Zander memeluknya sebagai inspirasi.",
            "Deadpool tentara bayaran penyihir bertempur melawan Cable jahat dan kuat dan orang jahat lainnya untuk menyelamatkan hidup anak laki-laki.",
            "Dalam pelarian pada tahun 1987, Bumblebee menemukan tempat perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. Ketika Charlie menghidupkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa.",
            "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan collider super, yang lain dari seberang Spider-Verse diangkut ke dimensi ini.",
            "Kisah nyata Forrest Tucker, dari pelariannya yang berani dari San Quentin pada usia 70 tahun ke serangkaian perampokan yang belum pernah terjadi sebelumnya yang membingungkan pihak berwenang dan memikat publik. Terlibat dalam pengejaran adalah seorang detektif, yang menjadi terpikat dengan komitmen Forrest terhadap keahliannya, dan seorang wanita, yang mencintainya terlepas dari profesi yang dipilihnya.",
            "Raja T'Challa pulang dari Amerika ke negara Wakanda yang tertutup dan berteknologi maju untuk melayani sebagai pemimpin baru negaranya. Namun, T'Challa segera menemukan bahwa ia ditantang untuk naik takhta oleh faksi di negaranya sendiri maupun di luar.\n" +
                    "\n" +
                    "Menggunakan kekuatan yang disediakan untuk raja-raja Wakandan, T'Challa mengasumsikan mantel Black Panther untuk bergabung dengan pacar Nakia, ibu-ratu, saudara perempuan-anak kandungnya, anggota Dora Milaje (pasukan khusus 'Wakandan') dan seorang agen rahasia Amerika. , untuk mencegah Wakanda diseret ke dalam perang dunia.",
            "Dulunya merupakan rumah bagi peradaban paling maju di Bumi, Atlantis sekarang merupakan kerajaan bawah laut yang diperintah oleh Raja Orm yang haus kekuasaan. \n" +
                    "\n" +
                    "Dengan pasukan yang sangat besar, Orm berencana untuk menaklukkan orang-orang samudera yang tersisa dan kemudian ke permukaan dunia. Yang menghalangi jalannya adalah Arthur Curry, saudara tiri manusia setengah manusia Orm dan pewaris sejati takhta.",
            "Lara Croft, putri yang sangat mandiri dari seorang petualang yang hilang, harus mendorong dirinya melampaui batas ketika dia menemukan dirinya di pulau tempat ayahnya menghilang.",

    };

    private static int[] flimImages = {
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_bohemian,
            R.drawable.tarian_bebas,
            R.drawable.deadpool,
            R.drawable.poster_bumblebee,
            R.drawable.spider_man,
            R.drawable.the_old_man,
            R.drawable.black_panther,
            R.drawable.aqumen,
            R.drawable.tomb_raider

    }; static ArrayList<Flim> getListData() {
        ArrayList<Flim> list = new ArrayList<>();
        for (int position = 0; position < flimNames.length; position++) {
            Flim flim = new Flim();
            flim.setName(flimNames[position]);
            flim.setDetail(flimDetail[position]);
            flim.setPhoto(flimImages[position]);
            list.add(flim);
        }
        return list;
    }
}
