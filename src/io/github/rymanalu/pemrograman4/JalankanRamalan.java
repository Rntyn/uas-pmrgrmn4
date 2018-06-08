package io.github.rymanalu.pemrograman4;

public class JalankanRamalan {

    public static void main(String[] args) {
        // Polymorphism Ramalan...
        Ramalan ramalanBaik1 = new RamalanBaik();
        ramalanBaik1.cetakRamalan();

        Ramalan ramalanBuruk1 = new RamalanBuruk();
        ramalanBuruk1.cetakRamalan();


        // Polymorphism SosmedSharing...
        SosmedSharing ramalanBaik2 = new RamalanBaik();
        ramalanBaik2.share("Ramalan Baik");

        SosmedSharing ramalanBuruk2 = new RamalanBuruk();
        ramalanBuruk2.share("Ramalan Buruk");

        SosmedSharing photo = new Photo();
        photo.share("Photo");
    }

}
