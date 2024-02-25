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
	}

	public void run(){
		runPoint = 1;
		System.out.println(this.name + "は");
		System.out.println("にげだした！");
	}

	public abstract void evolution();


	public void getName(String name){
		this.name = name;
	}

	

}
