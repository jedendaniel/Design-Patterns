package com.java.design.patterns;

import com.java.design.patterns.adapter.EnemyAdapter;
import com.java.design.patterns.bridge.GreenGoblin;
import com.java.design.patterns.builder.GunMarket;
import com.java.design.patterns.chainofresponsibility.AbstractLogger;
import com.java.design.patterns.chainofresponsibility.ConsoleLogger;
import com.java.design.patterns.character.Character;
import com.java.design.patterns.command.Command;
import com.java.design.patterns.command.MoveCharacter;
import com.java.design.patterns.command.UpgradeCharacter;
import com.java.design.patterns.composite.EnemyGroup;
import com.java.design.patterns.decorator.BlackSpiderman;
import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Spiderman;
import com.java.design.patterns.enemy.Superman;
import com.java.design.patterns.facade.BleatMaker;
import com.java.design.patterns.factory.EnemyFactory;
import com.java.design.patterns.factory.EnemyType;
import com.java.design.patterns.factory.SpidermanFactory;
import com.java.design.patterns.factory.SupermanFactory;
import com.java.design.patterns.builder.FrogLauncherBuilder;
import com.java.design.patterns.flyweight.ColorsSuperSheepFactory;
import com.java.design.patterns.gun.Gun;
import com.java.design.patterns.builder.LaserBlasterBuilder;
import com.java.design.patterns.mediator.ChatImpl;
import com.java.design.patterns.mediator.User;
import com.java.design.patterns.memento.CharacterSavesManager;
import com.java.design.patterns.prototype.SheepCache;
import com.java.design.patterns.proxy.ProxySuperman;
import com.java.design.patterns.sheep.BlackSheep;
import com.java.design.patterns.sheep.Sheep;
import com.java.design.patterns.singleton.IronMan;
import com.java.design.patterns.templatemethod.FighterGame;
import com.java.design.patterns.templatemethod.RacingGame;
import com.sun.javafx.geom.Vec2f;

public class Main {
    public static void main(String[] args) {

        testAbstractFactory();
        testFactoryMethod();
        testBuilder();
        testPrototype();
        testSingleton();

        testAdapter();
        testDecorator();
        testFacade();
        testComposite();
        testBridge();
        testProxy();
        testFlyweight();

        testChainOfResponsibility();
        testCommand();
        testMediator();
        testMemento();
        testTemplateMethod();
    }

    private static void testAbstractFactory(){
        System.out.println("Abstract factory:");
        Enemy superman = EnemyFactory.getEnemy(new SupermanFactory());
        superman.move();
        superman.attack();
        Enemy spiderman = EnemyFactory.getEnemy(new SpidermanFactory());
        spiderman.move();
        spiderman.attack();
        System.out.println("-----------------------------\n");
    }

    private static void testFactoryMethod(){
        System.out.println("Factory method:");
        for(EnemyType enemyType : EnemyType.values()){
            Enemy e = EnemyFactory.getEnemy(enemyType);
            e.attack();
            e.move();
        }
        System.out.println("-----------------------------\n");
    }

    private static void testBuilder(){
        System.out.println("Builder:");
        GunMarket gunMarket = new GunMarket();
        FrogLauncherBuilder frogLauncherBuilder = new FrogLauncherBuilder();
        LaserBlasterBuilder laserBlasterBuilder = new LaserBlasterBuilder();
        gunMarket.setGunBuilder(frogLauncherBuilder);
        gunMarket.constructGun();
        Gun frogLauncher = gunMarket.getGun();
        System.out.println(frogLauncher.getAmmunition());
        System.out.println(frogLauncher.getScope());
        gunMarket.setGunBuilder(laserBlasterBuilder);
        gunMarket.constructGun();
        Gun laserBlaster = gunMarket.getGun();
        System.out.println(laserBlaster.getAmmunition());
        System.out.println(laserBlaster.getScope());
        System.out.println("-----------------------------\n");
    }

    private static void testPrototype(){
        System.out.println("Prototype:");
        SheepCache.loadCache();
        Sheep blackSheepClone = SheepCache.getSheep("1");
        System.out.println(blackSheepClone.getClass().getName() + " clone:\n"
                +  blackSheepClone.getDescription() + " and it says: ");
        blackSheepClone.bleat();
        Sheep superSheepClone = SheepCache.getSheep("2");
        System.out.println(superSheepClone.getClass().getName() + " clone:\n"
                +  superSheepClone.getDescription() + " and it says: ");
        superSheepClone.bleat();
        System.out.println("-----------------------------\n");
    }

    private static void testSingleton(){
        System.out.println("Singleton:");
        IronMan ironMan = IronMan.getInstance();
        ironMan.SayName();
        IronMan.getInstance().setName("Tony Stark");
        ironMan.SayName();
        ironMan.setName("Robert Downey Jr.");
        IronMan.getInstance().SayName();
        System.out.println("-----------------------------\n");
    }

