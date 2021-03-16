package urjc.ist.streaming;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 String nombre1="a";
		 String apellidos1="b";
		 String pseudonimo1="c";
		 Calendar fecha_nacimiento1=Calendar.getInstance();
		 fecha_nacimiento1.set(1950, 1, 2);
		 boolean activo1=true;
		 String [] premios1= {"a","b","c"};
		 int participaciones1=50;
		 Actor actor1=new Actor(nombre1,apellidos1,pseudonimo1,fecha_nacimiento1, participaciones1,activo1,premios1);
		 
		 String nombre2="a4";
		 String apellidos2="b1";
		 String pseudonimo2="cd";
		 Calendar fecha_nacimiento2=Calendar.getInstance();
		 fecha_nacimiento2.set(1950, 1, 12);
		 boolean activo2=false;
		 String [] premios2= {"ad","b2","c2"};
		 int participaciones2=50;
		 Actor actor2=new Actor(nombre2,apellidos2,pseudonimo2,fecha_nacimiento2, participaciones2,activo2,premios2);
		
		 String nombre4="asdf";
		 String apellidos4="erb";
		 String pseudonimo4="rgc";
		 Calendar fecha_nacimiento4=Calendar.getInstance();
		 fecha_nacimiento4.set(1950, 1, 4);
		 boolean activo4=false;
		 String [] premios4= {"ag","hdfb","cgf"};
		 int participaciones4=50;
		 Calendar fecha_muerte4=Calendar.getInstance();
		 fecha_nacimiento4.set(1999, 9, 14);
		 Actor actor4=new Actor(nombre4,apellidos4,pseudonimo4,fecha_nacimiento4, participaciones4,activo4,premios4,fecha_muerte4);
		 
		 String nombre3="a1sdf";
		 String apellidos3="b2gf";
		 String pseudonimo3="cdgs";
		 Calendar fecha_nacimiento3=Calendar.getInstance();
		 fecha_nacimiento3.set(1950, 1, 24);
		 boolean activo3=true;
		 String [] premios3= {"ags","uyfs","tfoyu"};
		 int participaciones3=50;
		 Actor actor3=new Actor(nombre3,apellidos3,pseudonimo3,fecha_nacimiento3, participaciones3,activo3,premios3);
		
		 String nombre5="aga";
		 String apellidos5="bag";
		 String pseudonimo5="cwte";
		 Calendar fecha_nacimiento5=Calendar.getInstance();
		 fecha_nacimiento5.set(1970, 5, 2);
		 boolean activo5=true;
		 String [] premios5= {"awte","bt4w","4tc"};
		 int participaciones5=50;
		 Director director5=new Director(nombre5,apellidos5,pseudonimo5,fecha_nacimiento5, participaciones5,activo5,premios5);
		 
		 String nombre6="at44";
		 String apellidos6="ba41";
		 String pseudonimo6="cda4t";
		 Calendar fecha_nacimiento6=Calendar.getInstance();
		 fecha_nacimiento6.set(1960, 1, 16);
		 boolean activo6=false;
		 String [] premios6= {"ada4t","b4ta4ta6","c6at4"};
		 int participaciones6=50;
		 Director director6=new Director(nombre6,apellidos6,pseudonimo6,fecha_nacimiento6, participaciones6,activo6,premios6);
		
		 String nombre7="a";
		 String apellidos7="b";
		 String pseudonimo7="c";
		 Calendar fecha_nacimiento7=Calendar.getInstance();
		 fecha_nacimiento7.set(1950, 1, 7);
		 boolean activo7=false;
		 String [] premios7= {"a","b","c"};
		 int participaciones7=50;
		 Calendar fecha_muerte7=Calendar.getInstance();
		 fecha_nacimiento7.set(1999, 9, 7);
		 Director director7=new Director(nombre7,apellidos7,pseudonimo7,fecha_nacimiento7, participaciones7,activo7,premios7,fecha_muerte7);
		 
		
		 
		boolean emision=true; //solo se emite una vez las peliculas ya que son estrenos
		String titulo1="Avatar";
		String descripcion1="Intentamos invadir un planeta alienigena por minerales";
		boolean cont_infantil1=false;
		Calendar fecha_estreno1=Calendar.getInstance();
		fecha_estreno1.set(2009, 11, 9);
		String lenguaje1="Ingles";
		int duracion1=178; // expresado en minutos
		String [] productoras1= {"Warner","b","c","d"};
		List<Director> directores1=Arrays.asList(director7,director5,director6);
		List<Actor> reparto1=Arrays.asList(actor1,actor2,actor3,actor4);
		int rating1=7;
		String [] etiquetas1= {"z","x","c","v"};
		Peliculas pelicula1= new Peliculas(emision,titulo1,descripcion1,cont_infantil1,fecha_estreno1,lenguaje1,duracion1,productoras1,directores1,reparto1,rating1,etiquetas1);
		
		boolean emision2=true; //solo se emite una vez las peliculas ya que son estrenos
		String titulo2="Batman";
		String descripcion2="Un superheroe rico que sale por las noches";
		boolean cont_infantil2=true;
		Calendar fecha_estreno2=Calendar.getInstance();
		fecha_estreno2.set(1989, 8, 29);
		String lenguaje2="Ingles";
		int duracion2=126; // expresado en minutos
		String [] productoras2= {"Warner","b","c","d"};
		List<Director> directores2=Arrays.asList(director7,director5,director6);
		List<Actor> reparto2=Arrays.asList(actor1,actor2,actor3,actor4);
		int rating2=8;
		String [] etiquetas2= {"z","x","c","v"};
		Peliculas pelicula2= new Peliculas(emision2,titulo2,descripcion2,cont_infantil2,fecha_estreno2,lenguaje2,duracion2,productoras2,directores2,reparto2,rating2,etiquetas2);
		
		boolean emision3=true; //solo se emite una vez las peliculas ya que son estrenos
		String titulo3="Spiderman";
		String descripcion3="Una araña radioactiva le pica y le da poderes";
		boolean cont_infantil3=true;
		Calendar fecha_estreno3=Calendar.getInstance();
		fecha_estreno3.set(2002, 5, 21);
		String lenguaje3="Ingles";
		int duracion3=121; // expresado en minutos
		String [] productoras3= {"Warner","b","c","d"};
		List<Director> directores3=Arrays.asList(director7,director5,director6);
		List<Actor> reparto3=Arrays.asList(actor1,actor2,actor3,actor4);
		int rating3=7;
		String [] etiquetas3= {"z","x","c","v"};
		Peliculas pelicula3= new Peliculas(emision3,titulo3,descripcion3,cont_infantil3,fecha_estreno3,lenguaje3,duracion3,productoras3,directores3,reparto3,rating3,etiquetas3);
		
		List<Peliculas> peliculas1=Arrays.asList(pelicula1,pelicula2,pelicula3);
		
		
	
			int id=0;
			String titulo;
			String descripcion;
			Calendar fecha_estreno;
			 String lenguaje;
			int duracion; // expresado en minutos
			String [] directores;
			String [] reparto;
		
		
		
		
		
	}

}
