import Entities.Game;
import Entities.Gamer;
import Entities.Campaign;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.GameManager;
import Adapters.eDevletServiceAdapter;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Gamer gamer1=new Gamer(1,"Hamza","Bay",LocalDate.of(2001,01,15),"12345678910");
        Gamer gamer2=new Gamer(2,"Firdevs","İNAL",LocalDate.of(2004,11,9),"12345678910");
        Game game1=new Game(1,"WİTCHER3",190);
        Game game2=new Game(2,"CSGO",35);
        Game game3=new Game(3,"NBA",80);
        Campaign campaign=new Campaign(1,"Süper Oyuncuya Özel Kampanya",20,LocalDate.of(2021,01,01),LocalDate.of(2021,02,02));


        GamerManager gamerManager=new GamerManager();
        gamerManager.add(gamer2);

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.update(campaign);

        GameManager gameManager=new GameManager();
        gameManager.delete(game3);
    }
}
