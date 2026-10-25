# Laporan Tugas Materi GUI - 5C

* **NIM** : F1D02410015
* **Nama** : Muhamad Farhan Maulana
* **Tautan Repositori GitHub** : https://github.com/muhamadfarhanmaulana/TUGAS-GUI_PBO.git

---

### Penjelasan Komponen GUI yang Digunakan:

1. **Top Level Container**: 
   * Menggunakan `JFrame` (`LuasPersegiPanjang`) sebagai jendela utama aplikasi dengan fungsi pengaman `EXIT_ON_CLOSE` untuk menutup program[cite: 10, 21].
2. **Intermediate Component**: 
   * Menggunakan `JPanel` (`panelUtama`) sebagai wadah perantara untuk mengelompokkan komponen form input[cite: 10].
3. **Atomic Component**: 
   * `JLabel` untuk menampilkan teks label dan hasil perhitungan[cite: 10, 14, 16].
   * `JTextField` untuk menerima input angka panjang dan lebar dari pengguna[cite: 10, 14, 18].
   * `JButton` sebagai tombol interaktif untuk memicu proses perhitungan[cite: 10, 14, 17].
4. **Layout Manager**: 
   * `BorderLayout` untuk mengatur posisi utama wadah[cite: 11, 35].
   * `GridLayout` untuk menyusun elemen-elemen form input di dalam `JPanel` menjadi bentuk baris dan kolom yang rapi[cite: 11, 46].
5. **Event Handling (Minimal 2 Interface)**: 
   * **`ActionListener`**: Menangani aksi klik pada tombol `btnHitung` untuk mengkalkulasi luas[cite: 11].
   * **`FocusListener`**: Menangani perubahan status fokus (warna latar belakang) pada `textPanjang` saat diklik oleh pengguna[cite: 11].

### Screenshot Program:
<img width="417" height="262" alt="image" src="https://github.com/user-attachments/assets/7872c331-8fe1-4763-8ce0-05c04bd42dc2" />

