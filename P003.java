public class P003 extends MovePokemon{
	String name = null;
	String type1 = null;
	String type2 = null;
	int level = 0;
	int hp = 0;
	int at = 0;
	int bl = 0;
	int sat = 0;
	int sbl = 0;
	int sp = 0;
	Waza w1 = null;
	Waza w2 = null;
	Waza w3 = null;
	Waza w4 = null; 

	public P003(){
		this.name = "フシギバナ";
		this.type1 = "くさ";
		this.type2 = "どく";
		this.level = 36;
		this.hp = 86;
		this.at = 72;
		this.bl = 79;
		this.sat = 81;
		this.sbl = 83;
		this.sp = 79;
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
	}
	
}