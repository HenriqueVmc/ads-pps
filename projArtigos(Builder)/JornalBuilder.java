package ex4builder;

import java.util.Date;

public class JornalBuilder extends ArtigoBuilder {
	public JornalBuilder() {
		// TODO Auto-generated constructor stub

		super.artigo = new Artigo();
	}

	@Override
	public void buildArtigo() {
		// TODO Auto-generated method stub
		artigo.setAutor("Marcio Ballem");
		artigo.setTitulo("JornalBuilder");
		artigo.setPaginas(1);
		artigo.setTexto("O padrão de projeto builder...");
		artigo.setPublicado(new Date(2019, 02, 13, 17, 01, 14));
	}

}