public class Brazil {

	public static void main(String[] args) {
		
		String str = "--";
		String concat = "--";
		boolean ehCrescente = true;
		
		StringBuffer buff = new StringBuffer("####################################################################################");
		
		int x = 1;
		for( ; ; ) {
			int lenght = buff.length() / 2; 
			
			if (lenght + x > buff.length()) {
				ehCrescente = false;
				str = removeFirstandLast(str);
				x-=4;
			}
				
			if (ehCrescente) {
				int inicio = lenght - x; 
				int fim = lenght + x;
				
				System.out.println(buff.replace(inicio, fim, str));
				str = concat + str + concat;
				x+=2;
			} else if (ehCrescente == false) {
				buff = new StringBuffer("####################################################################################");
				int inicio = lenght - x; 
				int fim = lenght + x;
				
				if (inicio > fim) break;
				
				str = removeFirstandLast(str);
				System.out.println(buff.replace(inicio, fim, str));
				x-=2;
			}
		}
	}
	
    public static String removeFirstandLast(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length() - 1);
        sb.deleteCharAt(str.length() - 2);
        sb.deleteCharAt(0);
        sb.deleteCharAt(0);
        
        return sb.toString();
    }
}
