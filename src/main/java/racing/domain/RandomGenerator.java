package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator implements NumberGenerator {

  public List<Integer> generate(int length) {
    List<Integer> result = new ArrayList<>(length);
    Random random = new Random();
    for (int index = 0; index < length; index++) {
      result.add(random.nextInt(9));
    }
    return result;
  }
}
