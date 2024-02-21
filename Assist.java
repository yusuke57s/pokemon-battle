public class Assist{
	public void assist(int sta, int ud, int w){

	int[][] bd = new int[7][4];

	bd[0][0] = 1;
	bd[0][1] = 2;
	bd[0][2] = 3;
	bd[0][3] = 4;

	bd[1][0] = 5;
	bd[1][1] = 6;
	bd[1][2] = 7;
	bd[1][3] = 8;
	
	bd[2][0] = 9;
	bd[2][1] = 10;
	bd[2][2] = 11;
	bd[2][3] = 12;

	bd[3][0] = 13;
	bd[3][1] = 14;
	bd[3][2] = 15;
	bd[3][3] = 16;

	bd[4][0] = 17;
	bd[4][1] = 18;
	bd[4][2] = 19;
	bd[4][3] = 20;

	bd[5][0] = 21;
	bd[5][1] = 22;
	bd[5][2] = 23;
	bd[5][3] = 24;

	bd[6][0] = 25;
	bd[6][1] = 26;
	bd[6][2] = 27;
	bd[6][3] = 28;


	int bufdbuf = bd[sta][ud];
		if(w == 1){
			switch(bufdbuf){
				//p1のat(攻撃)ランクを2あげる
				case 1:
					Battle.p1.rankA += 2;
					System.out.println(Battle.p1.name + "のこうげきが　ぐーんとあがった");
					break;
				//p1のat(攻撃)ランクを1あげる
				case 2:
					Battle.p1.rankA += 1;
					System.out.println(Battle.p1.name + "のこうげきが　あがった");
					break;
				//p1のat(攻撃)ランクを1さげる
				case 3:
					Battle.p1.rankA -= 1;
					System.out.println(Battle.p1.name + "のこうげきが　さがった");
					break;
				//p1のat(攻撃)ランクを2さげる
				case 4:
					Battle.p1.rankA -= 2;
					System.out.println(Battle.p1.name + "のこうげきが　がくっとさがった");
					break;
				//p1のbl(防御)ランクを2あげる
				case 5:
					Battle.p1.rankB += 2;
					System.out.println(Battle.p1.name + "のぼうぎょが　ぐーんとあがった");
					break;
				//p1のbl(防御)ランクを1あげる
				case 6:
					Battle.p1.rankB += 1;
					System.out.println(Battle.p1.name + "のぼうぎょが　あがった");
					break;
				//p1のbl(防御)ランクを1さげる
				case 7:
					Battle.p1.rankB -= 1;
					System.out.println(Battle.p1.name + "のぼうぎょが　さがった");
					break;
				//p1のbl(防御)ランクを2さげる
				case 8:
					Battle.p1.rankB -= 2;
					System.out.println(Battle.p1.name + "のぼうぎょが　がくっととさがった");
					break;
				//p1のsat(特殊攻撃)ランクを2あげる
				case 9:
					Battle.p1.rankSa += 2;
					System.out.println(Battle.p1.name + "のとくこうが　ぐーんとあがった");
					break;
				//p1のsat(特殊攻撃)ランクを1あげる
				case 10:
					Battle.p1.rankSa += 1;
					System.out.println(Battle.p1.name + "のとくこうが　あがった");
					break;
				//p1のsat(特殊攻撃)ランクを1さげる
				case 11:
					Battle.p1.rankSa -= 1;
					System.out.println(Battle.p1.name + "のとくこうが　さがった");
					break;
				//p1のsat(特殊攻撃)ランクを2さげる
				case 12:
					Battle.p1.rankSa -= 2;
					System.out.println(Battle.p1.name + "のとくこうが　がくっとさがった");
					break;
				//p1のsbl(特殊防御)ランクを2あげる
				case 13:
					Battle.p1.rankSb += 2;
					System.out.println(Battle.p1.name + "のとくぼうが　ぐーんとあがった");
					break;
				//p1のsbl(特殊防御)ランクを1あげる
				case 14:
					Battle.p1.rankSb += 1;
					System.out.println(Battle.p1.name + "のとくぼうが　あがった");
					break;
				//p1のsbl(特殊防御)ランクを1さげる
				case 15:
					Battle.p1.rankSb -= 1;
					System.out.println(Battle.p1.name + "のとくぼうが　さがった");
					break;
				//p1のsbl(特殊防御)ランクを2さげる
				case 16:
					Battle.p1.rankSb -= 2;
					System.out.println(Battle.p1.name + "のとくぼうが　がくっとさがった");
					break;
				//p1のsp(素早さ)ランクを2あげる
				case 17:
					Battle.p1.rankS += 2;
					System.out.println(Battle.p1.name + "のすばやさが　ぐーんとあがった");
					break;
				//p1のsp(素早さ)ランクを1あげる
				case 18:
					Battle.p1.rankS += 1;
					System.out.println(Battle.p1.name + "のすばやさが　あがった");
					break;
				//p1のsp(素早さ)ランクを1さげる
				case 19:
					Battle.p1.rankS -= 1;
					System.out.println(Battle.p1.name + "のすばやさが　さがった");
					break;
				//p1のsp(素早さ)ランクを2さげる
				case 20:
					Battle.p1.rankS -= 2;
					System.out.println(Battle.p1.name + "のすばやさが　がくっとさがった");
					break;
				//p1のh(命中率)ランクを2あげる
				case 21:
					Battle.p1.rankH += 2;
					System.out.println(Battle.p1.name + "のめいちゅうりつが　ぐーんとあがった");
					break;
				//p1のh(命中率)ランクを1あげる
				case 22:
					Battle.p1.rankH += 1;
					System.out.println(Battle.p1.name + "のめいちゅうりつが　あがった");
					break;
				//p1のh(命中率)ランクを1さげる
				case 23:
					Battle.p1.rankH -= 1;
					System.out.println(Battle.p1.name + "のめいちゅうりつが　さがった");
					break;
				//p1のh(命中率)ランクを2さげる
				case 24:
					Battle.p1.rankH -= 2;
					System.out.println(Battle.p1.name + "のめいちゅうりつが　がくっとさがった");
					break;
				//p1のh(回避率)ランクを2あげる
				case 25:
					Battle.p1.rankE += 2;
					System.out.println(Battle.p1.name + "のかいひりつが　ぐーんとあがった");
					break;
				//p1のh(回避率)ランクを1あげる
				case 26:
					Battle.p1.rankE += 1;
					System.out.println(Battle.p1.name + "のかいひりつが　あがった");
					break;
				//p1のh(回避率)ランクを1さげる
				case 27:
					Battle.p1.rankE -= 1;
					System.out.println(Battle.p1.name + "のかいひりつが　さがった");
					break;
				//p1のh(回避率)ランクを2さげる
				case 28:
					Battle.p1.rankE -= 2;
					System.out.println(Battle.p1.name + "のかいひりつが　がっくとさがった");
					break;
			}		
		}else if((w == 0) || (w == 2)){
			switch(bufdbuf){
				//p2のat(攻撃)ランクを2あげる
				case 1:
					Battle.p2.rankA += 2;
					System.out.println(Battle.p2.name + "のこうげきが　ぐーんとあがった");
					break;
				//p2のat(攻撃)ランクを1あげる
				case 2:
					Battle.p2.rankA += 1;
					System.out.println(Battle.p2.name + "のこうげきが　あがった");
					break;
				//p2のat(攻撃)ランクを1さげる
				case 3:
					Battle.p2.rankA -= 1;
					System.out.println(Battle.p2.name + "のこうげきが　さがった");
					break;
				//p2のat(攻撃)ランクを2さげる
				case 4:
					Battle.p2.rankA -= 2;
					System.out.println(Battle.p2.name + "のこうげきが　がくっとさがった");
					break;
				//p2のbl(防御)ランクを2あげる
				case 5:
					Battle.p2.rankB += 2;
					System.out.println(Battle.p2.name + "のぼうぎょが　ぐーんとあがった");
					break;
				//p2のbl(防御)ランクを1あげる
				case 6:
					Battle.p2.rankB += 1;
					System.out.println(Battle.p2.name + "のぼうぎょが　あがった");
					break;
				//p2のbl(防御)ランクを1さげる
				case 7:
					Battle.p2.rankB -= 1;
					System.out.println(Battle.p2.name + "のぼうぎょが　さがった");
					break;
				//p2のbl(防御)ランクを2さげる
				case 8:
					Battle.p2.rankB -= 2;
					System.out.println(Battle.p2.name + "のぼうぎょが　がくっととさがった");
					break;
				//p2のsat(特殊攻撃)ランクを2あげる
				case 9:
					Battle.p2.rankSa += 2;
					System.out.println(Battle.p2.name + "のとくこうが　ぐーんとあがった");
					break;
				//p2のsat(特殊攻撃)ランクを1あげる
				case 10:
					Battle.p2.rankSa += 1;
					System.out.println(Battle.p2.name + "のとくこうが　あがった");
					break;
				//p2のsat(特殊攻撃)ランクを1さげる
				case 11:
					Battle.p2.rankSa -= 1;
					System.out.println(Battle.p2.name + "のとくこうが　さがった");
					break;
				//p2のsat(特殊攻撃)ランクを2さげる
				case 12:
					Battle.p2.rankSa -= 2;
					System.out.println(Battle.p2.name + "のとくこうが　がくっとさがった");
					break;
				//p2のsbl(特殊防御)ランクを2あげる
				case 13:
					Battle.p2.rankSb += 2;
					System.out.println(Battle.p2.name + "のとくぼうが　ぐーんとあがった");
					break;
				//p2のsbl(特殊防御)ランクを1あげる
				case 14:
					Battle.p2.rankSb += 1;
					System.out.println(Battle.p2.name + "のとくぼうが　あがった");
					break;
				//p2のsbl(特殊防御)ランクを1さげる
				case 15:
					Battle.p2.rankSb -= 1;
					System.out.println(Battle.p2.name + "のとくぼうが　さがった");
					break;
				//p2のsbl(特殊防御)ランクを2さげる
				case 16:
					Battle.p2.rankSb -= 2;
					System.out.println(Battle.p2.name + "のとくぼうが　がくっとさがった");
					break;
				//p2のsp(素早さ)ランクを2あげる
				case 17:
					Battle.p2.rankS += 2;
					System.out.println(Battle.p2.name + "のすばやさが　ぐーんとあがった");
					break;
				//p2のsp(素早さ)ランクを1あげる
				case 18:
					Battle.p2.rankS += 1;
					System.out.println(Battle.p2.name + "のすばやさが　あがった");
					break;
				//p2のsp(素早さ)ランクを1さげる
				case 19:
					Battle.p2.rankS -= 1;
					System.out.println(Battle.p2.name + "のすばやさが　さがった");
					break;
				//p2のsp(素早さ)ランクを2さげる
				case 20:
					Battle.p2.rankS -= 2;
					System.out.println(Battle.p2.name + "のすばやさが　がくっとさがった");
					break;
				//p2のh(命中率)ランクを2あげる
				case 21:
					Battle.p2.rankH += 2;
					System.out.println(Battle.p2.name + "のめいちゅうりつが　ぐーんとあがった");
					break;
				//p2のh(命中率)ランクを1あげる
				case 22:
					Battle.p2.rankH += 1;
					System.out.println(Battle.p2.name + "のめいちゅうりつが　あがった");
					break;
				//p2のh(命中率)ランクを1さげる
				case 23:
					Battle.p2.rankH -= 1;
					System.out.println(Battle.p2.name + "のめいちゅうりつが　さがった");
					break;
				//p2のh(命中率)ランクを2さげる
				case 24:
					Battle.p2.rankH -= 2;
					System.out.println(Battle.p2.name + "のめいちゅうりつが　がくっとさがった");
					break;
				//p2のh(回避率)ランクを2あげる
				case 25:
					Battle.p2.rankE += 2;
					System.out.println(Battle.p2.name + "のかいひりつが　ぐーんとあがった");
					break;
				//p2のh(回避率)ランクを1あげる
				case 26:
					Battle.p2.rankE += 1;
					System.out.println(Battle.p2.name + "のかいひりつが　あがった");
					break;
				//p2のh(回避率)ランクを1さげる
				case 27:
					Battle.p2.rankE -= 1;
					System.out.println(Battle.p2.name + "のかいひりつが　さがった");
					break;
				//p2のh(回避率)ランクを2さげる
				case 28:
					Battle.p2.rankE -= 2;
					System.out.println(Battle.p2.name + "のかいひりつが　がっくとさがった");
					break;
			}
		}
	}

	public double calcA(){
		double ca;
		if((Battle.p1.rankA == 0) || (Battle.p1.rankB == 0) || (Battle.p1.rankSa == 0) || (Battle.p1.rankSb == 0) || (Battle.p1.rankS == 0)){
			ca = 2.0/8.0;
			return ca;
		}else if((Battle.p1.rankA == 1) || (Battle.p1.rankB == 1) || (Battle.p1.rankSa == 1) || (Battle.p1.rankSb == 1) || (Battle.p1.rankS == 1)){
			ca = 2.0/7.0;
			return ca;
		}else if((Battle.p1.rankA == 2) || (Battle.p1.rankB == 2) || (Battle.p1.rankSa == 2) || (Battle.p1.rankSb == 2) || (Battle.p1.rankS == 2)){
			ca = 2.0/6.0;
			return ca;
		}else if((Battle.p1.rankA == 3) || (Battle.p1.rankB == 3) || (Battle.p1.rankSa == 3) || (Battle.p1.rankSb == 3) || (Battle.p1.rankS == 3)){
			ca = 2.0/5.0;
			return ca;
		}else if((Battle.p1.rankA == 4) || (Battle.p1.rankB == 4) || (Battle.p1.rankSa == 4) || (Battle.p1.rankSb == 4) || (Battle.p1.rankS == 4)){
			ca = 2.0/4.0;
			return ca;
		}else if((Battle.p1.rankA == 5) || (Battle.p1.rankB == 5) || (Battle.p1.rankSa == 5) || (Battle.p1.rankSb == 5) || (Battle.p1.rankS == 5)){
			ca = 2.0/3.0;
			return ca;
		}else if((Battle.p1.rankA == 6) || (Battle.p1.rankB == 6) || (Battle.p1.rankSa == 6) || (Battle.p1.rankSb == 6) || (Battle.p1.rankS == 6)){
			ca = 2.0/2.0;
			return ca;
		}else if((Battle.p1.rankA == 7) || (Battle.p1.rankB == 7) || (Battle.p1.rankSa == 7) || (Battle.p1.rankSb == 7) || (Battle.p1.rankS == 7)){
			ca = 3.0/2.0;
			return ca;
		}else if((Battle.p1.rankA == 8) || (Battle.p1.rankB == 8) || (Battle.p1.rankSa == 8) || (Battle.p1.rankSb == 8) || (Battle.p1.rankS == 8)){
			ca = 4.0/2.0;
			return ca;
		}else if((Battle.p1.rankA == 9) || (Battle.p1.rankB == 9) || (Battle.p1.rankSa == 9) || (Battle.p1.rankSb == 9) || (Battle.p1.rankS == 9)){
			ca = 5.0/2.0;
			return ca;
		}else if((Battle.p1.rankA == 10) || (Battle.p1.rankB == 10) || (Battle.p1.rankSa == 10) || (Battle.p1.rankSb == 10) || (Battle.p1.rankS == 10)){
			ca = 6.0/2.0;
			return ca;
		}else if((Battle.p1.rankA == 11) || (Battle.p1.rankB == 11) || (Battle.p1.rankSa == 11) || (Battle.p1.rankSb == 11) || (Battle.p1.rankS == 11)){
			ca = 7.0/2.0;
			return ca;
		}else if((Battle.p1.rankA == 12) || (Battle.p1.rankB == 12) || (Battle.p1.rankSa == 12) || (Battle.p1.rankSb == 12) || (Battle.p1.rankS == 12)){
			ca = 8.0/2.0;
			return ca;
		}else{
			return 1.0;
		}
	}
	public double calcB(){
		double cb;
		if((Battle.p1.rankH == 0) || (Battle.p1.rankE == 0)){	
			cb = 3.0/9.0;
			return cb;
		}else if((Battle.p1.rankH == 1) || (Battle.p1.rankE == 1)){
			cb = 3.0/8.0;
			return cb;
		}else if((Battle.p1.rankH == 2) || (Battle.p1.rankE == 2)){
			cb = 3.0/7.0;
			return cb;
		}else if((Battle.p1.rankH == 3) || (Battle.p1.rankE == 3)){
			cb = 3.0/6.0;
			return cb;
		}else if((Battle.p1.rankH == 4) || (Battle.p1.rankE == 4)){
			cb = 3.0/5.0;
			return cb;
		}else if((Battle.p1.rankH == 5) || (Battle.p1.rankE == 5)){
			cb = 3.0/4.0;
			return cb;
		}else if((Battle.p1.rankH == 6) || (Battle.p1.rankE == 6)){
			cb = 3.0/3.0;
			return cb;
		}else if((Battle.p1.rankH == 7) || (Battle.p1.rankE == 7)){
			cb = 4.0/3.0;
			return cb;
		}else if((Battle.p1.rankH == 8) || (Battle.p1.rankE == 8)){
			cb = 5.0/3.0;
			return cb;
		}else if((Battle.p1.rankH == 9) || (Battle.p1.rankE == 9)){
			cb = 6.0/3.0;
			return cb;
		}else if((Battle.p1.rankH == 10) || (Battle.p1.rankE == 10)){
			cb = 7.0/3.0;
			return cb;
		}else if((Battle.p1.rankH == 11) || (Battle.p1.rankE == 11)){
			cb = 8.0/3.0;
			return cb;
		}else if((Battle.p1.rankH == 12) || (Battle.p1.rankE == 12)){
			cb = 9.0/3.0;
			return cb;
		}else{
			return 1.0;
		}
	}
	public double calcC(){
		double cc;
		if((Battle.p2.rankA == 0) || (Battle.p2.rankB == 0) || (Battle.p2.rankSa == 0) || (Battle.p2.rankSb == 0) || (Battle.p2.rankS == 0)){
			cc = 2.0/8.0;
			return cc;
		}else if((Battle.p2.rankA == 1) || (Battle.p2.rankB == 1) || (Battle.p2.rankSa == 1) || (Battle.p2.rankSb == 1) || (Battle.p2.rankS == 1)){
			cc = 2.0/7.0;
			return cc;
		}else if((Battle.p2.rankA == 2) || (Battle.p2.rankB == 2) || (Battle.p2.rankSa == 2) || (Battle.p2.rankSb == 2) || (Battle.p2.rankS == 2)){
			cc = 2.0/6.0;
			return cc;
		}else if((Battle.p2.rankA == 3) || (Battle.p2.rankB == 3) || (Battle.p2.rankSa == 3) || (Battle.p2.rankSb == 3) || (Battle.p2.rankS == 3)){
			cc = 2.0/5.0;
			return cc;
		}else if((Battle.p2.rankA == 4) || (Battle.p2.rankB == 4) || (Battle.p2.rankSa == 4) || (Battle.p2.rankSb == 4) || (Battle.p2.rankS == 4)){
			cc = 2.0/4.0;
			return cc;
		}else if((Battle.p2.rankA == 5) || (Battle.p2.rankB == 5) || (Battle.p2.rankSa == 5) || (Battle.p2.rankSb == 5) || (Battle.p2.rankS == 5)){
			cc = 2.0/3.0;
			return cc;
		}else if((Battle.p2.rankA == 6) || (Battle.p2.rankB == 6) || (Battle.p2.rankSa == 6) || (Battle.p2.rankSb == 6) || (Battle.p2.rankS == 6)){
			cc = 2.0/2.0;
			return cc;
		}else if((Battle.p2.rankA == 7) || (Battle.p2.rankB == 7) || (Battle.p2.rankSa == 7) || (Battle.p2.rankSb == 7) || (Battle.p2.rankS == 7)){
			cc = 3.0/2.0;
			return cc;
		}else if((Battle.p2.rankA == 8) || (Battle.p2.rankB == 8) || (Battle.p2.rankSa == 8) || (Battle.p2.rankSb == 8) || (Battle.p2.rankS == 8)){
			cc = 4.0/2.0;
			return cc;
		}else if((Battle.p2.rankA == 9) || (Battle.p2.rankB == 9) || (Battle.p2.rankSa == 9) || (Battle.p2.rankSb == 9) || (Battle.p2.rankS == 9)){
			cc = 5.0/2.0;
			return cc;
		}else if((Battle.p2.rankA == 10) || (Battle.p2.rankB == 10) || (Battle.p2.rankSa == 10) || (Battle.p2.rankSb == 10) || (Battle.p2.rankS == 10)){
			cc = 6.0/2.0;
			return cc;
		}else if((Battle.p2.rankA == 11) || (Battle.p2.rankB == 11) || (Battle.p2.rankSa == 11) || (Battle.p2.rankSb == 11) || (Battle.p2.rankS == 11)){
			cc = 7.0/2.0;
			return cc;
		}else if((Battle.p2.rankA == 12) || (Battle.p2.rankB == 12) || (Battle.p2.rankSa == 12) || (Battle.p2.rankSb == 12) || (Battle.p2.rankS == 12)){
			cc = 8.0/2.0;
			return cc;
		}else{
			return 1.0;
		}
	}
	public double calcD(){
		double cd;
		if((Battle.p2.rankH == 0) || (Battle.p2.rankE == 0)){	
			cd = 3.0/9.0;
			return cd;
		}else if((Battle.p2.rankH == 1) || (Battle.p2.rankE == 1)){
			cd = 3.0/8.0;
			return cd;
		}else if((Battle.p2.rankH == 2) || (Battle.p2.rankE == 2)){
			cd = 3.0/7.0;
			return cd;
		}else if((Battle.p2.rankH == 3) || (Battle.p2.rankE == 3)){
			cd = 3.0/6.0;
			return cd;
		}else if((Battle.p2.rankH == 4) || (Battle.p2.rankE == 4)){
			cd = 3.0/5.0;
			return cd;
		}else if((Battle.p2.rankH == 5) || (Battle.p2.rankE == 5)){
			cd = 3.0/4.0;
			return cd;
		}else if((Battle.p2.rankH == 6) || (Battle.p2.rankE == 6)){
			cd = 3.0/3.0;
			return cd;
		}else if((Battle.p2.rankH == 7) || (Battle.p2.rankE == 7)){
			cd = 4.0/3.0;
			return cd;
		}else if((Battle.p2.rankH == 8) || (Battle.p2.rankE == 8)){
			cd = 5.0/3.0;
			return cd;
		}else if((Battle.p2.rankH == 9) || (Battle.p2.rankE == 9)){
			cd = 6.0/3.0;
			return cd;
		}else if((Battle.p2.rankH == 10) || (Battle.p2.rankE == 10)){
			cd = 7.0/3.0;
			return cd;
		}else if((Battle.p2.rankH == 11) || (Battle.p2.rankE == 11)){
			cd = 8.0/3.0;
			return cd;
		}else if((Battle.p2.rankH == 12) || (Battle.p2.rankE == 12)){
			cd = 9.0/3.0;
			return cd;
		}else{
			return 1.0;
		}
	}
}
