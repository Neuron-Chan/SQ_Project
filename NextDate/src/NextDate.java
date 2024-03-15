public class NextDate {

    public static String findNextDate(int year, int month, int day) {
        if (year < 1812 || year > 2212 || month < 1 || month > 12 || day < 1 || day > 31) {
            return "Invalid Date";
        }
        
        int daysInMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
        	if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
        		daysInMonth = 29;
        		if (day > daysInMonth) {
        			return "Invalid Date";
        		}
        	} else {
        		daysInMonth = 28;
        		if (day > daysInMonth) {
        			return "Invalid Date";
        		}
        	}
            
        }
        
        if (day < daysInMonth) {
        	day += 1;
        	if (day > daysInMonth) {
        		return "Invalid Date";
        	}
            return String.format("%04d-%02d-%02d", year, month, day);
        } else if (month < 12) {
        	month += 1;
        	if (month < 1 || month > 12) {
        		return "Invalid Date";
        	}
            return String.format("%04d-%02d-%02d", year, month, 1);
        } else {
        	year += 1;
        	if (year < 1812 || year > 2212) {
        		return "Invalid Date";
        	}
        	return String.format("%04d-%02d-%02d", year, 1, 1);
        }
    }
}
