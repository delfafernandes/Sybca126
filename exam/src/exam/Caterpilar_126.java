package exam;

public class Caterpilar_126 {
	
	int moves, cabbage;
	
	Caterpilar_126(int moves, int cabbage)
	{
		this.moves=moves;
		this.cabbage=cabbage;
	}
	int moves()
	{
		return moves;
	}
	int get_moves()
	{
		return moves++;
	}
	int eat()
	{
		return cabbage;
	}


}
