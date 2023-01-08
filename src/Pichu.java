public class Pichu extends ElectricPokemon{

    public Pichu() {
        super();
        String[] tempArr = new String[this.getAttacks().length+1];
        for(int i = 0; i<attacks.length;i++){
            tempArr[i] = this.attacks[i];
        }
        tempArr[this.attacks.length] = "Quick Attack";
        this.attacks = tempArr;
    }

    public int attack(int attackIndex){
        switch (attackIndex){
            case 1 -> {
                return kick();
            }
//            case 2 -> {
//                return quickAttack();
//            }
        }
        return -1;
    }

}
