
public class ChessTest {

	public static void main(String[] args) {
		Chess chess = new GraphicalChess();
		chess.moveKnite();
		
	}
}

class Chess ////code written by a Narayan
{
	void moveKing() {
		System.out.println("Moving king diagonally/vertically/horizontally...bakward/forward 1 STEP..");
	}	
	void moveQueen() { 
		System.out.println("Moving diagonally/vetically/horizontally...backward/forward...1step/N step..");
	}
	void moveBishop() { //Camel
		System.out.println("Moving the bishop diagonally....backword/forward...1 step...many steps...");
	}
	final void moveKnite() { //Horse
		System.out.println("Moving the knight in L shape...anywhere ...jump over...");
	}
	void moveRook() {//Elephant
		System.out.println("Moving the rook horizontally..vertically..back/forward...1/n steps");
	}
	void movePawn() {//Soldier
		System.out.println("Only move forward..1 step..1 step diagonal to kill......");
	}
}

class GraphicalChess extends Chess //isA    Sandeep Thapa
{
	//lets write a graphic related code to move the knite
	void moveKnite() {
		//u can use the code written by narayan plus
		//your additional code
		//super.moveKnite(); //re use the code of parent  + plus
		//System.out.println("graphically moving the knite..in L Shape");
		System.out.println("moving the knite in S shape.....");
	}
}
