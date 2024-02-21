public class P002 extends MovePokemon{

	public P002(){
		this.name = "フシギソウ";
		this.type1 = "くさ";
		this.type2 = "どく";
		this.typeNumber1 = 4;
		this.typeNumber2 = 7;
		this.level = 16;
		this.hp = 56;
		this.at = 32;
		this.bl = 32;
		this.sat = 30;
		this.sbl = 35;
		this.sp = 36;
		this.runPoint = 0;
		this.rankA = 6;
		this.rankB = 6;
		this.rankSa = 6;
		this.rankSb = 6;
		this.rankS = 6;
		this.rankH = 6;
		this.rankE = 6;
		w1 = new W001();
		w2 = new W002();
		w3 = new W003();
		w4 = new W004();
	}

	public void attack(){
		System.out.println("1:" + this.w1.name + " 2:" + this.w2.name + " 3:" + this.w3.name + " 4:" + this.w4.name);
		int wazaSelect = new java.util.Scanner(System.in).nextInt();
		while (!((wazaSelect == 1) || (wazaSelect == 2) || (wazaSelect == 3) || (wazaSelect == 4))) {	
			System.out.println("1~4でせんたくしてください！");
			wazaSelect = new java.util.Scanner(System.in).nextInt();
		}
		switch (wazaSelect){
				case 1:
					System.out.println(this.name + "の");
					System.out.println(this.w1.name);
						
					break;
				case 2:
					System.out.println(this.name + "の");
					System.out.println(this.w2.name);
					break;
				case 3:
					System.out.println(this.name + "の");
					System.out.println(this.w3.name);
					break;
				case 4:
					System.out.println(this.name + "の");
					System.out.println(this.w4.name);
					break;	
		} 
	}

	public void change(){
		System.out.println("どのポケモンにしますか？");
		System.out.println("1.リザードン 2.カメール 3.ピカチュウ");	//勝手に増えるやつ使いたい
		int pn = new java.util.Scanner(System.in).nextInt();
		while(!((pn == 1) || (pn == 2) || (pn == 3) || (pn == 4) || (pn == 5) || (pn == 6))){
			System.out.println("1~4でせんたくしてください！");
			pn = new java.util.Scanner(System.in).nextInt();
			}
			System.out.println(this.name + "もどれ");
			switch (pn){
				case 1:
					System.out.println("リザードン きみにきめた！");
					break;
				case 2:
					System.out.println("カメール きみにきめた！");
						break;
				case 3:
					System.out.println("ピカチュウ きみにきめた！");
					break;
		}
	}

	public void run(){
		this.runPoint = 1;
		System.out.println(this.name + "は");
		System.out.println("にげだした！");
	}

	public void evolution(){
		System.out.println("おめでとう！"+ this.name + "は");
		System.out.println( "フシギバナに　しんかした！");
	}

	public void getName(String name){
		this.name = name;
	}

	public void youAttack(){
		
		int youWazaSelect = new java.util.Random().nextInt(4);
		switch (youWazaSelect + 1){
				case 1:
					System.out.println("あいての" + this.name + "の");
					System.out.println(w1.name);
					break;
				case 2:
					System.out.println("あいての" + this.name + "の");
					System.out.println(w2.name);
					break;
				case 3:
					System.out.println("あいての" + this.name + "の");
					System.out.println(w3.name);
					break;
				case 4:
					System.out.println("あいての" + this.name + "の");
					System.out.println(w4.name);
					break;	
		} 
	}
}