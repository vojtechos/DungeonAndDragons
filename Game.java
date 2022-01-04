package com.company;

import java.util.Scanner;

public class Game {

    Entity Paladin;
    Entity Warrior;
    Entity Mage;
    Entity Hunter;

    private static Scanner sc;
    public static String jk;

    public static String nick() {
        System.out.println(" __      __                                    _____  __      ________                       \n" +
                "/  \\    /  \\_____ _______   ________________ _/ ____\\/  |_   /  _____/_____    _____   ____  \n" +
                "\\   \\/\\/   /\\__  \\\\_  __ \\_/ ___\\_  __ \\__  \\\\   __\\\\   __\\ /   \\  ___\\__  \\  /     \\_/ __ \\ \n" +
                " \\        /  / __ \\|  | \\/\\  \\___|  | \\// __ \\|  |   |  |   \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/ \n" +
                "  \\__/\\  /  (____  /__|    \\___  >__|  (____  /__|   |__|    \\______  (____  /__|_|  /\\___  >\n" +
                "       \\/        \\/            \\/           \\/                      \\/     \\/      \\/     \\/ ");

        System.out.println();
        System.out.println("Vítej na Azerothu válečníku, jsem Khatgar a provedu tě příběhem Azretohu");
        System.out.println();
        System.out.println("Azeroth čelí útoku orků, kteří jsem přišli černou bránou z jiného světa, nevíme kdo, nebo co je sem vpustilo, ale za dobrým účelem to jistě nebylo. \nOrkové začali plenit naše vesnice a berou si lidi jako zajatce, královým legiím se je nedaří zastavit, lidé s takovou situací potkávají poprvé. \nV boji s orky nemáme zkušenosti, bijí se jako zvěř. Naše legie se je snaží alespoň zpomalit, snažíme se odhalit důvod, co zde orkové chtějí. \n");
        System.out.println();
        System.out.println("Začni tím, že si Vybereš jméno -->");

        String jk = sc.nextLine();
        return jk;
    }

    public Game() {
        this.Paladin = new Player(jk,  "meele", 2000, 90, 150, 15);
        this.Warrior = new Player(jk, "meele", 1800, 60, 140, 20);
        this.Mage = new Player(jk, "ranget", 1200, 100, 80, 35);
        this.Hunter = new Player(jk, "ranget", 1500, 70, 110, 25);

        this.Paladin();
        this.Warrior();
        this.Mage();
        this.Hunter();

        System.out.println("Abychom jsme se mohli vrhnout na to musíš si vybrat postavu : ");
        this.game();


    }

