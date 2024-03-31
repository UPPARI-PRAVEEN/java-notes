class Monthdays {
    public static void main(String[] args) {
	String month = "fed";
	switch(month){
	case "jan":
	case "april":
	case "june":
	case "sep" :
	case "nov" : {
		System.out.println(month + "has 30 days");
		break;
	}
	case "mar":
	case "may":
	case "july":
	case "aug" :
	case "oct" :
	case "dec" : {
		System.out.println(month + "has 30 days");
		break;
	}
	case "fed": {
	System.out.println(month + "has 29 days");
		break;
		}
	default : {
		System.out.println(month + "invalid month");
		}
	}
	}

        }
