import java.time.LocalDateTime;

class Game {
	
	private int Score;
	
	private LocalDateTime Date;
	
	private GameType Type;
	
	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public LocalDateTime getDate() {
		return Date;
	}

	public void setDate(LocalDateTime date) {
		Date = date;
	}

	public GameType getType() {
		return Type;
	}

	public void setType(GameType type) {
		Type = type;
	}
}

enum GameType
{
	Addition,
	Subtraction,
	Multiplication,
	Division
}
