package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.interfaces.Games;
import com.interfaces.impl.CricketGame;
import com.interfaces.impl.FootBallGame;

@Configuration
@ComponentScan("com.interfaces.impl")
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
