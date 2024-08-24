# Detaylı RecyclerView Kullanımı

Bu proje, Android uygulamalarında **RecyclerView** ile detaylı listeleme yapmayı gösteren bir örnek uygulamadır. Projede, filmlerin listelendiği ve her bir film için özel bir kart tasarımının kullanıldığı bir yapı bulunmaktadır. Kart tasarımlarında film resmi, adı, fiyatı ve sepete ekleme butonu yer alır.

## İçindekiler

- [Özellikler](#özellikler)
- [Ekran Görüntüleri](#ekran-görüntüleri)
- [Kullanılan Teknolojiler](#kullanılan-teknolojiler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)

- ## Özellikler

- **RecyclerView** ile dinamik film listeleme
- **ViewBinding** ve **DataBinding** kullanımı
- Özel kart tasarımıyla film detayları gösterimi
- **StaggeredGridLayoutManager** ile iki sütunlu film listesi
- Film sepete ekleme işlemi ve **Toast** mesajı ile kullanıcıya geri bildirim

- ## Ekran Görüntüleri

| Ana Ekran | Film Detayı |
|-----------|-------------|
| ![Ana Ekran](![Ekran görüntüsü 2024-08-24 224138](https://github.com/user-attachments/assets/f8d65578-1dd7-4266-a061-43f7e96482b1)
) | ![Film Detayı](![Ekran görüntüsü 2024-08-24 224209](https://github.com/user-attachments/assets/853ed3a7-480d-40b4-b24f-6fd7e80a0af7)
) |

## Kullanılan Teknolojiler

- **Kotlin**: Projenin ana dili
- **Android SDK 34**: Uygulamanın derleme ve hedef SDK versiyonu
- **ViewBinding**: Görünüm bağlama işlemleri için kullanıldı
- **RecyclerView**: Listeleme işlemleri için kullanıldı
- **StaggeredGridLayoutManager**: Film listesinin iki sütunlu grid yapısında gösterimi
- **CardView**: Her bir film için kart tasarımı

- ## Kurulum

Bu projeyi yerel ortamınıza kurmak için aşağıdaki adımları izleyin:

1. Bu repository'yi klonlayın:

    ```bash
    git clone https://github.com/Fatih-Uynk/detaylirvkullanimi.git
    ```

2. Android Studio'da projeyi açın.

3. Projeyi derleyip çalıştırın.

## Kullanım

- Uygulama açıldığında, **RecyclerView** içinde filmlerin listelendiği bir ana ekran göreceksiniz.
- Her film kartında, film resmi, adı ve fiyatı görüntülenir. "SEPETE EKLE" butonuna tıklayarak filmi sepete ekleyebilirsiniz. Ekleme işlemi sırasında kısa bir **Toast** mesajı ile geri bildirim alırsınız.
