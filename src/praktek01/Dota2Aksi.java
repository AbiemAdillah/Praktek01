/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Windows 8.1 Pro
 */
public class Dota2Aksi {
    public static void main(String[] args) {
        Dota2 strr = new Dota2();
        Dota2 agi = new Dota2();
        Dota2 inte = new Dota2();
        
        strr.nama="Earthshaker";
        strr.role="Support - Initiator - Disabler - Nuker";
        strr.typehero="Strength";
        strr.atktype="Meele";
        strr.skill1="Fissure - Mana Cost: 125/140/155/170";;
        strr.skill2="Enchant Totem - Mana Cost: 35/40/45/50";
        strr.skill3="Aftershock - ABILITY: Passive";
        strr.ulti="Echo Slam - Mana Cost: 145/205/265";
        
        agi.nama="Anti-Mage";
        agi.role="Carry - Escape - Nuker";
        agi.typehero="Agility";
        agi.atktype="Meele";
        agi.skill1="Mana Break - ABILITY: Passive";
        agi.skill2="Blink - Mana Cost: 60";
        agi.skill3="Spell Shield - ABILITY: Passive";
        agi.ulti="Mana Void - Mana Cost: 125/200/275";
        
        inte.nama="Crystal Maiden";
        inte.role="Support - Disabler - Nuker - Jungler";
        inte.typehero="Intelligence";
        inte.atktype="Ranged";
        inte.skill1="Crystal Nova - Mana Cost: 100/120/140/160";
        inte.skill2="Frostbite - Mana Cost: 140/145/150/155";
        inte.skill3="Arcane Aura - ABILITY: Passive";
        inte.ulti="Freezing Field - Mana Cost: 200/400/600";
        
        
        strr.cetakInfo();
        System.out.println();
        agi.cetakInfo();
        System.out.println();
        inte.cetakInfo();
    }
    
}