    public void Paladin() {
        System.out.println("Paladin je hybridní třída se schopností hrát všechny tři hlavní role, včetně léčení, tankování a DPS.\nMají aury, požehnání a pečetě, které poskytují užitečné buffy pro ostatní hráče, zatímco nosí plátové brnění, aby výrazně zmírnily poškození a silné obranné schopnosti.\nPaladinové jsou považováni za svaté rytíře nebo v případě krvavých elfů za krvavé rytíře. Taurenští paladinové si říkají Sunwalkers, aby zdůraznili svůj vztah ke slunci, konkrétně An'she.");
        System.out.println();
        System.out.println("PALADIN (1)                                                          \n" +
                "                             ......................                             \n" +
                "                       ....... .(%&%%%#%%##%&&#....,,.,,.                       \n" +
                "                    .... #@&&&&&%(//(((((///////((((##,,,,**.                   \n" +
                "                .... @@@&&&&&%%(/////*,,***...,,*,,,****/#*****,                \n" +
                "             .....@@&&&&&&&&%%(//////* %/  ...,.....    .,,,*/**//              \n" +
                "           ....@@@&&&&&&&&&&#(//////.,//(. .. ...,,,..,.., *,//#////            \n" +
                "         ....@@&&&&&&&&&&&%(//////,.%//((,.,.. .  *,,.,,///. .///((///          \n" +
                "        ...(@@&&&&&&&&&&%%((///(/..#(////(.,,.,,,. (,,/ ,...*.**/((%((#(        \n" +
                "      ....@@&&&&&&&&&&&%#((((((/*.%/////(%,, /..,/*#%%#,(,.,...///((####(       \n" +
                "     ....@@&&&&&&&&&&%#/((((#(///*(//////(*..,,%/&%//*,/&#(,./.,*/(((#####      \n" +
                "     ,..@@&&&&&&&&@%%(((((##(((//*,#///*#&#,,,,%*%#*,/#%#&(#., ,//((((#####     \n" +
                "    ...%@&&&&&&&&&%#(((((##((((///.%//*#//#..,.*%,(#(((#%%*/, . ,//((#%&###.    \n" +
                "   .,,,@@&&&&&&@%%((((######((///*./(/*((/(**,,..#%,.....(*.,.* *//#%&%#%###    \n" +
                "   ,,.*@&&&&&@&%#(((#####((((////,,(#%/////%.,,...(...,#,,*(,, ,.,///((#%###    \n" +
                "   ,,,/@&&&&&%%(((%%&%#(#((((/*.#((%#(/////#.,,.#/*.,,.,.*/..,.,.*((##%%%###    \n" +
                "   *//*@&&&%%(((##%%####((///.(##/%%#%(//(((/*..../.*,,,. .,... ,,*//(%&&###    \n" +
                "   .***@&%%#((####(((((///,#/####%%%#((/////#....../..... ..*.  ,*/(((#&%##(    \n" +
                "    **/#&###%#####(#(/...*%#((&%(%%## #(((#/#%#############(###(,,*((((&###     \n" +
                "    .*//&#%#@%%####(/,(#*(((%#%%#%.,, //((#(###########((##%   ..,//#%&###(     \n" +
                "     ,(//@@#%%#(#(/*#//&##%(#%#.,*///,.##%#%#####%%#%%%%. ..,,,.,//((#####      \n" +
                "      ,/((@%%#(/*##,&##(,/(/(.,///((.*/****............,,**,,,,*//((%####       \n" +
                "        ((((%*(#,%&(/&%%%.*,*//##/////(//////,,,,,,*/**,*////////(#%###,        \n" +
                "         /###%%%/%%%%%%.,//(##//((##(((/(((((((////(((///*,*/((((%####          \n" +
                "           #####%((.*///(%%(((####%@&&%#((((/(#%##((((//////(((%####            \n" +
                "             (####&####%#(#%%%&&&&&&&%#(((#####%%%%###(((((#%#####              \n" +
                "                #####%&%%%&&&&&&&&%#(##%##%%%%&&&&%%###%%%#####                 \n" +
                "                   (######@@@&&%%#%%%%%%&&&&&&&&&%%&&#######                    \n" +
                "                       /%#########%&@@@@@@@&%%#########(                        \n" +
                "                              /#%#############%#/.                              ");


        System.out.println("role: " + this.Paladin.getRole() + "\nhp: " + this.Paladin.getHp() + "\ndmg: " + this.Paladin.getDmg() + "\narmor: " + this.Paladin.getArmor() + "\ncrit chance:" + this.Paladin.getCritChance() + "%");
        System.out.println();
    }

