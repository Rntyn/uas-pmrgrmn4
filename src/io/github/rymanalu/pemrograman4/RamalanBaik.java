package io.github.rymanalu.pemrograman4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RamalanBaik extends Ramalan implements SosmedSharing {

    private List<String> arrayIsiBaik;

    public RamalanBaik() {
        arrayIsiBaik = new ArrayList<>();
        arrayIsiBaik.add("Kesehatan membaik.");
        arrayIsiBaik.add("Hubungan dengan keluarga/teman membaik.");
        arrayIsiBaik.add("Keuangan membaik.");
    }

    @Override
    public void cetakRamalan() {
        Random random = new Random();
        int randomIndex = random.nextInt(arrayIsiBaik.size());
        System.out.println(arrayIsiBaik.get(randomIndex));
    }

    @Override
    public boolean share(Object yangDiShare) {
        System.out.println(yangDiShare.toString() + " berhasil dibagikan.");
        return true;
    }

}
