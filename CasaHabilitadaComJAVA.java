
public class casaHabilitadaComJava {

	public static void main(String[] args) {
		int soneca = 830;
		int contador = 1;
		String aparelho1 = "Despertador";
		String aparelho2 = "Cafeteira";
		String aparelho3 = "Torradeira";
		String aparelho4 = "Celular";
		String aparelho5 = "Coleira do cachorro";
		
		while(soneca < 865) {
			if(contador < 3) {
				System.out.println(aparelho1 + ":" + "Ei " + " " + aparelho2 + ",o espertinho está dormindo de novo, atrase o café em 12 minutos");
				System.out.println(aparelho2 + ":" + "Ei " + " " + aparelho3 + ".Segure a torrada, Bob está tirando uma soneca");
				System.out.println(aparelho1 + ":" + "Ei" + " " + aparelho4 + ".Chame Bob às 9 horas e diga para ele que estamos ficando um pouco atrasados");
				System.out.println(aparelho1 + ":" + "Ei" + " " + aparelho5 + ".Pegue o jornal, mas não espere ser levado para um passeio");
				
			} else{
				System.out.println(aparelho1 + ":" + aparelho5 + ":" + "SALTE E LATA");
				
			}
			contador++;
			soneca = soneca+12;
		}
	}
}