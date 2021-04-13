package hw27;

import hw27.Implementation.First;
import hw27.Implementation.Second;
import hw27.Interfaces.AInterface;
import hw27.Interfaces.BInterface;
import hw27.Interfaces.CInterface;
import hw27.Interfaces.DInterface;
import hw27.helper.Helper;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        first.eat(2);
        first.dream("some behaviour");
        first.simple(4, 5);
        AInterface.print("Ainterface static ");
        BInterface.print("BInterface static");
        CInterface.print("CIterface static");
        DInterface.print(48);
        second.dream("unreachable");
        second.eat(50);
        second.simple(45,77);
        Optional <Object> empty =Optional.empty();

        Helper helper = new Helper();
        System.out.println("Valid email : "+helper.checkString("email@gmail.com"));
        System.out.println("InValid email : "+helper.checkString("emailgmail.com"));
        System.out.println("Empty email : "+helper.checkString(""));
        System.out.println("Null value : "+helper.checkString(null));

    }
}
