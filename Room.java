package com.company;

public class Room {

    public Room(Entity player, String character) {
        this.room(player, character);
        this.room1(player, character);
        this.room2(player, character);
        this.room3(player, character);


    }

    public void room(Entity player , String character) {
        Enemy enemy;

        System.out.println("Dobrá paladine na tvých bedrech leží osud obyvatel Kalimdoru. Povedeš naši nejsilnější legii v čele s velitelem armády Lotharem. \nPoslouchej jeho rozkazy, nepochybuji, že v čele s vámi dokážeme bitvu obrátit.");
        System.out.println();
        System.out.println("Lothar: Jako prnví musíme ubránit vesnici v Duskwoodu, podle našich zvědů se k ní orkové rychle blíží a my ji musíme ubránit, je to klíčový bod před Ewelyn Forest. \nBudeme bojovat do posledních sil, tuto bitvu musíme obrátit, v sázce jsou naše životy");
        System.out.println();

        Arena arena = new Arena("Duskwoodská vesnice");
        System.out.println();
        System.out.println("Lothar: Dorazili jsme včas, připravte se na boj:\n'orkská družina útočí'");
        System.out.println();


        enemy = new Enemy("Gilaktug", "meele", 100, 50, 60, 5);
        arena.fight(player, enemy);

        System.out.println("Zaútočil na tebe další ork");
        System.out.println();

        Arena arena2 = new Arena("");
        System.out.println();

        enemy = new Enemy("Sugigoth", "meele", 100, 50, 60, 5);
        arena2.fight(player, enemy);

        System.out.println("Další ork útočí");
        System.out.println();

        Arena arena3 = new Arena("");
        System.out.println();

        enemy = new Enemy("Sharn", "meele", 100, 50, 60, 5);
        arena3.fight(player, enemy);

    }

    public void room1(Entity player, String character) {
        Enemy enemy;

        System.out.println("Lothar: Výborně " + player.getName() + " zde jsme vyhráli, ale není čas čekat, musíme pokračovat dál. Nepřítele musíme zahnat zpět k portálu.\nDoplňte síly a pokrařujeme");
        player.setHp(player.getHp() + 100);
        System.out.println();
        System.out.println("Lothar: zpět na nohy vojáci, musím pokračovat, potáhneme severně na Redrige Mountains, vesince v těchto horách jsou pro nše království důležité z hlediska zásobování.\nPojďme se vydat na cestu, povedu vás!!");
        System.out.println();
        System.out.println("Po příchodu legie v Redrige mountain se strlha velká bitva");

        Arena arena = new Arena("Vesnice v Redrige Mountain");
        System.out.println();
        System.out.println("Lothar: Útók bojujte za naše království a pošlete ty obludy tam od kud přišli\n\n'strhává se boj'");

        enemy = new Enemy("Olaugh", "meele", 100, 50, 60, 5);
        arena.fight(player, enemy);

        System.out.println("Probijíš se k dalšímu orkovi");
        System.out.println();

        Arena arena2 = new Arena("");

        enemy = new Enemy("Shagar", "ranget", 100, 50, 60, 5);
        arena2.fight(player, enemy);

        System.out.println("V cestě ti stojí další ork");
        System.out.println();

        Arena arena3 = new Arena("");

        enemy = new Enemy("Shagar", "meele", 100, 50, 60, 5);
        arena3.fight(player, enemy);

        System.out.println("Už zbývá jen pár orků a bitva je naše");
        System.out.println();
        System.out.println("Vrháš se na dalšího nepřítele a do cesty se ti postavil generál Nazgrim");
        System.out.println();

        Arena arena4 = new Arena("");

        enemy = new Enemy("Nadrd", "meele", 100, 50, 60, 5);
        arena4.fight(player, enemy);

        System.out.println("Lothar: Vítězství! Vítězství!");

    }

    public void room2(Entity player, String character) {
        Enemy enemy;

        System.out.println("Nacházíš se jeden krok před oblastí orkského portálu, poslední souboj bitva a pokud ji vyhrajeme, utkáme se v posledním boji");
        System.out.println();
        System.out.println("Lothar: Pořádně se připravte čeká nás další bitva. Čekat bohužel nemůžeme, král na nás spoléhá.\nVyužijte zdejšá kovárnu a připravte se, za hodinu vyrážíme");
        System.out.println();

        player.setHp(player.getHp() + 100);
        player.setHp(player.getDmg() + 30);
        player.setHp(player.getArmor() + 60);
        System.out.println("Bonus: naostření zbraně a výztuha brnění");
        System.out.println();

        Arena arena = new Arena("Sorrowské bažiny");

        System.out.println("Lothar: Orkové si v bažinách postavili základnu, čekají nás, takže se dá předpokládat, že budou připraveni, bijte se jako lvi bez slitování");
        player.setHp(player.getDmg() + 30);
        System.out.println();
        System.out.println("Útočíte na orkské jednotky, které jsou silnější než doposavaď");
        System.out.println();

        enemy = new Enemy("bagatarius", "Humpty", 100, 50, 60, 5);
        arena.fight(player, enemy);

        System.out.println("Vrháš se nadalšího orka");

        Arena arena2 = new Arena("");

        enemy = new Enemy("Shradar", "soaker", 100, 50, 60, 5);
        arena2.fight(player, enemy);

        System.out.println("Pouštíš se do dalšího obra");

        Arena arena3 = new Arena("");

        enemy = new Enemy("Beebep", "profesor", 100, 50, 60, 5);
        arena3.fight(player, enemy);

        System.out.println("Další ork stojí před tebou");

        Arena arena4 = new Arena("");

        enemy = new Enemy("Kaspy", "DreamPlayer", 100, 50, 60, 5);
        arena4.fight(player, enemy);

        System.out.println("Zabili jste všechny orky do posledního");
        System.out.println();
        System.out.println("Lothar: Vítězství je naše pánové, ale nepředbíhejme, máme před sebou poslední bitvu");
        System.out.println();

        }

    public void room3(Entity player, String character) {
        Enemy enemy;

        System.out.println("Lothar: Před námi sotjí černý portál, zde je zbytek orků z jihu se k nám připojí další legie v čele s Dunkanem Idahoem a Garley Halekem. Bude to ohromná bitva nevzdávejte se\na pokud dnes zvítězíme, válka bude ukončena.");
        System.out.println();

        Arena arena = new Arena("Blasted Lands");

        System.out.println("Stavíš se před vůdce orků Blachanda");
        System.out.println();

        enemy = new Enemy("Blackhand", "meele", 100, 50, 60, 5);
        arena.fight(player, enemy);

        System.out.println("Gratuluji, podařilo se ti dohrád Warcraft Game, jelikož mě tato práce bavila, budu na ní stále pokračovat, takže si ji budeš moci zahrát znovu a v lepší verzi.");
        }
    }

