<h1 align="center">Proyecto Liga Profesional</h1>

<p align="right"> <img src="https://komarev.com/ghpvc/?username=mauro-cf&label=Profile%20views&color=0e75b6&style=flat" alt="mauro-cf" /> </p>

<h3 align="left">Introducción</h3>
<h4>El proyecto desarrollado en Java simula un torneo de una liga de fútbol profesional en sus instancias finales, donde se tiene las etapas más importantes: 
  Octavos de final, Cuartos de final, Semifinal y Final. El proyecto nos permite elegir la etapa del torneo, crear la cantidad de equipos dependiendo de la etapa seleccionada, 
  la generación de partidos de manera aleatoria y la simulación de resultados, ofreciendo una simulación realista de una competición futbolística.  </h4>

<h3 align="left">Objetivos generales:</h3>
<h4>
  <ol>Desarrollo de un simulador de liga profesional de futbol que permita a los usuarios crear y gestionar torneos de manera realista</ol>
  <ol>Simular el comportamiento de un torneo, incluyendo partidos y simulando los resultados</ol>
</h4>
<h3 align="left">Objetivos específicos:</h3>
<h4>
  <ol>Selección de una etapa de un torneo</ol>
  <ol>Creación de equipos, la cantidad depende de la etapa seleccionada</ol>
  <ol>Generar automáticamente los partidos de cada ronda</ol>
  <ol>Simular de manera aleatoria la cantidad de goles por partido</ol>
  <ol>Definir ganadores por etapa</ol>
</h4>

<h3 align="left">Funcionalidades:</h3>
<h4>
<ol>Creación de equipos participantes</ol>
<ol>Sorteo aleatorio para los partidos de cada etapa</ol>
<ol>Generación aleatoria de los resultados de cada equipo</ol>
<ol>Los equipos ganadores avanzan a la siguiente etapa</ol>
<ol>Muestra los enfrentamientos, marcado y resultados de cada etapa</ol>
<ol>Definir un campeón</ol>
</h4>


<h3 align="left">Explicación de Clases Principales:</h3>
<h4>
  <ol>Clase Equipo: Representa a un equipo con sus atributos</ol>
  <ol>Clase Partido: Contiene el método principal para simular un partido con goles de equipo local y visitante</ol> 
  <ol>Clase Torneo: Contiene los métodos para la para el emparejamiento de equipos, selección de etapa, guardar el Campeón </ol>
</h4>

<h3 align="left">Explicación de Excepciones:</h3>
<h4>
<ol>EquipoRepetidoException: Controla que, al ingresar los equipos, no se repita uno con el mismo nombre.</ol>
<ol>EquipoVacioException: Controla que, no permita el ingreso de un equipo si nombre.</ol>
<ol>EtapaInvalidaException: Controla que, al elegir una etapa sea solo entre el valor de 1 y 4 que representan a las etapas (1. Octavos de final, 2. Cuartos de final, 3. Semifinal y 4. Final)</ol>
<ol>NumberFormatException: Controla que, al elegir una etapa, solo se ingrese datos enteros. </ol>
<ol>IOException:  Indica que ha ocurrido un error durante la operación de entrada o salida.</ol>

</h4>


<h3 align="left">Ejecución:</h3>

<h4>Selección de Etapa</h4>
<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/J0RvSzzP/image.png' border='0' alt='image'/></a><br/>
<h4>Ingreso de Equipos</h4>
<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/SRQ1D1gP/image.png' border='0' alt='image'/></a><br/>
<h4>Sorteo de partidos, resultados y visualización de los equipos ganadores de cada etapa y el campeón</h4>
<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/pVk6pxTM/image.png' border='0' alt='image'/></a><br/>
<h4>Archivo txt de respaldo con la información del campeón del torneo.</h4>
<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/xdrsW1sM/image.png' border='0' alt='image'/></a><br/>

<h3 align="left">Ejecución:</h3>
<h4>Se ha demostrado la viabilidad de desarrollar un simulador de torneos de una liga profesional de futbol en java. El simulado es capaz de generar partidos con resultados realistas.</h4>


<h3 align="left">Lenguaje de desarrollo:</h3>
<p align="left"> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> </p><br/><br/>
