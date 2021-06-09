package Concrete;

import Abstract.GamerService;
import Entities.Game;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerManager implements GamerService {


    @Override
    public void add(Gamer gamer) {
        if(gamer.getFirstName()=="Firdevs" && gamer.getLastName()=="Gül" && gamer.getDateOfBirth().getYear()==1993 && gamer.getNationalityId()=="1287634") {

            System.out.println("E devlet sistemi ile doğrulama yapıldı ve " + gamer.getFirstName() + " " + gamer.getLastName() + ""+
                    " kullanıcı isimli oyuncu eklendi.");
        }else
        {
            System.out.println("Geçersiz !");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Kullanıcı silindi :" + gamer.getFirstName()+ " "+ gamer.getLastName());
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Kullanıcı güncellendi :" + gamer.getFirstName()+ " "+ gamer.getLastName());
    }
}

