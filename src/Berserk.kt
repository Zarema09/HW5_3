class Berserk : Hero {

    constructor(health: Int, damage: Int, name: String) : super(health, damage, name, SuperAbility.BLOCK_DAMAGE_REVERT)

    private var blockedDamage: Int = 0

    fun setBlockedDamage(blockedDamage: Int) {
        this.blockedDamage = blockedDamage
    }

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        boss.health -= blockedDamage
        println("Berserk $name reverted $blockedDamage damage to boss.")
    }
}