    public void Warrior() {
        System.out.println("Válečníci jsou bojovníci na blízko, vysoce trénovaní v umění zbrojení. Boj na blízko je nejsilnější dovedností válečníka.\nNa bojišti jsou silní a rychlí. V závislosti na své specializaci může válečník často způsobit velmi vysoké poškození nebo je těžké ho zabít.\nSchopnosti válečníka závisí na generování hněvu.");
        System.out.println();
        System.out.println("WARRIOR (2)                                                          \n" +
                "                              ....,.,,,,,,,,,,,,,,.                             \n" +
                "                        .......,(@@@@@@@@@&&&&&%(*******.                       \n" +
                "                    .....,&@@@@@@@@@@@@&&%%%%####(*/#&#/*///.                   \n" +
                "                 .....@@@@@@@@@@@@@@@&&%%%%#####/,..   (%%%//(*,                \n" +
                "               ....@@@@@@@@@@@@@@@@@@&&%%%####(/*,.. *#....*%#((((              \n" +
                "             ,,.,@@@@@@@@@@@@@@@@@@@&&%%#####*//*,..((.......%%&((#(            \n" +
                "           ,,.,@@@@@@@@@@@@@@@@@&@@&&%%####(******/# ,,...,###%%%&(##*          \n" +
                "          ,,,%@@@@@@@@@@@@@@@@@&&&&%%%####,,,,**/#***,..,*####%%%&&%%%%         \n" +
                "         ,,,@@@@@@@@@@@@@@@@@@@&&%%%####/,,,,,*((*//*,,.%###%%%%&&&@%%%%        \n" +
                "        ,,*@@@@@@@@@@@@@@@@&&&&%%%%##(#,,,,,,/#.////**/#####%%%&&@@@@&%%%       \n" +
                "       ,,*%@@@@@@@@@@@@&&&&&&%%%###((/,,,,,,((.,*//*,#####%%%%&&&@@@@@%%%/      \n" +
                "      .***@&%&&&&&&&&&&&%%%%%###(((#,,,,,,/# ..,,//(####%%&&&&&@@@@@@@@%%%      \n" +
                "      *,,#&%**,%%%%%%%%%%%%###(((#,/****/(.....,,,######%&&&&@@@@@@@@@@%%%*     \n" +
                "      /*/%%#**,*/###########((((*(//**//( .....,(#####%%%&&&@@@@@@@@@@@%%%*     \n" +
                "      /((#&%%/,,,*.###(((((((#*((((/(/#.,    .*####%%%&&&&@@@@@@@@@@@@@%%%,     \n" +
                "      .///&%%##/.,,*.(((((((/((((((/#(..    .*#####%%%&&@@@@@@@@@@@@@@@%%%      \n" +
                "       /(/&%%%#(%(.,,,*.*(,,*,.*#(,*#.,..  ,*##(###%%&&@@@@@@@@@@@@@@@%%%*      \n" +
                "        (((@%%%%#(%(*.,,,*,*,*%&&/.,/,,,..,*#(#####%%&&@@@@@@@@@@@@@@&%%%       \n" +
                "         ((#&%%%##(((%/*.,*//(#%%*&,#.,*,.*#######%%&&&&@@@@@@@@@@@@&%%%        \n" +
                "          %#(&%%###(((&&&(//*(##%/&..#.***/#####%%%&&@@@@@@@@@@@@@@%%%&         \n" +
                "           (%#%&###((&&%(#%(**%%/.***/.,%*(####%%%%%%&@@@@@@@@@@@@%%%*          \n" +
                "             %%%%&#%&%(%%%///#%&&#(,,,,,***..*####%%%&&&@@@@@@@@%%%#            \n" +
                "               %%%%&&%&(.*#%%%&%&&@%(%#(/.,,,,*//*...,*%&@@@@&%%%%              \n" +
                "                 (%%%%&(&%%((##%&&#########%%%(/,....*%&@@&%%%%,                \n" +
                "                    (%%%%%&@&&&&&##%%%#####%%%%%%%%%&@&%%%%%                    \n" +
                "                        (%%%%%%%%&&&&&%%%%%&&&&&&%%%%%%%.                       \n" +
                "                              /%%%%%%%%%%%%%%%%%%%,                             \n");


        System.out.println("role: " + this.Warrior.getRole() + "\nhp: " + this.Warrior.getHp() + "\ndmg: " + this.Warrior.getDmg() + "\narmor: " + this.Warrior.getArmor() + "\ncrit chance:" + this.Warrior.getCritChance() + "%");
        System.out.println();
    }

