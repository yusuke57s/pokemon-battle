public class Battle{
	static MovePokemon p1;
	static MovePokemon p2;
	TypeEffective te;
	Assist assi;
	DamageRandom dr;
	public Battle(){
		//自分のポケモンをインスタンス化
		p1 = new P001();
	
		//相手のポケモンのインスタンス化
		p2 = new P002();

		//タイプ相性をインスタンス化
		te = new TypeEffective();

		//バフ・デバフをインスタンス化
		assi = new Assist();
		
		//ダメージ計算時の乱数(0.85~1.00の16段階)をインスタンス化
		dr = new DamageRandom();
	}

	//コマンド選択
	public void command(){
		//どちらかのHPが0以下になるまでコマンド選択を繰り返す
		while(!((this.p1.hp <= 0) || (this.p2.hp <= 0))){			
			System.out.println("1:たたかう 2:ポケモン 3:どうぐ 4:にげる");
			int select = new java.util.Scanner(System.in).nextInt();
			while (!((select == 1) || (select == 2) || (select == 3) || (select == 4))) {	
				System.out.println("1~4でせんたくしてください！");
				select = new java.util.Scanner(System.in).nextInt();
			}
				switch (select){
					case 1:
						//戦闘
						battle();
						break;
					case 2:
						//文章だけは出るが実質未実装
						//Changeクラスを作ってp1の中身を入れ替えられるように(ArrayList使用？)
						p1.change();
						break;
					case 3:
						//未実装　キズぐすり実装予定
						System.out.println("未実装");


						double dama = (((((5*2/5+2)*(12*1*35))/(32*1)/50+2)*1*1)*0.85);
						System.out.println(dama);
						break;
					case 4:
						//にげる
						p1.run();
						break;
				}
			//にげるを選択したら戦闘を終わらせる
			if(p1.runPoint == 1){
				break;
			}
		}
	}

	//以下、バトル
	public void battle(){

		//p1とp2のspを比較して早いほうから行動する
		if(this.p1.sp >= this.p2.sp){	
			//技選択(4択)　1~4以外を選択したら再度やり直し
			System.out.println("1:" + this.p1.w1.name + " 2:" + this.p1.w2.name + " 3:" + this.p1.w3.name + " 4:" + this.p1.w4.name);
			int wazaSelect = new java.util.Scanner(System.in).nextInt();
			while (!((wazaSelect == 1) || (wazaSelect == 2) || (wazaSelect == 3) || (wazaSelect == 4))) {	
				System.out.println("1~4でせんたくしてください！");
				wazaSelect = new java.util.Scanner(System.in).nextInt();
			}
				double ca = assi.calcA();
				double cb = assi.calcB();
				double cc = assi.calcC();
				double cd = assi.calcD();
				double r = dr.ran();
				//選択した番号に基いて、技の種類(kinds)によりダメージ計算またはデバフ
				switch (wazaSelect){	
					case 1:
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w1.name);
						double d1 = te.te(this.p1.w1.typeNumber,this.p2.typeNumber1);
						double d2 = te.te(this.p1.w1.typeNumber,this.p2.typeNumber2);
						if(this.p1.w1.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w1.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w1.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w1.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}

							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w1.kinds.equals("補助")){
							assi.assist(this.p1.w1.sta, this.p1.w1.ud, this.p1.w1.w);
							
						}
							break;
					case 2:
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w2.name);
						d1 = te.te(this.p1.w2.typeNumber,this.p2.typeNumber1);
						d2 = te.te(this.p1.w2.typeNumber,this.p2.typeNumber2);
						if(this.p1.w2.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w2.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w2.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w2.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}

							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w2.kinds.equals("補助")){
							assi.assist(this.p1.w2.sta, this.p1.w2.ud, this.p1.w2.w);
						}
							break;					
					case 3:	
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w3.name);
						d1 = te.te(this.p1.w3.typeNumber,this.p2.typeNumber1);
						d2 = te.te(this.p1.w3.typeNumber,this.p2.typeNumber2);
						if(this.p1.w3.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w3.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w3.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w3.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}

							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w3.kinds.equals("補助")){
							assi.assist(this.p1.w3.sta, this.p1.w3.ud, this.p1.w3.w);
						}
							break;
					case 4:
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w4.name);
						d1 = te.te(this.p1.w4.typeNumber,this.p2.typeNumber1);
						d2 = te.te(this.p1.w4.typeNumber,this.p2.typeNumber2);
						if(this.p1.w4.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w4.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w4.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w4.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}

							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w4.kinds.equals("補助")){
							assi.assist(this.p1.w4.sta, this.p1.w4.ud, this.p1.w4.w);
						}
							break;
				}
			//相手の攻撃　ランダムに4つの技から1つを選択
			int youWazaSelect = new java.util.Random().nextInt(4)+1;
			ca = assi.calcA();
			cb = assi.calcB();
			cc = assi.calcC();
			cd = assi.calcD();
			r = dr.ran();
				switch (youWazaSelect){
					case 1:
						if(this.p2.hp <= 0){
						}else{
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w1.name);
						double d1 = te.te(this.p2.w1.typeNumber,this.p1.typeNumber1);
						double d2 = te.te(this.p2.w1.typeNumber,this.p1.typeNumber2);
						if(this.p2.w1.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w1.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
							}else if(this.p2.w1.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w1.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w1.kinds.equals("補助")){
							assi.assist(this.p2.w1.sta, this.p2.w1.ud, this.p2.w1.w + 1);
						}
						break;
						}
					case 2:
						if(this.p2.hp <= 0){
						}else{
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w2.name);
						double d1 = te.te(this.p2.w2.typeNumber,this.p1.typeNumber1);
						double d2 = te.te(this.p2.w2.typeNumber,this.p1.typeNumber2);
						if(this.p2.w2.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w2.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w2.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w2.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w2.kinds.equals("補助")){
							assi.assist(this.p2.w2.sta, this.p2.w2.ud, this.p2.w2.w + 1);
						}
						break;
						}
					case 3:
						if(this.p2.hp <= 0){
						}else{
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w3.name);
						double d1 = te.te(this.p2.w3.typeNumber,this.p1.typeNumber1);
						double d2 = te.te(this.p2.w3.typeNumber,this.p1.typeNumber2);
						if(this.p2.w3.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w3.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w3.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w3.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w3.kinds.equals("補助")){
							assi.assist(this.p2.w3.sta, this.p2.w3.ud, this.p2.w3.w + 1);
						}
						break;
						}
					case 4:
						if(this.p2.hp <= 0){
						}else{
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w4.name);
						double d1 = te.te(this.p2.w4.typeNumber,this.p1.typeNumber1);
						double d2 = te.te(this.p2.w4.typeNumber,this.p1.typeNumber2);
						if(this.p2.w4.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w4.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w4.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w4.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w4.kinds.equals("補助")){
							assi.assist(this.p2.w4.sta, this.p2.w4.ud, this.p2.w4.w + 1);
						}
						break;
						}
				} 
			
		}else{
			//技選択(4択)　1~4以外を選択したら再度やり直し
			System.out.println("1:" + this.p1.w1.name + " 2:" + this.p1.w2.name + " 3:" + this.p1.w3.name + " 4:" + this.p1.w4.name);
			int wazaSelect = new java.util.Scanner(System.in).nextInt();
			while (!((wazaSelect == 1) || (wazaSelect == 2) || (wazaSelect == 3) || (wazaSelect == 4))) {	
				System.out.println("1~4でせんたくしてください！");
				wazaSelect = new java.util.Scanner(System.in).nextInt();
			}
			//相手の攻撃　ランダムに4つの技から1つを選択
			int youWazaSelect = new java.util.Random().nextInt(4)+1;
			double ca = assi.calcA();
			double cb = assi.calcB();
			double cc = assi.calcC();
			double cd = assi.calcD();
			double r = dr.ran();
				switch (youWazaSelect){
					case 1:
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w1.name);
						double d1 = te.te(this.p2.w1.typeNumber,this.p1.typeNumber1);
						double d2 = te.te(this.p2.w1.typeNumber,this.p1.typeNumber2);
						if(this.p2.w1.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w1.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
							}else if(this.p2.w1.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w1.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w1.kinds.equals("補助")){
							assi.assist(this.p2.w1.sta, this.p2.w1.ud, this.p2.w1.w + 1);
						}
						break;
					case 2:
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w2.name);
						d1 = te.te(this.p2.w2.typeNumber,this.p1.typeNumber1);
						d2 = te.te(this.p2.w2.typeNumber,this.p1.typeNumber2);
						if(this.p2.w2.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w2.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w2.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w2.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w2.kinds.equals("補助")){
							assi.assist(this.p2.w2.sta, this.p2.w2.ud, this.p2.w2.w + 1);
						}
						break;
					case 3:
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w3.name);
						d1 = te.te(this.p2.w3.typeNumber,this.p1.typeNumber1);
						d2 = te.te(this.p2.w3.typeNumber,this.p1.typeNumber2);
						if(this.p2.w3.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w3.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w3.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w3.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w3.kinds.equals("補助")){
							assi.assist(this.p2.w3.sta, this.p2.w3.ud, this.p2.w3.w + 1);
						}
						break;
					case 4:
						System.out.println("あいての" + this.p2.name + "の");
						System.out.println(this.p2.w4.name);
						d1 = te.te(this.p2.w4.typeNumber,this.p1.typeNumber1);
						d2 = te.te(this.p2.w4.typeNumber,this.p1.typeNumber2);
						if(this.p2.w4.kinds.equals("物理")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.at*cc*this.p2.w4.power))/(this.p1.bl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w4.kinds.equals("特殊")){
							int damage = (int)((((this.p2.level*2/5+2)*(this.p2.sat*cc*this.p2.w4.power))/(this.p1.sbl*ca)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p1.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p1.hp <= 0){
								System.out.println(this.p1.name + "はひんしになった。");
							}else{
								System.out.println(this.p1.name + "の残りHPは"+ this.p1.hp + "だ");
							}
						}else if(this.p2.w4.kinds.equals("補助")){
							assi.assist(this.p2.w4.sta, this.p2.w4.ud, this.p2.w4.w + 1);
						}
						break;
				} 
			//選択した番号に基いて、技の種類(kinds)によりダメージ計算またはデバフ
				switch (wazaSelect){	
					case 1:
						if(this.p1.hp <= 0){
						}else{
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w1.name);
						double d1 = te.te(this.p1.w1.typeNumber,this.p2.typeNumber1);
						double d2 = te.te(this.p1.w1.typeNumber,this.p2.typeNumber2);
						if(this.p1.w1.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w1.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w1.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w1.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w1.kinds.equals("補助")){
							assi.assist(this.p1.w1.sta, this.p1.w1.ud, this.p1.w1.w);
						}
							break;
						}
					case 2:
						if(this.p1.hp <= 0){
						}else{
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w2.name);
						double d1 = te.te(this.p1.w2.typeNumber,this.p2.typeNumber1);
						double d2 = te.te(this.p1.w2.typeNumber,this.p2.typeNumber2);
						if(this.p1.w2.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w2.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}										this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w2.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w2.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w2.kinds.equals("補助")){
							assi.assist(this.p1.w2.sta, this.p1.w2.ud, this.p1.w2.w);
						}
						break;
						}
					case 3:	
						if(this.p1.hp <= 0){
						}else{
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w3.name);
						double d1 = te.te(this.p1.w3.typeNumber,this.p2.typeNumber1);
						double d2 = te.te(this.p1.w3.typeNumber,this.p2.typeNumber2);
						if(this.p1.w3.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w3.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w3.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w3.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w3.kinds.equals("補助")){
							assi.assist(this.p1.w3.sta, this.p1.w3.ud, this.p1.w3.w);
						}
						break;
						}
					case 4:
						if(this.p1.hp <= 0){
						}else{
						System.out.println(this.p1.name + "の");
						System.out.println(this.p1.w4.name);
						double d1 = te.te(this.p1.w4.typeNumber,this.p2.typeNumber1);
						double d2 = te.te(this.p1.w4.typeNumber,this.p2.typeNumber2);
						if(this.p1.w4.kinds.equals("物理")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.at*ca*this.p1.w4.power))/(this.p2.bl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w4.kinds.equals("特殊")){
							int damage = (int)((((this.p1.level*2/5+2)*(this.p1.sat*ca*this.p1.w4.power))/(this.p2.sbl*cc)/50+2)*d1*d2*r);
							if((!(d1*d2 == 0) && damage == 0)){
							damage = 1;
							}
							this.p2.hp -= damage;
							System.out.println(damage + "のダメージ");
							if(d1*d2 == 0){
								System.out.println("こうかがないみたいだ…");
							}else if((d1*d2 == 0.25) || (d1*d2 == 0.5)){
								System.out.println("こうかいまひとつのようだ");
							}else if((d1*d2 == 2.0) || (d1*d2 == 4.0)){
								System.out.println("こうかはばつぐんだ");
							}
							if(this.p2.hp <= 0){
								System.out.println(this.p2.name + "はひんしになった。");
							}else{
								System.out.println(this.p2.name + "の残りHPは"+ this.p2.hp + "だ");
							}
						}else if(this.p1.w4.kinds.equals("補助")){
							assi.assist(this.p1.w4.sta, this.p1.w4.ud, this.p1.w4.w);
						}
						break;
						}	
				}			
		}
	}
	
}