import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Maze {
	
	String[] Items = {"Potion","Mana Potion",
			"Super Potion", "Super Mana Potion",
			"Hyper Potion", "Hyper Mana Potion",
			"Max Restore"};
	int Potion = 5;
	int ManaPotion = 3;
	int SuperPotion = 3;
	int SuperMPotion = 2;
	int HyperPotion = 2;
	int HyperMPotion = 1;
	int MaxRestore = 1;
	int j = 0;
	String[] Weapons = {"Wooden Sword", "Wooden Staff", "Wooden Bow","Wooden Spear","Wooden Hammer","Wooden Ax","Wooden Shield",
			"Metal Sword","Metal Staff","Metal Bow","Metal Spear","Metal Hammer","Metal Ax","Metal Shield",
			"Holy Sword","Holy Staff","Holy Bow", "Holy Spear","Holy Hammer","Holy Ax","Holy Shield",
			"Demonic Sword","Demonic Staff","Demonic Bow", "Demonic Spear","Demonic Hammer","Demonic Ax","Demonic Shield", 
			"Ragnarok","Celestia","Spitfire", "Snake Bite","Zoringen", "Windtaker", "Shield of Agies"};
	String[] wooden = {"Wooden Sword", "Wooden Staff", "Wooden Bow","Wooden Spear","Wooden Hammer","Wooden Ax","Wooden Shield"};
	String[] metal = {"Metal Sword","Metal Staff","Metal Bow","Metal Spear","Metal Hammer","Metal Ax","Metal Shield"};
	String[] holy = {"Holy Sword","Holy Staff","Holy Bow", "Holy Spear","Holy Hammer","Holy Ax","Holy Shield"};
	String[] demonic = {"Demonic Sword","Demonic Staff","Demonic Bow", "Demonic Spear","Demonic Hammer","Demonic Ax","Demonic Shield"};
	String[] legend = {"Ragnarok","Celestia","Spitfire", "Snake Bite","Zoringen", "Windtaker", "Shield of Agies"};
	
	String[] WeaponType = {"Sword","Staff", "Bow", "Spear", "Hammer", "Ax", "Defender"};
	String[] Skills = {"Star Quint Prominence", "Phantom Rave",//0
			"Elemental Engery","Call of the wild",//2
			"Arcing Crossfire","Arrow Rain",//4
			"Fatal Thrust","Dimension Stampede",//6
			"Disastrophism","Varaible Blow",//8
			"Lumber Jack","Screw Dimension",//10
			"Leaver","Pancake Smash"};//12
	int playerHP = 0;
	int playerMP = 500;
	int enemyHP = 0;
	int BossHP = 0;
	int CplayerHP = 0;
	int CplayerMP = 500;
	int CenemyHP = 0;
	int CBossHP = 0;
	int Damageplayer = 0;
	int DamageEnemy = 0;
	int DamageBoss = 0;
	int SKILLS = 0;
	Music Muse = new Music();
	ImageIcon Blade2 = new ImageIcon(Maze.class.getResource("2Blade.png"));
	ImageIcon Attack = new ImageIcon(Maze.class.getResource("Attack.png"));
	ImageIcon Bat = new ImageIcon(Maze.class.getResource("Bat.png"));
	ImageIcon Defend = new ImageIcon(Maze.class.getResource("Defend.png"));
	ImageIcon Dragon = new ImageIcon(Maze.class.getResource("Dragon.png"));
	ImageIcon ElectricAngel = new ImageIcon(Maze.class.getResource("ElecticAngel.png"));
	ImageIcon Gon = new ImageIcon(Maze.class.getResource("Gon.png"));
	ImageIcon Hades = new ImageIcon(Maze.class.getResource("Hades.png"));
	ImageIcon Haunter = new ImageIcon(Maze.class.getResource("Haunter.png"));
	ImageIcon HELP = new ImageIcon(Maze.class.getResource("HELP.png"));
	ImageIcon Left = new ImageIcon(Maze.class.getResource("Left.png"));
	ImageIcon Mage = new ImageIcon(Maze.class.getResource("Mage.png"));
	ImageIcon Magnet = new ImageIcon(Maze.class.getResource("Magnet.png"));
	ImageIcon Medusa = new ImageIcon(Maze.class.getResource("Medusa.png"));
	ImageIcon Mine = new ImageIcon(Maze.class.getResource("Mine.png"));
	ImageIcon Minotaur = new ImageIcon(Maze.class.getResource("Minotaur.png"));
	ImageIcon Muk = new ImageIcon(Maze.class.getResource("Muk.png"));
	ImageIcon Orne = new ImageIcon(Maze.class.getResource("Orne.gif"));
	ImageIcon Pouch = new ImageIcon(Maze.class.getResource("Pouch.png"));
	ImageIcon QUIT = new ImageIcon(Maze.class.getResource("QUIT.png"));
	ImageIcon Rat = new ImageIcon(Maze.class.getResource("Rat.png"));
	ImageIcon Reaper = new ImageIcon(Maze.class.getResource("Reaper.png"));
	ImageIcon RICO = new ImageIcon(Maze.class.getResource("RICO.png"));
	ImageIcon Right = new ImageIcon(Maze.class.getResource("Right.png"));
	ImageIcon Run = new ImageIcon(Maze.class.getResource("Run.png"));
	ImageIcon Salandit = new ImageIcon(Maze.class.getResource("Salandit.png"));
	ImageIcon skills = new ImageIcon(Maze.class.getResource("Skills.png"));
	ImageIcon skills1 = new ImageIcon(Maze.class.getResource("Skills1.png"));
	ImageIcon skills2 = new ImageIcon(Maze.class.getResource("Skills2.png"));
	ImageIcon Snail = new ImageIcon(Maze.class.getResource("Snail.png"));
	ImageIcon Umbreon = new ImageIcon(Maze.class.getResource("Umbreon.png"));
	ImageIcon [] Monsters = {Orne,Blade2,Bat,Gon,Haunter,Mage,Magnet,Mine,Muk,Rat,Salandit,Snail,Umbreon,};
	ImageIcon [] Bosses = {Hades, Minotaur, RICO, Medusa, Reaper, ElectricAngel,Dragon};
	String[] Beasts = {"Orne","Two Sword","Bat","Gon-Gon","Haunting ghost","Mage","Magnet","Mine","Slime","Rat","Salamander","Goo Snail","Dark wolves"};
	String[] BossBeasts = {"Hades","Minotaur","Rico","Medusa","Reaper","Electric Angel","Dragon"};
	
	
	public void setLevel(int x,int y,int z,int a,int b,int c){
		playerHP = x;
		enemyHP = y;
		BossHP = z;
		CplayerHP = x;
		CenemyHP = y;
		CBossHP = z;
		Damageplayer = a;
		DamageEnemy = b;
		DamageBoss = c;
	}
	public void run(){
//		String [] buttons = {};
//		int x = JOptionPane.showOptionDialog(null,"","",0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		ImageIcon Hard = new ImageIcon(Maze.class.getResource("Hard.png"));
		ImageIcon Easy = new ImageIcon(Maze.class.getResource("Easy.png"));
		ImageIcon Normal = new ImageIcon(Maze.class.getResource("Normal.png"));
		ImageIcon [] buttons = {Easy, Normal, Hard, HELP /*,"Sudden Death"*/};
		int e = JOptionPane.showOptionDialog(null,"Welcome to the Labyrinth of death" +
				"\n You have three diffculties to choose from Easy, Normal and Hard, Player and Enemy's Health and Damage will change, Try to survive out there" +
				"\n Here is a tip, The Labryinth is ever changing and constantly moving as it takes place in the realm of space and time itself" +
				"\n All Labyrinths are randomly generated, and all solvable, also note that each labyrinth is massive and you may never head back to the same place twice"+
				"\n Also Music will be playing through out the dungeon so plug in those earbuds!" +
				"\n Disclaimers: I do not own any of the Images used in the Labyrinth, and I do not own any of the music being played, it is only for the Rico Code Challenge","Death's Labyrinth",0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		
		
		if(e == 0){
			Muse.music1();
		}if(e == 1){
			Muse.music3();
		}if(e == 2){
		Muse.music4();
			
		}if(e == 3){
			JOptionPane.showMessageDialog(null, "Death's Labyrinth \n" +
					"There are a number of things to know about Death's Labyrinth \n" +
					"First Images will be used as a majority of your options choices; however they are self explanatory and some will be explained for you\n" +
					"Second Music will play in the background; and music changes per diffculty level \n" +
					"Third You have an Inventory, which includes items and weapons, that you may find through out the labyrinth \n" +
					"Fourth You also have skills; and mana to be used for skills \n" +
					"Fifth There is a class system in the game, so use it wisely \n" +
					"Sixth There is a combat system in the game, which is implented for beating the game \n" +
					"Seventh To beat the game you either need to defeat one of a number of Boss Monsters or Escape with your life \n" +
					"Eightth If you run out of health it's or if you take too long it's game over\n" +
					"Nineth A number of normal weaker monsters will appear along your route on your way out, defeating them may drop an item; however there is no EXP in this game, making it Skill based and not leveled based \n");
			run();
		}
		
//		Maze M = new Maze();
//		M.home();
	}
	
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
		
	}
	public void gameoverMusic(){
		Muse.music5();
	}
	public void gameover(){
		msg("It seems that the hero has fallen" +
				"\n Try again when you can; maybe play a lower diffculty even" +
				"\n Your body remains in the Labyrinth forever");
		System.exit(0);
	}
	int i = 0;
	int t1 = 0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;
	String turn = "";
	int k = 0;
	boolean b7 = true;
	public void LorR(){
		if(k >= 200){
			msg("This has taken you way too long, you have turned at more than 200 intersections \n" +
					"I'm sorry but i have to say... GAME OVER, try again next time");
			System.exit(0);
		}
		ImageIcon [] buttons = {Left, Right, Pouch, skills, QUIT};
		int x = JOptionPane.showOptionDialog(null,"Your Options current shown are \n" +
				"Left, Right, Inventory, Skill list and Quit \n" +
				"Player's HP "+ CplayerHP +"/" +playerHP + 
				"\n Player's Mana "+ CplayerMP +"/" +playerMP +
				"\n Player's DMG rate " + Damageplayer +
				"\n Player type " + WeaponType[i] + "\n" +
				turn,"Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		if(x == 0){
			turn = "You last turned left; Based on when you can last turn";
			int y = gene.nextInt(100)+1;
			 if(y == 1 || y == 2 || y ==3 || y == 4 || y == 5){
				itemfound();
				k++;
				LorR();
			}if(y == 6 || y == 7 || y ==8 || y == 9 || y == 10 || y == 11 || y == 12 || y ==13 || y == 14 || y == 15 || y == 16 || y == 17 || y ==18 || y == 19 || y == 20){
				msg(" You walked into a dead end\n As you turned around to head back a portal sucked you up and sent you somewhere else in the labyrinth");
				k++;
				LorR();
			}if(y == 21 || y == 22 || y ==23 || y == 24 || y == 25 || y == 26 || y == 27){
				k++;
				battleMon();
			}if(k  >=  30){
				if(y == 28 || y == 31){
					battleBossMon();
				}if (y == 29 || y == 32){
					Escape();
				}else{
					 LorR();
					}
			}if (k >= 20){
				if(y == 30){
					chest();
				}else{
					 LorR();
					}
			}else{
				k++;
				LorR();
			}
			
			
		}else if(x == 1){
			turn = "You last turned right; Based on when you can last turn";
			int y = gene.nextInt(100)+1;
			 if(y == 1 || y == 2 || y ==3 || y == 4 || y == 5){
				itemfound();
				k++;
				LorR();
			 }if(y == 6 || y == 7 || y ==8 || y == 9 || y == 10 || y == 11 || y == 12 || y ==13 || y == 14 || y == 15 || y == 16 || y == 17 || y ==18 || y == 19 || y == 20){
				msg(" You walked into a dead end\n As you turned around to head back a portal sucked you up and sent you somewhere else in the labyrinth");
				k++;
				LorR();
			}if(y == 21 || y == 22 || y ==23 || y == 24 || y == 25 || y == 26 || y == 27){
				k++;
				battleMon();
			}if(k  >=  25){
				if(y == 28){
					battleBossMon();
				}if (y == 29){
					Escape();
				}else{
					LorR();
				}
			}if (k >= 15){
				if(y == 30){
					chest();
				}else{
				 LorR();
				}
			}else{
				k++;
				LorR();
			}
			
			
		}else if(x == 2){
			inventory();
		}else if(x == 3){
			skills();
		}else{
			System.exit(0);
		}
	}
	Random gene = new Random();
	int x = 0;
	public void chooseMon(){
		x = gene.nextInt(Monsters.length);
	}
	public void chooseBossMon(){
		x = gene.nextInt(Bosses.length);
	}
	boolean b6 = true;
	public void battleBossMon(){
		if(b6 == true){
			chooseBossMon();
			b6 = false;
		}
		ImageIcon [] buttons = {Attack, Defend, Pouch, skills1, skills2, QUIT};
		int y = JOptionPane.showOptionDialog(null,"A Boss monster! " + BossBeasts[x] + " appeared! What will you do? \n" +
				BossBeasts[x] + " HP is "+ CBossHP + "/" + BossHP + "\n" +
				"Your HP "+CplayerHP+"/"+ playerHP +"Your MP"+ CplayerMP + "/" + playerMP +" Player's DMG rate " + Damageplayer +
				"\n Attack the enemy "+ 
				"\n Defend yourself" + 
				"\n Use an item "+
				"\n Use skill " + Skills[SKILLS] + " Uses 100 MP for times 2 DMG"+
				"\n Use skill " + Skills[SKILLS + 1] +" Uses 300 MP for times 10 DMG"+
				"\n Quit the game, but why would u wanna do that","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, Bosses[x], buttons, buttons);
		if(y == 0){
			CBossHP -= Damageplayer;
			if(CBossHP <= 0){
				gamewin();
			}
			CplayerHP -= DamageBoss;
			if(CplayerHP <= 0){
				gameoverMusic();
			}
			battleBossMon();
		}if(y == 1){
			CBossHP -= (DamageBoss / 2);
			if(CplayerHP <= 0){
				gameoverMusic();
			}
			battleBossMon();
		}if(y == 2){
			itemsBossMon();
		}if(y == 3){
			if(CplayerMP >= 100){
				CBossHP -= (Damageplayer * 2);
				CplayerMP -= 100;
				if(CBossHP <= 0){
					gamewin();
				}
				CplayerHP -= DamageBoss;
				if(CplayerHP <= 0){
					gameoverMusic();
				}
				
				battleBossMon();
				}else{
					msg("You do not have enough MP for this skill ");
					battleBossMon();
				}
		}if(y == 4){
			if(CplayerMP >= 300){
			CBossHP -= (Damageplayer * 10);
			CplayerMP -= 300;
			if(CBossHP <= 0){
				gamewin();
			}
			CplayerHP -= DamageBoss;
			if(CplayerHP <= 0){
				gameoverMusic();
			}
			battleBossMon();
			}else{
				msg("You do not have enough MP for this skill ");
				battleBossMon();
			}
		}else{
			System.exit(0);
		}	
	}
	public void gamewin() {
		msg("You beat the boss monster!!! You are a true warrior in skill! \n" +
				"You jump through the portal and escape the dungeon of death!!!");
		msg("Credits:\n " +
				"Code Chief and Editor: Jose Rivero \n" +
				"Image and Music Selector: Jose Rivero \n" +
				"Images pulled from: Google(they belong each to their proper owners \n" +
				"Music from: Touhou! and, Pokemon! \n" +
				"Story written by: Jose Rivero \n" +
				"Purpose: For top 8 \n" +
				"Supported by the Rico Foundation \n" +
				"Come back again some time!!!");
		System.exit(0);
		
	}
	boolean b5 = true;
	public void battleMon(){
		if(b5 == true){
			chooseMon();
			b5 = false;
		}
		ImageIcon [] buttons = {Attack, Defend, Pouch, skills1, skills2,Run, QUIT};
		int y = JOptionPane.showOptionDialog(null,"A wild " + Beasts[x] + " appeared! What will you do? \n" +
				Beasts[x] + " HP is "+ CenemyHP + "/" + enemyHP + "\n" +
				"Your HP "+CplayerHP+"/"+ playerHP +"Your MP"+ CplayerMP + "/" + playerMP +" Player's DMG rate " + Damageplayer +
				"\n Attack the enemy "+ 
				"\n Defend yourself" + 
				"\n Use an item "+
				"\n Use skill " + Skills[SKILLS] + " Uses 100 MP for times 2 DMG"+
				"\n Use skill " + Skills[SKILLS + 1] +" Uses 300 MP for times 10 DMG"+
				"\n Quit the game, but why would u wanna do that","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, Monsters[x], buttons, buttons);
		if(y == 0){
			CenemyHP -= Damageplayer;
			if(CenemyHP <= 0){
				msg("You killed the " + Beasts[x]);
				CenemyHP = enemyHP;
				b5 = true;
				int aa = gene.nextInt(10);
				if(aa == 0){
					itemfound();
				}
				LorR();
			}
			CplayerHP -= DamageEnemy;
			if(CplayerHP <= 0){
				gameoverMusic();
			}
			battleMon();
		}if(y == 1){
			CplayerHP -= (DamageEnemy / 2);
			if(CplayerHP <= 0){
				gameoverMusic();
			}
			battleMon();
		}if(y == 2){
			itemsMon();
		}if(y == 3){
			if(CplayerMP >= 100){
				CenemyHP -= (Damageplayer * 2);
				CplayerMP -= 100;
				if(CenemyHP <= 0){
					msg("You killed the " + Beasts[x]);
					CenemyHP = enemyHP;
					b5 = true;
					LorR();
				}
				CplayerHP -= DamageEnemy;
				if(CplayerHP <= 0){
					gameoverMusic();
				}
				battleMon();
				battleMon();
				}else{
					msg("You do not have enough MP for this skill ");
					battleMon();
				}
		}if(y == 4){
			if(CplayerMP >= 300){
			CenemyHP -= (Damageplayer * 10);
			CplayerMP -= 300;
			if(CenemyHP <= 0){
				msg("You killed the " + Beasts[x]);
				CenemyHP = enemyHP;
				b5 = true;
				LorR();
			}
			CplayerHP -= DamageEnemy;
			if(CplayerHP <= 0){
				gameoverMusic();
			}
			battleMon();
			}else{
				msg("You do not have enough MP for this skill ");
				battleMon();
			}
		}if(y == 5){
			int aa = gene.nextInt(3);
			if(aa == 0){
				msg("You got away safely");
				LorR();
			}else{
				msg("You couldn't escape!");
				CplayerHP -= (DamageEnemy / 2);
				if(CplayerHP <= 0){
					gameoverMusic();
				}
				battleMon();
			}
		}else{
			System.exit(0);
		}
	}
	public void Escape(){
		
		msg("Congratulations!!! You have Escaped the Dungeon! You live to see another day! \n" +
				"Credits:\n " +
				"Code Chief and Editor: Jose Rivero \n" +
				"Image and Music Selector: Jose Rivero \n" +
				"Images pulled from: Google(they belong each to their proper owners \n" +
				"Music from: Touhou! and, Pokemon! \n" +
				"Story written by: Jose Rivero \n" +
				"Purpose: For top 8 \n" +
				"Supported by the Rico Foundation \n" +
				"Come back again some time!!!");
		
		System.exit(0);
	}
	
	
	public void inventory(){
		String [] buttons = {"Items", "Weapons","Back"};
		int x = JOptionPane.showOptionDialog(null,"Your Inventory " +
				"\n Items or Weapons?","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		if(x == 0){
			String [] buttons1 = {"A","B","C","D","E","F","G","Back"};
			int y = JOptionPane.showOptionDialog(null,"Your Item Inventory " +
					"\nDo you want to use an item???" +
					"\n NOTE if you have an item it will be used automatically, even at full HP and/or MP" +
					"\n Your HP "+CplayerHP+"/"+ playerHP +"Your MP"+ CplayerMP + "/" + playerMP +
					"\n A) Number of Potions " + Potion + " Heals 10% HP" +
					"\n B) Number of Mana Potions " + ManaPotion + " Heals 100 MP" +
					"\n C) Number of Super Potions " + SuperPotion + " Heals 25% HP" +
					"\n D) Number of Super Mana Potions " + SuperMPotion + " Heals 200 MP" +
					"\n E) Number of Hyper Potions " + HyperPotion + " Heals 50% HP" +
					"\n F) Number of Hyper Mana Potions " + HyperMPotion + " Heals 300 MP" +
					"\n G) Number of Max Restores " + MaxRestore + " Restores HP and MP to max" 
					,"Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
			if(y == 0){
				if(Potion <= 0){
					msg("You do not have this item");
				}else{
				CplayerHP += (playerHP /10);
				Potion--;
				if(CplayerHP > playerHP){
					CplayerHP = playerHP;
					
				}
				}
				inventory();
			}if(y == 1){
				if(ManaPotion <= 0){
					msg("You do not have this item");
				}else{
				ManaPotion--;
				CplayerMP += 100;
				if(CplayerMP > playerMP){
					CplayerMP = playerMP;
				}
				}
				inventory();
			}if(y == 2){
				if(SuperPotion <= 0){
					msg("You do not have this item");
				}else{
				SuperPotion--;
				CplayerHP += (playerHP /4);
				if(CplayerHP > playerHP){
					CplayerHP = playerHP;
				}
				}
				inventory();
			}if(y == 3){
				if(SuperMPotion <= 0){
					msg("You do not have this item");
				}else{
				SuperMPotion--;
				CplayerMP += 200;
				if(CplayerMP > playerMP){
					CplayerMP = playerMP;
				}
				}
				inventory();
			}if(y == 4){
				if(HyperPotion <= 0){
					msg("You do not have this item");
				}else{
				HyperPotion--;
				CplayerHP += (playerHP /2);
				if(CplayerHP > playerHP){
					CplayerHP = playerHP;
				}
				}
				inventory();
			}if(y == 5){
				if(HyperMPotion <= 0){
					msg("You do not have this item");
				}else{
				HyperMPotion--;
				CplayerMP += 300;
				if(CplayerMP > playerMP){
					CplayerMP = playerMP;
				}
				}
				inventory();
			}if(y == 6){
				if(MaxRestore <= 0){
					msg("You do not have this item");
				}else{
					CplayerHP = playerHP;
					CplayerMP = playerMP;
					MaxRestore--;
				}
				inventory();
			}if(y == 7){
				inventory();
			}else{
				System.exit(0);
			}
		}if(x == 1){
			String [] buttons1 = {"Wooden","Metal","Holy","Demonic","Legendary","Back"};
			int y = JOptionPane.showOptionDialog(null,"Your Weapon Inventory " +
					"","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
			if(y == 0){
				String [] buttons2 = {"Sword", "Staff","Bow","Spear","Hammer","Ax","Shield","Back"};
				int z = JOptionPane.showOptionDialog(null,"Your Weapon Inventory " +
						"\nWooden Weapons","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2);
				if(z == 0){
					if(i == 0){
					if(j == 1){
						Damageplayer /= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 4;
					}else if(j == 4){
						Damageplayer /= 8;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
				}if(z == 1){
					if(i == 1){
						if(j == 1){
							Damageplayer /= 2;
						}else if(j == 2 || j == 3){
							Damageplayer /= 4;
						}else if(j == 4){
							Damageplayer /= 8;
						}
						}else{
							msg("Currently the wrong class for weapon");
						}
						inventory();
				}if(z == 2){
					if(i == 2){
						if(j == 1){
							Damageplayer /= 2;
						}else if(j == 2 || j == 3){
							Damageplayer /= 4;
						}else if(j == 4){
							Damageplayer /= 8;
						}
						}else{
							msg("Currently the wrong class for weapon");
						}
						inventory();
				}if(z == 3){
					if(i == 3){
						if(j == 1){
							Damageplayer /= 2;
						}else if(j == 2 || j == 3){
							Damageplayer /= 4;
						}else if(j == 4){
							Damageplayer /= 8;
						}
						}else{
							msg("Currently the wrong class for weapon");
						}
						inventory();
				}if(z == 4){
					if(i == 4){
						if(j == 1){
							Damageplayer /= 2;
						}else if(j == 2 || j == 3){
							Damageplayer /= 4;
						}else if(j == 4){
							Damageplayer /= 8;
						}
						}else{
							msg("Currently the wrong class for weapon");
						}
						inventory();
				}if(z == 5){
					if(i == 5){
						if(j == 1){
							Damageplayer /= 2;
						}else if(j == 2 || j == 3){
							Damageplayer /= 4;
						}else if(j == 4){
							Damageplayer /= 8;
						}
						}else{
							msg("Currently the wrong class for weapon");
						}
						inventory();
				}if(z == 6){
					if(i == 6){
						if(j == 1){
							Damageplayer /= 2;
						}else if(j == 2 || j == 3){
							Damageplayer /= 4;
						}else if(j == 4){
							Damageplayer /= 8;
						}
						}else{
							msg("Currently the wrong class for weapon");
						}
						inventory();
				}if(z == 7){
					inventory();
				}
			}if(y == 1){
				if(b1 == false){
					msg("You do not have the set of metal weapons");
					inventory();
				}else{
				String [] buttons2 = {"Sword", "Staff","Bow","Spear","Hammer","Ax","Shield","Back"};
				int z = JOptionPane.showOptionDialog(null,"Your Weapon Inventory " +
						"\n Metal Weapon","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2);
				if(z == 0){
					if(t1 == 1){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 0){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 1;
					inventory();
				}if(z == 1){
					if(t1 == 2){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 1){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 2;
					inventory();
				}if(z == 2){
					if(t1 == 3){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 2){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 3;
					inventory();
				}if(z == 3){
					if(t1 == 4){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 3){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 4;
					inventory();
				}if(z == 4){
					if(t1 == 5){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 4){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 5;
					inventory();
				}if(z == 5){
					if(t1 == 6){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 5){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 6;
					inventory();
				}if(z == 6){
					if(t1 == 7){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 6){
					if(j == 0){
						Damageplayer *= 2;
					}else if(j == 2 || j == 3){
						Damageplayer /= 2;
						t2 = 0;
						t3 = 0;
					}else if(j == 4){
						Damageplayer /= 4;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t1 = 7;
					inventory();
				}if(z == 7){
					inventory();
				}
				}
			}if(y == 2){
				if(b2 == false){
					msg("You do not have the set of holy weapons");
					inventory();
				}else{
				String [] buttons2 = {"Sword", "Staff","Bow","Spear","Hammer","Ax","Shield","Back"};
				int z = JOptionPane.showOptionDialog(null,"Your Weapon Inventory " +
						"\n Holy Weapons","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2);
				if(z == 0){
					if(t2 == 1){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 0){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 1;
				}if(z == 1){
					if(t2 == 2){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 1){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 2;
				}if(z == 2){
					if(t2 == 3){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 2){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 3;
				}if(z == 3){
					if(t2 == 4){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 3){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 4;
				}if(z == 4){
					if(t2 == 5){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 4){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 5;
				}if(z == 5){
					if(t2 == 6){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 5){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 6;
				}if(z == 6){
					if(t2 == 7){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 6){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 7;
				}if(z == 7){
					inventory();
				}
				}
			}if(y == 3){
				if(b3 == false){
					msg("You do not have the set of Demonic weapons");
					inventory();
				}else{
				String [] buttons2 = {"Sword", "Staff","Bow","Spear","Hammer","Ax","Shield","Back"};
				int z = JOptionPane.showOptionDialog(null,"Your Weapon Inventory " +
						"\n Demonic weapons","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2);
				if(z == 0){
					if(t2 == 8){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 0){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 8;
				}if(z == 1){
					if(t2 == 9){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 1){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 9;
				}if(z == 2){
					if(t2 == 10){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 2){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 10;
				}if(z == 3){
					if(t2 == 11){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 3){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 11;
				}if(z == 4){
					if(t2 == 12){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 4){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 12;
				}if(z == 5){
					if(t2 == 13){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 5){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 13;
				}if(z == 6){
					if(t2 == 14){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 6){
					if(j == 0){
						Damageplayer *= 4;
					}else if(j == 1){
						Damageplayer *= 2;
						t1 = 0;
					}else if(j == 4){
						Damageplayer /= 2;
						t4 = 0;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					inventory();
					t2 = 14;
				}if(z == 7){
					inventory();
				}
				}
			}if(y == 4){
				if(b4 == false){
					msg("You do not have the set of Legendary weapons");
					inventory();
				}else{
				String [] buttons2 = {"Sword", "Staff","Bow","Spear","Hammer","Ax","Shield","Back"};
				int z = JOptionPane.showOptionDialog(null,"Your Weapon Inventory " +
						"\n Legendary Weapons","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2);
				if(z == 0){
					if(t4 == 1){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 0){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 1;
					inventory();
				}if(z == 1){
					if(t4 == 2){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 1){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 2;
					inventory();
				}if(z == 2){
					if(t4 == 3){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 2){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 3;
					inventory();
				}if(z == 3){
					if(t4 == 4){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 3){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 4;
					inventory();
				}if(z == 4){
					if(t4 == 5){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 4){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 5;
					inventory();
				}if(z == 5){
					if(t4 == 6){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 5){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 6;
					inventory();
				}if(z == 6){
					if(t4 == 7){
						msg("Weapon already equipped");
						inventory();
					}
					if(i == 6){
					if(j == 0){
						Damageplayer *= 8;
					}else if(j == 2 || j == 3){
						Damageplayer *= 2;
					}else if(j == 1){
						Damageplayer *= 4;
					}
					}else{
						msg("Currently the wrong class for weapon");
					}
					t4 = 7;
					inventory();
				}if(z == 7){
					inventory();
				}
				}
			}if(y == 5){
				inventory();
			}else{
				System.exit(0);
			}
		}
		if(x == 2){
			LorR();
		}
	}
	public void START(){
		msg("You have begun your way into the Labyrinth; Good Luck trying to escape \n" +
				"The Portal you entered from disappears behind you");
		LorR();
	}
	public void itembattle(){
		String [] buttons1 = {"A","B","C","D","E","F","G","Back"};
		int y = JOptionPane.showOptionDialog(null,"Your Item Inventory " +
				"\nDo you want to use an item???" +
				"\n Your HP "+CplayerHP+"/"+ playerHP +"Your MP"+ CplayerMP + "/" + playerMP +
				"\n A) Number of Potions " + Potion + " Heals 10% HP" +
				"\n B) Number of Mana Potions " + ManaPotion + " Heals 100 MP" +
				"\n C) Number of Super Potions " + SuperPotion + " Heals 25% HP" +
				"\n D) Number of Super Mana Potions " + SuperMPotion + " Heals 200 MP" +
				"\n E) Number of Hyper Potions " + HyperPotion + " Heals 50% HP" +
				"\n F) Number of Hyper Mana Potions " + HyperMPotion + " Heals 300 MP" +
				"\n G) Number of Max Restores " + MaxRestore + " Restores HP and MP to max" 
				,"Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
		if(y == 0){
			if(Potion < 0){
				msg("You do not have this item");
			}else{
			CplayerHP+= (playerHP /10);
			Potion--;
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
				
			}
			}
			itembattle();
		}if(y == 1){
			if(ManaPotion < 0){
				msg("You do not have this item");
			}else{
			ManaPotion--;
			CplayerMP += 100;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itembattle();
		}if(y == 2){
			if(SuperPotion < 0){
				msg("You do not have this item");
			}else{
			SuperPotion--;
			CplayerHP += (playerHP /4);
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
			}
			}
			itembattle();
		}if(y == 3){
			if(SuperMPotion < 0){
				msg("You do not have this item");
			}else{
			SuperMPotion--;
			CplayerMP += 200;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itembattle();
		}if(y == 4){
			if(HyperPotion < 0){
				msg("You do not have this item");
			}else{
			HyperPotion--;
			CplayerHP += (playerHP /2);
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
			}
			}
			itembattle();
		}if(y == 5){
			if(HyperMPotion < 0){
				msg("You do not have this item");
			}else{
			HyperMPotion--;
			CplayerMP += 300;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itembattle();
		}if(y == 6){
			if(MaxRestore < 0){
				msg("You do not have this item");
			}else{
				CplayerHP = playerHP;
				CplayerMP = playerMP;
				MaxRestore--;
			}
			itembattle();
		}if(y == 7){
			
		}else {
			System.exit(0);
		}
	
	}
	public void skills(){
		String [] buttons = {"A","B","C"};
		int x = JOptionPane.showOptionDialog(null,"Your Options current shown are \n" +
				"A) Choose your weapon type; Current weapon type"+ WeaponType[i]+ "\n" +
				"B) Skill List \n" +
				"C) Back","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);
		if(x == 0){
			String [] buttons1 = {"A","B","C","D","E","F","G","Back"};
			int y = JOptionPane.showOptionDialog(null,"Weapon Type.  Note all types already include a shield\n" +
					"Your current type is "+ WeaponType[i] +
					"\n A) Sword.   Who doesn't like playing with swords?(Plus 10 Atk) \n" +
					"B) Staff.   Shoot fire,water,earth, and air outta your staff(Plus 100 MP) \n" +
					"C) Bow.   Just take your time sniping from far away(Plus 50 HP) \n" +
					"D) Spear.   Amazingly long reach(Plus 1 Atk, Plus 20 MP) \n" +
					"E) Hammer.   Drop the hammer(Plus 1 Atk, Plus 10 HP)\n" +
					"F) Ax.   Just your average walk in the woods(100% more DMG, but 50% less health) \n" +
					"G) Defender.   Ulimate fortress(all DMG dealt by enemies cut in half, but your damage is cut in half as well)\n" +
					"H) Back","Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
			if(y == 0){
				if(i == 0){
					msg("You are already this weapon type");
					skills();
				}else if(i == 1){
					if(CplayerMP < 100){
						CplayerMP =0;
						playerMP -= 100;
					}else{
					playerMP -= 100;
					CplayerMP -= 100;
					}
				}else if(i == 2){
					if(CplayerHP < 51){
						CplayerHP = 1;
						playerHP -= 50;
					}else{
					playerHP -= 50;
					CplayerHP -= 50;
					}
				}else if(i == 3){
					Damageplayer -= 1;
					if(CplayerMP < 19){
						CplayerMP = 0;
						playerMP -= 20;
					}else{
						CplayerMP -= 20;
						playerMP -= 20;
					}
				}else if(i == 4){
					Damageplayer -= 1;
					if(CplayerHP < 11){
						CplayerHP = 1;
						playerHP -= 10;
					}else{
						CplayerHP -= 10;
						playerHP -= 10;
					}
				}else if(i == 5){
					Damageplayer *= 0.5;
					playerHP *= 2;
					CplayerHP *= 2;
				}else if(i == 6){
					Damageplayer *= 2;
					DamageEnemy *= 2;
					DamageBoss *= 2;
				}
				i = 0;
				SKILLS = 0;
				Damageplayer += 10;
				skills();
			}if(y == 1){
				if(i == 0){
					Damageplayer -= 10;
				}else if(i == 1){
					msg("You are already this weapon type");
					skills();
				}else if(i == 2){
					if(CplayerHP < 51){
						CplayerHP = 1;
						playerHP -= 50;
					}else{
					playerHP -= 50;
					CplayerHP -= 50;
					}
				}else if(i == 3){
					Damageplayer -= 1;
					if(CplayerMP < 19){
						CplayerMP = 0;
						playerMP -= 20;
					}else{
						CplayerMP -= 20;
						playerMP -= 20;
					}
				}else if(i == 4){
					Damageplayer -= 1;
					if(CplayerHP < 11){
						CplayerHP = 1;
						playerHP -= 10;
					}else{
						CplayerHP -= 10;
						playerHP -= 10;
					}
				}else if(i == 5){
					Damageplayer *= 0.5;
					playerHP *= 2;
					CplayerHP *= 2;
				}else if(i == 6){
					Damageplayer *= 2;
					DamageEnemy *= 2;
					DamageBoss *= 2;
				}
				i = 1;
				SKILLS = 2;
				playerMP += 100;
				CplayerMP += 100;
				skills();
			}if(y == 2){
				if(i == 0){
					Damageplayer -= 10;
				}else if(i == 1){
					if(CplayerMP < 100){
						CplayerMP =0;
						playerMP -= 100;
					}else{
					playerMP -= 100;
					CplayerMP -= 100;
					}
				}else if(i == 2){
					msg("You are already this weapon type");
					skills();
				}else if(i == 3){
					Damageplayer -= 1;
					if(CplayerMP < 19){
						CplayerMP = 0;
						playerMP -= 20;
					}else{
						CplayerMP -= 20;
						playerMP -= 20;
					}
				}else if(i == 4){
					Damageplayer -= 1;
					if(CplayerHP < 11){
						CplayerHP = 1;
						playerHP -= 10;
					}else{
						CplayerHP -= 10;
						playerHP -= 10;
					}
				}else if(i == 5){
					Damageplayer *= 0.5;
					playerHP *= 2;
					CplayerHP *= 2;
				}else if(i == 6){
					Damageplayer *= 2;
					DamageEnemy *= 2;
					DamageBoss *= 2;
				}
				i = 2;
				SKILLS = 4;
				playerHP += 50;
				CplayerHP += 50;
				skills();
			}if(y == 3){
				if(i == 0){
					Damageplayer -= 10;
				}else if(i == 1){
					if(CplayerMP < 100){
						CplayerMP =0;
						playerMP -= 100;
					}else{
					playerMP -= 100;
					CplayerMP -= 100;
					}
				}else if(i == 2){
					if(CplayerHP < 51){
						CplayerHP = 1;
						playerHP -= 50;
					}else{
					playerHP -= 50;
					CplayerHP -= 50;
					}
				}else if(i == 3){
					msg("You are already this weapon type");
					skills();
				}else if(i == 4){
					Damageplayer -= 1;
					if(CplayerHP < 11){
						CplayerHP = 1;
						playerHP -= 10;
					}else{
						CplayerHP -= 10;
						playerHP -= 10;
					}
				}else if(i == 5){
					Damageplayer *= 0.5;
					playerHP *= 2;
					CplayerHP *= 2;
				}else if(i == 6){
					Damageplayer *= 2;
					DamageEnemy *= 2;
					DamageBoss *= 2;
				}
				i = 3;
				Damageplayer += 1;
				playerMP += 20;
				CplayerMP += 20;
				SKILLS = 6;
				skills();
			}if(y == 4){
				if(i == 0){
					Damageplayer -= 10;
				}else if(i == 1){
					if(CplayerMP < 100){
						CplayerMP =0;
						playerMP -= 100;
					}else{
					playerMP -= 100;
					CplayerMP -= 100;
					}
				}else if(i == 2){
					if(CplayerHP < 51){
						CplayerHP = 1;
						playerHP -= 50;
					}else{
					playerHP -= 50;
					CplayerHP -= 50;
					}
				}else if(i == 3){
					Damageplayer -= 1;
					if(CplayerMP < 19){
						CplayerMP = 0;
						playerMP -= 20;
					}else{
						CplayerMP -= 20;
						playerMP -= 20;
					}
				}else if(i == 4){
					msg("You are already this weapon type");
					skills();
				}else if(i == 5){
					Damageplayer *= 0.5;
					playerHP *= 2;
					CplayerHP *= 2;
				}else if(i == 6){
					Damageplayer *= 2;
					DamageEnemy *= 2;
					DamageBoss *= 2;
				}
				i = 4;
				Damageplayer += 1;
				playerHP += 10;
				CplayerHP += 10;
				SKILLS = 8;
				skills();
			}if(y == 5){
				if(i == 0){
					Damageplayer -= 10;
				}else if(i == 1){
					if(CplayerMP < 100){
						CplayerMP =0;
						playerMP -= 100;
					}else{
					playerMP -= 100;
					CplayerMP -= 100;
					}
				}else if(i == 2){
					if(CplayerHP < 51){
						CplayerHP = 1;
						playerHP -= 50;
					}else{
					playerHP -= 50;
					CplayerHP -= 50;
					}
				}else if(i == 3){
					Damageplayer -= 1;
					if(CplayerMP < 19){
						CplayerMP = 0;
						playerMP -= 20;
					}else{
						CplayerMP -= 20;
						playerMP -= 20;
					}
				}else if(i == 4){
					Damageplayer -= 1;
					if(CplayerHP < 11){
						CplayerHP = 1;
						playerHP -= 10;
					}else{
						CplayerHP -= 10;
						playerHP -= 10;
					}
				}else if(i == 5){
					msg("You are already this weapon type");
					skills();
				}else if(i == 6){
					Damageplayer *= 2;
					DamageEnemy *= 2;
					DamageBoss *= 2;
				}
				i = 5;
				Damageplayer *= 2;
				playerHP *= 0.5;
				CplayerHP *= 0.5;
				SKILLS = 10;
				skills();
			}if(y == 6){
				if(i == 0){
					Damageplayer -= 10;
				}else if(i == 1){
					if(CplayerMP < 100){
						CplayerMP =0;
						playerMP -= 100;
					}else{
					playerMP -= 100;
					CplayerMP -= 100;
					}
				}else if(i == 2){
					if(CplayerHP < 51){
						CplayerHP = 1;
						playerHP -= 50;
					}else{
					playerHP -= 50;
					CplayerHP -= 50;
					}
				}else if(i == 3){
					Damageplayer -= 1;
					if(CplayerMP < 19){
						CplayerMP = 0;
						playerMP -= 20;
					}else{
						CplayerMP -= 20;
						playerMP -= 20;
					}
				}else if(i == 4){
					Damageplayer -= 1;
					if(CplayerHP < 11){
						CplayerHP = 1;
						playerHP -= 10;
					}else{
						CplayerHP -= 10;
						playerHP -= 10;
					}
				}else if(i == 5){
					Damageplayer *= 0.5;
					playerHP *= 2;
					CplayerHP *= 2;
				}else if(i == 6){
					msg("You are already this weapon type");
					skills();
				}
				i = 6;
				DamageEnemy *= 0.5;
				DamageBoss *= 0.5;
				Damageplayer *= 0.5;
				SKILLS = 12;
				skills();
			}if(y == 7){
				skills();
			}else{
				System.exit(0);
			}
		}else if(x == 1){
			String [] buttons1 = {"Back"};
			int y = JOptionPane.showOptionDialog(null,"List of avaiable skills" +
					"\n For all Weapons:" +
					"\n First Skill deals 2 times damage for 100 MP" +
					"\n Second Skill deals 10 times damage for 300 MP \n" +
					"\n Sword     " +Skills[0] + "   " + Skills[1] +
					"\n Staff     " +Skills[2] + "   " + Skills[3] +
					"\n Bow     " +Skills[4] + "   " + Skills[5] +
					"\n Spear     " +Skills[6] + "   " + Skills[7] +
					"\n Hammer     " +Skills[8] + "   " + Skills[9] +
					"\n Ax     " +Skills[10] + "   " + Skills[11] +
					"\n Defender     "+Skills[12] + "   " + Skills[13]
							,"Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
			if(y == 0){
				skills();
			}else{
				System.exit(0);
			}
		}else if(x == 2){
			LorR();
		}else{
			System.exit(0);
		}
	}
	boolean b1 = false;
	boolean b2 = false;
	boolean b3 = false;
	boolean b4 = false;
	public void itemsMon(){
		String [] buttons1 = {"A","B","C","D","E","F","G","Back"};
		int y = JOptionPane.showOptionDialog(null,"Your Item Inventory " +
				"\nDo you want to use an item???" +
				"\n NOTE if you have an item it will be used automatically, even at full HP and/or MP" +
				"\n Your HP "+CplayerHP+"/"+ playerHP +"Your MP"+ CplayerMP + "/" + playerMP +
				"\n A) Number of Potions " + Potion + " Heals 10% HP" +
				"\n B) Number of Mana Potions " + ManaPotion + " Heals 100 MP" +
				"\n C) Number of Super Potions " + SuperPotion + " Heals 25% HP" +
				"\n D) Number of Super Mana Potions " + SuperMPotion + " Heals 200 MP" +
				"\n E) Number of Hyper Potions " + HyperPotion + " Heals 50% HP" +
				"\n F) Number of Hyper Mana Potions " + HyperMPotion + " Heals 300 MP" +
				"\n G) Number of Max Restores " + MaxRestore + " Restores HP and MP to max" 
				,"Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
		if(y == 0){
			if(Potion <= 0){
				msg("You do not have this item");
			}else{
			CplayerHP += (playerHP /10);
			Potion--;
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
				
			}
			}
			itemsMon();
		}if(y == 1){
			if(ManaPotion <= 0){
				msg("You do not have this item");
			}else{
			ManaPotion--;
			CplayerMP += 100;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itemsMon();
		}if(y == 2){
			if(SuperPotion <= 0){
				msg("You do not have this item");
			}else{
			SuperPotion--;
			CplayerHP += (playerHP /4);
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
			}
			}
			itemsMon();
		}if(y == 3){
			if(SuperMPotion <= 0){
				msg("You do not have this item");
			}else{
			SuperMPotion--;
			CplayerMP += 200;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itemsMon();
		}if(y == 4){
			if(HyperPotion <= 0){
				msg("You do not have this item");
			}else{
			HyperPotion--;
			CplayerHP += (playerHP /2);
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
			}
			}
			itemsMon();
		}if(y == 5){
			if(HyperMPotion <= 0){
				msg("You do not have this item");
			}else{
			HyperMPotion--;
			CplayerMP += 300;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itemsMon();
		}if(y == 6){
			if(MaxRestore <= 0){
				msg("You do not have this item");
			}else{
				CplayerHP = playerHP;
				CplayerMP = playerMP;
				MaxRestore--;
			}
			itemsMon();
		}if(y == 7){
			battleMon();
		}else{
			System.exit(0);
		}
	}
	public void itemsBossMon(){
		String [] buttons1 = {"A","B","C","D","E","F","G","Back"};
		int y = JOptionPane.showOptionDialog(null,"Your Item Inventory " +
				"\nDo you want to use an item???" +
				"\n NOTE if you have an item it will be used automatically, even at full HP and/or MP" +
				"\n Your HP "+CplayerHP+"/"+ playerHP +"Your MP"+ CplayerMP + "/" + playerMP +
				"\n A) Number of Potions " + Potion + " Heals 10% HP" +
				"\n B) Number of Mana Potions " + ManaPotion + " Heals 100 MP" +
				"\n C) Number of Super Potions " + SuperPotion + " Heals 25% HP" +
				"\n D) Number of Super Mana Potions " + SuperMPotion + " Heals 200 MP" +
				"\n E) Number of Hyper Potions " + HyperPotion + " Heals 50% HP" +
				"\n F) Number of Hyper Mana Potions " + HyperMPotion + " Heals 300 MP" +
				"\n G) Number of Max Restores " + MaxRestore + " Restores HP and MP to max" 
				,"Death's Dungeon",0, JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1);
		if(y == 0){
			if(Potion <= 0){
				msg("You do not have this item");
			}else{
			CplayerHP += (playerHP /10);
			Potion--;
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
				
			}
			}
			itemsBossMon();
		}if(y == 1){
			if(ManaPotion <= 0){
				msg("You do not have this item");
			}else{
			ManaPotion--;
			CplayerMP += 100;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itemsBossMon();
		}if(y == 2){
			if(SuperPotion <= 0){
				msg("You do not have this item");
			}else{
			SuperPotion--;
			CplayerHP += (playerHP /4);
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
			}
			}
			itemsBossMon();
		}if(y == 3){
			if(SuperMPotion <= 0){
				msg("You do not have this item");
			}else{
			SuperMPotion--;
			CplayerMP += 200;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itemsBossMon();
		}if(y == 4){
			if(HyperPotion <= 0){
				msg("You do not have this item");
			}else{
			HyperPotion--;
			CplayerHP += (playerHP /2);
			if(CplayerHP > playerHP){
				CplayerHP = playerHP;
			}
			}
			itemsBossMon();
		}if(y == 5){
			if(HyperMPotion <= 0){
				msg("You do not have this item");
			}else{
			HyperMPotion--;
			CplayerMP += 300;
			if(CplayerMP > playerMP){
				CplayerMP = playerMP;
			}
			}
			itemsBossMon();
		}if(y == 6){
			if(MaxRestore <= 0){
				msg("You do not have this item");
			}else{
				CplayerHP = playerHP;
				CplayerMP = playerMP;
				MaxRestore--;
			}
			itemsBossMon();
		}if(y == 7){
			battleBossMon();
		}else{
			System.exit(0);
		}
	}
	public void chest(){
		if(b7 == true){
			msg("You walk into a room where there lies a golden chest embroided with jewels \n" +
					"You walk up to and open the chest, to discover... \n" +
					"THE SET OF LEGENDARY WEAPONS!!! \n" +
					"Alright!!!! Now time to kick some monster butt!");
			b4 = true;
			b7 = false;
		}
		LorR();
	}
	public void itemfound(){
		int a = gene.nextInt(10) + 1;
		
		if(a == 1){
			int e = gene.nextInt(2)+1;
			if(e == 1){
				msg("You found a set of the Holy weapons!!!");
				b2 = true;
			}else{
				msg("You found a set of the Demonic weapons!!!");
				b3 = true;
			}
		}else if(a == 2 || a == 3 || a == 4){
			msg("You found a set of Metal weapons!!!");
			b1 = true;
		}else{
			int f = gene.nextInt(20) + 1;
			if(f == 1){
				msg("You found a Max Restore!!!");
				MaxRestore++;
			}else if(f == 2|| f == 3 || f == 4){
				int b = gene.nextInt(2)+1;
				if(b == 1){
				msg("You found a Hyper Potion!!!");
				HyperPotion++;
				}else{
					msg("You found a Hyper Mana Potion!!!");
					HyperMPotion++;
				}
			}else if(f == 5|| f == 6 || f == 7 || f == 8|| f == 9 || f == 10){
				int c = gene.nextInt(3)+1;
				int b = gene.nextInt(2)+1;
				if(b == 1){
				msg("You found "+c+" Super Potions!!!");
				SuperPotion++;
				}else{
					msg("You found "+c+" Super Mana Potions!!!");
					SuperMPotion++;
				}
			}else{
				int c = gene.nextInt(3)+1;
				int b = gene.nextInt(2)+1;
				if(b == 1){
				msg("You found "+c+" Potions!!!");
				Potion++;
				}else{
					msg("You found "+c+" Mana Potions!!!");
					ManaPotion++;
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