    private static void testAdapter(){
        System.out.println("Adapter:");
        EnemyAdapter enemyAdapter = new EnemyAdapter(new BlackSheep());
        enemyAdapter.move();
        enemyAdapter.attack();
        System.out.println("-----------------------------\n");
    }

    private static void testDecorator(){
        System.out.println("Decorator:");
        BlackSpiderman blackSpiderman = new BlackSpiderman(new Spiderman());
        blackSpiderman.move();
        blackSpiderman.attack();
        System.out.println("-----------------------------\n");
    }

    private static void testFacade(){
        System.out.println("Facade:");
        BleatMaker bleatMaker = new BleatMaker();
        bleatMaker.MakeBlackSheepBleat();
        bleatMaker.MakeSuperSheepBleat();
        System.out.println("-----------------------------\n");
    }

    private static void testComposite(){
        System.out.println("Composite:");
        EnemyGroup allEnemies = new EnemyGroup("All enemies");
        EnemyGroup avengers = new EnemyGroup("Avengers");
        EnemyGroup justiceLeague = new EnemyGroup("Justice league");
        allEnemies.add(avengers);
        allEnemies.add(justiceLeague);
        allEnemies.add(new Spiderman());
        avengers.add(IronMan.getInstance());
        justiceLeague.add(new Superman());
        System.out.println(allEnemies.getInfo(0));
        System.out.println("-----------------------------\n");
    }

    private static void testBridge(){
        System.out.println("Bridge:");
        Spiderman spiderman = new Spiderman();
        spiderman.setNemesis(new GreenGoblin());
        spiderman.defeatNemesis();
        System.out.println("-----------------------------\n");
    }

    private static void testProxy(){
        System.out.println("Proxy:");
        ProxySuperman proxySuperman = new ProxySuperman("Christopher Reeve");
        proxySuperman.move();
        System.out.println("-----------------------------\n");
    }

    private static void testFlyweight(){
        System.out.println("Flyweight:");
        ColorsSuperSheepFactory.getSuperSheep("Red").draw();
        ColorsSuperSheepFactory.getSuperSheep("Red").draw();
        System.out.println("-----------------------------\n");
    }

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ConsoleLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(consoleLogger);

        return consoleLogger;
    }

    private static void testChainOfResponsibility(){
        System.out.println("Chain of responsibility:");
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.ERROR,"Error message");
        loggerChain.logMessage(AbstractLogger.INFO, "Info message");
        System.out.println("-----------------------------\n");
    }

    private static void testCommand(){
        System.out.println("Command:");
        Character myCharacter = new Character("Daniel");
        Command moveCharacter = new MoveCharacter(myCharacter, new Vec2f(1f,2f));
        moveCharacter.execute();
        Command upgradeCharacter = new UpgradeCharacter(myCharacter);
        upgradeCharacter.execute();
        System.out.println("-----------------------------\n");
    }

    private static void testMediator(){
        System.out.println("Mediator:");
        ChatImpl inGameChat = new ChatImpl();
        User Ddd123 = new User("Ddd123");
        inGameChat.register(Ddd123);
        User Rrrricky = new User("Rrrricky");
        inGameChat.register(Rrrricky);
        inGameChat.register(new User("NOKEYBOARD11"));
        Ddd123.sendMessage("Hello chat!");
        System.out.println();
        Rrrricky.sendMessage("Hi Ddd123 :)");
        System.out.println("-----------------------------\n");
    }

    private static void testMemento(){
        System.out.println("Memento:");
        Character myCharacter = new Character("Daniel");
        CharacterSavesManager characterSavesManager = new CharacterSavesManager();
        characterSavesManager.save("start", myCharacter);
        Command moveCharacter = new MoveCharacter(myCharacter, new Vec2f(1f,2f));
        moveCharacter.execute();
        Command upgradeCharacter = new UpgradeCharacter(myCharacter);
        upgradeCharacter.execute();
        characterSavesManager.save("Chapter2", myCharacter);
        moveCharacter = new MoveCharacter(myCharacter, new Vec2f(2f,4f));
        moveCharacter.execute();
        upgradeCharacter.execute();
        characterSavesManager.save("Chapter3", myCharacter);
        System.out.println(myCharacter.getName() + " lvl: " + myCharacter.getLevel());
        myCharacter = characterSavesManager.restore("Chapter2").getCharacterState();
        System.out.println(myCharacter.getName() + " lvl: " + myCharacter.getLevel());
        myCharacter = characterSavesManager.restore("start").getCharacterState();
        System.out.println(myCharacter.getName() + " lvl: " + myCharacter.getLevel());
        System.out.println("-----------------------------\n");
    }

    private static void testTemplateMethod(){
        System.out.println("Template method:");
        FighterGame fighterGame = new FighterGame();
        fighterGame.play();
        RacingGame racingGame = new RacingGame();
        racingGame.play();
        System.out.println("-----------------------------\n");
    }
}
