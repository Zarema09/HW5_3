class Magic(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.BOOST) {
    private val boostAmount = 3

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        for (hero in heroes) {
            if (hero.health > 0) {
                hero.damage += boostAmount
                println("$name увеличил атаку героя ${hero.name} на $boostAmount")
            }
        }
    }
}