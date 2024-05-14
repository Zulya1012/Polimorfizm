package plmz;
public class Dispatcher {
	public static void main(String[] args) {
		Bird s = new Swallow();
		Bird st = new Strauss();
		Bird p = new Penguin();
		Bird cr = new Crocozyablic();
		Bird[] b = {s, st, p, cr};
 		for (Bird temp : b) {
 			polyMoves (temp);
 		}
 	
 		}
	static void polyMoves(Bird bird) {
			bird.move();
	}
	Swallow creator = new Swallow();
	Swallow s1 = creator.createBird();
	Swallow s2 = creator.createBird();
	Swallow[] sw = {s1, s2};
}
