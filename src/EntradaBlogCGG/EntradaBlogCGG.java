package EntradaBlogCGG;

/**
 * Clase para manejar las entradas de un blog.
 * @author La clase se cre� el 20/2/2020 por Carlos Garcia Garri.
 * Esta es la versi�n 2.3
 */


public class EntradaBlogCGG {
	
	/**
	 * separador es el ccar�cter que separa ENTRADA DE del nombre del autor
	 */

	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * 
	 * @param id El n�mero de entrada
	 * @param autor El nombre del autor de la entrada
	 * @param texto El texto que contiene la entrada.
	 * @throws IllegalArgumentException Si el n�mero de entrada es negativo, lanza una excepci�n.
	 */
	
	public EntradaBlogCGG(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}

	 /**
	  * 
	  * @return  Devuelve el n�mero de la entrada
	  */
	 

	public int getId(){
		return this.id;
	}
	
	/**
	 * 
	 * @return Devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * 
	 * @return Devuelve el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * 
	 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * 
	 * @param args No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {
		EntradaBlogCGG e1=new EntradaBlogCGG (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
	
	
}



