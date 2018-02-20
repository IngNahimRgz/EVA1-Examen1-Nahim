package com.example.nahim.eva1_examen1_nahim;

import java.util.ArrayList;

/**
 * Created by Nahim on 19/02/2018.
 */
//ES LA CLASE DONDE SE GUARDARAN LOS DATOS QUE MOSTRARAN LOS SPINNERS
public class Celulares {
    private String marca;
    private String modelo;

    public Celulares(String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getModelo() { return modelo; }

    @Override
    public String toString(){return modelo; }



    public static ArrayList<Celulares> getMarca(){
        ArrayList<Celulares> marca = new ArrayList<>();
        marca.add(new Celulares("Iphone"));
        marca.add(new Celulares("Motorola"));
        marca.add(new Celulares("Samsung"));
        marca.add(new Celulares("Huawei"));
        marca.add(new Celulares("LG"));
        marca.add(new Celulares("Alcatel"));
        marca.add(new Celulares("SONY"));
        marca.add(new Celulares("HTC"));
        marca.add(new Celulares("BlackBerry"));
        marca.add(new Celulares("Nokia"));
        return marca;
    }

    public static ArrayList<Celulares> getMotorolas(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Moto G"));
        motorolas.add(new Celulares("Moto G1"));
        motorolas.add(new Celulares("Moto G2"));
        motorolas.add(new Celulares("Moto G3"));
        motorolas.add(new Celulares("Moto G4"));
        motorolas.add(new Celulares("Moto G5"));
        motorolas.add(new Celulares("Moto Z"));
        motorolas.add(new Celulares("Moto Z play"));
        motorolas.add(new Celulares("Moto Z2"));
        motorolas.add(new Celulares("Moto Z2 Force"));
        return motorolas;
    }
    public static ArrayList<Celulares> getSamsung(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Samsung Galaxy S"));
        motorolas.add(new Celulares("Samsung Galaxy SII"));
        motorolas.add(new Celulares("Samsung Galaxy SIII"));
        motorolas.add(new Celulares("Samsung Galaxy SIV"));
        motorolas.add(new Celulares("Samsung Galaxy SV"));
        motorolas.add(new Celulares("Samsung Galaxy Note"));
        motorolas.add(new Celulares("Samsung Galaxy Note II"));
        motorolas.add(new Celulares("Samsung Galaxy Note III"));
        motorolas.add(new Celulares("Samsung Galaxy Grand Prime"));
        motorolas.add(new Celulares("Samsung Galaxy A5"));
        return motorolas;
    }
    public static ArrayList<Celulares> getHuawei(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Huawei P10 "));
        motorolas.add(new Celulares("Huawei P10 lite"));
        motorolas.add(new Celulares("Huawei Y320"));
        motorolas.add(new Celulares("Huawei Y330"));
        motorolas.add(new Celulares("Huawei X"));
        motorolas.add(new Celulares("Huawei X pro"));
        motorolas.add(new Celulares("Huawei Mate 9"));
        motorolas.add(new Celulares("Huawei Mate 10"));
        motorolas.add(new Celulares("Huawei Mate 10 pro"));
        motorolas.add(new Celulares("Huawei Y320 plus"));
        return motorolas;
    }
    public static ArrayList<Celulares> getLG(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("LG Risio"));
        motorolas.add(new Celulares("LG Aristo"));
        motorolas.add(new Celulares("LG K20"));
        motorolas.add(new Celulares("LG K10"));
        motorolas.add(new Celulares("LG K4"));
        motorolas.add(new Celulares("LG X cam"));
        motorolas.add(new Celulares("LG G4"));
        motorolas.add(new Celulares("LG G5"));
        motorolas.add(new Celulares("LG G5 SE"));

        return motorolas;
    }
    public static ArrayList<Celulares> getAlcatel(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Alcatel Shine"));
        motorolas.add(new Celulares("Alcatel A3"));
        motorolas.add(new Celulares("Alcatel Pixi 4"));
        motorolas.add(new Celulares("Alcatel A3"));
        motorolas.add(new Celulares("Alcatel Pop 3"));
        motorolas.add(new Celulares("Alcatel U3"));
        motorolas.add(new Celulares("Alcatel 3C"));
        motorolas.add(new Celulares("Alcatel A3 Plus"));
        motorolas.add(new Celulares("Alcatel A7"));

        return motorolas;
    }
    public static ArrayList<Celulares> getNokia(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Nokia 6"));
        motorolas.add(new Celulares("Nokia 5"));
        motorolas.add(new Celulares("Nokia 3"));
        motorolas.add(new Celulares("Nokia 6 (2018)"));
        motorolas.add(new Celulares("Nokia 8"));
        motorolas.add(new Celulares("Nokia 105"));
        motorolas.add(new Celulares("Nokia 105 (2018)"));
        motorolas.add(new Celulares("Nokia 3310"));
        motorolas.add(new Celulares("Nokia 6 (2018)"));

        return motorolas;
    }
    public static ArrayList<Celulares> getBlackBerry(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("BlackBerry 5810 "));
        motorolas.add(new Celulares("BlackBerry Keyone"));
        motorolas.add(new Celulares("BlackBerry Motion"));
        motorolas.add(new Celulares("BlackBerry Priv"));
        motorolas.add(new Celulares("BlackBerry Z10"));
        motorolas.add(new Celulares("BlackBerry DTEK60"));
        motorolas.add(new Celulares("BlackBerry Q10"));
        motorolas.add(new Celulares("BlackBerry 9620"));
        motorolas.add(new Celulares("BlackBerry 123"));

