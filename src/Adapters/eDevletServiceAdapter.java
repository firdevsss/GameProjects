package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class eDevletServiceAdapter implements GamerCheckService {
    @Override
    public boolean CheckIfRealPerson(Gamer gamer) {
        System.out.println("Sistemde kayıtlı.");
        return true;
    }
}
