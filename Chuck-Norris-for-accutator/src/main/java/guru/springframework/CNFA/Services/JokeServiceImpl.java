package guru.springframework.CNFA.Services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{
	
	private final ChuckNorrisQuotes chucknorrisquotes;
	
	
	public JokeServiceImpl() {
		super();
		this.chucknorrisquotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chucknorrisquotes.getRandomQuote();
	}
	
}
