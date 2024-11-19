class Hacker(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.HACK) {

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        val stolenHealth = RPG_Game.random().nextInt(30) + 20
        boss.health -= stolenHealth

        val randomHero = heroes[RPG_Game.random().nextInt(heroes.size)]
        if (randomHero.health > 0) {
            randomHero.health += stolenHealth
            println("$name забрал $stolenHealth здоровья у босса и передал герою ${randomHero.name}.")
        }
    }
}