    public void Mage() {
        System.out.println("Mág je sesilatel DPS, který se specializuje na poškození výbuchem a oblast působení kouzel.\nJejich primární rolí ve skupině je udělování poškození a kontrola davu pomocí [Polymorph]. Na konci hry je poškození mága doplněno kouzly jako Counterspell a Spellsteal.\nMage utility kouzla také zahrnují kouzlení jídla a pití a schopnost teleportovat se do velkých měst a otevírat portály pro členy party.\nv PvP kouzelníci udělují poškození na dálku, zatímco používají efekty snare a Polymorph k ovládání nepřátelských hráčů.");
        System.out.println();
        System.out.println("MAGE (3)                                                             \n" +
                "                             ....................                               \n" +
                "                       ........ ,#@@@@@@@@@@@@#,....,.,,.                       \n" +
                "                   ..... @@@@@@@%%%&&&&&@&&@&&%&&&@@&#,,,,,*.                   \n" +
                "                .... @@@@@&&&&@@&%&#/%#&%&&&@&%#%#(%%%(%%&*****,                \n" +
                "             .....@@&%@&&&&%((%%&&&%#/*##/*#%%%%%#//#(*/(#%%%/***/.             \n" +
                "           ....%@@@&&&&&&&&&&%#/#%%%%%(/,../(##(*,/(/,.,//***,,#//(/*           \n" +
                "         ....@@&&&&&&&##%##%%#(**(#/#%#/*,*,,,****,,,,(,,###%**#(#((//          \n" +
                "        .../@@@@&&&&&&&%%#/*//(###//((((/,*,,((((((*.#(#(###**//(%%&((#(        \n" +
                "      ....@@&&@&%&%%&%%%%%/,,,*(#/***,,/*/((.(((./#####((%#(*,(##%%#@####       \n" +
                "     ....@&&&&&&&&%(%%%%(/*,...,**,* ,,*/((/. %%%%%#%#((%%#*****/(#%%@%###      \n" +
                "    .,..@&&&&&&%##%#######/,,,.. .,*,%,//// ###.(#%##(%%%#/,,//#%%%&&%&####     \n" +
                "    ...(@&&&&&&%#///#%%((###*/ ...,%.////.####&###(/#%&%%#*/*(##%%###%%@###.    \n" +
                "   .,,,@&&&&&&&&%#(/(#(/(((//.,.,&.,***,### .%####&##%%%%*(.*/((//%%@&%&%###    \n" +
                "   ,,.*@&&&&%##%%%%%%%#(/*,,., .#.,.,/* . //&##%%%%%((,(,.,,,*/(#%%&%%&@%###    \n" +
                "   ,,,*@&&%%%%#((#(((/(#(/,/....//, .., (//%#&%%%%(*,#*.,**/###%%%%%%&&&&###    \n" +
                "   */**&&%%%%%#%%#/*,.,*,,,* ....&. ..(//%%%%%%%(,%#//,*/((((#%%%%%&&%%@&###    \n" +
                "   .***@%%%%%%#%###(//,. ...,......(%%#%&%%%%#,,##((/,,**/#%%%%%%%%%%%@@####    \n" +
                "    ***#&%%%%%%#(//**,,.... (...,%&%&&&&&&&%##(((((/**(##%%%##%%%%%%&&&@###     \n" +
                "    .*/*@&%%%%%%((*,..*.*.,*/.((*//////(((//%((///#.*//(///#%%%%%%&&&&@###/     \n" +
                "     *(*/@&%###(*//,,,%(/,,,,%%%%%%#(/(((((#%(.,**,,((((###%%%%%%%%%&@####      \n" +
                "      ,/((@%(*//, (,,/((%,,((#(/((/((/*(,*/**,/######%%%%%%%%%%%%&&&@####       \n" +
                "        ((((%*,.,,**,(**/,////(//((///*,.,/#######%%%%%%%%%%%%%%&&@&###,        \n" +
                "         /####&&&%,,.((*@##/&&&((#,,/((/**(//(#%%%%%%%%%%%&&&&&&&@###%          \n" +
                "           ####%@(*,,%@&&&//%#%,*,*****(%###(((((##%%&&&&&&&&&@&####            \n" +
                "             (####%(##(#(&%#*,**/(#%%((%%%&&&&&&%&&%%&&&&&&@@####%              \n" +
                "                %####%@@@@.,**/(#%%%%%%%%%%&&&&&&&&&&&&@@&#####.                \n" +
                "                   (######&&%((//#(#%%%%%&&&&&&&@@@@@%######                    \n" +
                "                       ,%#########%&@@@@@@@@&%#########(                        \n" +
                "                             .(%###############%(,                              ");


        System.out.println("role: " + this.Mage.getRole() + "\nhp: " + this.Mage.getHp() + "\ndmg: " + this.Mage.getDmg() + "\narmor: " + this.Mage.getArmor() + "\ncrit chance: " + this.Mage.getCritChance() + "%");
        System.out.println();
    }

