package charactor1;
import com.train.HeroType;
public class outHero {
	public String name; // 姓名
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HeroType type= HeroType.ASSASSIN;
//     switch(type) {
//     case TANK:
//         System.out.println("坦克");
//         break;
//     case WIZARD:
//         System.out.println("法师");
//         break;
//     case ASSASSIN:
//         System.out.println("刺客");
//         break;
//     case ASSIST:
//         System.out.println("辅助");
//         break;
//     case WARRIOR:
//         System.out.println("近战");
//         break;
//     case RANGED:
//         System.out.println("远程战");
//         break;
//     case PUSH:
//         System.out.println("推进");
//         break;
//     case FARMING:
//         System.out.println("打野");
//         break;
		for(HeroType value:HeroType.values()) {
			switch(value) {
			case TANK:
		         System.out.println("坦克");
		         break;
		     case WIZARD:
		         System.out.println("法师");
		         break;
		     case ASSASSIN:
		         System.out.println("刺客");
		         break;
		     case ASSIST:
		         System.out.println("辅助");
		         break;
		     case WARRIOR:
		         System.out.println("近战");
		         break;
		     case RANGED:
		         System.out.println("远程战");
		         break;
		     case PUSH:
		         System.out.println("推进");
		         break;
		     case FARMING:
		         System.out.println("打野");
		         break;
     }
	}
	}}
