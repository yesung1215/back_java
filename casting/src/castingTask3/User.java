package castingTask3;

public class User {
	private String userId;

	public User() {;}

	public User(String userId) {
		this.userId = userId;
	}

	String getUserId() {
		return userId;
	}

	void setUserId(String userId) {
		this.userId = userId;
	}
	
	void choice(Netflex video) {
		if(video instanceof Animation) {
			Animation animation = (Animation)video;
			animation.getFunction();
		}else if(video instanceof Movie) {
			Movie movie = (Movie)video;
			movie.getFunction();
		}else if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.getFunction();
		}
	}
	
	
	
}
