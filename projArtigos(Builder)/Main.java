package ex4builder;

public class Main{ 
	public static void main(String[] args){ 

		ArtigoBuilder builder;
		Editor editor;
		Artigo artigo;

		builder = new BlogBuilder(); 
		editor = new Editor(builder); 
		editor.construirCasa(); 
		artigo = builder.getArtigo(); 

		System.out.println(artigo);

		builder = new RevistaBuilder(); 
		editor = new Editor(builder); 
		editor.construirCasa(); 
		artigo = builder.getArtigo(); 

		System.out.println(artigo);
		
		builder = new JornalBuilder(); 
		editor = new Editor(builder); 
		editor.construirCasa(); 
		artigo = builder.getArtigo(); 

		System.out.println(artigo);

	} 
} 
//SAIDA ESPERADA
//info{autor='Marcio Ballem', titulo='BlogBuilder', paginas=2, publicado='Thu Mar 14 17:02:14 BRT 2019', texto='O padrão de projeto builder...'}
//info{autor='Marcio Ballem', titulo='RevistaBuilder', paginas=6, publicado='Thu Mar 14 17:02:14 BRT 2019', texto='O padrão de projeto builder...'}
//info{autor='Marcio Ballem', titulo='JornalBuilder', paginas=1, publicado='Thu Mar 14 17:02:14 BRT 2019', texto='O padrão de projeto builder...'}

