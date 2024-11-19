class Warrior(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.CRITICAL_DAMAGE) {

    private val damage: Any

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        val coefficient = RPG_Game.random.nextInt(4) + 2
        boss.health -= coefficient * this.damage
        println("Warrior ${this.name} hit critically with damage ${coefficient * this.damage}")
    }
}