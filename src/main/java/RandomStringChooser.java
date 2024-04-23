import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well

  private List <String> words;
  public RandomStringChooser(String [] wordArray) {
    words = new ArrayList <String> ();
    for (String singleWord:wordArray) {
      words.add(singleWord);
    }
  
}
