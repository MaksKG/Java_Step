package labCodeWars;

import java.util.regex.*;

    public class PhoneDir {
        public static String phone(String strng, String num) {
            String[] lines = strng.split("\n");
            String name = "", address = "";
            int count = 0;
            for (String line : lines) {
                if (line.contains(num)) {
                    count++;
                    if (count > 1) {
                        return "Error => Too many people: " + num;
                    }
                    Pattern namePattern = Pattern.compile("<(.*?)>");
                    Matcher nameMatcher = namePattern.matcher(line);
                    if (nameMatcher.find()) {
                        name = nameMatcher.group(1);
                    }
                    address = line.replace(num, "")
                            .replace("<" + name + ">", "")
                            .replaceAll("[^a-zA-Z0-9\\.\\-\\s]", " ")
                            .replaceAll("\\s+", " ")
                            .trim();
                }
            }
            if (count == 0) {
                return "Error => Not found: " + num;
            }
            return "Phone => " + num + ", Name => " + name + ", Address => " + address;
        }
    }
