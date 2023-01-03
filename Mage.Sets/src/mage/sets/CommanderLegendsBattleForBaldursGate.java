package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class CommanderLegendsBattleForBaldursGate extends ExpansionSet {

    private static final CommanderLegendsBattleForBaldursGate instance = new CommanderLegendsBattleForBaldursGate();

    public static CommanderLegendsBattleForBaldursGate getInstance() {
        return instance;
    }

    private CommanderLegendsBattleForBaldursGate() {
        super("Commander Legends: Battle for Baldur's Gate", "CLB", ExpansionSet.buildDate(2022, 6, 10),
                SetType.SUPPLEMENTAL);
        this.blockName = "Commander Legends";
        this.hasBasicLands = true;
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Aarakocra Sneak", 54, Rarity.COMMON, mage.cards.a.AarakocraSneak.class));
        cards.add(new SetCardInfo("Abdel Adrian, Gorion's Ward", 2, Rarity.UNCOMMON,
                mage.cards.a.AbdelAdrianGorionsWard.class));
        cards.add(new SetCardInfo("Acolyte of Bahamut", 212, Rarity.UNCOMMON, mage.cards.a.AcolyteOfBahamut.class));
        cards.add(new SetCardInfo("Aether Gale", 712, Rarity.RARE, mage.cards.a.AetherGale.class));
        cards.add(new SetCardInfo("Agent of the Iron Throne", 107, Rarity.UNCOMMON,
                mage.cards.a.AgentOfTheIronThrone.class));
        cards.add(new SetCardInfo("Agent of the Shadow Thieves", 108, Rarity.UNCOMMON,
                mage.cards.a.AgentOfTheShadowThieves.class));
        cards.add(new SetCardInfo("Agitator Ant", 776, Rarity.RARE, mage.cards.a.AgitatorAnt.class));
        cards.add(new SetCardInfo("Alora, Merry Thief", 55, Rarity.UNCOMMON, mage.cards.a.AloraMerryThief.class));
        cards.add(new SetCardInfo("Altar of Bhaal", 109, Rarity.RARE, mage.cards.a.AltarOfBhaal.class));
        cards.add(new SetCardInfo("Amber Gristle O'Maul", 159, Rarity.UNCOMMON, mage.cards.a.AmberGristleOMaul.class));
        cards.add(new SetCardInfo("Ambition's Cost", 110, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Ambitious Dragonborn", 213, Rarity.COMMON, mage.cards.a.AmbitiousDragonborn.class));
        cards.add(new SetCardInfo("Amethyst Dragon", 160, Rarity.UNCOMMON, mage.cards.a.AmethystDragon.class));
        cards.add(new SetCardInfo("Ancient Brass Dragon", 111, Rarity.MYTHIC, mage.cards.a.AncientBrassDragon.class));
        cards.add(new SetCardInfo("Ancient Bronze Dragon", 214, Rarity.MYTHIC, mage.cards.a.AncientBronzeDragon.class));
        cards.add(new SetCardInfo("Ancient Copper Dragon", 161, Rarity.MYTHIC, mage.cards.a.AncientCopperDragon.class));
        cards.add(new SetCardInfo("Ancient Gold Dragon", 3, Rarity.MYTHIC, mage.cards.a.AncientGoldDragon.class));
        cards.add(new SetCardInfo("Ancient Silver Dragon", 56, Rarity.MYTHIC, mage.cards.a.AncientSilverDragon.class));
        cards.add(new SetCardInfo("Angler Turtle", 713, Rarity.RARE, mage.cards.a.AnglerTurtle.class));
        cards.add(new SetCardInfo("Arasta of the Endless Web", 817, Rarity.RARE,
                mage.cards.a.ArastaOfTheEndlessWeb.class));
        cards.add(new SetCardInfo("Arcane Encyclopedia", 297, Rarity.UNCOMMON, mage.cards.a.ArcaneEncyclopedia.class));
        cards.add(new SetCardInfo("Arcane Signet", 298, Rarity.UNCOMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archivist of Oghma", 4, Rarity.RARE, mage.cards.a.ArchivistOfOghma.class));
        cards.add(new SetCardInfo("Archpriest of Iona", 686, Rarity.RARE, mage.cards.a.ArchpriestOfIona.class));
        cards.add(new SetCardInfo("Armor of Shadows", 112, Rarity.COMMON, mage.cards.a.ArmorOfShadows.class));
        cards.add(new SetCardInfo("Arms of Hadar", 113, Rarity.COMMON, mage.cards.a.ArmsOfHadar.class));
        cards.add(new SetCardInfo("Artificer Class", 663, Rarity.RARE, mage.cards.a.ArtificerClass.class));
        cards.add(new SetCardInfo("Ascend from Avernus", 5, Rarity.RARE, mage.cards.a.AscendFromAvernus.class));
        cards.add(new SetCardInfo("Ash Barrens", 880, Rarity.UNCOMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Astarion's Thirst", 114, Rarity.RARE, mage.cards.a.AstarionsThirst.class));
        cards.add(new SetCardInfo("Astarion, the Decadent", 265, Rarity.RARE, mage.cards.a.AstarionTheDecadent.class));
        cards.add(new SetCardInfo("Astral Confrontation", 6, Rarity.COMMON, mage.cards.a.AstralConfrontation.class));
        cards.add(new SetCardInfo("Astral Dragon", 664, Rarity.RARE, mage.cards.a.AstralDragon.class));
        cards.add(new SetCardInfo("Atrocious Experiment", 115, Rarity.COMMON, mage.cards.a.AtrociousExperiment.class));
        cards.add(new SetCardInfo("Aurora Phoenix", 778, Rarity.RARE, mage.cards.a.AuroraPhoenix.class));
        cards.add(new SetCardInfo("Austere Command", 687, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Avatar of Slaughter", 779, Rarity.RARE, mage.cards.a.AvatarOfSlaughter.class));
        cards.add(new SetCardInfo("Aven Mindcensor", 688, Rarity.UNCOMMON, mage.cards.a.AvenMindcensor.class));
        cards.add(new SetCardInfo("Avenging Hunter", 215, Rarity.COMMON, mage.cards.a.AvengingHunter.class));
        cards.add(
                new SetCardInfo("Baba Lysaga, Night Witch", 266, Rarity.RARE, mage.cards.b.BabaLysagaNightWitch.class));
        cards.add(new SetCardInfo("Baeloth Barrityl, Entertainer", 655, Rarity.MYTHIC,
                mage.cards.b.BaelothBarritylEntertainer.class));
        cards.add(new SetCardInfo("Bag of Holding", 299, Rarity.UNCOMMON, mage.cards.b.BagOfHolding.class));
        cards.add(new SetCardInfo("Baldur's Gate", 345, Rarity.RARE, mage.cards.b.BaldursGate.class));
        cards.add(new SetCardInfo("Balor", 162, Rarity.MYTHIC, mage.cards.b.Balor.class));
        cards.add(new SetCardInfo("Band Together", 216, Rarity.COMMON, mage.cards.b.BandTogether.class));
        cards.add(new SetCardInfo("Bane's Contingency", 57, Rarity.UNCOMMON, mage.cards.b.BanesContingency.class));
        cards.add(new SetCardInfo("Bane's Invoker", 7, Rarity.COMMON, mage.cards.b.BanesInvoker.class));
        cards.add(new SetCardInfo("Bane, Lord of Darkness", 267, Rarity.RARE, mage.cards.b.BaneLordOfDarkness.class));
        cards.add(new SetCardInfo("Banishment", 8, Rarity.UNCOMMON, mage.cards.b.Banishment.class));
        cards.add(new SetCardInfo("Barroom Brawl", 217, Rarity.RARE, mage.cards.b.BarroomBrawl.class));
        cards.add(new SetCardInfo("Basilisk Collar", 300, Rarity.RARE, mage.cards.b.BasiliskCollar.class));
        cards.add(new SetCardInfo("Basilisk Gate", 346, Rarity.COMMON, mage.cards.b.BasiliskGate.class));
        cards.add(new SetCardInfo("Battle Angels of Tyr", 9, Rarity.MYTHIC, mage.cards.b.BattleAngelsOfTyr.class));
        cards.add(new SetCardInfo("Battle Mammoth", 818, Rarity.MYTHIC, mage.cards.b.BattleMammoth.class));
        cards.add(new SetCardInfo("Beanstalk Giant", 819, Rarity.UNCOMMON, mage.cards.b.BeanstalkGiant.class));
        cards.add(new SetCardInfo("Beast Within", 820, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(
                new SetCardInfo("Beckoning Will-o'-Wisp", 10, Rarity.UNCOMMON, mage.cards.b.BeckoningWillOWisp.class));
        cards.add(new SetCardInfo("Bhaal's Invoker", 163, Rarity.COMMON, mage.cards.b.BhaalsInvoker.class));
        cards.add(new SetCardInfo("Bhaal, Lord of Murder", 268, Rarity.RARE, mage.cards.b.BhaalLordOfMurder.class));
        cards.add(new SetCardInfo("Black Dragon Gate", 347, Rarity.COMMON, mage.cards.b.BlackDragonGate.class));
        cards.add(new SetCardInfo("Black Market Connections", 669, Rarity.RARE,
                mage.cards.b.BlackMarketConnections.class));
        cards.add(new SetCardInfo("Black Market", 739, Rarity.RARE, mage.cards.b.BlackMarket.class));
        cards.add(new SetCardInfo("Blade of Selves", 301, Rarity.RARE, mage.cards.b.BladeOfSelves.class));
        cards.add(new SetCardInfo("Blasphemous Act", 780, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Blessed Hippogriff", 11, Rarity.COMMON, mage.cards.b.BlessedHippogriff.class));
        cards.add(new SetCardInfo("Blighted Woodland", 881, Rarity.UNCOMMON, mage.cards.b.BlightedWoodland.class));
        cards.add(new SetCardInfo("Blood Money", 116, Rarity.MYTHIC, mage.cards.b.BloodMoney.class));
        cards.add(new SetCardInfo("Bloodboil Sorcerer", 164, Rarity.UNCOMMON, mage.cards.b.BloodboilSorcerer.class));
        cards.add(new SetCardInfo("Bloodbraid Elf", 839, Rarity.UNCOMMON, mage.cards.b.BloodbraidElf.class));
        cards.add(new SetCardInfo("Bloodsoaked Champion", 740, Rarity.RARE, mage.cards.b.BloodsoakedChampion.class));
        cards.add(new SetCardInfo("Bloodthirsty Blade", 854, Rarity.UNCOMMON, mage.cards.b.BloodthirstyBlade.class));
        cards.add(new SetCardInfo("Blur", 58, Rarity.COMMON, mage.cards.b.Blur.class));
        cards.add(new SetCardInfo("Bojuka Bog", 882, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Bonecaller Cleric", 117, Rarity.UNCOMMON, mage.cards.b.BonecallerCleric.class));
        cards.add(new SetCardInfo("Bonecrusher Giant", 781, Rarity.RARE, mage.cards.b.BonecrusherGiant.class));
        cards.add(new SetCardInfo("Bothersome Quasit", 674, Rarity.RARE, mage.cards.b.BothersomeQuasit.class));
        cards.add(new SetCardInfo("Bountiful Promenade", 348, Rarity.RARE, mage.cards.b.BountifulPromenade.class));
        cards.add(new SetCardInfo("Brainstealer Dragon", 670, Rarity.RARE, mage.cards.b.BrainstealerDragon.class));
        cards.add(new SetCardInfo("Bramble Sovereign", 218, Rarity.MYTHIC, mage.cards.b.BrambleSovereign.class));
        cards.add(new SetCardInfo("Brash Taunter", 782, Rarity.RARE, mage.cards.b.BrashTaunter.class));
        cards.add(new SetCardInfo("Breath Weapon", 165, Rarity.COMMON, mage.cards.b.BreathWeapon.class));
        cards.add(new SetCardInfo("Bronze Walrus", 302, Rarity.COMMON, mage.cards.b.BronzeWalrus.class));
        cards.add(new SetCardInfo("Burakos, Party Leader", 653, Rarity.MYTHIC, mage.cards.b.BurakosPartyLeader.class));
        cards.add(new SetCardInfo("Burnished Hart", 303, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Butcher of Malakir", 741, Rarity.RARE, mage.cards.b.ButcherOfMalakir.class));
        cards.add(new SetCardInfo("Bygone Bishop", 689, Rarity.RARE, mage.cards.b.BygoneBishop.class));
        cards.add(new SetCardInfo("Cadira, Caller of the Small", 269, Rarity.UNCOMMON,
                mage.cards.c.CadiraCallerOfTheSmall.class));
        cards.add(new SetCardInfo("Calculating Lich", 742, Rarity.MYTHIC, mage.cards.c.CalculatingLich.class));
        cards.add(new SetCardInfo("Call to the Void", 118, Rarity.RARE, mage.cards.c.CallToTheVoid.class));
        cards.add(new SetCardInfo("Campfire", 304, Rarity.UNCOMMON, mage.cards.c.Campfire.class));
        cards.add(new SetCardInfo("Candlekeep Inspiration", 59, Rarity.UNCOMMON,
                mage.cards.c.CandlekeepInspiration.class));
        cards.add(new SetCardInfo("Candlekeep Sage", 60, Rarity.COMMON, mage.cards.c.CandlekeepSage.class));
        cards.add(new SetCardInfo("Captain N'ghathrod", 646, Rarity.MYTHIC, mage.cards.c.CaptainNghathrod.class));
        cards.add(new SetCardInfo("Carefree Swinemaster", 219, Rarity.COMMON, mage.cards.c.CarefreeSwinemaster.class));
        cards.add(new SetCardInfo("Carnelian Orb of Dragonkind", 166, Rarity.COMMON,
                mage.cards.c.CarnelianOrbOfDragonkind.class));
        cards.add(new SetCardInfo("Cast Down", 119, Rarity.UNCOMMON, mage.cards.c.CastDown.class));
        cards.add(new SetCardInfo("Castle Embereth", 883, Rarity.RARE, mage.cards.c.CastleEmbereth.class));
        cards.add(new SetCardInfo("Castle Locthwain", 884, Rarity.RARE, mage.cards.c.CastleLocthwain.class));
        cards.add(new SetCardInfo("Castle Vantress", 885, Rarity.RARE, mage.cards.c.CastleVantress.class));
        cards.add(new SetCardInfo("Caves of Chaos Adventurer", 167, Rarity.RARE,
                mage.cards.c.CavesOfChaosAdventurer.class));
        cards.add(new SetCardInfo("Chain Devil", 120, Rarity.COMMON, mage.cards.c.ChainDevil.class));
        cards.add(new SetCardInfo("Chain Reaction", 783, Rarity.RARE, mage.cards.c.ChainReaction.class));
        cards.add(new SetCardInfo("Changeling Outcast", 743, Rarity.COMMON, mage.cards.c.ChangelingOutcast.class));
        cards.add(new SetCardInfo("Chaos Dragon", 784, Rarity.RARE, mage.cards.c.ChaosDragon.class));
        cards.add(new SetCardInfo("Chaos Wand", 855, Rarity.RARE, mage.cards.c.ChaosWand.class));
        cards.add(new SetCardInfo("Chaos Warp", 785, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Charcoal Diamond", 305, Rarity.COMMON, mage.cards.c.CharcoalDiamond.class));
        cards.add(new SetCardInfo("Chardalyn Dragon", 306, Rarity.COMMON, mage.cards.c.ChardalynDragon.class));
        cards.add(new SetCardInfo("Chasm Skulker", 714, Rarity.RARE, mage.cards.c.ChasmSkulker.class));
        cards.add(new SetCardInfo("Choked Estuary", 886, Rarity.RARE, mage.cards.c.ChokedEstuary.class));
        cards.add(new SetCardInfo("Cinder Glade", 887, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Circle of the Land Druid", 220, Rarity.COMMON,
                mage.cards.c.CircleOfTheLandDruid.class));
        cards.add(new SetCardInfo("Citadel Gate", 349, Rarity.COMMON, mage.cards.c.CitadelGate.class));
        cards.add(new SetCardInfo("Clan Crafter", 651, Rarity.MYTHIC, mage.cards.c.ClanCrafter.class));
        cards.add(new SetCardInfo("Cliffgate", 350, Rarity.COMMON, mage.cards.c.Cliffgate.class));
        cards.add(new SetCardInfo("Cloak of the Bat", 307, Rarity.COMMON, mage.cards.c.CloakOfTheBat.class));
        cards.add(new SetCardInfo("Cloakwood Hermit", 221, Rarity.UNCOMMON, mage.cards.c.CloakwoodHermit.class));
        cards.add(
                new SetCardInfo("Cloakwood Swarmkeeper", 222, Rarity.COMMON, mage.cards.c.CloakwoodSwarmkeeper.class));
        cards.add(new SetCardInfo("Clockwork Fox", 308, Rarity.COMMON, mage.cards.c.ClockworkFox.class));
        cards.add(new SetCardInfo("Cloudkill", 121, Rarity.UNCOMMON, mage.cards.c.Cloudkill.class));
        cards.add(new SetCardInfo("Colossal Badger", 223, Rarity.COMMON, mage.cards.c.ColossalBadger.class));
        cards.add(new SetCardInfo("Command Tower", 351, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Compulsive Research", 715, Rarity.COMMON, mage.cards.c.CompulsiveResearch.class));
        cards.add(new SetCardInfo("Cone of Cold", 61, Rarity.UNCOMMON, mage.cards.c.ConeOfCold.class));
        cards.add(new SetCardInfo("Consuming Aberration", 840, Rarity.RARE, mage.cards.c.ConsumingAberration.class));
        cards.add(new SetCardInfo("Contact Other Plane", 62, Rarity.COMMON, mage.cards.c.ContactOtherPlane.class));
        cards.add(new SetCardInfo("Contraband Livestock", 12, Rarity.UNCOMMON, mage.cards.c.ContrabandLivestock.class));
        cards.add(new SetCardInfo("Coronation of Chaos", 168, Rarity.COMMON, mage.cards.c.CoronationOfChaos.class));
        cards.add(new SetCardInfo("Corpse Augur", 744, Rarity.UNCOMMON, mage.cards.c.CorpseAugur.class));
        cards.add(new SetCardInfo("Creeping Tar Pit", 888, Rarity.RARE, mage.cards.c.CreepingTarPit.class));
        cards.add(new SetCardInfo("Crib Swap", 690, Rarity.COMMON, mage.cards.c.CribSwap.class));
        cards.add(new SetCardInfo("Criminal Past", 122, Rarity.UNCOMMON, mage.cards.c.CriminalPast.class));
        cards.add(new SetCardInfo("Crippling Fear", 745, Rarity.RARE, mage.cards.c.CripplingFear.class));
        cards.add(new SetCardInfo("Crystal Dragon", 13, Rarity.UNCOMMON, mage.cards.c.CrystalDragon.class));
        cards.add(
                new SetCardInfo("Cultist of the Absolute", 123, Rarity.RARE, mage.cards.c.CultistOfTheAbsolute.class));
        cards.add(new SetCardInfo("Cultivate", 821, Rarity.UNCOMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Curse of Opulence", 786, Rarity.UNCOMMON, mage.cards.c.CurseOfOpulence.class));
        cards.add(new SetCardInfo("Curse of Verbosity", 717, Rarity.UNCOMMON, mage.cards.c.CurseOfVerbosity.class));
        cards.add(new SetCardInfo("Curse of the Swine", 716, Rarity.RARE, mage.cards.c.CurseOfTheSwine.class));
        cards.add(new SetCardInfo("Curtains' Call", 746, Rarity.RARE, mage.cards.c.CurtainsCall.class));
        cards.add(new SetCardInfo("Cut a Deal", 14, Rarity.UNCOMMON, mage.cards.c.CutADeal.class));
        cards.add(new SetCardInfo("Dark Hatchling", 747, Rarity.RARE, mage.cards.d.DarkHatchling.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 889, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Dauthi Horror", 748, Rarity.COMMON, mage.cards.d.DauthiHorror.class));
        cards.add(new SetCardInfo("Dawnbringer Cleric", 15, Rarity.COMMON, mage.cards.d.DawnbringerCleric.class));
        cards.add(new SetCardInfo("Deadly Dispute", 124, Rarity.COMMON, mage.cards.d.DeadlyDispute.class));
        cards.add(new SetCardInfo("Death Kiss", 675, Rarity.RARE, mage.cards.d.DeathKiss.class));
        cards.add(new SetCardInfo("Decanter of Endless Water", 309, Rarity.COMMON,
                mage.cards.d.DecanterOfEndlessWater.class));
        cards.add(new SetCardInfo("Deep Gnome Terramancer", 607, Rarity.RARE, mage.cards.d.DeepGnomeTerramancer.class));
        cards.add(new SetCardInfo("Delayed Blast Fireball", 676, Rarity.RARE, mage.cards.d.DelayedBlastFireball.class));
        cards.add(new SetCardInfo("Demon Bolt", 787, Rarity.COMMON, mage.cards.d.DemonBolt.class));
        cards.add(new SetCardInfo("Descent into Avernus", 169, Rarity.RARE, mage.cards.d.DescentIntoAvernus.class));
        cards.add(new SetCardInfo("Desolate Lighthouse", 890, Rarity.RARE, mage.cards.d.DesolateLighthouse.class));
        cards.add(new SetCardInfo("Despark", 841, Rarity.UNCOMMON, mage.cards.d.Despark.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 891, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dimir Keyrune", 856, Rarity.UNCOMMON, mage.cards.d.DimirKeyrune.class));
        cards.add(new SetCardInfo("Dimir Signet", 857, Rarity.COMMON, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Dire Fleet Daredevil", 788, Rarity.RARE, mage.cards.d.DireFleetDaredevil.class));
        cards.add(new SetCardInfo("Dire Fleet Ravager", 749, Rarity.MYTHIC, mage.cards.d.DireFleetRavager.class));
        cards.add(new SetCardInfo("Dire Mimic", 310, Rarity.COMMON, mage.cards.d.DireMimic.class));
        cards.add(new SetCardInfo("Displacer Kitten", 63, Rarity.RARE, mage.cards.d.DisplacerKitten.class));
        cards.add(new SetCardInfo("Disrupt Decorum", 789, Rarity.RARE, mage.cards.d.DisruptDecorum.class));
        cards.add(new SetCardInfo("Dissipation Field", 718, Rarity.RARE, mage.cards.d.DissipationField.class));
        cards.add(new SetCardInfo("Domineering Will", 719, Rarity.RARE, mage.cards.d.DomineeringWill.class));
        cards.add(new SetCardInfo("Draconic Lore", 64, Rarity.COMMON, mage.cards.d.DraconicLore.class));
        cards.add(new SetCardInfo("Draconic Muralists", 224, Rarity.UNCOMMON, mage.cards.d.DraconicMuralists.class));
        cards.add(new SetCardInfo("Dragon Cultist", 170, Rarity.UNCOMMON, mage.cards.d.DragonCultist.class));
        cards.add(new SetCardInfo("Dragon's Hoard", 858, Rarity.RARE, mage.cards.d.DragonsHoard.class));
        cards.add(new SetCardInfo("Dragonborn Looter", 65, Rarity.COMMON, mage.cards.d.DragonbornLooter.class));
        cards.add(
                new SetCardInfo("Drakuseth, Maw of Flames", 790, Rarity.RARE, mage.cards.d.DrakusethMawOfFlames.class));
        cards.add(new SetCardInfo("Dread Linnorm", 225, Rarity.COMMON, mage.cards.d.DreadLinnorm.class));
        cards.add(new SetCardInfo("Dream Fracture", 66, Rarity.COMMON, mage.cards.d.DreamFracture.class));
        cards.add(new SetCardInfo("Dream Pillager", 791, Rarity.RARE, mage.cards.d.DreamPillager.class));
        cards.add(new SetCardInfo("Drillworks Mole", 311, Rarity.UNCOMMON, mage.cards.d.DrillworksMole.class));
        cards.add(new SetCardInfo("Dross Harvester", 750, Rarity.RARE, mage.cards.d.DrossHarvester.class));
        cards.add(new SetCardInfo("Drown in the Loch", 842, Rarity.UNCOMMON, mage.cards.d.DrownInTheLoch.class));
        cards.add(new SetCardInfo("Drownyard Temple", 892, Rarity.RARE, mage.cards.d.DrownyardTemple.class));
        cards.add(new SetCardInfo("Druid of the Emerald Grove", 226, Rarity.COMMON,
                mage.cards.d.DruidOfTheEmeraldGrove.class));
        cards.add(new SetCardInfo("Druidic Ritual", 227, Rarity.COMMON, mage.cards.d.DruidicRitual.class));
        cards.add(new SetCardInfo("Duke Ulder Ravengard", 272, Rarity.RARE, mage.cards.d.DukeUlderRavengard.class));
        cards.add(new SetCardInfo("Dungeon Delver", 67, Rarity.UNCOMMON, mage.cards.d.DungeonDelver.class));
        cards.add(new SetCardInfo("Dungeoneer's Pack", 312, Rarity.UNCOMMON, mage.cards.d.DungeoneersPack.class));
        cards.add(new SetCardInfo("Dusk // Dawn", 691, Rarity.RARE, mage.cards.d.DuskDawn.class));
        cards.add(new SetCardInfo("Dusk Mangler", 751, Rarity.UNCOMMON, mage.cards.d.DuskMangler.class));
        cards.add(new SetCardInfo("Earth Tremor", 171, Rarity.COMMON, mage.cards.e.EarthTremor.class));
        cards.add(new SetCardInfo("Earthquake Dragon", 228, Rarity.RARE, mage.cards.e.EarthquakeDragon.class));
        cards.add(new SetCardInfo("Eight-and-a-Half-Tails", 692, Rarity.RARE, mage.cards.e.EightAndAHalfTails.class));
        cards.add(new SetCardInfo("Elder Brain", 125, Rarity.RARE, mage.cards.e.ElderBrain.class));
        cards.add(new SetCardInfo("Eldritch Pact", 126, Rarity.RARE, mage.cards.e.EldritchPact.class));
        cards.add(new SetCardInfo("Ellyn Harbreeze, Busybody", 16, Rarity.UNCOMMON,
                mage.cards.e.EllynHarbreezeBusybody.class));
        cards.add(new SetCardInfo("Elminster", 274, Rarity.MYTHIC, mage.cards.e.Elminster.class));
        cards.add(
                new SetCardInfo("Elminster's Simulacrum", 68, Rarity.MYTHIC, mage.cards.e.ElminstersSimulacrum.class));
        cards.add(new SetCardInfo("Elturel Survivors", 172, Rarity.RARE, mage.cards.e.ElturelSurvivors.class));
        cards.add(new SetCardInfo("Embereth Shieldbreaker", 792, Rarity.UNCOMMON,
                mage.cards.e.EmberethShieldbreaker.class));
        cards.add(new SetCardInfo("Emerald Dragon", 229, Rarity.UNCOMMON, mage.cards.e.EmeraldDragon.class));
        cards.add(new SetCardInfo("Endless Evil", 665, Rarity.RARE, mage.cards.e.EndlessEvil.class,
                NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Endless Evil", 615, Rarity.RARE, mage.cards.e.EndlessEvil.class,
                NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("End-Raze Forerunners", 822, Rarity.RARE, mage.cards.e.EndRazeForerunners.class));
        cards.add(
                new SetCardInfo("Erinis, Gloom Stalker", 230, Rarity.UNCOMMON, mage.cards.e.ErinisGloomStalker.class));
        cards.add(new SetCardInfo("Escape to the Wilds", 843, Rarity.RARE, mage.cards.e.EscapeToTheWilds.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 793, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Ettercap", 231, Rarity.COMMON, mage.cards.e.Ettercap.class));
        cards.add(new SetCardInfo("Everflowing Chalice", 859, Rarity.UNCOMMON, mage.cards.e.EverflowingChalice.class));
        cards.add(new SetCardInfo("Evolving Wilds", 352, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 893, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(
                new SetCardInfo("Explore the Underdark", 232, Rarity.UNCOMMON, mage.cards.e.ExploreTheUnderdark.class));
        cards.add(new SetCardInfo("Explore", 823, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(
                new SetCardInfo("Extract from Darkness", 844, Rarity.UNCOMMON, mage.cards.e.ExtractFromDarkness.class));
        cards.add(new SetCardInfo("Ezuri's Predation", 824, Rarity.RARE, mage.cards.e.EzurisPredation.class));
        cards.add(new SetCardInfo("Faceless One", 1, Rarity.SPECIAL, mage.cards.f.FacelessOne.class));
        cards.add(new SetCardInfo("Fact or Fiction", 720, Rarity.UNCOMMON, mage.cards.f.FactOrFiction.class));
        cards.add(new SetCardInfo("Faldorn, Dread Wolf Herald", 647, Rarity.MYTHIC,
                mage.cards.f.FaldornDreadWolfHerald.class));
        cards.add(new SetCardInfo("Fang Dragon", 173, Rarity.COMMON, mage.cards.f.FangDragon.class));
        cards.add(new SetCardInfo("Far Traveler", 17, Rarity.UNCOMMON, mage.cards.f.FarTraveler.class));
        cards.add(new SetCardInfo("Feed the Swarm", 752, Rarity.COMMON, mage.cards.f.FeedTheSwarm.class));
        cards.add(new SetCardInfo("Felisa, Fang of Silverquill", 845, Rarity.MYTHIC,
                mage.cards.f.FelisaFangOfSilverquill.class));
        cards.add(new SetCardInfo("Fellwar Stone", 860, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Feywild Caretaker", 69, Rarity.UNCOMMON, mage.cards.f.FeywildCaretaker.class));
        cards.add(new SetCardInfo("Feywild Visitor", 70, Rarity.UNCOMMON, mage.cards.f.FeywildVisitor.class));
        cards.add(new SetCardInfo("Firbolg Flutist", 174, Rarity.RARE, mage.cards.f.FirbolgFlutist.class));
        cards.add(new SetCardInfo("Fire Diamond", 313, Rarity.COMMON, mage.cards.f.FireDiamond.class));
        cards.add(new SetCardInfo("Fireball", 175, Rarity.UNCOMMON, mage.cards.f.Fireball.class));
        cards.add(new SetCardInfo("Firja's Retribution", 846, Rarity.RARE, mage.cards.f.FirjasRetribution.class));
        cards.add(new SetCardInfo("Firkraag, Cunning Instigator", 648, Rarity.MYTHIC,
                mage.cards.f.FirkraagCunningInstigator.class));
        cards.add(new SetCardInfo("Flaming Fist Officer", 19, Rarity.COMMON, mage.cards.f.FlamingFistOfficer.class));
        cards.add(new SetCardInfo("Flaming Fist", 18, Rarity.COMMON, mage.cards.f.FlamingFist.class));
        cards.add(new SetCardInfo("Folk Hero", 650, Rarity.MYTHIC, mage.cards.f.FolkHero.class));
        cards.add(new SetCardInfo("Font of Magic", 71, Rarity.MYTHIC, mage.cards.f.FontOfMagic.class));
        cards.add(
                new SetCardInfo("Forest", 467, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Creation", 721, Rarity.RARE, mage.cards.f.ForgottenCreation.class));
        cards.add(new SetCardInfo("Fractured Sanity", 722, Rarity.RARE, mage.cards.f.FracturedSanity.class));
        cards.add(new SetCardInfo("Fraying Line", 314, Rarity.RARE, mage.cards.f.FrayingLine.class));
        cards.add(new SetCardInfo("From the Catacombs", 671, Rarity.RARE, mage.cards.f.FromTheCatacombs.class));
        cards.add(new SetCardInfo("Frontline Medic", 693, Rarity.RARE, mage.cards.f.FrontlineMedic.class));
        cards.add(new SetCardInfo("Gale, Waterdeep Prodigy", 72, Rarity.RARE, mage.cards.g.GaleWaterdeepProdigy.class));
        cards.add(new SetCardInfo("Gale's Redirection", 73, Rarity.RARE, mage.cards.g.GalesRedirection.class));
        cards.add(new SetCardInfo("Galepowder Mage", 694, Rarity.RARE, mage.cards.g.GalepowderMage.class));
        cards.add(new SetCardInfo("Game Trail", 894, Rarity.RARE, mage.cards.g.GameTrail.class));
        cards.add(new SetCardInfo("Ganax, Astral Hunter", 176, Rarity.UNCOMMON, mage.cards.g.GanaxAstralHunter.class));
        cards.add(new SetCardInfo("Gate Colossus", 315, Rarity.UNCOMMON, mage.cards.g.GateColossus.class));
        cards.add(new SetCardInfo("Genasi Enforcers", 177, Rarity.COMMON, mage.cards.g.GenasiEnforcers.class));
        cards.add(new SetCardInfo("Geode Golem", 316, Rarity.UNCOMMON, mage.cards.g.GeodeGolem.class));
        cards.add(new SetCardInfo("Geode Rager", 794, Rarity.RARE, mage.cards.g.GeodeRager.class));
        cards.add(new SetCardInfo("Ghastly Death Tyrant", 127, Rarity.COMMON, mage.cards.g.GhastlyDeathTyrant.class));
        cards.add(new SetCardInfo("Ghost Lantern", 128, Rarity.UNCOMMON, mage.cards.g.GhostLantern.class));
        cards.add(new SetCardInfo("Giant Ankheg", 233, Rarity.UNCOMMON, mage.cards.g.GiantAnkheg.class));
        cards.add(new SetCardInfo("Githzerai Monk", 20, Rarity.UNCOMMON, mage.cards.g.GithzeraiMonk.class));
        cards.add(new SetCardInfo("Glorious Protector", 695, Rarity.RARE, mage.cards.g.GloriousProtector.class));
        cards.add(new SetCardInfo("Gnoll War Band", 178, Rarity.UNCOMMON, mage.cards.g.GnollWarBand.class));
        cards.add(new SetCardInfo("Goblin Spymaster", 795, Rarity.RARE, mage.cards.g.GoblinSpymaster.class));
        cards.add(new SetCardInfo("Goggles of Night", 74, Rarity.COMMON, mage.cards.g.GogglesOfNight.class));
        cards.add(new SetCardInfo("Goliath Paladin", 21, Rarity.COMMON, mage.cards.g.GoliathPaladin.class));
        cards.add(new SetCardInfo("Gond Gate", 353, Rarity.UNCOMMON, mage.cards.g.GondGate.class));
        cards.add(new SetCardInfo("Gonti, Lord of Luxury", 753, Rarity.RARE, mage.cards.g.GontiLordOfLuxury.class));
        cards.add(new SetCardInfo("Gorion, Wise Mentor", 276, Rarity.RARE, mage.cards.g.GorionWiseMentor.class));
        cards.add(new SetCardInfo("Gray Harbor Merfolk", 75, Rarity.COMMON, mage.cards.g.GrayHarborMerfolk.class));
        cards.add(new SetCardInfo("Gray Slaad", 129, Rarity.COMMON, mage.cards.g.GraySlaad.class));
        cards.add(new SetCardInfo("Grazilaxx, Illithid Scholar", 723, Rarity.RARE,
                mage.cards.g.GrazilaxxIllithidScholar.class));
        cards.add(new SetCardInfo("Greater Gargadon", 796, Rarity.RARE, mage.cards.g.GreaterGargadon.class));
        cards.add(new SetCardInfo("Greatsword of Tyr", 22, Rarity.COMMON, mage.cards.g.GreatswordOfTyr.class));
        cards.add(new SetCardInfo("Green Slime", 680, Rarity.RARE, mage.cards.g.GreenSlime.class));
        cards.add(new SetCardInfo("Grim Haruspex", 754, Rarity.RARE, mage.cards.g.GrimHaruspex.class));
        cards.add(new SetCardInfo("Grim Hireling", 755, Rarity.RARE, mage.cards.g.GrimHireling.class));
        cards.add(new SetCardInfo("Grumgully, the Generous", 847, Rarity.UNCOMMON,
                mage.cards.g.GrumgullyTheGenerous.class));
        cards.add(new SetCardInfo("Gruul Turf", 895, Rarity.UNCOMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Guardian Naga", 23, Rarity.COMMON, mage.cards.g.GuardianNaga.class));
        cards.add(new SetCardInfo("Guiding Bolt", 24, Rarity.COMMON, mage.cards.g.GuidingBolt.class));
        cards.add(new SetCardInfo("Guild Artisan", 179, Rarity.UNCOMMON, mage.cards.g.GuildArtisan.class));
        cards.add(new SetCardInfo("Guildsworn Prowler", 130, Rarity.COMMON, mage.cards.g.GuildswornProwler.class));
        cards.add(new SetCardInfo("Guiltfeeder", 756, Rarity.RARE, mage.cards.g.Guiltfeeder.class));
        cards.add(new SetCardInfo("Gut, True Soul Zealot", 180, Rarity.UNCOMMON, mage.cards.g.GutTrueSoulZealot.class));
        cards.add(new SetCardInfo("Halsin, Emerald Archdruid", 234, Rarity.UNCOMMON,
                mage.cards.h.HalsinEmeraldArchdruid.class));
        cards.add(new SetCardInfo("Hammers of Moradin", 25, Rarity.UNCOMMON, mage.cards.h.HammersOfMoradin.class));
        cards.add(new SetCardInfo("Hardy Outlander", 235, Rarity.UNCOMMON, mage.cards.h.HardyOutlander.class));
        cards.add(new SetCardInfo("Harper Recruiter", 659, Rarity.RARE, mage.cards.h.HarperRecruiter.class));
        cards.add(new SetCardInfo("Haunted One", 654, Rarity.MYTHIC, mage.cards.h.HauntedOne.class));
        cards.add(new SetCardInfo("Heap Gate", 354, Rarity.COMMON, mage.cards.h.HeapGate.class));
        cards.add(new SetCardInfo("Hedron Archive", 861, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Herald's Horn", 862, Rarity.UNCOMMON, mage.cards.h.HeraldsHorn.class));
        cards.add(new SetCardInfo("Hex", 757, Rarity.RARE, mage.cards.h.Hex.class));
        cards.add(new SetCardInfo("High Priest of Penance", 848, Rarity.RARE, mage.cards.h.HighPriestOfPenance.class));
        cards.add(new SetCardInfo("Highland Forest", 896, Rarity.COMMON, mage.cards.h.HighlandForest.class));
        cards.add(new SetCardInfo("Hoarding Ogre", 181, Rarity.COMMON, mage.cards.h.HoardingOgre.class));
        cards.add(new SetCardInfo("Horn of Valhalla", 26, Rarity.RARE, mage.cards.h.HornOfValhalla.class));
        cards.add(new SetCardInfo("Hornet Queen", 825, Rarity.MYTHIC, mage.cards.h.HornetQueen.class));
        cards.add(new SetCardInfo("Hullbreaker Horror", 724, Rarity.RARE, mage.cards.h.HullbreakerHorror.class));
        cards.add(new SetCardInfo("Hunted Horror", 758, Rarity.RARE, mage.cards.h.HuntedHorror.class));
        cards.add(new SetCardInfo("Icewind Stalwart", 27, Rarity.COMMON, mage.cards.i.IcewindStalwart.class));
        cards.add(new SetCardInfo("Ignite the Future", 797, Rarity.RARE, mage.cards.i.IgniteTheFuture.class));
        cards.add(new SetCardInfo("Imoen, Mystic Trickster", 77, Rarity.UNCOMMON,
                mage.cards.i.ImoenMysticTrickster.class));
        cards.add(new SetCardInfo("In Garruk's Wake", 759, Rarity.RARE, mage.cards.i.InGarruksWake.class));
        cards.add(
                new SetCardInfo("Ingenious Artillerist", 182, Rarity.COMMON, mage.cards.i.IngeniousArtillerist.class));
        cards.add(new SetCardInfo("Inspired Tinkering", 183, Rarity.UNCOMMON, mage.cards.i.InspiredTinkering.class));
        cards.add(new SetCardInfo("Inspiring Leader", 28, Rarity.UNCOMMON, mage.cards.i.InspiringLeader.class));
        cards.add(new SetCardInfo("Insufferable Balladeer", 184, Rarity.COMMON,
                mage.cards.i.InsufferableBalladeer.class));
        cards.add(new SetCardInfo("Irenicus's Vile Duplication", 78, Rarity.UNCOMMON,
                mage.cards.i.IrenicussVileDuplication.class));
        cards.add(new SetCardInfo("Iron Mastiff", 317, Rarity.UNCOMMON, mage.cards.i.IronMastiff.class));
        cards.add(new SetCardInfo("Irregular Cohort", 696, Rarity.COMMON, mage.cards.i.IrregularCohort.class));
        cards.add(
                new SetCardInfo("Island", 455, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Izzet Boilerworks", 897, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Izzet Chemister", 798, Rarity.RARE, mage.cards.i.IzzetChemister.class));
        cards.add(new SetCardInfo("Izzet Signet", 863, Rarity.COMMON, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Jaheira's Respite", 238, Rarity.RARE, mage.cards.j.JaheirasRespite.class));
        cards.add(new SetCardInfo("Jaheira, Friend of the Forest", 237, Rarity.RARE,
                mage.cards.j.JaheiraFriendOfTheForest.class));
        cards.add(new SetCardInfo("Jan Jansen, Chaos Crafter", 277, Rarity.RARE,
                mage.cards.j.JanJansenChaosCrafter.class));
        cards.add(new SetCardInfo("Javelin of Lightning", 185, Rarity.COMMON, mage.cards.j.JavelinOfLightning.class));
        cards.add(new SetCardInfo("Jazal Goldmane", 697, Rarity.MYTHIC, mage.cards.j.JazalGoldmane.class));
        cards.add(new SetCardInfo("Jeska's Will", 799, Rarity.RARE, mage.cards.j.JeskasWill.class));
        cards.add(
                new SetCardInfo("Journey to the Lost City", 681, Rarity.RARE, mage.cards.j.JourneyToTheLostCity.class));
        cards.add(new SetCardInfo("Juvenile Mist Dragon", 79, Rarity.UNCOMMON, mage.cards.j.JuvenileMistDragon.class));
        cards.add(new SetCardInfo("Karlach, Fury of Avernus", 186, Rarity.MYTHIC,
                mage.cards.k.KarlachFuryOfAvernus.class));
        cards.add(new SetCardInfo("Kazuul, Tyrant of the Cliffs", 800, Rarity.RARE,
                mage.cards.k.KazuulTyrantOfTheCliffs.class));
        cards.add(new SetCardInfo("Keiga, the Tide Star", 725, Rarity.RARE, mage.cards.k.KeigaTheTideStar.class));
        cards.add(new SetCardInfo("Kenku Artificer", 80, Rarity.COMMON, mage.cards.k.KenkuArtificer.class));
        cards.add(new SetCardInfo("Kessig Wolf Run", 898, Rarity.RARE, mage.cards.k.KessigWolfRun.class));
        cards.add(new SetCardInfo("Kher Keep", 899, Rarity.RARE, mage.cards.k.KherKeep.class));
        cards.add(new SetCardInfo("Kindred Discovery", 81, Rarity.RARE, mage.cards.k.KindredDiscovery.class));
        cards.add(new SetCardInfo("Kodama's Reach", 826, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Korlessa, Scale Singer", 280, Rarity.UNCOMMON,
                mage.cards.k.KorlessaScaleSinger.class));
        cards.add(new SetCardInfo("Lae'zel, Vlaakith's Champion", 29, Rarity.RARE,
                mage.cards.l.LaezelVlaakithsChampion.class));
        cards.add(new SetCardInfo("Laelia, the Blade Reforged", 801, Rarity.RARE,
                mage.cards.l.LaeliaTheBladeReforged.class));
        cards.add(new SetCardInfo("Lantern of Revealing", 318, Rarity.COMMON, mage.cards.l.LanternOfRevealing.class));
        cards.add(
                new SetCardInfo("Lapis Orb of Dragonkind", 82, Rarity.COMMON, mage.cards.l.LapisOrbOfDragonkind.class));
        cards.add(new SetCardInfo("Legion Loyalty", 31, Rarity.MYTHIC, mage.cards.l.LegionLoyalty.class));
        cards.add(
                new SetCardInfo("Leyline of Anticipation", 726, Rarity.RARE, mage.cards.l.LeylineOfAnticipation.class));
        cards.add(new SetCardInfo("Light Up the Stage", 802, Rarity.UNCOMMON, mage.cards.l.LightUpTheStage.class));
        cards.add(new SetCardInfo("Lightning Bolt", 187, Rarity.COMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Lightning Greaves", 864, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Livaan, Cultist of Tiamat", 188, Rarity.UNCOMMON,
                mage.cards.l.LivaanCultistOfTiamat.class));
        cards.add(new SetCardInfo("Loot Dispute", 677, Rarity.RARE, mage.cards.l.LootDispute.class));
        cards.add(new SetCardInfo("Lovestruck Beast", 827, Rarity.RARE, mage.cards.l.LovestruckBeast.class));
        cards.add(new SetCardInfo("Lozhan, Dragons' Legacy", 281, Rarity.UNCOMMON,
                mage.cards.l.LozhanDragonsLegacy.class));
        cards.add(
                new SetCardInfo("Lulu, Loyal Hollyphant", 32, Rarity.UNCOMMON, mage.cards.l.LuluLoyalHollyphant.class));
        cards.add(new SetCardInfo("Lurking Green Dragon", 239, Rarity.COMMON, mage.cards.l.LurkingGreenDragon.class));
        cards.add(new SetCardInfo("Luxury Suite", 355, Rarity.RARE, mage.cards.l.LuxurySuite.class));
        cards.add(new SetCardInfo("Mage's Attendant", 698, Rarity.UNCOMMON, mage.cards.m.MagesAttendant.class));
        cards.add(new SetCardInfo("Magus of the Balance", 699, Rarity.RARE, mage.cards.m.MagusOfTheBalance.class));
        cards.add(new SetCardInfo("Mahadi, Emporium Master", 282, Rarity.UNCOMMON,
                mage.cards.m.MahadiEmporiumMaster.class));
        cards.add(new SetCardInfo("Majestic Genesis", 240, Rarity.MYTHIC, mage.cards.m.MajesticGenesis.class));
        cards.add(new SetCardInfo("Malakir Blood-Priest", 760, Rarity.COMMON, mage.cards.m.MalakirBloodPriest.class));
        cards.add(new SetCardInfo("Managorger Hydra", 828, Rarity.RARE, mage.cards.m.ManagorgerHydra.class));
        cards.add(new SetCardInfo("Manifold Key", 319, Rarity.UNCOMMON, mage.cards.m.ManifoldKey.class));
        cards.add(new SetCardInfo("Manor Gate", 356, Rarity.COMMON, mage.cards.m.ManorGate.class));
        cards.add(new SetCardInfo("Marble Diamond", 320, Rarity.COMMON, mage.cards.m.MarbleDiamond.class));
        cards.add(new SetCardInfo("Marching Duodrone", 321, Rarity.COMMON, mage.cards.m.MarchingDuodrone.class));
        cards.add(new SetCardInfo("Mardu Strike Leader", 761, Rarity.RARE, mage.cards.m.MarduStrikeLeader.class));
        cards.add(new SetCardInfo("Martial Impetus", 33, Rarity.COMMON, mage.cards.m.MartialImpetus.class));
        cards.add(new SetCardInfo("Marut", 322, Rarity.COMMON, mage.cards.m.Marut.class));
        cards.add(new SetCardInfo("Maskwood Nexus", 865, Rarity.RARE, mage.cards.m.MaskwoodNexus.class));
        cards.add(new SetCardInfo("Mazzy, Truesword Paladin", 283, Rarity.RARE,
                mage.cards.m.MazzyTrueswordPaladin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mazzy, Truesword Paladin", 430, Rarity.RARE,
                mage.cards.m.MazzyTrueswordPaladin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mazzy, Truesword Paladin", 541, Rarity.RARE,
                mage.cards.m.MazzyTrueswordPaladin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Memory Plunder", 849, Rarity.RARE, mage.cards.m.MemoryPlunder.class));
        cards.add(new SetCardInfo("Meteor Golem", 323, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Midnight Clock", 727, Rarity.RARE, mage.cards.m.MidnightClock.class));
        cards.add(
                new SetCardInfo("Mighty Servant of Leuk-o", 324, Rarity.RARE, mage.cards.m.MightyServantOfLeukO.class));
        cards.add(new SetCardInfo("Miirym, Sentinel Wyrm", 284, Rarity.RARE, mage.cards.m.MiirymSentinelWyrm.class));
        cards.add(new SetCardInfo("Mikaeus, the Lunarch", 700, Rarity.MYTHIC, mage.cards.m.MikaeusTheLunarch.class));
        cards.add(new SetCardInfo("Mind Flayer", 728, Rarity.RARE, mage.cards.m.MindFlayer.class));
        cards.add(new SetCardInfo("Mind Stone", 325, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mindblade Render", 762, Rarity.RARE, mage.cards.m.MindbladeRender.class));
        cards.add(new SetCardInfo("Mindcrank", 866, Rarity.UNCOMMON, mage.cards.m.Mindcrank.class));
        cards.add(new SetCardInfo("Minimus Containment", 34, Rarity.COMMON, mage.cards.m.MinimusContainment.class));
        cards.add(new SetCardInfo("Minsc & Boo, Timeless Heroes", 285, Rarity.MYTHIC,
                mage.cards.m.MinscBooTimelessHeroes.class));
        cards.add(new SetCardInfo("Mirror Entity", 701, Rarity.RARE, mage.cards.m.MirrorEntity.class));
        cards.add(new SetCardInfo("Mizzium Mortars", 803, Rarity.RARE, mage.cards.m.MizziumMortars.class));
        cards.add(new SetCardInfo("Mocking Doppelganger", 667, Rarity.RARE, mage.cards.m.MockingDoppelganger.class));
        cards.add(new SetCardInfo("Modify Memory", 83, Rarity.UNCOMMON, mage.cards.m.ModifyMemory.class));
        cards.add(new SetCardInfo("Mold Folk", 133, Rarity.COMMON, mage.cards.m.MoldFolk.class));
        cards.add(new SetCardInfo("Monster Manual", 242, Rarity.RARE, mage.cards.m.MonsterManual.class));
        cards.add(new SetCardInfo("Moonshae Pixie", 84, Rarity.UNCOMMON, mage.cards.m.MoonshaePixie.class));
        cards.add(new SetCardInfo("Morphic Pool", 357, Rarity.RARE, mage.cards.m.MorphicPool.class));
        cards.add(new SetCardInfo("Mortuary Mire", 900, Rarity.COMMON, mage.cards.m.MortuaryMire.class));
        cards.add(new SetCardInfo("Moss Diamond", 327, Rarity.COMMON, mage.cards.m.MossDiamond.class));
        cards.add(new SetCardInfo("Mossfire Valley", 901, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 902, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Mother of Runes", 702, Rarity.UNCOMMON, mage.cards.m.MotherOfRunes.class));
        cards.add(new SetCardInfo("Mountain", 463, Rarity.LAND, mage.cards.basiclands.Mountain.class,
                NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Multiclass Baldric", 684, Rarity.RARE, mage.cards.m.MulticlassBaldric.class));
        cards.add(new SetCardInfo("Murder", 134, Rarity.COMMON, mage.cards.m.Murder.class));
        cards.add(new SetCardInfo("Mutavault", 903, Rarity.RARE, mage.cards.m.Mutavault.class));
        cards.add(new SetCardInfo("Myconid Spore Tender", 243, Rarity.COMMON, mage.cards.m.MyconidSporeTender.class));
        cards.add(new SetCardInfo("Myriad Landscape", 904, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Myrkul's Edict", 135, Rarity.COMMON, mage.cards.m.MyrkulsEdict.class));
        cards.add(new SetCardInfo("Myrkul's Invoker", 136, Rarity.COMMON, mage.cards.m.MyrkulsInvoker.class));
        cards.add(new SetCardInfo("Myrkul, Lord of Bones", 287, Rarity.RARE, mage.cards.m.MyrkulLordOfBones.class));
        cards.add(new SetCardInfo("Mystery Key", 85, Rarity.UNCOMMON, mage.cards.m.MysteryKey.class));
        cards.add(new SetCardInfo("Nalia de'Arnise", 649, Rarity.MYTHIC, mage.cards.n.NaliaDeArnise.class));
        cards.add(new SetCardInfo("Natural Reclamation", 829, Rarity.COMMON, mage.cards.n.NaturalReclamation.class));
        cards.add(new SetCardInfo("Nature's Lore", 244, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Nautiloid Ship", 328, Rarity.MYTHIC, mage.cards.n.NautiloidShip.class));
        cards.add(new SetCardInfo("Navigation Orb", 329, Rarity.COMMON, mage.cards.n.NavigationOrb.class));
        cards.add(new SetCardInfo("Neera, Wild Mage", 288, Rarity.RARE, mage.cards.n.NeeraWildMage.class));
        cards.add(new SetCardInfo("Nefarious Imp", 137, Rarity.COMMON, mage.cards.n.NefariousImp.class));
        cards.add(new SetCardInfo("Nemesis Phoenix", 189, Rarity.UNCOMMON, mage.cards.n.NemesisPhoenix.class));
        cards.add(new SetCardInfo("Nemesis of Reason", 850, Rarity.RARE, mage.cards.n.NemesisOfReason.class));
        cards.add(new SetCardInfo("Nephalia Drownyard", 905, Rarity.RARE, mage.cards.n.NephaliaDrownyard.class));
        cards.add(new SetCardInfo("Nighthawk Scavenger", 763, Rarity.RARE, mage.cards.n.NighthawkScavenger.class));
        cards.add(new SetCardInfo("Nighthowler", 764, Rarity.RARE, mage.cards.n.Nighthowler.class));
        cards.add(new SetCardInfo("Nihilith", 765, Rarity.RARE, mage.cards.n.Nihilith.class));
        cards.add(new SetCardInfo("Nimbleclaw Adept", 86, Rarity.COMMON, mage.cards.n.NimbleclawAdept.class));
        cards.add(new SetCardInfo("Nimblewright Schematic", 330, Rarity.COMMON,
                mage.cards.n.NimblewrightSchematic.class));
        cards.add(new SetCardInfo("Nine-Fingers Keene", 289, Rarity.RARE, mage.cards.n.NineFingersKeene.class));
        cards.add(new SetCardInfo("Niv-Mizzet, Parun", 851, Rarity.RARE, mage.cards.n.NivMizzetParun.class));
        cards.add(new SetCardInfo("Noble's Purse", 331, Rarity.UNCOMMON, mage.cards.n.NoblesPurse.class));
        cards.add(new SetCardInfo("Nothic", 138, Rarity.UNCOMMON, mage.cards.n.Nothic.class));
        cards.add(new SetCardInfo("Oceanus Dragon", 87, Rarity.COMMON, mage.cards.o.OceanusDragon.class));
        cards.add(new SetCardInfo("Oji, the Exquisite Blade", 290, Rarity.UNCOMMON,
                mage.cards.o.OjiTheExquisiteBlade.class));
        cards.add(new SetCardInfo("Order of Whiteclay", 703, Rarity.RARE, mage.cards.o.OrderOfWhiteclay.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 906, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Signet", 867, Rarity.UNCOMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Outpost Siege", 804, Rarity.RARE, mage.cards.o.OutpostSiege.class));
        cards.add(new SetCardInfo("Overcharged Amalgam", 729, Rarity.RARE, mage.cards.o.OverchargedAmalgam.class));
        cards.add(new SetCardInfo("Overwhelming Encounter", 245, Rarity.UNCOMMON,
                mage.cards.o.OverwhelmingEncounter.class));
        cards.add(new SetCardInfo("Owlbear Cub", 246, Rarity.RARE, mage.cards.o.OwlbearCub.class));
        cards.add(new SetCardInfo("Owlbear Shepherd", 247, Rarity.UNCOMMON, mage.cards.o.OwlbearShepherd.class));
        cards.add(new SetCardInfo("Pack Attack", 190, Rarity.COMMON, mage.cards.p.PackAttack.class));
        cards.add(new SetCardInfo("Pact Weapon", 139, Rarity.MYTHIC, mage.cards.p.PactWeapon.class,
                NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pact Weapon", 576, Rarity.MYTHIC, mage.cards.p.PactWeapon.class,
                NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Parasitic Impetus", 140, Rarity.COMMON, mage.cards.p.ParasiticImpetus.class));
        cards.add(new SetCardInfo("Passageway Seer", 141, Rarity.UNCOMMON, mage.cards.p.PassagewaySeer.class));
        cards.add(new SetCardInfo("Passionate Archaeologist", 656, Rarity.MYTHIC,
                mage.cards.p.PassionateArchaeologist.class));
        cards.add(new SetCardInfo("Path of Ancestry", 907, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Patriar's Seal", 332, Rarity.UNCOMMON, mage.cards.p.PatriarsSeal.class));
        cards.add(new SetCardInfo("Patron of the Arts", 191, Rarity.COMMON, mage.cards.p.PatronOfTheArts.class));
        cards.add(new SetCardInfo("Pegasus Guardian", 36, Rarity.COMMON, mage.cards.p.PegasusGuardian.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 766, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Phyrexian Revoker", 868, Rarity.RARE, mage.cards.p.PhyrexianRevoker.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 333, Rarity.COMMON, mage.cards.p.PilgrimsEye.class));
        cards.add(new SetCardInfo("Plague Spitter", 767, Rarity.UNCOMMON, mage.cards.p.PlagueSpitter.class));
        cards.add(
                new SetCardInfo("Plains", 451, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Poison the Blade", 248, Rarity.COMMON, mage.cards.p.PoisonTheBlade.class));
        cards.add(new SetCardInfo("Pontiff of Blight", 768, Rarity.RARE, mage.cards.p.PontiffOfBlight.class));
        cards.add(new SetCardInfo("Popular Entertainer", 192, Rarity.RARE, mage.cards.p.PopularEntertainer.class));
        cards.add(new SetCardInfo("Port of Karfell", 908, Rarity.UNCOMMON, mage.cards.p.PortOfKarfell.class));
        cards.add(new SetCardInfo("Predatory Impetus", 249, Rarity.COMMON, mage.cards.p.PredatoryImpetus.class));
        cards.add(
                new SetCardInfo("Priest of Ancient Lore", 704, Rarity.COMMON, mage.cards.p.PriestOfAncientLore.class));
        cards.add(new SetCardInfo("Primeval Bounty", 830, Rarity.MYTHIC, mage.cards.p.PrimevalBounty.class));
        cards.add(new SetCardInfo("Prismari Campus", 909, Rarity.COMMON, mage.cards.p.PrismariCampus.class));
        cards.add(new SetCardInfo("Prized Statue", 334, Rarity.COMMON, mage.cards.p.PrizedStatue.class));
        cards.add(new SetCardInfo("Propaganda", 730, Rarity.UNCOMMON, mage.cards.p.Propaganda.class));
        cards.add(new SetCardInfo("Prophetic Prism", 335, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Pseudodragon Familiar", 88, Rarity.COMMON, mage.cards.p.PseudodragonFamiliar.class));
        cards.add(new SetCardInfo("Psionic Ritual", 668, Rarity.RARE, mage.cards.p.PsionicRitual.class));
        cards.add(new SetCardInfo("Psychic Impetus", 89, Rarity.COMMON, mage.cards.p.PsychicImpetus.class));
        cards.add(new SetCardInfo("Psychosis Crawler", 869, Rarity.RARE, mage.cards.p.PsychosisCrawler.class));
        cards.add(new SetCardInfo("Pull from Tomorrow", 731, Rarity.RARE, mage.cards.p.PullFromTomorrow.class));
        cards.add(new SetCardInfo("Puppeteer Clique", 769, Rarity.RARE, mage.cards.p.PuppeteerClique.class));
        cards.add(new SetCardInfo("Pursued Whale", 732, Rarity.RARE, mage.cards.p.PursuedWhale.class));
        cards.add(new SetCardInfo("Raggadragga, Goreguts Boss", 291, Rarity.RARE,
                mage.cards.r.RaggadraggaGoregutsBoss.class));
        cards.add(new SetCardInfo("Raging Ravine", 910, Rarity.RARE, mage.cards.r.RagingRavine.class));
        cards.add(new SetCardInfo("Raised by Giants", 250, Rarity.RARE, mage.cards.r.RaisedByGiants.class));
        cards.add(new SetCardInfo("Raphael, Fiendish Savior", 292, Rarity.RARE,
                mage.cards.r.RaphaelFiendishSavior.class));
        cards.add(new SetCardInfo("Rasaad yn Bashir", 37, Rarity.UNCOMMON, mage.cards.r.RasaadYnBashir.class));
        cards.add(new SetCardInfo("Ravenloft Adventurer", 142, Rarity.RARE, mage.cards.r.RavenloftAdventurer.class));
        cards.add(new SetCardInfo("Ravenous Chupacabra", 770, Rarity.UNCOMMON, mage.cards.r.RavenousChupacabra.class));
        cards.add(new SetCardInfo("Reckless Barbarian", 193, Rarity.COMMON, mage.cards.r.RecklessBarbarian.class));
        cards.add(new SetCardInfo("Recruitment Drive", 38, Rarity.COMMON, mage.cards.r.RecruitmentDrive.class));
        cards.add(new SetCardInfo("Reflecting Pool", 358, Rarity.RARE, mage.cards.r.ReflectingPool.class));
        cards.add(
                new SetCardInfo("Reflections of Littjara", 733, Rarity.RARE, mage.cards.r.ReflectionsOfLittjara.class));
        cards.add(new SetCardInfo("Reins of Power", 734, Rarity.RARE, mage.cards.r.ReinsOfPower.class));
        cards.add(new SetCardInfo("Reliquary Tower", 911, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Renari, Merchant of Marvels", 90, Rarity.UNCOMMON,
                mage.cards.r.RenariMerchantOfMarvels.class));
        cards.add(new SetCardInfo("Rescuer Chwinga", 39, Rarity.UNCOMMON, mage.cards.r.RescuerChwinga.class));
        cards.add(new SetCardInfo("Return of the Wildspeaker", 831, Rarity.RARE,
                mage.cards.r.ReturnOfTheWildspeaker.class));
        cards.add(new SetCardInfo("Rilsa Rael, Kingpin", 293, Rarity.UNCOMMON, mage.cards.r.RilsaRaelKingpin.class));
        cards.add(new SetCardInfo("River of Tears", 912, Rarity.RARE, mage.cards.r.RiverOfTears.class));
        cards.add(new SetCardInfo("Robe of the Archmagi", 91, Rarity.RARE, mage.cards.r.RobeOfTheArchmagi.class));
        cards.add(new SetCardInfo("Rogue's Passage", 913, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Roving Harper", 40, Rarity.COMMON, mage.cards.r.RovingHarper.class));
        cards.add(new SetCardInfo("Rowan Kenrith", 805, Rarity.MYTHIC, mage.cards.r.RowanKenrith.class));
        cards.add(new SetCardInfo("Rug of Smothering", 336, Rarity.UNCOMMON, mage.cards.r.RugOfSmothering.class));
        cards.add(new SetCardInfo("Rumor Gatherer", 705, Rarity.UNCOMMON, mage.cards.r.RumorGatherer.class));
        cards.add(new SetCardInfo("Run Away Together", 92, Rarity.COMMON, mage.cards.r.RunAwayTogether.class));
        cards.add(
                new SetCardInfo("Ryusei, the Falling Star", 806, Rarity.RARE, mage.cards.r.RyuseiTheFallingStar.class));
        cards.add(new SetCardInfo("Saddle of the Cavalier", 251, Rarity.UNCOMMON,
                mage.cards.s.SaddleOfTheCavalier.class));
        cards.add(new SetCardInfo("Safana, Calimport Cutthroat", 143, Rarity.UNCOMMON,
                mage.cards.s.SafanaCalimportCutthroat.class));
        cards.add(new SetCardInfo("Sailors' Bane", 93, Rarity.UNCOMMON, mage.cards.s.SailorsBane.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 832, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Sandwurm Convergence", 833, Rarity.RARE, mage.cards.s.SandwurmConvergence.class));
        cards.add(new SetCardInfo("Sapphire Dragon", 94, Rarity.UNCOMMON, mage.cards.s.SapphireDragon.class));
        cards.add(new SetCardInfo("Sarevok's Tome", 685, Rarity.RARE, mage.cards.s.SarevoksTome.class));
        cards.add(
                new SetCardInfo("Sarevok, Deathbringer", 144, Rarity.UNCOMMON, mage.cards.s.SarevokDeathbringer.class));
        cards.add(new SetCardInfo("Scaled Nurturer", 252, Rarity.COMMON, mage.cards.s.ScaledNurturer.class));
        cards.add(new SetCardInfo("Scion of Halaster", 145, Rarity.COMMON, mage.cards.s.ScionOfHalaster.class));
        cards.add(new SetCardInfo("Scouting Hawk", 41, Rarity.COMMON, mage.cards.s.ScoutingHawk.class));
        cards.add(new SetCardInfo("Sculpted Sunburst", 42, Rarity.RARE, mage.cards.s.SculptedSunburst.class));
        cards.add(new SetCardInfo("Sea Gate", 359, Rarity.COMMON, mage.cards.s.SeaGate.class));
        cards.add(new SetCardInfo("Sea Hag", 95, Rarity.COMMON, mage.cards.s.SeaHag.class));
        cards.add(new SetCardInfo("Sea of Clouds", 360, Rarity.RARE, mage.cards.s.SeaOfClouds.class));
        cards.add(new SetCardInfo("Search for Tomorrow", 834, Rarity.COMMON, mage.cards.s.SearchForTomorrow.class));
        cards.add(new SetCardInfo("Seasoned Dungeoneer", 660, Rarity.RARE, mage.cards.s.SeasonedDungeoneer.class));
        cards.add(new SetCardInfo("Selfless Spirit", 706, Rarity.RARE, mage.cards.s.SelflessSpirit.class));
        cards.add(new SetCardInfo("Sevinne's Reclamation", 707, Rarity.RARE, mage.cards.s.SevinnesReclamation.class));
        cards.add(new SetCardInfo("Sewer Nemesis", 771, Rarity.RARE, mage.cards.s.SewerNemesis.class));
        cards.add(new SetCardInfo("Shadowheart, Dark Justiciar", 146, Rarity.RARE,
                mage.cards.s.ShadowheartDarkJusticiar.class));
        cards.add(new SetCardInfo("Shambling Vent", 914, Rarity.RARE, mage.cards.s.ShamblingVent.class));
        cards.add(new SetCardInfo("Shameless Charlatan", 96, Rarity.RARE, mage.cards.s.ShamelessCharlatan.class));
        cards.add(new SetCardInfo("Sharpshooter Elf", 253, Rarity.UNCOMMON, mage.cards.s.SharpshooterElf.class));
        cards.add(new SetCardInfo("Shiny Impetus", 194, Rarity.COMMON, mage.cards.s.ShinyImpetus.class));
        cards.add(new SetCardInfo("Sigil of Myrkul", 147, Rarity.UNCOMMON, mage.cards.s.SigilOfMyrkul.class));
        cards.add(new SetCardInfo("Silvanus's Invoker", 254, Rarity.COMMON, mage.cards.s.SilvanussInvoker.class));
        cards.add(new SetCardInfo("Sivriss, Nightmare Speaker", 148, Rarity.UNCOMMON,
                mage.cards.s.SivrissNightmareSpeaker.class));
        cards.add(new SetCardInfo("Skanos Dragonheart", 255, Rarity.UNCOMMON, mage.cards.s.SkanosDragonheart.class));
        cards.add(new SetCardInfo("Skullclamp", 870, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skullport Merchant", 149, Rarity.UNCOMMON, mage.cards.s.SkullportMerchant.class));
        cards.add(new SetCardInfo("Skullwinder", 256, Rarity.UNCOMMON, mage.cards.s.Skullwinder.class));
        cards.add(new SetCardInfo("Sky Diamond", 337, Rarity.COMMON, mage.cards.s.SkyDiamond.class));
        cards.add(new SetCardInfo("Slaughter the Strong", 43, Rarity.UNCOMMON, mage.cards.s.SlaughterTheStrong.class));
        cards.add(new SetCardInfo("Sludge Monster", 735, Rarity.RARE, mage.cards.s.SludgeMonster.class));
        cards.add(new SetCardInfo("Sly Instigator", 736, Rarity.RARE, mage.cards.s.SlyInstigator.class));
        cards.add(new SetCardInfo("Snowfield Sinkhole", 915, Rarity.COMMON, mage.cards.s.SnowfieldSinkhole.class));
        cards.add(new SetCardInfo("Sol Ring", 871, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Doomguide", 672, Rarity.RARE, mage.cards.s.SolemnDoomguide.class));
        cards.add(new SetCardInfo("Solemn Recruit", 708, Rarity.RARE, mage.cards.s.SolemnRecruit.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 872, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Spectacular Showdown", 679, Rarity.RARE, mage.cards.s.SpectacularShowdown.class));
        cards.add(new SetCardInfo("Spellskite", 873, Rarity.RARE, mage.cards.s.Spellskite.class));
        cards.add(new SetCardInfo("Spinerock Knoll", 916, Rarity.RARE, mage.cards.s.SpinerockKnoll.class));
        cards.add(new SetCardInfo("Spire Garden", 361, Rarity.RARE, mage.cards.s.SpireGarden.class));
        cards.add(new SetCardInfo("Split the Spoils", 257, Rarity.UNCOMMON, mage.cards.s.SplitTheSpoils.class));
        cards.add(new SetCardInfo("Sprite Dragon", 852, Rarity.UNCOMMON, mage.cards.s.SpriteDragon.class));
        cards.add(new SetCardInfo("Squad Commander", 709, Rarity.RARE, mage.cards.s.SquadCommander.class));
        cards.add(new SetCardInfo("Starlit Sanctum", 917, Rarity.UNCOMMON, mage.cards.s.StarlitSanctum.class));
        cards.add(new SetCardInfo("Steadfast Unicorn", 44, Rarity.COMMON, mage.cards.s.SteadfastUnicorn.class));
        cards.add(new SetCardInfo("Steel Hellkite", 874, Rarity.RARE, mage.cards.s.SteelHellkite.class));
        cards.add(new SetCardInfo("Stick Together", 661, Rarity.RARE, mage.cards.s.StickTogether.class));
        cards.add(new SetCardInfo("Stirge", 150, Rarity.COMMON, mage.cards.s.Stirge.class));
        cards.add(new SetCardInfo("Stirring Bard", 195, Rarity.COMMON, mage.cards.s.StirringBard.class));
        cards.add(new SetCardInfo("Stolen Strategy", 807, Rarity.RARE, mage.cards.s.StolenStrategy.class));
        cards.add(new SetCardInfo("Stoneskin", 45, Rarity.UNCOMMON, mage.cards.s.Stoneskin.class));
        cards.add(
                new SetCardInfo("Stonespeaker Crystal", 338, Rarity.UNCOMMON, mage.cards.s.StonespeakerCrystal.class));
        cards.add(new SetCardInfo("Storm King's Thunder", 196, Rarity.MYTHIC, mage.cards.s.StormKingsThunder.class));
        cards.add(new SetCardInfo("Street Urchin", 197, Rarity.UNCOMMON, mage.cards.s.StreetUrchin.class));
        cards.add(new SetCardInfo("Stuffy Doll", 875, Rarity.RARE, mage.cards.s.StuffyDoll.class));
        cards.add(new SetCardInfo("Stunning Strike", 97, Rarity.COMMON, mage.cards.s.StunningStrike.class));
        cards.add(new SetCardInfo("Summon Undead", 151, Rarity.COMMON, mage.cards.s.SummonUndead.class));
        cards.add(new SetCardInfo("Sunken Hollow", 918, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Swamp", 459, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swashbuckler Extraordinaire", 198, Rarity.UNCOMMON,
                mage.cards.s.SwashbucklerExtraordinaire.class));
        cards.add(new SetCardInfo("Sweet-Gum Recluse", 835, Rarity.RARE, mage.cards.s.SweetGumRecluse.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 339, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Sword Coast Sailor", 98, Rarity.UNCOMMON, mage.cards.s.SwordCoastSailor.class));
        cards.add(new SetCardInfo("Sword Coast Serpent", 99, Rarity.COMMON, mage.cards.s.SwordCoastSerpent.class));
        cards.add(new SetCardInfo("Syphon Mind", 772, Rarity.COMMON, mage.cards.s.SyphonMind.class));
        cards.add(new SetCardInfo("Tabaxi Toucaneers", 46, Rarity.COMMON, mage.cards.t.TabaxiToucaneers.class));
        cards.add(new SetCardInfo("Tainted Field", 919, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Tainted Isle", 920, Rarity.UNCOMMON, mage.cards.t.TaintedIsle.class));
        cards.add(new SetCardInfo("Talisman of Creativity", 876, Rarity.UNCOMMON,
                mage.cards.t.TalismanOfCreativity.class));
        cards.add(
                new SetCardInfo("Talisman of Dominance", 877, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(
                new SetCardInfo("Talisman of Hierarchy", 878, Rarity.UNCOMMON, mage.cards.t.TalismanOfHierarchy.class));
        cards.add(new SetCardInfo("Tasha, the Witch Queen", 294, Rarity.MYTHIC, mage.cards.t.TashaTheWitchQueen.class));
        cards.add(new SetCardInfo("Taunting Kobold", 199, Rarity.UNCOMMON, mage.cards.t.TauntingKobold.class));
        cards.add(new SetCardInfo("Tavern Brawler", 200, Rarity.COMMON, mage.cards.t.TavernBrawler.class));
        cards.add(new SetCardInfo("Tectonic Giant", 808, Rarity.RARE, mage.cards.t.TectonicGiant.class));
        cards.add(new SetCardInfo("Temple of Abandon", 921, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Deceit", 922, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 923, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Silence", 924, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of the False God", 925, Rarity.UNCOMMON,
                mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Terrain Generator", 926, Rarity.UNCOMMON, mage.cards.t.TerrainGenerator.class));
        cards.add(new SetCardInfo("Terramorph", 836, Rarity.UNCOMMON, mage.cards.t.Terramorph.class));
        cards.add(new SetCardInfo("Territorial Hellkite", 809, Rarity.RARE, mage.cards.t.TerritorialHellkite.class));
        cards.add(new SetCardInfo("The Akroan War", 777, Rarity.RARE, mage.cards.t.TheAkroanWar.class));
        cards.add(new SetCardInfo("The Council of Four", 271, Rarity.RARE, mage.cards.t.TheCouncilOfFour.class));
        cards.add(new SetCardInfo("Thieves' Tools", 152, Rarity.COMMON, mage.cards.t.ThievesTools.class));
        cards.add(new SetCardInfo("Thought Vessel", 879, Rarity.UNCOMMON, mage.cards.t.ThoughtVessel.class));
        cards.add(new SetCardInfo("Thrakkus the Butcher", 295, Rarity.UNCOMMON, mage.cards.t.ThrakkusTheButcher.class));
        cards.add(new SetCardInfo("Three Visits", 837, Rarity.UNCOMMON, mage.cards.t.ThreeVisits.class));
        cards.add(new SetCardInfo("Thunder Dragon", 810, Rarity.RARE, mage.cards.t.ThunderDragon.class));
        cards.add(new SetCardInfo("Thunderwave", 201, Rarity.UNCOMMON, mage.cards.t.Thunderwave.class));
        cards.add(new SetCardInfo("Thwart the Grave", 773, Rarity.UNCOMMON, mage.cards.t.ThwartTheGrave.class));
        cards.add(new SetCardInfo("Tiamat's Fanatics", 202, Rarity.COMMON, mage.cards.t.TiamatsFanatics.class));
        cards.add(new SetCardInfo("Tomb of Horrors Adventurer", 100, Rarity.RARE,
                mage.cards.t.TombOfHorrorsAdventurer.class));
        cards.add(new SetCardInfo("Topaz Dragon", 153, Rarity.UNCOMMON, mage.cards.t.TopazDragon.class));
        cards.add(new SetCardInfo("Trailblazer's Torch", 340, Rarity.COMMON, mage.cards.t.TrailblazersTorch.class));
        cards.add(new SetCardInfo("Traverse the Outlands", 258, Rarity.RARE, mage.cards.t.TraverseTheOutlands.class));
        cards.add(new SetCardInfo("Treasure Keeper", 341, Rarity.UNCOMMON, mage.cards.t.TreasureKeeper.class));
        cards.add(new SetCardInfo("Two-Handed Axe", 203, Rarity.UNCOMMON, mage.cards.t.TwoHandedAxe.class));
        cards.add(new SetCardInfo("Tymora's Invoker", 101, Rarity.COMMON, mage.cards.t.TymorasInvoker.class));
        cards.add(new SetCardInfo("Uchuulon", 673, Rarity.RARE, mage.cards.u.Uchuulon.class));
        cards.add(new SetCardInfo("Unbreakable Formation", 710, Rarity.RARE, mage.cards.u.UnbreakableFormation.class));
        cards.add(new SetCardInfo("Undercellar Myconid", 259, Rarity.COMMON, mage.cards.u.UndercellarMyconid.class));
        cards.add(new SetCardInfo("Undercellar Sweep", 47, Rarity.UNCOMMON, mage.cards.u.UndercellarSweep.class));
        cards.add(new SetCardInfo("Underdark Explorer", 154, Rarity.COMMON, mage.cards.u.UnderdarkExplorer.class));
        cards.add(new SetCardInfo("Undermountain Adventurer", 260, Rarity.RARE,
                mage.cards.u.UndermountainAdventurer.class));
        cards.add(new SetCardInfo("Universal Solvent", 342, Rarity.COMMON, mage.cards.u.UniversalSolvent.class));
        cards.add(new SetCardInfo("Urabrask the Hidden", 811, Rarity.MYTHIC, mage.cards.u.UrabraskTheHidden.class));
        cards.add(new SetCardInfo("Valiant Changeling", 711, Rarity.UNCOMMON, mage.cards.v.ValiantChangeling.class));
        cards.add(new SetCardInfo("Vault of the Archangel", 927, Rarity.RARE, mage.cards.v.VaultOfTheArchangel.class));
        cards.add(new SetCardInfo("Vengeful Ancestor", 812, Rarity.RARE, mage.cards.v.VengefulAncestor.class));
        cards.add(new SetCardInfo("Venture Forth", 683, Rarity.RARE, mage.cards.v.VentureForth.class));
        cards.add(new SetCardInfo("Veteran Soldier", 48, Rarity.UNCOMMON, mage.cards.v.VeteranSoldier.class));
        cards.add(new SetCardInfo("Vexing Puzzlebox", 343, Rarity.MYTHIC, mage.cards.v.VexingPuzzlebox.class));
        cards.add(new SetCardInfo("Vicious Battlerager", 155, Rarity.COMMON, mage.cards.v.ViciousBattlerager.class));
        cards.add(new SetCardInfo("Viconia, Drow Apostate", 156, Rarity.UNCOMMON,
                mage.cards.v.ViconiaDrowApostate.class));
        cards.add(new SetCardInfo("Vivien, Champion of the Wilds", 838, Rarity.RARE,
                mage.cards.v.VivienChampionOfTheWilds.class));
        cards.add(new SetCardInfo("Volcanic Torrent", 813, Rarity.UNCOMMON, mage.cards.v.VolcanicTorrent.class));
        cards.add(new SetCardInfo("Volo, Itinerant Scholar", 103, Rarity.MYTHIC,
                mage.cards.v.VoloItinerantScholar.class));
        cards.add(new SetCardInfo("Vrock", 157, Rarity.UNCOMMON, mage.cards.v.Vrock.class));
        cards.add(new SetCardInfo("Wand of Wonder", 204, Rarity.RARE, mage.cards.w.WandOfWonder.class));
        cards.add(new SetCardInfo("Wandering Fumarole", 928, Rarity.RARE, mage.cards.w.WanderingFumarole.class));
        cards.add(new SetCardInfo("War Room", 929, Rarity.RARE, mage.cards.w.WarRoom.class));
        cards.add(new SetCardInfo("Warehouse Thief", 205, Rarity.COMMON, mage.cards.w.WarehouseThief.class));
        cards.add(new SetCardInfo("Warmonger Hellkite", 814, Rarity.RARE, mage.cards.w.WarmongerHellkite.class));
        cards.add(new SetCardInfo("Warstorm Surge", 815, Rarity.RARE, mage.cards.w.WarstormSurge.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 344, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Wharf Infiltrator", 737, Rarity.RARE, mage.cards.w.WharfInfiltrator.class));
        cards.add(new SetCardInfo("White Plume Adventurer", 49, Rarity.RARE, mage.cards.w.WhitePlumeAdventurer.class));
        cards.add(new SetCardInfo("Wild Magic Surge", 206, Rarity.UNCOMMON, mage.cards.w.WildMagicSurge.class));
        cards.add(new SetCardInfo("Wild-Magic Sorcerer", 816, Rarity.RARE, mage.cards.w.WildMagicSorcerer.class));
        cards.add(new SetCardInfo("Will Kenrith", 738, Rarity.MYTHIC, mage.cards.w.WillKenrith.class));
        cards.add(new SetCardInfo("Wilson, Refined Grizzly", 261, Rarity.UNCOMMON,
                mage.cards.w.WilsonRefinedGrizzly.class));
        cards.add(new SetCardInfo("Windbrisk Heights", 930, Rarity.RARE, mage.cards.w.WindbriskHeights.class));
        cards.add(new SetCardInfo("Winter Eladrin", 104, Rarity.COMMON, mage.cards.w.WinterEladrin.class));
        cards.add(new SetCardInfo("Wizards of Thay", 105, Rarity.RARE, mage.cards.w.WizardsOfThay.class));
        cards.add(new SetCardInfo("Woe Strider", 774, Rarity.RARE, mage.cards.w.WoeStrider.class));
        cards.add(new SetCardInfo("Wrathful Red Dragon", 207, Rarity.RARE, mage.cards.w.WrathfulRedDragon.class));
        cards.add(new SetCardInfo("Wyll's Reversal", 209, Rarity.RARE, mage.cards.w.WyllsReversal.class));
        cards.add(
                new SetCardInfo("Wyll, Blade of Frontiers", 208, Rarity.RARE, mage.cards.w.WyllBladeOfFrontiers.class));
        cards.add(new SetCardInfo("Wyrm's Crossing Patrol", 51, Rarity.COMMON, mage.cards.w.WyrmsCrossingPatrol.class));
        cards.add(new SetCardInfo("Xenagos, the Reveler", 853, Rarity.MYTHIC, mage.cards.x.XenagosTheReveler.class));
        cards.add(new SetCardInfo("You Look Upon the Tarrasque", 262, Rarity.UNCOMMON,
                mage.cards.y.YouLookUponTheTarrasque.class));
        cards.add(new SetCardInfo("You Meet in a Tavern", 263, Rarity.COMMON, mage.cards.y.YouMeetInATavern.class));
        cards.add(new SetCardInfo("You're Confronted by Robbers", 53, Rarity.COMMON,
                mage.cards.y.YoureConfrontedByRobbers.class));
        cards.add(new SetCardInfo("You've Been Caught Stealing", 211, Rarity.COMMON,
                mage.cards.y.YouveBeenCaughtStealing.class));
        cards.add(new SetCardInfo("Young Blue Dragon", 106, Rarity.COMMON, mage.cards.y.YoungBlueDragon.class));
        cards.add(new SetCardInfo("Young Red Dragon", 210, Rarity.COMMON, mage.cards.y.YoungRedDragon.class));
        cards.add(new SetCardInfo("Your Temple Is Under Attack", 52, Rarity.COMMON,
                mage.cards.y.YourTempleIsUnderAttack.class));
        cards.add(new SetCardInfo("Zellix, Sanity Flayer", 652, Rarity.MYTHIC, mage.cards.z.ZellixSanityFlayer.class));
        cards.add(new SetCardInfo("Zevlor, Elturel Exile", 296, Rarity.RARE, mage.cards.z.ZevlorElturelExile.class));
        cards.add(new SetCardInfo("Zhentarim Bandit", 158, Rarity.COMMON, mage.cards.z.ZhentarimBandit.class));
        cards.add(new SetCardInfo("Zulaport Cutthroat", 775, Rarity.UNCOMMON, mage.cards.z.ZulaportCutthroat.class));
    }
}
