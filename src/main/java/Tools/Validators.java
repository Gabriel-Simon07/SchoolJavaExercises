package Tools;

/**
 * @param verify String a ser verificada
 * @return boolean
 *
 */
public class Validators {
	static public boolean onlyValidChars(String verify) {	
		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\\\"\\\\\\|,.<>\\/?]+.*\r\n" + "");
	}		
		
	}

