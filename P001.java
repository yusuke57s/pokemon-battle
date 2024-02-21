public class P001 extends MovePokemon{

	public P001(){
		this.name = "フシギダネ";
		this.type1 = "くさ";
		this.type2 = "どく";
		this.typeNumber1 = 4;
		this.typeNumber2 = 7;
		this.level = 5;
		this.hp = 100;
		this.at = 12;
		this.bl = 11;
		this.sat = 9;
		this.sbl = 12;
		this.sp = 11;
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


	public void evolution(){
		System.out.println("おめでとう！"+ this.name + "は");
		System.out.println( "フシギソウに　しんかした！");
	}

	public void run(){
		runPoint = 1;
		System.out.println(this.name + "は");
		System.out.println("にげだした！");
	}

	
}