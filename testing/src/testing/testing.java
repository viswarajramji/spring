package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testing {
	public static void main(String[] args) {
		int k = 4;
		List<Integer> list = new ArrayList<>();
		list.add();
		list.add(40);
		list.add(60);
		list.add(80);
		list.add(100);
		int counter = 0;
		int i = 0;
		Collections.sort(list, Collections.reverseOrder());
		int value = list.get(k - 1);
		for (i = k; i < list.size(); i++) {
			if (value == list.get(i)) {
				counter++;
			} else {
				break;
			}
		}
		// remove
		int zero = 0;
		for (int f = 0; f < i; f++) {
			if (list.get(f) == 0) {
				zero++;
			}
		}
		int total = 0;
		if (!(k > list.size())) {
			total = counter + k;
			total -= zero;
		}

		System.out.println(total);

	}
}
