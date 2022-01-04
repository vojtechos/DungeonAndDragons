package com.company;

public class Arena {
    private String name;
    private boolean isRunning = true;

    public Arena(String name) {
        this.name = name;
    }



    public void fight(Entity enemy, Entity player) {

        while(this.isRunning) {
            this.printEntities(enemy, player);
            this.round(enemy, player);

        }
    }

    private void printEntities(Entity player, Entity enemy) {
        IOUtil.printText(player.toString());
        IOUtil.printText(enemy.toString());
        System.out.println();
    }

    private void round(Entity player, Entity enemy) {
        System.out.println("1. Utok");
        System.out.println("2. Obrana");
        System.out.println("3. dodge");
        System.out.print("Zadejte cislo: ");
        System.out.println();

        try {
            int i = Integer.parseInt(IOUtil.getInput());
            double d;
            switch(i) {
                case 1:
                    IOUtil.printText(player.getName() + " zautocil");
                    System.out.println();
                    d = Math.random();
                    if (d < 0.5D) {
                        IOUtil.printText(enemy.getName() + " zautocil");
                        System.out.println();
                        enemy.setHp(Math.floor(enemy.getHp() - player.getDmg()));
                        if (this.isEnemyDead(player, enemy)) {
                            return;
                        }

                        player.setHp(Math.floor(player.getHp() - enemy.getDmg()));
                        if (this.isPlayerDead(player)) {
                            return;
                        }

                        return;
                    }

                    IOUtil.printText(enemy.getName() + " se brani");
                    System.out.println();
                    enemy.setHp(Math.floor(enemy.getHp() - player.getDmg() / 3.0D));
                    this.isEnemyDead(player, enemy);
                    break;
                case 2:
                    IOUtil.printText(player.getName() + " se brani");
                    System.out.println();
                    d = Math.random();
                    if (d < 0.5D) {
                        IOUtil.printText(enemy.getName() + " zautocil");
                        System.out.println();
                        player.setHp(Math.floor(player.getHp() - enemy.getDmg() / 3.0D));
                        if (this.isPlayerDead(player)) {
                            return;
                        }

                        return;
                    }

                    IOUtil.printText(enemy.getName() + " se brani");
                    IOUtil.printText("Nic se nestalo :/");
                    System.out.println();
                    break;
                case 3:
                    IOUtil.printText(player.getName() + " dodge");
                    d = Math.random();
                    if (d < 0.33D) {
                        IOUtil.printText(enemy.getName() + " zautočí");
                        player.setHp(Math.floor(player.getHp() - enemy.getDmg() * 0.0D));
                        if (this.isPlayerDead(player)) {
                            return;
                        }

                        return;
                    }

                    IOUtil.printText(enemy.getName() + " se brani");
                    IOUtil.printText("Nic se nestalo :/");
                    break;
                default:
                    this.round(player, enemy);
            }
        } catch (Exception var6) {
            this.round(player, enemy);
        }

    }

    private boolean isPlayerDead(Entity player) {
        if (player.getHp() <= 0.0D) {
            this.isRunning = false;
            IOUtil.printText("Nepritel te porazil");
            System.out.println();
            return true;
        } else {
            return false;
        }
    }

    private boolean isEnemyDead(Entity player, Entity enemy) {
        if (enemy.getHp() <= 0.0) {
            this.isRunning = false;
            IOUtil.printText(player.getName() + " vyhrava");
            System.out.println();
            return true;
        } else {
            return false;
        }
    }
}

