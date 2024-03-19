import java.time.LocalDateTime;

public class Game {
	
	public int Score;
	
	public LocalDateTime Date;
	
	public GameType Type;
	
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