    public void Hunter() {
        System.out.println("Lovci táhnou a používají přesměrování hrozeb, kontrolu davu a především poškození na dálku. Někteří lovci mají domácí mazlíčky, které přidávají k jejich DPS,\ncož také umožňuje speciální kouzla, jako je Rebirth a Heroism, a pomáhá zvládat aggro. Mohou také sledovat, ochočit a trénovat zvířata a šelmy nalezené ve volné přírodě.\nDobře vycvičený mazlíček v nesčetných případech zachránil lovci život. Jsou jedinou třídou, která dokáže pojmenovat, nakrmit a „vycvičit“ své mazlíčky,\naby měli jednu ze tří specializací: Ferocity pro burst DPS, Cunning pro užitečnost a Tenacity pro tankování. Tuto specializaci lze změnit kdykoli,\nkdyž nejste v boji nebo mrtví. Lovci vynikají ve schopnostech přežití venku, jako je sledování a kladení pastí. Nosí poštovní zbroj. Nejsou schopni používat štíty nebo plátové brnění.\nBeast Master a Marksmanship hunters začínají se zbraní, kuší nebo lukem, v závislosti na jejich rase. Mohou používat všechny ostatní zbraně kromě hůlek, palcátů a obouručních palcátů.\nLovci přežití konkrétně používají zbraně na blízko a začínají s tyčí Lovci používají mnoho schopností, které buď způsobují poškození, nebo aplikují efekt stavu, jehož použití stojí zaměření.\nJídlo a pití nedoplňuje soustředění; místo toho je jediným zdrojem používání určitých schopností nebo jejich přirozené doplňování v průběhu času. Většinu ostatních schopností lze použít zdarma,\njako je Mend Pet nebo jejich schopnosti Trap (pouze pro přežití). Mohou si osvojit různé zvířecí aspekty, které poskytují speciální schopnosti, jako je vylepšená rychlost běhu nebo\n dodatečná síla útoku na dálku.");
        System.out.println();
        System.out.println("HUNTER (4)                                                           \n" +
                "                              .,,,,,*,,***/**//**/.                             \n" +
                "                        .,,,,,,,/&@@@@@@@@@@@@@%////(/((,                       \n" +
                "                    .,,,,.&@@@@@@@@@@@@@@@@@@@@@@@@@@@#((###*                   \n" +
                "                 .,,,,&@@@@@@@@@@%%##%%%%%%%%%&&@@@@@@@@@@%##%#,                \n" +
                "               ,,,,@@@@@@@@/*(/(((/(*///%&&&&&&&&&&&&&&&&@@@@%%%%%              \n" +
                "             *,,,@@@@@@@,.,,,,,,*.*%&&&&&&@@@@@@@@&%#%&&&&%&&@@@%%%%            \n" +
                "           **,,@@@@@@@,,,*,,,,,,#%%%@@@@@@@@@@@@@@@@@@&&%%%&&&&@@@%%%*          \n" +
                "          ***&@@@@@@(*//*/*,,.%%%&@@@@@@@@@@@@@@@@@@@@@@%&%%%%%&@@@%&&&         \n" +
                "         ***@@@@@@@(////(/**/%%%@@@@@@@@@@@@@@@@@@@@@@@@&###%%%&&&&@&&&&        \n" +
                "        */*@@@@@@@&/(///(//,%%%@@@@@@@@@@@@@@@@@@@@@@@@@@%##%%%%%&%@@&&&&       \n" +
                "       ///%@@@@@@@((((/(((/#%%&@@@@@@@@@@@@@@@@@@@@@@@@@@@(*/&%%%%%&@@&&&/      \n" +
                "      .///@@@@@@@@(((((#((*%%%@@@@@@@@@@@@@@@@@@@@@@@@@@&,**#&&&%%%@@@@&&&      \n" +
                "      (//(@@@@@@@@(##(##((/%%%&@@@@@@@@@@@@@@@@@@@@@@@#.(/&@@@@@@@@@@@@&&&,     \n" +
                "      ####@@@@@@@@(#(####((%%%%@@@@@@@@@@@@@@@@@@@@@@#((&@@@@@@@@@@@@@@&&&*     \n" +
                "      #%%#@@@@@@@@##(#####(#%%%@@@@@@@@@@@@@@@@@@@@&,@@@@@@@@@@@@@@@@@@&&&*     \n" +
                "       ###@@@@@@@@##(######(%%&%@@@@@@@@@@@@@@@@@@,@@@@@@@@@@@@@@@@@@@@&&&      \n" +
                "       #%%&@@@@@@@#########(%&&%@@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@&&&/      \n" +
                "        %%%@@@@@@@(#######%##&&&&@@@@@@@@@@@@@(%@@@@@@@@@@@@@@@@@@@@@&&&&       \n" +
                "         %%%@@@#*,*%%#####%%#%&&#@@@@@@@@@@@#/@@@@@@@@@@@@@@@@@@@@@@@&&&        \n" +
                "          &%%&#**../*,#%%#%%%%&&#@@@@@@@@@&*@@@@@@@@@@@@@@@@@@@@@@@&&&&         \n" +
                "           %&&&%#&**.,*(.#&%%&&%@@@@@@@@@*&@@@@@@@@@@@@@@@@@@@@@@@&&&*          \n" +
                "             &&&&%%#&,/*,*#(%&#@@@@@@@@*%@@@@@@@@@@@@@@@@@@@@@@@&&&%            \n" +
                "               &&&&&%##&(%%##(@@@@@@@*(@@@@@@@@@@@@@@@@@@@@@@&&&&&              \n" +
                "                 #&&&&&&&&&(@@@@@@@#*@@@@@@@@@@@@@@@@@@@@@&&&&&,                \n" +
                "                    (&&&&&@@@@@@@#(#@@@@@@@@@@@@@@@@@@&&&&&&.                   \n" +
                "                        %&&&&&&&&@@@@@@@@@@@@@@@&&&&&&&&*                       \n" +
                "                              (&&&&&&&&&&&&&&&&&&&*                             ");

        System.out.println("role: " + this.Mage.getRole() + "\nhp: " + this.Hunter.getHp() + "\ndmg: " + this.Hunter.getDmg() + "\narmor: " + this.Hunter.getArmor() + "\ncrit chance: " + this.Hunter.getCritChance() + "%");
        System.out.println();
    }

    public void game() {

        System.out.println("(1) Paladin");
        System.out.println("(2) Warrior");
        System.out.println("(3) Mage");
        System.out.println("(4) Hunter");

        String character = sc.nextLine();

        Entity player;

        if(character.equals("1")){
            player = this.Paladin;
            System.out.println("Vybral sis paladina");
            System.out.println();
            new Room(player, character);
        }
        else if(character.equals("2")){
            player = this.Warrior;
            System.out.println("Vybral sis warriora");
            System.out.println();
            new Room(player, character);
        }
        else if(character.equals("3")){
            player = this.Mage;
            System.out.println("Vybral sis mage");
            System.out.println();
            new Room(player, character);
        }
        else if(character.equals("4")){
            player = this.Hunter;
            System.out.println("Vybral sis huntera");
            System.out.println();
            new Room(player, character);
        }
        else{
            this.game();
        }
    }

    static {
        sc = new Scanner(System.in);
        jk = nick();

    }



}






