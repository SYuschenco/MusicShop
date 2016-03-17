package ua.gostart.goit.MusicShop;

import java.util.Objects;

public class Runner {

    public static void main(String[] args) {

//        Guitar guitar = new Guitar("guitar");
//        Trumpet trumpet = new Trumpet("trumpet");
//        Piano piano = new Piano("piano");

        MusicShop musicShop = new MusicShop("THE BEATLES");
       //musicShop.setMusicalInstruments();
       new ShopStock();
       new Order();

    }
}
