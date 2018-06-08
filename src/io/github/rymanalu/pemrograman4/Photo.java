package io.github.rymanalu.pemrograman4;

import java.awt.*;
import java.util.Date;
import java.util.logging.Filter;

public class Photo implements SosmedSharing {

    private Date tanggalAmbil;

    private String namaFile;

    private Dimension size;

    private Filter jenisFilter;

    public void resize() {
        //
    }

    public Dimension getSize() {
        return size;
    }

    public Filter addFilter() {
        return jenisFilter;
    }

    public void setter() {
        //
    }

    public Date getterD() {
        return tanggalAmbil;
    }

    public String getterNamaFile() {
        return namaFile;
    }

    @Override
    public boolean share(Object yangDiShare) {
        System.out.println(yangDiShare.toString() + " berhasil dibagikan.");
        return true;
    }

}
