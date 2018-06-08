package io.github.rymanalu.pemrograman4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RamalanBuruk extends Ramalan implements SosmedSharing {

    private List<String> arrayIsiBuruk;

    public RamalanBuruk() {
        arrayIsiBuruk = new ArrayList<>();
        arrayIsiBuruk.add("Kesehatan memburuk.");
        arrayIsiBuruk.add("Hubungan dengan keluarga/teman memburuk.");
        arrayIsiBuruk.add("Keuangan memburuk.");
    }

    @Override
    public void cetakRamalan() {
        Random random = new Random();
        int randomIndex = random.nextInt(arrayIsiBuruk.size());
        System.out.println(arrayIsiBuruk.get(randomIndex));
    }

    @Override
    public boolean share(Object yangDiShare) {
        System.out.println(yangDiShare.toString() + " berhasil dibagikan.");
        return true;
    }

    public void setter() {
        //
    }

    public String getter() {
        Random random = new Random();
        int randomIndex = random.nextInt(arrayIsiBuruk.size());
        return arrayIsiBuruk.get(randomIndex);
    }

}
