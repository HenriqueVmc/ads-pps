package ex4builder;
import java.util.Date;

public class Artigo {
	
	private String autor;
	private String titulo;
	private int paginas;
	private Date publicado;
	private String texto;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Date getPublicado() {
		return publicado;
	}

	public void setPublicado(Date publicado) {
		this.publicado = publicado;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "info{" +
				"autor='" + autor + '\'' +
				", titulo='" + titulo + '\'' +
				", paginas=" + paginas +
				", publicado='" + publicado+ '\'' +
				", texto='" + texto + '\'' +
				'}';
	}

}
