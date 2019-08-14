package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.interfaces.Games;
import com.interfaces.impl.CricketGame;
import com.interfaces.impl.FootBallGame;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportConfig {
     
	
	@Bean
	public Games getCricket() {
		return new CricketGame();
	}
	
	@Bean
	public Games getFootBall() {
		return new FootBallGame();
	}
	
	
}
