public abstract class MovePokemon implements Pokemon {
	String name;
	String type1;
	String type2;
	int typeNumber1;
	int typeNumber2;
	int level;
	int hp;
	int at;
	int bl;
	int sat;
	int sbl;
	int sp;
	int runPoint;
	int rankA;
	int rankB;
	int rankSa;
	int rankSb;
	int rankS;
	int rankH;
	int rankE;
	Waza w1;
	Waza w2;
	Waza w3;
	Waza w4; 



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
		System.out.println(this.name + "は");
		System.out.println("にげだした！");
	}

	public abstract void evolution();


	public void getName(String name){
		this.name = name;
	}

	public void youAttack(){
		
		int youWazaSelect = new java.util.Random().nextInt(4);
		switch (youWazaSelect + 1){
				case 1:
					System.out.println("あいての" + this.name + "の");
					System.out.println(this.w1.name);
					break;
				case 2:
					System.out.println("あいての" + this.name + "の");
					System.out.println(this.w2.name);
					break;
				case 3:
					System.out.println("あいての" + this.name + "の");
					System.out.println(this.w3.name);
					break;
				case 4:
					System.out.println("あいての" + this.name + "の");
					System.out.println(this.w4.name);
					break;	
		} 
	}


}
