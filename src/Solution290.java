import java.util.HashMap;
import java.util.Map;

public class Solution290 {
	public boolean wordPattern(String pattern, String str) {
		char[] patterns = pattern.toCharArray();
		Map<Character, String> maps = new HashMap<>();

		String[] splitStr = str.trim().split("\\s+");

		if (patterns.length != splitStr.length)
			return false;

		for (int i = 0; i < patterns.length; i++) {
			char ch = patterns[i];
			if (maps.containsKey(ch)) {
				String value = maps.get(ch);
				if (!value.equals(splitStr[i]))
					return false;
			} else {
				if (maps.containsValue(splitStr[i]))
					return false;
				maps.put(ch, splitStr[i]);
			}
		}
		return true;
	}
}
