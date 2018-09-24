/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Festividades;

/**
 *
 * @author marip
 */
public class Festividades {
    public String infoPais(String Pais) {
        
        String info = "";
        
        switch (Pais){
            
            
                        case "":
                        case "Pais":
                            return("Debe de escribir el nombre de un pais en el espacio designado");
                            
                            
                        // America del Sur
                        case "Argentina":
                        case "argentina":
                            return("ARGENTINA\n" +
"Enero 1 Año Nuevo \n" +
"Febrero 12 Carnaval\n" +
"Febrero 13 martes de carnaval\n" +
"Marzo 20 Equinoccio de marzo \n" +
"Marzo 24 Día Conmemorativo\n" +
"Marzo 29 Jueves Santo\n" +
"Marzo 30 Buen viernes\n" +
"Marzo 31 Primer día de Pascua\n" +
"Abril 1 Dia de pascua\n" +
"Abril 2 Día de los Veteranos\n" +
"Abril 7 Último día de Pascua\n" +
"Abril 24 Día de acción para la tolerancia y el respeto entre las personas\n" +
"Abril 30 Puente público de vacaciones\n" +
"Mayo 1 Día del Trabajo / Día de Mayo\n" +
"Mayo 25 Día Nacional / Revolución de mayo de 1810\n" +
"Junio 15 Fin del Ramadán\n" +
"Junio 17 Conmemoración del General Don Martín Miguel de Güemes\n" +
"Junio 20 Día de la Bandera\n" +
"Junio 21 Solsticio de junio\n" +
"Julio 9 Día de la Independencia\n" +
"Agosto 20 Día de San Martín\n" +
"Agosto 22 Eid al-Adha\n" +
"Sep 10 Rosh Hashana\n" +
"Setiembre 11 Segundo día de Rosh Hashaná\n" +
"Setiembre 19 Muharram / Año Nuevo\n" +
"Setiembre 23 Equinoccio de septiembre\n" +
"Octubre 15 Día de respeto por la diversidad cultural\n" +
"Noviembre 19 Día de la Soberanía Nacional\n" +
"Diciembre 8 Fiesta de la Inmaculada Concepción\n" +
"Diciembre 21 Solsticio de diciembre\n" +
"Diciembre 24 Puente público de vacaciones\n" +
"Diciembre 25 día de Navidad\n" +
"Diciembre 31 Víspera de Año Nuevo");
                            
                            
                        case "Bolivia":
                        case "bolivia":
                            return("BOLIVIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero, el día de los Reyes Magos\n" +
"22 de enero Día de la Fundación del Estado Plurinacional\n" +
"2-Feb Fiesta de la Candelaria\n" +
"12 de febrero Carnaval\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"19 de marzo Día del padre\n" +
"20 de marzo, equinoccio\n" +
"23 mar Día del mar\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"12 de abril Día del niño\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"27 de mayo Día de la Madre\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"21 de junio Año Aymara de Año Nuevo\n" +
"22-jun Aymara Día de Año Nuevo de vacaciones\n" +
"6 de agosto Día de la Independencia\n" +
"Día de la bandera 17-Ago\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día de la Resistencia Indígena\n" +
"Noviembre 2 Dia de todos los Santos\n" +
"Diciembre 21 Solisticio de Diciembre\n" +
"Diciembre 25 día de Navidad\n" +
"Diciembre 31 Víspera de Año Nuevo");
                            
                            
                            case "Brasil":
                        case "brasil":
                            return("BRASIL\n" +
"1 de enero día de año nuevo\n" +
"10 de febrero carnaval sábado\n" +
"11 de febrero Domingo de carnaval\n" +
"12 de febrero Carnaval lunes\n" +
"Martes 13 de febrero de carnaval\n" +
"14 de febrero final del Carnaval (hasta las 2 p.m.)\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"21-Apr. Tiradentes Day\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"31 de mayo Corpus Christi\n" +
"12 de junio, día de San Valentín brasileño\n" +
"21 de junio Solsticio de junio\n" +
"12 de agosto Día del padre\n" +
"7 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Nuestra Señora Aparecida / Día del Niño\n" +
"15-Oct. Día del Maestro\n" +
"28-oct vacaciones de servicio público\n" +
"2-Nov Día de las Ánimas\n" +
"15 de noviembre día de la proclamación de la República\n" +
"20-Nov Día de la Conciencia Negra\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad (a partir de las 2 p.m.)\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de Año Nuevo (a partir de las 2 p.m.)");
                            
                        case "Chile":
                        case "chile":
                            return("CHILE\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de mayo día de la Armada\n" +
"21 de junio Solsticio de junio\n" +
"2-Jul San Pedro y San Pablo\n" +
"16 de julio Nuestra Señora del Monte Carmelo\n" +
"15-ago Asunción de María\n" +
"17-Sep Extended National Holiday\n" +
"Día Nacional 18-Sep\n" +
"Día del ejército 19-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"15-Oct Día de la Hispanidad\n" +
"1-Nov Todos los Santos\n" +
"2-Nov día de la Reforma\n" +
"8 de diciembre Día de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Colombia":
                        case "colombia":
                            return("COLOMBIA\n" +
"1 de enero día de año nuevo\n" +
"8 de enero Epifanía\n" +
"8 de marzo Día de la Mujer\n" +
"19 de marzo Día de San José\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"23 de abril, día de la lengua\n" +
"26-abr. Día de los secretarios\n" +
"28 de abril Día del niño\n" +
"29 de abril Día de los árboles\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"14 de mayo Día de la Ascensión\n" +
"15 de mayo Día del Maestro\n" +
"4 de junio Corpus Christi\n" +
"11 de junio Sagrado Corazón\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"2-Jul Fiesta de San Pedro y San Pablo\n" +
"20 de julio Día de la Independencia\n" +
"7 de agosto Día de la Batalla de Boyacá\n" +
"20-ago Asunción de María\n" +
"15 de septiembre, día de San Valentín\n" +
"23 de septiembre de septiembre equinoccio\n" +
"15-Oct Día de la Hispanidad\n" +
"31 de octubre de Halloween\n" +
"5-Nov Todos los Santos\n" +
"12-nov Independencia de Cartagena\n" +
"14-Nov Día de la Mujer Colombiana\n" +
"7 de diciembre, víspera de la fiesta de la Inmaculada Concepción\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo\n" +
"15 de noviembre día de la proclamación de la República\n" +
"20-Nov Día de la Conciencia Negra\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad (a partir de las 2 p.m.)\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de Año Nuevo (a partir de las 2 p.m.)\n" +
"2-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Ecuador":
                        case "ecuador":
                            return("ECUADOR\n" +
"1 de enero día de año nuevo\n" +
"12 de febrero Carnaval\n" +
"13 de febrero Carnaval\n" +
"17-feb día de trabajo especial (compensación para el lunes de carnaval)\n" +
"24-feb día de trabajo especial (compensación para el martes de carnaval)\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"24 de mayo La batalla de Pichincha\n" +
"21 de junio Solsticio de junio\n" +
"24-Jul Memorial del cumpleaños de Simón Bolívar\n" +
"10 de agosto Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"9-Oct Independencia de Guayaquil\n" +
"2-Nov Todos los días del alma\n" +
"3-Nov Independencia de Cuenca\n" +
"6-Dec Fundación de Quito\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Guyana Francesa":
                        case "guyana francesa":
                            return("GUYANA FRANCESA\n" +
"1 de enero día de año nuevo\n" +
"12 de febrero Carnaval\n" +
"13 de febrero Carnaval\n" +
"17-feb día de trabajo especial (compensación para el lunes de carnaval)\n" +
"24-feb día de trabajo especial (compensación para el martes de carnaval)\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"24 de mayo La batalla de Pichincha\n" +
"21 de junio Solsticio de junio\n" +
"24-Jul Memorial del cumpleaños de Simón Bolívar\n" +
"10 de agosto Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"9-Oct Independencia de Guayaquil\n" +
"2-Nov Todos los días del alma\n" +
"3-Nov Independencia de Cuenca\n" +
"6-Dec Fundación de Quito\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Guyana":
                        case "guyana":
                            return("GUYANA\n" +
"1 de enero día de año nuevo\n" +
"23 de febrero Mashramani (Día de la República)\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"5 de mayo Día de llegada\n" +
"26 de mayo Día de la Independencia\n" +
"21 de junio Solsticio de junio\n" +
"2 de julio Día de la CARICOM\n" +
"1 de agosto día de la emancipación\n" +
"22-ago Eid ul Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de noviembre Milad un Nabi (Mawlid)\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Paraguay":
                        case "paraguay":
                            return("PARAGUAY\n" +
"1 de enero día de año nuevo\n" +
"1-Mar día de los héroes\n" +
"20 de marzo, equinoccio\n" +
"El horario de verano de 25-Mar termina\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"14 de mayo fiesta nacional\n" +
"15 de mayo Día de la Independencia\n" +
"12-Jun Armisticio Chaco\n" +
"21 de junio Solsticio de junio\n" +
"15 de agosto Fundación de Asunción\n" +
"23 de septiembre de septiembre equinoccio\n" +
"29-Sep Boqueron Battle Victory Day\n" +
"7-Oct Comienza el horario de verano\n" +
"8 de diciembre Día de la Virgen de Caacupé\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad (medio día)\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Peru":
                        case "peru":
                            return("1 de enero día de año nuevo\n" +
"6 de enero, el día de los Reyes Magos\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"Día de la bandera del 7 de junio\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"24-Jun Farmer Day\n" +
"24 de junio Inti Raymi Day\n" +
"29 de junio San Pedro y San Pablo\n" +
"28 de julio Día de la Independencia\n" +
"29 de julio Día de la Independencia (día 2)\n" +
"30-Aug Santa Rosa De Lima\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día de las Fuerzas Armadas 24-Sep\n" +
"8-Oct Batalla de Angamos\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Surinam":
                        case "surinam":
                            return("SURINAM\n" +
"1 de enero de año nuevo\n" +
"25-Feb Día de la Revolución\n" +
"2 de marzo Holi Phagwa\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul Día de la Libertad\n" +
"9-Ago Día de los Pueblos Indígenas\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-oct Día de los Maroons\n" +
"7-Nov Diwali\n" +
"25 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Uruguay":
                        case "uruguay":
                            return("URUGUAY\n" +
"1 de enero día de año nuevo\n" +
"6 de enero, el día de los Reyes Magos\n" +
"12 de febrero Carnaval\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"23 de abril Aterrizaje de los 33 orientales\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de mayo Batalla de Las Piedras\n" +
"19 de junio Memorial de cumpleaños de José Artigas\n" +
"21 de junio Solsticio de junio\n" +
"18 de julio Día de la Constitución\n" +
"25 de agosto día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"15-Oct Día de la Hispanidad\n" +
"2-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Venezuela":
                        case "venezuela":
                            return("VENEZUELA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero, el día de los Reyes Magos\n" +
"12 de febrero Carnaval\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"19 de marzo Día de San José\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"19 de abril Declaración de Independencia\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"24 de junio Carabobo batalla\n" +
"29 de junio San Pedro y San Pablo\n" +
"5 de julio Día de la Independencia\n" +
"24-Jul Cumpleaños de Simón Bolívar\n" +
"3-Ago Día de la Bandera\n" +
"4 de agosto Día de la Guardia Nacional\n" +
"15-ago Asunción de María\n" +
"11-Sep Nuestra Señora de Coromoto\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día de la Resistencia Indígena\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Todos los días del alma\n" +
"27-Nov día de la aviación\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31-Dic Nochevieja");
                            
                        // Australia & Pacific
                        case "Samoa Americana":
                        case "saoma americana":
                            return("SAOMA AMERICANA\n" +
"1 de enero día de año nuevo\n" +
"15 de enero Día de Martin Luther King Jr.\n" +
"19 de febrero Día del Presidente\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"17 de abril día de la bandera\n" +
"28 de mayo Memorial Day\n" +
"21 de junio Solsticio de junio\n" +
"4 de julio Día de la Independencia\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8-Oct Día de la Raza\n" +
"11-Nov. Día de los Veteranos\n" +
"22 de noviembre Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Australia":
                        case "australia":
                            return("AUSTRALIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"7 de enero día ortodoxo de Navidad\n" +
"14 de enero Año Nuevo ortodoxo\n" +
"26 de enero, día de Australia\n" +
"31 de enero Tu B'Shevat (Día del árbol)\n" +
"12-Feb Royal Hobart Regatta\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero, año nuevo chino\n" +
"1-Mar Purim\n" +
"Día del Trabajo 5-Mar\n" +
"Día del Trabajo 12-Mar\n" +
"12 de marzo, ocho horas diarias\n" +
"12 de marzo Adelaide Cup\n" +
"12 de marzo Día de Canberra\n" +
"17 de marzo Día de San Patricio\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo día de la armonía\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Primer día de Pascua\n" +
"31-Mar horario de verano termina\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"3 de abril Martes de Pascua\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr Último día de Pascua\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Semana Santa ortodoxa\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"11 de abril Yom HaShoah\n" +
"13-Abr Isra y Mi'raj\n" +
"19 de abril Yom HaAtzmaut\n" +
"25-abr ANZAC Day\n" +
"3 de mayo Lag B'Omer\n" +
"7 de mayo, día de mayo\n" +
"7 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"16 de mayo Inicio de Ramadán\n" +
"20 de mayo Pentecostés\n" +
"20 de mayo Shavuot\n" +
"21 de mayo, lunes de Pentecostés\n" +
"26 de Mayo Día Nacional de Perdón\n" +
"27 de mayo Domingo de la Trinidad\n" +
"28 de mayo día de la reconciliación\n" +
"31 de mayo Corpus Christi\n" +
"4 de junio, día de Australia Occidental\n" +
"6 de junio, día de Queensland\n" +
"10 de junio Laylatul Qadr (Noche de poder)\n" +
"11-Jun cumpleaños de la reina\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"8-Jul Primer día de la Semana NAIDOC\n" +
"22 de julio Tisha B'Av\n" +
"6-ago New South Wales Bank Holiday\n" +
"6 de agosto Día del picnic del Territorio del Norte\n" +
"15-ago Asunción de María\n" +
"15-Aug Royal National Agricultural Show Day Queensland\n" +
"22-ago Eid ul Adha\n" +
"2 de septiembre Día del padre\n" +
"10-Sep Rosh Hashana\n" +
"12-Sep Muharram / Año Nuevo islámico\n" +
"19-Sep Iom Kipur\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Primer día de Sucot\n" +
"24 de septiembre cumpleaños de la reina\n" +
"28-Sep AFL Grand Final viernes\n" +
"30-Sep Hoshana Rabbah\n" +
"1-Oct Shemini Atzeret\n" +
"1-Oct Cumpleaños de la Reina\n" +
"1-Oct día del trabajo\n" +
"2-Oct Simchat Torah\n" +
"4-Oct Fiesta de San Francisco de Asís\n" +
"6-Oct Comienza el horario de verano\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"5 de noviembre día de recreación\n" +
"6-Nov Melbourne Cup Day\n" +
"7-Nov Diwali / Deepavali\n" +
"11-Nov día de la conmemoración\n" +
"21 de noviembre Milad un Nabi (Mawlid)\n" +
"2-Dic Primer domingo de Adviento\n" +
"3-dic Primer día de Hanukkah\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"10-Dic Último día de Hanukkah\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Islas Cook":
                        case "islas cook":
                            return("ISLAS COOK\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"25-abr ANZAC Day\n" +
"11-Jun cumpleaños de la reina\n" +
"21 de junio Solsticio de junio\n" +
"4 de agosto Día de la Constitución\n" +
"23 de septiembre de septiembre equinoccio\n" +
"26-oct día del Evangelio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Fiji":
                        case "fiji":
                            return("FIJI\n" +
"1 de enero de año nuevo\n" +
"13-ene Hora de ahorro de luz diurna termina\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"2 de abril lunes de Pascua\n" +
"21 de junio Solsticio de junio\n" +
"29 de junio Día Nacional del Deporte\n" +
"Día de la Constitución del 7 de septiembre\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Fiji Day\n" +
"Comienza el horario de verano de 3-nov\n" +
"7-Nov Diwali\n" +
"19-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Polinesia frances":
                        case "polinesia frances":
                            return("POLINESIA FRANCES\n" +
"1 de enero día de año nuevo\n" +
"5-Mar Llegada de los primeros misioneros\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"8 de mayo Día de la Victoria\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"29 de junio Día de la Autonomía Interna\n" +
"14 de julio, día de la Bastilla\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Guam":
                        case "guam":
                            return("GUAM\n" +
"1 de enero de año nuevo\n" +
"15 de enero Día de Martin Luther King Jr.\n" +
"19 de febrero Día del Presidente\n" +
"20 de marzo, equinoccio\n" +
"28 de mayo Memorial Day\n" +
"21 de junio Solsticio de junio\n" +
"4 de julio Día de la Independencia\n" +
"21 de julio Día de la Liberación\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8-Oct Día de la Raza\n" +
"11-Nov Día de los Veteranos\n" +
"22 de noviembre Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Kiribati":
                        case "kiribati":
                            return("KIRIBATI\n" +
"1 de enero día de año nuevo\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"21 de junio Solsticio de junio\n" +
"11 de julio Día de la Independencia\n" +
"15 de julio Día de Unimwane\n" +
"16 de julio Día de Unaine\n" +
"6 de agosto Día de la Juventud\n" +
"23 de septiembre de septiembre equinoccio\n" +
"11-dic Día de los Derechos Humanos y la Paz\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        case "Islas Marshall":
                        case "islas marshall":
                            return("ISLAS MARSHALL\n" +
"1 de enero día de año nuevo\n" +
"1-mar día de la conmemoración\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de mayo Día de la Constitución\n" +
"21 de junio Solsticio de junio\n" +
"6 de julio Pescadores de vacaciones\n" +
"Día del Trabajo 7-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28 de septiembre Manit Day\n" +
"17-Nov Día del Presidente\n" +
"7 de diciembre día del Evangelio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Micronesia":
                        case "micronesia":
                            return("MICRONESIA\n" +
"1 de enero día de año nuevo\n" +
"11-Jan Kosrae Constitution Day\n" +
"1 de marzo día de Yap\n" +
"20 de marzo, equinoccio\n" +
"Día de la cultura de 31 de marzo en Micronesia (Chuuk y Pohnpei)\n" +
"10 de mayo Día de la Constitución\n" +
"21 de junio Solsticio de junio\n" +
"21-Aug Gospel Day (Kosrae)\n" +
"8 de septiembre Día de la Liberación de Kosrae\n" +
"11-Sep Día de la Liberación de Pohnpei\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct. Día de la Constitución de Chuuk\n" +
"24-oct Día de las Naciones Unidas\n" +
"3-Nov Día de la Independencia\n" +
"8-Nov Pohnpei Constitution Day\n" +
"11-Nov Veterans of Foreign Wars Day\n" +
"22 de noviembre Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre Día de la Constitución de Yap\n" +
"25 de diciembre día de Navidad");
                            
                        case "Nauru":
                        case "nauru":
                            return("NAURU\n" +
"1 de enero día de año nuevo\n" +
"31 de enero Día de la Independencia\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"17 de mayo Día de la Constitución\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"26-oct Día de Angam\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Nueva Zelanda":
                        case "nueva zelanda":
                            return("NUEVA ZELANDA\n" +
"1 de enero día de año nuevo\n" +
"2-Jan día después del día de Año Nuevo\n" +
"22 de enero Día del Aniversario de Wellington\n" +
"29 de enero Día de Aniversario de Northland\n" +
"29 de enero Día de Aniversario de Auckland\n" +
"29 de enero Día del Aniversario de Nelson\n" +
"6 de febrero día de Waitangi\n" +
"14 de febrero Día de San Valentín\n" +
"12 de marzo, día del aniversario de Taranaki\n" +
"20 de marzo, equinoccio\n" +
"26-Mar Otago Aniversario Día\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de abril tontos\n" +
"2 de abril lunes de Pascua\n" +
"Día de aniversario del 3 de abril en Southland\n" +
"25-abr ANZAC Day\n" +
"13 de mayo Día de la Madre\n" +
"4-Jun cumpleaños de la reina\n" +
"21 de junio Solsticio de junio\n" +
"2 de septiembre Día del padre\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día de aniversario del 24 de septiembre en South Canterbury\n" +
"19-oct Día de Aniversario de Hawke's Bay\n" +
"22 de octubre día del trabajo\n" +
"29-Oct Marlborough Aniversario Día\n" +
"31 de octubre de Halloween\n" +
"5-Nov Guy Fawkes Night\n" +
"7-Nov Diwali / Deepavali\n" +
"16 de noviembre Día de Aniversario de Canterbury\n" +
"3-Dec Día de Aniversario de las Islas Chatham\n" +
"3-Dec Westland Anniversary Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Nueva Caledonia":
                        case "nueva caledonia":
                            return("NUEVA CALEDONIA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"8 de mayo Día de la Victoria\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"14 de julio, día de la Bastilla\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de septiembre, día de Nueva Caledonia\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Islas Marianas del Norte":
                        case "islas marianas del norte":
                            return("ISLAS MARIANAS DEL NORTE\n" +
"1 de enero día de año nuevo\n" +
"15 de enero Día de Martin Luther King Jr.\n" +
"19 de febrero Día del Presidente\n" +
"20 de marzo, equinoccio\n" +
"24-Mar Commonwealth Covenant Day\n" +
"30 de marzo Viernes Santo\n" +
"28 de mayo Memorial Day\n" +
"21 de junio Solsticio de junio\n" +
"4 de julio Día de la Independencia\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8-Oct Día Cultural de la Commonwealth\n" +
"Día de la Ciudadanía 4-Nov\n" +
"11-Nov. Día de los Veteranos\n" +
"22-Nov Día de Acción de Gracias\n" +
"8 de diciembre Día de la Constitución\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Palau":
                        case "palau":
                            return("PALAU\n" +
"1 de enero día de año nuevo\n" +
"Día de la Juventud 15-Mar\n" +
"20 de marzo, equinoccio\n" +
"5 de mayo Día de la tercera edad\n" +
"1 de junio, día del presidente\n" +
"21 de junio Solsticio de junio\n" +
"Día de la Constitución del 9 de julio\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Día de la Independencia\n" +
"22 de noviembre Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        case "Papua Nueva Guinea":
                        case "papua nueva guinea":
                            return("PAPUA NUEVA GUINEA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"11-Jun cumpleaños de la reina\n" +
"21 de junio Solsticio de junio\n" +
"23-Jul Día Nacional de la Conmemoración\n" +
"26-Ago Día Nacional de Arrepentimiento\n" +
"16 de septiembre día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Samoa":
                        case "samoa":
                            return("SAMOA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31-Mar horario de verano termina\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio Día de la Independencia\n" +
"2 de julio Día de la Independencia observado\n" +
"13-ago Lotu\n" +
"23 de septiembre de septiembre equinoccio\n" +
"29-Sep Comienza el horario de verano\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Islas Salomon":
                        case "islas salomon":
                            return("ISLAS SALOMON\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31-Mar horario de verano termina\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio Día de la Independencia\n" +
"2 de julio Día de la Independencia observado\n" +
"13-ago Lotu\n" +
"23 de septiembre de septiembre equinoccio\n" +
"29-Sep Comienza el horario de verano\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        // Australia & Pacific
                        case "Tonga":
                        case "tonga":
                            return("TONGA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"25-abr ANZAC Day\n" +
"4 de junio día de la emancipación\n" +
"21 de junio Solsticio de junio\n" +
"4 de julio Cumpleaños de Su Majestad el Rey Tupou VI\n" +
"17-Sep Cumpleaños del Príncipe Heredero Tupouto'a-'Ulukalala\n" +
"23 de septiembre de septiembre equinoccio\n" +
"4 de noviembre Día de la Constitución\n" +
"3-Dec aniversario de la coronación del rey Tupou I\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Tuvalu":
                        case "tuvalu":
                            return("TUVALU\n" +
"1 de enero día de año nuevo\n" +
"12 de marzo, día de la Commonwealth\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"14 de mayo Día del Evangelio\n" +
"9 de junio Cumpleaños de la Reina\n" +
"21 de junio Solsticio de junio\n" +
"6-Ago Día Nacional del Niño\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12 de noviembre Heredero del cumpleaños del trono\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Vanuatu":
                        case "vanuatu":
                            return("VANUATU\n" +
"1 de enero día de año nuevo\n" +
"21 de febrero Día del padre Lini\n" +
"5-Mar día del jefe personalizado\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de junio Solsticio de junio\n" +
"24-Jul Día del Niño\n" +
"30 de julio Día de la Independencia\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día de la Constitución del 5 de octubre\n" +
"29-Nov Día de la Unidad\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Wallis y Futuna":
                        case "wallis y futuna":
                            return("WALLIS Y FUTUNA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"28 de abril Día de St. Pierre Chanel\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de junio Solsticio de junio\n" +
"14 de julio, día de la Bastilla\n" +
"29 de julio día del territorio\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Día de la Familia");
                            
                        //Atlantic
                        case "Islas Bermudas":
                        case "islas bermudas":
                            return("ISLAS BERMUDAS\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"11-Mar comienza el horario de verano\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"25 de mayo Día de las Bermudas\n" +
"17 de junio Día del padre\n" +
"18 de junio Día Nacional de los Héroes\n" +
"21 de junio Solsticio de junio\n" +
"2 de agosto día de la emancipación\n" +
"3-Ago Somers 'Day\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"4-Nov Horario de verano termina\n" +
"11-Nov día de la conmemoración\n" +
"12-Nov día conmemorativo observado\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Islas Virgenes Britanicas":
                        case "islas virgenes britanicas":
                            return("ISLAS VIRGENES BRITANICAS\n" +
"1 de enero día de año nuevo\n" +
"5-Mar Cumpleaños de Lavity Stoutt\n" +
"12 de marzo, día de la Commonwealth\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"21 de mayo, lunes de Pentecostés\n" +
"9 de junio, cumpleaños del soberano\n" +
"21 de junio Solsticio de junio\n" +
"Día del territorio 1 de julio\n" +
"6-ago Festival lunes\n" +
"7-Ago Festival Martes\n" +
"8-agosto Festival Miércoles\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-oct Día de la Santa Úrsula\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Islas Malvinas":
                        case "islas malvinas":
                            return("ISLAS MALVINAS\n" +
"1 de enero día de año nuevo\n" +
"10 de enero Día de Margaret Thatcher\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"21 de abril: cumpleaños de la reina\n" +
"14 de junio Día de la Liberación\n" +
"21 de junio Solsticio de junio\n" +
"14 de agosto Día de las Malvinas\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Peat Cutting Monday\n" +
"8 de diciembre día de batalla\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        case "Groenlandia":
                        case "groenlandia":
                            return("GROENLANDIA\n" +
"1 de enero de año nuevo\n" +
"6 de enero Epifanía\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"16 de mayo Día de oración general\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"21 de junio Día Nacional\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Santa Helena":
                        case "santa helena":
                            return("SANTA HELENA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"16 de abril, cumpleaños de la reina\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de mayo Día de Santa Elena\n" +
"21 de junio Solsticio de junio\n" +
"3 de septiembre de vacaciones bancarias\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                            
                        //Indian Ocean
                        case "Maldivas":
                        case "maldivas":
                            return("MALDIVAS\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"16 de mayo Inicio de Ramadán\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"26 de julio Día de la Independencia\n" +
"22-ago Eid ul Adha\n" +
"12-Sep Muharram / Año Nuevo islámico\n" +
"23 de septiembre de septiembre equinoccio\n" +
"3-Nov Victory Day\n" +
"11-Nov Día de la República\n" +
"21 de noviembre Milad un Nabi (Mawlid)\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Mayotte":
                        case "mayotte":
                            return("MAYOTTE\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"13 de abril Mi'raj\n" +
"1 de mayo del Día del Trabajo\n" +
"8 de mayo: fin de la segunda guerra mundial\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"14-Jul Día de la República Francesa\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11 de noviembre vacaciones de noviembre\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        //America del Norte 
                        case "Anguila":
                        case "anguila":
                            return("ANGUILA\n" +
"1 de enero día de año nuevo\n" +
"2 de marzo James Ronald Webster Day\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"30 de mayo Día de Anguila\n" +
"11-junio Cumpleaños de Sovereign\n" +
"21 de junio Solsticio de junio\n" +
"19 de agosto Día de la Constitución\n" +
"23 de septiembre de septiembre equinoccio\n" +
"19 de diciembre, día de la separación\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Antigua y Barbuda":
                        case "antigua y barbuda":
                            return("ANTIGUA Y BARBUDA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"7 de mayo del Día del Trabajo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov día de la independencia\n" +
"Día de los Héroes Nacionales el 9 de diciembre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Aruba":
                        case "aruba":
                            return("ARUBA\n" +
"1 de enero día de año nuevo\n" +
"25 de enero Cumpleaños de Betico Croes\n" +
"18-Mar Himno Nacional y Día de la Bandera\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril, día del rey\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Barbados":
                        case "barbados":
                            return("BARBADOS\n" +
"1 de enero día de año nuevo\n" +
"21 de enero Errol Barrow Day\n" +
"22-Jan Errol Barrow Día observado\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"28 de abril Día Nacional de los Héroes\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1 de agosto día de la emancipación\n" +
"6 de agosto Kadooment Day\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"30 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31-Dic Noche Vieja");
                            
                        case "Belice":
                        case "belice":
                            return("BELICE\n" +
"1 de enero día de año nuevo\n" +
"9-Mar Día Nacional de Héroes y Benefactores\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"24 de mayo Día de la Commonwealth\n" +
"21 de junio Solsticio de junio\n" +
"10-Sep Día de San Jorge Cayo\n" +
"21 de septiembre día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día Panamericano\n" +
"19-Nov Garifuna Settlement Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        //case "Islas Virgenes Britanicas":
                        //case "islas virgenes britanicas":
                        //    return("venezuela");
                        case "Canada":
                        case "canada":
                            return("CANADA\n" +
"1 de enero día de año nuevo\n" +
"2-Jan Día después del día de Año Nuevo\n" +
"6 de enero Epifanía\n" +
"7 de enero día ortodoxo de Navidad\n" +
"14 de enero Año Nuevo ortodoxo\n" +
"31 de enero Tu B'Shevat (Día del árbol)\n" +
"2-Feb Día de la marmota\n" +
"12 de febrero Día de la familia\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"15-Feb Día Nacional de la Bandera de Canadá\n" +
"16 de febrero, año nuevo chino\n" +
"19 de febrero día de las islas\n" +
"19 de febrero día de la familia\n" +
"19-Feb Día de la herencia de Nueva Escocia\n" +
"19 de febrero Louis Riel Day\n" +
"23 de febrero Día de la herencia de Yukon\n" +
"1-Mar Purim\n" +
"1 de marzo, día de San David\n" +
"11-Mar comienza el horario de verano\n" +
"12 de marzo, día de la Commonwealth\n" +
"17 de marzo Día de San Patricio\n" +
"19 de marzo Día de San Patricio\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"31 de marzo Primer día de Pascua\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"6 de abril Día Nacional de Tartan\n" +
"7-abr Último día de Pascua\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Semana Santa ortodoxa\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"9 de abril Vimy Ridge Day\n" +
"11 de abril Yom HaShoah\n" +
"13-Abr Isra y Mi'raj\n" +
"19 de abril Yom HaAtzmaut\n" +
"23 de abril, día de San Jorge\n" +
"3 de mayo Lag B'Omer\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"16 de mayo Inicio de Ramadán\n" +
"20 de mayo Pentecostés\n" +
"20 de mayo Shavuot\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de mayo Día de Victoria\n" +
"21 de mayo Día Nacional de los Patriotas\n" +
"27 de mayo Domingo de la Trinidad\n" +
"31 de mayo Corpus Christi\n" +
"10 de junio Laylatul Qadr (Noche de poder)\n" +
"15 de junio Eid ul Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"21-Jun Día Nacional de los Pueblos Indígenas\n" +
"21-Jun Día Nacional de los Pueblos Indígenas\n" +
"24 de junio Día de San Juan Bautista\n" +
"25 de junio Día de San Juan Bautista observado\n" +
"Día de Descubrimiento el 25 de junio\n" +
"1 de julio día de Canadá\n" +
"1 de julio Memorial Day\n" +
"2 de julio Día de Canadá observado\n" +
"9 de julio Día de Orangemen\n" +
"9 de julio Día de Nunavut\n" +
"22 de julio Tisha B'Av\n" +
"1-Ago The Royal St John's Regatta (Día de Regatta)\n" +
"Día del Patrimonio 6-Aug en Alberta\n" +
"Día cívico / provincial de 6 de agosto\n" +
"6 de agosto Terry Fox Day\n" +
"Día 6 de agosto en Nuevo Brunswick\n" +
"6 de agosto Día de la Columbia Británica\n" +
"6 de agosto Día de Natal\n" +
"15-ago Asunción de María\n" +
"17-Aug Gold Cup Parade\n" +
"20 de agosto día de descubrimiento\n" +
"22-ago Eid ul Adha\n" +
"Día del Trabajo 3-Sep\n" +
"10-Sep Rosh Hashana\n" +
"12-Sep Muharram / Año Nuevo islámico\n" +
"19-Sep Iom Kipur\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Primer día de Sucot\n" +
"30-Sep Hoshana Rabbah\n" +
"1-Oct Shemini Atzeret\n" +
"2-Oct Simchat Torah\n" +
"4-Oct Fiesta de San Francisco de Asís\n" +
"8-Oct Día de Acción de Gracias\n" +
"8-Oct Día de Acción de Gracias\n" +
"18-Oct Día del asistente sanitario\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"4-Nov Horario de verano termina\n" +
"5-Nov Diwali / Deepavali\n" +
"11-Nov día de la conmemoración\n" +
"11-Nov día de la conmemoración\n" +
"12-Nov día conmemorativo observado\n" +
"12-Nov día conmemorativo observado\n" +
"21 de noviembre Milad un Nabi (Mawlid)\n" +
"2-Dic Primer domingo de Adviento\n" +
"3-dic Primer día de Hanukkah\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"10-Dic Último día de Hanukkah\n" +
"11-Dec aniversario del Estatuto de Westminster\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de Diciembre Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Islas Caiman":
                        case "islas caiman":
                            return("ISLAS CAIMAN\n" +
"1 de enero día de año nuevo\n" +
"22 de enero Día Nacional de los Héroes\n" +
"14 de febrero Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"21-May Discovery Day\n" +
"11-Jun cumpleaños de la reina\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"2 de julio Día de la Constitución\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"12-Nov día de la conmemoración\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Costa Rica":
                        case "costa rica":
                            return("COSTA RICA\n" +
"1 de enero día de año nuevo\n" +
"19 de marzo Día de San José\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"11-Abr Batalla de Rivas\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"Anexión de Guanacaste el 25 de julio\n" +
"2-ago Nuestra Señora de los Ángeles\n" +
"15 de agosto día de la madre\n" +
"Día de los Parques Nacionales 24-Ago.\n" +
"9 de septiembre Día del niño\n" +
"15 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día de las Culturas\n" +
"2-Nov Día de las Ánimas\n" +
"22 de noviembre Día del Maestro\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31-Dic Nochevieja");
                            
                        case "Cuba":
                        case "cuba":
                            return("CUBA\n" +
"1 de enero día de la liberación\n" +
"2 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"28-Jan Memorial del cumpleaños de José Martí\n" +
"11-Mar comienza el horario de verano\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo Día de la Independencia\n" +
"21 de junio Solsticio de junio\n" +
"Aniversario de la revolución del 25 de julio\n" +
"26 de julio Día de la rebelión\n" +
"27-Jul Revolution Anniversary Celebration\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Comienzo de la Guerra de la Independencia\n" +
"4-Nov Horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Curazao":
                        case "curazao":
                            return("CURAZAO\n" +
"1 de enero día de año nuevo\n" +
"12 de febrero Carnaval lunes\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"27-El cumpleaños del rey\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"3 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"Día de la bandera del 2 de julio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Día de Curazao\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Dominica":
                        case "dominica":
                            return("DOMINICANA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"6 de agosto Día de la Emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"3-Nov Día de la Independencia\n" +
"3-Nov día de servicio comunitario\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Republica Dominicana":
                        case "republica dominicana":
                            return("REPUBLICA DOMINICANA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"21 de enero Nuestra Señora de la Altagracia\n" +
"29-Jan Duarte's Day\n" +
"27 de febrero día de la independencia\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"30 de abril Día del Trabajo\n" +
"27 de mayo Día de la Madre\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"29 de julio Día del padre\n" +
"16 de agosto día de la restauración\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Nuestra Señora de las Mercedes\n" +
"5 de noviembre Día de la Constitución\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "El Salvador":
                        case "el salvador":
                            return("EL SALVADOR \n" +
"1 de enero día de año nuevo\n" +
"16 de enero Firma de los Acuerdos de Paz\n" +
"8 de marzo Día de la mujer\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"26-Mar Día Nacional de la Vida, la Paz y la Justicia\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"3 de mayo Día de la Cruz\n" +
"7 de mayo Día de los Soldados\n" +
"10 de mayo Día de la Madre\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"22 de junio Día del Maestro\n" +
"Celebraciones del 4-Ago de San Salvador\n" +
"Celebraciones del 5-Ago de San Salvador\n" +
"Celebraciones del 6 de agosto de San Salvador\n" +
"15 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Día del niño\n" +
"12-Oct Día de la Hispanidad\n" +
"2-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Granada":
                        case "granada":
                            return("GRANADA\n" +
"1 de enero de año nuevo\n" +
"7 de febrero día de la independencia\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"13 de mayo Día de la Madre\n" +
"21 de mayo, lunes de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"6 de agosto Día de la Emancipación\n" +
"Carnaval del 13 de agosto (primer día)\n" +
"Carnaval de 13 de agosto (segundo día)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"25 de octubre Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Guatemala":
                        case "guatemala":
                            return("GUATEMALA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado de Pascua\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de junio Solsticio de junio\n" +
"Día del ejército 30-jun\n" +
"15 de agosto Día de la Asunción\n" +
"15 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Dia de la raza\n" +
"20-oct Revolución de 1944\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Haiti":
                        case "haiti":
                            return("HAITI\n" +
"1-ene día de año nuevo / día de la independencia\n" +
"2 de Enero Día de los Héroes / Día de los Ancestros\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"1 de mayo Día de la Agricultura y el Trabajo\n" +
"Día de la Bandera / Día de la Universidad 18 de mayo\n" +
"27 de mayo Día de la Madre\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"24 de junio Día del padre\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"17-Oct Dessalines Day\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"18-Nov Vertières Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Honduras":
                        case "honduras":
                            return("HONDURAS\n" +
"1 de enero día de año nuevo\n" +
"6 de enero, el día de los Reyes Magos\n" +
"3-feb Nuestra Señora de Suyapa\n" +
"19 de marzo Día del padre\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"14 de abril, día de América\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"10-Sep Día del niño\n" +
"15 de septiembre Día de la Independencia\n" +
"17-Sep. Día del Maestro\n" +
"23 de septiembre de septiembre equinoccio\n" +
"3-Oct Día de Morazán\n" +
"12-Oct Día de la Hispanidad\n" +
"21-Oct Army Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Jamaica":
                        case "jamaica":
                            return("JAMAICA\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"23 de mayo Día del Trabajo / Primero de Mayo\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1 de agosto día de la emancipación\n" +
"6 de agosto Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"15-oct Día Nacional de los Héroes\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Martinica":
                        case "martinica":
                            return("MARTINICA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"8 de mayo Día de la Victoria\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"14 de julio, día de la Bastilla\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Mexico":
                        case "mexico":
                            return("MEXICO\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Día de los Santos Reyes\n" +
"5 de febrero Día de la Constitución\n" +
"14 de febrero Día de San Valentín\n" +
"14 de febrero Miércoles de ceniza\n" +
"Día de la Bandera 24-Feb\n" +
"Día de la expropiación petrolera de 18 de marzo\n" +
"Día de fiesta de 19 de marzo para el Memorial del Cumpleaños de Benito Juárez\n" +
"20 de marzo, equinoccio\n" +
"21-Mar Memorial de cumpleaños de Benito Juárez\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"30 de abril Día del niño\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"5 de mayo Batalla de Puebla\n" +
"10 de mayo Día de la Madre\n" +
"10 de mayo Día de la Ascensión\n" +
"15 de mayo Día del Maestro\n" +
"20 de mayo domingo de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul Elecciones generales en México\n" +
"15-ago Asunción de María\n" +
"15 de septiembre Grito de Dolores\n" +
"16 de septiembre día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día de la Hispanidad\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"19 de noviembre día libre para el Memorial del Día de la Revolución\n" +
"20-Nov Memorial Día de la Revolución\n" +
"25-Nov Día de Cristo Rey\n" +
"1 de diciembre día de la inauguración\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"12-Dic Día de la Virgen de Guadalupe\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"28 de diciembre Día de los Santos Inocentes\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Montserrat":
                        case "montserrat":
                            return("MONTSERRAT\n" +
"1 de enero día de año nuevo\n" +
"17 de marzo Día de San Patricio\n" +
"19 de marzo Día de San Patricio observado\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"7 de mayo del Día del Trabajo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"6 de agosto Día de la Emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31-Dic Festival Day");
                            
                        case "Nicaragua":
                        case "nicaragua":
                            return("NICARAGUA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"30 de mayo Día de la Madre\n" +
"21 de junio Solsticio de junio\n" +
"19-Jul El Día de la Revolución Sandinista\n" +
"Inicio de las celebraciones del 1 de agosto en Santo Domingo\n" +
"Celebraciones del 10 de agosto último día de Santo Domingo\n" +
"Día del ejército 2-Sep\n" +
"14-Sep Batalla de San Jacinto\n" +
"15 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día de la Resistencia Indígena\n" +
"2-Nov Todos los Santos\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31-Dic Nochevieja");
                            
                        case "Panama":
                        case "panama":
                            return("PANAMA\n" +
"1 de enero día de año nuevo\n" +
"8 de enero Día libre para el Día del Mártir\n" +
"9 de enero Día del Mártir\n" +
"10 de febrero Carnaval\n" +
"Carnaval de 11 de febrero\n" +
"12 de febrero Carnaval\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Carnaval / Miércoles de ceniza\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Fundación de la Ciudad Vieja de Panamá\n" +
"23 de septiembre de septiembre equinoccio\n" +
"3-Nov Día de la Independencia\n" +
"Día de la bandera de 4 de noviembre\n" +
"5-Nov Día del Colón\n" +
"Grito de 10 nov en Villa de los Santos\n" +
"26-Nov Día de Independencia de España\n" +
"28-nov Independencia de España\n" +
"8 de diciembre día de la madre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Puerto Rico":
                        case "puerto rico":
                            return("PUERTO RICO\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"15 de enero Día de Martin Luther King Jr\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Día de San Valentín\n" +
"19 de febrero día de los presidentes\n" +
"20 de marzo, equinoccio\n" +
"22 de marzo día de la emancipación\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"28 de mayo Memorial Day\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"4 de julio Día de la Independencia de los Estados Unidos\n" +
"Día de la Constitución del 25 de julio\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12-Oct Día de la Hispanidad\n" +
"11-Nov Día de los Veteranos\n" +
"12-Nov Día de los Veteranos observado\n" +
"19-Nov Discovery Day\n" +
"22-Nov Día de Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "San Cristobal y Nieves":
                        case "san cristobal y nieves":
                            return("SAN CRISTOBAL Y NIEVES\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"6 de agosto Día de la Emancipación\n" +
"Día de Culturama 7-Aug\n" +
"16-Sep Día Nacional de los Héroes\n" +
"Día de la Independencia de 19-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Santa Lucia":
                        case "santa lucia":
                            return("SANTA LUCIA \n" +
"1 de enero día de año nuevo\n" +
"22 de febrero día de la independencia\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"1 de agosto día de la emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Día de Acción de Gracias\n" +
"13 de diciembre día nacional\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "San Martin":
                        case "san martin":
                            return("SAN MARTIN\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril, día del rey\n" +
"30 de abril, día del carnaval\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio Día de la Emancipación\n" +
"14 de julio, día de la Bastilla\n" +
"23 de septiembre de septiembre equinoccio\n" +
"11-Nov Día de San Martín\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "San Pedro y Miquelon":
                        case "san pedro y miquelon":
                            return("SAN PEDRO Y MIQUELON\n" +
"11-Mar comienza el horario de verano\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"8 de mayo Día de la Victoria\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"Día Nacional 14-Jul\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"4-Nov Horario de verano termina\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "San Vicente y las Granadinas":
                        case "san vicente y las granadinas":
                            return("SAN VICENTE Y LAS GRANADINAS \n" +
"1 de enero día de año nuevo\n" +
"14-Mar Día Nacional de los Héroes\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día Nacional de los Trabajadores\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"Lunes de carnaval de 2 años\n" +
"Martes de carnaval 3 de julio\n" +
"1 de agosto día de la emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"27-Oct Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Sint Maarten":
                        case "sint maarten":
                            return("SINT MAARTEN\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril, día del rey\n" +
"30 de abril, día del carnaval\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio Día de la Emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8 de octubre Día de la Constitución\n" +
"11-Nov Día de San Martín\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "St. Barts":
                        case "st. barts":
                            return("ST. BARTS\n" +
"1 de enero día de año nuevo\n" +
"12 de febrero Carnaval lunes\n" +
"14 de febrero Carnaval / Miércoles de ceniza\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"8 de mayo Día de la Victoria\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"Día Nacional 14-Jul\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"9 de octubre día de la abolición\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Las Bahamas":
                        case "las bahamas":
                            return("LAS BAHAMAS\n" +
"1 de enero día de año nuevo\n" +
"Día de la mayoría de 10 de enero\n" +
"14 de febrero Día de San Valentín\n" +
"11-Mar comienza el horario de verano\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"1 de junio Randol Fawkes Día del Trabajo\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"10 de julio Día de la Independencia\n" +
"6 de agosto Día de la Emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día Nacional de Héroes 8-Oct\n" +
"4-Nov Horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Trinidad y Tobago":
                        case "trinidad y tobago":
                            return("TRINIDAD Y TOBAGO\n" +
"1 de enero día de año nuevo\n" +
"12 de febrero Carnaval\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Día de la Liberación de los Bautistas Espirituales\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"30 de mayo día de llegada india\n" +
"31 de mayo Corpus Christi\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"19 de junio Día del Trabajo\n" +
"21 de junio Solsticio de junio\n" +
"1 de agosto día de la emancipación\n" +
"31 de agosto día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de septiembre Día de la República\n" +
"7-Nov Diwali / Deepavali\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Islas Turcas y Caicos":
                        case "islas turucas y caicos":
                            return("ISLAS TURCAS Y CAICOS\n" +
"1 de enero día de año nuevo\n" +
"12 de marzo, día de la Commonwealth\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"25 de mayo Día Nacional de los Héroes\n" +
"11-Jun cumpleaños de la reina\n" +
"21 de junio Solsticio de junio\n" +
"6 de agosto Día de la Emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28 de septiembre Día Nacional de la Juventud\n" +
"8-Oct Día Nacional del Patrimonio\n" +
"10-Nov día de la conmemoración\n" +
"23-Nov Día de Acción de Gracias\n" +
"10-Dec Día Internacional de los Derechos Humanos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Estados Unidos":
                        case "estados unidos":
                            return("ESTADOS UNIDOS\n" +
"1 de enero día de año nuevo\n" +
"1-ene víspera de año nuevo observado\n" +
"6 de enero Epifanía\n" +
"7 de enero día ortodoxo de Navidad\n" +
"12 de enero Lee Jackson Day\n" +
"13 de enero Stephen Foster Memorial Day\n" +
"14 de enero Año Nuevo ortodoxo\n" +
"15 de enero Día de Martin Luther King Jr.\n" +
"15 de enero Cumpleaños de Robert E Lee\n" +
"15 de enero Idaho Día de los Derechos Humanos\n" +
"15 de enero día de los derechos civiles\n" +
"19 de enero Cumpleaños de Robert E Lee\n" +
"19-ene día conmemorativo confederado\n" +
"29 de enero Kansas Day\n" +
"31 de enero Tu Bishvat / Tu B'Shevat\n" +
"1-Feb Día Nacional de la Libertad\n" +
"2-Feb Día de la marmota\n" +
"2-Feb National Wear Red Day\n" +
"4-Feb Rosa Parks Day\n" +
"4-Feb Super Bowl\n" +
"12-feb cumpleaños de Lincoln\n" +
"12-feb cumpleaños de Lincoln\n" +
"13 de febrero Maha Shivaratri\n" +
"13 de febrero Martes de Carnaval / Mardi Gras\n" +
"13 de febrero Martes de Carnaval / Mardi Gras\n" +
"13 de febrero Martes de Carnaval / Mardi Gras\n" +
"14 de febrero Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"14-Feb Día de la Estadidad en Arizona\n" +
"15 de febrero: cumpleaños de Susan B Anthony\n" +
"16 de febrero, año nuevo chino\n" +
"16 de febrero Día de Elizabeth Peratrovich\n" +
"19 de febrero día de los presidentes\n" +
"19 de febrero Daisy Gatson Bates Day\n" +
"28 de febrero Día de Linus Pauling\n" +
"1-Mar Purim\n" +
"1-Mar Día de San David\n" +
"2-Mar Holi\n" +
"2 de marzo Día de la Independencia de Texas\n" +
"2 de marzo a través del Día de América\n" +
"2-Mar día de apreciación del empleado\n" +
"5 de marzo Día de Casimir Pulaski\n" +
"6-Mar Town Meeting Day Vermont\n" +
"11-Mar comienza el horario de verano\n" +
"16-Mar día de evacuación observado\n" +
"17 de marzo Día de San Patricio\n" +
"17 de marzo día de la evacuación\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"25 de marzo Día de Maryland\n" +
"26 de marzo Día de Maryland observado\n" +
"26 de marzo Día del príncipe Jonah Kuhio Kalanianaole\n" +
"26 de marzo Día de Seward\n" +
"29 de marzo Jueves Santo\n" +
"29 de marzo Día Nacional de los Veteranos de la Guerra de Vietnam\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"31 de marzo Pascua (primer día)\n" +
"31 de marzo Día de César Chávez\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"2-abr Pascua Florida Day\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"6 de abril Día Nacional de Tartan\n" +
"7-abr último día de Pascua\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Semana Santa ortodoxa\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"10-Abr. Día de los Trabajadores de la Biblioteca Nacional\n" +
"11 de abril Yom HaShoah\n" +
"13-Abr Isra y Mi'raj\n" +
"13 de abril, cumpleaños de Thomas Jefferson\n" +
"15 de abril Día del padre Damián\n" +
"16 de abril día de la emancipación\n" +
"16 de abril Día del Patriota\n" +
"16 de abril maratón de Boston\n" +
"17 de abril día de impuestos\n" +
"19 de abril Yom Ha'atzmaut\n" +
"21 de abril Día de San Jacinto\n" +
"22 de abril, día de Oklahoma\n" +
"23-Apr día conmemorativo confederado\n" +
"23 de abril vacaciones estatales\n" +
"25-Apr Día de Profesionales Administrativos\n" +
"26-Apr día conmemorativo confederado\n" +
"26 de abril Lleve a nuestras hijas e hijos al trabajo\n" +
"27 de abril día del árbol\n" +
"30 de abril Día Conmemorativo Confederado\n" +
"1 de mayo Día de la Ley\n" +
"Día de la lealtad 1 de mayo\n" +
"1 de mayo Día de Lei\n" +
"3 de mayo Lag BaOmer\n" +
"3 de mayo día nacional de oración\n" +
"4-mayo Kent State Shootings Remembrance\n" +
"4 de mayo Kentucky Oaks\n" +
"4 de mayo Día de la Independencia de Rhode Island\n" +
"5-Mayo Cinco de Mayo\n" +
"5 de mayo Kentucky Derby\n" +
"5 de mayo Día Nacional de Disposición de Explosivos (EOD)\n" +
"6 de mayo Día Nacional de las Enfermeras\n" +
"8 de mayo Día de Truman\n" +
"8 de mayo Día de las elecciones primarias West Virginia\n" +
"10 de mayo Día de la Ascensión\n" +
"10 de mayo Día Conmemorativo Confederado\n" +
"10 de mayo Día Conmemorativo Confederado\n" +
"11 de mayo Día de agradecimiento del cónyuge militar\n" +
"13 de mayo Día de la Madre\n" +
"15 de mayo Día de los Caídos de los Oficiales de la Paz\n" +
"16 de mayo comienza Ramadán\n" +
"18 de mayo Día de la defensa nacional del transporte\n" +
"19 de mayo día de las fuerzas armadas\n" +
"19-mayo Preakness Stakes\n" +
"20 de mayo Pentecostés\n" +
"20 de mayo Shavuot\n" +
"21 de mayo, lunes de Pentecostés\n" +
"22 de mayo Día Marítimo Nacional\n" +
"22 de mayo Harvey Milk Day\n" +
"23 de mayo Servicios médicos de emergencia para niños Día\n" +
"25 de mayo Día Nacional de los Niños Desaparecidos\n" +
"27 de mayo Domingo de la Trinidad\n" +
"28 de mayo Memorial Day\n" +
"28 de mayo Cumpleaños de Jefferson Davis\n" +
"31 de mayo Corpus Christi\n" +
"1-Jun Día de la Estadidad\n" +
"3-Jun Jefferson Davis Cumpleaños\n" +
"4-Jun Jefferson Davis Cumpleaños\n" +
"6-Jun D-Day\n" +
"9-Jun Belmont Stakes\n" +
"10 de junio Lailat al-Qadr\n" +
"11 de junio, día de Kamehameha\n" +
"14-Jun Army Birthday\n" +
"Día de la bandera 14-jun\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"17-jun Bunker Hill Day\n" +
"18-Jun Bunker Hill Day observado\n" +
"19 de junio Juneteenth\n" +
"19 de junio Día de la Emancipación\n" +
"20 de junio, día de Virginia Occidental\n" +
"20 de junio American Eagle Day\n" +
"21 de junio Solsticio de junio\n" +
"4 de julio Día de la Independencia\n" +
"14 de julio, día de la Bastilla\n" +
"22 de julio Tisha B'Av\n" +
"22 de julio Día de los Padres\n" +
"24-Jul Pioneer Day\n" +
"27-Jul Día Nacional de los Veteranos de Guerra de Corea del Armisticio\n" +
"1 de agosto día de Colorado\n" +
"Cumpleaños de la Guardia Costera del 4 de agosto\n" +
"7-Ago Día del Corazón Púrpura\n" +
"13 de agosto día de la victoria\n" +
"15-ago Asunción de María\n" +
"16-Ago Bennington Battle Day\n" +
"17-Aug Día de la Estadidad en Hawaii\n" +
"19-Ago Día de la aviación nacional\n" +
"21 a agosto Día de la tercera edad\n" +
"22-ago Eid al-Adha\n" +
"25-ago Raksha Bandhan\n" +
"26-Ago Día de la Igualdad de la Mujer\n" +
"27-Ago Lyndon Baines Johnson Day\n" +
"2 de septiembre Janmashtami\n" +
"Día del Trabajo 3-Sep\n" +
"8 de septiembre Carl Garner Día de Limpieza de Tierras Federales\n" +
"9-Sep Día Nacional de los Abuelos\n" +
"9 de septiembre día de admisión en California\n" +
"10-Sep Rosh Hashana\n" +
"10-Sep Rosh Hashana\n" +
"Día del Patriota 11-Sep\n" +
"12-Sep Ganesh Chaturthi\n" +
"12-Sep Muharram\n" +
"Día Nacional de Limpieza 15-Sep\n" +
"Día de la Constitución de 17 de septiembre y Día de la Ciudadanía\n" +
"18-Sep. Cumpleaños de la Fuerza Aérea\n" +
"19-Sep Iom Kipur\n" +
"19-Sep Iom Kipur\n" +
"21-Sep Día nacional de reconocimiento de prisioneros de guerra / MIA\n" +
"22 de septiembre día de la emancipación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Primer día de Sucot\n" +
"28 de septiembre Día de los nativos americanos\n" +
"30-Sep último día de Sucot\n" +
"30-Sep Gold Star Día de la Madre\n" +
"1-Oct Shmini Atzeret\n" +
"1-Oct Día de la salud infantil\n" +
"2-Oct Simchat Torah\n" +
"4-Oct Fiesta de San Francisco de Asís\n" +
"7 de octubre maratón de Chicago\n" +
"8-Oct Día de la Raza\n" +
"8-Oct Día de la Raza\n" +
"8 de octubre Día de los nativos americanos\n" +
"8 de octubre Día de los Pueblos Indígenas\n" +
"8 de octubre Día de los Pueblos Indígenas\n" +
"9 de octubre Navaratri\n" +
"9-Oct Leif Erikson Day\n" +
"13-Oct Cumpleaños de la Marina\n" +
"15-Oct Día de la seguridad del bastón blanco\n" +
"16 de octubre día del jefe\n" +
"18 de octubre Dussehra\n" +
"18 de octubre, día de Alaska\n" +
"20 de octubre, el día más dulce\n" +
"26-Oct Nevada Day\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"4-Nov Horario de verano termina\n" +
"Maratón de la ciudad de Nueva York 4-Nov\n" +
"6 de noviembre día de las elecciones\n" +
"6-Nov Diwali / Deepavali\n" +
"8-Nov Día de devolución Delaware\n" +
"10-Nov Cumpleaños del Cuerpo de Marines\n" +
"11-Nov Día de los Veteranos\n" +
"12-Nov Día de los Veteranos observado\n" +
"21-Nov El cumpleaños del Profeta\n" +
"22-Nov Día de Acción de Gracias\n" +
"23 de noviembre vacaciones estatales\n" +
"23-Nov día de los presidentes\n" +
"23-Nov Cumpleaños de Lincoln / Día de Lincoln\n" +
"23-Nov día después de acción de gracias\n" +
"23-Nov día de la familia\n" +
"23-Nov Black Friday\n" +
"23-Nov Día de la herencia india americana\n" +
"26-Nov Cyber ​​Monday\n" +
"2-Dic Primer domingo de Adviento\n" +
"3-Dec Janucá / Hanukkah (primer día)\n" +
"6 de diciembre, día de San Nicolás\n" +
"7-Dec Día de Recuerdo de Pearl Harbor\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"10-Dic último día de Janucá\n" +
"12-Dic Fiesta de Nuestra Señora de Guadalupe\n" +
"13 de diciembre Cumpleaños de la Guardia Nacional\n" +
"17-Dec Día de la aviación panamericana\n" +
"17 de diciembre Día de los hermanos Wright\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"24 de diciembre víspera de Navidad\n" +
"24 de diciembre Cumpleaños de Washington\n" +
"24 de diciembre Cumpleaños de Washington\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Kwanzaa (hasta el 1 de enero)\n" +
"Día 26 de diciembre después del día de Navidad\n" +
"31 de diciembre víspera de año nuevo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Islas Virgenes":
                        case "islas virgenes":
                            return("ISLAS VIRGENES\n" +
"1 de enero de año nuevo\n" +
"6 de enero, día de los Reyes Magos\n" +
"15 de enero Día de Martin Luther King Jr.\n" +
"19 de febrero Día del Presidente\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"Día de transferencia 31-Mar\n" +
"1 de abril, día de Pascua\n" +
"1 de abril día de los inocentes\n" +
"2 de abril lunes de Pascua\n" +
"13 de mayo Día de la Madre\n" +
"28 de mayo Memorial Day\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"3 de julio día de la emancipación\n" +
"4 de julio Día de la Independencia de los Estados Unidos\n" +
"30 de julio día de la súplica de huracán\n" +
"Día del Trabajo 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8-Oct Islas Vírgenes - Día de la Amistad de Puerto Rico (Día de la Hispanidad)\n" +
"Acción de gracias del huracán del 25 de octubre\n" +
"1-Nov día de la libertad\n" +
"11-Nov. Día de los Veteranos\n" +
"29-Nov Día de Acción de Gracias\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                            //Asia
                        case "Afganistan":
                        case "afganistan":
                            return("AFGANISTAN\n" +
"20 de marzo, equinoccio\n" +
"28 de abril, día de la victoria afgana\n" +
"16 de mayo comienza Ramadán\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"19 de agosto Día de la Independencia (Día Nacional)\n" +
"22-ago Eid al-Qurban\n" +
"21 de septiembre Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"30 de octubre Arba'een\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Armenia":
                        case "armenia":
                            return("ARMENIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero día de año nuevo (día 2)\n" +
"3 de enero día de año nuevo (día 3)\n" +
"4 de enero día de año nuevo (día 4)\n" +
"5 de enero Armenia Nochebuena\n" +
"6 de enero Armenia Día de Navidad\n" +
"28 de enero Día del Ejército\n" +
"6 de febrero día de los traductores\n" +
"8 de febrero Fiesta de San Vártan\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"7 de abril, Día de la Maternidad y la Belleza\n" +
"24-Apr Día de Conmemoración del Genocidio\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"8 de mayo Congreso\n" +
"9 de mayo Día de la victoria y la paz\n" +
"28 de mayo Día de la República\n" +
"1 de junio Día del niño\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"5 de julio Día de la Constitución\n" +
"8-Jul Vardavar\n" +
"1-Sep Día del Conocimiento y la Literatura\n" +
"21 de septiembre día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"7-Dec Spitak Remembrance Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Azerbaiyan":
                        case "azerbaiyan":
                            return("AZERBAIYAN\n" +
"1 de enero día de año nuevo\n" +
"1 de enero: Día Mundial de Solidaridad con Azerbaiyán observado\n" +
"2 de enero día de año nuevo (día 2)\n" +
"20 de enero Día de los Mártires\n" +
"22 de enero: Día de los Mártires observado\n" +
"8 de marzo Día de la mujer\n" +
"20 de marzo, equinoccio\n" +
"20 de marzo Nowruz / vacaciones de primavera\n" +
"21-Mar Nowruz / Vacaciones de primavera (vacaciones extra)\n" +
"22-Mar Nowruz / Vacaciones de primavera (vacaciones extra)\n" +
"23-Mar Nowruz / vacaciones de primavera (vacaciones extra)\n" +
"24-Mar Nowruz / vacaciones de primavera (vacaciones extra)\n" +
"9 de mayo Día de la victoria sobre el fascismo\n" +
"28 de mayo Día de la República\n" +
"15-jun El día de la salvación nacional del pueblo azerbaiyano\n" +
"15 de junio de vacaciones de Ramadán\n" +
"16 de junio vacaciones de Ramadán (día 2)\n" +
"21 de junio Solsticio de junio\n" +
"26 de junio Día de las Fuerzas Armadas de Azerbaiyán\n" +
"22-Ago. Fiesta del Sacrificio\n" +
"23-Ago Fiesta del Sacrificio (día 2)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Elección presidencial del 17 de octubre\n" +
"18 de octubre Día de la independencia nacional\n" +
"9-Nov Bandera estatal Día de Azerbaiyán\n" +
"12 de noviembre Día de la Constitución\n" +
"17-Nov día nacional de reavivamiento\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo\n" +
"31-Dic Día Mundial de Solidaridad con Azerbaiyán");
                            
                        case "Bahrein":
                        case "bahrein":
                            return("BAHREIN\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo, día de mayo\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr\n" +
"17 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"21-Ago Día de Arafat\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha\n" +
"24 de agosto Eid al-Adha\n" +
"25 de agosto Eid al-Adha\n" +
"26-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"20 de septiembre Ashoora\n" +
"21 de septiembre Ashoora (segundo día)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"Día Nacional 16-Dic\n" +
"17 de diciembre día nacional (segundo día)\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Bangladesh":
                        case "bangladesh":
                            return("BANGLADESH\n" +
"1 de enero día de año nuevo\n" +
"21 de enero Sri Panchami\n" +
"31 de enero Magha Purnima\n" +
"14 de febrero Maha Shivaratri\n" +
"14 de febrero Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"21-Feb Language Martyrs 'Day\n" +
"1-Mar Doljatra\n" +
"2-Mar Holi\n" +
"Día de la Bandera Nacional de 2 de marzo\n" +
"17 de marzo, cumpleaños de Sheikh Mujibur Rahman\n" +
"20 de marzo, equinoccio\n" +
"26 de marzo día de la independencia\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"13 de abril Shab-e-Meraj\n" +
"14 de abril Bengalí Año Nuevo\n" +
"30 de abril Shab e-Barat\n" +
"1 de mayo, día de mayo\n" +
"13 de mayo Día de la Madre\n" +
"22 de mayo Buda Purnima / Vesak\n" +
"7 de junio Jumatul Bidah\n" +
"10 de junio noche del destino\n" +
"16 de junio Eid ul-Fitr\n" +
"17 de junio Eid ul-Fitr Holiday\n" +
"17 de junio Día del padre\n" +
"18 de junio Eid ul-Fitr Holiday\n" +
"19 de junio Eid ul-Fitr Holiday\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio, 1 día festivo\n" +
"27 de julio Ashari Purnima\n" +
"15 de agosto día nacional de luto\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha Día 2\n" +
"24 de agosto Eid al-Adha Día 3\n" +
"25 de agosto Eid al-Adha Día 4\n" +
"26-ago Raksha Bandhan\n" +
"3 de septiembre Janmashtami\n" +
"13-Sep Ganesh Chaturthi\n" +
"21 de septiembre Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de septiembre Mahalaya\n" +
"25 de septiembre Madhu Purnima\n" +
"10-Oct Navaratri\n" +
"15-Oct Vijaya Dasami\n" +
"19-Oct Dussehra\n" +
"24-Oct Prabarana Purnima\n" +
"31 de octubre de Halloween\n" +
"6-Nov Sri Shayama Puja\n" +
"7 de noviembre Akhari Chahar Somba\n" +
"7-nov Lakshmi Puja\n" +
"20 de noviembre Eid e-Milad-un Nabi\n" +
"16 de diciembre día de la victoria\n" +
"20 de diciembre Fateha-i-Yajdaham\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Bhutan":
                        case "bhutan":
                            return("BHUTAN\n" +
"2 de enero Solsticio de invierno (Nyilo)\n" +
"17 de enero Día tradicional de ofrendas\n" +
"16-Feb Losar (Año Nuevo)\n" +
"17-Feb Losar (Año Nuevo)\n" +
"21-feb cumpleaños del rey\n" +
"22-feb cumpleaños del rey\n" +
"23-feb cumpleaños del rey\n" +
"20 de marzo, equinoccio\n" +
"25 de abril Shabdrung Kuchoe\n" +
"2 de mayo Cumpleaños del Rey Jigme Dorji Wangchuck\n" +
"29-mayo Buddha's Parinirvana\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio Cumpleaños del Rey Jigme Dorji Wangchuck\n" +
"16 de julio Primer sermón de Buda\n" +
"15-Sep Thimphu Drubchoe (Thimphu solamente)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23-Sep bendito día lluvioso\n" +
"19-Oct Dashain\n" +
"31-Oct Día descendente de Lord Buddha\n" +
"1-Nov Coronación del Rey Jigme Khesar Namgyel\n" +
"11-Nov Cumpleaños del Rey Jigme Singye Wangchuck\n" +
"17 de diciembre día nacional\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Brunei":
                        case "brunei":
                            return("BRUNEI\n" +
"1 de enero día de año nuevo\n" +
"23-feb día nacional\n" +
"20 de marzo, equinoccio\n" +
"13-Abr Isra y Mi'raj\n" +
"16 de mayo Inicio de Ramadán\n" +
"31 de mayo Día Real de las Fuerzas Armadas de Brunei\n" +
"10 de junio Laylatul Qadr (Noche de poder)\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"15 de julio, cumpleaños del sultán\n" +
"22-ago Eid ul Adha\n" +
"12-Sep Muharram / Año Nuevo islámico\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Camboya":
                        case "camboya":
                            return("CAMBOYA\n" +
"1 de enero de año nuevo\n" +
"Victoria del 7 de enero sobre el Día del Genocidio\n" +
"31 de enero Meak Bochea Day\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"14 de abril, día de año nuevo jemer (día 1)\n" +
"15 de abril, día de año nuevo jemer (día 2)\n" +
"16-Apr Khmer Año Nuevo (Día 3)\n" +
"29 de abril Día de Visak Bochea\n" +
"1 de mayo del Día del Trabajo\n" +
"Ceremonia de arado real del 3 de mayo\n" +
"13 de mayo Día de la Madre\n" +
"13 de mayo: cumpleaños del rey (día 1)\n" +
"14 de mayo Cumpleaños del Rey (Día 2)\n" +
"15 de mayo: cumpleaños del rey (día 3)\n" +
"20 de mayo Día de la Memoria\n" +
"1 de junio Día Internacional de los Niños\n" +
"17 de junio Día del padre\n" +
"18 de junio: cumpleaños de la madre del rey\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de septiembre Día Constitucional\n" +
"8 de octubre día de Pchum Ben (día 1)\n" +
"9 de octubre día de Pchum Ben (día 2)\n" +
"10 de octubre día de Pchum Ben (día 3)\n" +
"15-Oct Día de la Conmemoración del Padre del Rey\n" +
"23-oct Día del Acuerdo de Paz en París\n" +
"29-Oct Día de la Coronación del Rey\n" +
"9 de noviembre Día de la Independencia\n" +
"Ceremonia del Festival del Agua del 22 de noviembre (Día 1)\n" +
"Ceremonia del 23-Nov Water Festival (Día 2)\n" +
"Ceremonia del Festival del Agua de 24 de noviembre (Día 3)\n" +
"10-Dec Día Internacional de los Derechos Humanos\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "China":
                        case "china":
                            return("CHINA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero Fin de semana de Año Nuevo\n" +
"15-Feb Festival de primavera Eve\n" +
"16 de febrero, año nuevo chino\n" +
"17-feb Spring Festival Golden Week vacaciones\n" +
"18-feb Spring Festival Golden Week vacaciones\n" +
"19-feb Spring Festival Golden Week vacaciones\n" +
"20-feb Spring Festival Golden Week vacaciones\n" +
"21-feb Spring Festival Golden Week vacaciones\n" +
"2-Mar Lantern Festival\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"12 de marzo del día del árbol\n" +
"18-Mar Zhonghe Festival\n" +
"20 de marzo, equinoccio\n" +
"5 de abril Qing Ming Jie\n" +
"1 de mayo del Día del Trabajo\n" +
"4 de mayo Día de la Juventud\n" +
"1 de junio Día del niño\n" +
"18 de junio Festival del Bote del Dragón\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul CPC Día de la fundación\n" +
"Día Marítimo 11-Jul\n" +
"Día del ejército 1-Ago\n" +
"17 de agosto, día de San Valentín chino\n" +
"Festival del Espíritu 25-Ago\n" +
"10 de septiembre día de los docentes\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Festival del medio otoño\n" +
"Día Nacional 1-Oct\n" +
"2-Oct Día Nacional de la Semana Dorada de vacaciones\n" +
"3-Oct Día Nacional de la Semana Dorada de vacaciones\n" +
"4-Oct Día Nacional de la Semana Dorada de vacaciones\n" +
"5-Oct Día Nacional de la Semana Dorada de vacaciones\n" +
"6-Oct Día Nacional de la Semana Dorada de vacaciones\n" +
"Semana Nacional de Oro de la Semana Dorada de 7-Oct\n" +
"17-oct Festival Doble Noveno\n" +
"8-Nov día de los periodistas\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Chipre":
                        case "chipre":
                            return("CHIPRE\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"19 de febrero Lunes verde\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"25 de marzo Día de la independencia griega\n" +
"1 de abril, fiesta nacional de Chipre\n" +
"6-abr Viernes Santo (ortodoxo)\n" +
"7-abr Sábado Santo (ortodoxo)\n" +
"8 de abril Domingo de Pascua (ortodoxo)\n" +
"9 de abril lunes de Pascua (ortodoxo)\n" +
"Martes de Pascua ortodoxa de 10 de abril (solo bancos)\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"28 de mayo Pentecostés ortodoxo lunes\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de la Virgen María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Día de la Independencia de Chipre\n" +
"28-Oct El horario de verano termina\n" +
"28 de octubre Día de Ochi\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Timor Oriental":
                        case "timor oriental":
                            return("TIMOR ORIENTAL\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"20 de mayo Restauración del Día de la Independencia\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid ul Adha\n" +
"30 de agosto día de consulta popular\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"12 de noviembre Jornada Nacional de la Juventud\n" +
"28 de noviembre Proclamación del Día de la Independencia\n" +
"7-Dec Día Nacional de los Héroes\n" +
"8 de diciembre Día de Nuestra Señora de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Georgia":
                        case "georgia":
                            return("GEORGIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero de año nuevo (día 2)\n" +
"7 de enero día ortodoxo de Navidad\n" +
"19 de enero Epifanía ortodoxa\n" +
"14 de febrero Día de San Valentín\n" +
"3 de marzo, día de la madre\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Nowruz\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Domingo de Pascua ortodoxo\n" +
"Día de la Restauración de la Independencia de 9 de abril\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"9 de mayo Día de la Victoria\n" +
"12 de mayo, día de San Andrés\n" +
"26 de mayo Día de la Independencia\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"28-agosto Día de la Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"14-Oct Svetitskhovloba\n" +
"23 de noviembre, día de San Jorge\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Hong Kong":
                        case "hong kong":
                            return("HONG KONG\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero, día del Año Nuevo Lunar chino\n" +
"17-Feb Segundo día del Año Nuevo Lunar chino\n" +
"19-Feb Cuarto día del año nuevo lunar chino\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"5-Abr Tomb Sweeping Day\n" +
"1 de mayo del Día del Trabajo\n" +
"13 de mayo Día de la Madre\n" +
"22 de mayo Cumpleaños de Buda\n" +
"17 de junio Día del padre\n" +
"18 de junio Festival del Bote del Dragón\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul Día de establecimiento de la Región Administrativa Especial de Hong Kong\n" +
"2-Jul Día de establecimiento de la Región Administrativa Especial de Hong Kong observado\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día 25-Sep después del Festival del Medio Otoño\n" +
"1-Oct Día Nacional de la República Popular de China\n" +
"17-Oct Chung Yeung Festival\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "India":
                        case "india":
                            return("INDIA\n" +
"1 de enero día de año nuevo\n" +
"14 de enero Pongal\n" +
"14 de enero Makar Sankranti\n" +
"22 de enero Vasant Panchami\n" +
"26 de enero Día de la República\n" +
"31-ene Gur Ravidas Jayanti\n" +
"10-feb Maharishi Dayanand Saraswati Jayanti\n" +
"14 de febrero Maha Shivaratri / Shivaratri\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero, año nuevo chino\n" +
"19-feb Shivaji Jayanti\n" +
"1-Mar Holika Dahana\n" +
"2-Mar Holi\n" +
"18 de marzo Chaitra Sukhladi\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Rama Navami\n" +
"29 de marzo Jueves Santo\n" +
"29 de marzo Mahavir Jayanti\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Primer día de Pascua\n" +
"1 de abril de cumpleaños de Hazarat Ali\n" +
"1 de abril, día de Pascua\n" +
"14 de abril Vaisakhi\n" +
"14 de abril Ambedkar Jayanti\n" +
"15 de abril Mesadi / Vaisakhadi\n" +
"30 de abril Buda Purnima / Vesak\n" +
"1 de mayo-mayo\n" +
"9 de mayo Cumpleaños de Ravindranath\n" +
"13 de mayo-mayo\n" +
"15 de junio Ramzan Id / Eid-ul-Fitar\n" +
"15 de junio Jamat Ul-Vida\n" +
"16 de junio Ramzan Id / Eid-ul-Fitar\n" +
"17 de junio del Día del padre\n" +
"21 de junio Solsticio\n" +
"14 de julio Rath Yatra\n" +
"5 de agosto Día de la Amistad\n" +
"15 de agosto Día de la Independencia\n" +
"17-ago Parsi Año Nuevo\n" +
"22 de agosto Bakr Id / Eid ul-Adha\n" +
"25-ago Onam\n" +
"26-ago Rakha Bandhan (Rakhi)\n" +
"3 de septiembre Janmashtami\n" +
"13-Sep Ganesh Chaturthi / Vinayaka Chaturthi\n" +
"21 de septiembre Muharram / Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"2-Oct Mahatma Gandhi Jayanti\n" +
"16-Oct Maha Saptami\n" +
"17-Oct Maha Ashtami\n" +
"18-Oct Maha Navami\n" +
"19-Oct Dussehra\n" +
"24 de octubre Maharshi Valmiki Jayanti\n" +
"27 de octubre Karaka Chaturthi (Karva Chauth)\n" +
"31 de octubre de Halloween\n" +
"6-Nov Naraka Chaturdasi\n" +
"7-Nov Diwali / Deepavali\n" +
"8-Nov Govardhan Puja\n" +
"9 de noviembre Bhai Duj\n" +
"13 de noviembre Chhat Puja (Pratihar Sashthi / Surya Sashthi)\n" +
"21-nov Milad un-Nabi / Id-e-Milad\n" +
"23 de noviembre Guru Nanak Jayanti\n" +
"24-Nov Día del Martirio de Guru Tegh Bahadur\n" +
"3-dic Primer día de Hanukkah\n" +
"10-Dic Último día de Hanukkah\n" +
"21-Dic Dic Solsticio\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de Diciembre Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Indonesia":
                        case "indonesia":
                            return("INDONESIA\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Maha Shivaratri\n" +
"16 de febrero, día del Año Nuevo Lunar chino\n" +
"2-Mar Holi\n" +
"17 de marzo Día de silencio de Bali y Año Nuevo hindú\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"14 de abril Ascensión del profeta Mahoma\n" +
"1 de mayo Día Internacional del Trabajo\n" +
"10 de mayo Día de la Ascensión de Jesucristo\n" +
"29 de mayo Día de Waisak (aniversario de Buda)\n" +
"1 de junio, día de Pancasila\n" +
"11 de junio Primera fiesta conjunta antes de Idul Fitri\n" +
"12 de junio Segunda fiesta conjunta antes de Idul Fitri\n" +
"13 de junio Tercera fiesta conjunta antes de Idul Fitri\n" +
"14 de junio Cuarto día festivo antes de Idul Fitri\n" +
"15 de junio Idul Fitri Día 1\n" +
"16 de junio Idul Fitri Día 2\n" +
"18 de junio Primera fiesta conjunta después de Idul Fitri\n" +
"19 de junio Segunda fiesta conjunta después de Idul Fitri\n" +
"20 de junio Tercera fiesta conjunta después de Idul Fitri\n" +
"21 de junio Solsticio de junio\n" +
"27 de junio Día de elección regional\n" +
"17-ago Día de la Independencia de Indonesia\n" +
"22-ago Eid al-Adha\n" +
"26-ago Raksha Bandhan\n" +
"2 de septiembre Janmashtami\n" +
"11-Sep Muharram / Año Nuevo islámico\n" +
"13-Sep Ganesh Chaturthi\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Navaratri\n" +
"19-Oct Dussehra\n" +
"7-Nov Diwali / Deepavali\n" +
"20-Nov El cumpleaños del Profeta Muhammad\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Iran":
                        case "iran":
                            return("IRAN\n" +
"11-Feb Día de la Revolución\n" +
"20 de marzo, equinoccio\n" +
"20-Mar Oil Nationalization Day\n" +
"21 de marzo Norooz (Año Nuevo persa)\n" +
"22 de marzo Norooz Holiday\n" +
"23 de marzo Norooz vacaciones\n" +
"24 mar. Norooz Holiday\n" +
"30-Mar Cumpleaños del Imam Ali\n" +
"1-Abr Día de la República Islámica\n" +
"2 de abril día de la naturaleza\n" +
"13-abril La ascensión del Profeta\n" +
"2 de mayo: cumpleaños del Imam Mahdi\n" +
"4-Jun aniversario de la muerte de Jomeini\n" +
"5 de junio Revuelta de Khordad 15\n" +
"6 de junio Martirio de Imam Ali\n" +
"15 de junio Eid-e-Fetr (fin del Ramadán)\n" +
"16 de junio Eid-e-Fetr (vacaciones adicionales)\n" +
"21 de junio Solsticio de junio\n" +
"9 de julio Martirio del Imam Sadeq\n" +
"21-Ago Eid-e-Ghorban (Fiesta del Sacrificio)\n" +
"29-ago Eid-e-Ghadir\n" +
"19 de septiembre Tassoua\n" +
"20-Sep Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"29 de octubre Arbaeen\n" +
"7-Nov Muerte del Profeta Muhammad y Martirio del Imam Hassan\n" +
"8 de noviembre Martirio del Imam Reza\n" +
"25-Nov Cumpleaños del Profeta Muhammad y el Imam Sadeq\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Irak":
                        case "irak":
                            return("IRAQ\n" +
"1 de enero día de año nuevo\n" +
"Día del ejército 6-ene\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Nowruz\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid al-Fitr\n" +
"16-jun Eid al-Fitr vacaciones\n" +
"17-jun Eid al-Fitr vacaciones\n" +
"21 de junio Solsticio de junio\n" +
"14 de julio Día de la República\n" +
"22-ago Eid al-Adha\n" +
"23-ago Eid al-Adha vacaciones\n" +
"24-ago Eid al-Adha vacaciones\n" +
"25-ago Eid al-Adha vacaciones\n" +
"12-Sep. Año Nuevo islámico\n" +
"21 de septiembre Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"3-Oct Día de la Independencia de Iraq\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Israel":
                        case "israel":
                            return("ISRAEL		\n" +
"31 de enero Tu Bishvat\n" +
"28 de febrero Taanit Esther (ayuno de Ester)\n" +
"28 de febrero Erev Purim\n" +
"1-Mar Purim (Tel Aviv)\n" +
"2 de marzo Shushan Purim (Jerusalén)\n" +
"20 de marzo, equinoccio\n" +
"26 de marzo Yom HaAliyah\n" +
"30 de marzo Erev Pesaj\n" +
"31 de marzo Pesaj I (Primer día de Pascua)\n" +
"1 de abril Pesaj II (Pascua)\n" +
"2 de abril Pesaj III (Pascua)\n" +
"3 de abril Pesaj IV (Pascua)\n" +
"4 de abril de Pesaj V (Pascua)\n" +
"5 de abril Pesaj VI (Pascua)\n" +
"6 de abril Pesaj VII (Último día de Pascua)\n" +
"12 de abril Yom HaShoah / Memorial Day del Holocausto\n" +
"18 de abril Yom HaZikaron (Día de los Caídos)\n" +
"19 de abril Yom HaAtzmaut (Día de la Independencia)\n" +
"3 de mayo Lag B'Omer\n" +
"13 de mayo Yom Yerushalayim (Día de Jerusalén)\n" +
"19 de mayo Erev Shavuot\n" +
"20 de mayo Shavuot (Pentecostés)\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul rápido de Shiva Asar B'Tammuz\n" +
"21 de julio Erev Tisha B'Av\n" +
"22 de julio Tisha B'Av\n" +
"9-Sep Erev Rosh Hashana\n" +
"10-Sep Rosh Hashaná (Año Nuevo)\n" +
"11-Sep Rosh Hashaná II (Año nuevo día 2)\n" +
"12-Sep Tzom Gedaliah\n" +
"18-Sep Erev Yom Kippur\n" +
"19-Sep Iom Kipur\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23-Sep Erev Sucot\n" +
"24 de septiembre Sukkot I\n" +
"25 de septiembre Sukkot II\n" +
"26 de septiembre Sukkot III\n" +
"27 de septiembre Sukkot IV\n" +
"28 de septiembre Sukkot V\n" +
"29 de septiembre Sucot VI\n" +
"30-Sep Sucot VII / Hoshanah Rabah\n" +
"1-Oct Shmini Atzeret / Simchat Torah\n" +
"16-Oct Yom HaAliyah Observancia de la escuela\n" +
"3-Dec Hanukkah I (Vacaciones de luces)\n" +
"4 de diciembre Hanukkah II\n" +
"5 de diciembre Hanukkah III\n" +
"6 de diciembre Hanukkah IV\n" +
"7 de diciembre Hanukkah V\n" +
"8 de diciembre Hanukkah VI / Rosh Chodesh Tevet\n" +
"9 de diciembre Hanukkah VII\n" +
"10-Dec Hanukkah VIII\n" +
"18 de diciembre Asarah B'Tevet\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Japon":
                        case "japon":
                            return("JAPON\n" +
"1 de enero día de año nuevo\n" +
"2 de enero 2 de enero festivo\n" +
"3 de enero 3 de enero festivo\n" +
"8 de enero Día de la mayoría de edad\n" +
"11-Feb Día Nacional de la Fundación\n" +
"12-Feb Día de la Fundación Nacional observado\n" +
"14 de febrero Día de San Valentín\n" +
"3-Mar Dolls 'Festival / Girls' Festival\n" +
"20 de marzo, equinoccio\n" +
"21-Mar Spring Equinox\n" +
"29-abr Shōwa Day\n" +
"30-Abr Shōwa Day observado\n" +
"3 de mayo Constitución Memorial Day\n" +
"4-May Greenery Day\n" +
"5 de mayo Día del niño\n" +
"21 de junio Solsticio de junio\n" +
"7-Jul Star Festival\n" +
"16-Jul Sea Day\n" +
"11 de agosto día de la montaña\n" +
"17-Sep respeto por el día envejecido\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23 de septiembre equinoccio de otoño\n" +
"24-Sep Autumn Equinox observado\n" +
"8 de octubre día del deporte\n" +
"3-Nov día de la cultura\n" +
"15-Nov 7-5-3 Día\n" +
"23-Nov Día de Acción de Gracias del Trabajo\n" +
"21 de diciembre Solsticio de diciembre\n" +
"23 de diciembre Cumpleaños del Emperador\n" +
"24-Dec Cumpleaños del Emperador observado\n" +
"25 de Diciembre Navidad\n" +
"31 de diciembre 31 de diciembre festivo");
                            
                        case "Jordan":
                        case "jordan":
                            return("JORDAN\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"12 de abril Al Isra 'wal Miraj\n" +
"1 de mayo del Día del Trabajo\n" +
"16 de mayo comienza el Ramadán\n" +
"25 de mayo Día de la Independencia\n" +
"15 de junio Eid al-Fitr\n" +
"16-jun Eid al-Fitr vacaciones\n" +
"17-jun Eid al-Fitr vacaciones\n" +
"18-jun Eid al-Fitr vacaciones\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"22-ago Eid al-Adha holiday\n" +
"23-ago Eid al-Adha vacaciones\n" +
"24-ago Eid al-Adha vacaciones\n" +
"25-ago Eid al-Adha vacaciones\n" +
"12-Sep Muharram / Año Nuevo\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de noviembre, cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Kazakhstan":
                        case "kazakhstan":
                            return("KAZAKHSTAN\n" +
"1 de enero día de año nuevo\n" +
"2 de enero de año nuevo (día 2)\n" +
"7 de enero día ortodoxo de Navidad\n" +
"3-Mar día especial de trabajo\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"9 de marzo Día Internacional de la Mujer (vacaciones extra)\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Nauryz\n" +
"22 de marzo Nauryz (día 2)\n" +
"23 de marzo Nauryz (día 3)\n" +
"28 de abril día especial de trabajo\n" +
"30 de abril Día de la Unidad (vacaciones extra)\n" +
"1 de mayo Día de la Unidad\n" +
"5 de mayo, día especial de trabajo\n" +
"7 de mayo Día del defensor de la patria\n" +
"8 de mayo Día del defensor de la patria (vacaciones extra)\n" +
"9 de mayo Día de la Victoria\n" +
"21 de junio Solsticio de junio\n" +
"6-Jul Día de la Capital\n" +
"21-Aug Kurban Bairam\n" +
"25 de agosto día especial de trabajo\n" +
"30 de agosto Día de la Constitución\n" +
"31 de agosto Día de la Constitución (vacaciones extra)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Dic Día del Primer Presidente de la República de Kazajstán\n" +
"3-Dec Día del Primer Presidente de la República de Kazajstán observado\n" +
"16 de diciembre Día de la Independencia\n" +
"17 de diciembre día de la independencia (día 2)\n" +
"18 de diciembre día de la independencia (día 3)\n" +
"21 de diciembre Solsticio de diciembre\n" +
"29-Dic día especial de trabajo\n" +
"31-Dic Año Nuevo (vacaciones extra)\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Kuwait":
                        case "kuwait":
                            return("KUWAIT\n" +
"1 de enero día de año nuevo\n" +
"25 de febrero día nacional\n" +
"26 de febrero día de la liberación\n" +
"20 de marzo, equinoccio\n" +
"13-Abr Isra y Miraj\n" +
"15 de junio Eid al-Fitr\n" +
"16-jun Eid al-Fitr vacaciones\n" +
"17-jun Eid al-Fitr vacaciones\n" +
"21 de junio Solsticio de junio\n" +
"21-Aug Waqfat Arafat Day\n" +
"22-ago Eid al-Adha\n" +
"23-ago Eid al-Adha vacaciones\n" +
"24-ago Eid al-Adha vacaciones\n" +
"12-Sep. Año Nuevo islámico\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Kirguistan":
                        case "kirguistan":
                            return("KIRGUISTAN\n" +
"1 de enero de año nuevo\n" +
"7 de enero día ortodoxo de Navidad\n" +
"23 de febrero Día del defensor de la patria\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"21-Mar fiesta nacional \"Nooruz\"\n" +
"1 de mayo, día de mayo\n" +
"5 de mayo Día de la Constitución de la República Kirguisa\n" +
"9 de mayo Día de la Victoria\n" +
"15 de junio Orozo Ait\n" +
"21 de junio Solsticio de junio\n" +
"22 de agosto Kurman Ait\n" +
"31 de agosto Día de la Independencia de la República Kirguisa\n" +
"23 de septiembre de septiembre equinoccio\n" +
"7-Nov. Día de la gran revolución socialista de octubre\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Laos":
                        case "laos":
                            return("LAOS\n" +
"1 de enero día de año nuevo\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"14-Abr Lao Año Nuevo\n" +
"15-Abr Lao Año Nuevo\n" +
"16-abr Lao Año Nuevo\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"1 de junio Día del niño\n" +
"21 de junio Solsticio de junio\n" +
"28-Jul Khao Pansa (Comienzo budista rápido)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de octubre Bouk Ok Pansa (Ayuno budista)\n" +
"25-Oct Festival de Carreras de Botes\n" +
"22-Nov That Luang Festival\n" +
"Día Nacional 2-Dic\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Libano":
                        case "libano":
                            return("LIBANO\n" +
"1 de enero de año nuevo\n" +
"9 de febrero Día de San Marón\n" +
"9 de marzo día de los docentes\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Día de la Madre\n" +
"El horario de verano de 24-Mar comienza\n" +
"25 de marzo Fiesta de la Anunciación\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"1 de mayo Día del Trabajador\n" +
"6 de mayo Día del Mártir\n" +
"10 de mayo Día de la Ascensión\n" +
"25 de mayo día de la liberación y la resistencia\n" +
"21 de junio Solsticio de junio\n" +
"15-Ago Fiesta de la Asunción\n" +
"22-ago Eid al-Adha\n" +
"8 de septiembre Natividad de María\n" +
"12-Sep Muharram\n" +
"20-Sep Primer día de Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"27-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"21-Nov El cumpleaños del Profeta\n" +
"22 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Macau":
                        case "macau":
                            return("MACAU\n" +
"1 de enero día de año nuevo\n" +
"16 de febrero Año Nuevo Lunar (primer día)\n" +
"17 de febrero Año Nuevo Lunar (segundo día)\n" +
"18 de febrero Año Nuevo Lunar (tercer día)\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"5-Apr Cheng Ming Festival\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"22 de mayo Cumpleaños de Buda\n" +
"18 de junio Festival del Bote del Dragón\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día 25-Sep después del Festival del Medio Otoño\n" +
"1-Oct Día Nacional de la República Popular de China\n" +
"21-Oct Chong Yeung Festival (Festival de Ancestros)\n" +
"2-Nov Todo el día del alma\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"20 de diciembre Macau S.A.R. Día del establecimiento\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Malasia":
                        case "malasia":
                            return("MALASIA\n" +
"1 de enero día de año nuevo\n" +
"14 de enero Cumpleaños de Yang di-Pertuan Besar\n" +
"15 de enero: cumpleaños de Yang di-Pertuan Besar observado\n" +
"31 de enero Thaipusam\n" +
"1-Feb Día del Territorio Federal\n" +
"14 de febrero Maha Shivaratri\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero, día del Año Nuevo Lunar chino\n" +
"17-Feb Segundo día del Año Nuevo Lunar chino\n" +
"18 de febrero vacaciones de sustitución del año nuevo lunar chino\n" +
"2-Mar Holi\n" +
"4-Mar Aniversario de la coronación del Sultán de Terengganu\n" +
"20 de marzo, equinoccio\n" +
"23-Mar Cumpleaños del Sultán de Johor\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"14-Apr Isra y Mi'raj\n" +
"15 de abril Declaración de Malacca como ciudad histórica\n" +
"Declaración de 16 de abril de Malaca como ciudad histórica observada\n" +
"26-abril Cumpleaños del Sultán de Terengganu\n" +
"1 de mayo del Día del Trabajo\n" +
"7 de mayo Día de fiesta de Pahang\n" +
"Elecciones generales del 9 de mayo\n" +
"10 de mayo Elecciones generales de vacaciones\n" +
"11 de mayo Elecciones generales de vacaciones\n" +
"13 de mayo Elecciones generales de vacaciones\n" +
"16 de mayo comienza el Ramadán\n" +
"17 de mayo Cumpleaños del rajá de Perlis\n" +
"17 de mayo Elecciones generales de vacaciones\n" +
"18 de mayo Elecciones generales de vacaciones\n" +
"29 de mayo Día de Wesak\n" +
"30 de mayo Festival de la Cosecha\n" +
"31 de mayo Día de la cosecha 2\n" +
"1 de junio Gawai Dayak\n" +
"2 de junio Nuzul Al-Quran\n" +
"2 de junio Gawai Dayak Holiday\n" +
"3 de junio Nuzul Al-Quran Holiday\n" +
"15 de junio Hari Raya Puasa\n" +
"16 de junio Hari Raya Puasa Día 2\n" +
"17 de junio Hari Raya Puasa\n" +
"21 de junio Solsticio de junio\n" +
"7-Jul George Town Día de la Ciudad del Patrimonio Mundial\n" +
"14 de julio, cumpleaños del gobernador de Penang\n" +
"17-Jul Cumpleaños del rajá de Perlis\n" +
"22 de julio Día de la Independencia de Sarawak\n" +
"23 de julio Día de la Independencia de Sarawak observado\n" +
"22-ago Hari Raya Haji\n" +
"23-ago Hari Raya Haji (día 2)\n" +
"26-ago Raksha Bandhan\n" +
"31-ago Día Nacional de Malasia\n" +
"2 de septiembre Janmashtami\n" +
"9-Sep El cumpleaños de Yang di-Pertuan Agong\n" +
"10-Sep El cumpleaños de Yang di-Pertuan Agong\n" +
"11-Sep Muharram / Año Nuevo\n" +
"13-Sep Ganesh Chaturthi\n" +
"16 de septiembre, día de Malasia\n" +
"17 de septiembre, día de Malasia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"6-Oct Cumpleaños del Gobernador de Sabah\n" +
"10-Oct Navaratri\n" +
"12-Oct Cumpleaños del Gobernador de Malacca\n" +
"13-Oct Cumpleaños del Gobernador de Sarawak\n" +
"15-oct Almarhum Sultan Iskandar Hol Day\n" +
"19-Oct Dussehra\n" +
"24-Oct Cumpleaños del Sultán de Pahang\n" +
"2-Nov Cumpleaños del Sultán de Perak\n" +
"6-Nov Diwali / Deepavali\n" +
"11-Nov Cumpleaños del Sultán de Kelantan\n" +
"12-Nov Cumpleaños del Sultán de Kelantan (Día 2)\n" +
"20-Nov El cumpleaños del Profeta Muhammad\n" +
"11-Dec Cumpleaños del Sultán de Selangor\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Mongolia":
                        case "mongolia":
                            return("MONGOLIA \n" +
"1 de enero de año nuevo\n" +
"13 de enero Día de la Constitución\n" +
"14 de febrero Día de San Valentín\n" +
"1 de marzo Día de los patriotas\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"18 de marzo Día de los Soldados\n" +
"20 de marzo, equinoccio\n" +
"7-Apr Health Day\n" +
"26 de abril día de la propiedad intelectual\n" +
"15 de mayo Día de la familia\n" +
"21 de junio Solsticio de junio\n" +
"Día de la bandera política del 10 de julio\n" +
"11-Jul Naadam Holiday (Día Nacional)\n" +
"12-Jul Naadam Holiday (Día Nacional)\n" +
"13-Jul Naadam Holiday (Día Nacional)\n" +
"14-Jul Naadam Holiday (Día Nacional)\n" +
"15-Jul Naadam Holiday (Día Nacional)\n" +
"25 de agosto Día de la Juventud\n" +
"10-Sep Día de la Represión de las Víctimas\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Elders 'Day\n" +
"29-Oct Día de la Ciudad Capital\n" +
"26-Nov día de la República\n" +
"10 de diciembre Día de los Derechos Humanos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"29 de diciembre Día de la Independencia");
                            
                        case "Myanmar":
                        case "myanmar":
                            return("MYANMAR\n" +
"4 de enero Día de la Independencia\n" +
"12 de febrero Día de la Unión\n" +
"14 de febrero Maha Shivaratri\n" +
"1-Mar Full Moon Day of Tabaung\n" +
"2-Mar Holi\n" +
"Día de los campesinos del 3 de marzo\n" +
"20 de marzo, equinoccio\n" +
"27 de marzo Día de las Fuerzas Armadas\n" +
"13 de abril Maha Thingyan (Fiesta del Agua)\n" +
"14 de abril Maha Thingyan (Fiesta del Agua)\n" +
"15 de abril Maha Thingyan (Fiesta del Agua)\n" +
"16 de abril Maha Thingyan (Fiesta del Agua)\n" +
"29 de abril Día de la luna llena de Kasong\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"21 de junio Solsticio de junio\n" +
"19 de julio Día de los Mártires\n" +
"27-Jul Día de la luna llena de Waso (comienzo de la Cuaresma budista)\n" +
"26-ago Raksha Bandhan\n" +
"2 de septiembre Janmashtami\n" +
"13-Sep Ganesh Chaturthi\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Navaratri\n" +
"19-Oct Dussehra\n" +
"24-oct Día de la luna llena de Thadingyut (fin de la Cuaresma budista)\n" +
"Día Nacional 2-Dic\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Nepal":
                        case "nepal":
                            return("NEPAL\n" +
"18 de enero Sonam Losar (Tamang Año Nuevo)\n" +
"8-Mar Nari Dibas\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Ram Nawami\n" +
"14-abr Año Nuevo nepalí\n" +
"1 de mayo Divas Majdoor\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Corea del Norte":
                        case "corea del norte":
                            return("COREA DEL NORTE \n" +
"1 de enero de año nuevo\n" +
"16-Feb Fecha de nacimiento de Kim Jong Il\n" +
"20 de marzo, equinoccio\n" +
"15 de abril Fecha de nacimiento de Kim Il Sung\n" +
"25 de abril Día de la Fundación del Ejército Popular de Chosun\n" +
"1 de mayo, día de mayo\n" +
"6-Jun Día de la Fundación de la Unión de Niños Chosun\n" +
"19 de junio Gran Líder Kim Jong Il Day\n" +
"21 de junio Solsticio de junio\n" +
"27-Jul Día de la Victoria en la Guerra de Liberación de la Patria\n" +
"25-Ago Día del Songun\n" +
"Día Nacional 9-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Party Foundation Day\n" +
"10-Nov Día de la Madre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24-Dic Fecha de nacimiento de Kim Jong Suk\n" +
"27 de diciembre Día de la Constitución");
                            
                        case "Oman":
                        case "oman":
                            return("OMAN\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"13-Abr Isra y Mi'raj\n" +
"15 de junio Eid al-Fitr\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr\n" +
"17 de junio Eid al-Fitr\n" +
"18 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"23 de julio Día del Renacimiento\n" +
"21-ago Eid al-Adha\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha\n" +
"24 de agosto Eid al-Adha\n" +
"11-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"18 de noviembre, día nacional\n" +
"20-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Pakistan":
                        case "pakistan":
                            return("PAKISTAN\n" +
"1 de enero día de año nuevo\n" +
"5 de febrero Día de Cachemira\n" +
"13 de febrero Shivaratri\n" +
"14 de febrero Maha Shivaratri\n" +
"2-Mar Holi\n" +
"2-Mar Dulhandi\n" +
"20 de marzo, equinoccio\n" +
"23 de marzo Día de Pakistán\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"13 de abril Shab e-Meraj\n" +
"14 de abril Baisakhi\n" +
"21 de abril Eid e-Rizwan\n" +
"24 de abril Shab e-Barat\n" +
"29 de abril Buda Purnima\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid-ul-Fitr Día 1\n" +
"16 de junio Eid-ul-Fitr Día 2\n" +
"17 de junio Eid-ul-Fitr Día 3\n" +
"18 de junio Eid-ul-Fitr Día 4\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio, 1 día festivo\n" +
"14 de agosto día de la independencia\n" +
"22 de agosto Eid al-Adha Día 1\n" +
"22-ago Cumpleaños de Lord Zoroaster (Khordad Sal)\n" +
"23 de agosto Eid al-Adha Día 2\n" +
"24 de agosto Eid al-Adha Día 3\n" +
"25 de agosto Eid al-Adha Día 4\n" +
"26-ago Raksha Bandhan\n" +
"2 de septiembre Janmashtami\n" +
"2-Sep Janam Ashtami\n" +
"6 de septiembre día de la defensa\n" +
"13-Sep Ganesh Chaturthi\n" +
"20-Sep Primer día de Ashura\n" +
"21-Sep Segundo día de Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Navaratri\n" +
"15-Oct Durga Pooja\n" +
"19-Oct Dussehra\n" +
"19-Oct Dussehra\n" +
"24-Oct Cumpleaños de Guru Balmik Sawami Ji\n" +
"31-Oct Chelum\n" +
"7-Nov Diwali / Deepavali\n" +
"9 de noviembre Iqbal Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"25-Dic Día de Quaid-e-Azam\n" +
"26-Dec Día después de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Filipinas":
                        case "filipinas":
                            return("FILIPINAS\n" +
"1 de enero día de año nuevo\n" +
"16 de febrero, día del Año Nuevo Lunar chino\n" +
"25-Feb People Power Anniversary\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"9-abr El día del valor\n" +
"13-abr Lailatul Isra Wal Mi Raj\n" +
"1 de mayo del Día del Trabajo\n" +
"12 de junio Día de la Independencia\n" +
"15 de junio Eidul-Fitar\n" +
"21 de junio Solsticio de junio\n" +
"21-Ago Ninoy Aquino Day\n" +
"22-Ago Eid al-Adha (Fiesta del sacrificio)\n" +
"23 de agosto Eid al-Adha Día 2\n" +
"27-Ago Día Nacional de los Héroes de vacaciones\n" +
"12-Sep Amun Jadid\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"21-nov Maulid un-Nabi\n" +
"30-Nov Bonifacio Day\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"30 de diciembre Día de Rizal\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Katar":
                        case "katar":
                            return("KATAR\n" +
"1 de enero día de año nuevo\n" +
"13-Feb Día Nacional del Deporte\n" +
"4 de marzo vacaciones bancarias\n" +
"20 de marzo, equinoccio\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr Holiday\n" +
"17 de junio Eid al-Fitr Holiday\n" +
"21 de junio Solsticio de junio\n" +
"20-ago Eid al-Adha Holiday\n" +
"21-ago Eid al-Adha Holiday\n" +
"22-Ago Eid al-Adha (Fiesta del Sacrificio)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"18 de diciembre Día Nacional\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Rusia":
                        case "rusia":
                            return("RUSIA\n" +
"1 de enero día de año nuevo\n" +
"Semana de vacaciones de año nuevo 2-ene\n" +
"Semana de vacaciones de fin de año de 3 de enero\n" +
"Semana de vacaciones de fin de año de 4-ene\n" +
"Semana de vacaciones de fin de año de 5-ene\n" +
"7 de enero día ortodoxo de Navidad\n" +
"Semana de vacaciones de año nuevo 8-ene\n" +
"14-ene viejo año nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"23 de febrero Día del defensor de la patria\n" +
"27-Feb Día de las Fuerzas de Operaciones Especiales\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"9-Mar Bridge Día festivo\n" +
"20 de marzo, equinoccio\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"13-Abr Isra y Mi'raj\n" +
"28-abr Jornada de trabajo - fin de semana movido\n" +
"30 de abril vacaciones de primavera y día del trabajo\n" +
"1 de mayo, día de la primavera y el trabajo\n" +
"2 de mayo vacaciones de primavera y día del trabajo\n" +
"9 de mayo Día de la Victoria\n" +
"16 de mayo comienza Ramadán\n" +
"Día laborable 9-jun - fin de semana movido\n" +
"10 de junio Lailat al-Qadr\n" +
"11 de junio, fin de semana del día de Rusia\n" +
"12 de junio, día de Rusia\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"1-Sep Día del Conocimiento\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día de la Unidad 4-Nov\n" +
"5-Nov día de la unidad observado\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"29-Dic Jornada de trabajo - fin de semana movido\n" +
"31-Dic Vacaciones extra en lugar del 29 de diciembre");
                            
                        case "Arabia Saudita":
                        case "arabia saudita":
                            return("ARABIA SAUDITA\n" +
"20 de marzo, equinoccio\n" +
"17 de mayo comienza el Ramadán\n" +
"14 de junio Eid al-Fitr Holiday\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr Holiday\n" +
"17 de junio Eid al-Fitr Holiday\n" +
"21 de junio Solsticio de junio\n" +
"20-ago Eid al-Adha Holiday\n" +
"21-ago Eid al-Adha\n" +
"22-ago Eid al-Adha Holiday\n" +
"23-ago Eid al-Adha Holiday\n" +
"12-Sep Muharram (Año Nuevo musulmán)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23-Sep Día Nacional de Arabia\n" +
"21 de noviembre, cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Singapur":
                        case "singapur":
                            return("SINGAPUR \n" +
"1 de enero día de año nuevo\n" +
"31 de enero Thaipusam\n" +
"14 de febrero Día de San Valentín\n" +
"15 de febrero Total Defense Day\n" +
"16 de febrero, día del Año Nuevo Lunar chino\n" +
"17-Feb Segundo día del Año Nuevo Lunar chino\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado de Pascua\n" +
"1 de abril Domingo de Pascua\n" +
"1 de abril día de los inocentes\n" +
"1 de mayo del Día del Trabajo\n" +
"13 de mayo Día de la Madre\n" +
"18 de mayo Día Internacional de los Museos\n" +
"29 de mayo Día de Vesak\n" +
"15 de junio Hari Raya Puasa\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul Día de las Fuerzas Armadas de Singapur\n" +
"21-Jul Día de la Armonía Racial\n" +
"Día Nacional 9-Ago\n" +
"22-ago Hari Raya Haji\n" +
"23 de septiembre de septiembre equinoccio\n" +
"4-Oct Día del niño\n" +
"6-Nov Diwali / Deepavali\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Corea del Sur":
                        case "corea del sur":
                            return("COREA DEL SUR \n" +
" de enero día de año nuevo\n" +
"9 de febrero de 2018 Comienzan los Juegos Olímpicos de Invierno\n" +
"14 de febrero Día de San Valentín\n" +
"15-feb Seollal vacaciones\n" +
"16 de febrero Seollal\n" +
"17-feb Seollal vacaciones\n" +
"25 de febrero de 2018 Olimpiadas de invierno finalizan\n" +
"1-Mar Día del Movimiento de la Independencia\n" +
"9-Mar 2018 Comienzo de Juegos Paraolímpicos de Invierno\n" +
"18-Mar 2018 Final de Juegos Paralímpicos de Invierno\n" +
"20 de marzo, equinoccio\n" +
"5 de abril día del árbol\n" +
"1 de mayo del Día del Trabajo\n" +
"5 de mayo Día del niño\n" +
"7 de mayo Día del Niño observado\n" +
"8 de mayo Día de los Padres\n" +
"15 de mayo Día del Maestro\n" +
"22 de mayo Cumpleaños de Buda\n" +
"6 de junio Memorial Day\n" +
"13 de junio Día local de elecciones\n" +
"21 de junio Solsticio de junio\n" +
"17 de julio Día de la Constitución\n" +
"15 de agosto Día de la Liberación\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23 de septiembre Chuseok Holiday\n" +
"24 de septiembre Chuseok\n" +
"25 de septiembre Chuseok Holiday\n" +
"26 de septiembre Chuseok Holiday\n" +
"1-Oct Día de las Fuerzas Armadas\n" +
"Día de la Fundación Nacional 3-Oct\n" +
"Día de la Proclamación del Hangeul del 9 de octubre\n" +
"31 de octubre de Halloween\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Sri Lanka":
                        case "sri lanka":
                            return("SRI LANKA\n" +
"Día de la luna llena de 1-Jan Duruthu Poya\n" +
"14 de enero Tamil Thai Pongal Day\n" +
"15-Jan Tamil Thai Pongal Día observado\n" +
"31 de enero Navam Full Moon Poya Day\n" +
"4-feb día nacional\n" +
"5-Feb Día nacional observado\n" +
"13 de febrero Mahasivarathri Day\n" +
"14 de febrero Día de San Valentín\n" +
"1 de marzo Madin Luna llena Día de Poya\n" +
"2-Mar Holi\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Bak Full Moon Poya Day\n" +
"1 de abril Domingo de Pascua\n" +
"13-abr Sinhala y Tamil víspera de Año Nuevo\n" +
"14-Abr Cingalés y Tamil Año Nuevo\n" +
"20 de abril Sinhala y Tamil Año Nuevo Banco de vacaciones (tarde)\n" +
"29-Apr Vesak Full Moon Poya Day\n" +
"Día 30 de abril después del día de Vesak Full Moon Poya\n" +
"1 de mayo del Día del Trabajo\n" +
"13 de mayo Día de la Madre\n" +
"29 de mayo Adhi Poson Luna llena Día de Poya\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"27 de junio Poson Luna llena Día de Poya\n" +
"27-Jul Esala Full Moon Poya Day\n" +
"22-ago Eid al-Adha\n" +
"25 de agosto Nikini Luna llena Día de Poya\n" +
"26-ago Raksha Bandhan\n" +
"2 de septiembre Janmashtami\n" +
"13-Sep Ganesh Chaturthi\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Binara, luna llena, día de Poya\n" +
"10-Oct Navaratri\n" +
"19-Oct Dussehra\n" +
"24-oct Vap luna llena Día de Poya\n" +
"6-Nov Deepavali\n" +
"20-Nov Milad-Un-Nabi (Cumpleaños del Santo Profeta)\n" +
"22-Nov Il Full Moon Poya Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"22 de diciembre Unduvap Luna llena Día de Poya\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad");
                            
                        case "Siria":
                        case "siria":
                            return("SIRIA\n" +
"1 de enero de año nuevo\n" +
"Día de la revolución del 8 de marzo\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Día de la Madre\n" +
"29-Mar comienza el horario de verano\n" +
"1 de abril, día de Pascua\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"17 de abril Día de la Independencia\n" +
"1 de mayo, día de mayo\n" +
"6 de mayo Día de los Mártires\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"6 de octubre, día de la liberación de octubre\n" +
"25-Oct Hora de ahorro de luz diurna termina\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                            
                        case "Taiwan":
                        case "taiwan":
                            return("TAIWAN\n" +
"1-Jan Republic Day / New Year's Day\n" +
"4 de febrero día del agricultor\n" +
"15 de febrero, víspera de año nuevo chino\n" +
"16 de febrero, día de año nuevo chino\n" +
"17 de febrero vacaciones de año nuevo chino 1\n" +
"18 de febrero Fiesta de año nuevo chino 2\n" +
"19 de febrero Fiesta de año nuevo chino 3\n" +
"20 de febrero Fiesta del Año Nuevo Chino 4\n" +
"28-feb 228 Memorial Day\n" +
"2-Mar Lantern Festival\n" +
"Día del Turismo 2-Mar\n" +
"8 de marzo Día de la mujer\n" +
"12 de marzo del día del árbol\n" +
"18-Mar Cumpleaños de Dios de la Tierra\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Día de la Juventud\n" +
"1 de abril Domingo de Pascua\n" +
"4 de abril Día del niño\n" +
"4 de abril, cumpleaños de Kuan Yin\n" +
"5-Abr Tomb Sweeping Day\n" +
"30 de abril Cumpleaños de Dios de la Medicina\n" +
"1 de mayo del Día del Trabajo\n" +
"4 de mayo Día de la Literatura\n" +
"8 de mayo Cumpleaños de Matsu\n" +
"13 de mayo Día de la Madre\n" +
"22 de mayo Cumpleaños de Buda\n" +
"Día del Movimiento de Supresión del Opio 3 de Junio\n" +
"18 de junio Festival del Bote del Dragón\n" +
"21 de junio Solsticio de junio\n" +
"26 de junio, cumpleaños de Kuan Kung\n" +
"26 de junio, cumpleaños de Chen Huang\n" +
"8 de agosto Día del padre\n" +
"17 de agosto Día de San Valentín\n" +
"Festival fantasma del 25 de agosto\n" +
"Día de las Fuerzas Armadas 3-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Festival del medio otoño\n" +
"28 de septiembre día de los docentes\n" +
"10-oct día nacional / doble décimo día\n" +
"17-oct doble noveno día\n" +
"21-Oct día de ultramar chino\n" +
"25-Oct Día de la Retrocesión de Taiwán\n" +
"31 de octubre de Halloween\n" +
"12-Nov. Cumpleaños de Sun Yat-sen\n" +
"22-Nov Festival de Saisiat\n" +
"21 de diciembre Solsticio de diciembre\n" +
"21-Dic Festival Dōngzhì\n" +
"25 de diciembre Día de la Constitución\n" +
"25 de diciembre día de Navidad");
                            
                        case "Tayikistan":
                        case "tayikistan":
                            return("TAYIKISTAN\n" +
"1 de enero día de año nuevo\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"9 de mayo Día de la Victoria\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"27-Jun Día de la Unidad Nacional\n" +
"22-ago Eid ul Adha\n" +
"9 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"6 de noviembre Día de la Constitución\n" +
"21 de diciembre Solsticio de diciembr");
                            
                        case "Tailandia":
                        case "tailandia":
                            return("TAILANDIA\n" +
"1 de enero día de año nuevo\n" +
"2-Jan Bridge Festividades\n" +
"13 de enero Día Nacional del Niño\n" +
"16 de enero Día de los docentes\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero, día del Año Nuevo Lunar chino\n" +
"17-Feb Segundo día del Año Nuevo Lunar chino\n" +
"18 de febrero Tercer día del año nuevo lunar chino\n" +
"1-Mar Makha Bucha\n" +
"20 de marzo, equinoccio\n" +
"6 de abril, día de Chakri\n" +
"12 de abril Songkran observó\n" +
"13 de abril Songkran\n" +
"14 de abril Songkran\n" +
"15 de abril Songkran\n" +
"16 de abril Songkran observó\n" +
"1 de mayo del Día del Trabajo\n" +
"Día de la Ceremonia Real de Arado 14 de mayo\n" +
"29 de mayo Visakha Bucha\n" +
"21 de junio Solsticio de junio\n" +
"27 de julio Asalha Bucha\n" +
"28 de julio, cumpleaños del rey Vajiralongkorn\n" +
"28 de julio día de la Cuaresma budista\n" +
"30 de julio fiesta del cumpleaños del rey\n" +
"12-ago El cumpleaños de la reina\n" +
"12 de agosto Día de la Madre\n" +
"13-ago El cumpleaños de la reina observado\n" +
"13-Ago Día de la Madre observado\n" +
"23 de septiembre de septiembre equinoccio\n" +
"13-oct aniversario de la muerte del rey Bhumibol\n" +
"15-oct aniversario de la muerte del rey Bhumibol observado\n" +
"23 de octubre Día de Chulalongkorn\n" +
"31 de octubre de Halloween\n" +
"22 de noviembre Loy Krathong\n" +
"5 de diciembre Día del padre\n" +
"10 de diciembre Día de la Constitución\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Turquia":
                        case "turquia":
                            return("TURQUIA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"23-abr Soberanía Nacional y Día del Niño\n" +
"1 de mayo Día del Trabajo y Solidaridad\n" +
"19 de mayo Conmemoración del Día de Atatürk, Juventud y Deportes\n" +
"14 de junio, fiesta del Ramadán\n" +
"15 de junio, fiesta del Ramadán\n" +
"16 de junio Fiesta de Ramadán Día 2\n" +
"17 de junio Fiesta de Ramadán Día 3\n" +
"21 de junio Solsticio de junio\n" +
"15 de julio Día de la Democracia y la Unidad Nacional\n" +
"20-Ago Sacrificio Fiesta Eva\n" +
"21-Ago Sacrificio Fiesta\n" +
"22-Ago Sacrificio Fiesta Día 2\n" +
"23 de agosto Fiesta del Sacrificio 3\n" +
"24-Ago Sacrificio Fiesta Día 4\n" +
"30 de agosto día de la victoria\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct República víspera del día\n" +
"29-oct Día de la República\n" +
"10-Nov Ataturk Memorial Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Turkmenistan":
                        case "turkmenistan":
                            return("TURKMENISTAN\n" +
"1 de enero día de año nuevo\n" +
"12 de enero Geok Tepe Memorial Day\n" +
"19-Feb Bandera estatal del día de Turkmenistán\n" +
"8 de marzo Turkmen día de la mujer\n" +
"20 de marzo, equinoccio\n" +
"20-Mar Nowruz Bayram (Festival de primavera)\n" +
"1-Abr Una gota de agua - Un grano de oro\n" +
"22-Apr Festival de Caballos de Carreras de Turkmenistán\n" +
"Conmemoración del 8 de mayo de los Héroes Nacionales de la Segunda Guerra Mundial\n" +
"9 de mayo Día de la Victoria\n" +
"18 de mayo Día de reavivamiento, unidad y la poesía de Magtymguly\n" +
"27 de mayo Día de la alfombra\n" +
"15 de junio Eid ul Fitr\n" +
"17 de junio Galla Bayramy (Festival de la Cosecha de Trigo)\n" +
"21 de junio Solsticio de junio\n" +
"27-jun Día de los trabajadores turcos de la cultura y el arte\n" +
"Día de melón turcomano del 12 de agosto\n" +
"22-ago Eid ul Adha\n" +
"Día 9 de septiembre de los trabajadores en el sector de la energía\n" +
"Día 9-Sep Turkmen Bakhshi\n" +
"23 de septiembre de septiembre equinoccio\n" +
"6-Oct Día de Conmemoración y Luto Nacional\n" +
"27-Oct Día de la Independencia\n" +
"3-Nov día de la salud\n" +
"25-Nov Harvest Festival\n" +
"2-Dec Día de buena vecindad\n" +
"12 de diciembre día de la neutralidad\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Emiratos Arabes Unidos":
                        case "emiratos arabes unidos":
                            return("EMIRATOS ARABES UNIDOS\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"13 de abril Leilat al-Meiraj (La ascensión del Profeta)\n" +
"16 de mayo Inicio de Ramadán\n" +
"14 de junio Eid al-Fitr\n" +
"15 de junio Eid al-Fitr Holiday 1\n" +
"16 de junio Eid al-Fitr Holiday 2\n" +
"21 de junio Solsticio de junio\n" +
"Comienza la temporada del Hajj del 12 de agosto\n" +
"20 de agosto Día de Arafat (Hajj)\n" +
"21-Ago Eid al-Adha (Fiesta del Sacrificio)\n" +
"22 de agosto Eid al-Adha Holiday 1\n" +
"23 de agosto Eid al-Adha Holiday 2\n" +
"11-Sep Al-Hijra (Año Nuevo islámico)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"19 de noviembre Mouloud (El cumpleaños del Profeta)\n" +
"30 de noviembre Día de la Conmemoración\n" +
"Día Nacional 2-Dic\n" +
"3-Dic Día Nacional de vacaciones\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Uzbekistan":
                        case "uzbekistan":
                            return("UZBEKISTAN\n" +
"1 de enero de año nuevo\n" +
"14 de enero Día de los Defensores de la Patria\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Nowruz\n" +
"9 de mayo día de la conmemoración\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"1 de septiembre Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct. Día de los docentes\n" +
"8 de diciembre Día de la Constitución\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        case "Vietnam":
                        case "vietnam":
                            return("VIETNAM\n" +
"1 de enero Año Internacional de Año Nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"15 de febrero vietnamita víspera de Año Nuevo\n" +
"16 de febrero Año Nuevo vietnamita\n" +
"17 de febrero Tet vacaciones\n" +
"18 de febrero Tet vacaciones\n" +
"19 de febrero Tet vacaciones\n" +
"20-feb Tet vacaciones\n" +
"20 de marzo, equinoccio\n" +
"25 de abril día de la conmemoración de los reyes vietnamitas\n" +
"30 de abril Día de la Liberación / Día de la Reunificación\n" +
"1 de mayo Día Internacional del Trabajo\n" +
"21 de junio Solsticio de junio\n" +
"28 de junio día de la familia vietnamita\n" +
"Día de la Independencia de 2 sept.\n" +
"3-Sep Día de la Independencia observado\n" +
"23 de septiembre de septiembre equinoccio\n" +
"20-oct Día de la mujer vietnamita\n" +
"31 de octubre de Halloween\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31-Dic Nochevieja Internacional");
                            
                        case "Yemen":
                        case "yemen":
                            return("YEMEN\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo, día de mayo\n" +
"22 de mayo Día de la Unidad\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr\n" +
"17 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"22-ago Eid al-Adha\n" +
"22-ago Eid al-Adha\n" +
"22-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"26 de septiembre Día de la Revolución del Yemen del Norte\n" +
"14-Oct día de la revolución\n" +
"21-Nov El cumpleaños del Profeta\n" +
"30 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre");
                            
                        //Europe
                        case "Albania":
                        case "albania":
                            return("ALBANIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero día de año nuevo (día 2)\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo, día de la madre\n" +
"14 de marzo Día de verano\n" +
"20 de marzo, equinoccio\n" +
"22-Mar Nevruz Day\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"6-abr Viernes Santo (ortodoxo)\n" +
"7 de abril Sábado de Pascua (ortodoxo)\n" +
"8 de abril Domingo de Pascua (ortodoxo)\n" +
"9 de abril lunes de Pascua (ortodoxo)\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"22-Ago. Fiesta del Sacrificio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"19-Oct Día de la Beatificación de la Madre Teresa\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"28 de noviembre Día de la Independencia\n" +
"29 de noviembre Día de la Liberación\n" +
"8 de diciembre Día Nacional de la Juventud\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Andorra":
                        case "andorra":
                            return("ANDORRA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"12 de febrero Carnaval\n" +
"Día de la Constitución del 14 de marzo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"24 de junio Día de San Juan\n" +
"15-ago Asunción de María\n" +
"Día Nacional 8-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"4-Nov Día de San Carlos Borromeu\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31-Dic Nochevieja (feriado bancario)");
                            
                        case "Austria":
                        case "austria":
                            return("AUSTRIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23 de septiembre Jornadas Europeas del Patrimonio\n" +
"Día Nacional 26-Oct\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"2-Dec Primer domingo de Adviento\n" +
"8-Dic Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Belarus":
                        case "belarus":
                            return("BELARUS\n" +
"1 de enero día de año nuevo\n" +
"7 de enero día ortodoxo de Navidad\n" +
"14 de febrero Día de San Valentín\n" +
"23 de febrero Día del defensor de la patria\n" +
"8 de marzo Día de la mujer\n" +
"Día de la Constitución del 15 de marzo\n" +
"20 de marzo, equinoccio\n" +
"1-abr Domingo de Pascua Católico\n" +
"2-Abr Día de la Unión de Bielorrusia y Rusia\n" +
"8 de abril Domingo de Pascua ortodoxo\n" +
"17 de abril Radonitsa\n" +
"26 de abril Día de conmemoración de la tragedia de Chernobyl\n" +
"1 de mayo del Día del Trabajo\n" +
"9 de mayo Día de la Victoria\n" +
"13 de mayo Día del emblema nacional y la bandera de Bielorrusia\n" +
"21 de junio Solsticio de junio\n" +
"22 de junio Día de la Recordación de las Víctimas de la Gran Guerra Patriótica\n" +
"3 de julio Día de la Independencia de la República de Belarús\n" +
"6-Jul Kupalle (Día 1)\n" +
"7 de julio Kupalle (día 2)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"2-Nov día de la conmemoración\n" +
"7 de noviembre, día de la revolución de octubre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre Día de Navidad católico\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Belgica":
                        case "belgica":
                            return("BELGICA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"21-Jul Día Nacional Belga\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Bosnia y Herzegovina":
                        case "bosnia y herzegovina":
                            return("BOSNIA Y HERZEGOVINA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero de año nuevo (día 2)\n" +
"6 de enero la víspera de Navidad ortodoxa\n" +
"7 de enero día ortodoxo de Navidad\n" +
"9 de enero Día de la República Srpska\n" +
"14 de febrero Día de San Valentín\n" +
"Día de la Independencia de 1 de marzo\n" +
"8 de marzo, día de la madre\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Domingo de Pascua ortodoxo\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"2 de mayo, día del trabajo (día 2)\n" +
"9 de mayo Día de la Victoria\n" +
"15-jun Fin del Ramadán\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"22-Ago. Fiesta del Sacrificio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"21-Nov Día del Acuerdo de Paz de Dayton\n" +
"25-Nov Día de la Estadidad\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Bulgaria":
                        case "bulgaria":
                            return("BULGARIA\n" +
"1 de enero día de año nuevo\n" +
"1-Feb Día de la Conmemoración y Respeto a las Víctimas del Régimen Comunista\n" +
"1-Mar Baba Marta\n" +
"Día de la Liberación del 3 de marzo\n" +
"5-Mar Día de la Liberación observado\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"6-abr Viernes Santo\n" +
"7-abr Sábado Santo\n" +
"8 de abril Domingo de Pascua\n" +
"9 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"6 de mayo Día de San Jorge\n" +
"7 de mayo Día de San Jorge observado\n" +
"24 de mayo Día de la cultura y la alfabetización\n" +
"21 de junio Solsticio de junio\n" +
"6 de septiembre Día de la Unificación\n" +
"22 de septiembre día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Día de la Independencia observado\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Revival Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad");
                            
                        case "Croacia":
                        case "croacia":
                            return("CROACIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"20 de marzo, equinoccio\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"22-jun Día de la lucha antifascista\n" +
"Día de la Estadidad de 25 de junio\n" +
"5 de agosto Día de Acción de Gracias de la patria\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8 de octubre día de la independencia\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día de San Esteban");
                            
                      //  case "Chipre":
                       // case "chipre":
                        //    return("venezuela");
                        case "Republica Checa":
                        case "repbulcia checa":
                            return("REPUBLICA CHECA \n" +
"1 de enero día de año nuevo\n" +
"1 de enero Restauración del día de la independencia checa\n" +
"14 de febrero Carnaval / Miércoles de ceniza\n" +
"14 de febrero San Valentín\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"8 de mayo Día de la victoria en Europa\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"21 de mayo, lunes de Pentecostés\n" +
"27 de mayo Trinidad\n" +
"1 de junio Día del niño\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"5-Jul Santos Cirilo y Metodio\n" +
"6 de julio Jan Hus Day\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28 de septiembre Día de San Wenceslao\n" +
"28-Oct Día del Estado Checoslovaco Independiente\n" +
"17-nov lucha por la libertad y el día de la democracia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de San Esteban");
                            
                        case "Dinamarca":
                        case "dinamarca":
                            return("DINAMARCA \n" +
"1 de enero día de año nuevo\n" +
"Carnaval de 11 de febrero\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril Gran día de oración\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"Día de la Constitución del 5 de junio\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-dic 2º día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Estonia":
                        case "estonia":
                            return("ESTONIA \n" +
"1 de enero día de año nuevo\n" +
"24 de febrero día de la independencia\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"20 de mayo Whitsunday\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio día de la victoria\n" +
"24 de junio Día de San Juan\n" +
"20 de agosto Día de la Restauración de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Islas Faroe":
                        case "islas faroe":
                            return("ISLAS FAROE \n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"25 de abril día de la bandera nacional\n" +
"27 de abril día de oración\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"Día de la Constitución del 5 de junio\n" +
"21 de junio Solsticio de junio\n" +
"28 de julio La víspera de San Olav\n" +
"29 de julio Día de San Olav (día nacional)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Finlandia":
                        case "finlandia":
                            return("FINLANDIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"22 de junio Víspera de San Juan\n" +
"23 de junio a mediados de verano\n" +
"23 de septiembre de septiembre equinoccio\n" +
"3-Nov Todos los Santos\n" +
"11-Nov. Día del padre\n" +
"6 de diciembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de San Esteban");
                            
                        case "Francia":
                        case "francia":
                            return("FRANCIA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"8 de mayo de la Segunda Guerra Mundial Victory Day\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"27 de mayo Día de la Madre\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"14 de julio, día de la Bastilla\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Alemania":
                        case "alemania":
                            return("ALEMANIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"22 de enero día franco-alemán\n" +
"27-ene Día de conmemoración de las víctimas del nacionalsocialismo\n" +
"28 de enero Día de la Privacidad Europea\n" +
"12 de febrero, lunes de carnaval\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Carnaval / Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"23 de abril Día de la cerveza alemana\n" +
"26-Apr Girls 'Day - Día de información profesional\n" +
"30 de abril noche de Walpurgis\n" +
"1 de mayo, día de mayo\n" +
"5 de mayo, día de Europa\n" +
"10 de mayo Día del padre\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo domingo de Pentecostés\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"23 de mayo Día de la Constitución\n" +
"31 de mayo Corpus Christi\n" +
"31 de mayo Corpus Christi\n" +
"1 de junio Día Internacional de los Niños\n" +
"Día europeo de la bicicleta 3-jun\n" +
"Día de la gente con discapacidad visual de 6 de junio\n" +
"16 de junio Día de la Música\n" +
"17 de junio, día sin automóviles\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio Día de la Arquitectura\n" +
"8-Aug Festival de la Paz en Augsburgo\n" +
"15-ago Asunción de María\n" +
"1-Sep Día Mundial de la Paz\n" +
"8 de septiembre Día de la Lengua Alemana\n" +
"9-Sep Días del Patrimonio Europeo (Día del Open Monument)\n" +
"9 de septiembre Día de la Patria\n" +
"20-Sep German World Childrens 'Day\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28 de septiembre, día del emparedado alemán\n" +
"29-Sep Día del Banco de Alimentos Alemán\n" +
"3-oct día de la unidad alemana\n" +
"7-Oct Día de Exploración Espacial\n" +
"7-Oct Harvest Festival\n" +
"24-Oct Día de las Bibliotecas\n" +
"28-Oct El horario de verano termina\n" +
"30 de octubre Día Mundial de la Juventud\n" +
"31-Oct. Día de la Reforma\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"9-Nov Noche del Día del Recuerdo del Vidrio Roto\n" +
"9-Nov Caída del Muro de Berlín\n" +
"11 de noviembre, día de San Martín\n" +
"18-Nov Día Nacional de Luto\n" +
"21-Nov día de arrepentimiento\n" +
"25-Nov Domingo de los Muertos\n" +
"2-Dec Primer domingo de Adviento\n" +
"6 de diciembre Día de San Nicolás\n" +
"9 de diciembre Segundo Domingo de Adviento\n" +
"16 de diciembre Tercer domingo de Adviento\n" +
"Día conmemorativo del 19 de diciembre para romaníes y sinti asesinados por genocidio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"23-Dec Cuarto domingo de Adviento\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Gibraltar":
                        case "gibraltar":
                            return("GIBRALTAR\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"11 de marzo, día de la madre\n" +
"12 de marzo, día de la Commonwealth\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"30 de abril Día de los Trabajadores Memorial\n" +
"1 de mayo, día de mayo\n" +
"28 de mayo de vacaciones en el banco de primavera\n" +
"11-Jun cumpleaños de la reina\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"27-ago Finales de verano Banco de vacaciones\n" +
"10-Sep Día de Gibraltar\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Grecia":
                        case "grecia":
                            return("GRECIA \n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"30 de enero Los tres Santos Jerarcas\n" +
"19 de febrero: lunes limpio\n" +
"20 de marzo, equinoccio\n" +
"25-mar 25 de marzo (fiesta nacional)\n" +
"25-Mar Anunciación del Señor\n" +
"6-abr Viernes Santo\n" +
"8 de abril Domingo de Pascua\n" +
"9 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"28 de mayo Espíritu Santo lunes\n" +
"21 de junio Solsticio de junio\n" +
"24-Jul La restauración de la democracia\n" +
"15 de agosto Dormición de la Santísima Virgen\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-oct El día de Ochi\n" +
"17-Nov Polytechneio\n" +
"21-Nov Día de las Fuerzas Armadas\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Synaxis de la Madre de Dios");
                            
                        case "Guernsey":
                        case "guernsey":
                            return("GUERNSEY\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"9 de mayo Día de la Liberación (excepto Alderney y Sark)\n" +
"10 de mayo Día de la Liberación (solo Sark)\n" +
"28 de mayo de vacaciones en el banco de primavera\n" +
"21 de junio Solsticio de junio\n" +
"6-ago Summer Bank Holiday (solo Alderney)\n" +
"27-ago Summer Bank Holiday (excepto Alderney)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"15-Dec Homecoming Day (solo Alderney)\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Santa Sede":
                        case "santa sede":
                        case "Ciudad del Vaticano":
                        case "vaticano":
                            return("VATICANO/SANTA SEDE\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"11-Feb Aniversario de la fundación de la Ciudad del Vaticano\n" +
"13-Mar Aniversario de la elección del Papa Francisco\n" +
"19 de marzo, día de San José\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"23 de abril Fiesta de San Jorge\n" +
"1 de mayo Fiesta de San José Obrero\n" +
"21 de junio Solsticio de junio\n" +
"29-jun Las fiestas de los santos Pedro y Pablo\n" +
"14 de agosto Vigilia de la Asunción Día\n" +
"15-agosto Día de la Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Hungria":
                        case "hungria":
                            return("HUNGRIA\n" +
"1 de enero día de año nuevo\n" +
"10 de marzo día de trabajo extra para el 16 de marzo\n" +
"15 de marzo de 1848 Revolución Memorial Day\n" +
"16 de marzo de 1848 Revolución Memorial Day (vacaciones extra)\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"21 de abril, día extra de trabajo para el 30 de abril\n" +
"30 de abril del Día del Trabajo (vacaciones extra)\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"20 de agosto, día nacional de Hungría\n" +
"23 de septiembre de septiembre equinoccio\n" +
"13-Oct Día Extra de Trabajo para el 22 de octubre\n" +
"22-oct. 1956 Revolución Memorial Day (vacaciones extra)\n" +
"23-oct. 1956 Revolución Memorial Day\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Todos los Santos (vacaciones extra)\n" +
"Día de trabajo extra de 10 nov para el 2 de noviembre\n" +
"1-Dic Día extra de trabajo para el 24 de diciembre\n" +
"6 de diciembre Día de San Nicolás\n" +
"15 de diciembre Día de trabajo extra para el 31 de diciembre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24-Dic Nochebuena (vacaciones extra)\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31-Dic Nochevieja (vacaciones extra)");
                            
                        case "Islandia":
                        case "islandia":
                            return("ISLANDIA\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"19 de abril Primer día de verano\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"17-jun Día de la República de Islandia\n" +
"21 de junio Solsticio de junio\n" +
"6-ago Bank Holiday\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"11 de noviembre, día de los padres\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad (desde el mediodía)\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad\n" +
"31-Dic Nochevieja (desde el mediodía)");
                            
                        case "Irlanda":
                        case "irlanda":
                            return("IRLANDA\n" +
"1 de enero día de año nuevo\n" +
"17 de marzo Día de San Patricio\n" +
"19 de marzo Día de San Patricio observado\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"7 de mayo, día de mayo\n" +
"4 de junio junio festivo\n" +
"21 de junio Solsticio de junio\n" +
"6 de agosto agosto festivo\n" +
"23 de septiembre de septiembre equinoccio\n" +
"29 de octubre, octubre festivo\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Isla del Hombre":
                        case "isla del hombre":
                            return("ISLA DEL HOMBRE\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"7 de mayo a principios de mayo festivo\n" +
"28 de mayo, fin de mayo festivo\n" +
"8-Jun T. T. Bank Holiday\n" +
"21 de junio Solsticio de junio\n" +
"5 de julio Día de Tynwald\n" +
"27-ago Summer Bank Holiday\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Italia":
                        case "italia":
                            return("ITALIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"25 de abril día de la liberación\n" +
"25 de abril La fiesta de San Marcos\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"2 de junio Día de la República\n" +
"21 de junio Solsticio de junio\n" +
"24-Jun La fiesta de San Juan (Florencia, Génova, Turín)\n" +
"29-jun La fiesta de San Pedro y San Pablo (Roma)\n" +
"15-Aug Asunción de María / Ferragosto\n" +
"19-Sep La fiesta de San Jenaro (Nápoles)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"7-Dec La fiesta de San Ambrosio (Milán)\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Jersey":
                        case "jersey":
                            return("JERSEY\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"9 de mayo Día de la Liberación\n" +
"28 de mayo de vacaciones en el banco de primavera\n" +
"21 de junio Solsticio de junio\n" +
"27-ago Summer Bank Holiday\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                            
                        case "Kosovo":
                        case "kosovo":
                            return("KOSOVO\n" +
"1 de enero día de año nuevo\n" +
"2 de enero Segundo día de año nuevo\n" +
"7 de enero el día de Navidad\n" +
"8 de enero, día de Navidad observado\n" +
"15-Feb Día de Ashakalia\n" +
"17-Feb Día de la Independencia de la República de Kosovo\n" +
"19-Feb. Día de la independencia de la República de Kosovo observado\n" +
"6-Mar Día del Memorial y Respeto a los Veteranos\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"1 de abril de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"8 de abril Día de Romas\n" +
"9 de abril Día de la Constitución de la República de Kosovo\n" +
"23 de abril Día de los turcos\n" +
"1 de mayo Día Internacional del Trabajo\n" +
"6 de mayo Día de Gorans\n" +
"9 de mayo Día de Europa\n" +
"12 de junio Día de la Paz\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22 de agosto Eid al Addha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28 de septiembre día de los bosnios\n" +
"28-Oct El horario de verano termina\n" +
"28-Nov Día de los albaneses\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Letonia":
                        case "letonia":
                            return("LETONIA\n" +
"1 de enero día de año nuevo\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"21-Abr día especial de trabajo\n" +
"30 de abril Día del Trabajo / Día de vacaciones de mayo\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"4 de mayo Día de la Restauración de la Independencia\n" +
"13 de mayo Día de la Madre\n" +
"20 de mayo Whitsunday\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio Víspera de San Juan\n" +
"24 de junio Día de San Juan\n" +
"9-Jul Festival de Canto y Danza Juvenil\n" +
"9 de septiembre Día del padre\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Visita del Papa Francisco\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"18-Nov Día de la Proclamación de la República de Letonia\n" +
"19-Nov día de la proclamación de la República de Letonia observado\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Liechtenstein":
                        case "liechtenstein":
                            return("LIECHTENSTEIN\n" +
"1 de enero día de año nuevo\n" +
"2-Jan Berchtold Day\n" +
"6 de enero Epifanía\n" +
"Vela de 2 de febrero\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"19 de marzo, día de San José\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"15 de agosto, día nacional de Liechtenstein\n" +
"8 de septiembre Natividad de Nuestra Señora\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Lituania":
                        case "lituania":
                            return("LITUANIA\n" +
"1 de enero día de año nuevo\n" +
"13 de febrero Carnaval\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero Día de la Independencia / Día Nacional\n" +
"11 de marzo Día de la Restauración de la Independencia\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"6 de mayo, día de la madre\n" +
"3 de junio, día de los padres\n" +
"21 de junio Solsticio de junio\n" +
"24 de junio Día de San Juan / Día del rocío\n" +
"6 de julio Día de la Coronación del Rey Mindaugas\n" +
"15-Ago Fiesta de la Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Luxemburgo":
                        case "luxemburgo":
                            return("LUXEMBURGO\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio Día Nacional\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Macedonia":
                        case "macedonia":
                            return("MACEDONIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Nochebuena (ortodoxa)\n" +
"7 de enero día ortodoxo de Navidad\n" +
"19 de enero Epifanía (ortodoxa)\n" +
"27 de enero día de San Sava\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo Día de la Madre / Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado de Pascua\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"6-abr Viernes Santo (ortodoxo)\n" +
"7 de abril Sábado de Pascua (ortodoxo)\n" +
"8 de abril Domingo de Pascua (ortodoxo)\n" +
"8-Abr Día Internacional del Romaní (para la comunidad romaní)\n" +
"9 de abril lunes de Pascua (ortodoxo)\n" +
"1 de mayo del Día del Trabajo\n" +
"23 de mayo Día nacional de Vlach (para la comunidad de Vlach)\n" +
"24 de mayo Santos Día de San Cirilo y San Metodio\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"2 de agosto Día de la República\n" +
"22-Ago Eid al-Adha (Fiesta del Sacrificio)\n" +
"28-Ago Fiesta de la Asunción de María (Ortodoxa)\n" +
"8 de septiembre día de la independencia\n" +
"9 de septiembre Día del padre\n" +
"19-septiembre Primer día de Yom Kippur (comunidad judía)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Sep Día internacional de los bosnios (para la comunidad bosnia)\n" +
"11-Oct Día de la sublevación popular\n" +
"23-Oct Día de la Lucha Revolucionaria de Macedonia\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"22-Nov. Día del alfabeto albanés (comunidad albanesa)\n" +
"8 de diciembre Día de San Kliment Ohridski\n" +
"21 de diciembre Solsticio de diciembre\n" +
"21-dic Día de la lengua turca (comunidad turca)\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Malta":
                        case "malta":
                            return("MALTA\n" +
"1 de enero día de año nuevo\n" +
"10-Feb Fiesta del naufragio de San Pablo\n" +
"19 de marzo Fiesta de San José\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Día de la Libertad\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua (día festivo)\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"7 de junio Sette Giugno\n" +
"29 de junio Fiesta de los Santos Pedro y Pablo\n" +
"15-ago La fiesta de la asunción de María\n" +
"8-Sep La fiesta de Nuestra Señora de las Victorias\n" +
"21 de septiembre día de la independencia\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"13 de diciembre Día de la República\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo (día festivo)\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Moldavia":
                        case "moldavia":
                            return("MOLDAVIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero día de año nuevo (día 2)\n" +
"7 de enero día ortodoxo de Navidad\n" +
"8 de enero día festivo ortodoxo\n" +
"14 de febrero Día de San Valentín\n" +
"1-Mar Martisor (primer día de primavera)\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Domingo de Pascua ortodoxo\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"16 de abril Día de los Caídos / Día de los Padres\n" +
"27-Apr Día de la bandera del estado\n" +
"1 de mayo Día Internacional de Solidaridad de los Trabajadores\n" +
"9 de mayo Día de la Victoria\n" +
"15 de mayo, día de Europa\n" +
"15 de mayo Día de la familia\n" +
"27 de mayo Dniester Day\n" +
"1 de junio Día Internacional del Niño\n" +
"5-Jun Día Mundial del Medio Ambiente\n" +
"21 de junio Solsticio de junio\n" +
"23-Jun Día de la Estadidad\n" +
"29 de julio Día de la Constitución\n" +
"27 de agosto día de la independencia\n" +
"28 de agosto Día de la Independencia de vacaciones\n" +
"Día de la lengua del 31 de agosto\n" +
"23 de septiembre de septiembre equinoccio\n" +
"6-Oct Wine Day (Día 1)\n" +
"7 de octubre día del vino (día 2)\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"10-Dec Día Internacional de los Derechos Humanos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Monaco":
                        case "monaco":
                            return("MONACO\n" +
"1 de enero día de año nuevo\n" +
"27 de enero Día de San Dévote\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"Día Nacional 19-Nov\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Montenegro":
                        case "montenegro":
                            return("MONTENEGRO\n" +
"1 de enero día de año nuevo\n" +
"2 de enero día de año nuevo (día 2)\n" +
"6 de enero Nochebuena (ortodoxa)\n" +
"7 de enero día de Navidad (ortodoxo)\n" +
"8 de enero, día de Navidad, día 2 (ortodoxo)\n" +
"20 de marzo, equinoccio\n" +
"6-abr Viernes Santo (ortodoxo)\n" +
"8 de abril Domingo de Pascua (ortodoxo)\n" +
"9 de abril lunes de Pascua (ortodoxo)\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"2 de mayo Día del Trabajo / Primero de Mayo (día 2)\n" +
"21 de mayo Día de la Independencia\n" +
"22 de mayo Día de la Independencia (día 2)\n" +
"21 de junio Solsticio de junio\n" +
"13-Jul Día de la Estadidad\n" +
"14-Jul. Día de la Estadidad (día 2)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Holanda":
                        case "holanda":
                            return("HOLANDA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"27-El cumpleaños del rey\n" +
"4 de mayo día de la memoria\n" +
"5 de mayo Día de la Liberación\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"23 de septiembre de septiembre equinoccio\n" +
"5 de diciembre Noche de San Nicolás / Sinterklaas\n" +
"6 de diciembre, día de San Nicolás\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Noruega":
                        case "noregua":
                            return("NORUEGA\n" +
"1 de enero día de año nuevo\n" +
"21 de enero Día de la Princesa Ingrid Alexandra\n" +
"6-feb El día del pueblo saami\n" +
"Carnaval de 11 de febrero\n" +
"11 de febrero Día de la Madre\n" +
"14 de febrero Día de San Valentín\n" +
"21 de febrero Día del rey Harald V.\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo día del trabajo\n" +
"8 de mayo Día de la liberación\n" +
"10 de mayo Día de la Ascensión\n" +
"17-mayo 17 de mayo Día de la Constitución (1814)\n" +
"19 de mayo, víspera de Pentecostés\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"7 de junio Disolución de unión con Suecia (1905)\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio Víspera de San Juan\n" +
"24 de junio, día de San Juan\n" +
"4 de julio Día de la reina Sonja\n" +
"20-Jul Día del Príncipe Heredero Haakon\n" +
"29 de julio Día de San Olaf\n" +
"19-ago Día de la princesa heredera Mette Marit\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-oct Día de las Naciones Unidas\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"11-Nov. Día del padre\n" +
"2-Dec Primer domingo de Adviento\n" +
"9 de diciembre Segundo Domingo de Adviento\n" +
"16 de diciembre Tercer domingo de Adviento\n" +
"21 de diciembre Solsticio de diciembre\n" +
"23-Dec Cuarto domingo de Adviento\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Polonia":
                        case "polonia":
                            return("POLONIA\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"14 de febrero Día de San Valentín\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"3 de mayo Día de la Constitución\n" +
"20 de mayo domingo de Pentecostés\n" +
"26 de mayo Día de la Madre\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"23 de junio Día del padre\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                            
                        case "Portugal":
                        case "portugal":
                            return("PORTUGAL\n" +
"1 de enero día de año nuevo\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"25 de abril Día de la Libertad\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"31 de mayo Corpus Christi\n" +
"10 de junio, día de Portugal\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"5-Oct Implantación de la República\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"1-Dic Restauración de la Independencia\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                       
                        case "Rumania":
                        case "rumania":
                            return("RUMANIA\n" +
"1 de enero día de año nuevo\n" +
"2-Jan día después del día de Año Nuevo\n" +
"24 de enero Día de la Unificación\n" +
"19-feb Constantin Brancusi Day\n" +
"24-Feb Dragobete\n" +
"1-Mar Mărţişor\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"6 de mayo, día de la madre\n" +
"13 de mayo Día del padre\n" +
"17 de mayo Día de la Ascensión ortodoxa\n" +
"27 de mayo Pentecostés ortodoxo\n" +
"28 de mayo Pentecostés ortodoxo lunes\n" +
"1 de junio Día del niño\n" +
"21 de junio Solsticio de junio\n" +
"Día de la bandera 26-jun\n" +
"29 de julio Día Nacional del Himno\n" +
"15 de agosto Día de Santa María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"31 de octubre de Halloween\n" +
"30 de noviembre, día de San Andrés\n" +
"1-Dic fiesta nacional\n" +
"8 de diciembre Día de la Constitución\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Segundo día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "San Marino":
                        case "san marino":
                            return("SAN MARINO\n" +
"1 de enero día de año nuevo\n" +
"6 de enero Epifanía\n" +
"5 de febrero Fiesta de Santa Águeda\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"25-Mar Aniversario del Arengo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1-abril Ceremonia de investidura de los capitanes regente 1\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"28-julio aniversario de la caída del gobierno fascista\n" +
"15-ago Asunción de María\n" +
"3-Sep La fiesta de San Marino y el Día de la República\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Ceremonia de investidura de los Capitanes Regent 2\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Todos los Santos\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                       
                        case "Serbia":
                        case "serbia":
                            return("SERBIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero Segundo día del día de Año Nuevo\n" +
"7 de enero el día de Navidad\n" +
"14 de enero Año Nuevo ortodoxo\n" +
"27 de enero Día de la Espiritualidad / Día de San Sava\n" +
"15-Feb Día de la Estadidad de la República de Serbia\n" +
"16-Feb Día de la Estadidad de la República de Serbia (Día 2)\n" +
"20 de marzo, equinoccio\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"22 de abril Día de la Memoria del Holocausto\n" +
"1 de mayo vacaciones laborales\n" +
"2 de mayo vacaciones laborales segundo día\n" +
"9 de mayo Día de la Victoria\n" +
"21 de junio Solsticio de junio\n" +
"28 de junio, día de San Vito\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Oct Día de la Conmemoración de las Víctimas de la Segunda Guerra Mundial\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Eslovaquia":
                        case "eslovaquia":
                            return("ESLOVAQUIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero Segundo día del día de Año Nuevo\n" +
"7 de enero el día de Navidad\n" +
"14 de enero Año Nuevo ortodoxo\n" +
"27 de enero Día de la Espiritualidad / Día de San Sava\n" +
"15-Feb Día de la Estadidad de la República de Serbia\n" +
"16-Feb Día de la Estadidad de la República de Serbia (Día 2)\n" +
"20 de marzo, equinoccio\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Día ortodoxo de Pascua\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"22 de abril Día de la Memoria del Holocausto\n" +
"1 de mayo vacaciones laborales\n" +
"2 de mayo vacaciones laborales segundo día\n" +
"9 de mayo Día de la Victoria\n" +
"21 de junio Solsticio de junio\n" +
"28 de junio, día de San Vito\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Oct Día de la Conmemoración de las Víctimas de la Segunda Guerra Mundial\n" +
"11-Nov Día del armisticio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Eslovenia":
                        case "eslovenia":
                            return("ESLOVENIA\n" +
"1 de enero día de año nuevo\n" +
"2 de enero de año nuevo\n" +
"8 de febrero Prešeren Day\n" +
"20 de marzo, equinoccio\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril Día de la sublevación contra la ocupación\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"2 de mayo día festivo de vacaciones\n" +
"20 de mayo domingo de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"Día de la Estadidad de 25 de junio\n" +
"15-ago Asunción de María\n" +
"17-ago eslovenos en Prekmurje incorporados en el Día de la Madre Patria\n" +
"15-Sep Restauración de Primorska al Día de la Patria\n" +
"23 de septiembre de septiembre equinoccio\n" +
"25 de octubre día de la soberanía\n" +
"31-Oct. Día de la Reforma\n" +
"1-Nov día de la conmemoración\n" +
"23-Nov Rudolf Maister Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26-Dic Día de la Independencia y la Unidad");
                        
                        case "España":
                        case "españa":
                            return("ESPAÑA\n" +
"1 de enero día de año nuevo\n" +
"1-Jan Fiesta de la Sagrada Familia\n" +
"6 de enero Epifanía\n" +
"29 de enero Fiesta de San Valero\n" +
"14 de febrero Miércoles de ceniza\n" +
"28 de febrero Día de Andalucía\n" +
"1-Mar Día de las Islas Baleares\n" +
"5 de marzo, 5 de marzo\n" +
"19 de marzo San José\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"25 de marzo Domingo de Ramos\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"23 de abril Día de Aragón\n" +
"23 de abril, día de San Jorge\n" +
"23 de abril Día de Castilla y León\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"2 de mayo Día de Madrid\n" +
"6 de mayo, día de la madre\n" +
"15 de mayo Fiesta de San Isidoro\n" +
"17-Mayo Día de la Literatura de Galicia\n" +
"20 de mayo Domingo de Pentecostés\n" +
"21 de mayo, lunes de Pentecostés\n" +
"30 de mayo Día de las Islas Canarias\n" +
"31 de mayo Corpus Christi\n" +
"31 de mayo Día canario observado\n" +
"31 de mayo Día de Castilla-La Mancha\n" +
"9-Jun Día de Murcia\n" +
"Día 9-Jun de La Rioja\n" +
"13 de junio San Antonio\n" +
"21 de junio Solsticio de junio\n" +
"24 de junio Día de San Juan Bautista\n" +
"25-Jul Fiesta de Santiago Apóstol\n" +
"28 de julio Día de las Instituciones\n" +
"5-ago El día de Nuestra Señora de África\n" +
"12-ago El día de Cantabria\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"2-Sep Día de la Ciudad Independiente de Ceuta\n" +
"8 de septiembre Día de Asturias\n" +
"8 de septiembre Día de Extremadura\n" +
"8-Sep Virgen de la Victoria\n" +
"Día 11 de septiembre de Cataluña\n" +
"15-Sep Nuestra Señora de la Bien Aparecida\n" +
"17 de septiembre Día de Melilla\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día 9-Oct de la Comunidad Valenciana\n" +
"12-Oct día hispano\n" +
"28-Oct El horario de verano termina\n" +
"1-Nov Todos los Santos\n" +
"3 de diciembre Día de Navarra\n" +
"6 de diciembre Día de la Constitución\n" +
"8-Dic Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Suecia":
                        case "suecia":
                            return("SUECIA\n" +
"1 de enero día de año nuevo\n" +
"5 de enero a la duodécima noche\n" +
"6 de enero Epifanía\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"30 de abril noche de Walpurgis\n" +
"1 de mayo 1 de mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"19 de mayo, víspera de Pentecostés\n" +
"20 de mayo domingo de Pentecostés\n" +
"27 de mayo Día de la Madre\n" +
"Día Nacional 6-Jun\n" +
"21 de junio Solsticio de junio\n" +
"22 de junio Víspera de San Juan\n" +
"23 de junio Día de San Juan\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"2-Nov Todos los Santos\n" +
"3-Nov Todos los Santos\n" +
"11-Nov. Día del padre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Suiza":
                        case "suiza":
                            return("SUIZA\n" +
"1 de enero día de año nuevo\n" +
"2-Jan Berchtold Day\n" +
"6 de enero Epifanía\n" +
"19 de marzo Día de San José\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"16 de abril Sechseläuten\n" +
"1 de mayo, día de mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo Pentecostés\n" +
"21 de mayo lunes de Pentecostés\n" +
"31 de mayo Corpus Christi\n" +
"21 de junio Solsticio de junio\n" +
"29-jun San Pedro y San Pablo\n" +
"1-Ago Día Nacional de Suiza\n" +
"15-ago Asunción de María\n" +
"6 de septiembre Jeune Genevois\n" +
"8 de septiembre Knabenschiessen\n" +
"9 de septiembre Knabenschiessen\n" +
"10 de septiembre Knabenschiessen\n" +
"16-Sep suizo federal rápido\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"8-Dic Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de San Esteban\n" +
"31 de diciembre víspera de año nuevo");
                       
                        case "Ucrania":
                        case "ucrania":
                            return("UCRANIA\n" +
"1-Jan	New Year's Day\n" +
"7-Jan	Orthodox Christmas Day\n" +
"8-Jan	Christmas holiday\n" +
"14-Jan	Orthodox New Year\n" +
"22-Jan	Ukrainian Unity Day\n" +
"25-Jan	Tatiana Day\n" +
"14-Feb	Valentine's Day\n" +
"3-Mar	Special Working Day\n" +
"8-Mar	International Women's Day\n" +
"9-Mar	International Women's Day holiday\n" +
"20-Mar	March Equinox\n" +
"25-Mar	Daylight Saving Time starts\n" +
"1-Apr	April Fools\n" +
"8-Apr	Orthodox Easter Day\n" +
"9-Apr	Orthodox Easter Day holiday\n" +
"30-Apr	Labor Day Holiday\n" +
"1-May	Labor Day\n" +
"5-May	Special Working Day\n" +
"9-May	Victory Day / Memorial Day\n" +
"13-May	Mother's Day\n" +
"19-May	Europe Day\n" +
"27-May	Orthodox Pentecost\n" +
"27-May	Cultural Workers and Folk Artists Day\n" +
"27-May	Kiev Day\n" +
"28-May	Orthodox Pentecost holiday\n" +
"21-Jun	June Solstice\n" +
"23-Jun	Special Working Day\n" +
"28-Jun	Constitution Day\n" +
"29-Jun	Constitution Day Holiday\n" +
"7-Jul	Kupala Night\n" +
"8-Jul	Family Day\n" +
"28-Jul	Baptism of Kyivan Rus\n" +
"29-Jul	Navy Day\n" +
"24-Aug	Independence Day\n" +
"23-Sep	September Equinox\n" +
"7-Oct	Teacher's Day\n" +
"14-Oct	Defenders' Day\n" +
"15-Oct	Defenders' Day observed\n" +
"28-Oct	Daylight Saving Time ends\n" +
"21-Nov	Dignity and Freedom Day\n" +
"6-Dec	Army Day\n" +
"19-Dec	St. Nicholas Day\n" +
"21-Dec	December Solstice\n" +
"22-Dec	Special Working Day\n" +
"24-Dec	Catholic Christmas holiday\n" +
"25-Dec	Catholic Christmas Day\n" +
"29-Dec	Special Working Day\n" +
"31-Dec	New Year's Day holiday\n");
                        
                        case "Reino Unido":
                        case "reino unido":
                            return("REINO UNIDO\n" +
"1 de enero día de año nuevo\n" +
"2-ene 2 de enero\n" +
"6 de enero Epifanía\n" +
"7 de enero día ortodoxo de Navidad\n" +
"14 de enero Año Nuevo ortodoxo\n" +
"25 de enero Burns Night\n" +
"31 de enero Tu B'Shevat (Día del árbol)\n" +
"13 de febrero Maha Shivaratri\n" +
"13 de febrero carnaval / martes de carnaval\n" +
"14 de febrero Carnaval / Miércoles de ceniza\n" +
"14 de febrero Día de San Valentín\n" +
"16 de febrero, año nuevo chino\n" +
"1-Mar Purim\n" +
"1-Mar Día de San David\n" +
"2-Mar Holi\n" +
"Domingo maternal de 11 de marzo\n" +
"17 de marzo Día de San Patricio\n" +
"19 de marzo Día de San Patricio observado\n" +
"20 de marzo, equinoccio\n" +
"25 de marzo Domingo de Ramos\n" +
"Comienza el horario de verano de 25 mar.\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"31 de marzo Primer día de Pascua\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"6-abr Ortodoxo Viernes Santo\n" +
"7-abr Último día de Pascua\n" +
"7-abr ortodoxo Sábado Santo\n" +
"8 de abril Semana Santa ortodoxa\n" +
"9-abr ortodoxo lunes de Pascua\n" +
"11 de abril Yom HaShoah\n" +
"13-Abr Isra y Mi'raj\n" +
"19 de abril Yom HaAtzmaut\n" +
"23 de abril, día de San Jorge\n" +
"23 de abril Día de Shakespeare\n" +
"3 de mayo Lag B'Omer\n" +
"7 de mayo a principios de mayo festivo\n" +
"10 de mayo Día de la Ascensión\n" +
"16 de mayo Inicio de Ramadán\n" +
"20 de mayo Pentecostés\n" +
"20 de mayo Shavuot\n" +
"21 de mayo, lunes de Pentecostés\n" +
"27 de mayo Domingo de la Trinidad\n" +
"28 de mayo de vacaciones en el banco de primavera\n" +
"31 de mayo Corpus Christi\n" +
"9 de junio Cumpleaños de la Reina\n" +
"10 de junio Laylatul Qadr (Noche de poder)\n" +
"15 de junio Eid ul Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"22 de junio Windrush Day\n" +
"12 de julio Batalla del Boyne\n" +
"22 de julio Tisha B'Av\n" +
"6-ago Summer Bank Holiday\n" +
"15-ago Asunción de María\n" +
"22-ago Eid ul Adha\n" +
"26-ago Raksha Bandhan\n" +
"27-ago Summer Bank Holiday\n" +
"2 de septiembre Janmashtami\n" +
"10-Sep Rosh Hashana\n" +
"12-Sep Ganesh Chaturthi\n" +
"12-Sep Muharram / Año Nuevo islámico\n" +
"19-Sep Iom Kipur\n" +
"21 de septiembre Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep Primer día de Sucot\n" +
"30-Sep Hoshana Rabbah\n" +
"1-Oct Shemini Atzeret\n" +
"2-Oct Simchat Torah\n" +
"4-Oct Fiesta de San Francisco de Asís\n" +
"9 de octubre Navaratri\n" +
"18 de octubre Dussehra\n" +
"28-Oct El horario de verano termina\n" +
"31 de octubre de Halloween\n" +
"1-Nov Todos los Santos\n" +
"2-Nov Día de las Ánimas\n" +
"5-Nov Guy Fawkes Day\n" +
"7-Nov Diwali / Deepavali\n" +
"Domingo conmemorativo del 11 de noviembre\n" +
"21 de noviembre Milad un Nabi (Mawlid)\n" +
"30 de noviembre, día de San Andrés\n" +
"2-Dic Primer domingo de Adviento\n" +
"3-dic Primer día de Hanukkah\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"10-Dic Último día de Hanukkah\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                        
                        // Africa
                        case "Argelia":
                        case "argelia":
                            return("ARGELIA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo, día de mayo\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"5 de julio Día de la Independencia\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha\n" +
"12-Sep Muharram\n" +
"20 de septiembre Día de Achura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov aniversario de la revolución\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                       
                        case "Angola":
                        case "angola":
                            return("ANGOLA\n" +
"1 de enero de año nuevo\n" +
"4-Feb Comienzo de la lucha armada por la liberación nacional\n" +
"13 de febrero Carnaval\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"4 de abril día de la paz\n" +
"1 de mayo, día de mayo\n" +
"21 de junio Solsticio de junio\n" +
"17-Sep Día Nacional del Héroe\n" +
"23 de septiembre de septiembre equinoccio\n" +
"2-Nov Día de las Ánimas\n" +
"11 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Benin":
                        case "benin":
                            return("BENIN\n" +
"1 de enero de año nuevo\n" +
"10-Jan Vodoun Festival\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"21 de mayo, lunes de Pentecostés\n" +
"15 de junio Korité\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1 de agosto Día de la Independencia\n" +
"22-ago Tabaski\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21 de noviembre Mawlid\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                       
                        case "Botswana":
                        case "botswana":
                            return("BOTSWANA\n" +
"1 de enero día de año nuevo\n" +
"2-Jan Fiestas Públicas (enero)\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul Sir Seretse Khama Day\n" +
"2 de julio Día de Sir Seretse Khama observado\n" +
"16 de julio Día del Presidente\n" +
"Feriado público de 17 de julio (julio)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"30 de septiembre Día de Botswana\n" +
"1-Oct Día de Botswana observado\n" +
"1-Oct feriado público (octubre)\n" +
"2-oct festivo público (octubre) observado\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        case "Burkina Faso":
                        case "burkina faso":
                            return("BURKINA FASO\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Burundi":
                        case "burundi":
                            return("BURUNDI\n" +
"1 de enero de año nuevo\n" +
"5-Feb Día de la Unidad\n" +
"20 de marzo, equinoccio\n" +
"6 de abril Presidente Ntaryamira Day\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio Día de la Independencia\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"13-Oct Día del Príncipe Louis Rwagasore\n" +
"21-oct Día del presidente Ndadaye\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Cabo Verde":
                        case "cabo verde":
                            return("CABO VERDE \n" +
"1 de enero de año nuevo\n" +
"13 de enero Día de la Democracia\n" +
"20 de Enero Día de los Héroes\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo del Día del Trabajo\n" +
"13 de mayo Día de la Madre\n" +
"1 de junio Día del niño\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"5 de julio Día de la Independencia\n" +
"15-ago Asunción de María\n" +
"Día Nacional 12-Sep\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "camerun":
                        case "Camerun":
                            return("CAMERUN\n" +
"1 de enero Día de la Independencia\n" +
"Día de la Juventud 11-Feb\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"20 de mayo día nacional\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"21-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Oct Independencia del sur de Camerún británico desde el Reino Unido\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Republica Centroafricana":
                        case "república centroafricana":
                            return("REPUBLICA CENTROAFRICANA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Conmemoración de Boganda\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"30 de junio Día Nacional del Pagador\n" +
"13 de agosto día de la independencia\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"1-Dec Día de la República\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Chad":
                        case "chad":
                            return("CHAD\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"8 de mayo: fin de la segunda guerra mundial\n" +
"13 de mayo Día de la Madre\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"11 de agosto Día de la Independencia\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"28 de noviembre Proclamación de la República\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Comoras":
                        case "comoras":
                            return("COMORAS\n" +
"1 de enero de año nuevo\n" +
"18-Mar Cumpleaños de Al-koutb Said Mouhammad Cheikh Al Maarouf\n" +
"20 de marzo, equinoccio\n" +
"13-Abr Isra y Mi'raj\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr\n" +
"17 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Congo":
                        case "congo":
                            return("CONGO\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"21 de mayo, lunes de Pentecostés\n" +
"10 de junio día de la reconciliación\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"15 de agosto Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad ");
                        
                        case "Republica Democratica del Congo":
                        case "republica democratica del congo":
                            return("REPUBLICA DEMOCRATICA DEL CONGO\n" +
"1 de enero día de año nuevo\n" +
"4 de enero Mártires del Día de la Independencia\n" +
"16 años de aniversario del asesinato del presidente Laurent Kabila\n" +
"17 años de aniversario del asesinato del primer ministro Patrice Emery Lumumba\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"20 de marzo Día Internacional de la Francofonía\n" +
"30 de abril día de la educación\n" +
"1 de mayo, día de mayo\n" +
"17 de mayo Día de la Liberación\n" +
"21 de junio Solsticio de junio\n" +
"21-Jun Music Festival\n" +
"30 de junio Día de la Independencia\n" +
"1 de agosto Día de los Padres\n" +
"23 de septiembre de septiembre equinoccio\n" +
"27-Sep Día Mundial del Turismo\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Costa de Marfil":
                        case "costa de marfil":
                            return("COSTA DE MARFIL\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"10 de junio Laila tou-Kadr\n" +
"Ayuda de 14-jun el-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"7 de agosto Día de la Independencia\n" +
"15-ago Asunción de María\n" +
"22-ago Ayuda El-Kebir\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"15-Nov Día Nacional de la Paz\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Djibouti":
                        case "djibouti":
                            return("DJIBOUTI\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"27 de junio Día de la Independencia\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha\n" +
"24 de agosto Eid al-Adha\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Egipto":
                        case "egipto":
                            return("EGIPTO\n" +
"1 de enero 1 de enero festivo\n" +
"7 de enero Día de Navidad copto\n" +
"25 de enero Día de la revolución 25 de enero\n" +
"20 de marzo, equinoccio\n" +
"6-abr Coptic Good Friday\n" +
"7-abr Coptic Holy Saturday\n" +
"8 de abril Coptic Easter Sunday\n" +
"9 de abril Festival de primavera\n" +
"25 de abril, día de la liberación de Sinaí\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid el Fitr\n" +
"16 de junio Eid el Fitr Día 2\n" +
"17 de junio Eid el Fitr Día 3\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul 30 de junio Revolution\n" +
"1 de julio, 1 día festivo\n" +
"23 de julio Día de la revolución 23 de julio\n" +
"15-ago Inundación del Nilo\n" +
"20 de agosto Día de Arafat\n" +
"21-ago Eid al-Adha\n" +
"22 de agosto Eid al-Adha Día 2\n" +
"23 de agosto Eid al-Adha Día 3\n" +
"24 de agosto Eid al-Adha Día 4\n" +
"11-Sep Muharram\n" +
"11-Sep Coptic Año Nuevo\n" +
"23 de septiembre de septiembre equinoccio\n" +
"6-Oct Día de las Fuerzas Armadas\n" +
"20 de noviembre, cumpleaños del Profeta Mahoma\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Guinea Ecuatorial":
                        case "guinea ecuatorial":
                            return("GUINEA ECUATORIAL\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Jueves Santo\n" +
"30 de marzo Viernes Santo\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"31 de mayo Corpus Christi\n" +
"5 de junio Día del Presidente\n" +
"21 de junio Solsticio de junio\n" +
"3 de agosto Día de la Libertad\n" +
"15 de agosto Día de la Constitución\n" +
"23 de septiembre de septiembre equinoccio\n" +
"12 de octubre día de la independencia\n" +
"8-Dic Fiesta de la Inmaculada Concepción\n" +
"10 de diciembre Día de los Derechos Humanos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Eritrea":
                        case "eritrea":
                            return("ERITREA\n" +
"1 de enero de año nuevo\n" +
"7 de enero día ortodoxo de Navidad\n" +
"8 de marzo Día de la mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo Día Internacional de los Trabajadores\n" +
"24 de mayo día de la independencia\n" +
"15 de junio Eid al-Fitr\n" +
"20 de junio Día de los Mártires\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"1 de septiembre Día de la Lucha Armada de Eritrea\n" +
"11-Sep Día de San Juan Bautista\n" +
"11-Sep Geez Año Nuevo\n" +
"23 de septiembre de septiembre equinoccio\n" +
"27 de septiembre Meskel\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "eSwatini":
                        case "eswatini":
                            return("eSWATINI\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"19 de abril Cumpleaños del rey Mswati III\n" +
"25 de abril día de la bandera nacional\n" +
"1 de mayo, día de mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de junio Solsticio de junio\n" +
"22-Jul Cumpleaños del difunto Rey Sobhuza\n" +
"3-Sep Umhlanga Reed Dance\n" +
"6-Sep Smhlolo Day (Día de la Independencia)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"28 de diciembre Incwala Day");
                        
                        case "Etiopia":
                        case "etiopia":
                            return("ETIOPIA\n" +
"7 de enero Etiopía día de Navidad\n" +
"19 de enero Epifanía\n" +
"2-Mar Adwa Victory Day\n" +
"20 de marzo, equinoccio\n" +
"6-abr Etíope Viernes Santo\n" +
"8 de abril Domingo de Pascua de Etiopía\n" +
"1 de mayo Día Internacional del Trabajo\n" +
"5 de mayo Día de la Libertad\n" +
"28 de mayo Derg Downfall Day\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"11-Sep etíope Año Nuevo\n" +
"23 de septiembre de septiembre equinoccio\n" +
"27 de septiembre Meskel\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Gabon":
                        case "gabon":
                            return("GABON\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"17 de abril Día de los Derechos de la Mujer\n" +
"1 de mayo del Día del Trabajo\n" +
"13 de mayo Día de la Madre\n" +
"21 de mayo, lunes de Pentecostés\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"16 de agosto día de la independencia\n" +
"17 de agosto Día de la Independencia\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Gambia":
                        case "gambia":
                            return("GAMBIA \n" +
"1 de enero de año nuevo\n" +
"18 de febrero día de la independencia\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"25 de mayo Día de África\n" +
"10 de junio Lailat al-Qadr\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"21 de septiembre Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Ghana":
                        case "ghana":
                            return("GHANA\n" +
"1 de enero día de año nuevo\n" +
"6 de marzo Día de la Independencia\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"13 de mayo Día de la Madre\n" +
"25 de mayo Día de la Unión Africana\n" +
"15 de junio Id ul Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"1-Jul Republic Day\n" +
"2 de julio Día de la República observado\n" +
"22-ago Eid al-Adha\n" +
"21 de septiembre Día del Fundador\n" +
"23 de septiembre de septiembre equinoccio\n" +
"7 de diciembre Día del agricultor\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Guinea":
                        case "guinea":
                            return("GUINEA\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"25 de mayo Día de África\n" +
"10 de junio Lailat al-Qadr\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"2-Oct Día de la Independencia\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Guinea-Bissau":
                        case "guinea-bissau":
                            return("GUINEA-BISSAU\n" +
"1 de enero de año nuevo\n" +
"20-Jan Heroes Day\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"3 de agosto Día de los Mártires\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de septiembre día de la independencia (día nacional)\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Kenia":
                        case "kenia":
                            return("KENIA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13 de mayo Día de la Madre\n" +
"1 de junio Día de Madaraka\n" +
"16 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Oct Moi Day\n" +
"20 de octubre Día de Mashujaa\n" +
"12 de diciembre Jamhuri Day\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Lesoto":
                        case "lesoto":
                            return("LESOTO\n" +
"1 de enero de año nuevo\n" +
"11-Mar Cumpleaños de Moshoeshoe\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"10 de mayo Día de la Ascensión\n" +
"25 de mayo Día de África\n" +
"21 de junio Solsticio de junio\n" +
"17-Jul Cumpleaños del Rey\n" +
"23 de septiembre de septiembre equinoccio\n" +
"4-Oct Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        case "Liberia":
                        case "liberia":
                            return("LIBERIA\n" +
"1 de enero de año nuevo\n" +
"7 de enero, día de los pioneros\n" +
"10 de febrero Acción de Gracias\n" +
"11-Feb Día de las Fuerzas Armadas\n" +
"14 de marzo día de la decoración\n" +
"15-Mar J. J. Roberts Cumpleaños\n" +
"20 de marzo, equinoccio\n" +
"20 de abril ayuno y día de oración\n" +
"14 de mayo Día de la unificación nacional\n" +
"21 de junio Solsticio de junio\n" +
"26 de julio Día de la Independencia\n" +
"Día de la bandera 24-Ago\n" +
"23 de septiembre de septiembre equinoccio\n" +
"29-Nov William Tubmans Cumpleaños\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Libia":
                        case "libia":
                            return("LIBIA\n" +
"17-Feb Día de la Revolución Libia\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo, día de mayo\n" +
"15 de junio Eid al-Fitr\n" +
"16 de junio Eid al-Fitr\n" +
"17 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"21-Ago Día de Arafah\n" +
"22-ago Eid al-Adha\n" +
"23 de agosto Eid al-Adha\n" +
"24 de agosto Eid al-Adha\n" +
"12-Sep Muharram\n" +
"16-Sep Día del mártir Omar Al-Mokhtar\n" +
"23 de septiembre de septiembre equinoccio\n" +
"23 de octubre día de la liberación\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre Día de la Independencia");
                        
                        case "Madagascar":
                        case "madagascar":
                            return("MADAGASCAR\n" +
"1 de enero de año nuevo\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"29 de marzo Día de los Mártires\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"26 de junio Día de la Independencia\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11 de diciembre Día de la República\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Malawi":
                        case "malawi":
                            return("MALAWI\n" +
"1 de enero de año nuevo\n" +
"15 de enero John Chilembwe Day\n" +
"3 de marzo, día de los mártires\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"14 de mayo Día de Kamuzu\n" +
"14 de junio Día de la Libertad\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"6 de julio Día de la Independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"8 de octubre, día de la madre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Mali":
                        case "mali":
                            return("MALI\n" +
"20 de marzo, equinoccio\n" +
"26 de marzo Día de los Mártires\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajador\n" +
"21 de mayo, lunes de Pentecostés\n" +
"25 de mayo Día de África\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid al-Adha\n" +
"22 de septiembre día de la independencia\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Mauritania":
                        case "mauritania":
                            return("MAURITANIA\n" +
"1 de enero día de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"25 de mayo Día de África\n" +
"15 de junio Eid ul Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Eid ul Adha\n" +
"12-Sep Muharram / Año Nuevo islámico\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de noviembre Milad un Nabi (Mawlid)\n" +
"28 de noviembre Día de la Independencia\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Mauricio":
                        case "mauricio":
                            return("MAURICIO \n" +
"1 de enero de año nuevo\n" +
"2-ene año nuevo (observado)\n" +
"31 de enero Thaipoosam Cavadee\n" +
"1-Feb Abolición de la esclavitud\n" +
"13 de febrero Maha Shivaratri\n" +
"16 de febrero, Festival de Primavera de China\n" +
"2-Mar Holi\n" +
"Día Nacional 12-Mar\n" +
"18 de marzo Ougadi\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo del Día del Trabajo\n" +
"13 de mayo Día de la Madre\n" +
"16 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"26-ago Raksha Bandhan\n" +
"2 de septiembre Janmashtami\n" +
"14-Sep Ganesh Chaturthi\n" +
"23 de septiembre de septiembre equinoccio\n" +
"9 de octubre Navaratri\n" +
"18 de octubre Dussehra\n" +
"2-Nov Llegada de trabajadores contratados\n" +
"7-Nov Divali\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Marruecos":
                        case "marruecos":
                            return("MARRUECOS\n" +
"1 de enero día de año nuevo\n" +
"11-enero aniversario del Manifiesto de la Independencia\n" +
"20 de marzo, equinoccio\n" +
"Comienza el horario de verano de 25 mar.\n" +
"1 de mayo Día del Trabajo / Primero de Mayo\n" +
"13-mayo finaliza el horario de verano\n" +
"15 de junio Eid al-Fitr\n" +
"16-jun Eid al-Fitr vacaciones\n" +
"El horario de verano de 17 de junio comienza\n" +
"21 de junio Solsticio de junio\n" +
"30 de julio Fiesta del trono\n" +
"14-agosto aniversario de la recuperación Oued Ed-Dahab\n" +
"20-agosto Aniversario de la Revolución del Rey y la Gente\n" +
"21 de agosto Día de la Juventud\n" +
"22-ago Eid al-Adha\n" +
"23-ago Eid al-Adha vacaciones\n" +
"12 de septiembre Hijra Año Nuevo\n" +
"23 de septiembre de septiembre equinoccio\n" +
"28-Oct El horario de verano termina\n" +
"6-Nov Aniversario de la Marcha Verde\n" +
"18 de noviembre Día de la Independencia\n" +
"21-Nov El cumpleaños del Profeta Muhammad\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Mozambique":
                        case "mozambique":
                            return("MOZAMBIQUE\n" +
"1 de enero de año nuevo\n" +
"3-Feb Día de los Héroes de Mozambique\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"7-Apr Día de la Mujer de Mozambique\n" +
"1 de mayo, día de mayo\n" +
"21 de junio Solsticio de junio\n" +
"Día de la Independencia del 25 de junio\n" +
"7 de septiembre día de la victoria\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día de las Fuerzas Armadas del 25 de septiembre\n" +
"4-Oct Día de la Paz y la Reconciliación\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Namibia":
                        case "namibia":
                            return("NAMIBIA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"21 de marzo Día de la Independencia\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"4 de mayo Día de Cassinga\n" +
"10 de mayo Día de la Ascensión\n" +
"25 de mayo Día de África\n" +
"21 de junio Solsticio de junio\n" +
"26 de agosto día de los héroes\n" +
"23 de septiembre de septiembre equinoccio\n" +
"10-Dec Día Internacional de los Derechos Humanos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre Día de la buena voluntad");
                        
                        case "Niger":
                        case "niger":
                            return("NIGER\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"24 de abril Día de la Concordia\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de junio Lailat al-Qadr\n" +
"15 de junio Eid al-Fitr\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"3-Ago Día de la Independencia de Nigeria\n" +
"22-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"18-Dic Día de la República Nigeriana\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Nigeria":
                        case "nigeria":
                            return("NIGERIA\n" +
"1 de enero día de año nuevo\n" +
"8 de marzo Día de la mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"31 de marzo Sábado Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo Día del Trabajador\n" +
"27 de mayo Día del niño\n" +
"29 de mayo Día de la Democracia\n" +
"12 de junio 12 de junio Conmemoración\n" +
"15 de junio Id el Fitr\n" +
"16 de junio Id el Fitr vacaciones adicionales\n" +
"21 de junio Solsticio de junio\n" +
"22-Ago Id el Kabir\n" +
"23-Ago Id el Kabir vacaciones adicionales\n" +
"12-Sep Al-Hijra (Año Nuevo islámico)\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día Nacional 1-Oct\n" +
"21-Nov Id el Maulud\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Reunion":
                        case "reunion":
                            return("REUNION\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"8 de mayo de la Segunda Guerra Mundial Victory Day\n" +
"10 de mayo Día de la Ascensión\n" +
"21 de mayo, lunes de Pentecostés\n" +
"21 de junio Solsticio de junio\n" +
"14 de julio, día de la Bastilla\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"11-Nov Día del armisticio\n" +
"20 de diciembre Abolición de la esclavitud\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Ruanda":
                        case "ruanda":
                            return("RUANDA\n" +
"1 de enero de año nuevo\n" +
"1-Feb Día Nacional de los Héroes\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"7-Apr Tutsi Genocide Memorial Day\n" +
"1 de mayo, día de mayo\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"1 de julio Día de la Independencia\n" +
"4 de julio Día de la Liberación\n" +
"15 de agosto Día de la Asunción\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        case "Santo Tome y Principe":
                        case "santo tome y principe":
                            return("SANTO TOME Y PRINCIPE \n" +
"1 de enero de año nuevo\n" +
"4 de enero Día del Rey Amador\n" +
"3-Feb Conmemoración de la masacre de Batepá\n" +
"20 de marzo, equinoccio\n" +
"1 de mayo del Día del Trabajo\n" +
"21 de junio Solsticio de junio\n" +
"12 de julio Día de la Independencia\n" +
"6 de septiembre Día de las Fuerzas Armadas\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Nacionalización de las Roças el 30 de septiembre\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Senegal":
                        case "senegal":
                            return("SENEGAL\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"4 de abril Día de la Independencia\n" +
"1 de mayo del Día del Trabajo\n" +
"10 de mayo Día de la Ascensión\n" +
"13 de mayo Día de la Madre\n" +
"21 de mayo, lunes de Pentecostés\n" +
"15 de junio Korité\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"15-ago Asunción de María\n" +
"22-ago Tabaski\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"21-nov Maouloud\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Seychelles":
                        case "seychelles":
                            return("SEYCHELLES\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo del Día del Trabajo\n" +
"Día de la Constitución del 18 de junio\n" +
"21 de junio Solsticio de junio\n" +
"29 de junio Día Nacional\n" +
"15-ago Asunción de María\n" +
"23 de septiembre de septiembre equinoccio\n" +
"1-Nov Todos los Santos\n" +
"8-Dic Inmaculada Concepción\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Sierra Leona":
                        case "sierra leona":
                            return("SIERRA LEONA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril Día de la Independencia\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"22-ago Tabaski\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        case "Somalia":
                        case "somalia":
                            return("SOMALIA\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"13-Abr Isra y Mi'raj\n" +
"1 de mayo, día de mayo\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"26 de junio Independencia de la Somalia británica\n" +
"1 de julio Día de la Independencia\n" +
"22-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"21 de septiembre Ashura\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Sudafrica":
                        case "sudafrica":
                            return("SUDAFRICA\n" +
"1 de enero de año nuevo\n" +
"Día del Acuerdo de Paz del 9 de enero\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo, día de mayo\n" +
"16 de mayo SPLA Day\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"2 de julio Día de la Madre\n" +
"9 de julio Día de la Independencia\n" +
"30 de julio Día de los Mártires\n" +
"22-ago Eid al-Adha\n" +
"27 de agosto Día del padre\n" +
"23 de septiembre de septiembre equinoccio\n" +
"11-Nov Día de los abuelos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"28 de diciembre Día de la República\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Sudan del Sur":
                        case "sudan del sur":
                            return("SUDAN DEL SUR\n" +
"1 de enero de año nuevo\n" +
"Día del Acuerdo de Paz del 9 de enero\n" +
"14 de febrero Día de San Valentín\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"1 de abril, día de Pascua\n" +
"1 de mayo, día de mayo\n" +
"16 de mayo SPLA Day\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"2 de julio Día de la Madre\n" +
"9 de julio Día de la Independencia\n" +
"30 de julio Día de los Mártires\n" +
"22-ago Eid al-Adha\n" +
"27 de agosto Día del padre\n" +
"23 de septiembre de septiembre equinoccio\n" +
"11-Nov Día de los abuelos\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"28 de diciembre Día de la República\n" +
"31 de diciembre víspera de año nuevo");
                        
                        case "Sudan":
                        case "sudan":
                            return("SUDAN\n" +
"1 de enero Día de la Independencia\n" +
"8 de enero Navidad copta\n" +
"20 de marzo, equinoccio\n" +
"8 de abril Coptic Easter\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"30 de junio día de la revolución\n" +
"22-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Tanzania":
                        case "tanzania":
                            return("TANZANIA\n" +
"1 de enero día de año nuevo\n" +
"12 de enero Día de la revolución de Zanzíbar\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril Domingo de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"7 de abril, día de Karume\n" +
"26 de abril Día de la Unión\n" +
"1 de mayo Día del Trabajador\n" +
"13 de mayo Día de la Madre\n" +
"15 de junio Eid el Fitri\n" +
"21 de junio Solsticio de junio\n" +
"7-Jul Saba Saba\n" +
"8 de agosto Día de los campesinos\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"14-oct Día de Mwalimu Nyerere\n" +
"21 de noviembre, cumpleaños del Profeta\n" +
"Día de la República 9-Dec\n" +
"21 de diciembre Solsticio de diciembre\n" +
"24 de diciembre víspera de Navidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        case "Togo":
                        case "togo":
                            return("TOGO\n" +
"1 de enero de año nuevo\n" +
"13 de enero Día de la Liberación\n" +
"20 de marzo, equinoccio\n" +
"2 de abril lunes de Pascua\n" +
"27 de abril Día de la Independencia\n" +
"1 de mayo del Día del Trabajo\n" +
"21 de mayo, lunes de Pentecostés\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"21 de junio Día de los Mártires\n" +
"15-ago Asunción de María\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24-Sep aniversario del ataque fallido contra Lomé\n" +
"1-Nov Todos los Santos\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Tunez":
                        case "tunez":
                            return("TUNEZ\n" +
"1 de enero de año nuevo\n" +
"14 de enero Revolución y Jornada de la Juventud\n" +
"20 de marzo, equinoccio\n" +
"20 de marzo día de la independencia\n" +
"9 de abril Día de los Mártires\n" +
"1 de mayo del Día del Trabajo\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"Día de la República 25-Jul\n" +
"13 de agosto Día de la mujer y la familia\n" +
"22-ago Eid al-Adha\n" +
"12-Sep Muharram\n" +
"23 de septiembre de septiembre equinoccio\n" +
"15 de octubre día de la evacuación\n" +
"21-Nov El cumpleaños del Profeta\n" +
"21 de diciembre Solsticio de diciembre");
                        
                        case "Uganda":
                        case "uganda":
                            return("UGANDA\n" +
"1 de enero de año nuevo\n" +
"26 de enero Día de la Liberación\n" +
"16 de febrero Recordación del arzobispo Janani Luwum\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"13 de mayo Día de la Madre\n" +
"3 de junio, día del mártir\n" +
"Día de los Héroes Nacionales del 9 de junio\n" +
"15 de junio Eid al-Fitr\n" +
"21 de junio Solsticio de junio\n" +
"21 de junio Día del padre\n" +
"22-ago Eid al-Adha\n" +
"23 de septiembre de septiembre equinoccio\n" +
"Día de la Independencia de 9-Oct\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        case "Zambia":
                        case "zambia":
                            return("ZAMBIA\n" +
"1 de enero de año nuevo\n" +
"8 de marzo Día Internacional de la Mujer\n" +
"Día de la Juventud 12-Mar\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"1 de mayo, día de mayo\n" +
"13 de mayo Día de la Madre\n" +
"25 de mayo Día de la Libertad en África\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"2-Jul Heroes Day\n" +
"3-Jul Día de la Unidad\n" +
"Día de los agricultores de 6 aug.\n" +
"23 de septiembre de septiembre equinoccio\n" +
"24 de octubre día de la independencia\n" +
"21 de diciembre Solsticio de diciembre\n" +
"25 de diciembre día de Navidad");
                        
                        case "Zimbabue":
                        case "zimbabue":
                            return("ZIMBABUE\n" +
"1 de enero de año nuevo\n" +
"20 de marzo, equinoccio\n" +
"30 de marzo Viernes Santo\n" +
"1 de abril, día de Pascua\n" +
"2 de abril lunes de Pascua\n" +
"18 de abril Día de la Independencia\n" +
"1 de mayo Día de los Trabajadores\n" +
"13 de mayo Día de la Madre\n" +
"25 de mayo Día de África\n" +
"17 de junio Día del padre\n" +
"21 de junio Solsticio de junio\n" +
"13 de agosto día de los héroes\n" +
"14 de agosto Día de las Fuerzas de Defensa\n" +
"23 de septiembre de septiembre equinoccio\n" +
"21 de diciembre Solsticio de diciembre\n" +
"22 de diciembre Día de la Unidad\n" +
"25 de diciembre día de Navidad\n" +
"26 de diciembre, día del boxeo");
                        
                        default:
                            return("Error! Favor escribir el pais de manera correcta");
                            
                    }
    }
}