        return motorolas;
    }
    public static ArrayList<Celulares> getSony(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Sony Xperia XA"));
        motorolas.add(new Celulares("Sony Xperia XA Ultra"));
        motorolas.add(new Celulares("Sony Xperia XA1 Ultra"));
        motorolas.add(new Celulares("Sony Xperia L1"));
        motorolas.add(new Celulares("Sony Xperia C5 Ultra"));
        motorolas.add(new Celulares("Sony Xperia XA1"));
        motorolas.add(new Celulares("Sony Xperia XZ Premium"));
        motorolas.add(new Celulares("Sony Xperia M4 Aqua "));
        motorolas.add(new Celulares("Sony Xperia XA2"));
        motorolas.add(new Celulares("Sony Xperia XZ1"));
        motorolas.add(new Celulares("Sony Xperia XZ1 Compact"));
        motorolas.add(new Celulares("Sony Xperia XA2 Ultra"));

        return motorolas;
    }
    public static ArrayList<Celulares> getHTC(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("HTC Desire 626s"));
        motorolas.add(new Celulares("HTC Desire 10"));
        motorolas.add(new Celulares("HTC Desire 530"));
        motorolas.add(new Celulares("HTC One A9"));
        motorolas.add(new Celulares("HTC Desire 650"));
        motorolas.add(new Celulares("HTC One M9"));
        motorolas.add(new Celulares("HTC Desire 625"));
        motorolas.add(new Celulares("HTC One M9"));
        motorolas.add(new Celulares("HTC Desire 625"));
        motorolas.add(new Celulares("HTC Desire 10"));


        return motorolas;
    }
    public static ArrayList<Celulares> getIphone(){
        ArrayList<Celulares> motorolas = new ArrayList<>();
        motorolas.add(new Celulares("Iphone 5"));
        motorolas.add(new Celulares("Iphone 5s"));
        motorolas.add(new Celulares("Iphone 6"));
        motorolas.add(new Celulares("Iphone 6s"));
        motorolas.add(new Celulares("Iphone 7"));
        motorolas.add(new Celulares("Iphone 7s"));
        motorolas.add(new Celulares("Iphone 7s Plus"));
        motorolas.add(new Celulares("Iphone 8"));
        motorolas.add(new Celulares("Iphone X"));

        return motorolas;
    }

}
