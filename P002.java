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

	public void evolution(){
		System.out.println("おめでとう！"+ this.name + "は");
		System.out.println( "フシギバナに　しんかした！");
	}
}