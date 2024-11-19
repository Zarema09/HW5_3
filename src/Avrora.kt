class Avrora(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.INVISIBILITY) {
    private var hasUsedInvisibility = false
    private var invisibilityRounds = 2
    private var damageTakenInInvisibility = 0

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        when {
            !hasUsedInvisibility -> {
                hasUsedInvisibility = true
                println("$name вошла в режим невидимости.")
            }
            invisibilityRounds > 0 -> {
                invisibilityRounds--
                damageTakenInInvisibility += boss.damage
                println("$name находится в невидимости и не получает урона.")
            }
            invisibilityRounds == 0 && damageTakenInInvisibility > 0 -> {
                boss.health -= damageTakenInInvisibility
                println("$name вышла из невидимости и вернула $damageTakenInInvisibility урона боссу.")
                damageTakenInInvisibility = 0
            }
        }
    }
}