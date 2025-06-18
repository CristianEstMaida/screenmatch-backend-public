package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.principal.EjemploStreams;
import com.aluracursos.screenmatch.principal.Principal;
import com.aluracursos.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplicationConsola implements CommandLineRunner {
	@Autowired
	private SerieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplicationConsola.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primer proyecto Spring sin Web");
		/*Principal principal = new Principal(repository);
		principal.muestraElMenu();
		EjemploStreams ejemploStreams = new EjemploStreams();
		ejemploStreams.muestraEjemplo();*/
		/*var consumoApi = new ConsumoAPI();
		var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&apikey=6858e289");
		var json1 = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&apikey=6858e289");
		var json2 = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");

		System.out.println(json);
		System.out.println(json1);
		System.out.println(json2);

		ConvierteDatos conversor = new ConvierteDatos();
		var datos = conversor.obtenerDatos(json, DatosSerie.class);
		System.out.println(datos);
		json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=6858e289");
		DatosEpisodio episodio = conversor.obtenerDatos(json, DatosEpisodio.class);
		System.out.println(episodio);
		List<DatosTemporadas> temporadas = new ArrayList<>();
		for (int i = 1; i <= datos.totalDeTemporadas(); i++) {
			json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season="+i+"&apikey=6858e289");
			var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
			temporadas.add(datosTemporadas);
		}
		temporadas.forEach(System.out::println);*/
	}
}
