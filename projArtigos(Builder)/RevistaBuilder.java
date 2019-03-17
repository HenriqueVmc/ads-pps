package ex4builder;

import java.util.Date;

public class RevistaBuilder extends ArtigoBuilder {

	public RevistaBuilder() {
		// TODO Auto-generated constructor stub
		super.artigo = new Artigo();
	}
	@Override
	public void buildArtigo() {
		// TODO Auto-generated method stub
		artigo.setAutor("Marcio Ballem");
		artigo.setTitulo("RevistaBuilder");
		artigo.setPaginas(6);
		artigo.setTexto("O padrão de projeto builder...");
		artigo.setPublicado(new Date(2019, 02, 13, 17, 01, 14));
	}
}